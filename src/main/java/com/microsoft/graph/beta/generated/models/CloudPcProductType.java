package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcProductType implements ValuedEnum {
    Enterprise("enterprise"),
    Frontline("frontline"),
    DevBox("devBox"),
    PowerAutomate("powerAutomate"),
    Business("business"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcProductType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcProductType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enterprise": return Enterprise;
            case "frontline": return Frontline;
            case "devBox": return DevBox;
            case "powerAutomate": return PowerAutomate;
            case "business": return Business;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
