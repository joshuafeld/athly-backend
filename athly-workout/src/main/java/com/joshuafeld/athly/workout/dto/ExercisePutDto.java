package com.joshuafeld.athly.workout.dto;

import com.joshuafeld.athly.workout.model.Equipment;
import com.joshuafeld.athly.workout.model.Muscle;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * A data transfer object for an exercise put request.
 */
public record ExercisePutDto(
        @NotBlank String name,
        @NotNull Equipment equipment,
        @NotNull Muscle muscle,
        Long creator
) { }
