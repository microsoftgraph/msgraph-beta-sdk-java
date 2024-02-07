package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Metered Connection Limit Settings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MeteredConnectionLimitType implements ValuedEnum {
    /** Unrestricted */
    Unrestricted("unrestricted"),
    /** Fixed */
    Fixed("fixed"),
    /** Variable */
    Variable("variable");
    public final String value;
    MeteredConnectionLimitType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MeteredConnectionLimitType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unrestricted": return Unrestricted;
            case "fixed": return Fixed;
            case "variable": return Variable;
            default: return null;
        }
    }
}
