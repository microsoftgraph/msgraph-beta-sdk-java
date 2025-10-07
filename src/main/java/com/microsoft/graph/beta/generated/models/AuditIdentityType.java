package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuditIdentityType implements ValuedEnum {
    Agent("agent"),
    ServicePrincipal("servicePrincipal"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuditIdentityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuditIdentityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "agent": return Agent;
            case "servicePrincipal": return ServicePrincipal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
