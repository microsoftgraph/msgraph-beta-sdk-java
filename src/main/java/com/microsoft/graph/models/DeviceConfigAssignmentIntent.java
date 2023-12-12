package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The administrator intent for the assignment of the profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceConfigAssignmentIntent implements ValuedEnum {
    /** Ensure that the configuration profile is applied to the devices in the assignment. */
    Apply("apply"),
    /** Ensure that the configuration profile is removed from devices that have previously installed the configuration profile. */
    Remove("remove");
    public final String value;
    DeviceConfigAssignmentIntent(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceConfigAssignmentIntent forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "apply": return Apply;
            case "remove": return Remove;
            default: return null;
        }
    }
}
