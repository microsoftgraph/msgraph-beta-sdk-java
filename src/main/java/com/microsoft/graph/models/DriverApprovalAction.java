package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the executeAction method. */
public enum DriverApprovalAction implements ValuedEnum {
    /** This indicates the action to approve single or list of drivers. */
    Approve("approve"),
    /** This indicates the action to approve single or list of drivers. */
    Decline("decline"),
    /** This indicates the action to suspend single or list of drivers. */
    Suspend("suspend");
    public final String value;
    DriverApprovalAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DriverApprovalAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "approve": return Approve;
            case "decline": return Decline;
            case "suspend": return Suspend;
            default: return null;
        }
    }
}
