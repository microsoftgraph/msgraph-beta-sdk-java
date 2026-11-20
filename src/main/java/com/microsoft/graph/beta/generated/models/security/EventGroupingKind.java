package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EventGroupingKind implements ValuedEnum {
    AlertPerEvent("alertPerEvent"),
    SingleAlert("singleAlert"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EventGroupingKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EventGroupingKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alertPerEvent": return AlertPerEvent;
            case "singleAlert": return SingleAlert;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
