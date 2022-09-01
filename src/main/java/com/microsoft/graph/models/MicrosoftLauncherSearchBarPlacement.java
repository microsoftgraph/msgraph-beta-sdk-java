package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftLauncherSearchBarPlacement forValue(@javax.annotation.Nonnull final String searchValue) {
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
