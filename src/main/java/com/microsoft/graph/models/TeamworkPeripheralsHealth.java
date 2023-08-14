package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkPeripheralsHealth implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The health details about the communication speaker.
     */
    private TeamworkPeripheralHealth communicationSpeakerHealth;
    /**
     * The health details about the content camera.
     */
    private TeamworkPeripheralHealth contentCameraHealth;
    /**
     * The health details about displays.
     */
    private java.util.List<TeamworkPeripheralHealth> displayHealthCollection;
    /**
     * The health details about the microphone.
     */
    private TeamworkPeripheralHealth microphoneHealth;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The health details about the room camera.
     */
    private TeamworkPeripheralHealth roomCameraHealth;
    /**
     * The health details about the speaker.
     */
    private TeamworkPeripheralHealth speakerHealth;
    /**
     * Instantiates a new teamworkPeripheralsHealth and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralsHealth() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkPeripheralsHealth
     */
    @javax.annotation.Nonnull
    public static TeamworkPeripheralsHealth createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkPeripheralsHealth();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the communicationSpeakerHealth property value. The health details about the communication speaker.
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralHealth getCommunicationSpeakerHealth() {
        return this.communicationSpeakerHealth;
    }
    /**
     * Gets the contentCameraHealth property value. The health details about the content camera.
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralHealth getContentCameraHealth() {
        return this.contentCameraHealth;
    }
    /**
     * Gets the displayHealthCollection property value. The health details about displays.
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkPeripheralHealth> getDisplayHealthCollection() {
        return this.displayHealthCollection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("communicationSpeakerHealth", (n) -> { this.setCommunicationSpeakerHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCameraHealth", (n) -> { this.setContentCameraHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("displayHealthCollection", (n) -> { this.setDisplayHealthCollection(n.getCollectionOfObjectValues(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("microphoneHealth", (n) -> { this.setMicrophoneHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("roomCameraHealth", (n) -> { this.setRoomCameraHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("speakerHealth", (n) -> { this.setSpeakerHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the microphoneHealth property value. The health details about the microphone.
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralHealth getMicrophoneHealth() {
        return this.microphoneHealth;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the roomCameraHealth property value. The health details about the room camera.
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralHealth getRoomCameraHealth() {
        return this.roomCameraHealth;
    }
    /**
     * Gets the speakerHealth property value. The health details about the speaker.
     * @return a teamworkPeripheralHealth
     */
    @javax.annotation.Nullable
    public TeamworkPeripheralHealth getSpeakerHealth() {
        return this.speakerHealth;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("communicationSpeakerHealth", this.getCommunicationSpeakerHealth());
        writer.writeObjectValue("contentCameraHealth", this.getContentCameraHealth());
        writer.writeCollectionOfObjectValues("displayHealthCollection", this.getDisplayHealthCollection());
        writer.writeObjectValue("microphoneHealth", this.getMicrophoneHealth());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("roomCameraHealth", this.getRoomCameraHealth());
        writer.writeObjectValue("speakerHealth", this.getSpeakerHealth());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the communicationSpeakerHealth property value. The health details about the communication speaker.
     * @param value Value to set for the communicationSpeakerHealth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommunicationSpeakerHealth(@javax.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.communicationSpeakerHealth = value;
    }
    /**
     * Sets the contentCameraHealth property value. The health details about the content camera.
     * @param value Value to set for the contentCameraHealth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCameraHealth(@javax.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.contentCameraHealth = value;
    }
    /**
     * Sets the displayHealthCollection property value. The health details about displays.
     * @param value Value to set for the displayHealthCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayHealthCollection(@javax.annotation.Nullable final java.util.List<TeamworkPeripheralHealth> value) {
        this.displayHealthCollection = value;
    }
    /**
     * Sets the microphoneHealth property value. The health details about the microphone.
     * @param value Value to set for the microphoneHealth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrophoneHealth(@javax.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.microphoneHealth = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the roomCameraHealth property value. The health details about the room camera.
     * @param value Value to set for the roomCameraHealth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoomCameraHealth(@javax.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.roomCameraHealth = value;
    }
    /**
     * Sets the speakerHealth property value. The health details about the speaker.
     * @param value Value to set for the speakerHealth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpeakerHealth(@javax.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.speakerHealth = value;
    }
}
