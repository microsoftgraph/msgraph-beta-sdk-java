package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the channel used to deploy the configuration profile. Available choices are DeviceChannel, UserChannel
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppleDeploymentChannel implements ValuedEnum {
    /** Send payload down over Device Channel. */
    DeviceChannel("deviceChannel"),
    /** Send payload down over User Channel. */
    UserChannel("userChannel"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppleDeploymentChannel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppleDeploymentChannel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceChannel": return DeviceChannel;
            case "userChannel": return UserChannel;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
