package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DeviceIdEntityIdentifier implements ValuedEnum {
    DeviceId("deviceId"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceIdEntityIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceIdEntityIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceId": return DeviceId;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
