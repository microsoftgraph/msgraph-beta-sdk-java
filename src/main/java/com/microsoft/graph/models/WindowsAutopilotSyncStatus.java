package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsAutopilotSyncStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
