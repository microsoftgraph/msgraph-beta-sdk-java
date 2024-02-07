package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The administrator intent for the assignment of the profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementResourceAccessProfileIntent implements ValuedEnum {
    /** Apply the profile. */
    Apply("apply"),
    /** Remove the profile from devices that have installed the profile. */
    Remove("remove");
    public final String value;
    DeviceManagementResourceAccessProfileIntent(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementResourceAccessProfileIntent forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "apply": return Apply;
            case "remove": return Remove;
            default: return null;
        }
    }
}
