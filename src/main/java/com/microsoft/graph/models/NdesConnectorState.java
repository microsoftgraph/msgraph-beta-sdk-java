package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** The current status of the Ndes Connector. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NdesConnectorState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "active": return Active;
            case "inactive": return Inactive;
            default: return null;
        }
    }
}
