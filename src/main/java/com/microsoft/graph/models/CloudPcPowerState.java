package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudPcPowerState implements ValuedEnum {
    Running("running"),
    PoweredOff("poweredOff"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcPowerState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcPowerState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "running": return Running;
            case "poweredOff": return PoweredOff;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
