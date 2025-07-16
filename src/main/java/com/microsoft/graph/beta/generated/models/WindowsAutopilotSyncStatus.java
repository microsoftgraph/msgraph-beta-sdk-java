package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutopilotSyncStatus implements ValuedEnum {
    /** Unknown sync status */
    Unknown("unknown"),
    /** Sync is in progress */
    InProgress("inProgress"),
    /** Sync completed. */
    Completed("completed"),
    /** Sync failed. */
    Failed("failed");
    public final String value;
    WindowsAutopilotSyncStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutopilotSyncStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "failed": return Failed;
            default: return null;
        }
    }
}
