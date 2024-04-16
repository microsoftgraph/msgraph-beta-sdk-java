package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Platform Type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlatformType implements ValuedEnum {
    /** None Platform Type */
    None("none"),
    /** Android Platform Type */
    Android("android"),
    /** Android Enterprise Platform Type */
    AndroidEnterprise("androidEnterprise"),
    /** iOS Platform Type */
    IOS("iOS"),
    /** MacOS Platform Type */
    MacOS("macOS"),
    /** Windows 10X Platform Type */
    Windows10X("windows10X"),
    /** Windows 10 Platform Type */
    Windows10("windows10");
    public final String value;
    PlatformType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlatformType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "android": return Android;
            case "androidEnterprise": return AndroidEnterprise;
            case "iOS": return IOS;
            case "macOS": return MacOS;
            case "windows10X": return Windows10X;
            case "windows10": return Windows10;
            default: return null;
        }
    }
}
