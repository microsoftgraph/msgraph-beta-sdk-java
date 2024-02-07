package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnlineMeetingForwarders implements ValuedEnum {
    Everyone("everyone"),
    Organizer("organizer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnlineMeetingForwarders(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnlineMeetingForwarders forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "organizer": return Organizer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
