package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wired Network authentication method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WiredNetworkAuthenticationMethod implements ValuedEnum {
    /** Use an identity certificate for authentication. */
    Certificate("certificate"),
    /** Use username and password for authentication. */
    UsernameAndPassword("usernameAndPassword"),
    /** Use Derived Credential for authentication. */
    DerivedCredential("derivedCredential"),
    /** Sentinel member for cases where the client cannot handle the new enum values. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WiredNetworkAuthenticationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WiredNetworkAuthenticationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "certificate": return Certificate;
            case "usernameAndPassword": return UsernameAndPassword;
            case "derivedCredential": return DerivedCredential;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
