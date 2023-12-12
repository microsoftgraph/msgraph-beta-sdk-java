package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the status of the attempted device scope action
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceScopeActionStatus implements ValuedEnum {
    /** Indicates the device scope action failed to trigger. */
    Failed("failed"),
    /** Indicates the device scope action was successfully triggered. */
    Succeeded("succeeded"),
    /** Placeholder value for future expansion. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceScopeActionStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceScopeActionStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "failed": return Failed;
            case "succeeded": return Succeeded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
