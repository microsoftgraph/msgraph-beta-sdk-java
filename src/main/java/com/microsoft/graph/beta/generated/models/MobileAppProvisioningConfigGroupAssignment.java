package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains the properties used to assign an App provisioning configuration to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppProvisioningConfigGroupAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new MobileAppProvisioningConfigGroupAssignment and sets the default values.
     */
    public MobileAppProvisioningConfigGroupAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppProvisioningConfigGroupAssignment
     */
    @jakarta.annotation.Nonnull
    public static MobileAppProvisioningConfigGroupAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppProvisioningConfigGroupAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetGroupId", (n) -> { this.setTargetGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetGroupId property value. The ID of the AAD group in which the app provisioning configuration is being targeted.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetGroupId() {
        return this.backingStore.get("targetGroupId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetGroupId", this.getTargetGroupId());
    }
    /**
     * Sets the targetGroupId property value. The ID of the AAD group in which the app provisioning configuration is being targeted.
     * @param value Value to set for the targetGroupId property.
     */
    public void setTargetGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetGroupId", value);
    }
}
