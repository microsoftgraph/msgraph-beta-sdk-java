package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChangeItemState implements ValuedEnum {
    Available("available"),
    ComingSoon("comingSoon"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ChangeItemState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChangeItemState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "comingSoon": return ComingSoon;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
