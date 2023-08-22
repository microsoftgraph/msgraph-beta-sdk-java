package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * State of remote assistance for the account
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RemoteAssistanceState implements ValuedEnum {
    /** Remote assistance is disabled for the account. With this value, Quick Assist remote assistance sessions are not allowed for the account. */
    Disabled("disabled"),
    /** Remote assistance is enabled for the account. With this value, enterprise Quick Assist remote assistance features are provided. */
    Enabled("enabled");
    public final String value;
    RemoteAssistanceState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RemoteAssistanceState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
