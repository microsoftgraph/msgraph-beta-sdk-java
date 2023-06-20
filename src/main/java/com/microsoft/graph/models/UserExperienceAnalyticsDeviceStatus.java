package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Indicates the status of the device in the correlation group. Eg: Device status can be anomalous, affected, at risk. */
public enum UserExperienceAnalyticsDeviceStatus implements ValuedEnum {
    /** Indicates the the device is part of the anomaly. */
    Anomalous("anomalous"),
    /** Indicates the device is affected by the anomaly and is part of the correlation group. */
    Affected("affected"),
    /** Indicates the device is not part of the anomaly but is part of the correlation group. */
    AtRisk("atRisk"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsDeviceStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UserExperienceAnalyticsDeviceStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "anomalous": return Anomalous;
            case "affected": return Affected;
            case "atRisk": return AtRisk;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
