package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported platform types for policies.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Platform implements ValuedEnum {
    /** Default.Indicates the managed device is not known and is associated with 'Unknown' device platform. */
    Unknown("unknown"),
    /** Indicates the managed device is Apple device that runs on iOS operation system. */
    Ios("ios"),
    /** Indicates the managed device is a Android device that runs on Android operation system.  */
    Android("android"),
    /** Indicates the managed device is a Windows device that runs on Windows operation system. */
    Windows("windows"),
    /** Indicates the managed device is a Windows-based mobile device that runs on Windows Mobile operation system. */
    WindowsMobile("windowsMobile"),
    /** Indicates the managed device is Apple device that runs on MacOS operation system. */
    MacOS("macOS"),
    /** Indicates the managed device is Apple device that runs on VisionOS operation system. */
    VisionOS("visionOS"),
    /** Indicates the managed device is Apple device that runs on tvOS operation system. */
    TvOS("tvOS"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Platform(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Platform forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "ios": return Ios;
            case "android": return Android;
            case "windows": return Windows;
            case "windowsMobile": return WindowsMobile;
            case "macOS": return MacOS;
            case "visionOS": return VisionOS;
            case "tvOS": return TvOS;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
