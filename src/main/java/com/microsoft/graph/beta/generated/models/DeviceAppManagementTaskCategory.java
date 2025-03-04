package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device app management task category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceAppManagementTaskCategory implements ValuedEnum {
    /** Unknown source. */
    Unknown("unknown"),
    /** Windows Defender ATP Threat &amp; Vulnerability Management. */
    AdvancedThreatProtection("advancedThreatProtection");
    public final String value;
    DeviceAppManagementTaskCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceAppManagementTaskCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "advancedThreatProtection": return AdvancedThreatProtection;
            default: return null;
        }
    }
}
