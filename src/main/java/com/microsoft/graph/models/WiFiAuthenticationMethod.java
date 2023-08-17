package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wi-Fi authentication method.
 */
public enum WiFiAuthenticationMethod implements ValuedEnum {
    /** Use an identity certificate for authentication. */
    Certificate("certificate"),
    /** Use username and password for authentication. */
    UsernameAndPassword("usernameAndPassword"),
    /** Use Derived Credential for authentication. */
    DerivedCredential("derivedCredential");
    public final String value;
    WiFiAuthenticationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WiFiAuthenticationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "certificate": return Certificate;
            case "usernameAndPassword": return UsernameAndPassword;
            case "derivedCredential": return DerivedCredential;
            default: return null;
        }
    }
}
