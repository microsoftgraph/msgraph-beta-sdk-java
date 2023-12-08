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
public class TeamworkSpeakerConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TeamworkSpeakerConfiguration and sets the default values.
     */
    public TeamworkSpeakerConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkSpeakerConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkSpeakerConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkSpeakerConfiguration();
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
     * Gets the defaultCommunicationSpeaker property value. The defaultCommunicationSpeaker property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getDefaultCommunicationSpeaker() {
        return this.backingStore.get("defaultCommunicationSpeaker");
    }
    /**
     * Gets the defaultSpeaker property value. The defaultSpeaker property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getDefaultSpeaker() {
        return this.backingStore.get("defaultSpeaker");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("defaultCommunicationSpeaker", (n) -> { this.setDefaultCommunicationSpeaker(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultSpeaker", (n) -> { this.setDefaultSpeaker(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("isCommunicationSpeakerOptional", (n) -> { this.setIsCommunicationSpeakerOptional(n.getBooleanValue()); });
        deserializerMap.put("isSpeakerOptional", (n) -> { this.setIsSpeakerOptional(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("speakers", (n) -> { this.setSpeakers(n.getCollectionOfObjectValues(TeamworkPeripheral::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isCommunicationSpeakerOptional property value. True if the communication speaker is optional. Used to compute the health state if the communication speaker is not optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCommunicationSpeakerOptional() {
        return this.backingStore.get("isCommunicationSpeakerOptional");
    }
    /**
     * Gets the isSpeakerOptional property value. True if the configured speaker is optional. Used to compute the health state if the speaker is not optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSpeakerOptional() {
        return this.backingStore.get("isSpeakerOptional");
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
     * Gets the speakers property value. The speakers property
     * @return a java.util.List<TeamworkPeripheral>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkPeripheral> getSpeakers() {
        return this.backingStore.get("speakers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("defaultCommunicationSpeaker", this.getDefaultCommunicationSpeaker());
        writer.writeObjectValue("defaultSpeaker", this.getDefaultSpeaker());
        writer.writeBooleanValue("isCommunicationSpeakerOptional", this.getIsCommunicationSpeakerOptional());
        writer.writeBooleanValue("isSpeakerOptional", this.getIsSpeakerOptional());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("speakers", this.getSpeakers());
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
     * Sets the defaultCommunicationSpeaker property value. The defaultCommunicationSpeaker property
     * @param value Value to set for the defaultCommunicationSpeaker property.
     */
    public void setDefaultCommunicationSpeaker(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("defaultCommunicationSpeaker", value);
    }
    /**
     * Sets the defaultSpeaker property value. The defaultSpeaker property
     * @param value Value to set for the defaultSpeaker property.
     */
    public void setDefaultSpeaker(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("defaultSpeaker", value);
    }
    /**
     * Sets the isCommunicationSpeakerOptional property value. True if the communication speaker is optional. Used to compute the health state if the communication speaker is not optional.
     * @param value Value to set for the isCommunicationSpeakerOptional property.
     */
    public void setIsCommunicationSpeakerOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCommunicationSpeakerOptional", value);
    }
    /**
     * Sets the isSpeakerOptional property value. True if the configured speaker is optional. Used to compute the health state if the speaker is not optional.
     * @param value Value to set for the isSpeakerOptional property.
     */
    public void setIsSpeakerOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSpeakerOptional", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the speakers property value. The speakers property
     * @param value Value to set for the speakers property.
     */
    public void setSpeakers(@jakarta.annotation.Nullable final java.util.List<TeamworkPeripheral> value) {
        this.backingStore.set("speakers", value);
    }
}
