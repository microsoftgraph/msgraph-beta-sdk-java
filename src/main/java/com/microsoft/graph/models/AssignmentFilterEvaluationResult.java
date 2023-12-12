package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported evaluation results for filter.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentFilterEvaluationResult implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Match. */
    Match("match"),
    /** NotMatch. */
    NotMatch("notMatch"),
    /** Inconclusive. */
    Inconclusive("inconclusive"),
    /** Failure. */
    Failure("failure"),
    /** NotEvaluated. */
    NotEvaluated("notEvaluated");
    public final String value;
    AssignmentFilterEvaluationResult(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentFilterEvaluationResult forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "match": return Match;
            case "notMatch": return NotMatch;
            case "inconclusive": return Inconclusive;
            case "failure": return Failure;
            case "notEvaluated": return NotEvaluated;
            default: return null;
        }
    }
}
