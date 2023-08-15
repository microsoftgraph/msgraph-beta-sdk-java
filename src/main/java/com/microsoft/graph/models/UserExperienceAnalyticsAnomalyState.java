package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other.
 */
public enum UserExperienceAnalyticsAnomalyState implements ValuedEnum {
    /** Indicates the state of anomaly is new. */
    New("new"),
    /** Indicates the state of anomaly is active. */
    Active("active"),
    /** Indicates the state of anomaly is disabled. */
    Disabled("disabled"),
    /** Indicates the state of anomaly is removed. */
    Removed("removed"),
    /** Indicates the state of anomaly is undefined. */
    Other("other"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsAnomalyState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserExperienceAnalyticsAnomalyState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "new": return New;
            case "active": return Active;
            case "disabled": return Disabled;
            case "removed": return Removed;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
