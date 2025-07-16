package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NonAdminSetting implements ValuedEnum {
    False("false"),
    True("true"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NonAdminSetting(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NonAdminSetting forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "false": return False;
            case "true": return True;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
