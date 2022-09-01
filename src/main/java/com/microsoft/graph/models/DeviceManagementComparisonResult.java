package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the compare method. */
public enum DeviceManagementComparisonResult implements ValuedEnum {
    /** Unknown setting comparison */
    Unknown("unknown"),
    /** The setting values are equal */
    Equal("equal"),
    /** The setting values are not equal */
    NotEqual("notEqual"),
    /** The setting is added */
    Added("added"),
    /** The setting is removed */
    Removed("removed");
    public final String value;
    DeviceManagementComparisonResult(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementComparisonResult forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "equal": return Equal;
            case "notEqual": return NotEqual;
            case "added": return Added;
            case "removed": return Removed;
            default: return null;
        }
    }
}
