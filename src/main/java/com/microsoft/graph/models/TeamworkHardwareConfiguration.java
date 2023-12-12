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
public class TeamworkHardwareConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TeamworkHardwareConfiguration and sets the default values.
     */
    public TeamworkHardwareConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkHardwareConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkHardwareConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkHardwareConfiguration();
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
     * Gets the compute property value. The compute property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getCompute() {
        return this.backingStore.get("compute");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("compute", (n) -> { this.setCompute(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("hdmiIngest", (n) -> { this.setHdmiIngest(n.getObjectValue(TeamworkPeripheral::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("processorModel", (n) -> { this.setProcessorModel(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hdmiIngest property value. The hdmiIngest property
     * @return a TeamworkPeripheral
     */
    @jakarta.annotation.Nullable
    public TeamworkPeripheral getHdmiIngest() {
        return this.backingStore.get("hdmiIngest");
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
     * Gets the processorModel property value. The CPU model on the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProcessorModel() {
        return this.backingStore.get("processorModel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("compute", this.getCompute());
        writer.writeObjectValue("hdmiIngest", this.getHdmiIngest());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("processorModel", this.getProcessorModel());
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
     * Sets the compute property value. The compute property
     * @param value Value to set for the compute property.
     */
    public void setCompute(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("compute", value);
    }
    /**
     * Sets the hdmiIngest property value. The hdmiIngest property
     * @param value Value to set for the hdmiIngest property.
     */
    public void setHdmiIngest(@jakarta.annotation.Nullable final TeamworkPeripheral value) {
        this.backingStore.set("hdmiIngest", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the processorModel property value. The CPU model on the device.
     * @param value Value to set for the processorModel property.
     */
    public void setProcessorModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processorModel", value);
    }
}
