package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityRequirementState implements ValuedEnum {
    Active("active"),
    Preview("preview"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SecurityRequirementState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityRequirementState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "preview": return Preview;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
