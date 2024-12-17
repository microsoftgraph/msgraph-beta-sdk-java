package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppInfoPciDssVersion implements ValuedEnum {
    V1("v1"),
    V2("v2"),
    V3("v3"),
    V3_1("v3_1"),
    V3_2("v3_2"),
    V3_2_1("v3_2_1"),
    NotSupported("notSupported"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue"),
    V4("v4");
    public final String value;
    AppInfoPciDssVersion(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppInfoPciDssVersion forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "v1": return V1;
            case "v2": return V2;
            case "v3": return V3;
            case "v3_1": return V3_1;
            case "v3_2": return V3_2;
            case "v3_2_1": return V3_2_1;
            case "notSupported": return NotSupported;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            case "v4": return V4;
            default: return null;
        }
    }
}
