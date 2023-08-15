package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static HuntingRuleRunStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
