package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudPcConnectivityStatus implements ValuedEnum {
    Unknown("unknown"),
    Available("available"),
    AvailableWithWarning("availableWithWarning"),
    Unavailable("unavailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcConnectivityStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcConnectivityStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "available": return Available;
            case "availableWithWarning": return AvailableWithWarning;
            case "unavailable": return Unavailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
