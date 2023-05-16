package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Encryption readiness state */
public enum EncryptionReadinessState implements ValuedEnum {
    /** Not ready */
    NotReady("notReady"),
    /** Ready */
    Ready("ready");
    public final String value;
    EncryptionReadinessState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EncryptionReadinessState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notReady": return NotReady;
            case "ready": return Ready;
            default: return null;
        }
    }
}
