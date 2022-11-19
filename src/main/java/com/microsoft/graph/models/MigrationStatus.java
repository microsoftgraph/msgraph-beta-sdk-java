package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MigrationStatus implements ValuedEnum {
    Ready("ready"),
    NeedsReview("needsReview"),
    AdditionalStepsRequired("additionalStepsRequired"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MigrationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MigrationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ready": return Ready;
            case "needsReview": return NeedsReview;
            case "additionalStepsRequired": return AdditionalStepsRequired;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
