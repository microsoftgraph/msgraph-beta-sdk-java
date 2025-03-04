package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * ChangeAssignmentsActionResult represents the result of executing the changeAssignments action on tracking the live reporting data for applications or configuration regarding their removal or restoration process
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChangeAssignmentsActionResult extends DeviceActionResult implements Parsable {
    /**
     * Instantiates a new {@link ChangeAssignmentsActionResult} and sets the default values.
     */
    public ChangeAssignmentsActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChangeAssignmentsActionResult}
     */
    @jakarta.annotation.Nonnull
    public static ChangeAssignmentsActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeAssignmentsActionResult();
    }
    /**
     * Gets the deviceAssignmentItems property value. Indicates the list of applications or configuration to report live results during their changeAssignments action execution process. The result for each individual application or configuration can contain whether it&apos;s being removed or restored, what&apos;s the current status with potential message or error code, and when any changes happen on it. Read-Only. This collection can contain a maximum of 30 elements.
     * @return a {@link java.util.List<DeviceAssignmentItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAssignmentItem> getDeviceAssignmentItems() {
        return this.backingStore.get("deviceAssignmentItems");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceAssignmentItems", (n) -> { this.setDeviceAssignmentItems(n.getCollectionOfObjectValues(DeviceAssignmentItem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deviceAssignmentItems", this.getDeviceAssignmentItems());
    }
    /**
     * Sets the deviceAssignmentItems property value. Indicates the list of applications or configuration to report live results during their changeAssignments action execution process. The result for each individual application or configuration can contain whether it&apos;s being removed or restored, what&apos;s the current status with potential message or error code, and when any changes happen on it. Read-Only. This collection can contain a maximum of 30 elements.
     * @param value Value to set for the deviceAssignmentItems property.
     */
    public void setDeviceAssignmentItems(@jakarta.annotation.Nullable final java.util.List<DeviceAssignmentItem> value) {
        this.backingStore.set("deviceAssignmentItems", value);
    }
}
