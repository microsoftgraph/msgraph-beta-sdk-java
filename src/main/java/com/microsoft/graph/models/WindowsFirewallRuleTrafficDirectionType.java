package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsFirewallRuleTrafficDirectionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "out": return Out;
            case "in": return In;
            default: return null;
        }
    }
}
