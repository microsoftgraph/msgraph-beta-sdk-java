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
     * Gets the boolValue property value. The value of the sensor can be true or false. Use it for sensors that report binary values, such as occupancy or heartbeat.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBoolValue() {
        return this.backingStore.get("boolValue");
    }
    /**
     * Gets the deviceId property value. The user-defined unique identifier of the device provided at the time of creation. Don't use the system generated identifier of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the eventValue property value. The extra values associated with badge signals.
     * @return a {@link WorkplaceSensorEventValue}
     */
    @jakarta.annotation.Nullable
    public WorkplaceSensorEventValue getEventValue() {
        return this.backingStore.get("eventValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("boolValue", (n) -> { this.setBoolValue(n.getBooleanValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("eventValue", (n) -> { this.setEventValue(n.getObjectValue(WorkplaceSensorEventValue::createFromDiscriminatorValue)); });
        deserializerMap.put("intValue", (n) -> { this.setIntValue(n.getIntegerValue()); });
        deserializerMap.put("locationHint", (n) -> { this.setLocationHint(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sensorId", (n) -> { this.setSensorId(n.getStringValue()); });
        deserializerMap.put("sensorType", (n) -> { this.setSensorType(n.getEnumValue(WorkplaceSensorType::forValue)); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intValue property value. The value of the sensor as an integer. Use it for sensors that report numerical values, such as people count.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIntValue() {
        return this.backingStore.get("intValue");
    }
    /**
     * Gets the locationHint property value. The additional information to indicate the location of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocationHint() {
        return this.backingStore.get("locationHint");
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
     * Gets the sensorId property value. The user-defined unique identifier of the sensor on the device. Optional. If the device has multiple sensors of the same type, the property must be provided to identify each sensor. If the device has unique sensor types, the property can be omitted. The default value is the sensor type.
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
     * Gets the timestamp property value. The date and time when the sensor measured and reported its value. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
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
        writer.writeObjectValue("eventValue", this.getEventValue());
        writer.writeIntegerValue("intValue", this.getIntValue());
        writer.writeStringValue("locationHint", this.getLocationHint());
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
     * Sets the boolValue property value. The value of the sensor can be true or false. Use it for sensors that report binary values, such as occupancy or heartbeat.
     * @param value Value to set for the boolValue property.
     */
    public void setBoolValue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("boolValue", value);
    }
    /**
     * Sets the deviceId property value. The user-defined unique identifier of the device provided at the time of creation. Don't use the system generated identifier of the device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the eventValue property value. The extra values associated with badge signals.
     * @param value Value to set for the eventValue property.
     */
    public void setEventValue(@jakarta.annotation.Nullable final WorkplaceSensorEventValue value) {
        this.backingStore.set("eventValue", value);
    }
    /**
     * Sets the intValue property value. The value of the sensor as an integer. Use it for sensors that report numerical values, such as people count.
     * @param value Value to set for the intValue property.
     */
    public void setIntValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("intValue", value);
    }
    /**
     * Sets the locationHint property value. The additional information to indicate the location of the device.
     * @param value Value to set for the locationHint property.
     */
    public void setLocationHint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locationHint", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the sensorId property value. The user-defined unique identifier of the sensor on the device. Optional. If the device has multiple sensors of the same type, the property must be provided to identify each sensor. If the device has unique sensor types, the property can be omitted. The default value is the sensor type.
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
     * Sets the timestamp property value. The date and time when the sensor measured and reported its value. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("timestamp", value);
    }
}
