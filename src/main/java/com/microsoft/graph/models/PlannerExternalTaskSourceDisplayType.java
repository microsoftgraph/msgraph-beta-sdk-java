package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum PlannerExternalTaskSourceDisplayType implements ValuedEnum {
    None("none"),
    Default_escaped("default_escaped"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerExternalTaskSourceDisplayType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerExternalTaskSourceDisplayType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "default": return Default_escaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
