package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum WindowsDeviceUsageType implements ValuedEnum {
    /** Single User Device Type */
    SingleUser("singleUser"),
    /** Shared Device Type */
    Shared("shared");
    public final String value;
    WindowsDeviceUsageType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDeviceUsageType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "singleUser": return SingleUser;
            case "shared": return Shared;
            default: return null;
        }
    }
}
