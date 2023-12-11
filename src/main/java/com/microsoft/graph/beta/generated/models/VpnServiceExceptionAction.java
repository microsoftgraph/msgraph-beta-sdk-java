package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The VPN action to take for a specific service.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnServiceExceptionAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "forceTrafficViaVPN": return ForceTrafficViaVPN;
            case "allowTrafficOutside": return AllowTrafficOutside;
            case "dropTraffic": return DropTraffic;
            default: return null;
        }
    }
}
