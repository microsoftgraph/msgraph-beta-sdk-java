package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ReadinessStatus implements ValuedEnum {
    NotReady("notReady"),
    Ready("ready"),
    Failed("failed"),
    Disabled("disabled"),
    Expired("expired"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ReadinessStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ReadinessStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notReady": return NotReady;
            case "ready": return Ready;
            case "failed": return Failed;
            case "disabled": return Disabled;
            case "expired": return Expired;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
