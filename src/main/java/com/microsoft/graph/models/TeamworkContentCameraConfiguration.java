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
public class TeamworkContentCameraConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new TeamworkContentCameraConfiguration and sets the default values.
     */
    public TeamworkContentCameraConfiguration() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkContentCameraConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkContentCameraConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkContentCameraConfiguration();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("isContentCameraInverted", (n) -> { this.setIsContentCameraInverted(n.getBooleanValue()); });
        deserializerMap.put("isContentCameraOptional", (n) -> { this.setIsContentCameraOptional(n.getBooleanValue()); });
        deserializerMap.put("isContentEnhancementEnabled", (n) -> { this.setIsContentEnhancementEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isContentCameraInverted property value. True if the content camera is inverted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentCameraInverted() {
        return this.BackingStore.get("isContentCameraInverted");
    }
    /**
     * Gets the isContentCameraOptional property value. True if the content camera is optional.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentCameraOptional() {
        return this.BackingStore.get("isContentCameraOptional");
    }
    /**
     * Gets the isContentEnhancementEnabled property value. True if the content enhancement is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentEnhancementEnabled() {
        return this.BackingStore.get("isContentEnhancementEnabled");
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
        writer.writeBooleanValue("isContentCameraInverted", this.getIsContentCameraInverted());
        writer.writeBooleanValue("isContentCameraOptional", this.getIsContentCameraOptional());
        writer.writeBooleanValue("isContentEnhancementEnabled", this.getIsContentEnhancementEnabled());
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
     * Sets the isContentCameraInverted property value. True if the content camera is inverted.
     * @param value Value to set for the isContentCameraInverted property.
     */
    public void setIsContentCameraInverted(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isContentCameraInverted", value);
    }
    /**
     * Sets the isContentCameraOptional property value. True if the content camera is optional.
     * @param value Value to set for the isContentCameraOptional property.
     */
    public void setIsContentCameraOptional(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isContentCameraOptional", value);
    }
    /**
     * Sets the isContentEnhancementEnabled property value. True if the content enhancement is enabled.
     * @param value Value to set for the isContentEnhancementEnabled property.
     */
    public void setIsContentEnhancementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isContentEnhancementEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
