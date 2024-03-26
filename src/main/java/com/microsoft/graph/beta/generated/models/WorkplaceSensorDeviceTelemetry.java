package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkplaceSensorDeviceTelemetry implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WorkplaceSensorDeviceTelemetry} and sets the default values.
     */
    public WorkplaceSensorDeviceTelemetry() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkplaceSensorDeviceTelemetry}
     */
    @jakarta.annotation.Nonnull
    public static WorkplaceSensorDeviceTelemetry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkplaceSensorDeviceTelemetry();
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
     * Gets the boolValue property value. The value of the sensor.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBoolValue() {
        return this.backingStore.get("boolValue");
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("boolValue", (n) -> { this.setBoolValue(n.getBooleanValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("intValue", (n) -> { this.setIntValue(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sensorId", (n) -> { this.setSensorId(n.getStringValue()); });
        deserializerMap.put("sensorType", (n) -> { this.setSensorType(n.getEnumValue(WorkplaceSensorType::forValue)); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intValue property value. The value of the sensor.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIntValue() {
        return this.backingStore.get("intValue");
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
     * Gets the sensorId property value. The unique identifier of a sensor within the device. If the sensor Id is not provided, the sensorType will be used as sensorId.
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
     * Gets the timestamp property value. The timestamp at which the sensor value was observed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimestamp() {
        return this.backingStore.get("timestamp");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("boolValue", this.getBoolValue());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeIntegerValue("intValue", this.getIntValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sensorId", this.getSensorId());
        writer.writeEnumValue("sensorType", this.getSensorType());
        writer.writeOffsetDateTimeValue("timestamp", this.getTimestamp());
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
     * Sets the boolValue property value. The value of the sensor.
     * @param value Value to set for the boolValue property.
     */
    public void setBoolValue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("boolValue", value);
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the intValue property value. The value of the sensor.
     * @param value Value to set for the intValue property.
     */
    public void setIntValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("intValue", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sensorId property value. The unique identifier of a sensor within the device. If the sensor Id is not provided, the sensorType will be used as sensorId.
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
    /**
     * Sets the timestamp property value. The timestamp at which the sensor value was observed.
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("timestamp", value);
    }
}
