package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported platform types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationPlatforms implements ValuedEnum {
    /** Indicates the settings contained in this configuration don&apos;t have a platform set. */
    None("none"),
    /** Indicates that the settings contained in associated configuration applies to the Android operating system.  */
    Android("android"),
    /** Indicates that the settings contained in associated configuration applies to the iOS operating system. */
    IOS("iOS"),
    /** Indicates that the settings contained in associated configuration applies to the MacOS operating system. */
    MacOS("macOS"),
    /** Indicates that the settings contained in associated configuration applies to the Windows 10X operating system. */
    Windows10X("windows10X"),
    /** Indicates that the settings contained in associated configuration applies to the Windows 10 operating system. */
    Windows10("windows10"),
    /** Indicates that the settings contained in associated configuration applies to the Linux operating system. */
    Linux("linux"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Indicates that the settings contained in associated configuration applies to the android operating system corporate owned devices. */
    AndroidEnterprise("androidEnterprise"),
    /** Indicates that the settings contained in associated configuration applies to the android open source operating system. */
    Aosp("aosp"),
    /** Indicates that the settings contained in associated configuration applies to visionOS platform. */
    VisionOS("visionOS"),
    /** Indicates that the settings contained in associated configuration applies to the tvOS platform. */
    TvOS("tvOS");
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
            case "androidEnterprise": return AndroidEnterprise;
            case "aosp": return Aosp;
            case "visionOS": return VisionOS;
            case "tvOS": return TvOS;
            default: return null;
        }
    }
}
