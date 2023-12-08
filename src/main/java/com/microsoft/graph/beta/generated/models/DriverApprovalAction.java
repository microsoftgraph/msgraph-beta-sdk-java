package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum type to represent approval actions of single or list of drivers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DriverApprovalAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "approve": return Approve;
            case "decline": return Decline;
            case "suspend": return Suspend;
            default: return null;
        }
    }
}
