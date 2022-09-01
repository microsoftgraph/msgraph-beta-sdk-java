package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VpnOnDemandRuleConnectionAction forValue(@javax.annotation.Nonnull final String searchValue) {
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
