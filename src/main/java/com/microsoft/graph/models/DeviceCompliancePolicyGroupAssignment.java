package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceCompliancePolicyGroupAssignment extends Entity implements Parsable {
    /** The navigation link to the  device compliance polic targeted. */
    private DeviceCompliancePolicy deviceCompliancePolicy;
    /** Indicates if this group is should be excluded. Defaults that the group should be included */
    private Boolean excludeGroup;
    /** The Id of the AAD group we are targeting the device compliance policy to. */
    private String targetGroupId;
    /**
     * Instantiates a new DeviceCompliancePolicyGroupAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyGroupAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceCompliancePolicyGroupAssignment
     */
    @javax.annotation.Nonnull
    public static DeviceCompliancePolicyGroupAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceCompliancePolicyGroupAssignment();
    }
    /**
     * Gets the deviceCompliancePolicy property value. The navigation link to the  device compliance polic targeted.
     * @return a deviceCompliancePolicy
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicy getDeviceCompliancePolicy() {
        return this.deviceCompliancePolicy;
    }
    /**
     * Gets the excludeGroup property value. Indicates if this group is should be excluded. Defaults that the group should be included
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExcludeGroup() {
        return this.excludeGroup;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceCompliancePolicy", (n) -> { this.setDeviceCompliancePolicy(n.getObjectValue(DeviceCompliancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeGroup", (n) -> { this.setExcludeGroup(n.getBooleanValue()); });
        deserializerMap.put("targetGroupId", (n) -> { this.setTargetGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetGroupId property value. The Id of the AAD group we are targeting the device compliance policy to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetGroupId() {
        return this.targetGroupId;
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
        writer.writeObjectValue("deviceCompliancePolicy", this.getDeviceCompliancePolicy());
        writer.writeBooleanValue("excludeGroup", this.getExcludeGroup());
        writer.writeStringValue("targetGroupId", this.getTargetGroupId());
    }
    /**
     * Sets the deviceCompliancePolicy property value. The navigation link to the  device compliance polic targeted.
     * @param value Value to set for the deviceCompliancePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicy(@javax.annotation.Nullable final DeviceCompliancePolicy value) {
        this.deviceCompliancePolicy = value;
    }
    /**
     * Sets the excludeGroup property value. Indicates if this group is should be excluded. Defaults that the group should be included
     * @param value Value to set for the excludeGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeGroup(@javax.annotation.Nullable final Boolean value) {
        this.excludeGroup = value;
    }
    /**
     * Sets the targetGroupId property value. The Id of the AAD group we are targeting the device compliance policy to.
     * @param value Value to set for the targetGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetGroupId(@javax.annotation.Nullable final String value) {
        this.targetGroupId = value;
    }
}
