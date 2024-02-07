package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies the routing policy for a VPN traffic rule.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpnTrafficRuleRoutingPolicyType implements ValuedEnum {
    /** No routing policy specified. */
    None("none"),
    /** Network traffic for the specified app will be routed through the VPN. */
    SplitTunnel("splitTunnel"),
    /** All network traffic will be routed through the VPN. */
    ForceTunnel("forceTunnel");
    public final String value;
    VpnTrafficRuleRoutingPolicyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnTrafficRuleRoutingPolicyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "splitTunnel": return SplitTunnel;
            case "forceTunnel": return ForceTunnel;
            default: return null;
        }
    }
}
