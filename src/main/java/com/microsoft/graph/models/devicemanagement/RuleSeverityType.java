package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum RuleSeverityType implements ValuedEnum {
    Unknown("unknown"),
    Informational("informational"),
    Warning("warning"),
    Critical("critical"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RuleSeverityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RuleSeverityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "informational": return Informational;
            case "warning": return Warning;
            case "critical": return Critical;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
