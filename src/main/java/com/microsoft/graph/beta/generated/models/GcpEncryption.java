package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GcpEncryption implements ValuedEnum {
    Google("google"),
    Customer("customer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GcpEncryption(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GcpEncryption forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "google": return Google;
            case "customer": return Customer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
