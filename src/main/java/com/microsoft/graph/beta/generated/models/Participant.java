package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Participant extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Participant} and sets the default values.
     */
    public Participant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Participant}
     */
    @jakarta.annotation.Nonnull
    public static Participant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Participant();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("info", (n) -> { this.setInfo(n.getObjectValue(ParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("isIdentityAnonymized", (n) -> { this.setIsIdentityAnonymized(n.getBooleanValue()); });
        deserializerMap.put("isInLobby", (n) -> { this.setIsInLobby(n.getBooleanValue()); });
        deserializerMap.put("isMuted", (n) -> { this.setIsMuted(n.getBooleanValue()); });
        deserializerMap.put("mediaStreams", (n) -> { this.setMediaStreams(n.getCollectionOfObjectValues(MediaStream::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getStringValue()); });
        deserializerMap.put("preferredDisplayName", (n) -> { this.setPreferredDisplayName(n.getStringValue()); });
        deserializerMap.put("recordingInfo", (n) -> { this.setRecordingInfo(n.getObjectValue(RecordingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("removedState", (n) -> { this.setRemovedState(n.getObjectValue(RemovedState::createFromDiscriminatorValue)); });
        deserializerMap.put("restrictedExperience", (n) -> { this.setRestrictedExperience(n.getObjectValue(OnlineMeetingRestricted::createFromDiscriminatorValue)); });
        deserializerMap.put("rosterSequenceNumber", (n) -> { this.setRosterSequenceNumber(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the info property value. The info property
     * @return a {@link ParticipantInfo}
     */
    @jakarta.annotation.Nullable
    public ParticipantInfo getInfo() {
        return this.backingStore.get("info");
    }
    /**
     * Gets the isIdentityAnonymized property value. The isIdentityAnonymized property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsIdentityAnonymized() {
        return this.backingStore.get("isIdentityAnonymized");
    }
    /**
     * Gets the isInLobby property value. true if the participant is in lobby.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInLobby() {
        return this.backingStore.get("isInLobby");
    }
    /**
     * Gets the isMuted property value. true if the participant is muted (client or server muted).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMuted() {
        return this.backingStore.get("isMuted");
    }
    /**
     * Gets the mediaStreams property value. The list of media streams.
     * @return a {@link java.util.List<MediaStream>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MediaStream> getMediaStreams() {
        return this.backingStore.get("mediaStreams");
    }
    /**
     * Gets the metadata property value. A blob of data provided by the participant in the roster.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetadata() {
        return this.backingStore.get("metadata");
    }
    /**
     * Gets the preferredDisplayName property value. The participant&apos;s preferred display name that overrides the original display name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredDisplayName() {
        return this.backingStore.get("preferredDisplayName");
    }
    /**
     * Gets the recordingInfo property value. Information on whether the participant has recording capability.
     * @return a {@link RecordingInfo}
     */
    @jakarta.annotation.Nullable
    public RecordingInfo getRecordingInfo() {
        return this.backingStore.get("recordingInfo");
    }
    /**
     * Gets the removedState property value. Indicates the reason why the participant was removed from the roster.
     * @return a {@link RemovedState}
     */
    @jakarta.annotation.Nullable
    public RemovedState getRemovedState() {
        return this.backingStore.get("removedState");
    }
    /**
     * Gets the restrictedExperience property value. Indicates the reason or reasons why media content from this participant is restricted.
     * @return a {@link OnlineMeetingRestricted}
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingRestricted getRestrictedExperience() {
        return this.backingStore.get("restrictedExperience");
    }
    /**
     * Gets the rosterSequenceNumber property value. Indicates the roster sequence number the participant was last updated in.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRosterSequenceNumber() {
        return this.backingStore.get("rosterSequenceNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("info", this.getInfo());
        writer.writeBooleanValue("isIdentityAnonymized", this.getIsIdentityAnonymized());
        writer.writeBooleanValue("isInLobby", this.getIsInLobby());
        writer.writeBooleanValue("isMuted", this.getIsMuted());
        writer.writeCollectionOfObjectValues("mediaStreams", this.getMediaStreams());
        writer.writeStringValue("metadata", this.getMetadata());
        writer.writeStringValue("preferredDisplayName", this.getPreferredDisplayName());
        writer.writeObjectValue("recordingInfo", this.getRecordingInfo());
        writer.writeObjectValue("removedState", this.getRemovedState());
        writer.writeObjectValue("restrictedExperience", this.getRestrictedExperience());
        writer.writeLongValue("rosterSequenceNumber", this.getRosterSequenceNumber());
    }
    /**
     * Sets the info property value. The info property
     * @param value Value to set for the info property.
     */
    public void setInfo(@jakarta.annotation.Nullable final ParticipantInfo value) {
        this.backingStore.set("info", value);
    }
    /**
     * Sets the isIdentityAnonymized property value. The isIdentityAnonymized property
     * @param value Value to set for the isIdentityAnonymized property.
     */
    public void setIsIdentityAnonymized(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isIdentityAnonymized", value);
    }
    /**
     * Sets the isInLobby property value. true if the participant is in lobby.
     * @param value Value to set for the isInLobby property.
     */
    public void setIsInLobby(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInLobby", value);
    }
    /**
     * Sets the isMuted property value. true if the participant is muted (client or server muted).
     * @param value Value to set for the isMuted property.
     */
    public void setIsMuted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMuted", value);
    }
    /**
     * Sets the mediaStreams property value. The list of media streams.
     * @param value Value to set for the mediaStreams property.
     */
    public void setMediaStreams(@jakarta.annotation.Nullable final java.util.List<MediaStream> value) {
        this.backingStore.set("mediaStreams", value);
    }
    /**
     * Sets the metadata property value. A blob of data provided by the participant in the roster.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("metadata", value);
    }
    /**
     * Sets the preferredDisplayName property value. The participant&apos;s preferred display name that overrides the original display name.
     * @param value Value to set for the preferredDisplayName property.
     */
    public void setPreferredDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredDisplayName", value);
    }
    /**
     * Sets the recordingInfo property value. Information on whether the participant has recording capability.
     * @param value Value to set for the recordingInfo property.
     */
    public void setRecordingInfo(@jakarta.annotation.Nullable final RecordingInfo value) {
        this.backingStore.set("recordingInfo", value);
    }
    /**
     * Sets the removedState property value. Indicates the reason why the participant was removed from the roster.
     * @param value Value to set for the removedState property.
     */
    public void setRemovedState(@jakarta.annotation.Nullable final RemovedState value) {
        this.backingStore.set("removedState", value);
    }
    /**
     * Sets the restrictedExperience property value. Indicates the reason or reasons why media content from this participant is restricted.
     * @param value Value to set for the restrictedExperience property.
     */
    public void setRestrictedExperience(@jakarta.annotation.Nullable final OnlineMeetingRestricted value) {
        this.backingStore.set("restrictedExperience", value);
    }
    /**
     * Sets the rosterSequenceNumber property value. Indicates the roster sequence number the participant was last updated in.
     * @param value Value to set for the rosterSequenceNumber property.
     */
    public void setRosterSequenceNumber(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("rosterSequenceNumber", value);
    }
}
