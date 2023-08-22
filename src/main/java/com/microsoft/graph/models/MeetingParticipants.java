package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingParticipants implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Information of the meeting attendees.
     */
    private java.util.List<MeetingParticipantInfo> attendees;
    /**
     * The contributors property
     */
    private java.util.List<MeetingParticipantInfo> contributors;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Information of the meeting organizer.
     */
    private MeetingParticipantInfo organizer;
    /**
     * The producers property
     */
    private java.util.List<MeetingParticipantInfo> producers;
    /**
     * Instantiates a new meetingParticipants and sets the default values.
     */
    public MeetingParticipants() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingParticipants
     */
    @jakarta.annotation.Nonnull
    public static MeetingParticipants createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingParticipants();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the attendees property value. Information of the meeting attendees.
     * @return a meetingParticipantInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getAttendees() {
        return this.attendees;
    }
    /**
     * Gets the contributors property value. The contributors property
     * @return a meetingParticipantInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getContributors() {
        return this.contributors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("attendees", (n) -> { this.setAttendees(n.getCollectionOfObjectValues(MeetingParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("contributors", (n) -> { this.setContributors(n.getCollectionOfObjectValues(MeetingParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("organizer", (n) -> { this.setOrganizer(n.getObjectValue(MeetingParticipantInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("producers", (n) -> { this.setProducers(n.getCollectionOfObjectValues(MeetingParticipantInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the organizer property value. Information of the meeting organizer.
     * @return a meetingParticipantInfo
     */
    @jakarta.annotation.Nullable
    public MeetingParticipantInfo getOrganizer() {
        return this.organizer;
    }
    /**
     * Gets the producers property value. The producers property
     * @return a meetingParticipantInfo
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getProducers() {
        return this.producers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attendees", this.getAttendees());
        writer.writeCollectionOfObjectValues("contributors", this.getContributors());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("organizer", this.getOrganizer());
        writer.writeCollectionOfObjectValues("producers", this.getProducers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the attendees property value. Information of the meeting attendees.
     * @param value Value to set for the attendees property.
     */
    public void setAttendees(@jakarta.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this.attendees = value;
    }
    /**
     * Sets the contributors property value. The contributors property
     * @param value Value to set for the contributors property.
     */
    public void setContributors(@jakarta.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this.contributors = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the organizer property value. Information of the meeting organizer.
     * @param value Value to set for the organizer property.
     */
    public void setOrganizer(@jakarta.annotation.Nullable final MeetingParticipantInfo value) {
        this.organizer = value;
    }
    /**
     * Sets the producers property value. The producers property
     * @param value Value to set for the producers property.
     */
    public void setProducers(@jakarta.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this.producers = value;
    }
}
