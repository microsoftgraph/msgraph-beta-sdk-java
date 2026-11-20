package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Desired state of a governed service within a spending policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServiceSettingState implements ValuedEnum {
    /** The service is governed by the policy. */
    Enabled("enabled"),
    /** The service is excluded from the policy. */
    Disabled("disabled"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServiceSettingState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceSettingState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
