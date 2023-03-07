package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Indicates the type of app that a VPN traffic rule is associated with. */
public enum VpnTrafficRuleAppType implements ValuedEnum {
    /** The traffic rule is not associated with an app. */
    None("none"),
    /** The traffic rule is associated with a desktop app. */
    Desktop("desktop"),
    /** The traffic rule is associated with a Universal app. */
    Universal("universal");
    public final String value;
    VpnTrafficRuleAppType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnTrafficRuleAppType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "desktop": return Desktop;
            case "universal": return Universal;
            default: return null;
        }
    }
}
