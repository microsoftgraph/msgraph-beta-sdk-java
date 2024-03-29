package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Admin consent state.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdminConsentState implements ValuedEnum {
    /** Admin did not configure the item */
    NotConfigured("notConfigured"),
    /** Admin granted item */
    Granted("granted"),
    /** Admin deos not grant item */
    NotGranted("notGranted");
    public final String value;
    AdminConsentState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdminConsentState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "granted": return Granted;
            case "notGranted": return NotGranted;
            default: return null;
        }
    }
}
