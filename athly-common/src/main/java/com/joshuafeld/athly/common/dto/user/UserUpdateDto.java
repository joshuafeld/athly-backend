package com.joshuafeld.athly.common.dto.user;

import jakarta.validation.constraints.Email;

public final class UserUpdateDto {

    @Email
    private String email;

    private String firstName;
    private String lastName;

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
