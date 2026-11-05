package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceServiceState implements ValuedEnum {
    Unknown("unknown"),
    Pending("pending"),
    Offering("offering"),
    OnHold("onHold"),
    Cancelled("cancelled"),
    NotOffering("notOffering"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceServiceState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceServiceState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "pending": return Pending;
            case "offering": return Offering;
            case "onHold": return OnHold;
            case "cancelled": return Cancelled;
            case "notOffering": return NotOffering;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
