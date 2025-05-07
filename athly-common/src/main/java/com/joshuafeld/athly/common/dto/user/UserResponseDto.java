package com.joshuafeld.athly.common.dto.user;

public record UserResponseDto(
        long id,
        String username,
        String email,
        String firstName,
        String lastName
) { }
