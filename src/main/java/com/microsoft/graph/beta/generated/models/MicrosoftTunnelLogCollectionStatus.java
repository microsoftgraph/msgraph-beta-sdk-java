package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum type that represent the status of log collection
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MicrosoftTunnelLogCollectionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
