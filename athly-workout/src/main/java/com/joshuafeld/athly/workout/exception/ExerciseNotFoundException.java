package com.joshuafeld.athly.workout.exception;

import com.joshuafeld.athly.common.exception.ProblemDetailBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponseException;

public class ExerciseNotFoundException extends ErrorResponseException {

    public ExerciseNotFoundException(final Long id) {
        super(
                HttpStatus.NOT_FOUND,
                new ProblemDetailBuilder(HttpStatus.NOT_FOUND)
                        .title("Exercise Not Found")
                        .detail("Exercise with id " + id + " not found")
                        .build(),
                null
        );
    }
}
