package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The entity represents an group policy operation. */
public class GroupPolicyOperation extends Entity implements Parsable {
    /** The date and time the entity was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Type of Group Policy operation status. */
    private GroupPolicyOperationStatus _operationStatus;
    /** Type of Group Policy operation. */
    private GroupPolicyOperationType _operationType;
    /** The group policy operation status detail. */
    private String _statusDetails;
    /**
     * Instantiates a new groupPolicyOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyOperation() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyOperation");
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operationStatus", (n) -> { currentObject.setOperationStatus(n.getEnumValue(GroupPolicyOperationStatus.class)); });
        deserializerMap.put("operationType", (n) -> { currentObject.setOperationType(n.getEnumValue(GroupPolicyOperationType.class)); });
        deserializerMap.put("statusDetails", (n) -> { currentObject.setStatusDetails(n.getStringValue()); });
        return deserializerMap
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
     * Gets the operationStatus property value. Type of Group Policy operation status.
     * @return a groupPolicyOperationStatus
     */
    @javax.annotation.Nullable
    public GroupPolicyOperationStatus getOperationStatus() {
        return this._operationStatus;
    }
    /**
     * Gets the operationType property value. Type of Group Policy operation.
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
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the operationStatus property value. Type of Group Policy operation status.
     * @param value Value to set for the operationStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationStatus(@javax.annotation.Nullable final GroupPolicyOperationStatus value) {
        this._operationStatus = value;
    }
    /**
     * Sets the operationType property value. Type of Group Policy operation.
     * @param value Value to set for the operationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationType(@javax.annotation.Nullable final GroupPolicyOperationType value) {
        this._operationType = value;
    }
    /**
     * Sets the statusDetails property value. The group policy operation status detail.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusDetails(@javax.annotation.Nullable final String value) {
        this._statusDetails = value;
    }
}
