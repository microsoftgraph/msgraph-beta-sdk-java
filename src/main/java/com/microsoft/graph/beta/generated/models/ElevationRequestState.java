package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates state of elevation request
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ElevationRequestState implements ValuedEnum {
    /** Default Value. Indicates that elevation request status is unavailable */
    None("none"),
    /** Initial state when request is submitted but no approval/denial action taken */
    Pending("pending"),
    /** Indicates elevation request has been approved by IT Admin. */
    Approved("approved"),
    /** Indicates elevation request has been denied by IT Admin. */
    Denied("denied"),
    /** Set to expire when Approved for is elapsed or ExpireDate is elapsed, whichever is sooner. */
    Expired("expired"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ElevationRequestState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ElevationRequestState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "pending": return Pending;
            case "approved": return Approved;
            case "denied": return Denied;
            case "expired": return Expired;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
