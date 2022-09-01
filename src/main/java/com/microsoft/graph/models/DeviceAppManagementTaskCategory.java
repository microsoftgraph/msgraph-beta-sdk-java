package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DeviceAppManagementTaskCategory implements ValuedEnum {
    /** Unknown source. */
    Unknown("unknown"),
    /** Windows Defender ATP Threat & Vulnerability Management. */
    AdvancedThreatProtection("advancedThreatProtection");
    public final String value;
    DeviceAppManagementTaskCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceAppManagementTaskCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "advancedThreatProtection": return AdvancedThreatProtection;
            default: return null;
        }
    }
}
