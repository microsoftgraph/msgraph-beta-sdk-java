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
public class TeamworkMicrophoneConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new TeamworkMicrophoneConfiguration and sets the default values.
     */
    public TeamworkMicrophoneConfiguration() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkMicrophoneConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkMicrophoneConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkMicrophoneConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the defaultMicrophone property value. The defaultMicrophone property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getDefaultMicrophone() {
        return this.BackingStore.get("defaultMicrophone");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("defaultMicrophone", (n) -> { this.setDefaultMicrophone(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("isMicrophoneOptional", (n) -> { this.setIsMicrophoneOptional(n.getBooleanValue()); });
        deserializerMap.put("microphones", (n) -> { this.setMicrophones(n.getCollectionOfObjectValues(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMicrophoneOptional property value. True if the configured microphone is optional. False if the microphone is not optional and the health state of the device should be computed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMicrophoneOptional() {
        return this.BackingStore.get("isMicrophoneOptional");
    }
    /**
     * Gets the microphones property value. The microphones property
     * @return a java.util.List<TeamworkPeripheral>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkPeripheral> getMicrophones() {
        return this.BackingStore.get("microphones");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("defaultMicrophone", this.getDefaultMicrophone());
        writer.writeBooleanValue("isMicrophoneOptional", this.getIsMicrophoneOptional());
        writer.writeCollectionOfObjectValues("microphones", this.getMicrophones());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the defaultMicrophone property value. The defaultMicrophone property
     * @param value Value to set for the defaultMicrophone property.
     */
    public void setDefaultMicrophone(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.BackingStore.set("defaultMicrophone", value);
    }
    /**
     * Sets the isMicrophoneOptional property value. True if the configured microphone is optional. False if the microphone is not optional and the health state of the device should be computed.
     * @param value Value to set for the isMicrophoneOptional property.
     */
    public void setIsMicrophoneOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isMicrophoneOptional", value);
    }
    /**
     * Sets the microphones property value. The microphones property
     * @param value Value to set for the microphones property.
     */
    public void setMicrophones(@jakarta.annotation.Nullable final java.util.List<TeamworkPeripheral> value) {
        this.BackingStore.set("microphones", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
