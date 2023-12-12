package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The current status of the Ndes Connector.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NdesConnectorState implements ValuedEnum {
    /** State not available yet for this connector. */
    None("none"),
    /** Ndes connector has connected recently */
    Active("active"),
    /** No recent activity for the Ndes connector */
    Inactive("inactive");
    public final String value;
    NdesConnectorState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NdesConnectorState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "active": return Active;
            case "inactive": return Inactive;
            default: return null;
        }
    }
}
