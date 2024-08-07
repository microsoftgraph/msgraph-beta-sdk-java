package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Owner type of device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OwnerType implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Owned by company. */
    Company("company"),
    /** Owned by person. */
    Personal("personal");
    public final String value;
    OwnerType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OwnerType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "company": return Company;
            case "personal": return Personal;
            default: return null;
        }
    }
}
