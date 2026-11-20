package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProvenanceAssertionType implements ValuedEnum {
    IdentityVerification("identityVerification"),
    DerivedFromCredential("derivedFromCredential"),
    ManualAttestation("manualAttestation"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvenanceAssertionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProvenanceAssertionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "identityVerification": return IdentityVerification;
            case "derivedFromCredential": return DerivedFromCredential;
            case "manualAttestation": return ManualAttestation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
