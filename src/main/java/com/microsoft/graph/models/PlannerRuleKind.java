package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PlannerRuleKind implements ValuedEnum {
    TaskRule("taskRule"),
    BucketRule("bucketRule"),
    PlanRule("planRule"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerRuleKind(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerRuleKind forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "taskRule": return TaskRule;
            case "bucketRule": return BucketRule;
            case "planRule": return PlanRule;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
