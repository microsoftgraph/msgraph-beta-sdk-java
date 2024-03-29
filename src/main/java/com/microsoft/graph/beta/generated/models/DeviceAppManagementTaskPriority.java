package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device app management task priority.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceAppManagementTaskPriority implements ValuedEnum {
    /** No priority set. */
    None("none"),
    /** High priority. */
    High("high"),
    /** Low priority. */
    Low("low");
    public final String value;
    DeviceAppManagementTaskPriority(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceAppManagementTaskPriority forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "high": return High;
            case "low": return Low;
            default: return null;
        }
    }
}
