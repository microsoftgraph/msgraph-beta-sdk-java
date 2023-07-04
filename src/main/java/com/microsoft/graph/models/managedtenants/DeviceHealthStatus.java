package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthStatus extends Entity implements Parsable {
    /**
     * The blueScreenCount property
     */
    private Integer blueScreenCount;
    /**
     * The bootTotalDurationInSeconds property
     */
    private Double bootTotalDurationInSeconds;
    /**
     * The deviceId property
     */
    private String deviceId;
    /**
     * The deviceMake property
     */
    private String deviceMake;
    /**
     * The deviceModel property
     */
    private String deviceModel;
    /**
     * The deviceName property
     */
    private String deviceName;
    /**
     * The healthStatus property
     */
    private String healthStatus;
    /**
     * The lastUpdatedDateTime property
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The osVersion property
     */
    private String osVersion;
    /**
     * The primaryDiskType property
     */
    private String primaryDiskType;
    /**
     * The restartCount property
     */
    private Integer restartCount;
    /**
     * The startupPerformanceScore property
     */
    private Double startupPerformanceScore;
    /**
     * The tenantDisplayName property
     */
    private String tenantDisplayName;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * The topProcesses property
     */
    private String topProcesses;
    /**
     * Instantiates a new deviceHealthStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthStatus
     */
    @javax.annotation.Nonnull
    public static DeviceHealthStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthStatus();
    }
    /**
     * Gets the blueScreenCount property value. The blueScreenCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBlueScreenCount() {
        return this.blueScreenCount;
    }
    /**
     * Gets the bootTotalDurationInSeconds property value. The bootTotalDurationInSeconds property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getBootTotalDurationInSeconds() {
        return this.bootTotalDurationInSeconds;
    }
    /**
     * Gets the deviceId property value. The deviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceMake property value. The deviceMake property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceMake() {
        return this.deviceMake;
    }
    /**
     * Gets the deviceModel property value. The deviceModel property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blueScreenCount", (n) -> { this.setBlueScreenCount(n.getIntegerValue()); });
        deserializerMap.put("bootTotalDurationInSeconds", (n) -> { this.setBootTotalDurationInSeconds(n.getDoubleValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceMake", (n) -> { this.setDeviceMake(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("primaryDiskType", (n) -> { this.setPrimaryDiskType(n.getStringValue()); });
        deserializerMap.put("restartCount", (n) -> { this.setRestartCount(n.getIntegerValue()); });
        deserializerMap.put("startupPerformanceScore", (n) -> { this.setStartupPerformanceScore(n.getDoubleValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("topProcesses", (n) -> { this.setTopProcesses(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the osVersion property value. The osVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the primaryDiskType property value. The primaryDiskType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryDiskType() {
        return this.primaryDiskType;
    }
    /**
     * Gets the restartCount property value. The restartCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRestartCount() {
        return this.restartCount;
    }
    /**
     * Gets the startupPerformanceScore property value. The startupPerformanceScore property
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getStartupPerformanceScore() {
        return this.startupPerformanceScore;
    }
    /**
     * Gets the tenantDisplayName property value. The tenantDisplayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the topProcesses property value. The topProcesses property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTopProcesses() {
        return this.topProcesses;
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
        writer.writeIntegerValue("blueScreenCount", this.getBlueScreenCount());
        writer.writeDoubleValue("bootTotalDurationInSeconds", this.getBootTotalDurationInSeconds());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceMake", this.getDeviceMake());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("healthStatus", this.getHealthStatus());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("primaryDiskType", this.getPrimaryDiskType());
        writer.writeIntegerValue("restartCount", this.getRestartCount());
        writer.writeDoubleValue("startupPerformanceScore", this.getStartupPerformanceScore());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("topProcesses", this.getTopProcesses());
    }
    /**
     * Sets the blueScreenCount property value. The blueScreenCount property
     * @param value Value to set for the blueScreenCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlueScreenCount(@javax.annotation.Nullable final Integer value) {
        this.blueScreenCount = value;
    }
    /**
     * Sets the bootTotalDurationInSeconds property value. The bootTotalDurationInSeconds property
     * @param value Value to set for the bootTotalDurationInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootTotalDurationInSeconds(@javax.annotation.Nullable final Double value) {
        this.bootTotalDurationInSeconds = value;
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceMake property value. The deviceMake property
     * @param value Value to set for the deviceMake property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceMake(@javax.annotation.Nullable final String value) {
        this.deviceMake = value;
    }
    /**
     * Sets the deviceModel property value. The deviceModel property
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this.deviceModel = value;
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatus(@javax.annotation.Nullable final String value) {
        this.healthStatus = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the osVersion property value. The osVersion property
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the primaryDiskType property value. The primaryDiskType property
     * @param value Value to set for the primaryDiskType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryDiskType(@javax.annotation.Nullable final String value) {
        this.primaryDiskType = value;
    }
    /**
     * Sets the restartCount property value. The restartCount property
     * @param value Value to set for the restartCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartCount(@javax.annotation.Nullable final Integer value) {
        this.restartCount = value;
    }
    /**
     * Sets the startupPerformanceScore property value. The startupPerformanceScore property
     * @param value Value to set for the startupPerformanceScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartupPerformanceScore(@javax.annotation.Nullable final Double value) {
        this.startupPerformanceScore = value;
    }
    /**
     * Sets the tenantDisplayName property value. The tenantDisplayName property
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this.tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the topProcesses property value. The topProcesses property
     * @param value Value to set for the topProcesses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopProcesses(@javax.annotation.Nullable final String value) {
        this.topProcesses = value;
    }
}
