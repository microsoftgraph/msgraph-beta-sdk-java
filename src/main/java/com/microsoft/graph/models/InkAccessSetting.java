package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Values for the InkWorkspaceAccess setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InkAccessSetting implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Enabled. */
    Enabled("enabled"),
    /** Disabled. */
    Disabled("disabled");
    public final String value;
    InkAccessSetting(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InkAccessSetting forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
