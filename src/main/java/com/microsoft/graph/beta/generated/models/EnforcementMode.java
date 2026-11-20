package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnforcementMode implements ValuedEnum {
    DoNotEnforce("doNotEnforce"),
    Enforce("enforce"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnforcementMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnforcementMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "doNotEnforce": return DoNotEnforce;
            case "enforce": return Enforce;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
