package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ForwardingRuleAction implements ValuedEnum {
    Bypass("bypass"),
    Forward("forward"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ForwardingRuleAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ForwardingRuleAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "bypass": return Bypass;
            case "forward": return Forward;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
