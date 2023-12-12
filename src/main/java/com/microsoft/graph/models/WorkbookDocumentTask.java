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
     * Instantiates a new WorkbookDocumentTask and sets the default values.
     */
    public WorkbookDocumentTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookDocumentTask
     */
    @jakarta.annotation.Nonnull
    public static WorkbookDocumentTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookDocumentTask();
    }
    /**
     * Gets the assignees property value. A collection of user identities the task is assigned to.
     * @return a java.util.List<WorkbookEmailIdentity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookEmailIdentity> getAssignees() {
        return this.backingStore.get("assignees");
    }
    /**
     * Gets the changes property value. A collection of task change histories.
     * @return a java.util.List<WorkbookDocumentTaskChange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookDocumentTaskChange> getChanges() {
        return this.backingStore.get("changes");
    }
    /**
     * Gets the comment property value. The comment that the task is associated with.
     * @return a WorkbookComment
     */
    @jakarta.annotation.Nullable
    public WorkbookComment getComment() {
        return this.backingStore.get("comment");
    }
    /**
     * Gets the completedBy property value. The identity of the user who completed the task. Nullable.
     * @return a WorkbookEmailIdentity
     */
    @jakarta.annotation.Nullable
    public WorkbookEmailIdentity getCompletedBy() {
        return this.backingStore.get("completedBy");
    }
    /**
     * Gets the completedDateTime property value. Date and time when the task was completed. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the createdBy property value. A user identity that creates the task. Nullable.
     * @return a WorkbookEmailIdentity
     */
    @jakarta.annotation.Nullable
    public WorkbookEmailIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time when the task was created. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
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
     * Gets the percentComplete property value. An integer value from 0 to 100 that represents the percentage of the completion of the task. 100 means that the task is completed. Nullable.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPercentComplete() {
        return this.backingStore.get("percentComplete");
    }
    /**
     * Gets the priority property value. An integer value from 0 to 10 that represents the priority of the task. A lower value indicates a higher priority. Nullable.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the startAndDueDateTime property value. Start and due date of the task. Nullable.
     * @return a WorkbookDocumentTaskSchedule
     */
    @jakarta.annotation.Nullable
    public WorkbookDocumentTaskSchedule getStartAndDueDateTime() {
        return this.backingStore.get("startAndDueDateTime");
    }
    /**
     * Gets the title property value. The title of the task.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
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
     * Sets the assignees property value. A collection of user identities the task is assigned to.
     * @param value Value to set for the assignees property.
     */
    public void setAssignees(@jakarta.annotation.Nullable final java.util.List<WorkbookEmailIdentity> value) {
        this.backingStore.set("assignees", value);
    }
    /**
     * Sets the changes property value. A collection of task change histories.
     * @param value Value to set for the changes property.
     */
    public void setChanges(@jakarta.annotation.Nullable final java.util.List<WorkbookDocumentTaskChange> value) {
        this.backingStore.set("changes", value);
    }
    /**
     * Sets the comment property value. The comment that the task is associated with.
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final WorkbookComment value) {
        this.backingStore.set("comment", value);
    }
    /**
     * Sets the completedBy property value. The identity of the user who completed the task. Nullable.
     * @param value Value to set for the completedBy property.
     */
    public void setCompletedBy(@jakarta.annotation.Nullable final WorkbookEmailIdentity value) {
        this.backingStore.set("completedBy", value);
    }
    /**
     * Sets the completedDateTime property value. Date and time when the task was completed. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the createdBy property value. A user identity that creates the task. Nullable.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final WorkbookEmailIdentity value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time when the task was created. Nullable. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the percentComplete property value. An integer value from 0 to 100 that represents the percentage of the completion of the task. 100 means that the task is completed. Nullable.
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("percentComplete", value);
    }
    /**
     * Sets the priority property value. An integer value from 0 to 10 that represents the priority of the task. A lower value indicates a higher priority. Nullable.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the startAndDueDateTime property value. Start and due date of the task. Nullable.
     * @param value Value to set for the startAndDueDateTime property.
     */
    public void setStartAndDueDateTime(@jakarta.annotation.Nullable final WorkbookDocumentTaskSchedule value) {
        this.backingStore.set("startAndDueDateTime", value);
    }
    /**
     * Sets the title property value. The title of the task.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
