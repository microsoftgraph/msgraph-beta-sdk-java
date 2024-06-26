package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * System Update Types for Android Device Owner.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerSystemUpdateInstallType implements ValuedEnum {
    /** Device default behavior, which typically prompts the user to accept system updates. */
    DeviceDefault("deviceDefault"),
    /** Postpone automatic install of updates up to 30 days. */
    Postpone("postpone"),
    /** Install automatically inside a daily maintenance window. */
    Windowed("windowed"),
    /** Automatically install updates as soon as possible. */
    Automatic("automatic");
    public final String value;
    AndroidDeviceOwnerSystemUpdateInstallType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerSystemUpdateInstallType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceDefault": return DeviceDefault;
            case "postpone": return Postpone;
            case "windowed": return Windowed;
            case "automatic": return Automatic;
            default: return null;
        }
    }
}
