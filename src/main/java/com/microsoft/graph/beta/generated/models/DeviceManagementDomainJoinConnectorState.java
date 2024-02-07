package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The ODJ request states.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementDomainJoinConnectorState implements ValuedEnum {
    /** Connector is actively pinging Intune. */
    Active("active"),
    /** There is no heart-beat from connector from last one hour. */
    Error("error"),
    /** There is no heart-beat from connector from last 5 days. */
    Inactive("inactive");
    public final String value;
    DeviceManagementDomainJoinConnectorState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementDomainJoinConnectorState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "error": return Error;
            case "inactive": return Inactive;
            default: return null;
        }
    }
}
