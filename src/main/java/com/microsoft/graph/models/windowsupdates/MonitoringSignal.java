package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MonitoringSignal implements ValuedEnum {
    Rollback("rollback"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MonitoringSignal(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MonitoringSignal forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "rollback": return Rollback;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
