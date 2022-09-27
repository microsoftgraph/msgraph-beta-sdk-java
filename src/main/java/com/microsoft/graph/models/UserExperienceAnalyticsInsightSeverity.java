package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum UserExperienceAnalyticsInsightSeverity implements ValuedEnum {
    None("none"),
    Informational("informational"),
    Warning("warning"),
    Error("error");
    public final String value;
    UserExperienceAnalyticsInsightSeverity(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserExperienceAnalyticsInsightSeverity forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "informational": return Informational;
            case "warning": return Warning;
            case "error": return Error;
            default: return null;
        }
    }
}
