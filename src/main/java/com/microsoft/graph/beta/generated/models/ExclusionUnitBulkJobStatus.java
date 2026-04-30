package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExclusionUnitBulkJobStatus implements ValuedEnum {
    Created("created"),
    Active("active"),
    Completed("completed"),
    CompletedWithErrors("completedWithErrors"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ExclusionUnitBulkJobStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExclusionUnitBulkJobStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "created": return Created;
            case "active": return Active;
            case "completed": return Completed;
            case "completedWithErrors": return CompletedWithErrors;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
