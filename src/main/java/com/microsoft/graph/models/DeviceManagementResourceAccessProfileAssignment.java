package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementResourceAccessProfileAssignment extends Entity implements Parsable {
    /** The assignment intent for the resource access profile. Possible values are: apply, remove. */
    private DeviceManagementResourceAccessProfileIntent _intent;
    /** The identifier of the source of the assignment. */
    private String _sourceId;
    /** Base type for assignment targets. */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new deviceManagementResourceAccessProfileAssignment and sets the default values.
     * @return a void
     */
    public DeviceManagementResourceAccessProfileAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementResourceAccessProfileAssignment
     */
    @javax.annotation.Nonnull
    public static DeviceManagementResourceAccessProfileAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementResourceAccessProfileAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementResourceAccessProfileAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("intent", (n) -> { currentObject.setIntent(n.getEnumValue(DeviceManagementResourceAccessProfileIntent.class)); });
            this.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the intent property value. The assignment intent for the resource access profile. Possible values are: apply, remove.
     * @return a deviceManagementResourceAccessProfileIntent
     */
    @javax.annotation.Nullable
    public DeviceManagementResourceAccessProfileIntent getIntent() {
        return this._intent;
    }
    /**
     * Gets the sourceId property value. The identifier of the source of the assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Gets the target property value. Base type for assignment targets.
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
        writer.writeEnumValue("intent", this.getIntent());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the intent property value. The assignment intent for the resource access profile. Possible values are: apply, remove.
     * @param value Value to set for the intent property.
     * @return a void
     */
    public void setIntent(@javax.annotation.Nullable final DeviceManagementResourceAccessProfileIntent value) {
        this._intent = value;
    }
    /**
     * Sets the sourceId property value. The identifier of the source of the assignment.
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
    /**
     * Sets the target property value. Base type for assignment targets.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
