package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTask extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link PlannerTask} and sets the default values.
     */
    public PlannerTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerTask}
     */
    @jakarta.annotation.Nonnull
    public static PlannerTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.businessScenarioTask": return new BusinessScenarioTask();
            }
        }
        return new PlannerTask();
    }
    /**
     * Gets the activeChecklistItemCount property value. The number of checklist items with value set to false, representing incomplete items.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getActiveChecklistItemCount() {
        return this.backingStore.get("activeChecklistItemCount");
    }
    /**
     * Gets the appliedCategories property value. The categories to which the task is applied. See plannerAppliedCategories resource type for possible values.
     * @return a {@link PlannerAppliedCategories}
     */
    @jakarta.annotation.Nullable
    public PlannerAppliedCategories getAppliedCategories() {
        return this.backingStore.get("appliedCategories");
    }
    /**
     * Gets the archivalInfo property value. Read-only. Nullable. Contains information about who archived or unarchived the task and why.
     * @return a {@link PlannerArchivalInfo}
     */
    @jakarta.annotation.Nullable
    public PlannerArchivalInfo getArchivalInfo() {
        return this.backingStore.get("archivalInfo");
    }
    /**
     * Gets the assignedToTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     * @return a {@link PlannerAssignedToTaskBoardTaskFormat}
     */
    @jakarta.annotation.Nullable
    public PlannerAssignedToTaskBoardTaskFormat getAssignedToTaskBoardFormat() {
        return this.backingStore.get("assignedToTaskBoardFormat");
    }
    /**
     * Gets the assigneePriority property value. A hint that is used to order items of this type in a list view. For more information, see Using order hints in planner.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssigneePriority() {
        return this.backingStore.get("assigneePriority");
    }
    /**
     * Gets the assignments property value. The set of assignees the task is assigned to.
     * @return a {@link PlannerAssignments}
     */
    @jakarta.annotation.Nullable
    public PlannerAssignments getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the bucketId property value. Bucket ID to which the task belongs. The bucket needs to be in the same plan as the task. The value of the bucketId property is 28 characters long and case-sensitive. Format validation is done on the service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBucketId() {
        return this.backingStore.get("bucketId");
    }
    /**
     * Gets the bucketTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     * @return a {@link PlannerBucketTaskBoardTaskFormat}
     */
    @jakarta.annotation.Nullable
    public PlannerBucketTaskBoardTaskFormat getBucketTaskBoardFormat() {
        return this.backingStore.get("bucketTaskBoardFormat");
    }
    /**
     * Gets the checklistItemCount property value. The number of checklist items that are present on the task.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getChecklistItemCount() {
        return this.backingStore.get("checklistItemCount");
    }
    /**
     * Gets the completedBy property value. The identity of the user that completed the task.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCompletedBy() {
        return this.backingStore.get("completedBy");
    }
    /**
     * Gets the completedDateTime property value. Read-only. The date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the conversationThreadId property value. The thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationThreadId() {
        return this.backingStore.get("conversationThreadId");
    }
    /**
     * Gets the createdBy property value. The identity of the user who created the task.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Read-only. The date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the creationSource property value. Information about the origin of the task.
     * @return a {@link PlannerTaskCreation}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskCreation getCreationSource() {
        return this.backingStore.get("creationSource");
    }
    /**
     * Gets the details property value. Read-only. Nullable. More details about the task.
     * @return a {@link PlannerTaskDetails}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskDetails getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * Gets the dueDateTime property value. The date and time at which the task is due. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDueDateTime() {
        return this.backingStore.get("dueDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeChecklistItemCount", (n) -> { this.setActiveChecklistItemCount(n.getIntegerValue()); });
        deserializerMap.put("appliedCategories", (n) -> { this.setAppliedCategories(n.getObjectValue(PlannerAppliedCategories::createFromDiscriminatorValue)); });
        deserializerMap.put("archivalInfo", (n) -> { this.setArchivalInfo(n.getObjectValue(PlannerArchivalInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedToTaskBoardFormat", (n) -> { this.setAssignedToTaskBoardFormat(n.getObjectValue(PlannerAssignedToTaskBoardTaskFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("assigneePriority", (n) -> { this.setAssigneePriority(n.getStringValue()); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getObjectValue(PlannerAssignments::createFromDiscriminatorValue)); });
        deserializerMap.put("bucketId", (n) -> { this.setBucketId(n.getStringValue()); });
        deserializerMap.put("bucketTaskBoardFormat", (n) -> { this.setBucketTaskBoardFormat(n.getObjectValue(PlannerBucketTaskBoardTaskFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("checklistItemCount", (n) -> { this.setChecklistItemCount(n.getIntegerValue()); });
        deserializerMap.put("completedBy", (n) -> { this.setCompletedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("conversationThreadId", (n) -> { this.setConversationThreadId(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creationSource", (n) -> { this.setCreationSource(n.getObjectValue(PlannerTaskCreation::createFromDiscriminatorValue)); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(PlannerTaskDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("dueDateTime", (n) -> { this.setDueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("hasDescription", (n) -> { this.setHasDescription(n.getBooleanValue()); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("isOnMyDay", (n) -> { this.setIsOnMyDay(n.getBooleanValue()); });
        deserializerMap.put("isOnMyDayLastModifiedDate", (n) -> { this.setIsOnMyDayLastModifiedDate(n.getLocalDateValue()); });
        deserializerMap.put("orderHint", (n) -> { this.setOrderHint(n.getStringValue()); });
        deserializerMap.put("percentComplete", (n) -> { this.setPercentComplete(n.getIntegerValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("previewType", (n) -> { this.setPreviewType(n.getEnumValue(PlannerPreviewType::forValue)); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("progressTaskBoardFormat", (n) -> { this.setProgressTaskBoardFormat(n.getObjectValue(PlannerProgressTaskBoardTaskFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PlannerTaskRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("referenceCount", (n) -> { this.setReferenceCount(n.getIntegerValue()); });
        deserializerMap.put("specifiedCompletionRequirements", (n) -> { this.setSpecifiedCompletionRequirements(n.getEnumSetValue(PlannerTaskCompletionRequirements::forValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasDescription property value. Read-only. This value is true if the details object of the task has a nonempty description. Otherwise,false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasDescription() {
        return this.backingStore.get("hasDescription");
    }
    /**
     * Gets the isArchived property value. Read-only. If set to true, the task is archived. An archived task is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.backingStore.get("isArchived");
    }
    /**
     * Gets the isOnMyDay property value. Indicates whether to show this task in the MyDay view. If true, it shows the task.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOnMyDay() {
        return this.backingStore.get("isOnMyDay");
    }
    /**
     * Gets the isOnMyDayLastModifiedDate property value. Read-only. The date on which task is added to or removed from MyDay.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getIsOnMyDayLastModifiedDate() {
        return this.backingStore.get("isOnMyDayLastModifiedDate");
    }
    /**
     * Gets the orderHint property value. The hint used to order items of this type in a list view. For more information, see Using order hints in plannern.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderHint() {
        return this.backingStore.get("orderHint");
    }
    /**
     * Gets the percentComplete property value. The percentage of task completion. When set to 100, the task is completed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPercentComplete() {
        return this.backingStore.get("percentComplete");
    }
    /**
     * Gets the planId property value. Plan ID to which the task belongs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.backingStore.get("planId");
    }
    /**
     * Gets the previewType property value. The type of preview that shows up on the task. Possible values are: automatic, noPreview, checklist, description, reference.
     * @return a {@link PlannerPreviewType}
     */
    @jakarta.annotation.Nullable
    public PlannerPreviewType getPreviewType() {
        return this.backingStore.get("previewType");
    }
    /**
     * Gets the priority property value. The priority of the task. Valid values are between 0 and 10, inclusive. Larger values indicate lower priority. For example, 0 has the highest priority and 10 has the lowest priority. Currently, planner interprets values 0 and 1 as 'urgent', 2 and 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'. Currently, planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the progressTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     * @return a {@link PlannerProgressTaskBoardTaskFormat}
     */
    @jakarta.annotation.Nullable
    public PlannerProgressTaskBoardTaskFormat getProgressTaskBoardFormat() {
        return this.backingStore.get("progressTaskBoardFormat");
    }
    /**
     * Gets the recurrence property value. Defines active or inactive recurrence for the task. null when the recurrence has never been defined for the task.
     * @return a {@link PlannerTaskRecurrence}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskRecurrence getRecurrence() {
        return this.backingStore.get("recurrence");
    }
    /**
     * Gets the referenceCount property value. Number of external references that exist on the task.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReferenceCount() {
        return this.backingStore.get("referenceCount");
    }
    /**
     * Gets the specifiedCompletionRequirements property value. Indicates all the requirements specified on the plannerTask. Possible values are: none, checklistCompletion, unknownFutureValue, formCompletion, approvalCompletion. Read-only. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: formCompletion, approvalCompletion. The plannerTaskCompletionRequirementDetails in plannerTaskDetails has details of the requirements specified, if any.
     * @return a {@link EnumSet<PlannerTaskCompletionRequirements>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<PlannerTaskCompletionRequirements> getSpecifiedCompletionRequirements() {
        return this.backingStore.get("specifiedCompletionRequirements");
    }
    /**
     * Gets the startDateTime property value. Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the title property value. Title of the task.
     * @return a {@link String}
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
        writer.writeIntegerValue("activeChecklistItemCount", this.getActiveChecklistItemCount());
        writer.writeObjectValue("appliedCategories", this.getAppliedCategories());
        writer.writeObjectValue("archivalInfo", this.getArchivalInfo());
        writer.writeObjectValue("assignedToTaskBoardFormat", this.getAssignedToTaskBoardFormat());
        writer.writeStringValue("assigneePriority", this.getAssigneePriority());
        writer.writeObjectValue("assignments", this.getAssignments());
        writer.writeStringValue("bucketId", this.getBucketId());
        writer.writeObjectValue("bucketTaskBoardFormat", this.getBucketTaskBoardFormat());
        writer.writeIntegerValue("checklistItemCount", this.getChecklistItemCount());
        writer.writeObjectValue("completedBy", this.getCompletedBy());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeStringValue("conversationThreadId", this.getConversationThreadId());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("creationSource", this.getCreationSource());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeOffsetDateTimeValue("dueDateTime", this.getDueDateTime());
        writer.writeBooleanValue("hasDescription", this.getHasDescription());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeBooleanValue("isOnMyDay", this.getIsOnMyDay());
        writer.writeLocalDateValue("isOnMyDayLastModifiedDate", this.getIsOnMyDayLastModifiedDate());
        writer.writeStringValue("orderHint", this.getOrderHint());
        writer.writeIntegerValue("percentComplete", this.getPercentComplete());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeEnumValue("previewType", this.getPreviewType());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("progressTaskBoardFormat", this.getProgressTaskBoardFormat());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeIntegerValue("referenceCount", this.getReferenceCount());
        writer.writeEnumSetValue("specifiedCompletionRequirements", this.getSpecifiedCompletionRequirements());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the activeChecklistItemCount property value. The number of checklist items with value set to false, representing incomplete items.
     * @param value Value to set for the activeChecklistItemCount property.
     */
    public void setActiveChecklistItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeChecklistItemCount", value);
    }
    /**
     * Sets the appliedCategories property value. The categories to which the task is applied. See plannerAppliedCategories resource type for possible values.
     * @param value Value to set for the appliedCategories property.
     */
    public void setAppliedCategories(@jakarta.annotation.Nullable final PlannerAppliedCategories value) {
        this.backingStore.set("appliedCategories", value);
    }
    /**
     * Sets the archivalInfo property value. Read-only. Nullable. Contains information about who archived or unarchived the task and why.
     * @param value Value to set for the archivalInfo property.
     */
    public void setArchivalInfo(@jakarta.annotation.Nullable final PlannerArchivalInfo value) {
        this.backingStore.set("archivalInfo", value);
    }
    /**
     * Sets the assignedToTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     * @param value Value to set for the assignedToTaskBoardFormat property.
     */
    public void setAssignedToTaskBoardFormat(@jakarta.annotation.Nullable final PlannerAssignedToTaskBoardTaskFormat value) {
        this.backingStore.set("assignedToTaskBoardFormat", value);
    }
    /**
     * Sets the assigneePriority property value. A hint that is used to order items of this type in a list view. For more information, see Using order hints in planner.
     * @param value Value to set for the assigneePriority property.
     */
    public void setAssigneePriority(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assigneePriority", value);
    }
    /**
     * Sets the assignments property value. The set of assignees the task is assigned to.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final PlannerAssignments value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the bucketId property value. Bucket ID to which the task belongs. The bucket needs to be in the same plan as the task. The value of the bucketId property is 28 characters long and case-sensitive. Format validation is done on the service.
     * @param value Value to set for the bucketId property.
     */
    public void setBucketId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bucketId", value);
    }
    /**
     * Sets the bucketTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     * @param value Value to set for the bucketTaskBoardFormat property.
     */
    public void setBucketTaskBoardFormat(@jakarta.annotation.Nullable final PlannerBucketTaskBoardTaskFormat value) {
        this.backingStore.set("bucketTaskBoardFormat", value);
    }
    /**
     * Sets the checklistItemCount property value. The number of checklist items that are present on the task.
     * @param value Value to set for the checklistItemCount property.
     */
    public void setChecklistItemCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("checklistItemCount", value);
    }
    /**
     * Sets the completedBy property value. The identity of the user that completed the task.
     * @param value Value to set for the completedBy property.
     */
    public void setCompletedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("completedBy", value);
    }
    /**
     * Sets the completedDateTime property value. Read-only. The date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the conversationThreadId property value. The thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     * @param value Value to set for the conversationThreadId property.
     */
    public void setConversationThreadId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("conversationThreadId", value);
    }
    /**
     * Sets the createdBy property value. The identity of the user who created the task.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Read-only. The date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the creationSource property value. Information about the origin of the task.
     * @param value Value to set for the creationSource property.
     */
    public void setCreationSource(@jakarta.annotation.Nullable final PlannerTaskCreation value) {
        this.backingStore.set("creationSource", value);
    }
    /**
     * Sets the details property value. Read-only. Nullable. More details about the task.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final PlannerTaskDetails value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the dueDateTime property value. The date and time at which the task is due. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the dueDateTime property.
     */
    public void setDueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("dueDateTime", value);
    }
    /**
     * Sets the hasDescription property value. Read-only. This value is true if the details object of the task has a nonempty description. Otherwise,false.
     * @param value Value to set for the hasDescription property.
     */
    public void setHasDescription(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasDescription", value);
    }
    /**
     * Sets the isArchived property value. Read-only. If set to true, the task is archived. An archived task is read-only.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isArchived", value);
    }
    /**
     * Sets the isOnMyDay property value. Indicates whether to show this task in the MyDay view. If true, it shows the task.
     * @param value Value to set for the isOnMyDay property.
     */
    public void setIsOnMyDay(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOnMyDay", value);
    }
    /**
     * Sets the isOnMyDayLastModifiedDate property value. Read-only. The date on which task is added to or removed from MyDay.
     * @param value Value to set for the isOnMyDayLastModifiedDate property.
     */
    public void setIsOnMyDayLastModifiedDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("isOnMyDayLastModifiedDate", value);
    }
    /**
     * Sets the orderHint property value. The hint used to order items of this type in a list view. For more information, see Using order hints in plannern.
     * @param value Value to set for the orderHint property.
     */
    public void setOrderHint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("orderHint", value);
    }
    /**
     * Sets the percentComplete property value. The percentage of task completion. When set to 100, the task is completed.
     * @param value Value to set for the percentComplete property.
     */
    public void setPercentComplete(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("percentComplete", value);
    }
    /**
     * Sets the planId property value. Plan ID to which the task belongs.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planId", value);
    }
    /**
     * Sets the previewType property value. The type of preview that shows up on the task. Possible values are: automatic, noPreview, checklist, description, reference.
     * @param value Value to set for the previewType property.
     */
    public void setPreviewType(@jakarta.annotation.Nullable final PlannerPreviewType value) {
        this.backingStore.set("previewType", value);
    }
    /**
     * Sets the priority property value. The priority of the task. Valid values are between 0 and 10, inclusive. Larger values indicate lower priority. For example, 0 has the highest priority and 10 has the lowest priority. Currently, planner interprets values 0 and 1 as 'urgent', 2 and 3 and 4 as 'important', 5, 6, and 7 as 'medium', and 8, 9, and 10 as 'low'. Currently, planner sets the value 1 for 'urgent', 3 for 'important', 5 for 'medium', and 9 for 'low'.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the progressTaskBoardFormat property value. Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     * @param value Value to set for the progressTaskBoardFormat property.
     */
    public void setProgressTaskBoardFormat(@jakarta.annotation.Nullable final PlannerProgressTaskBoardTaskFormat value) {
        this.backingStore.set("progressTaskBoardFormat", value);
    }
    /**
     * Sets the recurrence property value. Defines active or inactive recurrence for the task. null when the recurrence has never been defined for the task.
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PlannerTaskRecurrence value) {
        this.backingStore.set("recurrence", value);
    }
    /**
     * Sets the referenceCount property value. Number of external references that exist on the task.
     * @param value Value to set for the referenceCount property.
     */
    public void setReferenceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("referenceCount", value);
    }
    /**
     * Sets the specifiedCompletionRequirements property value. Indicates all the requirements specified on the plannerTask. Possible values are: none, checklistCompletion, unknownFutureValue, formCompletion, approvalCompletion. Read-only. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: formCompletion, approvalCompletion. The plannerTaskCompletionRequirementDetails in plannerTaskDetails has details of the requirements specified, if any.
     * @param value Value to set for the specifiedCompletionRequirements property.
     */
    public void setSpecifiedCompletionRequirements(@jakarta.annotation.Nullable final EnumSet<PlannerTaskCompletionRequirements> value) {
        this.backingStore.set("specifiedCompletionRequirements", value);
    }
    /**
     * Sets the startDateTime property value. Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the title property value. Title of the task.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
