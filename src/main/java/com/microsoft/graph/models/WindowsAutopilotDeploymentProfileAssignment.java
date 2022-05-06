package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsAutopilotDeploymentProfileAssignment extends Entity implements Parsable {
    /** Type of resource used for deployment to a group, direct or parcel/policySet. Possible values are: direct, policySets.  */
    private DeviceAndAppManagementAssignmentSource _source;
    /** Identifier for resource used for deployment to a group  */
    private String _sourceId;
    /** The assignment target for the Windows Autopilot deployment profile.  */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new windowsAutopilotDeploymentProfileAssignment and sets the default values.
     * @return a void
     */
    public WindowsAutopilotDeploymentProfileAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsAutopilotDeploymentProfileAssignment
     */
    @javax.annotation.Nonnull
    public static WindowsAutopilotDeploymentProfileAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutopilotDeploymentProfileAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsAutopilotDeploymentProfileAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("source", (n) -> { currentObject.setSource(n.getEnumValue(DeviceAndAppManagementAssignmentSource.class)); });
            this.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the source property value. Type of resource used for deployment to a group, direct or parcel/policySet. Possible values are: direct, policySets.
     * @return a deviceAndAppManagementAssignmentSource
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentSource getSource() {
        return this._source;
    }
    /**
     * Gets the sourceId property value. Identifier for resource used for deployment to a group
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Gets the target property value. The assignment target for the Windows Autopilot deployment profile.
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
        writer.writeEnumValue("source", this.getSource());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the source property value. Type of resource used for deployment to a group, direct or parcel/policySet. Possible values are: direct, policySets.
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentSource value) {
        this._source = value;
    }
    /**
     * Sets the sourceId property value. Identifier for resource used for deployment to a group
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
    /**
     * Sets the target property value. The assignment target for the Windows Autopilot deployment profile.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
