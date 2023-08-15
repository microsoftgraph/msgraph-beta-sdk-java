package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Connector health state for connector status
 */
public enum ConnectorHealthState implements ValuedEnum {
    /** Indicates a healthy connector status and no action required. */
    Healthy("healthy"),
    /** Indicates that a connector needs attention. */
    Warning("warning"),
    /** Indicates that a connector needs immediate attention to retain functionality. */
    Unhealthy("unhealthy"),
    /** unknown */
    Unknown("unknown");
    public final String value;
    ConnectorHealthState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectorHealthState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "healthy": return Healthy;
            case "warning": return Warning;
            case "unhealthy": return Unhealthy;
            case "unknown": return Unknown;
            default: return null;
        }
    }
}
