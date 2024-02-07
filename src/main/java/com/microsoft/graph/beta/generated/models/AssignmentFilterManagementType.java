package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported filter management types whether its devices or apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentFilterManagementType implements ValuedEnum {
    /** Indicates when filter is supported based on device properties. This is the default value when management type resolution fails. */
    Devices("devices"),
    /** Indicates when filter is supported based on app properties. */
    Apps("apps"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AssignmentFilterManagementType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentFilterManagementType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "devices": return Devices;
            case "apps": return Apps;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
