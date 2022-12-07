package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum PlannerCreationSourceKind implements ValuedEnum {
    None("none"),
    External("external"),
    Publication("publication"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerCreationSourceKind(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerCreationSourceKind forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "external": return External;
            case "publication": return Publication;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
