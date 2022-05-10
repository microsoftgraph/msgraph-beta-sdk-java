package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcUserSettingAssignment extends Entity implements Parsable {
    /** The date and time this assignment was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'. */
    private OffsetDateTime _createdDateTime;
    /** The assignment target for the user setting. Currently, the only target supported for this user setting is a user group. For details, see cloudPcManagementGroupAssignmentTarget. */
    private CloudPcManagementAssignmentTarget _target;
    /**
     * Instantiates a new cloudPcUserSettingAssignment and sets the default values.
     * @return a void
     */
    public CloudPcUserSettingAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcUserSettingAssignment
     */
    @javax.annotation.Nonnull
    public static CloudPcUserSettingAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcUserSettingAssignment();
    }
    /**
     * Gets the createdDateTime property value. The date and time this assignment was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcUserSettingAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(CloudPcManagementAssignmentTarget::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the target property value. The assignment target for the user setting. Currently, the only target supported for this user setting is a user group. For details, see cloudPcManagementGroupAssignmentTarget.
     * @return a cloudPcManagementAssignmentTarget
     */
    @javax.annotation.Nullable
    public CloudPcManagementAssignmentTarget getTarget() {
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the createdDateTime property value. The date and time this assignment was created. The Timestamp type represents the date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: '2014-01-01T00:00:00Z'.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the target property value. The assignment target for the user setting. Currently, the only target supported for this user setting is a user group. For details, see cloudPcManagementGroupAssignmentTarget.
     * @param value Value to set for the target property.
     * @return a void
     */
    public void setTarget(@javax.annotation.Nullable final CloudPcManagementAssignmentTarget value) {
        this._target = value;
    }
}
