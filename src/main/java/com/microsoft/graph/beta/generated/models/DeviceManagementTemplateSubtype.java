package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Template subtype
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementTemplateSubtype implements ValuedEnum {
    /** Template has no subtype */
    None("none"),
    /** Endpoint security firewall subtype */
    Firewall("firewall"),
    /** Endpoint security disk encryption subtype */
    DiskEncryption("diskEncryption"),
    /** Endpoint security attack surface reduction subtype */
    AttackSurfaceReduction("attackSurfaceReduction"),
    /** Endpoint security endpoint detection and response subtype */
    EndpointDetectionReponse("endpointDetectionReponse"),
    /** Endpoint security account protection subtype */
    AccountProtection("accountProtection"),
    /** Endpoint security anitivirus subtype */
    Antivirus("antivirus"),
    /** Endpoint security firewall shared app subtype */
    FirewallSharedAppList("firewallSharedAppList"),
    /** Endpoint security firewall shared ip range list subtype */
    FirewallSharedIpList("firewallSharedIpList"),
    /** Endpoint security firewall shared port range list subtype */
    FirewallSharedPortlist("firewallSharedPortlist");
    public final String value;
    DeviceManagementTemplateSubtype(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementTemplateSubtype forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "firewall": return Firewall;
            case "diskEncryption": return DiskEncryption;
            case "attackSurfaceReduction": return AttackSurfaceReduction;
            case "endpointDetectionReponse": return EndpointDetectionReponse;
            case "accountProtection": return AccountProtection;
            case "antivirus": return Antivirus;
            case "firewallSharedAppList": return FirewallSharedAppList;
            case "firewallSharedIpList": return FirewallSharedIpList;
            case "firewallSharedPortlist": return FirewallSharedPortlist;
            default: return null;
        }
    }
}
