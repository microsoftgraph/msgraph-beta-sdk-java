package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerApprovalStatus implements ValuedEnum {
    Requested("requested"),
    Approved("approved"),
    Rejected("rejected"),
    Cancelled("cancelled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerApprovalStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerApprovalStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "requested": return Requested;
            case "approved": return Approved;
            case "rejected": return Rejected;
            case "cancelled": return Cancelled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
