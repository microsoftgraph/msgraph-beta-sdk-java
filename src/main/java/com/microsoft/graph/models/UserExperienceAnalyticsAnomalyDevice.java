package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics anomaly entity contains device details. */
public class UserExperienceAnalyticsAnomalyDevice extends Entity implements Parsable {
    /** The unique identifier of the anomaly. */
    private String _anomalyId;
    /** Indicates the first occurance date and time for the anomaly on the device. */
    private OffsetDateTime _anomalyOnDeviceFirstOccurrenceDateTime;
    /** Indicates the latest occurance date and time for the anomaly on the device. */
    private OffsetDateTime _anomalyOnDeviceLatestOccurrenceDateTime;
    /** The unique identifier of the device. */
    private String _deviceId;
    /** The manufacturer name of the device. */
    private String _deviceManufacturer;
    /** The model name of the device. */
    private String _deviceModel;
    /** The name of the device. */
    private String _deviceName;
    /** The name of the OS installed on the device. */
    private String _osName;
    /** The OS version installed on the device. */
    private String _osVersion;
    /**
     * Instantiates a new userExperienceAnalyticsAnomalyDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalyDevice() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsAnomalyDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAnomalyDevice
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
        return this._anomalyId;
    }
    /**
     * Gets the anomalyOnDeviceFirstOccurrenceDateTime property value. Indicates the first occurance date and time for the anomaly on the device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAnomalyOnDeviceFirstOccurrenceDateTime() {
        return this._anomalyOnDeviceFirstOccurrenceDateTime;
    }
    /**
     * Gets the anomalyOnDeviceLatestOccurrenceDateTime property value. Indicates the latest occurance date and time for the anomaly on the device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAnomalyOnDeviceLatestOccurrenceDateTime() {
        return this._anomalyOnDeviceLatestOccurrenceDateTime;
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceManufacturer property value. The manufacturer name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceManufacturer() {
        return this._deviceManufacturer;
    }
    /**
     * Gets the deviceModel property value. The model name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this._deviceModel;
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAnomalyDevice currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("anomalyId", (n) -> { currentObject.setAnomalyId(n.getStringValue()); });
            this.put("anomalyOnDeviceFirstOccurrenceDateTime", (n) -> { currentObject.setAnomalyOnDeviceFirstOccurrenceDateTime(n.getOffsetDateTimeValue()); });
            this.put("anomalyOnDeviceLatestOccurrenceDateTime", (n) -> { currentObject.setAnomalyOnDeviceLatestOccurrenceDateTime(n.getOffsetDateTimeValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceManufacturer", (n) -> { currentObject.setDeviceManufacturer(n.getStringValue()); });
            this.put("deviceModel", (n) -> { currentObject.setDeviceModel(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("osName", (n) -> { currentObject.setOsName(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the osName property value. The name of the OS installed on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsName() {
        return this._osName;
    }
    /**
     * Gets the osVersion property value. The OS version installed on the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
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
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceManufacturer", this.getDeviceManufacturer());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("deviceName", this.getDeviceName());
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
        this._anomalyId = value;
    }
    /**
     * Sets the anomalyOnDeviceFirstOccurrenceDateTime property value. Indicates the first occurance date and time for the anomaly on the device.
     * @param value Value to set for the anomalyOnDeviceFirstOccurrenceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyOnDeviceFirstOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._anomalyOnDeviceFirstOccurrenceDateTime = value;
    }
    /**
     * Sets the anomalyOnDeviceLatestOccurrenceDateTime property value. Indicates the latest occurance date and time for the anomaly on the device.
     * @param value Value to set for the anomalyOnDeviceLatestOccurrenceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyOnDeviceLatestOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._anomalyOnDeviceLatestOccurrenceDateTime = value;
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceManufacturer property value. The manufacturer name of the device.
     * @param value Value to set for the deviceManufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManufacturer(@javax.annotation.Nullable final String value) {
        this._deviceManufacturer = value;
    }
    /**
     * Sets the deviceModel property value. The model name of the device.
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this._deviceModel = value;
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the osName property value. The name of the OS installed on the device.
     * @param value Value to set for the osName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsName(@javax.annotation.Nullable final String value) {
        this._osName = value;
    }
    /**
     * Sets the osVersion property value. The OS version installed on the device.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
}
