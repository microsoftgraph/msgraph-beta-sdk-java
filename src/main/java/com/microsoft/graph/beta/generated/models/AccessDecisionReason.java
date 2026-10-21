package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The reason for a user&apos;s access decision for a service.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessDecisionReason implements ValuedEnum {
    /** The user is allowed to consume. */
    Allowed("allowed"),
    /** The user is not entitled to the service. */
    NotEntitled("notEntitled"),
    /** The applicable limit is exhausted. */
    LimitExhausted("limitExhausted"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessDecisionReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessDecisionReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allowed": return Allowed;
            case "notEntitled": return NotEntitled;
            case "limitExhausted": return LimitExhausted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
