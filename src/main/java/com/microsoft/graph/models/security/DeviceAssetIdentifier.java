package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DeviceAssetIdentifier implements ValuedEnum {
    DeviceId("deviceId"),
    DeviceName("deviceName"),
    RemoteDeviceName("remoteDeviceName"),
    TargetDeviceName("targetDeviceName"),
    DestinationDeviceName("destinationDeviceName"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceAssetIdentifier(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceAssetIdentifier forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceId": return DeviceId;
            case "deviceName": return DeviceName;
            case "remoteDeviceName": return RemoteDeviceName;
            case "targetDeviceName": return TargetDeviceName;
            case "destinationDeviceName": return DestinationDeviceName;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
