package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MlClassificationMatchTolerance implements ValuedEnum {
    Exact("exact"),
    Near("near");
    public final String value;
    MlClassificationMatchTolerance(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MlClassificationMatchTolerance forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "exact": return Exact;
            case "near": return Near;
            default: return null;
        }
    }
}
