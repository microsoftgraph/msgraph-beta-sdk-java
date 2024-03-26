package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkplaceSensorDevice extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkplaceSensorDevice} and sets the default values.
     */
    public WorkplaceSensorDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkplaceSensorDevice}
     */
    @jakarta.annotation.Nonnull
    public static WorkplaceSensorDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkplaceSensorDevice();
    }
    /**
     * Gets the description property value. The description of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device set by the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the displayName property value. The display name of the device.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("ipV4Address", (n) -> { this.setIpV4Address(n.getStringValue()); });
        deserializerMap.put("ipV6Address", (n) -> { this.setIpV6Address(n.getStringValue()); });
        deserializerMap.put("macAddress", (n) -> { this.setMacAddress(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("placeId", (n) -> { this.setPlaceId(n.getStringValue()); });
        deserializerMap.put("sensors", (n) -> { this.setSensors(n.getCollectionOfObjectValues(WorkplaceSensor::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the ipV4Address property value. The IPv4 Address of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpV4Address() {
        return this.backingStore.get("ipV4Address");
    }
    /**
     * Gets the ipV6Address property value. The IPv6 Address of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpV6Address() {
        return this.backingStore.get("ipV6Address");
    }
    /**
     * Gets the macAddress property value. The MAC address of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMacAddress() {
        return this.backingStore.get("macAddress");
    }
    /**
     * Gets the manufacturer property value. The manufacturer of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the placeId property value. The unique identifier of the place where the device is located.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaceId() {
        return this.backingStore.get("placeId");
    }
    /**
     * Gets the sensors property value. A list of sensors associated with the device. Sensors can measure physical quantities such as temperature, humidity, occupancy,         etc.
     * @return a {@link java.util.List<WorkplaceSensor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkplaceSensor> getSensors() {
        return this.backingStore.get("sensors");
    }
    /**
     * Gets the tags property value. A list of custom tags associated with the device.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("ipV4Address", this.getIpV4Address());
        writer.writeStringValue("ipV6Address", this.getIpV6Address());
        writer.writeStringValue("macAddress", this.getMacAddress());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("placeId", this.getPlaceId());
        writer.writeCollectionOfObjectValues("sensors", this.getSensors());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
    }
    /**
     * Sets the description property value. The description of the device.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device set by the user.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the displayName property value. The display name of the device.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the ipV4Address property value. The IPv4 Address of the device.
     * @param value Value to set for the ipV4Address property.
     */
    public void setIpV4Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipV4Address", value);
    }
    /**
     * Sets the ipV6Address property value. The IPv6 Address of the device.
     * @param value Value to set for the ipV6Address property.
     */
    public void setIpV6Address(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipV6Address", value);
    }
    /**
     * Sets the macAddress property value. The MAC address of the device.
     * @param value Value to set for the macAddress property.
     */
    public void setMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("macAddress", value);
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the device.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the placeId property value. The unique identifier of the place where the device is located.
     * @param value Value to set for the placeId property.
     */
    public void setPlaceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeId", value);
    }
    /**
     * Sets the sensors property value. A list of sensors associated with the device. Sensors can measure physical quantities such as temperature, humidity, occupancy,         etc.
     * @param value Value to set for the sensors property.
     */
    public void setSensors(@jakarta.annotation.Nullable final java.util.List<WorkplaceSensor> value) {
        this.backingStore.set("sensors", value);
    }
    /**
     * Sets the tags property value. A list of custom tags associated with the device.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
}
