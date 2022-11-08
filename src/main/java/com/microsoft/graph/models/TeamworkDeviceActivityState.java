package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum TeamworkDeviceActivityState implements ValuedEnum {
    Unknown("unknown"),
    Busy("busy"),
    Idle("idle"),
    Unavailable("unavailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkDeviceActivityState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkDeviceActivityState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "busy": return Busy;
            case "idle": return Idle;
            case "unavailable": return Unavailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
