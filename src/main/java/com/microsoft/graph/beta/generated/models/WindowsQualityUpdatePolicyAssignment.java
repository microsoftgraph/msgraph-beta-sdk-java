package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This entity contains the properties used to assign a Windows quality update policy to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdatePolicyAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WindowsQualityUpdatePolicyAssignment} and sets the default values.
     */
    public WindowsQualityUpdatePolicyAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdatePolicyAssignment}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdatePolicyAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdatePolicyAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the target property value. Base type for assignment targets.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.backingStore.set("target", value);
    }
}
