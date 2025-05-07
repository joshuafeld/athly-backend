package com.joshuafeld.athly.user.controller;

import com.joshuafeld.athly.common.dto.user.UserCreateDto;
import com.joshuafeld.athly.common.dto.user.UserResponseDto;
import com.joshuafeld.athly.common.dto.user.UserUpdateDto;
import com.joshuafeld.athly.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public final class UserController {

    private final UserService service;

    public UserController(final UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserResponseDto create(@RequestBody @Valid final UserCreateDto dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<UserResponseDto> read() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public UserResponseDto read(@PathVariable final long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public UserResponseDto update(
            @PathVariable final long id,
            @RequestBody @Valid final UserUpdateDto user
    ) {
        return service.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable final long id) {
        service.delete(id);
    }
}
