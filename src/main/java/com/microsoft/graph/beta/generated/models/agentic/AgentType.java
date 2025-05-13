package com.microsoft.graph.beta.models.agentic;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AgentType implements ValuedEnum {
    NotAgentic("notAgentic"),
    AgenticAppBuilder("agenticAppBuilder"),
    AgenticApp("agenticApp"),
    AgenticAppInstance("agenticAppInstance"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AgentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AgentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notAgentic": return NotAgentic;
            case "agenticAppBuilder": return AgenticAppBuilder;
            case "agenticApp": return AgenticApp;
            case "agenticAppInstance": return AgenticAppInstance;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
