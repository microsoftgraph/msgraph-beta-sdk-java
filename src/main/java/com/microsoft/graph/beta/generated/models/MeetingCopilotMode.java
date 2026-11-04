package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The Copilot mode for Teams meetings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MeetingCopilotMode implements ValuedEnum {
    /** Copilot is on. */
    Enabled("enabled"),
    /** Copilot is on and a saved transcript is required. */
    EnabledWithTranscript("enabledWithTranscript"),
    /** Copilot is on and the transcript is saved by default. */
    EnabledWithTranscriptDefaultOn("enabledWithTranscriptDefaultOn"),
    /** Copilot is off. */
    Disabled("disabled"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MeetingCopilotMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MeetingCopilotMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "enabled": return Enabled;
            case "enabledWithTranscript": return EnabledWithTranscript;
            case "enabledWithTranscriptDefaultOn": return EnabledWithTranscriptDefaultOn;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
