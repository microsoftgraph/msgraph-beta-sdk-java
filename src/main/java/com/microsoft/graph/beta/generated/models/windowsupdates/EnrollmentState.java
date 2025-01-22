package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnrollmentState implements ValuedEnum {
    NotEnrolled("notEnrolled"),
    Enrolled("enrolled"),
    EnrolledWithPolicy("enrolledWithPolicy"),
    Enrolling("enrolling"),
    Unenrolling("unenrolling"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnrollmentState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnrollmentState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notEnrolled": return NotEnrolled;
            case "enrolled": return Enrolled;
            case "enrolledWithPolicy": return EnrolledWithPolicy;
            case "enrolling": return Enrolling;
            case "unenrolling": return Unenrolling;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
