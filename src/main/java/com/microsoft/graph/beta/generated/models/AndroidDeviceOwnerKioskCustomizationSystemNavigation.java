package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum representing possible values for kiosk customization system navigation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerKioskCustomizationSystemNavigation implements ValuedEnum {
    /** Not configured; this value defaults to NAVIGATION_DISABLED. */
    NotConfigured("notConfigured"),
    /** Home and overview buttons are enabled. */
    NavigationEnabled("navigationEnabled"),
    /**  Only the home button is enabled. */
    HomeButtonOnly("homeButtonOnly");
    public final String value;
    AndroidDeviceOwnerKioskCustomizationSystemNavigation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerKioskCustomizationSystemNavigation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "navigationEnabled": return NavigationEnabled;
            case "homeButtonOnly": return HomeButtonOnly;
            default: return null;
        }
    }
}
