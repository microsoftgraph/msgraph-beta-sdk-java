package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum SafeguardCategory implements ValuedEnum {
    LikelyIssues("likelyIssues"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SafeguardCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SafeguardCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "likelyIssues": return LikelyIssues;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
