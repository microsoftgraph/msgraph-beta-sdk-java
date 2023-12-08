package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScopeType implements ValuedEnum {
    DeviceGroup("deviceGroup"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceGroup": return DeviceGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
