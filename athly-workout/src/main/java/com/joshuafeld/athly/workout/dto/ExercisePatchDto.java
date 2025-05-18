package com.joshuafeld.athly.workout.dto;

import com.joshuafeld.athly.workout.model.Equipment;
import com.joshuafeld.athly.workout.model.Muscle;

/**
 * A data transfer object for an exercise patch request.
 */
public record ExercisePatchDto(
        String name,
        Equipment equipment,
        Muscle muscle,
        Long creator
) { }
