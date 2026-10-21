package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerGoalStatus implements ValuedEnum {
    NotStarted("notStarted"),
    OnTrack("onTrack"),
    Behind("behind"),
    AtRisk("atRisk"),
    Closed("closed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerGoalStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerGoalStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "onTrack": return OnTrack;
            case "behind": return Behind;
            case "atRisk": return AtRisk;
            case "closed": return Closed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
