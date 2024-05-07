package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityAlertResolvedReason implements ValuedEnum {
    Legitimate("legitimate"),
    Ignore("ignore"),
    Fraud("fraud"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SecurityAlertResolvedReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityAlertResolvedReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "legitimate": return Legitimate;
            case "ignore": return Ignore;
            case "fraud": return Fraud;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
