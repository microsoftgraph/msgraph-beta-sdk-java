package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum QualityUpdateCadence implements ValuedEnum {
    Monthly("monthly"),
    OutOfBand("outOfBand"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    QualityUpdateCadence(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static QualityUpdateCadence forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "monthly": return Monthly;
            case "outOfBand": return OutOfBand;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
