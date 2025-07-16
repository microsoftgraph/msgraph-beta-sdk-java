package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamworkConnectionStatus implements ValuedEnum {
    Unknown("unknown"),
    Connected("connected"),
    Disconnected("disconnected"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkConnectionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkConnectionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "connected": return Connected;
            case "disconnected": return Disconnected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
