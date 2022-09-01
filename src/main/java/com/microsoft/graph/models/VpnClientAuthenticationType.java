package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum VpnClientAuthenticationType implements ValuedEnum {
    /** User Authentication */
    UserAuthentication("userAuthentication"),
    /** Device Authentication */
    DeviceAuthentication("deviceAuthentication");
    public final String value;
    VpnClientAuthenticationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnClientAuthenticationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userAuthentication": return UserAuthentication;
            case "deviceAuthentication": return DeviceAuthentication;
            default: return null;
        }
    }
}
