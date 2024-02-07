package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported platform types for policies.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PolicyPlatformType implements ValuedEnum {
    /** Android. */
    Android("android"),
    /** AndroidForWork. */
    AndroidForWork("androidForWork"),
    /** iOS. */
    IOS("iOS"),
    /** MacOS. */
    MacOS("macOS"),
    /** WindowsPhone 8.1. */
    WindowsPhone81("windowsPhone81"),
    /** Windows 8.1 and later */
    Windows81AndLater("windows81AndLater"),
    /** Windows 10 and later. */
    Windows10AndLater("windows10AndLater"),
    /** AndroidWorkProfile. */
    AndroidWorkProfile("androidWorkProfile"),
    /** Windows10XProfile. */
    Windows10XProfile("windows10XProfile"),
    /** AndroidAOSPProfile. */
    AndroidAOSP("androidAOSP"),
    /** All platforms. */
    All("all");
    public final String value;
    PolicyPlatformType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PolicyPlatformType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "android": return Android;
            case "androidForWork": return AndroidForWork;
            case "iOS": return IOS;
            case "macOS": return MacOS;
            case "windowsPhone81": return WindowsPhone81;
            case "windows81AndLater": return Windows81AndLater;
            case "windows10AndLater": return Windows10AndLater;
            case "androidWorkProfile": return AndroidWorkProfile;
            case "windows10XProfile": return Windows10XProfile;
            case "androidAOSP": return AndroidAOSP;
            case "all": return All;
            default: return null;
        }
    }
}
