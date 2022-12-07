package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum RequestedDeploymentStateValue implements ValuedEnum {
    None("none"),
    Paused("paused"),
    Archived("archived"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RequestedDeploymentStateValue(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RequestedDeploymentStateValue forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "paused": return Paused;
            case "archived": return Archived;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
