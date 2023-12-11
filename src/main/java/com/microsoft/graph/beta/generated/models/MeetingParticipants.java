package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingParticipants implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new MeetingParticipants and sets the default values.
     */
    public MeetingParticipants() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingParticipants
     */
    @jakarta.annotation.Nonnull
    public static MeetingParticipants createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingParticipants();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the attendees property value. Information of the meeting attendees.
     * @return a java.util.List<MeetingParticipantInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getAttendees() {
        return this.backingStore.get("attendees");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the contributors property value. The contributors property
     * @return a java.util.List<MeetingParticipantInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getContributors() {
        return this.backingStore.get("contributors");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the organizer property value. Information of the meeting organizer.
     * @return a MeetingParticipantInfo
     */
    @jakarta.annotation.Nullable
    public MeetingParticipantInfo getOrganizer() {
        return this.backingStore.get("organizer");
    }
    /**
     * Gets the producers property value. The producers property
     * @return a java.util.List<MeetingParticipantInfo>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingParticipantInfo> getProducers() {
        return this.backingStore.get("producers");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the attendees property value. Information of the meeting attendees.
     * @param value Value to set for the attendees property.
     */
    public void setAttendees(@jakarta.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this.backingStore.set("attendees", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the contributors property value. The contributors property
     * @param value Value to set for the contributors property.
     */
    public void setContributors(@jakarta.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this.backingStore.set("contributors", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the organizer property value. Information of the meeting organizer.
     * @param value Value to set for the organizer property.
     */
    public void setOrganizer(@jakarta.annotation.Nullable final MeetingParticipantInfo value) {
        this.backingStore.set("organizer", value);
    }
    /**
     * Sets the producers property value. The producers property
     * @param value Value to set for the producers property.
     */
    public void setProducers(@jakarta.annotation.Nullable final java.util.List<MeetingParticipantInfo> value) {
        this.backingStore.set("producers", value);
    }
}
