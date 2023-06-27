package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Status of ServiceNow Connection
 */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ServiceNowConnectionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
