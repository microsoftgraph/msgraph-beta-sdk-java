package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents type of the assignment filter.
 */
public enum DeviceAndAppManagementAssignmentFilterType implements ValuedEnum {
    /** Default value. Do not use. */
    None("none"),
    /** Indicates in-filter, rule matching will offer the payload to devices. */
    Include("include"),
    /** Indicates out-filter, rule matching will not offer the payload to devices. */
    Exclude("exclude");
    public final String value;
    DeviceAndAppManagementAssignmentFilterType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceAndAppManagementAssignmentFilterType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "include": return Include;
            case "exclude": return Exclude;
            default: return null;
        }
    }
}
