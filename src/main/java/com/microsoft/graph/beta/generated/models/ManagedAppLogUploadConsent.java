package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the current consent status of the associated `managedAppLogCollectionRequest`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagedAppLogUploadConsent implements ValuedEnum {
    /** Default. Indicates app log consent state is 'Unknown'. This state is automatically assigned at request creation time and is updated when the log collection completes. */
    Unknown("unknown"),
    /** The User has Declined the Log Collection Request. The Log collection and uploads will not be initiated/triggered, and the log collection request will be abandoned. */
    Declined("declined"),
    /** The User has Accepted the Log Collection Request. The log collection and upload will be initiated. */
    Accepted("accepted"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagedAppLogUploadConsent(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagedAppLogUploadConsent forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "declined": return Declined;
            case "accepted": return Accepted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
