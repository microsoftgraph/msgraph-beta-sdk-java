package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TaskStatus implements ValuedEnum {
    NotSet("notSet"),
    New("new"),
    InProgress("inProgress"),
    Failed("failed"),
    PartiallyCompleted("partiallyCompleted"),
    Skipped("skipped"),
    Completed("completed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TaskStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TaskStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notSet": return NotSet;
            case "new": return New;
            case "inProgress": return InProgress;
            case "failed": return Failed;
            case "partiallyCompleted": return PartiallyCompleted;
            case "skipped": return Skipped;
            case "completed": return Completed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
