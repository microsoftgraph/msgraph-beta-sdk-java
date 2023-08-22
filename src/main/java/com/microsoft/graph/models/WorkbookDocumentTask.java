package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookDocumentTask extends Entity implements Parsable {
    /**
     * The assignees property
     */
    private java.util.List<WorkbookEmailIdentity> assignees;
    /**
     * The changes property
     */
    private java.util.List<WorkbookDocumentTaskChange> changes;
    /**
     * The comment property
     */
    private WorkbookComment comment;
    /**
     * The completedBy property
     */
    private WorkbookEmailIdentity completedBy;
    /**
     * The completedDateTime property
     */
    private OffsetDateTime completedDateTime;
    /**
     * The createdBy property
     */
    private WorkbookEmailIdentity createdBy;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The percentComplete property
     */
    private Integer percentComplete;
    /**
     * The priority property
     */
    private Integer priority;
    /**
     * The startAndDueDateTime property
     */
    private WorkbookDocumentTaskSchedule startAndDueDateTime;
    /**
     * The title property
     */
    private String title;
    /**
     * Instantiates a new workbookDocumentTask and sets the default values.
     */
    public WorkbookDocumentTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookDocumentTask
     */
    @jakarta.annotation.Nonnull
    public static WorkbookDocumentTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookDocumentTask();
    }
    /**
     * Gets the assignees property value. The assignees property
     * @return a workbookEmailIdentity
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookEmailIdentity> getAssignees() {
        return this.assignees;
    }
    /**
     * Gets the changes property value. The changes property
     * @return a workbookDocumentTaskChange
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookDocumentTaskChange> getChanges() {
        return this.changes;
    }
    /**
     * Gets the comment property value. The comment property
     * @return a workbookComment
     */
    @jakarta.annotation.Nullable
    public WorkbookComment getComment() {
        return this.comment;
    }
    /**
     * Gets the completedBy property value. The completedBy property
     * @return a workbookEmailIdentity
     */
    @jakarta.annotation.Nullable
    public WorkbookEmailIdentity getCompletedBy() {
        return this.completedBy;
    }
    /**
     * Gets the completedDateTime property value. The completedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.completedDateTime;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a workbookEmailIdentity
     */
    @jakarta.annotation.Nullable
    public WorkbookEmailIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignees", (n) -> { this.setAssignees(n.getCollectionOfObjectValues(WorkbookEmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("changes", (n) -> { this.setChanges(n.getCollectionOfObjectValues(WorkbookDocumentTaskChange::createFromDiscriminatorValue)); });
        deserializerMap.put("comment", (n) -> { this.setComment(n.getObjectValue(WorkbookComment::createFromDiscriminatorValue)); });
        deserializerMap.put("completedBy", (n) -> { this.setCompletedBy(n.getObjectValue(WorkbookEmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(WorkbookEmailIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("percentComplete", (n) -> { this.setPercentComplete(n.getIntegerValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("startAndDueDateTime", (n) -> { this.setStartAndDueDateTime(n.getObjectValue(WorkbookDocumentTaskSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentComplete property value. The percentComplete property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPercentComplete() {
        return this.percentComplete;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the startAndDueDateTime property value. The startAndDueDateTime property
     * @return a workbookDocumentTaskSchedule
     */
    @jakarta.annotation.Nullable
    public WorkbookDocumentTaskSchedule getStartAndDueDateTime() {
        return this.startAndDueDateTime;
    }
    /**
     * Gets the title property value. The title property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignees", this.getAssignees());
        writer.writeCollectionOfObjectValues("changes", this.getChanges());
        writer.writeObjectValue("comment", this.getComment());
        writer.writeObjectValue("completedBy", this.getCompletedBy());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("percentComplete", this.getPercentComplete());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("startAndDueDateTime", this.getStartAndDueDateTime());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the assignees property value. The assignees property
     * @param value Value to set for the assignees property.
     */
    public void setAssignees(@jakarta.annotation.Nullable final java.util.List<WorkbookEmailIdentity> value) {
        this.assignees = value;
    }
    /**
     * Sets the changes property value. The changes property
     * @param value Value to set for the changes property.
     */
    public void setChanges(@jakarta.annotation.Nullable final java.util.List<WorkbookDocumentTaskChange> value) {
        this.changes = value;
    }
    /**
     * Sets the comment property value. The comment property
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final WorkbookComment value) {
        this.comment = value;
    }
    /**
     * Sets the completedBy property value. The completedBy property
     * @param value Value to set for the completedBy property.
     */
    public void setCompletedBy(@jakarta.annotation.Nullable final WorkbookEmailIdentity value) {
        this.completedBy = value;
    }
    /**
     * Sets the completedDateTime property value. The completedDateTime property
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedDateTime = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final WorkbookEmailIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the percentComplete property value. The percentComplete property
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final Integer value) {
        this.percentComplete = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the startAndDueDateTime property value. The startAndDueDateTime property
     * @param value Value to set for the startAndDueDateTime property.
     */
    public void setStartAndDueDateTime(@jakarta.annotation.Nullable final WorkbookDocumentTaskSchedule value) {
        this.startAndDueDateTime = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
