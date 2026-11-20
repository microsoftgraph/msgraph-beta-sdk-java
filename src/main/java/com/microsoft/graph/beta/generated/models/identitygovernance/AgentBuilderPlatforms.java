package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AgentBuilderPlatforms implements ValuedEnum {
    MicrosoftCopilotStudio("microsoftCopilotStudio"),
    Foundry("foundry"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AgentBuilderPlatforms(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AgentBuilderPlatforms forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftCopilotStudio": return MicrosoftCopilotStudio;
            case "foundry": return Foundry;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
