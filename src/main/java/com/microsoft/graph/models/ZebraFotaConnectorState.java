package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents various states for Zebra FOTA connector.
 */
public enum ZebraFotaConnectorState implements ValuedEnum {
    /** Default value when the connector has not been setup (the feature has not been used yet). */
    None("none"),
    /** Connected state indicates that Intune is linked to Zebra Update Services for the current tenant. */
    Connected("connected"),
    /** Disconnected state indicates that the account was connected in the past and later disconnected. */
    Disconnected("disconnected"),
    /** Unknown future enum value. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaConnectorState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ZebraFotaConnectorState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "connected": return Connected;
            case "disconnected": return Disconnected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
