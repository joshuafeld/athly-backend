package com.joshuafeld.athly.user.dto;

/**
 * A data transfer object for responses from the user service.
 */
public record UserDto(
        Long id,
        String username,
        String email,
        String firstName,
        String lastName
) { }
