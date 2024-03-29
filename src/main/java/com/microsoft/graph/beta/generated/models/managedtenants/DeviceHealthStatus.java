package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceHealthStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceHealthStatus} and sets the default values.
     */
    public DeviceHealthStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceHealthStatus}
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthStatus();
    }
    /**
     * Gets the blueScreenCount property value. The blueScreenCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBlueScreenCount() {
        return this.backingStore.get("blueScreenCount");
    }
    /**
     * Gets the bootTotalDurationInSeconds property value. The bootTotalDurationInSeconds property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBootTotalDurationInSeconds() {
        return this.backingStore.get("bootTotalDurationInSeconds");
    }
    /**
     * Gets the deviceId property value. The deviceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceMake property value. The deviceMake property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceMake() {
        return this.backingStore.get("deviceMake");
    }
    /**
     * Gets the deviceModel property value. The deviceModel property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.backingStore.get("deviceModel");
    }
    /**
     * Gets the deviceName property value. The deviceName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the osVersion property value. The osVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the primaryDiskType property value. The primaryDiskType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrimaryDiskType() {
        return this.backingStore.get("primaryDiskType");
    }
    /**
     * Gets the restartCount property value. The restartCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRestartCount() {
        return this.backingStore.get("restartCount");
    }
    /**
     * Gets the startupPerformanceScore property value. The startupPerformanceScore property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getStartupPerformanceScore() {
        return this.backingStore.get("startupPerformanceScore");
    }
    /**
     * Gets the tenantDisplayName property value. The tenantDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.backingStore.get("tenantDisplayName");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the topProcesses property value. The topProcesses property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTopProcesses() {
        return this.backingStore.get("topProcesses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setBlueScreenCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("blueScreenCount", value);
    }
    /**
     * Sets the bootTotalDurationInSeconds property value. The bootTotalDurationInSeconds property
     * @param value Value to set for the bootTotalDurationInSeconds property.
     */
    public void setBootTotalDurationInSeconds(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("bootTotalDurationInSeconds", value);
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceMake property value. The deviceMake property
     * @param value Value to set for the deviceMake property.
     */
    public void setDeviceMake(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceMake", value);
    }
    /**
     * Sets the deviceModel property value. The deviceModel property
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceModel", value);
    }
    /**
     * Sets the deviceName property value. The deviceName property
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the osVersion property value. The osVersion property
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the primaryDiskType property value. The primaryDiskType property
     * @param value Value to set for the primaryDiskType property.
     */
    public void setPrimaryDiskType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryDiskType", value);
    }
    /**
     * Sets the restartCount property value. The restartCount property
     * @param value Value to set for the restartCount property.
     */
    public void setRestartCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("restartCount", value);
    }
    /**
     * Sets the startupPerformanceScore property value. The startupPerformanceScore property
     * @param value Value to set for the startupPerformanceScore property.
     */
    public void setStartupPerformanceScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("startupPerformanceScore", value);
    }
    /**
     * Sets the tenantDisplayName property value. The tenantDisplayName property
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantDisplayName", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the topProcesses property value. The topProcesses property
     * @param value Value to set for the topProcesses property.
     */
    public void setTopProcesses(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("topProcesses", value);
    }
}
