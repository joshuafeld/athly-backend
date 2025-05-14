package com.joshuafeld.athly.common.dto.workout;

import com.joshuafeld.athly.common.model.workout.Equipment;
import com.joshuafeld.athly.common.model.workout.Muscle;

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
