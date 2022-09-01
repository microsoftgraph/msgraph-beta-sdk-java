package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AssignmentFilterPayloadType implements ValuedEnum {
    /** NotSet */
    NotSet("notSet"),
    /** EnrollmentRestrictions */
    EnrollmentRestrictions("enrollmentRestrictions");
    public final String value;
    AssignmentFilterPayloadType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AssignmentFilterPayloadType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSet": return NotSet;
            case "enrollmentRestrictions": return EnrollmentRestrictions;
            default: return null;
        }
    }
}
