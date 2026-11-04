package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The value of the microsoft.copilot.teamsmeeting policy setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPolicySettingTeamsMeetingValueObject extends CopilotPolicySettingValueObject implements Parsable {
    /**
     * Instantiates a new {@link CopilotPolicySettingTeamsMeetingValueObject} and sets the default values.
     */
    public CopilotPolicySettingTeamsMeetingValueObject() {
        super();
        this.setOdataType("#microsoft.graph.copilotPolicySettingTeamsMeetingValueObject");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPolicySettingTeamsMeetingValueObject}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPolicySettingTeamsMeetingValueObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPolicySettingTeamsMeetingValueObject();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isTranscriptionAllowed", (n) -> { this.setIsTranscriptionAllowed(n.getBooleanValue()); });
        deserializerMap.put("meetingCopilotMode", (n) -> { this.setMeetingCopilotMode(n.getEnumValue(MeetingCopilotMode::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isTranscriptionAllowed property value. Indicates whether transcription is allowed in Teams meetings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTranscriptionAllowed() {
        return this.backingStore.get("isTranscriptionAllowed");
    }
    /**
     * Gets the meetingCopilotMode property value. The Copilot mode for Teams meetings.
     * @return a {@link MeetingCopilotMode}
     */
    @jakarta.annotation.Nullable
    public MeetingCopilotMode getMeetingCopilotMode() {
        return this.backingStore.get("meetingCopilotMode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isTranscriptionAllowed", this.getIsTranscriptionAllowed());
        writer.writeEnumValue("meetingCopilotMode", this.getMeetingCopilotMode());
    }
    /**
     * Sets the isTranscriptionAllowed property value. Indicates whether transcription is allowed in Teams meetings.
     * @param value Value to set for the isTranscriptionAllowed property.
     */
    public void setIsTranscriptionAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTranscriptionAllowed", value);
    }
    /**
     * Sets the meetingCopilotMode property value. The Copilot mode for Teams meetings.
     * @param value Value to set for the meetingCopilotMode property.
     */
    public void setMeetingCopilotMode(@jakarta.annotation.Nullable final MeetingCopilotMode value) {
        this.backingStore.set("meetingCopilotMode", value);
    }
}
