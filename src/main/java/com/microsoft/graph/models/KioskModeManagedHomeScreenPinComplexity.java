package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Complexity of PIN for Managed Home Screen sign-in session.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum KioskModeManagedHomeScreenPinComplexity implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Numeric values only. */
    Simple("simple"),
    /** Alphanumerical value. */
    Complex("complex");
    public final String value;
    KioskModeManagedHomeScreenPinComplexity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static KioskModeManagedHomeScreenPinComplexity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "simple": return Simple;
            case "complex": return Complex;
            default: return null;
        }
    }
}
