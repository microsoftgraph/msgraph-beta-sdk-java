package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IsolationType implements ValuedEnum {
    Full("full"),
    Selective("selective"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IsolationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IsolationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "full": return Full;
            case "selective": return Selective;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
