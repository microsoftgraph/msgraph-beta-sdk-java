package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum type for wallpaper display location specifier.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IosWallpaperDisplayLocation implements ValuedEnum {
    /** No location specified for wallpaper display. */
    NotConfigured("notConfigured"),
    /** A configured wallpaper image is displayed on Lock screen. */
    LockScreen("lockScreen"),
    /** A configured wallpaper image is displayed on Home (icon list) screen. */
    HomeScreen("homeScreen"),
    /** A configured wallpaper image is displayed on Lock screen and Home screen. */
    LockAndHomeScreens("lockAndHomeScreens");
    public final String value;
    IosWallpaperDisplayLocation(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IosWallpaperDisplayLocation forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "lockScreen": return LockScreen;
            case "homeScreen": return HomeScreen;
            case "lockAndHomeScreens": return LockAndHomeScreens;
            default: return null;
        }
    }
}
