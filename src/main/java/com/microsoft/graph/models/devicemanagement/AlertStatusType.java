package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AlertStatusType implements ValuedEnum {
    Active("active"),
    Resolved("resolved"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AlertStatusType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertStatusType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "resolved": return Resolved;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
