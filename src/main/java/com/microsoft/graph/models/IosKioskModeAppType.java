package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * App source options for iOS kiosk mode.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IosKioskModeAppType implements ValuedEnum {
    /** Device default value, no intent. */
    NotConfigured("notConfigured"),
    /** The app to be run comes from the app store. */
    AppStoreApp("appStoreApp"),
    /** The app to be run is built into the device. */
    ManagedApp("managedApp"),
    /** The app to be run is a managed app. */
    BuiltInApp("builtInApp");
    public final String value;
    IosKioskModeAppType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IosKioskModeAppType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "appStoreApp": return AppStoreApp;
            case "managedApp": return ManagedApp;
            case "builtInApp": return BuiltInApp;
            default: return null;
        }
    }
}
