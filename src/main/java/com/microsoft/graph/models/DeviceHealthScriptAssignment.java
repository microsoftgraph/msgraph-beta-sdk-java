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
public class DeviceHealthScriptAssignment extends Entity implements Parsable {
    /**
     * Determine whether we want to run detection script only or run both detection script and remediation script
     */
    private Boolean runRemediationScript;
    /**
     * Script run schedule for the target group
     */
    private DeviceHealthScriptRunSchedule runSchedule;
    /**
     * The Azure Active Directory group we are targeting the script to
     */
    private DeviceAndAppManagementAssignmentTarget target;
    /**
     * Instantiates a new deviceHealthScriptAssignment and sets the default values.
     */
    public DeviceHealthScriptAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptAssignment
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScriptAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("runRemediationScript", (n) -> { this.setRunRemediationScript(n.getBooleanValue()); });
        deserializerMap.put("runSchedule", (n) -> { this.setRunSchedule(n.getObjectValue(DeviceHealthScriptRunSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the runRemediationScript property value. Determine whether we want to run detection script only or run both detection script and remediation script
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRunRemediationScript() {
        return this.runRemediationScript;
    }
    /**
     * Gets the runSchedule property value. Script run schedule for the target group
     * @return a deviceHealthScriptRunSchedule
     */
    @jakarta.annotation.Nullable
    public DeviceHealthScriptRunSchedule getRunSchedule() {
        return this.runSchedule;
    }
    /**
     * Gets the target property value. The Azure Active Directory group we are targeting the script to
     * @return a deviceAndAppManagementAssignmentTarget
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
        writer.writeBooleanValue("runRemediationScript", this.getRunRemediationScript());
        writer.writeObjectValue("runSchedule", this.getRunSchedule());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the runRemediationScript property value. Determine whether we want to run detection script only or run both detection script and remediation script
     * @param value Value to set for the runRemediationScript property.
     */
    public void setRunRemediationScript(@jakarta.annotation.Nullable final Boolean value) {
        this.runRemediationScript = value;
    }
    /**
     * Sets the runSchedule property value. Script run schedule for the target group
     * @param value Value to set for the runSchedule property.
     */
    public void setRunSchedule(@jakarta.annotation.Nullable final DeviceHealthScriptRunSchedule value) {
        this.runSchedule = value;
    }
    /**
     * Sets the target property value. The Azure Active Directory group we are targeting the script to
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this.target = value;
    }
}
