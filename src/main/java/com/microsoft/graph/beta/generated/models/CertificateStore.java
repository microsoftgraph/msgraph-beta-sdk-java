package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * CertificateStore types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CertificateStore implements ValuedEnum {
    User("user"),
    Machine("machine");
    public final String value;
    CertificateStore(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CertificateStore forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "machine": return Machine;
            default: return null;
        }
    }
}
