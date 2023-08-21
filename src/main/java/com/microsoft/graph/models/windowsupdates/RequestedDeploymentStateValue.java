package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RequestedDeploymentStateValue implements ValuedEnum {
    None("none"),
    Paused("paused"),
    Archived("archived"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RequestedDeploymentStateValue(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RequestedDeploymentStateValue forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
