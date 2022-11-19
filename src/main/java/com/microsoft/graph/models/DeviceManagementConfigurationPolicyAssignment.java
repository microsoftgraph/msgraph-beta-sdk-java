package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The DeviceManagementConfigurationPolicyAssignment entity assigns a specific DeviceManagementConfigurationPolicy to an AAD group. */
public class DeviceManagementConfigurationPolicyAssignment extends Entity implements Parsable {
    /** Represents source of assignment. */
    private DeviceAndAppManagementAssignmentSource _source;
    /** The identifier of the source of the assignment. */
    private String _sourceId;
    /** The assignment target for the DeviceManagementConfigurationPolicy. */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new deviceManagementConfigurationPolicyAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPolicyAssignment() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationPolicyAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationPolicyAssignment
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationPolicyAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationPolicyAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationPolicyAssignment currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("source", (n) -> { currentObject.setSource(n.getEnumValue(DeviceAndAppManagementAssignmentSource.class)); });
        deserializerMap.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the source property value. Represents source of assignment.
     * @return a deviceAndAppManagementAssignmentSource
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentSource getSource() {
        return this._source;
    }
    /**
     * Gets the sourceId property value. The identifier of the source of the assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Gets the target property value. The assignment target for the DeviceManagementConfigurationPolicy.
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this._target;
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
        writer.writeEnumValue("source", this.getSource());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the source property value. Represents source of assignment.
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentSource value) {
        this._source = value;
    }
    /**
     * Sets the sourceId property value. The identifier of the source of the assignment.
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
    /**
     * Sets the target property value. The assignment target for the DeviceManagementConfigurationPolicy.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
