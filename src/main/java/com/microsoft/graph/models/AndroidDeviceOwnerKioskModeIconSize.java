package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Device Owner Kiosk Mode managed home screen icon size.
 */
public enum AndroidDeviceOwnerKioskModeIconSize implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Smallest icon size. */
    Smallest("smallest"),
    /** Small icon size. */
    Small("small"),
    /** Regular icon size. */
    Regular("regular"),
    /** Large icon size. */
    Large("large"),
    /** Largest icon size. */
    Largest("largest");
    public final String value;
    AndroidDeviceOwnerKioskModeIconSize(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerKioskModeIconSize forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "smallest": return Smallest;
            case "small": return Small;
            case "regular": return Regular;
            case "large": return Large;
            case "largest": return Largest;
            default: return null;
        }
    }
}
