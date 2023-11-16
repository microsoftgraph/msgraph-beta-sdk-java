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
public class TeamworkHardwareHealth implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new TeamworkHardwareHealth and sets the default values.
     */
    public TeamworkHardwareHealth() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkHardwareHealth
     */
    @jakarta.annotation.Nonnull
    public static TeamworkHardwareHealth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkHardwareHealth();
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
     * Gets the computeHealth property value. The system health details for a teamworkDevice.
     * @return a TeamworkPeripheralHealth
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheralHealth getComputeHealth() {
        return this.BackingStore.get("computeHealth");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("computeHealth", (n) -> { this.setComputeHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("hdmiIngestHealth", (n) -> { this.setHdmiIngestHealth(n.getObjectValue(TeamworkPeripheralHealth::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hdmiIngestHealth property value. The health details about the HDMI ingest of a device.
     * @return a TeamworkPeripheralHealth
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheralHealth getHdmiIngestHealth() {
        return this.BackingStore.get("hdmiIngestHealth");
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
        writer.writeObjectValue("computeHealth", this.getComputeHealth());
        writer.writeObjectValue("hdmiIngestHealth", this.getHdmiIngestHealth());
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
     * Sets the computeHealth property value. The system health details for a teamworkDevice.
     * @param value Value to set for the computeHealth property.
     */
    public void setComputeHealth(@jakarta.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.BackingStore.set("computeHealth", value);
    }
    /**
     * Sets the hdmiIngestHealth property value. The health details about the HDMI ingest of a device.
     * @param value Value to set for the hdmiIngestHealth property.
     */
    public void setHdmiIngestHealth(@jakarta.annotation.Nullable final TeamworkPeripheralHealth value) {
        this.BackingStore.set("hdmiIngestHealth", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
}
