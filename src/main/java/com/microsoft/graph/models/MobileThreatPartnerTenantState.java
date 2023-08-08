package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Partner state of this tenant.
 */
public enum MobileThreatPartnerTenantState implements ValuedEnum {
    /** Partner is unavailable. */
    Unavailable("unavailable"),
    /** Partner is available. */
    Available("available"),
    /** Partner is enabled. */
    Enabled("enabled"),
    /** Partner is unresponsive. */
    Unresponsive("unresponsive"),
    /** Indicates that the partner connector is not set up. This can occur when the connector is not provisioned and Intune has not received a heartbeat for the connector. Please see https://go.microsoft.com/fwlink/?linkid=2239039 for more information on connector states. */
    NotSetUp("notSetUp"),
    /** Indicates that the partner connector is in an error state. This can occur when the connector has a non-zero error code set due to an internal error in processing. Please see https://go.microsoft.com/fwlink/?linkid=2239039 for more information on connector states. */
    Error("error"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MobileThreatPartnerTenantState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MobileThreatPartnerTenantState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unavailable": return Unavailable;
            case "available": return Available;
            case "enabled": return Enabled;
            case "unresponsive": return Unresponsive;
            case "notSetUp": return NotSetUp;
            case "error": return Error;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
