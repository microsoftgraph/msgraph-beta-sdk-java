package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserExperienceAnalyticsAnomalyType implements ValuedEnum {
    /** Indicates the detected anomaly is due to certain devices. */
    Device("device"),
    /** Indicates the detected anomaly is due to a specific application. */
    Application("application"),
    /** Indicates the detected anomaly is due to a specific stop error. */
    StopError("stopError"),
    /** Indicates the detected anomaly is due to a specific driver. */
    Driver("driver"),
    /** Indicates the category of detected anomaly is undefined. */
    Other("other"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsAnomalyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserExperienceAnalyticsAnomalyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "device": return Device;
            case "application": return Application;
            case "stopError": return StopError;
            case "driver": return Driver;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
