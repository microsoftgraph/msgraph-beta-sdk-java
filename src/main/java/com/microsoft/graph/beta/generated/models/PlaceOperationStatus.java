package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlaceOperationStatus implements ValuedEnum {
    Created("created"),
    InProgress("inProgress"),
    Succeeded("succeeded"),
    Failed("failed"),
    PartiallySucceeded("partiallySucceeded"),
    Expired("expired"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlaceOperationStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlaceOperationStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "created": return Created;
            case "inProgress": return InProgress;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "partiallySucceeded": return PartiallySucceeded;
            case "expired": return Expired;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
