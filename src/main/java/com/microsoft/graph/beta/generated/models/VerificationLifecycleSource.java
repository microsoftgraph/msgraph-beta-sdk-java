package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VerificationLifecycleSource implements ValuedEnum {
    Entra("entra"),
    AdminOverride("adminOverride"),
    ApiOverride("apiOverride"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VerificationLifecycleSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VerificationLifecycleSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "entra": return Entra;
            case "adminOverride": return AdminOverride;
            case "apiOverride": return ApiOverride;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
