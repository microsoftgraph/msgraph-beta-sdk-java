package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum EducationUserRole implements ValuedEnum {
    Student("student"),
    Teacher("teacher"),
    None("none"),
    UnknownFutureValue("unknownFutureValue"),
    Faculty("faculty");
    public final String value;
    EducationUserRole(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationUserRole forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "student": return Student;
            case "teacher": return Teacher;
            case "none": return None;
            case "unknownFutureValue": return UnknownFutureValue;
            case "faculty": return Faculty;
            default: return null;
        }
    }
}
