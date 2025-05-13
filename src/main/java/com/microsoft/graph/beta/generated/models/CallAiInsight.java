package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallAiInsight extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CallAiInsight} and sets the default values.
     */
    public CallAiInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CallAiInsight}
     */
    @jakarta.annotation.Nonnull
    public static CallAiInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallAiInsight();
    }
    /**
     * Gets the actionItems property value. The collection of AI-generated action items. Read-only.
     * @return a {@link java.util.List<ActionItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActionItem> getActionItems() {
        return this.backingStore.get("actionItems");
    }
    /**
     * Gets the callId property value. The ID for the online meeting call for which the callAiInsight was generated. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallId() {
        return this.backingStore.get("callId");
    }
    /**
     * Gets the contentCorrelationId property value. The unique ID that correlates the transcript from which the insights were generated. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentCorrelationId() {
        return this.backingStore.get("contentCorrelationId");
    }
    /**
     * Gets the createdDateTime property value. Date and time at which the corresponding transcript was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the endDateTime property value. Date and time at which the corresponding transcription ends. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionItems", (n) -> { this.setActionItems(n.getCollectionOfObjectValues(ActionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("callId", (n) -> { this.setCallId(n.getStringValue()); });
        deserializerMap.put("contentCorrelationId", (n) -> { this.setContentCorrelationId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("meetingNotes", (n) -> { this.setMeetingNotes(n.getCollectionOfObjectValues(MeetingNote::createFromDiscriminatorValue)); });
        deserializerMap.put("viewpoint", (n) -> { this.setViewpoint(n.getObjectValue(CallAiInsightViewPoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the meetingNotes property value. The collection of AI-generated meeting notes. Read-only.
     * @return a {@link java.util.List<MeetingNote>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingNote> getMeetingNotes() {
        return this.backingStore.get("meetingNotes");
    }
    /**
     * Gets the viewpoint property value. The caller-specific properties of the callAiInsight entity. Read-only.
     * @return a {@link CallAiInsightViewPoint}
     */
    @jakarta.annotation.Nullable
    public CallAiInsightViewPoint getViewpoint() {
        return this.backingStore.get("viewpoint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actionItems", this.getActionItems());
        writer.writeStringValue("callId", this.getCallId());
        writer.writeStringValue("contentCorrelationId", this.getContentCorrelationId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeCollectionOfObjectValues("meetingNotes", this.getMeetingNotes());
        writer.writeObjectValue("viewpoint", this.getViewpoint());
    }
    /**
     * Sets the actionItems property value. The collection of AI-generated action items. Read-only.
     * @param value Value to set for the actionItems property.
     */
    public void setActionItems(@jakarta.annotation.Nullable final java.util.List<ActionItem> value) {
        this.backingStore.set("actionItems", value);
    }
    /**
     * Sets the callId property value. The ID for the online meeting call for which the callAiInsight was generated. Read-only.
     * @param value Value to set for the callId property.
     */
    public void setCallId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("callId", value);
    }
    /**
     * Sets the contentCorrelationId property value. The unique ID that correlates the transcript from which the insights were generated. Read-only.
     * @param value Value to set for the contentCorrelationId property.
     */
    public void setContentCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentCorrelationId", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time at which the corresponding transcript was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the endDateTime property value. Date and time at which the corresponding transcription ends. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the meetingNotes property value. The collection of AI-generated meeting notes. Read-only.
     * @param value Value to set for the meetingNotes property.
     */
    public void setMeetingNotes(@jakarta.annotation.Nullable final java.util.List<MeetingNote> value) {
        this.backingStore.set("meetingNotes", value);
    }
    /**
     * Sets the viewpoint property value. The caller-specific properties of the callAiInsight entity. Read-only.
     * @param value Value to set for the viewpoint property.
     */
    public void setViewpoint(@jakarta.annotation.Nullable final CallAiInsightViewPoint value) {
        this.backingStore.set("viewpoint", value);
    }
}
