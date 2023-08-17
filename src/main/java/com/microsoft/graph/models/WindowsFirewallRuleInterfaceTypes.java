package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Flags representing firewall rule interface types.
 */
public enum WindowsFirewallRuleInterfaceTypes implements ValuedEnum {
    /** No flags set. */
    NotConfigured("notConfigured"),
    /** The Remote Access interface type. */
    RemoteAccess("remoteAccess"),
    /** The Wireless interface type. */
    Wireless("wireless"),
    /** The LAN interface type. */
    Lan("lan");
    public final String value;
    WindowsFirewallRuleInterfaceTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsFirewallRuleInterfaceTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "remoteAccess": return RemoteAccess;
            case "wireless": return Wireless;
            case "lan": return Lan;
            default: return null;
        }
    }
}
