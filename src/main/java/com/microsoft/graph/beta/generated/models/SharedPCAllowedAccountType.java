package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of accounts that are allowed to share the PC.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharedPCAllowedAccountType implements ValuedEnum {
    /** Not configured. Default value. */
    NotConfigured("notConfigured"),
    /** Only guest accounts. */
    Guest("guest"),
    /** Only domain-joined accounts. */
    Domain("domain");
    public final String value;
    SharedPCAllowedAccountType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharedPCAllowedAccountType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "guest": return Guest;
            case "domain": return Domain;
            default: return null;
        }
    }
}
