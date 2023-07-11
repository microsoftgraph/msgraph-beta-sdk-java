package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDeviceOperation extends Entity implements Parsable {
    /**
     * Time at which the operation reached a final state (for example, Successful, Failed, and Cancelled).
     */
    private OffsetDateTime completedDateTime;
    /**
     * Identity of the user who created the device operation.
     */
    private IdentitySet createdBy;
    /**
     * The UTC date and time when the device operation was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Error details are available only in case of a failed status.
     */
    private OperationError error;
    /**
     * Identity of the user who last modified the device operation.
     */
    private IdentitySet lastActionBy;
    /**
     * The UTC date and time when the device operation was last modified.
     */
    private OffsetDateTime lastActionDateTime;
    /**
     * The operationType property
     */
    private TeamworkDeviceOperationType operationType;
    /**
     * Time at which the operation was started.
     */
    private OffsetDateTime startedDateTime;
    /**
     * The current status of the async operation, for example, Queued, Scheduled, InProgress,  Successful, Cancelled, and Failed.
     */
    private String status;
    /**
     * Instantiates a new teamworkDeviceOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkDeviceOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDeviceOperation
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
        return this.completedDateTime;
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the device operation.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device operation was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the error property value. Error details are available only in case of a failed status.
     * @return a operationError
     */
    @javax.annotation.Nullable
    public OperationError getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(OperationError::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionBy", (n) -> { this.setLastActionBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(TeamworkDeviceOperationType.class)); });
        deserializerMap.put("startedDateTime", (n) -> { this.setStartedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionBy property value. Identity of the user who last modified the device operation.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastActionBy() {
        return this.lastActionBy;
    }
    /**
     * Gets the lastActionDateTime property value. The UTC date and time when the device operation was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Gets the operationType property value. The operationType property
     * @return a teamworkDeviceOperationType
     */
    @javax.annotation.Nullable
    public TeamworkDeviceOperationType getOperationType() {
        return this.operationType;
    }
    /**
     * Gets the startedDateTime property value. Time at which the operation was started.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartedDateTime() {
        return this.startedDateTime;
    }
    /**
     * Gets the status property value. The current status of the async operation, for example, Queued, Scheduled, InProgress,  Successful, Cancelled, and Failed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
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
        this.completedDateTime = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the device operation.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device operation was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the error property value. Error details are available only in case of a failed status.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final OperationError value) {
        this.error = value;
    }
    /**
     * Sets the lastActionBy property value. Identity of the user who last modified the device operation.
     * @param value Value to set for the lastActionBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionBy(@javax.annotation.Nullable final IdentitySet value) {
        this.lastActionBy = value;
    }
    /**
     * Sets the lastActionDateTime property value. The UTC date and time when the device operation was last modified.
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the operationType property value. The operationType property
     * @param value Value to set for the operationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationType(@javax.annotation.Nullable final TeamworkDeviceOperationType value) {
        this.operationType = value;
    }
    /**
     * Sets the startedDateTime property value. Time at which the operation was started.
     * @param value Value to set for the startedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startedDateTime = value;
    }
    /**
     * Sets the status property value. The current status of the async operation, for example, Queued, Scheduled, InProgress,  Successful, Cancelled, and Failed.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
}
