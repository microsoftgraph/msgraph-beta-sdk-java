package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsDeviceScope extends Entity implements Parsable {
    /** Indicates the creation date and time for the custom device scope. */
    private OffsetDateTime _createdDateTime;
    /** The name of the user experience analytics device Scope configuration. */
    private String _deviceScopeName;
    /** Indicates whether a device scope is enabled or disabled. When TRUE, the device scope is enabled. When FALSE, the device scope is disabled. Default value is FALSE. */
    private Boolean _enabled;
    /** Indicates whether the device scope configuration is built-in or custom. When TRUE, the device scope configuration is built-in. When FALSE, the device scope configuration is custom. Default value is FALSE. */
    private Boolean _isBuiltIn;
    /** Indicates the last updated date and time for the custom device scope. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Device scope configuration query operator. Possible values are: equals, notEquals, contains, notContains, greaterThan, lessThan. Default value: equals. */
    private DeviceScopeOperator _operator;
    /** The unique identifier of the person (admin) who created the device scope configuration. */
    private String _ownerId;
    /** Device scope configuration parameter. It will be expend in future to add more parameter. Eg: device scope parameter can be OS version, Disk Type, Device manufacturer, device model or Scope tag. Default value: scopeTag. */
    private DeviceScopeParameter _parameter;
    /** Indicates the device scope status after the device scope has been enabled. Possible values are: none, computing, insufficientData or completed. Default value is none. */
    private DeviceScopeStatus _status;
    /** The device scope configuration query clause value. */
    private String _value;
    /** The unique identifier for a user device scope tag Id used for the creation of device scope configuration. */
    private String _valueObjectId;
    /**
     * Instantiates a new userExperienceAnalyticsDeviceScope and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsDeviceScope
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceScope();
    }
    /**
     * Gets the createdDateTime property value. Indicates the creation date and time for the custom device scope.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deviceScopeName property value. The name of the user experience analytics device Scope configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceScopeName() {
        return this._deviceScopeName;
    }
    /**
     * Gets the enabled property value. Indicates whether a device scope is enabled or disabled. When TRUE, the device scope is enabled. When FALSE, the device scope is disabled. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceScopeName", (n) -> { this.setDeviceScopeName(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(DeviceScopeOperator.class)); });
        deserializerMap.put("ownerId", (n) -> { this.setOwnerId(n.getStringValue()); });
        deserializerMap.put("parameter", (n) -> { this.setParameter(n.getEnumValue(DeviceScopeParameter.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceScopeStatus.class)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        deserializerMap.put("valueObjectId", (n) -> { this.setValueObjectId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isBuiltIn property value. Indicates whether the device scope configuration is built-in or custom. When TRUE, the device scope configuration is built-in. When FALSE, the device scope configuration is custom. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this._isBuiltIn;
    }
    /**
     * Gets the lastModifiedDateTime property value. Indicates the last updated date and time for the custom device scope.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the operator property value. Device scope configuration query operator. Possible values are: equals, notEquals, contains, notContains, greaterThan, lessThan. Default value: equals.
     * @return a deviceScopeOperator
     */
    @javax.annotation.Nullable
    public DeviceScopeOperator getOperator() {
        return this._operator;
    }
    /**
     * Gets the ownerId property value. The unique identifier of the person (admin) who created the device scope configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerId() {
        return this._ownerId;
    }
    /**
     * Gets the parameter property value. Device scope configuration parameter. It will be expend in future to add more parameter. Eg: device scope parameter can be OS version, Disk Type, Device manufacturer, device model or Scope tag. Default value: scopeTag.
     * @return a deviceScopeParameter
     */
    @javax.annotation.Nullable
    public DeviceScopeParameter getParameter() {
        return this._parameter;
    }
    /**
     * Gets the status property value. Indicates the device scope status after the device scope has been enabled. Possible values are: none, computing, insufficientData or completed. Default value is none.
     * @return a deviceScopeStatus
     */
    @javax.annotation.Nullable
    public DeviceScopeStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the value property value. The device scope configuration query clause value.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Gets the valueObjectId property value. The unique identifier for a user device scope tag Id used for the creation of device scope configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueObjectId() {
        return this._valueObjectId;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deviceScopeName", this.getDeviceScopeName());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeStringValue("ownerId", this.getOwnerId());
        writer.writeEnumValue("parameter", this.getParameter());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("value", this.getValue());
        writer.writeStringValue("valueObjectId", this.getValueObjectId());
    }
    /**
     * Sets the createdDateTime property value. Indicates the creation date and time for the custom device scope.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deviceScopeName property value. The name of the user experience analytics device Scope configuration.
     * @param value Value to set for the deviceScopeName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceScopeName(@javax.annotation.Nullable final String value) {
        this._deviceScopeName = value;
    }
    /**
     * Sets the enabled property value. Indicates whether a device scope is enabled or disabled. When TRUE, the device scope is enabled. When FALSE, the device scope is disabled. Default value is FALSE.
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the isBuiltIn property value. Indicates whether the device scope configuration is built-in or custom. When TRUE, the device scope configuration is built-in. When FALSE, the device scope configuration is custom. Default value is FALSE.
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this._isBuiltIn = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Indicates the last updated date and time for the custom device scope.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the operator property value. Device scope configuration query operator. Possible values are: equals, notEquals, contains, notContains, greaterThan, lessThan. Default value: equals.
     * @param value Value to set for the operator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperator(@javax.annotation.Nullable final DeviceScopeOperator value) {
        this._operator = value;
    }
    /**
     * Sets the ownerId property value. The unique identifier of the person (admin) who created the device scope configuration.
     * @param value Value to set for the ownerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerId(@javax.annotation.Nullable final String value) {
        this._ownerId = value;
    }
    /**
     * Sets the parameter property value. Device scope configuration parameter. It will be expend in future to add more parameter. Eg: device scope parameter can be OS version, Disk Type, Device manufacturer, device model or Scope tag. Default value: scopeTag.
     * @param value Value to set for the parameter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParameter(@javax.annotation.Nullable final DeviceScopeParameter value) {
        this._parameter = value;
    }
    /**
     * Sets the status property value. Indicates the device scope status after the device scope has been enabled. Possible values are: none, computing, insufficientData or completed. Default value is none.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final DeviceScopeStatus value) {
        this._status = value;
    }
    /**
     * Sets the value property value. The device scope configuration query clause value.
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
    /**
     * Sets the valueObjectId property value. The unique identifier for a user device scope tag Id used for the creation of device scope configuration.
     * @param value Value to set for the valueObjectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueObjectId(@javax.annotation.Nullable final String value) {
        this._valueObjectId = value;
    }
}
