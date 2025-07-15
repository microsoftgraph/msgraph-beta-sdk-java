package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Define the platform type for which the admin wants to create the device clean up rule
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceCleanupRulePlatformType implements ValuedEnum {
    /** Default. Indicates that clean up rule is associated with all managed device platform. */
    All("all"),
    /** Indicates that clean up rule is associated with Android open source project managed device platform. */
    AndroidAOSP("androidAOSP"),
    /** Indicates that clean up rule is associated with Android device administrator managed device platform. */
    AndroidDeviceAdministrator("androidDeviceAdministrator"),
    /** Indicates that clean up rule is associated with Android dedicated and fully managed and Corporate Owned Work Profile managed device platform. */
    AndroidDedicatedAndFullyManagedCorporateOwnedWorkProfile("androidDedicatedAndFullyManagedCorporateOwnedWorkProfile"),
    /** Indicates that clean up rule is associated with ChromeOS managed device platform. */
    ChromeOS("chromeOS"),
    /** Indicates that clean up rule is associated with Android personally owned work profile managed device platform. */
    AndroidPersonallyOwnedWorkProfile("androidPersonallyOwnedWorkProfile"),
    /** Indicates that clean up rule is associated with IOS managed device platform. */
    Ios("ios"),
    /** Indicates that clean up rule is associated with MacOS managed device platform. */
    MacOS("macOS"),
    /** Indicates that clean up rule is associated with Windows managed device platform. */
    Windows("windows"),
    /** Indicates that clean up rule is associated with Windows Holographic managed device platform. */
    WindowsHolographic("windowsHolographic"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Indicates that clean up rule is associated with visionOS managed device platform. */
    VisionOS("visionOS"),
    /** Indicates that clean up rule is associated with tvOS managed device platform. */
    TvOS("tvOS");
    public final String value;
    DeviceCleanupRulePlatformType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceCleanupRulePlatformType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "androidAOSP": return AndroidAOSP;
            case "androidDeviceAdministrator": return AndroidDeviceAdministrator;
            case "androidDedicatedAndFullyManagedCorporateOwnedWorkProfile": return AndroidDedicatedAndFullyManagedCorporateOwnedWorkProfile;
            case "chromeOS": return ChromeOS;
            case "androidPersonallyOwnedWorkProfile": return AndroidPersonallyOwnedWorkProfile;
            case "ios": return Ios;
            case "macOS": return MacOS;
            case "windows": return Windows;
            case "windowsHolographic": return WindowsHolographic;
            case "unknownFutureValue": return UnknownFutureValue;
            case "visionOS": return VisionOS;
            case "tvOS": return TvOS;
            default: return null;
        }
    }
}
