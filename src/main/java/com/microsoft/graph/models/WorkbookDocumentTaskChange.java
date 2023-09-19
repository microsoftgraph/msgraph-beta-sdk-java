package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookDocumentTaskChange extends Entity implements Parsable {
    /**
     * The user identity the task is assigned to. Only present when the type property is assign. Nullable.
     */
    private WorkbookEmailIdentity assignee;
    /**
     * The changedBy property
     */
    private WorkbookEmailIdentity changedBy;
    /**
     * The identifier of the associated comment.
     */
    private String commentId;
    /**
     * Date and time when the task was changed. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The due date and time for the task. Only present when the type property is setSchedule. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime dueDateTime;
    /**
     * An integer value from 0 to 100 that represents the percentage of the completion of the task and associated comment. 100 means that the task and associated comment are completed. If you change the completion from 100 to a lower value, the associated task and comment are reactivated. Only present when the type property is setPercentComplete. Nullable.
     */
    private Integer percentComplete;
    /**
     * An integer value from 0 to 10 that represents the priority of the task. A lower value indicates a higher priority. 5 indicates the default priority if not set. Only present when the type property is setPriority. Nullable.
     */
    private Integer priority;
    /**
     * The start date and time for the task. Only present when the type property is setSchedule. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime startDateTime;
    /**
     * The title of the task. Only present when the type property is setTitle. Nullable.
     */
    private String title;
    /**
     * The type of the change history. Possible values are: create, assign, unassign, unassignAll, setPriority, setTitle, setPercentComplete, setSchedule, remove, restore, undo.
     */
    private String type;
    /**
     * The ID of the workbookDocumentTaskChange that was undone for the undo change action. Only exists on an undo change history. Nullable.
     */
    private String undoChangeId;
    /**
     * Instantiates a new workbookDocumentTaskChange and sets the default values.
     */
    public WorkbookDocumentTaskChange() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookDocumentTaskChange
     */
    @jakarta.annotation.Nonnull
    public static WorkbookDocumentTaskChange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookDocumentTaskChange();
    }
    /**
     * Gets the assignee property value. The user identity the task is assigned to. Only present when the type property is assign. Nullable.
     * @return a workbookEmailIdentity
     */
    @jakarta.annotation.Nullable
    public WorkbookEmailIdentity getAssignee() {
        return this.assignee;
    }
    /**
     * Gets the changedBy property value. The changedBy property
     * @return a workbookEmailIdentity
     */
    @jakarta.annotation.Nullable
    public WorkbookEmailIdentity getChangedBy() {
        return this.changedBy;
    }
    /**
     * Gets the commentId property value. The identifier of the associated comment.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCommentId() {
        return this.commentId;
    }
    /**
     * Gets the createdDateTime property value. Date and time when the task was changed. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the dueDateTime property value. The due date and time for the task. Only present when the type property is setSchedule. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.dueDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignee", (n) -> { this.setAssignee(n.getObjectValue(WorkbookEmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("changedBy", (n) -> { this.setChangedBy(n.getObjectValue(WorkbookEmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("commentId", (n) -> { this.setCommentId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("percentComplete", (n) -> { this.setPercentComplete(n.getIntegerValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("undoChangeId", (n) -> { this.setUndoChangeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentComplete property value. An integer value from 0 to 100 that represents the percentage of the completion of the task and associated comment. 100 means that the task and associated comment are completed. If you change the completion from 100 to a lower value, the associated task and comment are reactivated. Only present when the type property is setPercentComplete. Nullable.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPercentComplete() {
        return this.percentComplete;
    }
    /**
     * Gets the priority property value. An integer value from 0 to 10 that represents the priority of the task. A lower value indicates a higher priority. 5 indicates the default priority if not set. Only present when the type property is setPriority. Nullable.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the startDateTime property value. The start date and time for the task. Only present when the type property is setSchedule. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the title property value. The title of the task. Only present when the type property is setTitle. Nullable.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the type property value. The type of the change history. Possible values are: create, assign, unassign, unassignAll, setPriority, setTitle, setPercentComplete, setSchedule, remove, restore, undo.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the undoChangeId property value. The ID of the workbookDocumentTaskChange that was undone for the undo change action. Only exists on an undo change history. Nullable.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUndoChangeId() {
        return this.undoChangeId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("assignee", this.getAssignee());
        writer.writeObjectValue("changedBy", this.getChangedBy());
        writer.writeStringValue("commentId", this.getCommentId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeIntegerValue("percentComplete", this.getPercentComplete());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("undoChangeId", this.getUndoChangeId());
    }
    /**
     * Sets the assignee property value. The user identity the task is assigned to. Only present when the type property is assign. Nullable.
     * @param value Value to set for the assignee property.
     */
    public void setAssignee(@jakarta.annotation.Nullable final WorkbookEmailIdentity value) {
        this.assignee = value;
    }
    /**
     * Sets the changedBy property value. The changedBy property
     * @param value Value to set for the changedBy property.
     */
    public void setChangedBy(@jakarta.annotation.Nullable final WorkbookEmailIdentity value) {
        this.changedBy = value;
    }
    /**
     * Sets the commentId property value. The identifier of the associated comment.
     * @param value Value to set for the commentId property.
     */
    public void setCommentId(@jakarta.annotation.Nullable final String value) {
        this.commentId = value;
    }
    /**
     * Sets the createdDateTime property value. Date and time when the task was changed. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the dueDateTime property value. The due date and time for the task. Only present when the type property is setSchedule. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dueDateTime = value;
    }
    /**
     * Sets the percentComplete property value. An integer value from 0 to 100 that represents the percentage of the completion of the task and associated comment. 100 means that the task and associated comment are completed. If you change the completion from 100 to a lower value, the associated task and comment are reactivated. Only present when the type property is setPercentComplete. Nullable.
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final Integer value) {
        this.percentComplete = value;
    }
    /**
     * Sets the priority property value. An integer value from 0 to 10 that represents the priority of the task. A lower value indicates a higher priority. 5 indicates the default priority if not set. Only present when the type property is setPriority. Nullable.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the startDateTime property value. The start date and time for the task. Only present when the type property is setSchedule. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the title property value. The title of the task. Only present when the type property is setTitle. Nullable.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the type property value. The type of the change history. Possible values are: create, assign, unassign, unassignAll, setPriority, setTitle, setPercentComplete, setSchedule, remove, restore, undo.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the undoChangeId property value. The ID of the workbookDocumentTaskChange that was undone for the undo change action. Only exists on an undo change history. Nullable.
     * @param value Value to set for the undoChangeId property.
     */
    public void setUndoChangeId(@jakarta.annotation.Nullable final String value) {
        this.undoChangeId = value;
    }
}
