package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthorizationSystemActionType implements ValuedEnum {
    Delete("delete"),
    Read("read"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthorizationSystemActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthorizationSystemActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "delete": return Delete;
            case "read": return Read;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
