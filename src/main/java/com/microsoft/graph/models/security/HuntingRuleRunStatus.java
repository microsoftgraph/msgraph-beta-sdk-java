package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HuntingRuleRunStatus implements ValuedEnum {
    Running("running"),
    Completed("completed"),
    Failed("failed"),
    PartiallyFailed("partiallyFailed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HuntingRuleRunStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HuntingRuleRunStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "running": return Running;
            case "completed": return Completed;
            case "failed": return Failed;
            case "partiallyFailed": return PartiallyFailed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
