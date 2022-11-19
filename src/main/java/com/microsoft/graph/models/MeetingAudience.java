package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the commsApplication singleton. */
public enum MeetingAudience implements ValuedEnum {
    Everyone("everyone"),
    Organization("organization"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MeetingAudience(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MeetingAudience forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "organization": return Organization;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
