package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Device Owner Enrollment Profile types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerEnrollmentProfileType implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Dedicated device. */
    DedicatedDevice("dedicatedDevice"),
    /** Fully managed. */
    FullyManaged("fullyManaged");
    public final String value;
    AndroidDeviceOwnerEnrollmentProfileType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerEnrollmentProfileType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "dedicatedDevice": return DedicatedDevice;
            case "fullyManaged": return FullyManaged;
            default: return null;
        }
    }
}
