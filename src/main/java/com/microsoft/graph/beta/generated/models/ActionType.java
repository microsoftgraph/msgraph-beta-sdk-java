package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActionType implements ValuedEnum {
    Tunnel("tunnel"),
    Exclude("exclude"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tunnel": return Tunnel;
            case "exclude": return Exclude;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
