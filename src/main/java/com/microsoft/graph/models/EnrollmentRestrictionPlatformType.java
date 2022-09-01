package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum EnrollmentRestrictionPlatformType implements ValuedEnum {
    /** Applies to all platforms */
    AllPlatforms("allPlatforms"),
    /** iOS/iPadOS devices */
    Ios("ios"),
    /** Windows devices */
    Windows("windows"),
    /** Windows Phone devices */
    WindowsPhone("windowsPhone"),
    /** Android devices */
    Android("android"),
    /** Android for Work devices */
    AndroidForWork("androidForWork"),
    /** macOS devices */
    Mac("mac");
    public final String value;
    EnrollmentRestrictionPlatformType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EnrollmentRestrictionPlatformType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allPlatforms": return AllPlatforms;
            case "ios": return Ios;
            case "windows": return Windows;
            case "windowsPhone": return WindowsPhone;
            case "android": return Android;
            case "androidForWork": return AndroidForWork;
            case "mac": return Mac;
            default: return null;
        }
    }
}
