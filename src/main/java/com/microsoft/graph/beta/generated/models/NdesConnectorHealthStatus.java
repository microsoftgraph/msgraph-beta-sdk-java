package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The health status of an NDES connector or individual health check metric.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NdesConnectorHealthStatus implements ValuedEnum {
    /** Health has not been evaluated yet for this connector. */
    Unknown("unknown"),
    /** All health checks are passing. Error rates are below the attention threshold for all metrics. */
    NoActionRequired("noActionRequired"),
    /** One or more health checks have error rates between the attention and action thresholds. */
    AttentionRequired("attentionRequired"),
    /** One or more health checks have error rates above the action threshold. Investigation is required. */
    ActionRequired("actionRequired"),
    /** The connector has not connected within the staleness threshold. Applied at read time based on lastConnectionDateTime. */
    Disconnected("disconnected"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NdesConnectorHealthStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NdesConnectorHealthStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "noActionRequired": return NoActionRequired;
            case "attentionRequired": return AttentionRequired;
            case "actionRequired": return ActionRequired;
            case "disconnected": return Disconnected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
