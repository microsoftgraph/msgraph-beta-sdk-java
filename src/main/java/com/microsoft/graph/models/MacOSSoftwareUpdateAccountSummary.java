package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS software update account summary report for a device and user
 */
public class MacOSSoftwareUpdateAccountSummary extends Entity implements Parsable {
    /**
     * Summary of the updates by category.
     */
    private java.util.List<MacOSSoftwareUpdateCategorySummary> categorySummaries;
    /**
     * The device ID.
     */
    private String deviceId;
    /**
     * The device name.
     */
    private String deviceName;
    /**
     * The name of the report
     */
    private String displayName;
    /**
     * Number of failed updates on the device.
     */
    private Integer failedUpdateCount;
    /**
     * Last date time the report for this device was updated.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The OS version.
     */
    private String osVersion;
    /**
     * Number of successful updates on the device.
     */
    private Integer successfulUpdateCount;
    /**
     * Number of total updates on the device.
     */
    private Integer totalUpdateCount;
    /**
     * The user ID.
     */
    private String userId;
    /**
     * The user principal name
     */
    private String userPrincipalName;
    /**
     * Instantiates a new macOSSoftwareUpdateAccountSummary and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateAccountSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSSoftwareUpdateAccountSummary
     */
    @jakarta.annotation.Nonnull
    public static MacOSSoftwareUpdateAccountSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateAccountSummary();
    }
    /**
     * Gets the categorySummaries property value. Summary of the updates by category.
     * @return a macOSSoftwareUpdateCategorySummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSSoftwareUpdateCategorySummary> getCategorySummaries() {
        return this.categorySummaries;
    }
    /**
     * Gets the deviceId property value. The device ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. The device name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the displayName property value. The name of the report
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the failedUpdateCount property value. Number of failed updates on the device.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedUpdateCount() {
        return this.failedUpdateCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categorySummaries", (n) -> { this.setCategorySummaries(n.getCollectionOfObjectValues(MacOSSoftwareUpdateCategorySummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("failedUpdateCount", (n) -> { this.setFailedUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("successfulUpdateCount", (n) -> { this.setSuccessfulUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("totalUpdateCount", (n) -> { this.setTotalUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Last date time the report for this device was updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the osVersion property value. The OS version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the successfulUpdateCount property value. Number of successful updates on the device.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulUpdateCount() {
        return this.successfulUpdateCount;
    }
    /**
     * Gets the totalUpdateCount property value. Number of total updates on the device.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUpdateCount() {
        return this.totalUpdateCount;
    }
    /**
     * Gets the userId property value. The user ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("categorySummaries", this.getCategorySummaries());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("failedUpdateCount", this.getFailedUpdateCount());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeIntegerValue("successfulUpdateCount", this.getSuccessfulUpdateCount());
        writer.writeIntegerValue("totalUpdateCount", this.getTotalUpdateCount());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the categorySummaries property value. Summary of the updates by category.
     * @param value Value to set for the categorySummaries property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCategorySummaries(@jakarta.annotation.Nullable final java.util.List<MacOSSoftwareUpdateCategorySummary> value) {
        this.categorySummaries = value;
    }
    /**
     * Sets the deviceId property value. The device ID.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. The device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the displayName property value. The name of the report
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the failedUpdateCount property value. Number of failed updates on the device.
     * @param value Value to set for the failedUpdateCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFailedUpdateCount(@jakarta.annotation.Nullable final Integer value) {
        this.failedUpdateCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last date time the report for this device was updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the osVersion property value. The OS version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the successfulUpdateCount property value. Number of successful updates on the device.
     * @param value Value to set for the successfulUpdateCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSuccessfulUpdateCount(@jakarta.annotation.Nullable final Integer value) {
        this.successfulUpdateCount = value;
    }
    /**
     * Sets the totalUpdateCount property value. Number of total updates on the device.
     * @param value Value to set for the totalUpdateCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTotalUpdateCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalUpdateCount = value;
    }
    /**
     * Sets the userId property value. The user ID.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
