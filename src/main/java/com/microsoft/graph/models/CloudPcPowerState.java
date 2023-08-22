package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcPowerState implements ValuedEnum {
    Running("running"),
    PoweredOff("poweredOff"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcPowerState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcPowerState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "running": return Running;
            case "poweredOff": return PoweredOff;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
