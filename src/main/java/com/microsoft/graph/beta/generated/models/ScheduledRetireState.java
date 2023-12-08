package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Cancel or confirm scheduled retire
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScheduledRetireState implements ValuedEnum {
    /** CancelRetire */
    CancelRetire("cancelRetire"),
    /** ConfirmRetire */
    ConfirmRetire("confirmRetire"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ScheduledRetireState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScheduledRetireState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cancelRetire": return CancelRetire;
            case "confirmRetire": return ConfirmRetire;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
