package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Flags representing which network profile types apply to a firewall rule. */
public enum WindowsFirewallRuleNetworkProfileTypes implements ValuedEnum {
    /** No flags set. */
    NotConfigured("notConfigured"),
    /** The profile for networks that are connected to domains. */
    Domain("domain"),
    /** The profile for private networks. */
    PrivateEscaped("private"),
    /** The profile for public networks. */
    PublicEscaped("public");
    public final String value;
    WindowsFirewallRuleNetworkProfileTypes(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsFirewallRuleNetworkProfileTypes forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "domain": return Domain;
            case "private": return PrivateEscaped;
            case "public": return PublicEscaped;
            default: return null;
        }
    }
}
