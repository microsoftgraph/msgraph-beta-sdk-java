package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConfigurationUsage forValue(@javax.annotation.Nonnull final String searchValue) {
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
