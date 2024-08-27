package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApprovalItemState implements ValuedEnum {
    Canceled("canceled"),
    Created("created"),
    Pending("pending"),
    Completed("completed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApprovalItemState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApprovalItemState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "canceled": return Canceled;
            case "created": return Created;
            case "pending": return Pending;
            case "completed": return Completed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
