package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TokenProtectionStatus implements ValuedEnum {
    None("none"),
    Bound("bound"),
    Unbound("unbound"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TokenProtectionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TokenProtectionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "bound": return Bound;
            case "unbound": return Unbound;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
