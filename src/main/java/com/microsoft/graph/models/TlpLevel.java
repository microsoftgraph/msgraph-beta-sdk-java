package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TlpLevel implements ValuedEnum {
    Unknown("unknown"),
    White("white"),
    Green("green"),
    Amber("amber"),
    Red("red"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TlpLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TlpLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "white": return White;
            case "green": return Green;
            case "amber": return Amber;
            case "red": return Red;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
