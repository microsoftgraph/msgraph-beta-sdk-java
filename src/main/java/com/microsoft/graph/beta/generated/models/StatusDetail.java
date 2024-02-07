package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum StatusDetail implements ValuedEnum {
    Submitted("submitted"),
    Approved("approved"),
    Completed("completed"),
    Canceled("canceled"),
    Rejected("rejected"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    StatusDetail(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static StatusDetail forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "submitted": return Submitted;
            case "approved": return Approved;
            case "completed": return Completed;
            case "canceled": return Canceled;
            case "rejected": return Rejected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
