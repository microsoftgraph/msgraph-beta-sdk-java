package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Task extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link Task} and sets the default values.
     */
    public Task() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Task}
     */
    @jakarta.annotation.Nonnull
    public static Task createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Task();
    }
    /**
     * Gets the archivalInfo property value. Information about whether the entity is archived, and when it was archived.
     * @return a {@link PlannerArchivalInfo}
     */
    @jakarta.annotation.Nullable
    public PlannerArchivalInfo getArchivalInfo() {
        return this.backingStore.get("archivalInfo");
    }
    /**
     * Gets the bucketId property value. ID of the bucket that the task belongs to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBucketId() {
        return this.backingStore.get("bucketId");
    }
    /**
     * Gets the capabilities property value. Server-computed, read-only capability flags indicating which optional features are enabled for the entity.
     * @return a {@link TaskCapability}
     */
    @jakarta.annotation.Nullable
    public TaskCapability getCapabilities() {
        return this.backingStore.get("capabilities");
    }
    /**
     * Gets the checklist property value. The collection of checklist items on the task. Read-only. Nullable.
     * @return a {@link java.util.List<ChecklistItemV4>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChecklistItemV4> getChecklist() {
        return this.backingStore.get("checklist");
    }
    /**
     * Gets the completedBy property value. Identity of the user who marked the task complete.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCompletedBy() {
        return this.backingStore.get("completedBy");
    }
    /**
     * Gets the completedDateTime property value. Date and time the task was completed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the creationInfo property value. Read-only creation metadata for the entity.
     * @return a {@link CreationInfo}
     */
    @jakarta.annotation.Nullable
    public CreationInfo getCreationInfo() {
        return this.backingStore.get("creationInfo");
    }
    /**
     * Gets the customFieldValues property value. The collection of custom field values set on the task. Read-only. Nullable.
     * @return a {@link java.util.List<CustomFieldValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomFieldValue> getCustomFieldValues() {
        return this.backingStore.get("customFieldValues");
    }
    /**
     * Gets the displayName property value. Title of the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the dueDateTime property value. Date and, optionally, time the task is due.
     * @return a {@link DateWithOptionalTime}
     */
    @jakarta.annotation.Nullable
    public DateWithOptionalTime getDueDateTime() {
        return this.backingStore.get("dueDateTime");
    }
    /**
     * Gets the extensions property value. Custom extension field values set on the entity. Supports $select.
     * @return a {@link ExtensionFieldCollection}
     */
    @jakarta.annotation.Nullable
    public ExtensionFieldCollection getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("archivalInfo", (n) -> { this.setArchivalInfo(n.getObjectValue(PlannerArchivalInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("bucketId", (n) -> { this.setBucketId(n.getStringValue()); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(TaskCapability::createFromDiscriminatorValue)); });
        deserializerMap.put("checklist", (n) -> { this.setChecklist(n.getCollectionOfObjectValues(ChecklistItemV4::createFromDiscriminatorValue)); });
        deserializerMap.put("completedBy", (n) -> { this.setCompletedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creationInfo", (n) -> { this.setCreationInfo(n.getObjectValue(CreationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("customFieldValues", (n) -> { this.setCustomFieldValues(n.getCollectionOfObjectValues(CustomFieldValue::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getObjectValue(DateWithOptionalTime::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getObjectValue(ExtensionFieldCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("finishDateTime", (n) -> { this.setFinishDateTime(n.getObjectValue(DateWithOptionalTime::createFromDiscriminatorValue)); });
        deserializerMap.put("goalIds", (n) -> { this.setGoalIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("hasChat", (n) -> { this.setHasChat(n.getBooleanValue()); });
        deserializerMap.put("hasChildren", (n) -> { this.setHasChildren(n.getBooleanValue()); });
        deserializerMap.put("isCritical", (n) -> { this.setIsCritical(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getCollectionOfObjectValues(ContentLink::createFromDiscriminatorValue)); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(PlannerChatMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("parentTaskId", (n) -> { this.setParentTaskId(n.getStringValue()); });
        deserializerMap.put("percentComplete", (n) -> { this.setPercentComplete(n.getIntegerValue()); });
        deserializerMap.put("personalView", (n) -> { this.setPersonalView(n.getObjectValue(TaskPersonalView::createFromDiscriminatorValue)); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("planView", (n) -> { this.setPlanView(n.getObjectValue(TaskPlanView::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PlannerTaskRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateWithOptionalTime::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PlannerTaskStatus::forValue)); });
        deserializerMap.put("userAssignments", (n) -> { this.setUserAssignments(n.getCollectionOfObjectValues(UserAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the finishDateTime property value. Date and, optionally, time the task was finished.
     * @return a {@link DateWithOptionalTime}
     */
    @jakarta.annotation.Nullable
    public DateWithOptionalTime getFinishDateTime() {
        return this.backingStore.get("finishDateTime");
    }
    /**
     * Gets the goalIds property value. IDs of the goals that the task is associated with.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGoalIds() {
        return this.backingStore.get("goalIds");
    }
    /**
     * Gets the hasChat property value. Indicates whether the task has an associated chat.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasChat() {
        return this.backingStore.get("hasChat");
    }
    /**
     * Gets the hasChildren property value. Indicates whether the task has subtasks.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasChildren() {
        return this.backingStore.get("hasChildren");
    }
    /**
     * Gets the isCritical property value. Indicates whether the task is on the critical path, as computed from its dependencies.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCritical() {
        return this.backingStore.get("isCritical");
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user (or application) who last modified the entity. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time the entity was last modified. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the links property value. The collection of content links attached to the task. Read-only. Nullable.
     * @return a {@link java.util.List<ContentLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentLink> getLinks() {
        return this.backingStore.get("links");
    }
    /**
     * Gets the messages property value. The collection of chat messages associated with the task. Read-only. Nullable.
     * @return a {@link java.util.List<PlannerChatMessage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerChatMessage> getMessages() {
        return this.backingStore.get("messages");
    }
    /**
     * Gets the notes property value. Additional details or notes about the task.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the parentTaskId property value. ID of the parent task, if this task is a subtask.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentTaskId() {
        return this.backingStore.get("parentTaskId");
    }
    /**
     * Gets the percentComplete property value. Percentage of the task&apos;s completion, ranging from 0 to 100.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPercentComplete() {
        return this.backingStore.get("percentComplete");
    }
    /**
     * Gets the personalView property value. Per-user personal view settings for the task, such as My Day membership.
     * @return a {@link TaskPersonalView}
     */
    @jakarta.annotation.Nullable
    public TaskPersonalView getPersonalView() {
        return this.backingStore.get("personalView");
    }
    /**
     * Gets the planId property value. ID of the plan that contains the task. Immutable after creation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.backingStore.get("planId");
    }
    /**
     * Gets the planView property value. Task view settings scoped to the plan, such as applied category IDs.
     * @return a {@link TaskPlanView}
     */
    @jakarta.annotation.Nullable
    public TaskPlanView getPlanView() {
        return this.backingStore.get("planView");
    }
    /**
     * Gets the priority property value. Priority of the task. Supported values range from 0 (urgent) to 10 (low).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the recurrence property value. Recurrence pattern for the task, if it repeats.
     * @return a {@link PlannerTaskRecurrence}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskRecurrence getRecurrence() {
        return this.backingStore.get("recurrence");
    }
    /**
     * Gets the startDateTime property value. Date and, optionally, time the task is scheduled to start.
     * @return a {@link DateWithOptionalTime}
     */
    @jakarta.annotation.Nullable
    public DateWithOptionalTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. Indicates progress on the task. The possible values are: notStarted, inProgress, completed, blocked, unknownFutureValue.
     * @return a {@link PlannerTaskStatus}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the userAssignments property value. The collection of user assignments on the task. Read-only. Nullable.
     * @return a {@link java.util.List<UserAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserAssignment> getUserAssignments() {
        return this.backingStore.get("userAssignments");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("archivalInfo", this.getArchivalInfo());
        writer.writeStringValue("bucketId", this.getBucketId());
        writer.writeCollectionOfObjectValues("checklist", this.getChecklist());
        writer.writeObjectValue("completedBy", this.getCompletedBy());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeCollectionOfObjectValues("customFieldValues", this.getCustomFieldValues());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("dueDateTime", this.getDueDateTime());
        writer.writeObjectValue("extensions", this.getExtensions());
        writer.writeObjectValue("finishDateTime", this.getFinishDateTime());
        writer.writeCollectionOfPrimitiveValues("goalIds", this.getGoalIds());
        writer.writeBooleanValue("hasChat", this.getHasChat());
        writer.writeBooleanValue("hasChildren", this.getHasChildren());
        writer.writeBooleanValue("isCritical", this.getIsCritical());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("links", this.getLinks());
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeStringValue("parentTaskId", this.getParentTaskId());
        writer.writeIntegerValue("percentComplete", this.getPercentComplete());
        writer.writeObjectValue("personalView", this.getPersonalView());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeObjectValue("planView", this.getPlanView());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("userAssignments", this.getUserAssignments());
    }
    /**
     * Sets the archivalInfo property value. Information about whether the entity is archived, and when it was archived.
     * @param value Value to set for the archivalInfo property.
     */
    public void setArchivalInfo(@jakarta.annotation.Nullable final PlannerArchivalInfo value) {
        this.backingStore.set("archivalInfo", value);
    }
    /**
     * Sets the bucketId property value. ID of the bucket that the task belongs to.
     * @param value Value to set for the bucketId property.
     */
    public void setBucketId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bucketId", value);
    }
    /**
     * Sets the capabilities property value. Server-computed, read-only capability flags indicating which optional features are enabled for the entity.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final TaskCapability value) {
        this.backingStore.set("capabilities", value);
    }
    /**
     * Sets the checklist property value. The collection of checklist items on the task. Read-only. Nullable.
     * @param value Value to set for the checklist property.
     */
    public void setChecklist(@jakarta.annotation.Nullable final java.util.List<ChecklistItemV4> value) {
        this.backingStore.set("checklist", value);
    }
    /**
     * Sets the completedBy property value. Identity of the user who marked the task complete.
     * @param value Value to set for the completedBy property.
     */
    public void setCompletedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("completedBy", value);
    }
    /**
     * Sets the completedDateTime property value. Date and time the task was completed.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the creationInfo property value. Read-only creation metadata for the entity.
     * @param value Value to set for the creationInfo property.
     */
    public void setCreationInfo(@jakarta.annotation.Nullable final CreationInfo value) {
        this.backingStore.set("creationInfo", value);
    }
    /**
     * Sets the customFieldValues property value. The collection of custom field values set on the task. Read-only. Nullable.
     * @param value Value to set for the customFieldValues property.
     */
    public void setCustomFieldValues(@jakarta.annotation.Nullable final java.util.List<CustomFieldValue> value) {
        this.backingStore.set("customFieldValues", value);
    }
    /**
     * Sets the displayName property value. Title of the task.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the dueDateTime property value. Date and, optionally, time the task is due.
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final DateWithOptionalTime value) {
        this.backingStore.set("dueDateTime", value);
    }
    /**
     * Sets the extensions property value. Custom extension field values set on the entity. Supports $select.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final ExtensionFieldCollection value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the finishDateTime property value. Date and, optionally, time the task was finished.
     * @param value Value to set for the finishDateTime property.
     */
    public void setFinishDateTime(@jakarta.annotation.Nullable final DateWithOptionalTime value) {
        this.backingStore.set("finishDateTime", value);
    }
    /**
     * Sets the goalIds property value. IDs of the goals that the task is associated with.
     * @param value Value to set for the goalIds property.
     */
    public void setGoalIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("goalIds", value);
    }
    /**
     * Sets the hasChat property value. Indicates whether the task has an associated chat.
     * @param value Value to set for the hasChat property.
     */
    public void setHasChat(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasChat", value);
    }
    /**
     * Sets the hasChildren property value. Indicates whether the task has subtasks.
     * @param value Value to set for the hasChildren property.
     */
    public void setHasChildren(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasChildren", value);
    }
    /**
     * Sets the isCritical property value. Indicates whether the task is on the critical path, as computed from its dependencies.
     * @param value Value to set for the isCritical property.
     */
    public void setIsCritical(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCritical", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user (or application) who last modified the entity. Read-only.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the entity was last modified. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the links property value. The collection of content links attached to the task. Read-only. Nullable.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final java.util.List<ContentLink> value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the messages property value. The collection of chat messages associated with the task. Read-only. Nullable.
     * @param value Value to set for the messages property.
     */
    public void setMessages(@jakarta.annotation.Nullable final java.util.List<PlannerChatMessage> value) {
        this.backingStore.set("messages", value);
    }
    /**
     * Sets the notes property value. Additional details or notes about the task.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the parentTaskId property value. ID of the parent task, if this task is a subtask.
     * @param value Value to set for the parentTaskId property.
     */
    public void setParentTaskId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentTaskId", value);
    }
    /**
     * Sets the percentComplete property value. Percentage of the task&apos;s completion, ranging from 0 to 100.
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("percentComplete", value);
    }
    /**
     * Sets the personalView property value. Per-user personal view settings for the task, such as My Day membership.
     * @param value Value to set for the personalView property.
     */
    public void setPersonalView(@jakarta.annotation.Nullable final TaskPersonalView value) {
        this.backingStore.set("personalView", value);
    }
    /**
     * Sets the planId property value. ID of the plan that contains the task. Immutable after creation.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planId", value);
    }
    /**
     * Sets the planView property value. Task view settings scoped to the plan, such as applied category IDs.
     * @param value Value to set for the planView property.
     */
    public void setPlanView(@jakarta.annotation.Nullable final TaskPlanView value) {
        this.backingStore.set("planView", value);
    }
    /**
     * Sets the priority property value. Priority of the task. Supported values range from 0 (urgent) to 10 (low).
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the recurrence property value. Recurrence pattern for the task, if it repeats.
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PlannerTaskRecurrence value) {
        this.backingStore.set("recurrence", value);
    }
    /**
     * Sets the startDateTime property value. Date and, optionally, time the task is scheduled to start.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final DateWithOptionalTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. Indicates progress on the task. The possible values are: notStarted, inProgress, completed, blocked, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PlannerTaskStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the userAssignments property value. The collection of user assignments on the task. Read-only. Nullable.
     * @param value Value to set for the userAssignments property.
     */
    public void setUserAssignments(@jakarta.annotation.Nullable final java.util.List<UserAssignment> value) {
        this.backingStore.set("userAssignments", value);
    }
}
