package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthorizationSystemType implements ValuedEnum {
    Azure("azure"),
    Gcp("gcp"),
    Aws("aws"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthorizationSystemType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthorizationSystemType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azure": return Azure;
            case "gcp": return Gcp;
            case "aws": return Aws;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
