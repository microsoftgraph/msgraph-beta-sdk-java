package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApplicationKeyType implements ValuedEnum {
    ClientSecret("clientSecret"),
    Certificate("certificate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApplicationKeyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApplicationKeyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clientSecret": return ClientSecret;
            case "certificate": return Certificate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
