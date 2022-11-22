package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum ActionAfterRetentionPeriod implements ValuedEnum {
    None("none"),
    Delete("delete"),
    StartDispositionReview("startDispositionReview"),
    Relabel("relabel"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ActionAfterRetentionPeriod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ActionAfterRetentionPeriod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "delete": return Delete;
            case "startDispositionReview": return StartDispositionReview;
            case "relabel": return Relabel;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
