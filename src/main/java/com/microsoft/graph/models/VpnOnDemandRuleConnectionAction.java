package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * VPN On-Demand Rule Connection Action.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpnOnDemandRuleConnectionAction implements ValuedEnum {
    /** Connect. */
    Connect("connect"),
    /** Evaluate Connection. */
    EvaluateConnection("evaluateConnection"),
    /** Ignore. */
    Ignore("ignore"),
    /** Disconnect. */
    Disconnect("disconnect");
    public final String value;
    VpnOnDemandRuleConnectionAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnOnDemandRuleConnectionAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "connect": return Connect;
            case "evaluateConnection": return EvaluateConnection;
            case "ignore": return Ignore;
            case "disconnect": return Disconnect;
            default: return null;
        }
    }
}
