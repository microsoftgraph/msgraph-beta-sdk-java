package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConnectionStatus implements ValuedEnum {
    Open("open"),
    Active("active"),
    Closed("closed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "active": return Active;
            case "closed": return Closed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
