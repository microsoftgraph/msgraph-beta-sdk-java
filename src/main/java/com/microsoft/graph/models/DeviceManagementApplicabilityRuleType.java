package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported Applicability rule types for Device Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementApplicabilityRuleType implements ValuedEnum {
    /** Include */
    Include("include"),
    /** Exclude */
    Exclude("exclude");
    public final String value;
    DeviceManagementApplicabilityRuleType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementApplicabilityRuleType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "include": return Include;
            case "exclude": return Exclude;
            default: return null;
        }
    }
}
