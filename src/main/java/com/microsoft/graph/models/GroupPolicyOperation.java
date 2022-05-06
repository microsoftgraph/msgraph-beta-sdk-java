package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyOperation extends Entity implements Parsable {
    /** The date and time the entity was last modified.  */
    private OffsetDateTime _lastModifiedDateTime;
    /** The group policy operation status. Possible values are: unknown, inProgress, success, failed.  */
    private GroupPolicyOperationStatus _operationStatus;
    /** The type of group policy operation. Possible values are: none, upload, uploadNewVersion, addLanguageFiles, removeLanguageFiles, updateLanguageFiles, remove.  */
    private GroupPolicyOperationType _operationType;
    /** The group policy operation status detail.  */
    private String _statusDetails;
    /**
     * Instantiates a new groupPolicyOperation and sets the default values.
     * @return a void
     */
    public GroupPolicyOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyOperation
     */
    @javax.annotation.Nonnull
    public static GroupPolicyOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupPolicyOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("operationStatus", (n) -> { currentObject.setOperationStatus(n.getEnumValue(GroupPolicyOperationStatus.class)); });
            this.put("operationType", (n) -> { currentObject.setOperationType(n.getEnumValue(GroupPolicyOperationType.class)); });
            this.put("statusDetails", (n) -> { currentObject.setStatusDetails(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the operationStatus property value. The group policy operation status. Possible values are: unknown, inProgress, success, failed.
     * @return a groupPolicyOperationStatus
     */
    @javax.annotation.Nullable
    public GroupPolicyOperationStatus getOperationStatus() {
        return this._operationStatus;
    }
    /**
     * Gets the operationType property value. The type of group policy operation. Possible values are: none, upload, uploadNewVersion, addLanguageFiles, removeLanguageFiles, updateLanguageFiles, remove.
     * @return a groupPolicyOperationType
     */
    @javax.annotation.Nullable
    public GroupPolicyOperationType getOperationType() {
        return this._operationType;
    }
    /**
     * Gets the statusDetails property value. The group policy operation status detail.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatusDetails() {
        return this._statusDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("operationStatus", this.getOperationStatus());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeStringValue("statusDetails", this.getStatusDetails());
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the entity was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the operationStatus property value. The group policy operation status. Possible values are: unknown, inProgress, success, failed.
     * @param value Value to set for the operationStatus property.
     * @return a void
     */
    public void setOperationStatus(@javax.annotation.Nullable final GroupPolicyOperationStatus value) {
        this._operationStatus = value;
    }
    /**
     * Sets the operationType property value. The type of group policy operation. Possible values are: none, upload, uploadNewVersion, addLanguageFiles, removeLanguageFiles, updateLanguageFiles, remove.
     * @param value Value to set for the operationType property.
     * @return a void
     */
    public void setOperationType(@javax.annotation.Nullable final GroupPolicyOperationType value) {
        this._operationType = value;
    }
    /**
     * Sets the statusDetails property value. The group policy operation status detail.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    public void setStatusDetails(@javax.annotation.Nullable final String value) {
        this._statusDetails = value;
    }
}
