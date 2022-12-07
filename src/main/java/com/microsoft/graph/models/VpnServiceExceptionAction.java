package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum VpnServiceExceptionAction implements ValuedEnum {
    /** Make all traffic from that service go through the VPN */
    ForceTrafficViaVPN("forceTrafficViaVPN"),
    /** Allow the service outside of the VPN */
    AllowTrafficOutside("allowTrafficOutside"),
    /** Drop all traffic from the service */
    DropTraffic("dropTraffic");
    public final String value;
    VpnServiceExceptionAction(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnServiceExceptionAction forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "forceTrafficViaVPN": return ForceTrafficViaVPN;
            case "allowTrafficOutside": return AllowTrafficOutside;
            case "dropTraffic": return DropTraffic;
            default: return null;
        }
    }
}
