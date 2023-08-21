package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IndustryDataRunStatus implements ValuedEnum {
    Running("running"),
    Failed("failed"),
    Completed("completed"),
    CompletedWithErrors("completedWithErrors"),
    CompletedWithWarnings("completedWithWarnings"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IndustryDataRunStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IndustryDataRunStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "running": return Running;
            case "failed": return Failed;
            case "completed": return Completed;
            case "completedWithErrors": return CompletedWithErrors;
            case "completedWithWarnings": return CompletedWithWarnings;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
