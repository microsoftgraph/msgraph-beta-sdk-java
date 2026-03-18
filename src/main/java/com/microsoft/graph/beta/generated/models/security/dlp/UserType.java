package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserType implements ValuedEnum {
    Regular("regular"),
    Admin("admin"),
    System("system"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "regular": return Regular;
            case "admin": return Admin;
            case "system": return System;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
