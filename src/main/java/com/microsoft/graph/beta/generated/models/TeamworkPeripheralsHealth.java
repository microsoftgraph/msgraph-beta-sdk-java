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
public class TeamworkPeripheralsHealth implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TeamworkPeripheralsHealth and sets the default values.
     */
    public TeamworkPeripheralsHealth() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkPeripheralsHealth
     */
    @jakarta.annotation.Nonnull
    public static TeamworkPeripheralsHealth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkPeripheralsHealth();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the communicationSpeakerHealth property value. The health details about the communication speaker.
     * @return a TeamworkPeripheralHealth
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheralHealth getCommunicationSpeakerHealth() {
        return this.backingStore.get("communicationSpeakerHealth");
    }
    /**
     * Gets the contentCameraHealth property value. The health details about the content camera.
     * @return a TeamworkPeripheralHealth
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheralHealth getContentCameraHealth() {
        return this.backingStore.get("contentCameraHealth");
    }
    /**
     * Gets the displayHealthCollection property value. The health details about displays.
     * @return a java.util.List<TeamworkPeripheralHealth>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkPeripheralHealth> getDisplayHealthCollection() {
        return this.backingStore.get("displayHealthCollection");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a TeamworkPeripheralHealth
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheralHealth getMicrophoneHealth() {
        return this.backingStore.get("microphoneHealth");
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
     * Gets the roomCameraHealth property value. The health details about the room camera.
     * @return a TeamworkPeripheralHealth
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheralHealth getRoomCameraHealth() {
        return this.backingStore.get("roomCameraHealth");
    }
    /**
     * Gets the speakerHealth property value. The health details about the speaker.
     * @return a TeamworkPeripheralHealth
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheralHealth getSpeakerHealth() {
        return this.backingStore.get("speakerHealth");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
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
     * Sets the communicationSpeakerHealth property value. The health details about the communication speaker.
     * @param value Value to set for the communicationSpeakerHealth property.
     */
    public void setCommunicationSpeakerHealth(@jakarta.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.backingStore.set("communicationSpeakerHealth", value);
    }
    /**
     * Sets the contentCameraHealth property value. The health details about the content camera.
     * @param value Value to set for the contentCameraHealth property.
     */
    public void setContentCameraHealth(@jakarta.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.backingStore.set("contentCameraHealth", value);
    }
    /**
     * Sets the displayHealthCollection property value. The health details about displays.
     * @param value Value to set for the displayHealthCollection property.
     */
    public void setDisplayHealthCollection(@jakarta.annotation.Nullable final java.util.List<TeamworkPeripheralHealth> value) {
        this.backingStore.set("displayHealthCollection", value);
    }
    /**
     * Sets the microphoneHealth property value. The health details about the microphone.
     * @param value Value to set for the microphoneHealth property.
     */
    public void setMicrophoneHealth(@jakarta.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.backingStore.set("microphoneHealth", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the roomCameraHealth property value. The health details about the room camera.
     * @param value Value to set for the roomCameraHealth property.
     */
    public void setRoomCameraHealth(@jakarta.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.backingStore.set("roomCameraHealth", value);
    }
    /**
     * Sets the speakerHealth property value. The health details about the speaker.
     * @param value Value to set for the speakerHealth property.
     */
    public void setSpeakerHealth(@jakarta.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.backingStore.set("speakerHealth", value);
    }
}
