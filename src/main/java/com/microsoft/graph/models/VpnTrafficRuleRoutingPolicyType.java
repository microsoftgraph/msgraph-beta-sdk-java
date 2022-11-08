package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnTrafficRuleRoutingPolicyType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "splitTunnel": return SplitTunnel;
            case "forceTunnel": return ForceTunnel;
            default: return null;
        }
    }
}
