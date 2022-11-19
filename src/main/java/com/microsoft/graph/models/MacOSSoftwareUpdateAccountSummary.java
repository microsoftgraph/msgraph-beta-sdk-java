package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** MacOS software update account summary report for a device and user */
public class MacOSSoftwareUpdateAccountSummary extends Entity implements Parsable {
    /** Summary of the updates by category. */
    private java.util.List<MacOSSoftwareUpdateCategorySummary> _categorySummaries;
    /** The device ID. */
    private String _deviceId;
    /** The device name. */
    private String _deviceName;
    /** The name of the report */
    private String _displayName;
    /** Number of failed updates on the device. */
    private Integer _failedUpdateCount;
    /** Last date time the report for this device was updated. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The OS version. */
    private String _osVersion;
    /** Number of successful updates on the device. */
    private Integer _successfulUpdateCount;
    /** Number of total updates on the device. */
    private Integer _totalUpdateCount;
    /** The user ID. */
    private String _userId;
    /** The user principal name */
    private String _userPrincipalName;
    /**
     * Instantiates a new macOSSoftwareUpdateAccountSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSSoftwareUpdateAccountSummary() {
        super();
        this.setOdataType("#microsoft.graph.macOSSoftwareUpdateAccountSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSSoftwareUpdateAccountSummary
     */
    @javax.annotation.Nonnull
    public static MacOSSoftwareUpdateAccountSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSSoftwareUpdateAccountSummary();
    }
    /**
     * Gets the categorySummaries property value. Summary of the updates by category.
     * @return a macOSSoftwareUpdateCategorySummary
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSSoftwareUpdateCategorySummary> getCategorySummaries() {
        return this._categorySummaries;
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
     * Gets the deviceName property value. The device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
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
     * Gets the failedUpdateCount property value. Number of failed updates on the device.
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
        final MacOSSoftwareUpdateAccountSummary currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categorySummaries", (n) -> { currentObject.setCategorySummaries(n.getCollectionOfObjectValues(MacOSSoftwareUpdateCategorySummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("failedUpdateCount", (n) -> { currentObject.setFailedUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
        deserializerMap.put("successfulUpdateCount", (n) -> { currentObject.setSuccessfulUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("totalUpdateCount", (n) -> { currentObject.setTotalUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the osVersion property value. The OS version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the successfulUpdateCount property value. Number of successful updates on the device.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSuccessfulUpdateCount() {
        return this._successfulUpdateCount;
    }
    /**
     * Gets the totalUpdateCount property value. Number of total updates on the device.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalUpdateCount() {
        return this._totalUpdateCount;
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
     * Gets the userPrincipalName property value. The user principal name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
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
    @javax.annotation.Nonnull
    public void setCategorySummaries(@javax.annotation.Nullable final java.util.List<MacOSSoftwareUpdateCategorySummary> value) {
        this._categorySummaries = value;
    }
    /**
     * Sets the deviceId property value. The device ID.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. The device name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the displayName property value. The name of the report
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the failedUpdateCount property value. Number of failed updates on the device.
     * @param value Value to set for the failedUpdateCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedUpdateCount(@javax.annotation.Nullable final Integer value) {
        this._failedUpdateCount = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Last date time the report for this device was updated.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the osVersion property value. The OS version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the successfulUpdateCount property value. Number of successful updates on the device.
     * @param value Value to set for the successfulUpdateCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSuccessfulUpdateCount(@javax.annotation.Nullable final Integer value) {
        this._successfulUpdateCount = value;
    }
    /**
     * Sets the totalUpdateCount property value. Number of total updates on the device.
     * @param value Value to set for the totalUpdateCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalUpdateCount(@javax.annotation.Nullable final Integer value) {
        this._totalUpdateCount = value;
    }
    /**
     * Sets the userId property value. The user ID.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
