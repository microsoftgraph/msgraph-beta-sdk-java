package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PerUserMfaState implements ValuedEnum {
    Disabled("disabled"),
    Enforced("enforced"),
    Enabled("enabled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PerUserMfaState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PerUserMfaState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "enforced": return Enforced;
            case "enabled": return Enabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
