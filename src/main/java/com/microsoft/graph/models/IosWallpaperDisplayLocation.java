package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IosWallpaperDisplayLocation forValue(@javax.annotation.Nonnull final String searchValue) {
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
