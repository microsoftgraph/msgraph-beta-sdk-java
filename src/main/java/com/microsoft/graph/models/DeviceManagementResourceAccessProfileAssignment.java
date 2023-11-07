package com.microsoft.graph.models;

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
     * The administrator intent for the assignment of the profile.
     */
    private DeviceManagementResourceAccessProfileIntent intent;
    /**
     * The identifier of the source of the assignment.
     */
    private String sourceId;
    /**
     * Base type for assignment targets.
     */
    private DeviceAndAppManagementAssignmentTarget target;
    /**
     * Instantiates a new DeviceManagementResourceAccessProfileAssignment and sets the default values.
     */
    public DeviceManagementResourceAccessProfileAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementResourceAccessProfileAssignment
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementResourceAccessProfileAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementResourceAccessProfileAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("intent", (n) -> { this.setIntent(n.getEnumValue(DeviceManagementResourceAccessProfileIntent.class)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the intent property value. The administrator intent for the assignment of the profile.
     * @return a DeviceManagementResourceAccessProfileIntent
     */
    @jakarta.annotation.Nullable
    public DeviceManagementResourceAccessProfileIntent getIntent() {
        return this.intent;
    }
    /**
     * Gets the sourceId property value. The identifier of the source of the assignment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the target property value. Base type for assignment targets.
     * @return a DeviceAndAppManagementAssignmentTarget
     */
    @jakarta.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this.target;
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
        this.intent = value;
    }
    /**
     * Sets the sourceId property value. The identifier of the source of the assignment.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the target property value. Base type for assignment targets.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.target = value;
    }
}
