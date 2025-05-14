package com.joshuafeld.athly.workout.repository;

import com.joshuafeld.athly.workout.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * An exercise repository.
 */
@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> { }
