package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrincipalType implements ValuedEnum {
    EntraIdUser("entraIdUser"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrincipalType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrincipalType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "entraIdUser": return EntraIdUser;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
