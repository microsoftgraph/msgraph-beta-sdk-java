package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityAlertStatus implements ValuedEnum {
    Active("active"),
    Resolved("resolved"),
    Investigating("investigating"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SecurityAlertStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityAlertStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "resolved": return Resolved;
            case "investigating": return Investigating;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
