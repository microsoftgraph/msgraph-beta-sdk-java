package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Identifies the data source used to evaluate an assignment filter property.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentFilterPropertyEvaluationSource implements ValuedEnum {
    /** The property is evaluated when the device checks in. */
    DeviceCheckIn("deviceCheckIn"),
    /** The property is evaluated from device inventory. */
    DeviceInventory("deviceInventory"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AssignmentFilterPropertyEvaluationSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentFilterPropertyEvaluationSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deviceCheckIn": return DeviceCheckIn;
            case "deviceInventory": return DeviceInventory;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
