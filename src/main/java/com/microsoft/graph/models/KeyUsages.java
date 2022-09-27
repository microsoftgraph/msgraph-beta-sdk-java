package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum KeyUsages implements ValuedEnum {
    /** Key Encipherment Usage. */
    KeyEncipherment("keyEncipherment"),
    /** Digital Signature Usage. */
    DigitalSignature("digitalSignature");
    public final String value;
    KeyUsages(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static KeyUsages forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "keyEncipherment": return KeyEncipherment;
            case "digitalSignature": return DigitalSignature;
            default: return null;
        }
    }
}
