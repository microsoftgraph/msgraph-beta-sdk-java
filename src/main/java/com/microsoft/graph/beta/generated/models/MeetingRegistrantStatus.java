package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MeetingRegistrantStatus implements ValuedEnum {
    Registered("registered"),
    Canceled("canceled"),
    Processing("processing"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MeetingRegistrantStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MeetingRegistrantStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "registered": return Registered;
            case "canceled": return Canceled;
            case "processing": return Processing;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
