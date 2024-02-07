package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrintDuplexConfiguration implements ValuedEnum {
    TwoSidedLongEdge("twoSidedLongEdge"),
    TwoSidedShortEdge("twoSidedShortEdge"),
    OneSided("oneSided");
    public final String value;
    PrintDuplexConfiguration(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrintDuplexConfiguration forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "twoSidedLongEdge": return TwoSidedLongEdge;
            case "twoSidedShortEdge": return TwoSidedShortEdge;
            case "oneSided": return OneSided;
            default: return null;
        }
    }
}
