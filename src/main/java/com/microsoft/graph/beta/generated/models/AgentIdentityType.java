package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AgentIdentityType implements ValuedEnum {
    AgentIdentity("agentIdentity"),
    AgentUser("agentUser"),
    UnknownFutureValue("unknownFutureValue"),
    AgentIdentityBlueprintPrincipal("agentIdentityBlueprintPrincipal");
    public final String value;
    AgentIdentityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AgentIdentityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "agentIdentity": return AgentIdentity;
            case "agentUser": return AgentUser;
            case "unknownFutureValue": return UnknownFutureValue;
            case "agentIdentityBlueprintPrincipal": return AgentIdentityBlueprintPrincipal;
            default: return null;
        }
    }
}
