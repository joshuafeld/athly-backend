package com.joshuafeld.athly.workout.repository;

import com.joshuafeld.athly.workout.exception.ExerciseNotFoundException;
import com.joshuafeld.athly.workout.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * An exercise repository.
 */
@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    /**
     * Retrieves an exercise by its id.
     *
     * @param id must not be {@code null}
     * @return the exercise with the given {@code id}
     * @throws IllegalArgumentException if {@code id} is {@code null}
     * @throws ExerciseNotFoundException if the exercise with the given
     *                                   {@code id} does not exist
     */
    default Exercise requireById(final Long id) {
        return findById(id).orElseThrow(() -> new ExerciseNotFoundException(id));
    }
}
