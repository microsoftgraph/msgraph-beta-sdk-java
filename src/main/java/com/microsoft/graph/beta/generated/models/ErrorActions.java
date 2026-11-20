package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ErrorActions implements ValuedEnum {
    None("none"),
    Audit("audit"),
    Block("block"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ErrorActions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ErrorActions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "audit": return Audit;
            case "block": return Block;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
