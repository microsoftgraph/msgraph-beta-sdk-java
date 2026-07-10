package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible operations for rules used to make determinations about whether an application is in-use based on process state.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppProcessOperationType implements ValuedEnum {
    /** Default. Not configured. */
    NotConfigured("notConfigured"),
    /** Indicates that the rule evaluates whether the specified process exists (is running) on the device. */
    Exists("exists"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Win32LobAppProcessOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppProcessOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "exists": return Exists;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
