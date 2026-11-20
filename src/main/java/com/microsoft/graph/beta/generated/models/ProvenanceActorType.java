package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProvenanceActorType implements ValuedEnum {
    System("system"),
    User("user"),
    Application("application"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvenanceActorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProvenanceActorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "system": return System;
            case "user": return User;
            case "application": return Application;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
