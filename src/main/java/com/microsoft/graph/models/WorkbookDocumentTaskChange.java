package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookDocumentTaskChange extends Entity implements Parsable {
    /**
     * The assignee property
     */
    private WorkbookEmailIdentity assignee;
    /**
     * The changedBy property
     */
    private WorkbookEmailIdentity changedBy;
    /**
     * The commentId property
     */
    private String commentId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The dueDateTime property
     */
    private OffsetDateTime dueDateTime;
    /**
     * The percentComplete property
     */
    private Integer percentComplete;
    /**
     * The priority property
     */
    private Integer priority;
    /**
     * The startDateTime property
     */
    private OffsetDateTime startDateTime;
    /**
     * The title property
     */
    private String title;
    /**
     * The type property
     */
    private String type;
    /**
     * The undoChangeId property
     */
    private String undoChangeId;
    /**
     * Instantiates a new workbookDocumentTaskChange and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookDocumentTaskChange() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookDocumentTaskChange
     */
    @javax.annotation.Nonnull
    public static WorkbookDocumentTaskChange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookDocumentTaskChange();
    }
    /**
     * Gets the assignee property value. The assignee property
     * @return a workbookEmailIdentity
     */
    @javax.annotation.Nullable
    public WorkbookEmailIdentity getAssignee() {
        return this.assignee;
    }
    /**
     * Gets the changedBy property value. The changedBy property
     * @return a workbookEmailIdentity
     */
    @javax.annotation.Nullable
    public WorkbookEmailIdentity getChangedBy() {
        return this.changedBy;
    }
    /**
     * Gets the commentId property value. The commentId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCommentId() {
        return this.commentId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the dueDateTime property value. The dueDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.dueDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the percentComplete property value. The percentComplete property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPercentComplete() {
        return this.percentComplete;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the undoChangeId property value. The undoChangeId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUndoChangeId() {
        return this.undoChangeId;
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
     * Sets the assignee property value. The assignee property
     * @param value Value to set for the assignee property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignee(@javax.annotation.Nullable final WorkbookEmailIdentity value) {
        this.assignee = value;
    }
    /**
     * Sets the changedBy property value. The changedBy property
     * @param value Value to set for the changedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangedBy(@javax.annotation.Nullable final WorkbookEmailIdentity value) {
        this.changedBy = value;
    }
    /**
     * Sets the commentId property value. The commentId property
     * @param value Value to set for the commentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommentId(@javax.annotation.Nullable final String value) {
        this.commentId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the dueDateTime property value. The dueDateTime property
     * @param value Value to set for the dueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.dueDateTime = value;
    }
    /**
     * Sets the percentComplete property value. The percentComplete property
     * @param value Value to set for the percentComplete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercentComplete(@javax.annotation.Nullable final Integer value) {
        this.percentComplete = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the undoChangeId property value. The undoChangeId property
     * @param value Value to set for the undoChangeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUndoChangeId(@javax.annotation.Nullable final String value) {
        this.undoChangeId = value;
    }
}
