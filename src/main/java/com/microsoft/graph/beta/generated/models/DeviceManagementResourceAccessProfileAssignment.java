package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that describes tenant level settings for derived credentials
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementResourceAccessProfileAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementResourceAccessProfileAssignment} and sets the default values.
     */
    public DeviceManagementResourceAccessProfileAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementResourceAccessProfileAssignment}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementResourceAccessProfileAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementResourceAccessProfileAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("intent", (n) -> { this.setIntent(n.getEnumValue(DeviceManagementResourceAccessProfileIntent::forValue)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intent property value. The administrator intent for the assignment of the profile.
     * @return a {@link DeviceManagementResourceAccessProfileIntent}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementResourceAccessProfileIntent getIntent() {
        return this.backingStore.get("intent");
    }
    /**
     * Gets the sourceId property value. The identifier of the source of the assignment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.backingStore.get("sourceId");
    }
    /**
     * Gets the target property value. Base type for assignment targets.
     * @return a {@link DeviceAndAppManagementAssignmentTarget}
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
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the intent property value. The administrator intent for the assignment of the profile.
     * @param value Value to set for the intent property.
     */
    public void setIntent(@jakarta.annotation.Nullable final DeviceManagementResourceAccessProfileIntent value) {
        this.backingStore.set("intent", value);
    }
    /**
     * Sets the sourceId property value. The identifier of the source of the assignment.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceId", value);
    }
    /**
     * Sets the target property value. Base type for assignment targets.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.backingStore.set("target", value);
    }
}
