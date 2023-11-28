package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The device configuration assignment entity assigns an AAD group to a specific device configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfigurationAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceConfigurationAssignment and sets the default values.
     */
    public DeviceConfigurationAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceConfigurationAssignment
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfigurationAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("intent", (n) -> { this.setIntent(n.getEnumValue(DeviceConfigAssignmentIntent::forValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(DeviceAndAppManagementAssignmentSource::forValue)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intent property value. The admin intent to apply or remove the profile. Possible values are: apply, remove.
     * @return a DeviceConfigAssignmentIntent
     */
    @jakarta.annotation.Nullable
    public DeviceConfigAssignmentIntent getIntent() {
        return this.backingStore.get("intent");
    }
    /**
     * Gets the source property value. Represents source of assignment.
     * @return a DeviceAndAppManagementAssignmentSource
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentSource getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the sourceId property value. The identifier of the source of the assignment. This property is read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.backingStore.get("sourceId");
    }
    /**
     * Gets the target property value. The assignment target for the device configuration.
     * @return a DeviceAndAppManagementAssignmentTarget
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this.backingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("intent", this.getIntent());
        writer.writeEnumValue("source", this.getSource());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the intent property value. The admin intent to apply or remove the profile. Possible values are: apply, remove.
     * @param value Value to set for the intent property.
     */
    public void setIntent(@jakarta.annotation.Nullable final DeviceConfigAssignmentIntent value) {
        this.backingStore.set("intent", value);
    }
    /**
     * Sets the source property value. Represents source of assignment.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentSource value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the sourceId property value. The identifier of the source of the assignment. This property is read-only.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceId", value);
    }
    /**
     * Sets the target property value. The assignment target for the device configuration.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.backingStore.set("target", value);
    }
}
