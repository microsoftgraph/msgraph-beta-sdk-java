package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Firewall rule traffic directions.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsFirewallRuleTrafficDirectionType implements ValuedEnum {
    /** Not configured. */
    NotConfigured("notConfigured"),
    /** The rule applies to outbound traffic. */
    Out("out"),
    /** The rule applies to inbound traffic. */
    In("in");
    public final String value;
    WindowsFirewallRuleTrafficDirectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsFirewallRuleTrafficDirectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "out": return Out;
            case "in": return In;
            default: return null;
        }
    }
}
