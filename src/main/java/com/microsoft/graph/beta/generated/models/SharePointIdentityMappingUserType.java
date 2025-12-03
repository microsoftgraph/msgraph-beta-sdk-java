package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SharePointIdentityMappingUserType implements ValuedEnum {
    None("none"),
    RegularUser("regularUser"),
    AdminUser("adminUser"),
    GuestUser("guestUser"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SharePointIdentityMappingUserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SharePointIdentityMappingUserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "regularUser": return RegularUser;
            case "adminUser": return AdminUser;
            case "guestUser": return GuestUser;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
