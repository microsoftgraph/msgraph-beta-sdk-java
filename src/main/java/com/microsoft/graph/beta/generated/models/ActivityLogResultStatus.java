package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivityLogResultStatus implements ValuedEnum {
    Succeeded("succeeded"),
    Failed("failed"),
    PartiallySucceeded("partiallySucceeded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ActivityLogResultStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivityLogResultStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "partiallySucceeded": return PartiallySucceeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
