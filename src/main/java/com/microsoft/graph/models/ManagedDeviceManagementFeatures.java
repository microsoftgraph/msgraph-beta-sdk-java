package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Device management features.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedDeviceManagementFeatures implements ValuedEnum {
    /** Unknown device management features. */
    None("none"),
    /** Microsoft Managed Desktop */
    MicrosoftManagedDesktop("microsoftManagedDesktop");
    public final String value;
    ManagedDeviceManagementFeatures(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedDeviceManagementFeatures forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "microsoftManagedDesktop": return MicrosoftManagedDesktop;
            default: return null;
        }
    }
}
