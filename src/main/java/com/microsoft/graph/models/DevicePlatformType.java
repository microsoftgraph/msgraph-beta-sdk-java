package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DevicePlatformType implements ValuedEnum {
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
    /** Android Work Profile. */
    AndroidWorkProfile("androidWorkProfile"),
    /** Unknown. */
    Unknown("unknown"),
    /** Android AOSP. */
    AndroidAOSP("androidAOSP");
    public final String value;
    DevicePlatformType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DevicePlatformType forValue(@javax.annotation.Nonnull final String searchValue) {
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
            case "unknown": return Unknown;
            case "androidAOSP": return AndroidAOSP;
            default: return null;
        }
    }
}
