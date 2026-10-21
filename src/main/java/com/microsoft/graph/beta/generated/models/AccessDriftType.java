package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessDriftType implements ValuedEnum {
    Unauthorized("unauthorized"),
    Missing("missing"),
    InSync("inSync"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessDriftType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessDriftType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unauthorized": return Unauthorized;
            case "missing": return Missing;
            case "inSync": return InSync;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
