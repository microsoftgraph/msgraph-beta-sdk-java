package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityAlertSeverity implements ValuedEnum {
    Informational("informational"),
    High("high"),
    Medium("medium"),
    Low("low"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SecurityAlertSeverity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityAlertSeverity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "informational": return Informational;
            case "high": return High;
            case "medium": return Medium;
            case "low": return Low;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
