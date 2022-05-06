package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceConfigurationAssignment extends Entity implements Parsable {
    /** The admin intent to apply or remove the profile. Possible values are: apply, remove.  */
    private DeviceConfigAssignmentIntent _intent;
    /** The assignment source for the device configuration, direct or parcel/policySet. This property is read-only. Possible values are: direct, policySets.  */
    private DeviceAndAppManagementAssignmentSource _source;
    /** The identifier of the source of the assignment. This property is read-only.  */
    private String _sourceId;
    /** The assignment target for the device configuration.  */
    private DeviceAndAppManagementAssignmentTarget _target;
    /**
     * Instantiates a new deviceConfigurationAssignment and sets the default values.
     * @return a void
     */
    public DeviceConfigurationAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationAssignment
     */
    @javax.annotation.Nonnull
    public static DeviceConfigurationAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceConfigurationAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("intent", (n) -> { currentObject.setIntent(n.getEnumValue(DeviceConfigAssignmentIntent.class)); });
            this.put("source", (n) -> { currentObject.setSource(n.getEnumValue(DeviceAndAppManagementAssignmentSource.class)); });
            this.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(DeviceAndAppManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the intent property value. The admin intent to apply or remove the profile. Possible values are: apply, remove.
     * @return a deviceConfigAssignmentIntent
     */
    @javax.annotation.Nullable
    public DeviceConfigAssignmentIntent getIntent() {
        return this._intent;
    }
    /**
     * Gets the source property value. The assignment source for the device configuration, direct or parcel/policySet. This property is read-only. Possible values are: direct, policySets.
     * @return a deviceAndAppManagementAssignmentSource
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentSource getSource() {
        return this._source;
    }
    /**
     * Gets the sourceId property value. The identifier of the source of the assignment. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Gets the target property value. The assignment target for the device configuration.
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
        writer.writeEnumValue("source", this.getSource());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the intent property value. The admin intent to apply or remove the profile. Possible values are: apply, remove.
     * @param value Value to set for the intent property.
     * @return a void
     */
    public void setIntent(@javax.annotation.Nullable final DeviceConfigAssignmentIntent value) {
        this._intent = value;
    }
    /**
     * Sets the source property value. The assignment source for the device configuration, direct or parcel/policySet. This property is read-only. Possible values are: direct, policySets.
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentSource value) {
        this._source = value;
    }
    /**
     * Sets the sourceId property value. The identifier of the source of the assignment. This property is read-only.
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
    /**
     * Sets the target property value. The assignment target for the device configuration.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentTarget value) {
        this._target = value;
    }
}
