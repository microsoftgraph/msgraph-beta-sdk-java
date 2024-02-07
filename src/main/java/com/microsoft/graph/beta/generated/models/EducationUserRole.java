package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EducationUserRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
