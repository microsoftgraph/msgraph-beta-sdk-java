package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specify whether the rule applies to inbound traffic or outbound traffic.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VpnTrafficDirection implements ValuedEnum {
    /** The rule applies to all outbound traffic. */
    Outbound("outbound"),
    /** The rule applies to all inbound traffic. */
    Inbound("inbound"),
    /** Evolvable enum member */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VpnTrafficDirection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VpnTrafficDirection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "outbound": return Outbound;
            case "inbound": return Inbound;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
