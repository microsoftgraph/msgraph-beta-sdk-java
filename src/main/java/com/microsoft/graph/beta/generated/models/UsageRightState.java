package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UsageRightState implements ValuedEnum {
    Active("active"),
    Inactive("inactive"),
    Warning("warning"),
    Suspended("suspended"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UsageRightState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UsageRightState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "inactive": return Inactive;
            case "warning": return Warning;
            case "suspended": return Suspended;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
