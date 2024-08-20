package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkplaceSensorEventType implements ValuedEnum {
    BadgeIn("badgeIn"),
    BadgeOut("badgeOut"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkplaceSensorEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkplaceSensorEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "badgeIn": return BadgeIn;
            case "badgeOut": return BadgeOut;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
