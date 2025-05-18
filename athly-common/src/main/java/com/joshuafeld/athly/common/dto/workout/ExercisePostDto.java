package com.joshuafeld.athly.common.dto.workout;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.joshuafeld.athly.common.model.workout.Equipment;
import com.joshuafeld.athly.common.model.workout.Muscle;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * A data transfer object for an exercise post request.
 */
public final class ExercisePostDto {

    @NotBlank
    @JsonProperty
    private String name;

    @NotNull
    @JsonProperty
    private Equipment equipment;

    @NotNull
    @JsonProperty
    private Muscle muscle;

    @JsonProperty
    private Long creator;

    /**
     * Returns the value of the {@code name} component.
     *
     * @return the value of the {@code name} component
     */
    public String name() {
        return name;
    }

    /**
     * Sets the value of the {@code name} component.
     *
     * @param name the value for the {@code name} component
     */
    public void name(final String name) {
        this.name = name;
    }

    /**
     * Returns the value of the {@code equipment} component.
     *
     * @return the value of the {@code equipment} component
     */
    public Equipment equipment() {
        return equipment;
    }

    /**
     * Sets the value of the {@code equipment} component.
     *
     * @param equipment the value for the {@code equipment} component
     */
    public void equipment(final Equipment equipment) {
        this.equipment = equipment;
    }

    /**
     * Returns the value of the {@code muscle} component.
     *
     * @return the value of the {@code muscle} component
     */
    public Muscle muscle() {
        return muscle;
    }

    /**
     * Sets the value of the {@code muscle} component.
     *
     * @param muscle the value for the {@code muscle} component
     */
    public void muscle(final Muscle muscle) {
        this.muscle = muscle;
    }

    /**
     * Returns the value of the {@code creator} component.
     *
     * @return the value of the {@code creator} component
     */
    public Long creator() {
        return creator;
    }

    /**
     * Sets the value of the {@code creator} component.
     *
     * @param creator the value for the {@code creator} component
     */
    public void creator(final Long creator) {
        this.creator = creator;
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
        if (!(o instanceof ExercisePostDto dto)) {
            return false;
        }
        return Objects.equals(name, dto.name)
                && Objects.equals(equipment, dto.equipment)
                && Objects.equals(muscle, dto.muscle)
                && Objects.equals(creator, dto.creator);
    }

    /**
     * Returns a hash code value for this object. The value is derived from the
     * hash code of each of the components.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, equipment, muscle, creator);
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
        return "ExercisePostDto["
                + "name=" + name
                + ", equipment=" + equipment
                + ", muscle=" + muscle
                + ", creator=" + creator
                + "]";
    }
}
