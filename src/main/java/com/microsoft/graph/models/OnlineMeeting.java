package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnlineMeeting extends OnlineMeetingBase implements Parsable {
    /**
     * Instantiates a new OnlineMeeting and sets the default values.
     */
    public OnlineMeeting() {
        super();
        this.setOdataType("#microsoft.graph.onlineMeeting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnlineMeeting
     */
    @jakarta.annotation.Nonnull
    public static OnlineMeeting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnlineMeeting();
    }
    /**
     * Gets the alternativeRecording property value. The alternativeRecording property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getAlternativeRecording() {
        return this.BackingStore.get("alternativeRecording");
    }
    /**
     * Gets the attendeeReport property value. The attendeeReport property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getAttendeeReport() {
        return this.BackingStore.get("attendeeReport");
    }
    /**
     * Gets the broadcastRecording property value. The broadcastRecording property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getBroadcastRecording() {
        return this.BackingStore.get("broadcastRecording");
    }
    /**
     * Gets the broadcastSettings property value. The broadcastSettings property
     * @return a BroadcastMeetingSettings
     */
    @jakarta.annotation.Nullable
    public BroadcastMeetingSettings getBroadcastSettings() {
        return this.BackingStore.get("broadcastSettings");
    }
    /**
     * Gets the capabilities property value. The capabilities property
     * @return a java.util.List<MeetingCapabilities>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingCapabilities> getCapabilities() {
        return this.BackingStore.get("capabilities");
    }
    /**
     * Gets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.BackingStore.get("creationDateTime");
    }
    /**
     * Gets the endDateTime property value. The meeting end time in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.BackingStore.get("endDateTime");
    }
    /**
     * Gets the externalId property value. The external ID. A custom ID. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.BackingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alternativeRecording", (n) -> { this.setAlternativeRecording(n.getByteArrayValue()); });
        deserializerMap.put("attendeeReport", (n) -> { this.setAttendeeReport(n.getByteArrayValue()); });
        deserializerMap.put("broadcastRecording", (n) -> { this.setBroadcastRecording(n.getByteArrayValue()); });
        deserializerMap.put("broadcastSettings", (n) -> { this.setBroadcastSettings(n.getObjectValue(BroadcastMeetingSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getCollectionOfEnumValues(MeetingCapabilities.class)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("isBroadcast", (n) -> { this.setIsBroadcast(n.getBooleanValue()); });
        deserializerMap.put("joinUrl", (n) -> { this.setJoinUrl(n.getStringValue()); });
        deserializerMap.put("meetingAttendanceReport", (n) -> { this.setMeetingAttendanceReport(n.getObjectValue(MeetingAttendanceReport::createFromDiscriminatorValue)); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getObjectValue(MeetingParticipants::createFromDiscriminatorValue)); });
        deserializerMap.put("recording", (n) -> { this.setRecording(n.getByteArrayValue()); });
        deserializerMap.put("recordings", (n) -> { this.setRecordings(n.getCollectionOfObjectValues(CallRecording::createFromDiscriminatorValue)); });
        deserializerMap.put("registration", (n) -> { this.setRegistration(n.getObjectValue(MeetingRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("transcripts", (n) -> { this.setTranscripts(n.getCollectionOfObjectValues(CallTranscript::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isBroadcast property value. The isBroadcast property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBroadcast() {
        return this.BackingStore.get("isBroadcast");
    }
    /**
     * Gets the joinUrl property value. The joinUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJoinUrl() {
        return this.BackingStore.get("joinUrl");
    }
    /**
     * Gets the meetingAttendanceReport property value. The meetingAttendanceReport property
     * @return a MeetingAttendanceReport
     */
    @jakarta.annotation.Nullable
    public MeetingAttendanceReport getMeetingAttendanceReport() {
        return this.BackingStore.get("meetingAttendanceReport");
    }
    /**
     * Gets the participants property value. The participants associated with the online meeting. This includes the organizer and the attendees.
     * @return a MeetingParticipants
     */
    @jakarta.annotation.Nullable
    public MeetingParticipants getParticipants() {
        return this.BackingStore.get("participants");
    }
    /**
     * Gets the recording property value. The recording property
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getRecording() {
        return this.BackingStore.get("recording");
    }
    /**
     * Gets the recordings property value. The recordings of an online meeting. Read-only.
     * @return a java.util.List<CallRecording>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallRecording> getRecordings() {
        return this.BackingStore.get("recordings");
    }
    /**
     * Gets the registration property value. The registration that has been enabled for an online meeting. One online meeting can only have one registration enabled.
     * @return a MeetingRegistration
     */
    @jakarta.annotation.Nullable
    public MeetingRegistration getRegistration() {
        return this.BackingStore.get("registration");
    }
    /**
     * Gets the startDateTime property value. The meeting start time in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.BackingStore.get("startDateTime");
    }
    /**
     * Gets the transcripts property value. The transcripts of an online meeting. Read-only.
     * @return a java.util.List<CallTranscript>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CallTranscript> getTranscripts() {
        return this.BackingStore.get("transcripts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("alternativeRecording", this.getAlternativeRecording());
        writer.writeByteArrayValue("attendeeReport", this.getAttendeeReport());
        writer.writeByteArrayValue("broadcastRecording", this.getBroadcastRecording());
        writer.writeObjectValue("broadcastSettings", this.getBroadcastSettings());
        writer.writeCollectionOfEnumValues("capabilities", this.getCapabilities());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeBooleanValue("isBroadcast", this.getIsBroadcast());
        writer.writeStringValue("joinUrl", this.getJoinUrl());
        writer.writeObjectValue("meetingAttendanceReport", this.getMeetingAttendanceReport());
        writer.writeObjectValue("participants", this.getParticipants());
        writer.writeByteArrayValue("recording", this.getRecording());
        writer.writeCollectionOfObjectValues("recordings", this.getRecordings());
        writer.writeObjectValue("registration", this.getRegistration());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeCollectionOfObjectValues("transcripts", this.getTranscripts());
    }
    /**
     * Sets the alternativeRecording property value. The alternativeRecording property
     * @param value Value to set for the alternativeRecording property.
     */
    public void setAlternativeRecording(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("alternativeRecording", value);
    }
    /**
     * Sets the attendeeReport property value. The attendeeReport property
     * @param value Value to set for the attendeeReport property.
     */
    public void setAttendeeReport(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("attendeeReport", value);
    }
    /**
     * Sets the broadcastRecording property value. The broadcastRecording property
     * @param value Value to set for the broadcastRecording property.
     */
    public void setBroadcastRecording(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("broadcastRecording", value);
    }
    /**
     * Sets the broadcastSettings property value. The broadcastSettings property
     * @param value Value to set for the broadcastSettings property.
     */
    public void setBroadcastSettings(@jakarta.annotation.Nullable final BroadcastMeetingSettings value) {
        this.BackingStore.set("broadcastSettings", value);
    }
    /**
     * Sets the capabilities property value. The capabilities property
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final java.util.List<MeetingCapabilities> value) {
        this.BackingStore.set("capabilities", value);
    }
    /**
     * Sets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @param value Value to set for the creationDateTime property.
     */
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("creationDateTime", value);
    }
    /**
     * Sets the endDateTime property value. The meeting end time in UTC.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("endDateTime", value);
    }
    /**
     * Sets the externalId property value. The external ID. A custom ID. Optional.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("externalId", value);
    }
    /**
     * Sets the isBroadcast property value. The isBroadcast property
     * @param value Value to set for the isBroadcast property.
     */
    public void setIsBroadcast(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isBroadcast", value);
    }
    /**
     * Sets the joinUrl property value. The joinUrl property
     * @param value Value to set for the joinUrl property.
     */
    public void setJoinUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("joinUrl", value);
    }
    /**
     * Sets the meetingAttendanceReport property value. The meetingAttendanceReport property
     * @param value Value to set for the meetingAttendanceReport property.
     */
    public void setMeetingAttendanceReport(@jakarta.annotation.Nullable final MeetingAttendanceReport value) {
        this.BackingStore.set("meetingAttendanceReport", value);
    }
    /**
     * Sets the participants property value. The participants associated with the online meeting. This includes the organizer and the attendees.
     * @param value Value to set for the participants property.
     */
    public void setParticipants(@jakarta.annotation.Nullable final MeetingParticipants value) {
        this.BackingStore.set("participants", value);
    }
    /**
     * Sets the recording property value. The recording property
     * @param value Value to set for the recording property.
     */
    public void setRecording(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("recording", value);
    }
    /**
     * Sets the recordings property value. The recordings of an online meeting. Read-only.
     * @param value Value to set for the recordings property.
     */
    public void setRecordings(@jakarta.annotation.Nullable final java.util.List<CallRecording> value) {
        this.BackingStore.set("recordings", value);
    }
    /**
     * Sets the registration property value. The registration that has been enabled for an online meeting. One online meeting can only have one registration enabled.
     * @param value Value to set for the registration property.
     */
    public void setRegistration(@jakarta.annotation.Nullable final MeetingRegistration value) {
        this.BackingStore.set("registration", value);
    }
    /**
     * Sets the startDateTime property value. The meeting start time in UTC.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("startDateTime", value);
    }
    /**
     * Sets the transcripts property value. The transcripts of an online meeting. Read-only.
     * @param value Value to set for the transcripts property.
     */
    public void setTranscripts(@jakarta.annotation.Nullable final java.util.List<CallTranscript> value) {
        this.BackingStore.set("transcripts", value);
    }
}
