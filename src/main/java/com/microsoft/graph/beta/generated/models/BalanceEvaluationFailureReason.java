package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The reason a service&apos;s balance could not be evaluated for the user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BalanceEvaluationFailureReason implements ValuedEnum {
    /** The service could not resolve the spending policy, so no authoritative balance or accessdecision could be produced. */
    UpstreamFailure("upstreamFailure"),
    /** No spending policy governs this service for this user, so there is no balance to report.Retrying does not change this until a policy is created for the service, or the user isbrought into an existing policy&apos;s scope. */
    NoApplicablePolicy("noApplicablePolicy"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BalanceEvaluationFailureReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BalanceEvaluationFailureReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "upstreamFailure": return UpstreamFailure;
            case "noApplicablePolicy": return NoApplicablePolicy;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
