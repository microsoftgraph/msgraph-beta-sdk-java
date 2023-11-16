package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PermissionsModificationCapability implements ValuedEnum {
    Enabled("enabled"),
    NotConfigured("notConfigured"),
    NoRecentDataCollected("noRecentDataCollected"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PermissionsModificationCapability(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PermissionsModificationCapability forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "notConfigured": return NotConfigured;
            case "noRecentDataCollected": return NoRecentDataCollected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
