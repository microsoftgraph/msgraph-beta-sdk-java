package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceAssetIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
