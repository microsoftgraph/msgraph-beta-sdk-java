package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of Android Kiosk Mode.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum KioskModeType implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Run in single-app mode */
    SingleAppMode("singleAppMode"),
    /** Run in multi-app mode */
    MultiAppMode("multiAppMode");
    public final String value;
    KioskModeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static KioskModeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "singleAppMode": return SingleAppMode;
            case "multiAppMode": return MultiAppMode;
            default: return null;
        }
    }
}
