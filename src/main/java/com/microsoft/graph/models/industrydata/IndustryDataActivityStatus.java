package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IndustryDataActivityStatus implements ValuedEnum {
    InProgress("inProgress"),
    Skipped("skipped"),
    Failed("failed"),
    Completed("completed"),
    CompletedWithErrors("completedWithErrors"),
    CompletedWithWarnings("completedWithWarnings"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IndustryDataActivityStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IndustryDataActivityStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "inProgress": return InProgress;
            case "skipped": return Skipped;
            case "failed": return Failed;
            case "completed": return Completed;
            case "completedWithErrors": return CompletedWithErrors;
            case "completedWithWarnings": return CompletedWithWarnings;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
