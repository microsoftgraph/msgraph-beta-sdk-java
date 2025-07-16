package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppInfoHolding implements ValuedEnum {
    Private("private"),
    Public("public"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppInfoHolding(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppInfoHolding forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "private": return Private;
            case "public": return Public;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
