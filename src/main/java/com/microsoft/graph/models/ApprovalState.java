package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum ApprovalState implements ValuedEnum {
    Pending("pending"),
    Approved("approved"),
    Denied("denied"),
    Aborted("aborted"),
    Canceled("canceled");
    public final String value;
    ApprovalState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ApprovalState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "approved": return Approved;
            case "denied": return Denied;
            case "aborted": return Aborted;
            case "canceled": return Canceled;
            default: return null;
        }
    }
}
