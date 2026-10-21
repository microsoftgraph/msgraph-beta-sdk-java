package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AgentEndpointConfigurationType implements ValuedEnum {
    ApiBased("apiBased"),
    BotBased("botBased"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AgentEndpointConfigurationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AgentEndpointConfigurationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "apiBased": return ApiBased;
            case "botBased": return BotBased;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
