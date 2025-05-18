package com.joshuafeld.athly.user.dto;

import com.joshuafeld.athly.common.validation.Alphanumeric;
import com.joshuafeld.athly.common.validation.Lowercase;
import jakarta.validation.constraints.Email;

/**
 * A data transfer object for a user patch request.
 */
public record UserPatchDto(
        @Alphanumeric @Lowercase String username,
        @Email String email,
        String firstName,
        String lastName
) { }
