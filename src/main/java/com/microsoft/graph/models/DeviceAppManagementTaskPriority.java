package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceAppManagementTaskPriority forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "high": return High;
            case "low": return Low;
            default: return null;
        }
    }
}
