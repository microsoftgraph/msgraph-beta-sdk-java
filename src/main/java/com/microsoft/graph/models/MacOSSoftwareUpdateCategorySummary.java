package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS software update category summary report for a device and user
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSSoftwareUpdateCategorySummary extends Entity implements Parsable {
    /**
     * The device ID.
     */
    private String deviceId;
    /**
     * The name of the report
     */
    private String displayName;
    /**
     * Number of failed updates on the device
     */
    private Integer failedUpdateCount;
    /**
     * Last date time the report for this device was updated.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * Number of successful updates on the device
     */
    private Integer successfulUpdateCount;
    /**
     * Number of total updates on the device
     */
    private Integer totalUpdateCount;
    /**
     * MacOS Software Update Category
     */
    private MacOSSoftwareUpdateCategory updateCategory;
    /**
     * Summary of the update states.
     */
    private java.util.List<MacOSSoftwareUpdateStateSummary> updateStateSummaries;
    /**
     * The user ID.
     */
    private String userId;
    /**
     * Instantiates a new macOSSoftwareUpdateCategorySummary and sets the default values.
     */
    public MacOSSoftwareUpdateCategorySummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSSoftwareUpdateCategorySummary
     */
    @jakarta.annotation.Nonnull
    public static MacOSSoftwareUpdateCategorySummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateCategorySummary();
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
     * Gets the displayName property value. The name of the report
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the failedUpdateCount property value. Number of failed updates on the device
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
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("failedUpdateCount", (n) -> { this.setFailedUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("successfulUpdateCount", (n) -> { this.setSuccessfulUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("totalUpdateCount", (n) -> { this.setTotalUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("updateCategory", (n) -> { this.setUpdateCategory(n.getEnumValue(MacOSSoftwareUpdateCategory.class)); });
        deserializerMap.put("updateStateSummaries", (n) -> { this.setUpdateStateSummaries(n.getCollectionOfObjectValues(MacOSSoftwareUpdateStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
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
     * Gets the successfulUpdateCount property value. Number of successful updates on the device
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulUpdateCount() {
        return this.successfulUpdateCount;
    }
    /**
     * Gets the totalUpdateCount property value. Number of total updates on the device
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUpdateCount() {
        return this.totalUpdateCount;
    }
    /**
     * Gets the updateCategory property value. MacOS Software Update Category
     * @return a macOSSoftwareUpdateCategory
     */
    @jakarta.annotation.Nullable
    public MacOSSoftwareUpdateCategory getUpdateCategory() {
        return this.updateCategory;
    }
    /**
     * Gets the updateStateSummaries property value. Summary of the update states.
     * @return a macOSSoftwareUpdateStateSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSSoftwareUpdateStateSummary> getUpdateStateSummaries() {
        return this.updateStateSummaries;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("failedUpdateCount", this.getFailedUpdateCount());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeIntegerValue("successfulUpdateCount", this.getSuccessfulUpdateCount());
        writer.writeIntegerValue("totalUpdateCount", this.getTotalUpdateCount());
        writer.writeEnumValue("updateCategory", this.getUpdateCategory());
        writer.writeCollectionOfObjectValues("updateStateSummaries", this.getUpdateStateSummaries());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the deviceId property value. The device ID.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the displayName property value. The name of the report
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the failedUpdateCount property value. Number of failed updates on the device
     * @param value Value to set for the failedUpdateCount property.
     */
    public void setFailedUpdateCount(@jakarta.annotation.Nullable final Integer value) {
        this.failedUpdateCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last date time the report for this device was updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the successfulUpdateCount property value. Number of successful updates on the device
     * @param value Value to set for the successfulUpdateCount property.
     */
    public void setSuccessfulUpdateCount(@jakarta.annotation.Nullable final Integer value) {
        this.successfulUpdateCount = value;
    }
    /**
     * Sets the totalUpdateCount property value. Number of total updates on the device
     * @param value Value to set for the totalUpdateCount property.
     */
    public void setTotalUpdateCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalUpdateCount = value;
    }
    /**
     * Sets the updateCategory property value. MacOS Software Update Category
     * @param value Value to set for the updateCategory property.
     */
    public void setUpdateCategory(@jakarta.annotation.Nullable final MacOSSoftwareUpdateCategory value) {
        this.updateCategory = value;
    }
    /**
     * Sets the updateStateSummaries property value. Summary of the update states.
     * @param value Value to set for the updateStateSummaries property.
     */
    public void setUpdateStateSummaries(@jakarta.annotation.Nullable final java.util.List<MacOSSoftwareUpdateStateSummary> value) {
        this.updateStateSummaries = value;
    }
    /**
     * Sets the userId property value. The user ID.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
