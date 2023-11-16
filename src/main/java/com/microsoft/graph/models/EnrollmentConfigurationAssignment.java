package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Enrollment Configuration Assignment
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnrollmentConfigurationAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new EnrollmentConfigurationAssignment and sets the default values.
     */
    public EnrollmentConfigurationAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EnrollmentConfigurationAssignment
     */
    @jakarta.annotation.Nonnull
    public static EnrollmentConfigurationAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnrollmentConfigurationAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(DeviceAndAppManagementAssignmentSource.class)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the source property value. Represents source of assignment.
     * @return a DeviceAndAppManagementAssignmentSource
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentSource getSource() {
        return this.BackingStore.get("source");
    }
    /**
     * Gets the sourceId property value. Identifier for resource used for deployment to a group
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.BackingStore.get("sourceId");
    }
    /**
     * Gets the target property value. Represents an assignment to managed devices in the tenant
     * @return a DeviceAndAppManagementAssignmentTarget
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this.BackingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("source", this.getSource());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the source property value. Represents source of assignment.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentSource value) {
        this.BackingStore.set("source", value);
    }
    /**
     * Sets the sourceId property value. Identifier for resource used for deployment to a group
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("sourceId", value);
    }
    /**
     * Sets the target property value. Represents an assignment to managed devices in the tenant
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.BackingStore.set("target", value);
    }
}
