package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Platform Type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlatformType implements ValuedEnum {
    /** None */
    None("none"),
    /** Android */
    Android("android"),
    /** iOS */
    IOS("iOS"),
    /** MacOS */
    MacOS("macOS"),
    /** Windows 10X Platform Type */
    Windows10X("windows10X"),
    /** Windows 10 */
    Windows10("windows10"),
    /** Linux */
    Linux("linux"),
    /** UnknownFutureValue */
    UnknownFutureValue("unknownFutureValue"),
    /** AndroidEnterprise */
    AndroidEnterprise("androidEnterprise"),
    /** Android Open Source Project */
    Aosp("aosp");
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
            case "iOS": return IOS;
            case "macOS": return MacOS;
            case "windows10X": return Windows10X;
            case "windows10": return Windows10;
            case "linux": return Linux;
            case "unknownFutureValue": return UnknownFutureValue;
            case "androidEnterprise": return AndroidEnterprise;
            case "aosp": return Aosp;
            default: return null;
        }
    }
}
