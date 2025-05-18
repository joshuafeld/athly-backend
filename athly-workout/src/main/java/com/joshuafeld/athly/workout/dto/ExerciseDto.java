package com.joshuafeld.athly.workout.dto;

import com.joshuafeld.athly.workout.model.Equipment;
import com.joshuafeld.athly.workout.model.Muscle;

/**
 * A data transfer object for responses from the exercise service.
 */
public record ExerciseDto(
        Long id,
        String name,
        Equipment equipment,
        Muscle muscle,
        Long creator
) { }
