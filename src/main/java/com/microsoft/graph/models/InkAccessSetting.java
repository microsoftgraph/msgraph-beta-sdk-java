package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Values for the InkWorkspaceAccess setting.
 */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static InkAccessSetting forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
