package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MicrosoftTunnelLogCollectionStatus implements ValuedEnum {
    /** Indicates that the log collection is in progress */
    Pending("pending"),
    /** Indicates that the log collection is completed */
    Completed("completed"),
    /** Indicates that the log collection has failed */
    Failed("failed"),
    /** Placeholder value for future expansion enums */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MicrosoftTunnelLogCollectionStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftTunnelLogCollectionStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "completed": return Completed;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
