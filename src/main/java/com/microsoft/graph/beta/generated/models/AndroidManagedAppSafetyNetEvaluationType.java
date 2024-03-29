package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An admin enforced Android SafetyNet evaluation type requirement on a managed app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidManagedAppSafetyNetEvaluationType implements ValuedEnum {
    /** Require basic evaluation */
    Basic("basic"),
    /** Require hardware backed evaluation */
    HardwareBacked("hardwareBacked");
    public final String value;
    AndroidManagedAppSafetyNetEvaluationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidManagedAppSafetyNetEvaluationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "basic": return Basic;
            case "hardwareBacked": return HardwareBacked;
            default: return null;
        }
    }
}
