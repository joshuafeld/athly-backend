package com.joshuafeld.athly.common.dto.user;

/**
 * A data transfer object for responses from the user service.
 */
public record UserDto(
        long id,
        String username,
        String email,
        String firstName,
        String lastName
) { }
