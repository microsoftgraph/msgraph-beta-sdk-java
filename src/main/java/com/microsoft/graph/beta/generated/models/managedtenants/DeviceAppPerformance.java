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
public class DeviceAppPerformance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceAppPerformance} and sets the default values.
     */
    public DeviceAppPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceAppPerformance}
     */
    @jakarta.annotation.Nonnull
    public static DeviceAppPerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAppPerformance();
    }
    /**
     * Gets the appFriendlyName property value. The appFriendlyName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppFriendlyName() {
        return this.backingStore.get("appFriendlyName");
    }
    /**
     * Gets the appName property value. The appName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppName() {
        return this.backingStore.get("appName");
    }
    /**
     * Gets the appPublisher property value. The appPublisher property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppPublisher() {
        return this.backingStore.get("appPublisher");
    }
    /**
     * Gets the appVersion property value. The appVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppVersion() {
        return this.backingStore.get("appVersion");
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
     * Gets the deviceManufacturer property value. The deviceManufacturer property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceManufacturer() {
        return this.backingStore.get("deviceManufacturer");
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
        deserializerMap.put("appFriendlyName", (n) -> { this.setAppFriendlyName(n.getStringValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { this.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("appVersion", (n) -> { this.setAppVersion(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceManufacturer", (n) -> { this.setDeviceManufacturer(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getStringValue()); });
        deserializerMap.put("isLatestUsedVersion", (n) -> { this.setIsLatestUsedVersion(n.getIntegerValue()); });
        deserializerMap.put("isMostUsedVersion", (n) -> { this.setIsMostUsedVersion(n.getIntegerValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("totalAppCrashCount", (n) -> { this.setTotalAppCrashCount(n.getIntegerValue()); });
        deserializerMap.put("totalAppFreezeCount", (n) -> { this.setTotalAppFreezeCount(n.getIntegerValue()); });
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
     * Gets the isLatestUsedVersion property value. The isLatestUsedVersion property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIsLatestUsedVersion() {
        return this.backingStore.get("isLatestUsedVersion");
    }
    /**
     * Gets the isMostUsedVersion property value. The isMostUsedVersion property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIsMostUsedVersion() {
        return this.backingStore.get("isMostUsedVersion");
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
     * Gets the totalAppCrashCount property value. The totalAppCrashCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalAppCrashCount() {
        return this.backingStore.get("totalAppCrashCount");
    }
    /**
     * Gets the totalAppFreezeCount property value. The totalAppFreezeCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalAppFreezeCount() {
        return this.backingStore.get("totalAppFreezeCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appFriendlyName", this.getAppFriendlyName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceManufacturer", this.getDeviceManufacturer());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("healthStatus", this.getHealthStatus());
        writer.writeIntegerValue("isLatestUsedVersion", this.getIsLatestUsedVersion());
        writer.writeIntegerValue("isMostUsedVersion", this.getIsMostUsedVersion());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeIntegerValue("totalAppCrashCount", this.getTotalAppCrashCount());
        writer.writeIntegerValue("totalAppFreezeCount", this.getTotalAppFreezeCount());
    }
    /**
     * Sets the appFriendlyName property value. The appFriendlyName property
     * @param value Value to set for the appFriendlyName property.
     */
    public void setAppFriendlyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appFriendlyName", value);
    }
    /**
     * Sets the appName property value. The appName property
     * @param value Value to set for the appName property.
     */
    public void setAppName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appName", value);
    }
    /**
     * Sets the appPublisher property value. The appPublisher property
     * @param value Value to set for the appPublisher property.
     */
    public void setAppPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appPublisher", value);
    }
    /**
     * Sets the appVersion property value. The appVersion property
     * @param value Value to set for the appVersion property.
     */
    public void setAppVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appVersion", value);
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceManufacturer property value. The deviceManufacturer property
     * @param value Value to set for the deviceManufacturer property.
     */
    public void setDeviceManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceManufacturer", value);
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
     * Sets the isLatestUsedVersion property value. The isLatestUsedVersion property
     * @param value Value to set for the isLatestUsedVersion property.
     */
    public void setIsLatestUsedVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("isLatestUsedVersion", value);
    }
    /**
     * Sets the isMostUsedVersion property value. The isMostUsedVersion property
     * @param value Value to set for the isMostUsedVersion property.
     */
    public void setIsMostUsedVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("isMostUsedVersion", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
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
     * Sets the totalAppCrashCount property value. The totalAppCrashCount property
     * @param value Value to set for the totalAppCrashCount property.
     */
    public void setTotalAppCrashCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalAppCrashCount", value);
    }
    /**
     * Sets the totalAppFreezeCount property value. The totalAppFreezeCount property
     * @param value Value to set for the totalAppFreezeCount property.
     */
    public void setTotalAppFreezeCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalAppFreezeCount", value);
    }
}
