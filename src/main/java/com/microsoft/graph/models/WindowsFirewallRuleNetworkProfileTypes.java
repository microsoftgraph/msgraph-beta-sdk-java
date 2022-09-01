package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum WindowsFirewallRuleNetworkProfileTypes implements ValuedEnum {
    /** No flags set. */
    NotConfigured("notConfigured"),
    /** The profile for networks that are connected to domains. */
    Domain("domain"),
    /** The profile for private networks. */
    Private_escaped("private_escaped"),
    /** The profile for public networks. */
    Public_escaped("public_escaped");
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
            case "private": return Private_escaped;
            case "public": return Public_escaped;
            default: return null;
        }
    }
}
