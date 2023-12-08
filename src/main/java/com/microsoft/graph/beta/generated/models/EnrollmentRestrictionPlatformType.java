package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enum indicates the platform type for which the enrollment restriction applies.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnrollmentRestrictionPlatformType implements ValuedEnum {
    /** Indicates that the enrollment configuration applies to all platforms */
    AllPlatforms("allPlatforms"),
    /** Indicates that the enrollment configuration applies only to iOS/iPadOS devices */
    Ios("ios"),
    /** Indicates that the enrollment configuration applies only to Windows devices */
    Windows("windows"),
    /** Indicates that the enrollment configuration applies only to Windows Phone devices */
    WindowsPhone("windowsPhone"),
    /** Indicates that the enrollment configuration applies only to Android devices */
    Android("android"),
    /** Indicates that the enrollment configuration applies only to Android for Work devices */
    AndroidForWork("androidForWork"),
    /** Indicates that the enrollment configuration applies only to macOS devices */
    Mac("mac"),
    /** Indicates that the enrollment configuration applies only to Linux devices */
    Linux("linux"),
    /** Evolvable enumeration sentinel value. Do not use */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnrollmentRestrictionPlatformType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnrollmentRestrictionPlatformType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allPlatforms": return AllPlatforms;
            case "ios": return Ios;
            case "windows": return Windows;
            case "windowsPhone": return WindowsPhone;
            case "android": return Android;
            case "androidForWork": return AndroidForWork;
            case "mac": return Mac;
            case "linux": return Linux;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
