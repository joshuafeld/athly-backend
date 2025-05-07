package com.joshuafeld.athly.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public final class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String email;

    private String firstName;

    private String lastName;

    public long id() {
        return id;
    }

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
