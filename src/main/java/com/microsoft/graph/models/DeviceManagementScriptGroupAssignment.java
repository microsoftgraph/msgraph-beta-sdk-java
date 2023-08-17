package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign a device management script to a group.
 */
public class DeviceManagementScriptGroupAssignment extends Entity implements Parsable {
    /**
     * The Id of the Azure Active Directory group we are targeting the script to.
     */
    private String targetGroupId;
    /**
     * Instantiates a new deviceManagementScriptGroupAssignment and sets the default values.
     */
    public DeviceManagementScriptGroupAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementScriptGroupAssignment
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementScriptGroupAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScriptGroupAssignment();
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
     * Gets the targetGroupId property value. The Id of the Azure Active Directory group we are targeting the script to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetGroupId() {
        return this.targetGroupId;
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
     * Sets the targetGroupId property value. The Id of the Azure Active Directory group we are targeting the script to.
     * @param value Value to set for the targetGroupId property.
     */
    public void setTargetGroupId(@jakarta.annotation.Nullable final String value) {
        this.targetGroupId = value;
    }
}
