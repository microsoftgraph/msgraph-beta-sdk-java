package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class DelegatedAdminRelationshipRequest extends Entity implements Parsable {
    /** The action property */
    private DelegatedAdminRelationshipRequestAction _action;
    /** The date and time in ISO 8601 format and in UTC time when the relationship request was created. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The date and time in ISO 8601 format and UTC time when this relationship request was last modified. Read-only. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The status of the request. Read-only. The possible values are: created, pending, succeeded, failed, unknownFutureValue. */
    private DelegatedAdminRelationshipRequestStatus _status;
    /**
     * Instantiates a new delegatedAdminRelationshipRequest and sets the default values.
     * @return a void
     */
    public DelegatedAdminRelationshipRequest() {
        super();
        this.setOdataType("#microsoft.graph.delegatedAdminRelationshipRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedAdminRelationshipRequest
     */
    @javax.annotation.Nonnull
    public static DelegatedAdminRelationshipRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminRelationshipRequest();
    }
    /**
     * Gets the action property value. The action property
     * @return a delegatedAdminRelationshipRequestAction
     */
    @javax.annotation.Nullable
    public DelegatedAdminRelationshipRequestAction getAction() {
        return this._action;
    }
    /**
     * Gets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the relationship request was created. Read-only.
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
        final DelegatedAdminRelationshipRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(DelegatedAdminRelationshipRequestAction.class)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(DelegatedAdminRelationshipRequestStatus.class)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time in ISO 8601 format and UTC time when this relationship request was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the status property value. The status of the request. Read-only. The possible values are: created, pending, succeeded, failed, unknownFutureValue.
     * @return a delegatedAdminRelationshipRequestStatus
     */
    @javax.annotation.Nullable
    public DelegatedAdminRelationshipRequestStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final DelegatedAdminRelationshipRequestAction value) {
        this._action = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the relationship request was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time in ISO 8601 format and UTC time when this relationship request was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the status property value. The status of the request. Read-only. The possible values are: created, pending, succeeded, failed, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final DelegatedAdminRelationshipRequestStatus value) {
        this._status = value;
    }
}
