package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApplicationKeyUsage implements ValuedEnum {
    Sign("sign"),
    Verify("verify"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApplicationKeyUsage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApplicationKeyUsage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sign": return Sign;
            case "verify": return Verify;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
