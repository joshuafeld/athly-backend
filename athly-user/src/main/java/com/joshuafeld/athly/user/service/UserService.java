package com.joshuafeld.athly.user.service;

import com.joshuafeld.athly.common.dto.user.UserCreateDto;
import com.joshuafeld.athly.common.dto.user.UserDto;
import com.joshuafeld.athly.common.dto.user.UserUpdateDto;
import com.joshuafeld.athly.user.model.User;
import com.joshuafeld.athly.user.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * A user service.
 */
@Service
public final class UserService {

    private final UserRepository repository;

    /**
     * Creates an instance of a {@code UserService} class.
     *
     * @param repository the value for the {@code repository} component
     */
    public UserService(final UserRepository repository) {
        this.repository = repository;
    }

    /**
     * Creates a new user.
     *
     * @param dto the data for the user
     * @return the data of the user
     */
    public UserDto create(final UserCreateDto dto) {
        return toDto(repository.save(new User(dto.username(), dto.email(),
                dto.firstName(), dto.lastName())));
    }

    /**
     * Returns the data of all users.
     *
     * @return a list of all users' data
     */
    public List<UserDto> getAll() {
        return repository.findAll().stream().map(this::toDto).toList();
    }

    /**
     * Returns the data of the user with the given id.
     *
     * @param id the id of the user
     * @return the data of the user
     */
    public UserDto get(final Long id) {
        return repository.findById(id).map(this::toDto)
                .orElseThrow(EntityNotFoundException::new);
    }

    /**
     * Updates the data of the user with the given id.
     *
     * @param id the id of the user
     * @param dto the data for the user
     * @return the data of the user
     */
    public UserDto update(final Long id, final UserUpdateDto dto) {
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

    /**
     * Deletes the data of the user with the given id.
     *
     * @param id the id of the user
     */
    public void delete(final Long id) {
        repository.deleteById(id);
    }

    private UserDto toDto(final User user) {
        return new UserDto(
                user.id(),
                user.username(),
                user.email(),
                user.firstName(),
                user.lastName()
        );
    }
}
