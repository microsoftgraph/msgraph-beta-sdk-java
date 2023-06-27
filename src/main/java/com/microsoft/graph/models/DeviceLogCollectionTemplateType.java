package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum for the template type used for collecting logs
 */
public enum DeviceLogCollectionTemplateType implements ValuedEnum {
    /** Predefined template for what will be collected */
    Predefined("predefined"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceLogCollectionTemplateType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceLogCollectionTemplateType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "predefined": return Predefined;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
