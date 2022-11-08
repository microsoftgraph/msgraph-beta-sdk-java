package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum DeviceManagementApplicabilityRuleType implements ValuedEnum {
    /** Include */
    Include("include"),
    /** Exclude */
    Exclude("exclude");
    public final String value;
    DeviceManagementApplicabilityRuleType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementApplicabilityRuleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "include": return Include;
            case "exclude": return Exclude;
            default: return null;
        }
    }
}
