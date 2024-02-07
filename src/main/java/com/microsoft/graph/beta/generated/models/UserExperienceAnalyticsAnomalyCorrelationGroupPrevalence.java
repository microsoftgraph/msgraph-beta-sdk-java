package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the level of prevalence of the correlation group features in the anomaly. Possible values are: high, medium or low
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserExperienceAnalyticsAnomalyCorrelationGroupPrevalence implements ValuedEnum {
    /** Indicates that we have a high prevalence in the correlation between the anomaly and correlation group. */
    High("high"),
    /** Indicates that we have a medium prevalence in the correlation between the anomaly and correlation group. */
    Medium("medium"),
    /** Indicates that we have a low prevalence in the correlation between the anomaly and correlation group. */
    Low("low"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsAnomalyCorrelationGroupPrevalence(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserExperienceAnalyticsAnomalyCorrelationGroupPrevalence forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "high": return High;
            case "medium": return Medium;
            case "low": return Low;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
