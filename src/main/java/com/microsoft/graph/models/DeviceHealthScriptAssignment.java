package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthScriptAssignment extends Entity implements Parsable {
    /** Determine whether we want to run detection script only or run both detection script and remediation script  */
    private Boolean _runRemediationScript;
    /** Script run schedule for the target group  */
    private DeviceHealthScriptRunSchedule _runSchedule;
    /** The Azure Active Directory group we are targeting the script to  */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new deviceHealthScriptAssignment and sets the default values.
     * @return a void
     */
    public DeviceHealthScriptAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptAssignment
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("runRemediationScript", (n) -> { currentObject.setRunRemediationScript(n.getBooleanValue()); });
            this.put("runSchedule", (n) -> { currentObject.setRunSchedule(n.getObjectValue(DeviceHealthScriptRunSchedule::createFromDiscriminatorValue)); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the runRemediationScript property value. Determine whether we want to run detection script only or run both detection script and remediation script
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRunRemediationScript() {
        return this._runRemediationScript;
    }
    /**
     * Gets the runSchedule property value. Script run schedule for the target group
     * @return a deviceHealthScriptRunSchedule
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptRunSchedule getRunSchedule() {
        return this._runSchedule;
    }
    /**
     * Gets the target property value. The Azure Active Directory group we are targeting the script to
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentTarget getTarget() {
        return this._target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("runRemediationScript", this.getRunRemediationScript());
        writer.writeObjectValue("runSchedule", this.getRunSchedule());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the runRemediationScript property value. Determine whether we want to run detection script only or run both detection script and remediation script
     * @param value Value to set for the runRemediationScript property.
     * @return a void
     */
    public void setRunRemediationScript(@javax.annotation.Nullable final Boolean value) {
        this._runRemediationScript = value;
    }
    /**
     * Sets the runSchedule property value. Script run schedule for the target group
     * @param value Value to set for the runSchedule property.
     * @return a void
     */
    public void setRunSchedule(@javax.annotation.Nullable final DeviceHealthScriptRunSchedule value) {
        this._runSchedule = value;
    }
    /**
     * Sets the target property value. The Azure Active Directory group we are targeting the script to
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
