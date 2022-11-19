package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkActivePeripherals implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The communicationSpeaker property */
    private TeamworkPeripheral _communicationSpeaker;
    /** The contentCamera property */
    private TeamworkPeripheral _contentCamera;
    /** The microphone property */
    private TeamworkPeripheral _microphone;
    /** The OdataType property */
    private String _odataType;
    /** The roomCamera property */
    private TeamworkPeripheral _roomCamera;
    /** The speaker property */
    private TeamworkPeripheral _speaker;
    /**
     * Instantiates a new teamworkActivePeripherals and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkActivePeripherals() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkActivePeripherals");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkActivePeripherals
     */
    @javax.annotation.Nonnull
    public static TeamworkActivePeripherals createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkActivePeripherals();
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
     * Gets the communicationSpeaker property value. The communicationSpeaker property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getCommunicationSpeaker() {
        return this._communicationSpeaker;
    }
    /**
     * Gets the contentCamera property value. The contentCamera property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getContentCamera() {
        return this._contentCamera;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkActivePeripherals currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("communicationSpeaker", (n) -> { currentObject.setCommunicationSpeaker(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCamera", (n) -> { currentObject.setContentCamera(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("microphone", (n) -> { currentObject.setMicrophone(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("roomCamera", (n) -> { currentObject.setRoomCamera(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("speaker", (n) -> { currentObject.setSpeaker(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the microphone property value. The microphone property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getMicrophone() {
        return this._microphone;
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
     * Gets the roomCamera property value. The roomCamera property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getRoomCamera() {
        return this._roomCamera;
    }
    /**
     * Gets the speaker property value. The speaker property
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nullable
    public TeamworkPeripheral getSpeaker() {
        return this._speaker;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("communicationSpeaker", this.getCommunicationSpeaker());
        writer.writeObjectValue("contentCamera", this.getContentCamera());
        writer.writeObjectValue("microphone", this.getMicrophone());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("roomCamera", this.getRoomCamera());
        writer.writeObjectValue("speaker", this.getSpeaker());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the communicationSpeaker property value. The communicationSpeaker property
     * @param value Value to set for the communicationSpeaker property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommunicationSpeaker(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._communicationSpeaker = value;
    }
    /**
     * Sets the contentCamera property value. The contentCamera property
     * @param value Value to set for the contentCamera property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentCamera(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._contentCamera = value;
    }
    /**
     * Sets the microphone property value. The microphone property
     * @param value Value to set for the microphone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrophone(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._microphone = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the roomCamera property value. The roomCamera property
     * @param value Value to set for the roomCamera property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoomCamera(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._roomCamera = value;
    }
    /**
     * Sets the speaker property value. The speaker property
     * @param value Value to set for the speaker property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpeaker(@javax.annotation.Nullable final TeamworkPeripheral value) {
        this._speaker = value;
    }
}
