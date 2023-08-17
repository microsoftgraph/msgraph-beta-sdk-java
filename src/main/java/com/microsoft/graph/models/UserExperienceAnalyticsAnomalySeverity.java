package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other.
 */
public enum UserExperienceAnalyticsAnomalySeverity implements ValuedEnum {
    /** Indicates the anomaly is of high severity. */
    High("high"),
    /** Indicates the anomaly is of medium severity. */
    Medium("medium"),
    /** Indicates the anomaly is of low severity. */
    Low("low"),
    /** Indicates the anomaly is of informational severity. */
    Informational("informational"),
    /** Indicates the severity of anomaly is undefined. */
    Other("other"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsAnomalySeverity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserExperienceAnalyticsAnomalySeverity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "high": return High;
            case "medium": return Medium;
            case "low": return Low;
            case "informational": return Informational;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
