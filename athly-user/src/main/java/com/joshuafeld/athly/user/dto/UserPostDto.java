package com.joshuafeld.athly.user.dto;

import com.joshuafeld.athly.common.validation.Alphanumeric;
import com.joshuafeld.athly.common.validation.Lowercase;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * A data transfer object for a user post request.
 */
public record UserPostDto(
        @Alphanumeric @Lowercase @NotBlank String username,
        @Email @NotBlank String email,
        String firstName,
        String lastName
) { }
