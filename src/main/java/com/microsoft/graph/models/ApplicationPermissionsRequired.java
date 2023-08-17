package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ApplicationPermissionsRequired implements ValuedEnum {
    Unknown("unknown"),
    Anonymous("anonymous"),
    Guest("guest"),
    User("user"),
    Administrator("administrator"),
    System("system"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApplicationPermissionsRequired(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApplicationPermissionsRequired forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "anonymous": return Anonymous;
            case "guest": return Guest;
            case "user": return User;
            case "administrator": return Administrator;
            case "system": return System;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
