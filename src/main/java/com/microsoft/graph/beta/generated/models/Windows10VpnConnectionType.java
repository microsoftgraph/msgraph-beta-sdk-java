package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * VPN connection types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Windows10VpnConnectionType implements ValuedEnum {
    /** Pulse Secure. */
    PulseSecure("pulseSecure"),
    /** F5 Edge Client. */
    F5EdgeClient("f5EdgeClient"),
    /** Dell SonicWALL Mobile Connection. */
    DellSonicWallMobileConnect("dellSonicWallMobileConnect"),
    /** Check Point Capsule VPN. */
    CheckPointCapsuleVpn("checkPointCapsuleVpn"),
    /** Automatic. */
    Automatic("automatic"),
    /** IKEv2. */
    IkEv2("ikEv2"),
    /** L2TP. */
    L2tp("l2tp"),
    /** PPTP. */
    Pptp("pptp"),
    /** Citrix. */
    Citrix("citrix"),
    /** Palo Alto Networks GlobalProtect. */
    PaloAltoGlobalProtect("paloAltoGlobalProtect"),
    /** Cisco AnyConnect */
    CiscoAnyConnect("ciscoAnyConnect"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Microsoft Tunnel connection type */
    MicrosoftTunnel("microsoftTunnel");
    public final String value;
    Windows10VpnConnectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Windows10VpnConnectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pulseSecure": return PulseSecure;
            case "f5EdgeClient": return F5EdgeClient;
            case "dellSonicWallMobileConnect": return DellSonicWallMobileConnect;
            case "checkPointCapsuleVpn": return CheckPointCapsuleVpn;
            case "automatic": return Automatic;
            case "ikEv2": return IkEv2;
            case "l2tp": return L2tp;
            case "pptp": return Pptp;
            case "citrix": return Citrix;
            case "paloAltoGlobalProtect": return PaloAltoGlobalProtect;
            case "ciscoAnyConnect": return CiscoAnyConnect;
            case "unknownFutureValue": return UnknownFutureValue;
            case "microsoftTunnel": return MicrosoftTunnel;
            default: return null;
        }
    }
}
