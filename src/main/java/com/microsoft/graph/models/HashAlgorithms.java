package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Hash Algorithm Options.
 */
public enum HashAlgorithms implements ValuedEnum {
    /** SHA-1 Hash Algorithm. */
    Sha1("sha1"),
    /** SHA-2 Hash Algorithm. */
    Sha2("sha2");
    public final String value;
    HashAlgorithms(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HashAlgorithms forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sha1": return Sha1;
            case "sha2": return Sha2;
            default: return null;
        }
    }
}
