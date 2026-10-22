package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerTaskStatus implements ValuedEnum {
    NotStarted("notStarted"),
    InProgress("inProgress"),
    Completed("completed"),
    Blocked("blocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerTaskStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerTaskStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "blocked": return Blocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
