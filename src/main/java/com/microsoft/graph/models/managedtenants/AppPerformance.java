package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppPerformance extends Entity implements Parsable {
    /** The appFriendlyName property */
    private String appFriendlyName;
    /** The appName property */
    private String appName;
    /** The appPublisher property */
    private String appPublisher;
    /** The lastUpdatedDateTime property */
    private OffsetDateTime lastUpdatedDateTime;
    /** The meanTimeToFailureInMinutes property */
    private Integer meanTimeToFailureInMinutes;
    /** The tenantDisplayName property */
    private String tenantDisplayName;
    /** The tenantId property */
    private String tenantId;
    /** The totalActiveDeviceCount property */
    private Integer totalActiveDeviceCount;
    /** The totalAppCrashCount property */
    private Integer totalAppCrashCount;
    /** The totalAppFreezeCount property */
    private Integer totalAppFreezeCount;
    /**
     * Instantiates a new AppPerformance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppPerformance
     */
    @javax.annotation.Nonnull
    public static AppPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppPerformance();
    }
    /**
     * Gets the appFriendlyName property value. The appFriendlyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppFriendlyName() {
        return this.appFriendlyName;
    }
    /**
     * Gets the appName property value. The appName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppName() {
        return this.appName;
    }
    /**
     * Gets the appPublisher property value. The appPublisher property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppPublisher() {
        return this.appPublisher;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appFriendlyName", (n) -> { this.setAppFriendlyName(n.getStringValue()); });
        deserializerMap.put("appName", (n) -> { this.setAppName(n.getStringValue()); });
        deserializerMap.put("appPublisher", (n) -> { this.setAppPublisher(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("meanTimeToFailureInMinutes", (n) -> { this.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("totalActiveDeviceCount", (n) -> { this.setTotalActiveDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("totalAppCrashCount", (n) -> { this.setTotalAppCrashCount(n.getIntegerValue()); });
        deserializerMap.put("totalAppFreezeCount", (n) -> { this.setTotalAppFreezeCount(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the meanTimeToFailureInMinutes property value. The meanTimeToFailureInMinutes property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this.meanTimeToFailureInMinutes;
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
     * Gets the totalActiveDeviceCount property value. The totalActiveDeviceCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalActiveDeviceCount() {
        return this.totalActiveDeviceCount;
    }
    /**
     * Gets the totalAppCrashCount property value. The totalAppCrashCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalAppCrashCount() {
        return this.totalAppCrashCount;
    }
    /**
     * Gets the totalAppFreezeCount property value. The totalAppFreezeCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalAppFreezeCount() {
        return this.totalAppFreezeCount;
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
        writer.writeStringValue("appFriendlyName", this.getAppFriendlyName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeIntegerValue("totalActiveDeviceCount", this.getTotalActiveDeviceCount());
        writer.writeIntegerValue("totalAppCrashCount", this.getTotalAppCrashCount());
        writer.writeIntegerValue("totalAppFreezeCount", this.getTotalAppFreezeCount());
    }
    /**
     * Sets the appFriendlyName property value. The appFriendlyName property
     * @param value Value to set for the appFriendlyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppFriendlyName(@javax.annotation.Nullable final String value) {
        this.appFriendlyName = value;
    }
    /**
     * Sets the appName property value. The appName property
     * @param value Value to set for the appName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppName(@javax.annotation.Nullable final String value) {
        this.appName = value;
    }
    /**
     * Sets the appPublisher property value. The appPublisher property
     * @param value Value to set for the appPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppPublisher(@javax.annotation.Nullable final String value) {
        this.appPublisher = value;
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
     * Sets the meanTimeToFailureInMinutes property value. The meanTimeToFailureInMinutes property
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeanTimeToFailureInMinutes(@javax.annotation.Nullable final Integer value) {
        this.meanTimeToFailureInMinutes = value;
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
     * Sets the totalActiveDeviceCount property value. The totalActiveDeviceCount property
     * @param value Value to set for the totalActiveDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalActiveDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.totalActiveDeviceCount = value;
    }
    /**
     * Sets the totalAppCrashCount property value. The totalAppCrashCount property
     * @param value Value to set for the totalAppCrashCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalAppCrashCount(@javax.annotation.Nullable final Integer value) {
        this.totalAppCrashCount = value;
    }
    /**
     * Sets the totalAppFreezeCount property value. The totalAppFreezeCount property
     * @param value Value to set for the totalAppFreezeCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalAppFreezeCount(@javax.annotation.Nullable final Integer value) {
        this.totalAppFreezeCount = value;
    }
}
