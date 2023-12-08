package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Work Profile VPN connection type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidWorkProfileVpnConnectionType implements ValuedEnum {
    /** Cisco AnyConnect. */
    CiscoAnyConnect("ciscoAnyConnect"),
    /** Pulse Secure. */
    PulseSecure("pulseSecure"),
    /** F5 Edge Client. */
    F5EdgeClient("f5EdgeClient"),
    /** Dell SonicWALL Mobile Connection. */
    DellSonicWallMobileConnect("dellSonicWallMobileConnect"),
    /** Check Point Capsule VPN. */
    CheckPointCapsuleVpn("checkPointCapsuleVpn"),
    /** Citrix */
    Citrix("citrix"),
    /** Palo Alto Networks GlobalProtect. */
    PaloAltoGlobalProtect("paloAltoGlobalProtect"),
    /** Microsoft Tunnel. */
    MicrosoftTunnel("microsoftTunnel"),
    /** NetMotion Mobility. */
    NetMotionMobility("netMotionMobility"),
    /** Microsoft Protect. */
    MicrosoftProtect("microsoftProtect");
    public final String value;
    AndroidWorkProfileVpnConnectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidWorkProfileVpnConnectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ciscoAnyConnect": return CiscoAnyConnect;
            case "pulseSecure": return PulseSecure;
            case "f5EdgeClient": return F5EdgeClient;
            case "dellSonicWallMobileConnect": return DellSonicWallMobileConnect;
            case "checkPointCapsuleVpn": return CheckPointCapsuleVpn;
            case "citrix": return Citrix;
            case "paloAltoGlobalProtect": return PaloAltoGlobalProtect;
            case "microsoftTunnel": return MicrosoftTunnel;
            case "netMotionMobility": return NetMotionMobility;
            case "microsoftProtect": return MicrosoftProtect;
            default: return null;
        }
    }
}
