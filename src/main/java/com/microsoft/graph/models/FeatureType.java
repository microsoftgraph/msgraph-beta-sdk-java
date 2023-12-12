package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FeatureType implements ValuedEnum {
    Registration("registration"),
    Reset("reset"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FeatureType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FeatureType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "registration": return Registration;
            case "reset": return Reset;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
