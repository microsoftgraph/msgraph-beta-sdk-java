package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum VpnDeadPeerDetectionRate implements ValuedEnum {
    /** Medium */
    Medium("medium"),
    /** None */
    None("none"),
    /** Low */
    Low("low"),
    /** High */
    High("high");
    public final String value;
    VpnDeadPeerDetectionRate(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnDeadPeerDetectionRate forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "medium": return Medium;
            case "none": return None;
            case "low": return Low;
            case "high": return High;
            default: return null;
        }
    }
}
