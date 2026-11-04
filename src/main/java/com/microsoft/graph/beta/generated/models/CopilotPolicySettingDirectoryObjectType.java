package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The directory object type of a Copilot policy setting assignment member.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CopilotPolicySettingDirectoryObjectType implements ValuedEnum {
    /** A user. */
    User("user"),
    /** A group. */
    Group("group"),
    /** An agent application identifier. */
    AgentAppId("agentAppId"),
    /** An agent user. */
    AgentUser("agentUser"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CopilotPolicySettingDirectoryObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CopilotPolicySettingDirectoryObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "group": return Group;
            case "agentAppId": return AgentAppId;
            case "agentUser": return AgentUser;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
