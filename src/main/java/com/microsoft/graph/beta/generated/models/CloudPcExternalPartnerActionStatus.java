package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcExternalPartnerActionStatus implements ValuedEnum {
    Created("created"),
    Pending("pending"),
    Canceled("canceled"),
    Running("running"),
    Succeeded("succeeded"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcExternalPartnerActionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcExternalPartnerActionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "created": return Created;
            case "pending": return Pending;
            case "canceled": return Canceled;
            case "running": return Running;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
