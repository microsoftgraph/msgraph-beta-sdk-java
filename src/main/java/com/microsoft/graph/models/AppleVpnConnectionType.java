package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AppleVpnConnectionType implements ValuedEnum {
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
    /** Custom VPN. */
    CustomVpn("customVpn"),
    /** Cisco (IPSec). */
    CiscoIPSec("ciscoIPSec"),
    /** Citrix. */
    Citrix("citrix"),
    /** Cisco AnyConnect V2. */
    CiscoAnyConnectV2("ciscoAnyConnectV2"),
    /** Palo Alto Networks GlobalProtect. */
    PaloAltoGlobalProtect("paloAltoGlobalProtect"),
    /** Zscaler Private Access. */
    ZscalerPrivateAccess("zscalerPrivateAccess"),
    /** F5 Access 2018. */
    F5Access2018("f5Access2018"),
    /** Citrix Sso. */
    CitrixSso("citrixSso"),
    /** Palo Alto Networks GlobalProtect V2. */
    PaloAltoGlobalProtectV2("paloAltoGlobalProtectV2"),
    /** IKEv2. */
    IkEv2("ikEv2"),
    /** AlwaysOn. */
    AlwaysOn("alwaysOn"),
    /** Microsoft Tunnel. */
    MicrosoftTunnel("microsoftTunnel"),
    /** NetMotion Mobility. */
    NetMotionMobility("netMotionMobility"),
    /** Microsoft Protect. */
    MicrosoftProtect("microsoftProtect");
    public final String value;
    AppleVpnConnectionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AppleVpnConnectionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ciscoAnyConnect": return CiscoAnyConnect;
            case "pulseSecure": return PulseSecure;
            case "f5EdgeClient": return F5EdgeClient;
            case "dellSonicWallMobileConnect": return DellSonicWallMobileConnect;
            case "checkPointCapsuleVpn": return CheckPointCapsuleVpn;
            case "customVpn": return CustomVpn;
            case "ciscoIPSec": return CiscoIPSec;
            case "citrix": return Citrix;
            case "ciscoAnyConnectV2": return CiscoAnyConnectV2;
            case "paloAltoGlobalProtect": return PaloAltoGlobalProtect;
            case "zscalerPrivateAccess": return ZscalerPrivateAccess;
            case "f5Access2018": return F5Access2018;
            case "citrixSso": return CitrixSso;
            case "paloAltoGlobalProtectV2": return PaloAltoGlobalProtectV2;
            case "ikEv2": return IkEv2;
            case "alwaysOn": return AlwaysOn;
            case "microsoftTunnel": return MicrosoftTunnel;
            case "netMotionMobility": return NetMotionMobility;
            case "microsoftProtect": return MicrosoftProtect;
            default: return null;
        }
    }
}
