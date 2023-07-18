package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ApplicationKeyType implements ValuedEnum {
    ClientSecret("clientSecret"),
    Certificate("certificate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApplicationKeyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ApplicationKeyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clientSecret": return ClientSecret;
            case "certificate": return Certificate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
