package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Key Usage Options.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum KeyUsages implements ValuedEnum {
    /** Key Encipherment Usage. */
    KeyEncipherment("keyEncipherment"),
    /** Digital Signature Usage. */
    DigitalSignature("digitalSignature");
    public final String value;
    KeyUsages(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static KeyUsages forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "keyEncipherment": return KeyEncipherment;
            case "digitalSignature": return DigitalSignature;
            default: return null;
        }
    }
}
