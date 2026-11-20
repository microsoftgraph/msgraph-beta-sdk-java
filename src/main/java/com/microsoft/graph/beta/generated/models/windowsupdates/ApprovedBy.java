package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApprovedBy implements ValuedEnum {
    System("system"),
    User("user"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApprovedBy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApprovedBy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "system": return System;
            case "user": return User;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
