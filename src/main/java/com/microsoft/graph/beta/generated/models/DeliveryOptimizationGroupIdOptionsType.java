package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for the DeliveryOptimizationGroupIdOptionsType setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeliveryOptimizationGroupIdOptionsType implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** Active Directory site. */
    AdSite("adSite"),
    /** Authenticated domain SID. */
    AuthenticatedDomainSid("authenticatedDomainSid"),
    /** DHCP user option. */
    DhcpUserOption("dhcpUserOption"),
    /** DNS suffix. */
    DnsSuffix("dnsSuffix");
    public final String value;
    DeliveryOptimizationGroupIdOptionsType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeliveryOptimizationGroupIdOptionsType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "adSite": return AdSite;
            case "authenticatedDomainSid": return AuthenticatedDomainSid;
            case "dhcpUserOption": return DhcpUserOption;
            case "dnsSuffix": return DnsSuffix;
            default: return null;
        }
    }
}
