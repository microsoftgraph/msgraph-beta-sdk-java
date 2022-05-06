package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum Platform implements ValuedEnum {
    Unknown("unknown"),
    Ios("ios"),
    Android("android"),
    Windows("windows"),
    WindowsMobile("windowsMobile"),
    MacOS("macOS");
    public final String value;
    Platform(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Platform forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "ios": return Ios;
            case "android": return Android;
            case "windows": return Windows;
            case "windowsMobile": return WindowsMobile;
            case "macOS": return MacOS;
            default: return null;
        }
    }
}
