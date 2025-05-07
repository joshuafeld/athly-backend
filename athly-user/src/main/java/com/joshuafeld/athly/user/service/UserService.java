package com.joshuafeld.athly.user.service;

import com.joshuafeld.athly.common.dto.user.UserCreateDto;
import com.joshuafeld.athly.common.dto.user.UserResponseDto;
import com.joshuafeld.athly.common.dto.user.UserUpdateDto;
import com.joshuafeld.athly.user.model.User;
import com.joshuafeld.athly.user.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class UserService {

    private final UserRepository repository;

    public UserService(final UserRepository repository) {
        this.repository = repository;
    }

    public UserResponseDto create(final UserCreateDto dto) {
        User user = new User();
        user.username(dto.username());
        user.email(dto.email());
        user.firstName(dto.firstName());
        user.lastName(dto.lastName());
        return toDto(repository.save(user));
    }

    public List<UserResponseDto> getAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    public UserResponseDto get(final long id) {
        return repository.findById(id).map(this::toDto)
                .orElseThrow(EntityNotFoundException::new);
    }

    public UserResponseDto update(final long id, final UserUpdateDto dto) {
        User user = repository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
        if (dto.email() != null) {
            user.email(dto.email());
        }
        if (dto.firstName() != null) {
            user.firstName(dto.firstName());
        }
        if (dto.lastName() != null) {
            user.lastName(dto.lastName());
        }
        return toDto(repository.save(user));
    }

    public void delete(final long id) {
        repository.deleteById(id);
    }

    private UserResponseDto toDto(final User user) {
        return new UserResponseDto(
                user.id(),
                user.username(),
                user.email(),
                user.firstName(),
                user.lastName()
        );
    }
}
