package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClientCredentialType implements ValuedEnum {
    None("none"),
    ClientSecret("clientSecret"),
    ClientAssertion("clientAssertion"),
    FederatedIdentityCredential("federatedIdentityCredential"),
    ManagedIdentity("managedIdentity"),
    Certificate("certificate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ClientCredentialType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClientCredentialType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "clientSecret": return ClientSecret;
            case "clientAssertion": return ClientAssertion;
            case "federatedIdentityCredential": return FederatedIdentityCredential;
            case "managedIdentity": return ManagedIdentity;
            case "certificate": return Certificate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
