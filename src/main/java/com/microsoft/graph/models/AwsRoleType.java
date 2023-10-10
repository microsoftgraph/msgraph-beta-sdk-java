package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AwsRoleType implements ValuedEnum {
    System("system"),
    Custom("custom"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AwsRoleType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AwsRoleType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "system": return System;
            case "custom": return Custom;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
