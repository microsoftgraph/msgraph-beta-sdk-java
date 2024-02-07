package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamworkDeviceHealthStatus implements ValuedEnum {
    Unknown("unknown"),
    Offline("offline"),
    Critical("critical"),
    NonUrgent("nonUrgent"),
    Healthy("healthy"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkDeviceHealthStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkDeviceHealthStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "offline": return Offline;
            case "critical": return Critical;
            case "nonUrgent": return NonUrgent;
            case "healthy": return Healthy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
