package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Microsoft Launcher Search Bar Placement selection.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MicrosoftLauncherSearchBarPlacement implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Indicates that the search bar will be displayed on the top of the device. */
    Top("top"),
    /** Indicates that the search bar will be displayed on the bottom of the device. */
    Bottom("bottom"),
    /** Indicates that the search bar will be hidden on the device. */
    Hide("hide");
    public final String value;
    MicrosoftLauncherSearchBarPlacement(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MicrosoftLauncherSearchBarPlacement forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "top": return Top;
            case "bottom": return Bottom;
            case "hide": return Hide;
            default: return null;
        }
    }
}
