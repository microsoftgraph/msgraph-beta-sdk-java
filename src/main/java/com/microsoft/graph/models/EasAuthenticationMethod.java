package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Exchange Active Sync authentication method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EasAuthenticationMethod implements ValuedEnum {
    /** Authenticate with a username and password. */
    UsernameAndPassword("usernameAndPassword"),
    /** Authenticate with a certificate. */
    Certificate("certificate"),
    /** Authenticate with derived credential. */
    DerivedCredential("derivedCredential");
    public final String value;
    EasAuthenticationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EasAuthenticationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "usernameAndPassword": return UsernameAndPassword;
            case "certificate": return Certificate;
            case "derivedCredential": return DerivedCredential;
            default: return null;
        }
    }
}
