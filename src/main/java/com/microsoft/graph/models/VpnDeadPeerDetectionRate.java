package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Determines how often to check if a peer connection is still alive
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnDeadPeerDetectionRate forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
