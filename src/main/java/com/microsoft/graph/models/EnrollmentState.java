package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EnrollmentState implements ValuedEnum {
    /** Device enrollment state is unknown */
    Unknown("unknown"),
    /** Device is Enrolled. */
    Enrolled("enrolled"),
    /** Enrolled but it's enrolled via enrollment profile and the enrolled profile is different from the assigned profile. */
    PendingReset("pendingReset"),
    /** Not enrolled and there is enrollment failure record. */
    Failed("failed"),
    /** Device is imported but not enrolled. */
    NotContacted("notContacted"),
    /** Device is enrolled as userless, but is blocked from moving to user enrollment because the app failed to install. */
    Blocked("blocked");
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
            case "unknown": return Unknown;
            case "enrolled": return Enrolled;
            case "pendingReset": return PendingReset;
            case "failed": return Failed;
            case "notContacted": return NotContacted;
            case "blocked": return Blocked;
            default: return null;
        }
    }
}
