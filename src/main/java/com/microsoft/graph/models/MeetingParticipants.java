package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingParticipants implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Information of the meeting attendees. */
    private java.util.List<MeetingParticipantInfo> _attendees;
    /** The contributors property */
    private java.util.List<MeetingParticipantInfo> _contributors;
    /** The OdataType property */
    private String _odataType;
    /** Information of the meeting organizer. */
    private MeetingParticipantInfo _organizer;
    /** The producers property */
    private java.util.List<MeetingParticipantInfo> _producers;
    /**
     * Instantiates a new meetingParticipants and sets the default values.
     * @return a void
     */
    public MeetingParticipants() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.meetingParticipants");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a meetingParticipants
     */
    @javax.annotation.Nonnull
    public static MeetingParticipants createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingParticipants();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the attendees property value. Information of the meeting attendees.
     * @return a meetingParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getAttendees() {
        return this._attendees;
    }
    /**
     * Gets the contributors property value. The contributors property
     * @return a meetingParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getContributors() {
        return this._contributors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingParticipants currentObject = this;
        return new HashMap<>(5) {{
            this.put("attendees", (n) -> { currentObject.setAttendees(n.getCollectionOfObjectValues(MeetingParticipantInfo::createFromDiscriminatorValue)); });
            this.put("contributors", (n) -> { currentObject.setContributors(n.getCollectionOfObjectValues(MeetingParticipantInfo::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("organizer", (n) -> { currentObject.setOrganizer(n.getObjectValue(MeetingParticipantInfo::createFromDiscriminatorValue)); });
            this.put("producers", (n) -> { currentObject.setProducers(n.getCollectionOfObjectValues(MeetingParticipantInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the organizer property value. Information of the meeting organizer.
     * @return a meetingParticipantInfo
     */
    @javax.annotation.Nullable
    public MeetingParticipantInfo getOrganizer() {
        return this._organizer;
    }
    /**
     * Gets the producers property value. The producers property
     * @return a meetingParticipantInfo
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getProducers() {
        return this._producers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the attendees property value. Information of the meeting attendees.
     * @param value Value to set for the attendees property.
     * @return a void
     */
    public void setAttendees(@javax.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this._attendees = value;
    }
    /**
     * Sets the contributors property value. The contributors property
     * @param value Value to set for the contributors property.
     * @return a void
     */
    public void setContributors(@javax.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this._contributors = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the organizer property value. Information of the meeting organizer.
     * @param value Value to set for the organizer property.
     * @return a void
     */
    public void setOrganizer(@javax.annotation.Nullable final MeetingParticipantInfo value) {
        this._organizer = value;
    }
    /**
     * Sets the producers property value. The producers property
     * @param value Value to set for the producers property.
     * @return a void
     */
    public void setProducers(@javax.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this._producers = value;
    }
}
