package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectivityState implements ValuedEnum {
    Pending("pending"),
    Connected("connected"),
    Inactive("inactive"),
    Error("error"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectivityState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ConnectivityState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "connected": return Connected;
            case "inactive": return Inactive;
            case "error": return Error;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
