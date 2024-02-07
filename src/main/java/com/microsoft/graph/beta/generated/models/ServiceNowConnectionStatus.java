package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Status of ServiceNow Connection
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceNowConnectionStatus implements ValuedEnum {
    /** Tenant has disabled the connection */
    Disabled("disabled"),
    /** Tenant has enabled the connection */
    Enabled("enabled"),
    /** Future authentication method to be added here. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceNowConnectionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceNowConnectionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
