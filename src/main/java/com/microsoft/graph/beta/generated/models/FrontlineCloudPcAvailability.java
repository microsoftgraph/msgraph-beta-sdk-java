package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FrontlineCloudPcAvailability implements ValuedEnum {
    NotApplicable("notApplicable"),
    Available("available"),
    NotAvailable("notAvailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FrontlineCloudPcAvailability(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FrontlineCloudPcAvailability forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notApplicable": return NotApplicable;
            case "available": return Available;
            case "notAvailable": return NotAvailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
