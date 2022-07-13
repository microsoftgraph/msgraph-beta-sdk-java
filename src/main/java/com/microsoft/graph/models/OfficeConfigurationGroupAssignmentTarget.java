package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeConfigurationGroupAssignmentTarget extends OfficeConfigurationAssignmentTarget implements Parsable {
    /** The Id of the AAD group we are targeting the device configuration to. */
    private String _groupId;
    /**
     * Instantiates a new OfficeConfigurationGroupAssignmentTarget and sets the default values.
     * @return a void
     */
    public OfficeConfigurationGroupAssignmentTarget() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OfficeConfigurationGroupAssignmentTarget
     */
    @javax.annotation.Nonnull
    public static OfficeConfigurationGroupAssignmentTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeConfigurationGroupAssignmentTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfficeConfigurationGroupAssignmentTarget currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("groupId", (n) -> { currentObject.setGroupId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupId property value. The Id of the AAD group we are targeting the device configuration to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this._groupId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupId", this.getGroupId());
    }
    /**
     * Sets the groupId property value. The Id of the AAD group we are targeting the device configuration to.
     * @param value Value to set for the groupId property.
     * @return a void
     */
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this._groupId = value;
    }
}
