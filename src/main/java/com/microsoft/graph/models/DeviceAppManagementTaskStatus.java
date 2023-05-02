package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Device app management task status. */
public enum DeviceAppManagementTaskStatus implements ValuedEnum {
    /** State is undefined. */
    Unknown("unknown"),
    /** The task is ready for review. */
    Pending("pending"),
    /** The task has been accepted and is being worked on. */
    Active("active"),
    /** The work is complete. */
    Completed("completed"),
    /** The task was rejected. */
    Rejected("rejected");
    public final String value;
    DeviceAppManagementTaskStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceAppManagementTaskStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "pending": return Pending;
            case "active": return Active;
            case "completed": return Completed;
            case "rejected": return Rejected;
            default: return null;
        }
    }
}
