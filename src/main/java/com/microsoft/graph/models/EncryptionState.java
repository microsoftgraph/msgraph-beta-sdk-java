package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Encryption state
 */
public enum EncryptionState implements ValuedEnum {
    /** Not encrypted */
    NotEncrypted("notEncrypted"),
    /** Encrypted */
    Encrypted("encrypted");
    public final String value;
    EncryptionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EncryptionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notEncrypted": return NotEncrypted;
            case "encrypted": return Encrypted;
            default: return null;
        }
    }
}
