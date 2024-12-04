package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HardwareOathTokenHashFunction implements ValuedEnum {
    Hmacsha1("hmacsha1"),
    Hmacsha256("hmacsha256"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HardwareOathTokenHashFunction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HardwareOathTokenHashFunction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hmacsha1": return Hmacsha1;
            case "hmacsha256": return Hmacsha256;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
