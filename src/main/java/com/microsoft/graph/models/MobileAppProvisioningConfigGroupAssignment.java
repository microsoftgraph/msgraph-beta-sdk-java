package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains the properties used to assign an App provisioning configuration to a group.
 */
public class MobileAppProvisioningConfigGroupAssignment extends Entity implements Parsable {
    /** The ID of the AAD group in which the app provisioning configuration is being targeted. */
    private String targetGroupId;
    /**
     * Instantiates a new mobileAppProvisioningConfigGroupAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppProvisioningConfigGroupAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppProvisioningConfigGroupAssignment
     */
    @javax.annotation.Nonnull
    public static MobileAppProvisioningConfigGroupAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppProvisioningConfigGroupAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetGroupId", (n) -> { this.setTargetGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetGroupId property value. The ID of the AAD group in which the app provisioning configuration is being targeted.
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
        writer.writeStringValue("targetGroupId", this.getTargetGroupId());
    }
    /**
     * Sets the targetGroupId property value. The ID of the AAD group in which the app provisioning configuration is being targeted.
     * @param value Value to set for the targetGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetGroupId(@javax.annotation.Nullable final String value) {
        this.targetGroupId = value;
    }
}
