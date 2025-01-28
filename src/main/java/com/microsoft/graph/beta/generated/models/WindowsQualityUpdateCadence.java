package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The publishing cadence of the quality update. Possible values are: monthly, outOfBand. This property cannot be modified and is automatically populated when the catalog is created.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsQualityUpdateCadence implements ValuedEnum {
    /** Default. Indicates the quality update is released in a regular monthly pattern. */
    Monthly("monthly"),
    /** Indicates the quality update is released in an out-of-band pattern. */
    OutOfBand("outOfBand"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsQualityUpdateCadence(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsQualityUpdateCadence forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "monthly": return Monthly;
            case "outOfBand": return OutOfBand;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
