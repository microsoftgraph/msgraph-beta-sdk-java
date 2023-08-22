package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MonitoringAction implements ValuedEnum {
    AlertError("alertError"),
    PauseDeployment("pauseDeployment"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MonitoringAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MonitoringAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alertError": return AlertError;
            case "pauseDeployment": return PauseDeployment;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
