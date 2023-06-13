package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsAnomalyDevice extends Entity implements Parsable {
    /** The unique identifier of the anomaly. */
    private String anomalyId;
    /** Indicates the first occurance date and time for the anomaly on the device. */
    private OffsetDateTime anomalyOnDeviceFirstOccurrenceDateTime;
    /** Indicates the latest occurance date and time for the anomaly on the device. */
    private OffsetDateTime anomalyOnDeviceLatestOccurrenceDateTime;
    /** The unique identifier of the correlation group. */
    private String correlationGroupId;
    /** The unique identifier of the device. */
    private String deviceId;
    /** The manufacturer name of the device. */
    private String deviceManufacturer;
    /** The model name of the device. */
    private String deviceModel;
    /** The name of the device. */
    private String deviceName;
    /** Indicates the status of the device in the correlation group. Eg: Device status can be anomalous, affected, at risk. */
    private UserExperienceAnalyticsDeviceStatus deviceStatus;
    /** The name of the OS installed on the device. */
    private String osName;
    /** The OS version installed on the device. */
    private String osVersion;
    /**
     * Instantiates a new UserExperienceAnalyticsAnomalyDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalyDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAnomalyDevice
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAnomalyDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAnomalyDevice();
    }
    /**
     * Gets the anomalyId property value. The unique identifier of the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAnomalyId() {
        return this.anomalyId;
    }
    /**
     * Gets the anomalyOnDeviceFirstOccurrenceDateTime property value. Indicates the first occurance date and time for the anomaly on the device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAnomalyOnDeviceFirstOccurrenceDateTime() {
        return this.anomalyOnDeviceFirstOccurrenceDateTime;
    }
    /**
     * Gets the anomalyOnDeviceLatestOccurrenceDateTime property value. Indicates the latest occurance date and time for the anomaly on the device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAnomalyOnDeviceLatestOccurrenceDateTime() {
        return this.anomalyOnDeviceLatestOccurrenceDateTime;
    }
    /**
     * Gets the correlationGroupId property value. The unique identifier of the correlation group.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationGroupId() {
        return this.correlationGroupId;
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceManufacturer property value. The manufacturer name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }
    /**
     * Gets the deviceModel property value. The model name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceStatus property value. Indicates the status of the device in the correlation group. Eg: Device status can be anomalous, affected, at risk.
     * @return a userExperienceAnalyticsDeviceStatus
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceStatus getDeviceStatus() {
        return this.deviceStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("deviceStatus", (n) -> { this.setDeviceStatus(n.getEnumValue(UserExperienceAnalyticsDeviceStatus.class)); });
        deserializerMap.put("osName", (n) -> { this.setOsName(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the osName property value. The name of the OS installed on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsName() {
        return this.osName;
    }
    /**
     * Gets the osVersion property value. The OS version installed on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyId(@javax.annotation.Nullable final String value) {
        this.anomalyId = value;
    }
    /**
     * Sets the anomalyOnDeviceFirstOccurrenceDateTime property value. Indicates the first occurance date and time for the anomaly on the device.
     * @param value Value to set for the anomalyOnDeviceFirstOccurrenceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyOnDeviceFirstOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.anomalyOnDeviceFirstOccurrenceDateTime = value;
    }
    /**
     * Sets the anomalyOnDeviceLatestOccurrenceDateTime property value. Indicates the latest occurance date and time for the anomaly on the device.
     * @param value Value to set for the anomalyOnDeviceLatestOccurrenceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyOnDeviceLatestOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.anomalyOnDeviceLatestOccurrenceDateTime = value;
    }
    /**
     * Sets the correlationGroupId property value. The unique identifier of the correlation group.
     * @param value Value to set for the correlationGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationGroupId(@javax.annotation.Nullable final String value) {
        this.correlationGroupId = value;
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceManufacturer property value. The manufacturer name of the device.
     * @param value Value to set for the deviceManufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManufacturer(@javax.annotation.Nullable final String value) {
        this.deviceManufacturer = value;
    }
    /**
     * Sets the deviceModel property value. The model name of the device.
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this.deviceModel = value;
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceStatus property value. Indicates the status of the device in the correlation group. Eg: Device status can be anomalous, affected, at risk.
     * @param value Value to set for the deviceStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatus(@javax.annotation.Nullable final UserExperienceAnalyticsDeviceStatus value) {
        this.deviceStatus = value;
    }
    /**
     * Sets the osName property value. The name of the OS installed on the device.
     * @param value Value to set for the osName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsName(@javax.annotation.Nullable final String value) {
        this.osName = value;
    }
    /**
     * Sets the osVersion property value. The OS version installed on the device.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
}
