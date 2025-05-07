package com.joshuafeld.athly.common.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public final class UserCreateDto {

    @NotBlank
    private String username;

    @Email
    @NotBlank
    private String email;

    private String firstName;

    private String lastName;

    public String username() {
        return username;
    }

    public void username(final String username) {
        this.username = username;
    }

    public String email() {
        return email;
    }

    public void email(final String email) {
        this.email = email;
    }

    public String firstName() {
        return firstName;
    }

    public void firstName(final String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void lastName(final String lastName) {
        this.lastName = lastName;
    }
}
