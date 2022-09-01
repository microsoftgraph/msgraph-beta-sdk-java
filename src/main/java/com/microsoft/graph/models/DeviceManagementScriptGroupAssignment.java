package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties used to assign a device management script to a group. */
public class DeviceManagementScriptGroupAssignment extends Entity implements Parsable {
    /** The Id of the Azure Active Directory group we are targeting the script to. */
    private String _targetGroupId;
    /**
     * Instantiates a new deviceManagementScriptGroupAssignment and sets the default values.
     * @return a void
     */
    public DeviceManagementScriptGroupAssignment() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementScriptGroupAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementScriptGroupAssignment
     */
    @javax.annotation.Nonnull
    public static DeviceManagementScriptGroupAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementScriptGroupAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementScriptGroupAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("targetGroupId", (n) -> { currentObject.setTargetGroupId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the targetGroupId property value. The Id of the Azure Active Directory group we are targeting the script to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetGroupId() {
        return this._targetGroupId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetGroupId", this.getTargetGroupId());
    }
    /**
     * Sets the targetGroupId property value. The Id of the Azure Active Directory group we are targeting the script to.
     * @param value Value to set for the targetGroupId property.
     * @return a void
     */
    public void setTargetGroupId(@javax.annotation.Nullable final String value) {
        this._targetGroupId = value;
    }
}
