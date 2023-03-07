package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Models and Manufactures meatadata for managed devices in the account */
public enum WarrantyType implements ValuedEnum {
    /** Unknown warranty type */
    Unknown("unknown"),
    /** Manufacturer warranty */
    Manufacturer("manufacturer"),
    /** Contractual warranty */
    Contractual("contractual"),
    /** Unknown future value */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WarrantyType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WarrantyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "manufacturer": return Manufacturer;
            case "contractual": return Contractual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
