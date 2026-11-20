package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies how Resource Authorization Server scopes resolve to an Entra OAuth2 permission.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IdJagScopeMappingType implements ValuedEnum {
    Direct("direct"),
    Mapped("mapped"),
    Passthrough("passthrough"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IdJagScopeMappingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IdJagScopeMappingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "direct": return Direct;
            case "mapped": return Mapped;
            case "passthrough": return Passthrough;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
