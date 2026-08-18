package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VerifiedIdMethodType implements ValuedEnum {
    IdentityVerificationPartner("identityVerificationPartner"),
    TenantCustomCredential("tenantCustomCredential"),
    VerifiedEmployee("verifiedEmployee"),
    UnknownFutureValue("unknownFutureValue"),
    NotConfigured("notConfigured");
    public final String value;
    VerifiedIdMethodType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VerifiedIdMethodType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "identityVerificationPartner": return IdentityVerificationPartner;
            case "tenantCustomCredential": return TenantCustomCredential;
            case "verifiedEmployee": return VerifiedEmployee;
            case "unknownFutureValue": return UnknownFutureValue;
            case "notConfigured": return NotConfigured;
            default: return null;
        }
    }
}
