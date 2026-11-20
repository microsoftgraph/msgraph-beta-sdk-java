package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VerificationState implements ValuedEnum {
    Unverified("unverified"),
    Verified("verified"),
    Revoked("revoked"),
    Suspended("suspended"),
    Issued("issued"),
    Blocked("blocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VerificationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VerificationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unverified": return Unverified;
            case "verified": return Verified;
            case "revoked": return Revoked;
            case "suspended": return Suspended;
            case "issued": return Issued;
            case "blocked": return Blocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
