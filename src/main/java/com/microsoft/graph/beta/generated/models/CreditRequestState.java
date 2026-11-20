package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The state of a credit request in the approval workflow.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreditRequestState implements ValuedEnum {
    /** The request is awaiting an administrator decision. */
    Pending("pending"),
    /** The request has been approved by an administrator. */
    Approved("approved"),
    /** The request has been rejected by an administrator. */
    Rejected("rejected"),
    /** The request was cancelled by the system or the requester. Read-only historical state. */
    Cancelled("cancelled"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CreditRequestState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreditRequestState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "approved": return Approved;
            case "rejected": return Rejected;
            case "cancelled": return Cancelled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
