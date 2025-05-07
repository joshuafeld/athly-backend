package com.joshuafeld.athly.user.controller;

import com.joshuafeld.athly.common.dto.user.UserCreateDto;
import com.joshuafeld.athly.common.dto.user.UserResponseDto;
import com.joshuafeld.athly.common.dto.user.UserUpdateDto;
import com.joshuafeld.athly.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<UserResponseDto> create(
            @RequestBody @Valid final UserCreateDto user
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.create(user));
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> read() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> read(@PathVariable final long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDto> update(
            @PathVariable final long id,
            @RequestBody @Valid final UserUpdateDto user
    ) {
        return ResponseEntity.ok(service.update(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
