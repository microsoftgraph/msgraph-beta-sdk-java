package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** MacOS software update category summary report for a device and user */
public class MacOSSoftwareUpdateCategorySummary extends Entity implements Parsable {
    /** The device ID. */
    private String _deviceId;
    /** The name of the report */
    private String _displayName;
    /** Number of failed updates on the device */
    private Integer _failedUpdateCount;
    /** Last date time the report for this device was updated. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** Number of successful updates on the device */
    private Integer _successfulUpdateCount;
    /** Number of total updates on the device */
    private Integer _totalUpdateCount;
    /** MacOS Software Update Category */
    private MacOSSoftwareUpdateCategory _updateCategory;
    /** Summary of the update states. */
    private java.util.List<MacOSSoftwareUpdateStateSummary> _updateStateSummaries;
    /** The user ID. */
    private String _userId;
    /**
     * Instantiates a new macOSSoftwareUpdateCategorySummary and sets the default values.
     * @return a void
     */
    public MacOSSoftwareUpdateCategorySummary() {
        super();
        this.setOdataType("#microsoft.graph.macOSSoftwareUpdateCategorySummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSSoftwareUpdateCategorySummary
     */
    @javax.annotation.Nonnull
    public static MacOSSoftwareUpdateCategorySummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateCategorySummary();
    }
    /**
     * Gets the deviceId property value. The device ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the displayName property value. The name of the report
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the failedUpdateCount property value. Number of failed updates on the device
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedUpdateCount() {
        return this._failedUpdateCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSSoftwareUpdateCategorySummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("failedUpdateCount", (n) -> { currentObject.setFailedUpdateCount(n.getIntegerValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("successfulUpdateCount", (n) -> { currentObject.setSuccessfulUpdateCount(n.getIntegerValue()); });
            this.put("totalUpdateCount", (n) -> { currentObject.setTotalUpdateCount(n.getIntegerValue()); });
            this.put("updateCategory", (n) -> { currentObject.setUpdateCategory(n.getEnumValue(MacOSSoftwareUpdateCategory.class)); });
            this.put("updateStateSummaries", (n) -> { currentObject.setUpdateStateSummaries(n.getCollectionOfObjectValues(MacOSSoftwareUpdateStateSummary::createFromDiscriminatorValue)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. Last date time the report for this device was updated.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the successfulUpdateCount property value. Number of successful updates on the device
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessfulUpdateCount() {
        return this._successfulUpdateCount;
    }
    /**
     * Gets the totalUpdateCount property value. Number of total updates on the device
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUpdateCount() {
        return this._totalUpdateCount;
    }
    /**
     * Gets the updateCategory property value. MacOS Software Update Category
     * @return a macOSSoftwareUpdateCategory
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateCategory getUpdateCategory() {
        return this._updateCategory;
    }
    /**
     * Gets the updateStateSummaries property value. Summary of the update states.
     * @return a macOSSoftwareUpdateStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSSoftwareUpdateStateSummary> getUpdateStateSummaries() {
        return this._updateStateSummaries;
    }
    /**
     * Gets the userId property value. The user ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the displayName property value. The name of the report
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the failedUpdateCount property value. Number of failed updates on the device
     * @param value Value to set for the failedUpdateCount property.
     * @return a void
     */
    public void setFailedUpdateCount(@javax.annotation.Nullable final Integer value) {
        this._failedUpdateCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last date time the report for this device was updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the successfulUpdateCount property value. Number of successful updates on the device
     * @param value Value to set for the successfulUpdateCount property.
     * @return a void
     */
    public void setSuccessfulUpdateCount(@javax.annotation.Nullable final Integer value) {
        this._successfulUpdateCount = value;
    }
    /**
     * Sets the totalUpdateCount property value. Number of total updates on the device
     * @param value Value to set for the totalUpdateCount property.
     * @return a void
     */
    public void setTotalUpdateCount(@javax.annotation.Nullable final Integer value) {
        this._totalUpdateCount = value;
    }
    /**
     * Sets the updateCategory property value. MacOS Software Update Category
     * @param value Value to set for the updateCategory property.
     * @return a void
     */
    public void setUpdateCategory(@javax.annotation.Nullable final MacOSSoftwareUpdateCategory value) {
        this._updateCategory = value;
    }
    /**
     * Sets the updateStateSummaries property value. Summary of the update states.
     * @param value Value to set for the updateStateSummaries property.
     * @return a void
     */
    public void setUpdateStateSummaries(@javax.annotation.Nullable final java.util.List<MacOSSoftwareUpdateStateSummary> value) {
        this._updateStateSummaries = value;
    }
    /**
     * Sets the userId property value. The user ID.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
