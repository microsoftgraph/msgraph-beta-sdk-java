package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Read-only message categories from the existing transcript contract.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InvestigationMessageType implements ValuedEnum {
    UserMessage("userMessage"),
    AgentMessage("agentMessage"),
    ToolRequest("toolRequest"),
    ToolOutput("toolOutput"),
    PermissionRequest("permissionRequest"),
    PermissionResponse("permissionResponse"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InvestigationMessageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InvestigationMessageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userMessage": return UserMessage;
            case "agentMessage": return AgentMessage;
            case "toolRequest": return ToolRequest;
            case "toolOutput": return ToolOutput;
            case "permissionRequest": return PermissionRequest;
            case "permissionResponse": return PermissionResponse;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
