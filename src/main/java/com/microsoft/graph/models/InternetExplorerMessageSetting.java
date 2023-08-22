package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * What message will be displayed by Edge before switching to Internet Explorer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InternetExplorerMessageSetting implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Disabled. */
    Disabled("disabled"),
    /** Enabled. */
    Enabled("enabled"),
    /** KeepGoing. */
    KeepGoing("keepGoing");
    public final String value;
    InternetExplorerMessageSetting(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InternetExplorerMessageSetting forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            case "keepGoing": return KeepGoing;
            default: return null;
        }
    }
}
