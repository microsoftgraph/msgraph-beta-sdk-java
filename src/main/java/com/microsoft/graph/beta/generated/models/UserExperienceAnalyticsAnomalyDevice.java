package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics anomaly entity contains device details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAnomalyDevice extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserExperienceAnalyticsAnomalyDevice} and sets the default values.
     */
    public UserExperienceAnalyticsAnomalyDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsAnomalyDevice}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAnomalyDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAnomalyDevice();
    }
    /**
     * Gets the anomalyId property value. The unique identifier of the anomaly.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAnomalyId() {
        return this.backingStore.get("anomalyId");
    }
    /**
     * Gets the anomalyOnDeviceFirstOccurrenceDateTime property value. Indicates the first occurance date and time for the anomaly on the device.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAnomalyOnDeviceFirstOccurrenceDateTime() {
        return this.backingStore.get("anomalyOnDeviceFirstOccurrenceDateTime");
    }
    /**
     * Gets the anomalyOnDeviceLatestOccurrenceDateTime property value. Indicates the latest occurance date and time for the anomaly on the device.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAnomalyOnDeviceLatestOccurrenceDateTime() {
        return this.backingStore.get("anomalyOnDeviceLatestOccurrenceDateTime");
    }
    /**
     * Gets the correlationGroupId property value. The unique identifier of the correlation group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationGroupId() {
        return this.backingStore.get("correlationGroupId");
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
     * Gets the deviceManufacturer property value. The manufacturer name of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceManufacturer() {
        return this.backingStore.get("deviceManufacturer");
    }
    /**
     * Gets the deviceModel property value. The model name of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.backingStore.get("deviceModel");
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the deviceStatus property value. Indicates the status of the device in the correlation group. Eg: Device status can be anomalous, affected, at risk.
     * @return a {@link UserExperienceAnalyticsDeviceStatus}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsDeviceStatus getDeviceStatus() {
        return this.backingStore.get("deviceStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("anomalyId", (n) -> { this.setAnomalyId(n.getStringValue()); });
        deserializerMap.put("anomalyOnDeviceFirstOccurrenceDateTime", (n) -> { this.setAnomalyOnDeviceFirstOccurrenceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("anomalyOnDeviceLatestOccurrenceDateTime", (n) -> { this.setAnomalyOnDeviceLatestOccurrenceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("correlationGroupId", (n) -> { this.setCorrelationGroupId(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceManufacturer", (n) -> { this.setDeviceManufacturer(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceStatus", (n) -> { this.setDeviceStatus(n.getEnumValue(UserExperienceAnalyticsDeviceStatus::forValue)); });
        deserializerMap.put("osName", (n) -> { this.setOsName(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the osName property value. The name of the OS installed on the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsName() {
        return this.backingStore.get("osName");
    }
    /**
     * Gets the osVersion property value. The OS version installed on the device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("anomalyId", this.getAnomalyId());
        writer.writeOffsetDateTimeValue("anomalyOnDeviceFirstOccurrenceDateTime", this.getAnomalyOnDeviceFirstOccurrenceDateTime());
        writer.writeOffsetDateTimeValue("anomalyOnDeviceLatestOccurrenceDateTime", this.getAnomalyOnDeviceLatestOccurrenceDateTime());
        writer.writeStringValue("correlationGroupId", this.getCorrelationGroupId());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceManufacturer", this.getDeviceManufacturer());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("deviceStatus", this.getDeviceStatus());
        writer.writeStringValue("osName", this.getOsName());
        writer.writeStringValue("osVersion", this.getOsVersion());
    }
    /**
     * Sets the anomalyId property value. The unique identifier of the anomaly.
     * @param value Value to set for the anomalyId property.
     */
    public void setAnomalyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("anomalyId", value);
    }
    /**
     * Sets the anomalyOnDeviceFirstOccurrenceDateTime property value. Indicates the first occurance date and time for the anomaly on the device.
     * @param value Value to set for the anomalyOnDeviceFirstOccurrenceDateTime property.
     */
    public void setAnomalyOnDeviceFirstOccurrenceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("anomalyOnDeviceFirstOccurrenceDateTime", value);
    }
    /**
     * Sets the anomalyOnDeviceLatestOccurrenceDateTime property value. Indicates the latest occurance date and time for the anomaly on the device.
     * @param value Value to set for the anomalyOnDeviceLatestOccurrenceDateTime property.
     */
    public void setAnomalyOnDeviceLatestOccurrenceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("anomalyOnDeviceLatestOccurrenceDateTime", value);
    }
    /**
     * Sets the correlationGroupId property value. The unique identifier of the correlation group.
     * @param value Value to set for the correlationGroupId property.
     */
    public void setCorrelationGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationGroupId", value);
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceManufacturer property value. The manufacturer name of the device.
     * @param value Value to set for the deviceManufacturer property.
     */
    public void setDeviceManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceManufacturer", value);
    }
    /**
     * Sets the deviceModel property value. The model name of the device.
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceModel", value);
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the deviceStatus property value. Indicates the status of the device in the correlation group. Eg: Device status can be anomalous, affected, at risk.
     * @param value Value to set for the deviceStatus property.
     */
    public void setDeviceStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsDeviceStatus value) {
        this.backingStore.set("deviceStatus", value);
    }
    /**
     * Sets the osName property value. The name of the OS installed on the device.
     * @param value Value to set for the osName property.
     */
    public void setOsName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osName", value);
    }
    /**
     * Sets the osVersion property value. The OS version installed on the device.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
}
