package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Platform implements ValuedEnum {
    /** Unknown device platform */
    Unknown("unknown"),
    /** IOS device platform */
    Ios("ios"),
    /** Android device platform */
    Android("android"),
    /** Windows device platform */
    Windows("windows"),
    /** WindowsMobile device platform */
    WindowsMobile("windowsMobile"),
    /** Mac device platform */
    MacOS("macOS");
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
            default: return null;
        }
    }
}
