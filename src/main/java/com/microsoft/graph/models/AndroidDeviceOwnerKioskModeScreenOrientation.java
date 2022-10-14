package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerKioskModeScreenOrientation forValue(@javax.annotation.Nonnull final String searchValue) {
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
