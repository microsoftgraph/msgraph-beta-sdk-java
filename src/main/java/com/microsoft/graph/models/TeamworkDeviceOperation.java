package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDeviceOperation extends Entity implements Parsable {
    /** Time at which the operation reached a final state (for example, Successful, Failed, and Cancelled). */
    private OffsetDateTime _completedDateTime;
    /** Identity of the user who created the device operation. */
    private IdentitySet _createdBy;
    /** The UTC date and time when the device operation was created. */
    private OffsetDateTime _createdDateTime;
    /** Error details are available only in case of a failed status. */
    private OperationError _error;
    /** Identity of the user who last modified the device operation. */
    private IdentitySet _lastActionBy;
    /** The UTC date and time when the device operation was last modified. */
    private OffsetDateTime _lastActionDateTime;
    /** The operationType property */
    private TeamworkDeviceOperationType _operationType;
    /** Time at which the operation was started. */
    private OffsetDateTime _startedDateTime;
    /** The current status of the async operation, for example, Queued, Scheduled, InProgress,  Successful, Cancelled, and Failed. */
    private String _status;
    /**
     * Instantiates a new TeamworkDeviceOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkDeviceOperation() {
        super();
        this.setOdataType("#microsoft.graph.teamworkDeviceOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkDeviceOperation
     */
    @javax.annotation.Nonnull
    public static TeamworkDeviceOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceOperation();
    }
    /**
     * Gets the completedDateTime property value. Time at which the operation reached a final state (for example, Successful, Failed, and Cancelled).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this._completedDateTime;
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the device operation.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device operation was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the error property value. Error details are available only in case of a failed status.
     * @return a operationError
     */
    @javax.annotation.Nullable
    public OperationError getError() {
        return this._error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDeviceOperation currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("completedDateTime", (n) -> { currentObject.setCompletedDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("error", (n) -> { currentObject.setError(n.getObjectValue(OperationError::createFromDiscriminatorValue)); });
            this.put("lastActionBy", (n) -> { currentObject.setLastActionBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
            this.put("operationType", (n) -> { currentObject.setOperationType(n.getEnumValue(TeamworkDeviceOperationType.class)); });
            this.put("startedDateTime", (n) -> { currentObject.setStartedDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastActionBy property value. Identity of the user who last modified the device operation.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastActionBy() {
        return this._lastActionBy;
    }
    /**
     * Gets the lastActionDateTime property value. The UTC date and time when the device operation was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the operationType property value. The operationType property
     * @return a teamworkDeviceOperationType
     */
    @javax.annotation.Nullable
    public TeamworkDeviceOperationType getOperationType() {
        return this._operationType;
    }
    /**
     * Gets the startedDateTime property value. Time at which the operation was started.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this._startedDateTime;
    }
    /**
     * Gets the status property value. The current status of the async operation, for example, Queued, Scheduled, InProgress,  Successful, Cancelled, and Failed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
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
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeObjectValue("lastActionBy", this.getLastActionBy());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeOffsetDateTimeValue("startedDateTime", this.getStartedDateTime());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the completedDateTime property value. Time at which the operation reached a final state (for example, Successful, Failed, and Cancelled).
     * @param value Value to set for the completedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._completedDateTime = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the device operation.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device operation was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the error property value. Error details are available only in case of a failed status.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final OperationError value) {
        this._error = value;
    }
    /**
     * Sets the lastActionBy property value. Identity of the user who last modified the device operation.
     * @param value Value to set for the lastActionBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastActionBy = value;
    }
    /**
     * Sets the lastActionDateTime property value. The UTC date and time when the device operation was last modified.
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the operationType property value. The operationType property
     * @param value Value to set for the operationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationType(@javax.annotation.Nullable final TeamworkDeviceOperationType value) {
        this._operationType = value;
    }
    /**
     * Sets the startedDateTime property value. Time at which the operation was started.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startedDateTime = value;
    }
    /**
     * Sets the status property value. The current status of the async operation, for example, Queued, Scheduled, InProgress,  Successful, Cancelled, and Failed.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
