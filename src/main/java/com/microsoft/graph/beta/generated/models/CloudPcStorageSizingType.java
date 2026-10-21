package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcStorageSizingType implements ValuedEnum {
    Dynamic("dynamic"),
    Fixed("fixed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcStorageSizingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcStorageSizingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dynamic": return Dynamic;
            case "fixed": return Fixed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
