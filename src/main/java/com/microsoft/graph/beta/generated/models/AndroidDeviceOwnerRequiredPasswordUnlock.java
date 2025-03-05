package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum representing possible values for required password unlock.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerRequiredPasswordUnlock implements ValuedEnum {
    /** Timeout period before strong authentication is required is set to the device&apos;s default. */
    DeviceDefault("deviceDefault"),
    /** Timeout period before strong authentication is required is set to 24 hours. */
    Daily("daily"),
    /** Unknown future value (reserved, not used right now) */
    UnkownFutureValue("unkownFutureValue");
    public final String value;
    AndroidDeviceOwnerRequiredPasswordUnlock(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerRequiredPasswordUnlock forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "daily": return Daily;
            case "unkownFutureValue": return UnkownFutureValue;
            default: return null;
        }
    }
}
