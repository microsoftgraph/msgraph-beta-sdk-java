package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PlannerTaskCompletionRequirements implements ValuedEnum {
    None("none"),
    ChecklistCompletion("checklistCompletion"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerTaskCompletionRequirements(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerTaskCompletionRequirements forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "checklistCompletion": return ChecklistCompletion;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
