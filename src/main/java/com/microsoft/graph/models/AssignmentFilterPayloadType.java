package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the payload type AssignmentFilter is being assigned to.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentFilterPayloadType implements ValuedEnum {
    /** NotSet */
    NotSet("notSet"),
    /** EnrollmentRestrictions */
    EnrollmentRestrictions("enrollmentRestrictions");
    public final String value;
    AssignmentFilterPayloadType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentFilterPayloadType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSet": return NotSet;
            case "enrollmentRestrictions": return EnrollmentRestrictions;
            default: return null;
        }
    }
}
