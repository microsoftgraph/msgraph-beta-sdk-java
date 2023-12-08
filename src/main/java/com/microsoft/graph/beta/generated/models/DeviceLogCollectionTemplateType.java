package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum for the template type used for collecting logs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceLogCollectionTemplateType implements ValuedEnum {
    /** Predefined template for what will be collected */
    Predefined("predefined"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceLogCollectionTemplateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceLogCollectionTemplateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "predefined": return Predefined;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
