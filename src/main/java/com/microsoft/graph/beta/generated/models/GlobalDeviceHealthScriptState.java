package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates whether global device health scripts are enabled and are in which state
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GlobalDeviceHealthScriptState implements ValuedEnum {
    /** Global device health scripts are not configured */
    NotConfigured("notConfigured"),
    /** Global device health scripts are configured but not fully enabled */
    Pending("pending"),
    /** Global device health scripts are enabled and ready to use */
    Enabled("enabled");
    public final String value;
    GlobalDeviceHealthScriptState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GlobalDeviceHealthScriptState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "pending": return Pending;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
