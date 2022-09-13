package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum TeamworkConnectionStatus implements ValuedEnum {
    Unknown("unknown"),
    Connected("connected"),
    Disconnected("disconnected"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkConnectionStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamworkConnectionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
