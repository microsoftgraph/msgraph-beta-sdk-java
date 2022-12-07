package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum MonitoringSignal implements ValuedEnum {
    Rollback("rollback"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MonitoringSignal(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MonitoringSignal forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rollback": return Rollback;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
