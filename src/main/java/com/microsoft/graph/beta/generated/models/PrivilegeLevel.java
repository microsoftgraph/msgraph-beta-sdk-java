package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrivilegeLevel implements ValuedEnum {
    Standard("standard"),
    Privileged("privileged"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrivilegeLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrivilegeLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "privileged": return Privileged;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
