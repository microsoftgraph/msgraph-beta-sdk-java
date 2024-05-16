package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the current status of the associated `managedAppLogCollectionRequest`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppLogUploadState implements ValuedEnum {
    /** Default. The log upload request has been successfully created, and is pending delivery to the Mobile Application Management (MAM) application. */
    Pending("pending"),
    /** One or more log upload components have uploaded their logs. */
    InProgress("inProgress"),
    /** All log upload successfully components have uploaded their logs. */
    Completed("completed"),
    /** The log upload request was declined by the user on the device. */
    DeclinedByUser("declinedByUser"),
    /** The log upload request was not acknowledged by the user within the allowed time window. */
    TimedOut("timedOut"),
    /** The log upload request encountered an error. */
    Failed("failed"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagedAppLogUploadState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppLogUploadState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pending": return Pending;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "declinedByUser": return DeclinedByUser;
            case "timedOut": return TimedOut;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
