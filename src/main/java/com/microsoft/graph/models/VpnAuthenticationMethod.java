package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum VpnAuthenticationMethod implements ValuedEnum {
    /** Authenticate with a certificate. */
    Certificate("certificate"),
    /** Use username and password for authentication. */
    UsernameAndPassword("usernameAndPassword"),
    /** Use Shared Secret for Authentication.  Only valid for iOS IKEv2. */
    SharedSecret("sharedSecret"),
    /** Use Derived Credential for Authentication. */
    DerivedCredential("derivedCredential"),
    /** Use Azure AD for authentication. */
    AzureAD("azureAD");
    public final String value;
    VpnAuthenticationMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnAuthenticationMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "certificate": return Certificate;
            case "usernameAndPassword": return UsernameAndPassword;
            case "sharedSecret": return SharedSecret;
            case "derivedCredential": return DerivedCredential;
            case "azureAD": return AzureAD;
            default: return null;
        }
    }
}
