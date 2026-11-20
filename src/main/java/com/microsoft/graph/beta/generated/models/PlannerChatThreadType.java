package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerChatThreadType implements ValuedEnum {
    Task("task"),
    Plan("plan"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerChatThreadType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerChatThreadType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "task": return Task;
            case "plan": return Plan;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
