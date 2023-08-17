package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of VPN client authentication type
 */
public enum VpnClientAuthenticationType implements ValuedEnum {
    /** User Authentication */
    UserAuthentication("userAuthentication"),
    /** Device Authentication */
    DeviceAuthentication("deviceAuthentication");
    public final String value;
    VpnClientAuthenticationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnClientAuthenticationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userAuthentication": return UserAuthentication;
            case "deviceAuthentication": return DeviceAuthentication;
            default: return null;
        }
    }
}
