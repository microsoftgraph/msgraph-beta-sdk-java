package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConnectionType implements ValuedEnum {
    WebSocket("webSocket"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "webSocket": return WebSocket;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
