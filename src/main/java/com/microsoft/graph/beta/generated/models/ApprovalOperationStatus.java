package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApprovalOperationStatus implements ValuedEnum {
    Scheduled("scheduled"),
    InProgress("inProgress"),
    Succeeded("succeeded"),
    Failed("failed"),
    Timeout("timeout"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApprovalOperationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApprovalOperationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "scheduled": return Scheduled;
            case "inProgress": return InProgress;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "timeout": return Timeout;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
