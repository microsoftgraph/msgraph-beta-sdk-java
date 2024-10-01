package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Scenario implements ValuedEnum {
    Unknown("unknown"),
    Mfa("mfa"),
    Devices("devices"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Scenario(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Scenario forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "mfa": return Mfa;
            case "devices": return Devices;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
