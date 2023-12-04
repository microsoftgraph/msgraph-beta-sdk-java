package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics device scope entity contains device scope configuration values use to apply filtering on the endpoint analytics reports.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsDeviceScope extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceScope and sets the default values.
     */
    public UserExperienceAnalyticsDeviceScope() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDeviceScope
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceScope createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceScope();
    }
    /**
     * Gets the createdDateTime property value. Indicates the creation date and time for the custom device scope.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deviceScopeName property value. The name of the user experience analytics device Scope configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceScopeName() {
        return this.backingStore.get("deviceScopeName");
    }
    /**
     * Gets the enabled property value. Indicates whether a device scope is enabled or disabled. When TRUE, the device scope is enabled. When FALSE, the device scope is disabled. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.backingStore.get("enabled");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceScopeName", (n) -> { this.setDeviceScopeName(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(DeviceScopeOperator::forValue)); });
        deserializerMap.put("ownerId", (n) -> { this.setOwnerId(n.getStringValue()); });
        deserializerMap.put("parameter", (n) -> { this.setParameter(n.getEnumValue(DeviceScopeParameter::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DeviceScopeStatus::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        deserializerMap.put("valueObjectId", (n) -> { this.setValueObjectId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isBuiltIn property value. Indicates whether the device scope configuration is built-in or custom. When TRUE, the device scope configuration is built-in. When FALSE, the device scope configuration is custom. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.backingStore.get("isBuiltIn");
    }
    /**
     * Gets the lastModifiedDateTime property value. Indicates the last updated date and time for the custom device scope.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the operator property value. Device scope configuration query operator. Possible values are: equals, notEquals, contains, notContains, greaterThan, lessThan. Default value: equals.
     * @return a DeviceScopeOperator
     */
    @jakarta.annotation.Nullable
    public DeviceScopeOperator getOperator() {
        return this.backingStore.get("operator");
    }
    /**
     * Gets the ownerId property value. The unique identifier of the person (admin) who created the device scope configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnerId() {
        return this.backingStore.get("ownerId");
    }
    /**
     * Gets the parameter property value. Device scope configuration parameter. It will be expend in future to add more parameter. Eg: device scope parameter can be OS version, Disk Type, Device manufacturer, device model or Scope tag. Default value: scopeTag.
     * @return a DeviceScopeParameter
     */
    @jakarta.annotation.Nullable
    public DeviceScopeParameter getParameter() {
        return this.backingStore.get("parameter");
    }
    /**
     * Gets the status property value. Indicates the device scope status after the device scope has been enabled. Possible values are: none, computing, insufficientData or completed. Default value is none.
     * @return a DeviceScopeStatus
     */
    @jakarta.annotation.Nullable
    public DeviceScopeStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the value property value. The device scope configuration query clause value.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Gets the valueObjectId property value. The unique identifier for a user device scope tag Id used for the creation of device scope configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValueObjectId() {
        return this.backingStore.get("valueObjectId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deviceScopeName property value. The name of the user experience analytics device Scope configuration.
     * @param value Value to set for the deviceScopeName property.
     */
    public void setDeviceScopeName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceScopeName", value);
    }
    /**
     * Sets the enabled property value. Indicates whether a device scope is enabled or disabled. When TRUE, the device scope is enabled. When FALSE, the device scope is disabled. Default value is FALSE.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enabled", value);
    }
    /**
     * Sets the isBuiltIn property value. Indicates whether the device scope configuration is built-in or custom. When TRUE, the device scope configuration is built-in. When FALSE, the device scope configuration is custom. Default value is FALSE.
     * @param value Value to set for the isBuiltIn property.
     */
    public void setIsBuiltIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBuiltIn", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Indicates the last updated date and time for the custom device scope.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the operator property value. Device scope configuration query operator. Possible values are: equals, notEquals, contains, notContains, greaterThan, lessThan. Default value: equals.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final DeviceScopeOperator value) {
        this.backingStore.set("operator", value);
    }
    /**
     * Sets the ownerId property value. The unique identifier of the person (admin) who created the device scope configuration.
     * @param value Value to set for the ownerId property.
     */
    public void setOwnerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerId", value);
    }
    /**
     * Sets the parameter property value. Device scope configuration parameter. It will be expend in future to add more parameter. Eg: device scope parameter can be OS version, Disk Type, Device manufacturer, device model or Scope tag. Default value: scopeTag.
     * @param value Value to set for the parameter property.
     */
    public void setParameter(@jakarta.annotation.Nullable final DeviceScopeParameter value) {
        this.backingStore.set("parameter", value);
    }
    /**
     * Sets the status property value. Indicates the device scope status after the device scope has been enabled. Possible values are: none, computing, insufficientData or completed. Default value is none.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DeviceScopeStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the value property value. The device scope configuration query clause value.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
    /**
     * Sets the valueObjectId property value. The unique identifier for a user device scope tag Id used for the creation of device scope configuration.
     * @param value Value to set for the valueObjectId property.
     */
    public void setValueObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("valueObjectId", value);
    }
}
