package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device configuration group assignment. */
public class DeviceConfigurationGroupAssignment extends Entity implements Parsable {
    /** The navigation link to the Device Configuration being targeted. */
    private DeviceConfiguration _deviceConfiguration;
    /** Indicates if this group is should be excluded. Defaults that the group should be included */
    private Boolean _excludeGroup;
    /** The Id of the AAD group we are targeting the device configuration to. */
    private String _targetGroupId;
    /**
     * Instantiates a new deviceConfigurationGroupAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceConfigurationGroupAssignment() {
        super();
        this.setOdataType("#microsoft.graph.deviceConfigurationGroupAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationGroupAssignment
     */
    @javax.annotation.Nonnull
    public static DeviceConfigurationGroupAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationGroupAssignment();
    }
    /**
     * Gets the deviceConfiguration property value. The navigation link to the Device Configuration being targeted.
     * @return a deviceConfiguration
     */
    @javax.annotation.Nullable
    public DeviceConfiguration getDeviceConfiguration() {
        return this._deviceConfiguration;
    }
    /**
     * Gets the excludeGroup property value. Indicates if this group is should be excluded. Defaults that the group should be included
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExcludeGroup() {
        return this._excludeGroup;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceConfigurationGroupAssignment currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceConfiguration", (n) -> { currentObject.setDeviceConfiguration(n.getObjectValue(DeviceConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeGroup", (n) -> { currentObject.setExcludeGroup(n.getBooleanValue()); });
        deserializerMap.put("targetGroupId", (n) -> { currentObject.setTargetGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetGroupId property value. The Id of the AAD group we are targeting the device configuration to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetGroupId() {
        return this._targetGroupId;
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
        writer.writeObjectValue("deviceConfiguration", this.getDeviceConfiguration());
        writer.writeBooleanValue("excludeGroup", this.getExcludeGroup());
        writer.writeStringValue("targetGroupId", this.getTargetGroupId());
    }
    /**
     * Sets the deviceConfiguration property value. The navigation link to the Device Configuration being targeted.
     * @param value Value to set for the deviceConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfiguration(@javax.annotation.Nullable final DeviceConfiguration value) {
        this._deviceConfiguration = value;
    }
    /**
     * Sets the excludeGroup property value. Indicates if this group is should be excluded. Defaults that the group should be included
     * @param value Value to set for the excludeGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeGroup(@javax.annotation.Nullable final Boolean value) {
        this._excludeGroup = value;
    }
    /**
     * Sets the targetGroupId property value. The Id of the AAD group we are targeting the device configuration to.
     * @param value Value to set for the targetGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetGroupId(@javax.annotation.Nullable final String value) {
        this._targetGroupId = value;
    }
}
