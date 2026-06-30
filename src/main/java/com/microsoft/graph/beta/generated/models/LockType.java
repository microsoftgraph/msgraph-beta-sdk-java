package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LockType implements ValuedEnum {
    None("none"),
    Exclusive("exclusive"),
    Shared("shared"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LockType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LockType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "exclusive": return Exclusive;
            case "shared": return Shared;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
