package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeploymentStateValue implements ValuedEnum {
    Scheduled("scheduled"),
    Offering("offering"),
    Paused("paused"),
    Faulted("faulted"),
    Archived("archived"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeploymentStateValue(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeploymentStateValue forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "scheduled": return Scheduled;
            case "offering": return Offering;
            case "paused": return Paused;
            case "faulted": return Faulted;
            case "archived": return Archived;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
