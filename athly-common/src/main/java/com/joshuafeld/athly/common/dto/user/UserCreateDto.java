package com.joshuafeld.athly.common.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * A data transfer object for creating a user.
 */
public final class UserCreateDto {

    @NotBlank
    @JsonProperty
    private String username;

    @Email
    @NotBlank
    @JsonProperty
    private String email;

    @JsonProperty
    private String firstName;

    @JsonProperty
    private String lastName;

    /**
     * Returns the value of the {@code username} component.
     *
     * @return the value of the {@code username} component
     */
    public String username() {
        return username;
    }

    /**
     * Sets the value of the {@code username} component.
     *
     * @param username the value for the {@code username} component.
     */
    public void username(final String username) {
        this.username = username;
    }

    /**
     * Returns the value of the {@code email} component.
     *
     * @return the value of the {@code email} component
     */
    public String email() {
        return email;
    }

    /**
     * Sets the value of the {@code email} component.
     *
     * @param email the value for the {@code email} component.
     */
    public void email(final String email) {
        this.email = email;
    }

    /**
     * Returns the value of the {@code firstName} component.
     *
     * @return the value of the {@code firstName} component
     */
    public String firstName() {
        return firstName;
    }

    /**
     * Sets the value of the {@code firstName} component.
     *
     * @param firstName the value for the {@code firstName} component.
     */
    public void firstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the value of the {@code lastName} component.
     *
     * @return the value of the {@code lastName} component
     */
    public String lastName() {
        return lastName;
    }

    /**
     * Sets the value of the {@code lastName} component.
     *
     * @param lastName the value for the {@code lastName} component.
     */
    public void lastName(final String lastName) {
        this.lastName = lastName;
    }
}
