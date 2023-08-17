package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudPcServicePlanType implements ValuedEnum {
    Enterprise("enterprise"),
    Business("business"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcServicePlanType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcServicePlanType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enterprise": return Enterprise;
            case "business": return Business;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
