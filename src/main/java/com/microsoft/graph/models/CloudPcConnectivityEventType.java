package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudPcConnectivityEventType implements ValuedEnum {
    Unknown("unknown"),
    UserConnection("userConnection"),
    UserTroubleshooting("userTroubleshooting"),
    DeviceHealthCheck("deviceHealthCheck"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcConnectivityEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcConnectivityEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "userConnection": return UserConnection;
            case "userTroubleshooting": return UserTroubleshooting;
            case "deviceHealthCheck": return DeviceHealthCheck;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
