package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VerificationEventLifecycleState implements ValuedEnum {
    Active("active"),
    Revoked("revoked"),
    Suspended("suspended"),
    Invalidated("invalidated"),
    Issued("issued"),
    Blocked("blocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VerificationEventLifecycleState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VerificationEventLifecycleState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "revoked": return Revoked;
            case "suspended": return Suspended;
            case "invalidated": return Invalidated;
            case "issued": return Issued;
            case "blocked": return Blocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
