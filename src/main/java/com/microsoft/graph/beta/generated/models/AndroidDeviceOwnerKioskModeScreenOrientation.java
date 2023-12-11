package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Device Owner Kiosk Mode managed home screen orientation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerKioskModeScreenOrientation implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Portrait orientation. */
    Portrait("portrait"),
    /** Landscape orientation. */
    Landscape("landscape"),
    /** Auto rotate between portrait and landscape orientations. */
    AutoRotate("autoRotate");
    public final String value;
    AndroidDeviceOwnerKioskModeScreenOrientation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerKioskModeScreenOrientation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "portrait": return Portrait;
            case "landscape": return Landscape;
            case "autoRotate": return AutoRotate;
            default: return null;
        }
    }
}
