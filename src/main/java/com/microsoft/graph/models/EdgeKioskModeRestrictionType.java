package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specify how the Microsoft Edge settings are restricted based on kiosk mode.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EdgeKioskModeRestrictionType implements ValuedEnum {
    /** Not configured (unrestricted). */
    NotConfigured("notConfigured"),
    /** Interactive/Digital signage in single-app mode. */
    DigitalSignage("digitalSignage"),
    /** Normal mode (full version of Microsoft Edge). */
    NormalMode("normalMode"),
    /** Public browsing in single-app mode. */
    PublicBrowsingSingleApp("publicBrowsingSingleApp"),
    /** Public browsing (inPrivate) in multi-app mode. */
    PublicBrowsingMultiApp("publicBrowsingMultiApp");
    public final String value;
    EdgeKioskModeRestrictionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EdgeKioskModeRestrictionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "digitalSignage": return DigitalSignage;
            case "normalMode": return NormalMode;
            case "publicBrowsingSingleApp": return PublicBrowsingSingleApp;
            case "publicBrowsingMultiApp": return PublicBrowsingMultiApp;
            default: return null;
        }
    }
}
