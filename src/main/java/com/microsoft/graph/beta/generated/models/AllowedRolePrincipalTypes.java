package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AllowedRolePrincipalTypes implements ValuedEnum {
    User("user"),
    ServicePrincipal("servicePrincipal"),
    Group("group"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AllowedRolePrincipalTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AllowedRolePrincipalTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "servicePrincipal": return ServicePrincipal;
            case "group": return Group;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
