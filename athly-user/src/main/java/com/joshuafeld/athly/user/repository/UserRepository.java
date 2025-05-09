package com.joshuafeld.athly.user.repository;

import com.joshuafeld.athly.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A user repository.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> { }
