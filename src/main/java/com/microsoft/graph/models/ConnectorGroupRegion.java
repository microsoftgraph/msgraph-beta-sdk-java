package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConnectorGroupRegion implements ValuedEnum {
    Nam("nam"),
    Eur("eur"),
    Aus("aus"),
    Asia("asia"),
    Ind("ind"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectorGroupRegion(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectorGroupRegion forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "nam": return Nam;
            case "eur": return Eur;
            case "aus": return Aus;
            case "asia": return Asia;
            case "ind": return Ind;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
