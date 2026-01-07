package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The state of a Copilot conversation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CopilotConversationState implements ValuedEnum {
    /** The conversation is active and can accept requests to chat. */
    Active("active"),
    /** Copilot has disengaged from the conversation due to a RAI issue and will reject further requests to chat. */
    DisengagedForRai("disengagedForRai"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CopilotConversationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CopilotConversationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "disengagedForRai": return DisengagedForRai;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
