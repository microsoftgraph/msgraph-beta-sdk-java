package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum representing the Android SafetyNet attestation evaluation types.
 */
public enum AndroidSafetyNetEvaluationType implements ValuedEnum {
    /** Default value. Typical measurements and reference data were used. */
    Basic("basic"),
    /** Hardware-backed security features (such as Key Attestation) were used. */
    HardwareBacked("hardwareBacked");
    public final String value;
    AndroidSafetyNetEvaluationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidSafetyNetEvaluationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basic": return Basic;
            case "hardwareBacked": return HardwareBacked;
            default: return null;
        }
    }
}
