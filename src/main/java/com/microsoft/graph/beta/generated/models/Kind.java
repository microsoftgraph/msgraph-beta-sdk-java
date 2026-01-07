package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Kind implements ValuedEnum {
    Unrestricted("unrestricted"),
    AllowedTenants("allowedTenants"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Kind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Kind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unrestricted": return Unrestricted;
            case "allowedTenants": return AllowedTenants;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
