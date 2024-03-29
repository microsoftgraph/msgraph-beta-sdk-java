package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutopilotProfileAssignmentStatus implements ValuedEnum {
    /** Unknown assignment status */
    Unknown("unknown"),
    /** Assigned successfully in Intune and in sync with Windows auto pilot program */
    AssignedInSync("assignedInSync"),
    /** Assigned successfully in Intune and not in sync with Windows auto pilot program */
    AssignedOutOfSync("assignedOutOfSync"),
    /** Assigned successfully in Intune and either in-sync or out of sync with Windows auto pilot program */
    AssignedUnkownSyncState("assignedUnkownSyncState"),
    /** Not assigned */
    NotAssigned("notAssigned"),
    /** Pending assignment */
    Pending("pending"),
    /**  Assignment failed */
    Failed("failed");
    public final String value;
    WindowsAutopilotProfileAssignmentStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutopilotProfileAssignmentStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "assignedInSync": return AssignedInSync;
            case "assignedOutOfSync": return AssignedOutOfSync;
            case "assignedUnkownSyncState": return AssignedUnkownSyncState;
            case "notAssigned": return NotAssigned;
            case "pending": return Pending;
            case "failed": return Failed;
            default: return null;
        }
    }
}
