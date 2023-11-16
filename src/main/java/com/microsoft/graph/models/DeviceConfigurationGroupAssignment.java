package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device configuration group assignment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfigurationGroupAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceConfigurationGroupAssignment and sets the default values.
     */
    public DeviceConfigurationGroupAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceConfigurationGroupAssignment
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfigurationGroupAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationGroupAssignment();
    }
    /**
     * Gets the deviceConfiguration property value. The navigation link to the Device Configuration being targeted.
     * @return a DeviceConfiguration
     */
    @jakarta.annotation.Nullable
    public DeviceConfiguration getDeviceConfiguration() {
        return this.BackingStore.get("deviceConfiguration");
    }
    /**
     * Gets the excludeGroup property value. Indicates if this group is should be excluded. Defaults that the group should be included
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExcludeGroup() {
        return this.BackingStore.get("excludeGroup");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceConfiguration", (n) -> { this.setDeviceConfiguration(n.getObjectValue(DeviceConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeGroup", (n) -> { this.setExcludeGroup(n.getBooleanValue()); });
        deserializerMap.put("targetGroupId", (n) -> { this.setTargetGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetGroupId property value. The Id of the AAD group we are targeting the device configuration to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetGroupId() {
        return this.BackingStore.get("targetGroupId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("deviceConfiguration", this.getDeviceConfiguration());
        writer.writeBooleanValue("excludeGroup", this.getExcludeGroup());
        writer.writeStringValue("targetGroupId", this.getTargetGroupId());
    }
    /**
     * Sets the deviceConfiguration property value. The navigation link to the Device Configuration being targeted.
     * @param value Value to set for the deviceConfiguration property.
     */
    public void setDeviceConfiguration(@jakarta.annotation.Nullable final DeviceConfiguration value) {
        this.BackingStore.set("deviceConfiguration", value);
    }
    /**
     * Sets the excludeGroup property value. Indicates if this group is should be excluded. Defaults that the group should be included
     * @param value Value to set for the excludeGroup property.
     */
    public void setExcludeGroup(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("excludeGroup", value);
    }
    /**
     * Sets the targetGroupId property value. The Id of the AAD group we are targeting the device configuration to.
     * @param value Value to set for the targetGroupId property.
     */
    public void setTargetGroupId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("targetGroupId", value);
    }
}
