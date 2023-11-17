package com.microsoft.graph.models;

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
public class TeamworkActivePeripherals implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TeamworkActivePeripherals and sets the default values.
     */
    public TeamworkActivePeripherals() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkActivePeripherals
     */
    @jakarta.annotation.Nonnull
    public static TeamworkActivePeripherals createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkActivePeripherals();
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
     * Gets the communicationSpeaker property value. The communicationSpeaker property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getCommunicationSpeaker() {
        return this.backingStore.get("communicationSpeaker");
    }
    /**
     * Gets the contentCamera property value. The contentCamera property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getContentCamera() {
        return this.backingStore.get("contentCamera");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("communicationSpeaker", (n) -> { this.setCommunicationSpeaker(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCamera", (n) -> { this.setContentCamera(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("microphone", (n) -> { this.setMicrophone(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("roomCamera", (n) -> { this.setRoomCamera(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("speaker", (n) -> { this.setSpeaker(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the microphone property value. The microphone property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getMicrophone() {
        return this.backingStore.get("microphone");
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
     * Gets the roomCamera property value. The roomCamera property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getRoomCamera() {
        return this.backingStore.get("roomCamera");
    }
    /**
     * Gets the speaker property value. The speaker property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getSpeaker() {
        return this.backingStore.get("speaker");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the communicationSpeaker property value. The communicationSpeaker property
     * @param value Value to set for the communicationSpeaker property.
     */
    public void setCommunicationSpeaker(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("communicationSpeaker", value);
    }
    /**
     * Sets the contentCamera property value. The contentCamera property
     * @param value Value to set for the contentCamera property.
     */
    public void setContentCamera(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("contentCamera", value);
    }
    /**
     * Sets the microphone property value. The microphone property
     * @param value Value to set for the microphone property.
     */
    public void setMicrophone(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("microphone", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the roomCamera property value. The roomCamera property
     * @param value Value to set for the roomCamera property.
     */
    public void setRoomCamera(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("roomCamera", value);
    }
    /**
     * Sets the speaker property value. The speaker property
     * @param value Value to set for the speaker property.
     */
    public void setSpeaker(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("speaker", value);
    }
}
