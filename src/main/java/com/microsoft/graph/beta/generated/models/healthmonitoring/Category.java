package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Category implements ValuedEnum {
    Unknown("unknown"),
    Authentication("authentication"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Category(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Category forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "authentication": return Authentication;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
