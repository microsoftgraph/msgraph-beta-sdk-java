package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnlineMeetingRole implements ValuedEnum {
    Attendee("attendee"),
    Presenter("presenter"),
    Producer("producer"),
    UnknownFutureValue("unknownFutureValue"),
    Coorganizer("coorganizer");
    public final String value;
    OnlineMeetingRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnlineMeetingRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "attendee": return Attendee;
            case "presenter": return Presenter;
            case "producer": return Producer;
            case "unknownFutureValue": return UnknownFutureValue;
            case "coorganizer": return Coorganizer;
            default: return null;
        }
    }
}
