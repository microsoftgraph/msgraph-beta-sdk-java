package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ServicePrincipalLockScope implements ValuedEnum {
    NotConfigured("notConfigured"),
    ForeignTenantOnly("foreignTenantOnly"),
    Everywhere("everywhere"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ServicePrincipalLockScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServicePrincipalLockScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "foreignTenantOnly": return ForeignTenantOnly;
            case "everywhere": return Everywhere;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
