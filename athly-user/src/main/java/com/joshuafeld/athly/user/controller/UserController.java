package com.joshuafeld.athly.user.controller;

import com.joshuafeld.athly.common.dto.user.UserCreateDto;
import com.joshuafeld.athly.common.dto.user.UserDto;
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

/**
 * A user controller.
 */
@RestController
public final class UserController {

    private final UserService service;

    /**
     * Creates an instance of a {@code User} class.
     *
     * @param service the value for the {@code service} component
     */
    public UserController(final UserService service) {
        this.service = service;
    }

    /**
     * Creates a new user.
     *
     * @param dto the data for the user
     * @return the data of the user
     */
    @PostMapping
    public UserDto create(@RequestBody @Valid final UserCreateDto dto) {
        return service.create(dto);
    }

    /**
     * Returns the data of all users.
     *
     * @return a list of all users' data
     */
    @GetMapping
    public List<UserDto> read() {
        return service.getAll();
    }

    /**
     * Returns the data of the user with the given id.
     *
     * @param id the id of the user
     * @return the data of the user
     */
    @GetMapping("/{id}")
    public UserDto read(@PathVariable final long id) {
        return service.get(id);
    }

    /**
     * Updates the data of the user with the given id.
     *
     * @param id the id of the user
     * @param dto the data for the user
     * @return the data of the user
     */
    @PutMapping("/{id}")
    public UserDto update(@PathVariable final long id,
                          @RequestBody @Valid final UserUpdateDto dto) {
        return service.update(id, dto);
    }

    /**
     * Deletes the data of the user with the given id.
     *
     * @param id the id of the user
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable final long id) {
        service.delete(id);
    }
}
