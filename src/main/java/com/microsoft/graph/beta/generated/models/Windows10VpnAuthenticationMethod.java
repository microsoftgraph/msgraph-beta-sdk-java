package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows 10 VPN connection types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Windows10VpnAuthenticationMethod implements ValuedEnum {
    /** Authenticate with a certificate. */
    Certificate("certificate"),
    /** Use username and password for authentication. */
    UsernameAndPassword("usernameAndPassword"),
    /** Authentication method is specified in custom EAP XML. */
    CustomEapXml("customEapXml"),
    /** Use Derived Credential for authentication. */
    DerivedCredential("derivedCredential");
    public final String value;
    Windows10VpnAuthenticationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Windows10VpnAuthenticationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "certificate": return Certificate;
            case "usernameAndPassword": return UsernameAndPassword;
            case "customEapXml": return CustomEapXml;
            case "derivedCredential": return DerivedCredential;
            default: return null;
        }
    }
}
