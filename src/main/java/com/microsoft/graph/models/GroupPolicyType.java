package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of Group Policy File or Definition.
 */
public enum GroupPolicyType implements ValuedEnum {
    /** Group Policy administrative templates built-in to the Policy configuration service provider (CSP). */
    AdmxBacked("admxBacked"),
    /** Group Policy administrative templates installed using the Policy configuration service provider (CSP). */
    AdmxIngested("admxIngested");
    public final String value;
    GroupPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GroupPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "admxBacked": return AdmxBacked;
            case "admxIngested": return AdmxIngested;
            default: return null;
        }
    }
}
