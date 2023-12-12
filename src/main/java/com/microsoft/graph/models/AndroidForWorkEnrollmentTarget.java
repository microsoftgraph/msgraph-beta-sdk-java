package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android for Work device management targeting type for the account
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidForWorkEnrollmentTarget implements ValuedEnum {
    None("none"),
    All("all"),
    Targeted("targeted"),
    TargetedAsEnrollmentRestrictions("targetedAsEnrollmentRestrictions");
    public final String value;
    AndroidForWorkEnrollmentTarget(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidForWorkEnrollmentTarget forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "all": return All;
            case "targeted": return Targeted;
            case "targetedAsEnrollmentRestrictions": return TargetedAsEnrollmentRestrictions;
            default: return null;
        }
    }
}
