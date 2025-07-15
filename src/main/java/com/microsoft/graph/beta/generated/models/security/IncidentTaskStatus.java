package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IncidentTaskStatus implements ValuedEnum {
    Open("open"),
    InProgress("inProgress"),
    Completed("completed"),
    Failed("failed"),
    NotRelevant("notRelevant"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IncidentTaskStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IncidentTaskStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "failed": return Failed;
            case "notRelevant": return NotRelevant;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
