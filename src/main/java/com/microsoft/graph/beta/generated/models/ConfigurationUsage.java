package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of the ConfigurationUsage list.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConfigurationUsage implements ValuedEnum {
    /** Disallowed. */
    Blocked("blocked"),
    /** Required. */
    Required("required"),
    /** Optional. */
    Allowed("allowed"),
    /** Not Configured. */
    NotConfigured("notConfigured");
    public final String value;
    ConfigurationUsage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConfigurationUsage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "blocked": return Blocked;
            case "required": return Required;
            case "allowed": return Allowed;
            case "notConfigured": return NotConfigured;
            default: return null;
        }
    }
}
