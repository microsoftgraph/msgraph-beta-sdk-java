package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Options available for enrollment flow customization */
public enum EnrollmentAvailabilityOptions implements ValuedEnum {
    /** Device enrollment flow is shown to the end user with guided enrollment prompts */
    AvailableWithPrompts("availableWithPrompts"),
    /** Device enrollment flow is available to the end user without guided enrollment prompts */
    AvailableWithoutPrompts("availableWithoutPrompts"),
    /** Device enrollment flow is unavailable to the enduser */
    Unavailable("unavailable");
    public final String value;
    EnrollmentAvailabilityOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EnrollmentAvailabilityOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "availableWithPrompts": return AvailableWithPrompts;
            case "availableWithoutPrompts": return AvailableWithoutPrompts;
            case "unavailable": return Unavailable;
            default: return null;
        }
    }
}
