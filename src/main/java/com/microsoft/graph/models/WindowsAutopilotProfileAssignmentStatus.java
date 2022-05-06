package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum WindowsAutopilotProfileAssignmentStatus implements ValuedEnum {
    Unknown("unknown"),
    AssignedInSync("assignedInSync"),
    AssignedOutOfSync("assignedOutOfSync"),
    AssignedUnkownSyncState("assignedUnkownSyncState"),
    NotAssigned("notAssigned"),
    Pending("pending"),
    Failed("failed");
    public final String value;
    WindowsAutopilotProfileAssignmentStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsAutopilotProfileAssignmentStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
