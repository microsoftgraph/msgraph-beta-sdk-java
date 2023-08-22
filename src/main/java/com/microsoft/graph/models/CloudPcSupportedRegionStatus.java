package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcSupportedRegionStatus implements ValuedEnum {
    Available("available"),
    Restricted("restricted"),
    Unavailable("unavailable"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcSupportedRegionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcSupportedRegionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "available": return Available;
            case "restricted": return Restricted;
            case "unavailable": return Unavailable;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
