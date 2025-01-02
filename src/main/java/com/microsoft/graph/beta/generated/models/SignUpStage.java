package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SignUpStage implements ValuedEnum {
    CredentialCollection("credentialCollection"),
    CredentialValidation("credentialValidation"),
    CredentialFederation("credentialFederation"),
    Consent("consent"),
    AttributeCollectionAndValidation("attributeCollectionAndValidation"),
    UserCreation("userCreation"),
    TenantConsent("tenantConsent"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SignUpStage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SignUpStage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "credentialCollection": return CredentialCollection;
            case "credentialValidation": return CredentialValidation;
            case "credentialFederation": return CredentialFederation;
            case "consent": return Consent;
            case "attributeCollectionAndValidation": return AttributeCollectionAndValidation;
            case "userCreation": return UserCreation;
            case "tenantConsent": return TenantConsent;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
