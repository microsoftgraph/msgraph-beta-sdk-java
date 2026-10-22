package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcAutoCleanupMode implements ValuedEnum {
    None("none"),
    Scheduled("scheduled"),
    OnQuotaExceeded("onQuotaExceeded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcAutoCleanupMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcAutoCleanupMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "scheduled": return Scheduled;
            case "onQuotaExceeded": return OnQuotaExceeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
