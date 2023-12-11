package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum representing the Android Play Integrity API evaluation types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidSafetyNetEvaluationType implements ValuedEnum {
    /** Default value. Typical measurements and reference data were used. */
    Basic("basic"),
    /** Strong Integrity checks (such as a hardware-backed proof of boot integrity) were used. */
    HardwareBacked("hardwareBacked");
    public final String value;
    AndroidSafetyNetEvaluationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidSafetyNetEvaluationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basic": return Basic;
            case "hardwareBacked": return HardwareBacked;
            default: return null;
        }
    }
}
