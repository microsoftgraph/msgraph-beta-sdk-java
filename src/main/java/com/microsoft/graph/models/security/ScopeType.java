package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
