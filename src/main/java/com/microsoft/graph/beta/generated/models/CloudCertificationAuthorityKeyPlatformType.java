package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum type of possible key platforms used by the certification authority.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudCertificationAuthorityKeyPlatformType implements ValuedEnum {
    /** Default. The key platform type is unknown or invalid. */
    Unknown("unknown"),
    /** The certification authority keys are stored in software. */
    Software("software"),
    /** The certification authority keys are stored in a hardware security module. */
    HardwareSecurityModule("hardwareSecurityModule"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudCertificationAuthorityKeyPlatformType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudCertificationAuthorityKeyPlatformType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "software": return Software;
            case "hardwareSecurityModule": return HardwareSecurityModule;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
