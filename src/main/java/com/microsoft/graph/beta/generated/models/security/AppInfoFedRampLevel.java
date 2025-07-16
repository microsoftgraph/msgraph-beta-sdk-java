package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppInfoFedRampLevel implements ValuedEnum {
    High("high"),
    Moderate("moderate"),
    Low("low"),
    LiSaaS("liSaaS"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue"),
    NotSupported("notSupported");
    public final String value;
    AppInfoFedRampLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppInfoFedRampLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "high": return High;
            case "moderate": return Moderate;
            case "low": return Low;
            case "liSaaS": return LiSaaS;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            case "notSupported": return NotSupported;
            default: return null;
        }
    }
}
