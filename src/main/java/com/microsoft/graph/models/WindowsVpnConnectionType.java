package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows VPN connection type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsVpnConnectionType implements ValuedEnum {
    /** Pulse Secure. */
    PulseSecure("pulseSecure"),
    /** F5 Edge Client. */
    F5EdgeClient("f5EdgeClient"),
    /** Dell SonicWALL Mobile Connection. */
    DellSonicWallMobileConnect("dellSonicWallMobileConnect"),
    /** Check Point Capsule VPN. */
    CheckPointCapsuleVpn("checkPointCapsuleVpn");
    public final String value;
    WindowsVpnConnectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsVpnConnectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pulseSecure": return PulseSecure;
            case "f5EdgeClient": return F5EdgeClient;
            case "dellSonicWallMobileConnect": return DellSonicWallMobileConnect;
            case "checkPointCapsuleVpn": return CheckPointCapsuleVpn;
            default: return null;
        }
    }
}
