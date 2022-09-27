package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeploymentStateValue forValue(@javax.annotation.Nonnull final String searchValue) {
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
