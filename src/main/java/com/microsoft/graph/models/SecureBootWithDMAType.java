package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of Secure Boot with DMA
 */
public enum SecureBootWithDMAType implements ValuedEnum {
    /** Not configured, no operation */
    NotConfigured("notConfigured"),
    /** Turns on VBS with Secure Boot */
    WithoutDMA("withoutDMA"),
    /** Turns on VBS with Secure Boot and DMA */
    WithDMA("withDMA");
    public final String value;
    SecureBootWithDMAType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecureBootWithDMAType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "withoutDMA": return WithoutDMA;
            case "withDMA": return WithDMA;
            default: return null;
        }
    }
}
