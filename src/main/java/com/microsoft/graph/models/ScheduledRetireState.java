package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the setScheduledRetireState method. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ScheduledRetireState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cancelRetire": return CancelRetire;
            case "confirmRetire": return ConfirmRetire;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
