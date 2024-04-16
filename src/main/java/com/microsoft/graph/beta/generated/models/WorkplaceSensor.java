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
public class WorkplaceSensor implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WorkplaceSensor} and sets the default values.
     */
    public WorkplaceSensor() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkplaceSensor}
     */
    @jakarta.annotation.Nonnull
    public static WorkplaceSensor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkplaceSensor();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the displayName property value. The display name of the sensor. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("placeId", (n) -> { this.setPlaceId(n.getStringValue()); });
        deserializerMap.put("sensorId", (n) -> { this.setSensorId(n.getStringValue()); });
        deserializerMap.put("sensorType", (n) -> { this.setSensorType(n.getEnumValue(WorkplaceSensorType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the placeId property value. The unique identifier of the place that the sensor detects. If the device is installed in a room equipped with a mailbox, this property should match the ExternalDirectoryObjectId or Microsoft Entra object ID of the room mailbox. If the sensor detects the same place as the location of the device, the property can be omitted. The default value is the place identifier of the device. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaceId() {
        return this.backingStore.get("placeId");
    }
    /**
     * Gets the sensorId property value. The user-defined unique identifier of the sensor on the device. If the device has multiple sensors of the same type, the property must be provided to identify each sensor. If the device has only one sensor of a type, the property can be omitted. The default value is the sensor type. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSensorId() {
        return this.backingStore.get("sensorId");
    }
    /**
     * Gets the sensorType property value. The sensorType property
     * @return a {@link WorkplaceSensorType}
     */
    @jakarta.annotation.Nullable
    public WorkplaceSensorType getSensorType() {
        return this.backingStore.get("sensorType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("placeId", this.getPlaceId());
        writer.writeStringValue("sensorId", this.getSensorId());
        writer.writeEnumValue("sensorType", this.getSensorType());
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
     * Sets the displayName property value. The display name of the sensor. Optional.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the placeId property value. The unique identifier of the place that the sensor detects. If the device is installed in a room equipped with a mailbox, this property should match the ExternalDirectoryObjectId or Microsoft Entra object ID of the room mailbox. If the sensor detects the same place as the location of the device, the property can be omitted. The default value is the place identifier of the device. Optional.
     * @param value Value to set for the placeId property.
     */
    public void setPlaceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeId", value);
    }
    /**
     * Sets the sensorId property value. The user-defined unique identifier of the sensor on the device. If the device has multiple sensors of the same type, the property must be provided to identify each sensor. If the device has only one sensor of a type, the property can be omitted. The default value is the sensor type. Optional.
     * @param value Value to set for the sensorId property.
     */
    public void setSensorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sensorId", value);
    }
    /**
     * Sets the sensorType property value. The sensorType property
     * @param value Value to set for the sensorType property.
     */
    public void setSensorType(@jakarta.annotation.Nullable final WorkplaceSensorType value) {
        this.backingStore.set("sensorType", value);
    }
}
