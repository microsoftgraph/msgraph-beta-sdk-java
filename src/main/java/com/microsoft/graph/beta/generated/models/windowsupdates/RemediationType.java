package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RemediationType implements ValuedEnum {
    InPlaceUpgrade("inPlaceUpgrade"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RemediationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RemediationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inPlaceUpgrade": return InPlaceUpgrade;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
