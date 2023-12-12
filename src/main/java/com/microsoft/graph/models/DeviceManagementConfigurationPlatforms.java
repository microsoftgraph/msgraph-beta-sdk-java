package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported platform types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationPlatforms implements ValuedEnum {
    /** Default. No platform type specified. */
    None("none"),
    /** Settings for Android platform. */
    Android("android"),
    /** Settings for iOS platform. */
    IOS("iOS"),
    /** Settings for MacOS platform. */
    MacOS("macOS"),
    /** Windows 10 X. */
    Windows10X("windows10X"),
    /** Settings for Windows 10 platform. */
    Windows10("windows10"),
    /** Settings for Linux platform. */
    Linux("linux"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationPlatforms(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationPlatforms forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "android": return Android;
            case "iOS": return IOS;
            case "macOS": return MacOS;
            case "windows10X": return Windows10X;
            case "windows10": return Windows10;
            case "linux": return Linux;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
