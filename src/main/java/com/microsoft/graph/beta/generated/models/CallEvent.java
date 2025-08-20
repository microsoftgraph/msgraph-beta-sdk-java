package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallEvent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CallEvent} and sets the default values.
     */
    public CallEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CallEvent}
     */
    @jakarta.annotation.Nonnull
    public static CallEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.emergencyCallEvent": return new EmergencyCallEvent();
            }
        }
        return new CallEvent();
    }
    /**
     * Gets the callEventType property value. The event type of the call. Possible values are: callStarted, callEnded, unknownFutureValue, rosterUpdated. You must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: rosterUpdated.
     * @return a {@link CallEventType}
     */
    @jakarta.annotation.Nullable
    public CallEventType getCallEventType() {
        return this.backingStore.get("callEventType");
    }
    /**
     * Gets the eventDateTime property value. The time when event occurred.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callEventType", (n) -> { this.setCallEventType(n.getEnumValue(CallEventType::forValue)); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getCollectionOfObjectValues(Participant::createFromDiscriminatorValue)); });
        deserializerMap.put("recordingState", (n) -> { this.setRecordingState(n.getObjectValue(RecordingState::createFromDiscriminatorValue)); });
        deserializerMap.put("transcriptionState", (n) -> { this.setTranscriptionState(n.getObjectValue(TranscriptionState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the participants property value. Participants collection for the call event.
     * @return a {@link java.util.List<Participant>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Participant> getParticipants() {
        return this.backingStore.get("participants");
    }
    /**
     * Gets the recordingState property value. The recordingState property
     * @return a {@link RecordingState}
     */
    @jakarta.annotation.Nullable
    public RecordingState getRecordingState() {
        return this.backingStore.get("recordingState");
    }
    /**
     * Gets the transcriptionState property value. The transcriptionState property
     * @return a {@link TranscriptionState}
     */
    @jakarta.annotation.Nullable
    public TranscriptionState getTranscriptionState() {
        return this.backingStore.get("transcriptionState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("callEventType", this.getCallEventType());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
        writer.writeObjectValue("recordingState", this.getRecordingState());
        writer.writeObjectValue("transcriptionState", this.getTranscriptionState());
    }
    /**
     * Sets the callEventType property value. The event type of the call. Possible values are: callStarted, callEnded, unknownFutureValue, rosterUpdated. You must use the Prefer: include-unknown-enum-members request header to get the following value in this evolvable enum: rosterUpdated.
     * @param value Value to set for the callEventType property.
     */
    public void setCallEventType(@jakarta.annotation.Nullable final CallEventType value) {
        this.backingStore.set("callEventType", value);
    }
    /**
     * Sets the eventDateTime property value. The time when event occurred.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the participants property value. Participants collection for the call event.
     * @param value Value to set for the participants property.
     */
    public void setParticipants(@jakarta.annotation.Nullable final java.util.List<Participant> value) {
        this.backingStore.set("participants", value);
    }
    /**
     * Sets the recordingState property value. The recordingState property
     * @param value Value to set for the recordingState property.
     */
    public void setRecordingState(@jakarta.annotation.Nullable final RecordingState value) {
        this.backingStore.set("recordingState", value);
    }
    /**
     * Sets the transcriptionState property value. The transcriptionState property
     * @param value Value to set for the transcriptionState property.
     */
    public void setTranscriptionState(@jakarta.annotation.Nullable final TranscriptionState value) {
        this.backingStore.set("transcriptionState", value);
    }
}
