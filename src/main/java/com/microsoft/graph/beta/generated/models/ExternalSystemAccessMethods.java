package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExternalSystemAccessMethods implements ValuedEnum {
    Direct("direct"),
    RoleChaining("roleChaining"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExternalSystemAccessMethods(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExternalSystemAccessMethods forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "direct": return Direct;
            case "roleChaining": return RoleChaining;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
