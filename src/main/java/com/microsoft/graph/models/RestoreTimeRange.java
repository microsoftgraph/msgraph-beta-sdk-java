package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RestoreTimeRange implements ValuedEnum {
    Before("before"),
    After("after"),
    BeforeOrAfter("beforeOrAfter"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RestoreTimeRange(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RestoreTimeRange forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "before": return Before;
            case "after": return After;
            case "beforeOrAfter": return BeforeOrAfter;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
