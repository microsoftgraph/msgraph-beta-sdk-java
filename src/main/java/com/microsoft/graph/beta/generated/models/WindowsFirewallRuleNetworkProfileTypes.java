package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Flags representing which network profile types apply to a firewall rule.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsFirewallRuleNetworkProfileTypes implements ValuedEnum {
    /** No flags set. */
    NotConfigured("notConfigured"),
    /** The profile for networks that are connected to domains. */
    Domain("domain"),
    /** The profile for private networks. */
    Private("private"),
    /** The profile for public networks. */
    Public("public");
    public final String value;
    WindowsFirewallRuleNetworkProfileTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsFirewallRuleNetworkProfileTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "domain": return Domain;
            case "private": return Private;
            case "public": return Public;
            default: return null;
        }
    }
}
