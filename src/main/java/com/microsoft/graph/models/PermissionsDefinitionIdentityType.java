package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PermissionsDefinitionIdentityType implements ValuedEnum {
    User("user"),
    Role("role"),
    Application("application"),
    ManagedIdentity("managedIdentity"),
    ServiceAccount("serviceAccount"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PermissionsDefinitionIdentityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PermissionsDefinitionIdentityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "role": return Role;
            case "application": return Application;
            case "managedIdentity": return ManagedIdentity;
            case "serviceAccount": return ServiceAccount;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
