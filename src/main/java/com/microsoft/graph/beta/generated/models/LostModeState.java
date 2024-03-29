package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * State of lost mode, indicating if lost mode is enabled or disabled
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LostModeState implements ValuedEnum {
    /** Lost mode is disabled. */
    Disabled("disabled"),
    /** Lost mode is enabled. */
    Enabled("enabled");
    public final String value;
    LostModeState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LostModeState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enabled": return Enabled;
            default: return null;
        }
    }
}
