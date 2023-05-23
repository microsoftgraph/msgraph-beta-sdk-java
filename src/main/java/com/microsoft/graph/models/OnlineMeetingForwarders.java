package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OnlineMeetingForwarders implements ValuedEnum {
    Everyone("everyone"),
    Organizer("organizer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnlineMeetingForwarders(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnlineMeetingForwarders forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "organizer": return Organizer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
