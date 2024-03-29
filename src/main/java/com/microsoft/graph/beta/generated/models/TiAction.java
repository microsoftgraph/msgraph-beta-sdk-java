package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TiAction implements ValuedEnum {
    Unknown("unknown"),
    Allow("allow"),
    Block("block"),
    Alert("alert"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TiAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TiAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "allow": return Allow;
            case "block": return Block;
            case "alert": return Alert;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
