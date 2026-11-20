package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChainState implements ValuedEnum {
    Intact("intact"),
    Broken("broken"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChainState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChainState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "intact": return Intact;
            case "broken": return Broken;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
