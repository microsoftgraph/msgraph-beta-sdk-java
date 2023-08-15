package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum type to represent approval type of a driver update profile.
 */
public enum DriverUpdateProfileApprovalType implements ValuedEnum {
    /** This indicates a driver and firmware profile needs to be approved manually. */
    Manual("manual"),
    /** This indicates a driver and firmware profile is approved automatically. */
    Automatic("automatic");
    public final String value;
    DriverUpdateProfileApprovalType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DriverUpdateProfileApprovalType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual": return Manual;
            case "automatic": return Automatic;
            default: return null;
        }
    }
}
