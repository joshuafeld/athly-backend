package com.joshuafeld.athly.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.joshuafeld.athly.common.validation.Alphanumeric;
import com.joshuafeld.athly.common.validation.Lowercase;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

/**
 * A data transfer object for a user post request.
 */
public final class UserPostDto {

    @Alphanumeric
    @Lowercase
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
     * @param username the value for the {@code username} component
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
     * @param email the value for the {@code email} component
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
     * @param firstName the value for the {@code firstName} component
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
     * @param lastName the value for the {@code lastName} component
     */
    public void lastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Indicates whether some other object is "equal to" this one. The objects
     * are equal if the other object is of the same class and if all the
     * components are equals. Reference components are compared with
     * {@link Objects#equals(Object, Object)}; primitive components are
     * compared with the {@code compare} method from their corresponding wrapper
     * classes.
     *
     * @param o the object with which to compare
     * @return {@code true} if this object is the same as the {@code o}
     *         argument; {@code false} otherwise.
     */
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserPostDto dto)) {
            return false;
        }
        return Objects.equals(username, dto.username)
                && Objects.equals(email, dto.email)
                && Objects.equals(firstName, dto.firstName)
                && Objects.equals(lastName, dto.lastName);
    }

    /**
     * Returns a hash code value for this object. The value is derived from the
     * hash code of each of the components.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(username, email, firstName, lastName);
    }

    /**
     * Returns a string representation of this class. The representation
     * contains the name of the class, followed by the name and value of each of
     * the components.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        return "UserPostDto["
                + "username=" + username
                + ", email=" + email
                + ", firstName=" + firstName
                + ", lastName=" + lastName
                + "]";
    }
}
