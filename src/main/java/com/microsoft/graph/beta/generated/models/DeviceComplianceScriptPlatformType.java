package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the platform that a device compliance script targets for evaluation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceComplianceScriptPlatformType implements ValuedEnum {
    /** Default. Indicates that the compliance script targets devices running Windows 10 and later. */
    Windows10("windows10"),
    /** Indicates that the compliance script targets devices running Linux. */
    Linux("linux"),
    /** Indicates that the compliance script targets devices running macOS. */
    MacOS("macOS"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceComplianceScriptPlatformType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceComplianceScriptPlatformType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "windows10": return Windows10;
            case "linux": return Linux;
            case "macOS": return MacOS;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
