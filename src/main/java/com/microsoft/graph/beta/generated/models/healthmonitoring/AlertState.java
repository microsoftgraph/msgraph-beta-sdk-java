package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AlertState implements ValuedEnum {
    Active("active"),
    Resolved("resolved"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AlertState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "resolved": return Resolved;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
