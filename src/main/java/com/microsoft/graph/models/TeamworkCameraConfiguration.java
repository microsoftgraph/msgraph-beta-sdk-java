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
public class TeamworkCameraConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new TeamworkCameraConfiguration and sets the default values.
     */
    public TeamworkCameraConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkCameraConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkCameraConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkCameraConfiguration();
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
     * Gets the cameras property value. The cameras property
     * @return a java.util.List<TeamworkPeripheral>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TeamworkPeripheral> getCameras() {
        return this.backingStore.get("cameras");
    }
    /**
     * Gets the contentCameraConfiguration property value. The configuration for the content camera.
     * @return a TeamworkContentCameraConfiguration
     */
    @jakarta.annotation.Nullable
    public TeamworkContentCameraConfiguration getContentCameraConfiguration() {
        return this.backingStore.get("contentCameraConfiguration");
    }
    /**
     * Gets the defaultContentCamera property value. The defaultContentCamera property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getDefaultContentCamera() {
        return this.backingStore.get("defaultContentCamera");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cameras", (n) -> { this.setCameras(n.getCollectionOfObjectValues(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("contentCameraConfiguration", (n) -> { this.setContentCameraConfiguration(n.getObjectValue(TeamworkContentCameraConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultContentCamera", (n) -> { this.setDefaultContentCamera(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("cameras", this.getCameras());
        writer.writeObjectValue("contentCameraConfiguration", this.getContentCameraConfiguration());
        writer.writeObjectValue("defaultContentCamera", this.getDefaultContentCamera());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the cameras property value. The cameras property
     * @param value Value to set for the cameras property.
     */
    public void setCameras(@jakarta.annotation.Nullable final java.util.List<TeamworkPeripheral> value) {
        this.backingStore.set("cameras", value);
    }
    /**
     * Sets the contentCameraConfiguration property value. The configuration for the content camera.
     * @param value Value to set for the contentCameraConfiguration property.
     */
    public void setContentCameraConfiguration(@jakarta.annotation.Nullable final TeamworkContentCameraConfiguration value) {
        this.backingStore.set("contentCameraConfiguration", value);
    }
    /**
     * Sets the defaultContentCamera property value. The defaultContentCamera property
     * @param value Value to set for the defaultContentCamera property.
     */
    public void setDefaultContentCamera(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("defaultContentCamera", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
