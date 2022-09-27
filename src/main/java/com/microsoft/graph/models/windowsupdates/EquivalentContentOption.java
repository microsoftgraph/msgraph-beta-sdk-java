package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum EquivalentContentOption implements ValuedEnum {
    None("none"),
    LatestSecurity("latestSecurity"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EquivalentContentOption(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EquivalentContentOption forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "latestSecurity": return LatestSecurity;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
