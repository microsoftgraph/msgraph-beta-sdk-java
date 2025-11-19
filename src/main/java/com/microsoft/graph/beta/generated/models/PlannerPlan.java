package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerPlan extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link PlannerPlan} and sets the default values.
     */
    public PlannerPlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerPlan}
     */
    @jakarta.annotation.Nonnull
    public static PlannerPlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlan();
    }
    /**
     * Gets the archivalInfo property value. Read-only. Nullable. Contains information about who archived or unarchived the plan and why.
     * @return a {@link PlannerArchivalInfo}
     */
    @jakarta.annotation.Nullable
    public PlannerArchivalInfo getArchivalInfo() {
        return this.backingStore.get("archivalInfo");
    }
    /**
     * Gets the buckets property value. Collection of buckets in the plan. Read-only. Nullable.
     * @return a {@link java.util.List<PlannerBucket>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerBucket> getBuckets() {
        return this.backingStore.get("buckets");
    }
    /**
     * Gets the container property value. Identifies the container of the plan. Either specify all properties, or specify only the url, the containerId, and type. After it&apos;s set, this property cant be updated. It changes when a plan is moved from one container to another, using plan move to container. Required.
     * @return a {@link PlannerPlanContainer}
     */
    @jakarta.annotation.Nullable
    public PlannerPlanContainer getContainer() {
        return this.backingStore.get("container");
    }
    /**
     * Gets the contentSensitivityLabelAssignment property value. The sensitivity label assignment for the plan. Used to classify and protect the plan content based on organizational policies. This property is null if no sensitivity label is assigned. Optional.
     * @return a {@link ContentSensitivityLabelAssignment}
     */
    @jakarta.annotation.Nullable
    public ContentSensitivityLabelAssignment getContentSensitivityLabelAssignment() {
        return this.backingStore.get("contentSensitivityLabelAssignment");
    }
    /**
     * Gets the contexts property value. Read-only. Other user experiences in which this plan is used, represented as plannerPlanContext entries.
     * @return a {@link PlannerPlanContextCollection}
     */
    @jakarta.annotation.Nullable
    public PlannerPlanContextCollection getContexts() {
        return this.backingStore.get("contexts");
    }
    /**
     * Gets the createdBy property value. Read-only. The user who created the plan.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the creationSource property value. Contains information about the origin of the plan.
     * @return a {@link PlannerPlanCreation}
     */
    @jakarta.annotation.Nullable
    public PlannerPlanCreation getCreationSource() {
        return this.backingStore.get("creationSource");
    }
    /**
     * Gets the details property value. Extra details about the plan. Read-only. Nullable.
     * @return a {@link PlannerPlanDetails}
     */
    @jakarta.annotation.Nullable
    public PlannerPlanDetails getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("archivalInfo", (n) -> { this.setArchivalInfo(n.getObjectValue(PlannerArchivalInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(PlannerBucket::createFromDiscriminatorValue)); });
        deserializerMap.put("container", (n) -> { this.setContainer(n.getObjectValue(PlannerPlanContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("contentSensitivityLabelAssignment", (n) -> { this.setContentSensitivityLabelAssignment(n.getObjectValue(ContentSensitivityLabelAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("contexts", (n) -> { this.setContexts(n.getObjectValue(PlannerPlanContextCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creationSource", (n) -> { this.setCreationSource(n.getObjectValue(PlannerPlanCreation::createFromDiscriminatorValue)); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getObjectValue(PlannerPlanDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("sharedWithContainers", (n) -> { this.setSharedWithContainers(n.getCollectionOfObjectValues(PlannerSharedWithContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isArchived property value. Read-only. If set to true, the plan is archived. An archived plan is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.backingStore.get("isArchived");
    }
    /**
     * Gets the owner property value. Use the container property instead. ID of the group that owns the plan. After it&apos;s set, this property cant be updated. This property doesn&apos;t return a valid group ID if the container of the plan isn&apos;t a group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwner() {
        return this.backingStore.get("owner");
    }
    /**
     * Gets the sharedWithContainers property value. List of containers the plan is shared with.
     * @return a {@link java.util.List<PlannerSharedWithContainer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerSharedWithContainer> getSharedWithContainers() {
        return this.backingStore.get("sharedWithContainers");
    }
    /**
     * Gets the tasks property value. Collection of tasks in the plan. Read-only. Nullable.
     * @return a {@link java.util.List<PlannerTask>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.backingStore.get("tasks");
    }
    /**
     * Gets the title property value. Required. Title of the plan.
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
        writer.writeObjectValue("archivalInfo", this.getArchivalInfo());
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeObjectValue("container", this.getContainer());
        writer.writeObjectValue("contentSensitivityLabelAssignment", this.getContentSensitivityLabelAssignment());
        writer.writeObjectValue("contexts", this.getContexts());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("creationSource", this.getCreationSource());
        writer.writeObjectValue("details", this.getDetails());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeCollectionOfObjectValues("sharedWithContainers", this.getSharedWithContainers());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the archivalInfo property value. Read-only. Nullable. Contains information about who archived or unarchived the plan and why.
     * @param value Value to set for the archivalInfo property.
     */
    public void setArchivalInfo(@jakarta.annotation.Nullable final PlannerArchivalInfo value) {
        this.backingStore.set("archivalInfo", value);
    }
    /**
     * Sets the buckets property value. Collection of buckets in the plan. Read-only. Nullable.
     * @param value Value to set for the buckets property.
     */
    public void setBuckets(@jakarta.annotation.Nullable final java.util.List<PlannerBucket> value) {
        this.backingStore.set("buckets", value);
    }
    /**
     * Sets the container property value. Identifies the container of the plan. Either specify all properties, or specify only the url, the containerId, and type. After it&apos;s set, this property cant be updated. It changes when a plan is moved from one container to another, using plan move to container. Required.
     * @param value Value to set for the container property.
     */
    public void setContainer(@jakarta.annotation.Nullable final PlannerPlanContainer value) {
        this.backingStore.set("container", value);
    }
    /**
     * Sets the contentSensitivityLabelAssignment property value. The sensitivity label assignment for the plan. Used to classify and protect the plan content based on organizational policies. This property is null if no sensitivity label is assigned. Optional.
     * @param value Value to set for the contentSensitivityLabelAssignment property.
     */
    public void setContentSensitivityLabelAssignment(@jakarta.annotation.Nullable final ContentSensitivityLabelAssignment value) {
        this.backingStore.set("contentSensitivityLabelAssignment", value);
    }
    /**
     * Sets the contexts property value. Read-only. Other user experiences in which this plan is used, represented as plannerPlanContext entries.
     * @param value Value to set for the contexts property.
     */
    public void setContexts(@jakarta.annotation.Nullable final PlannerPlanContextCollection value) {
        this.backingStore.set("contexts", value);
    }
    /**
     * Sets the createdBy property value. Read-only. The user who created the plan.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the creationSource property value. Contains information about the origin of the plan.
     * @param value Value to set for the creationSource property.
     */
    public void setCreationSource(@jakarta.annotation.Nullable final PlannerPlanCreation value) {
        this.backingStore.set("creationSource", value);
    }
    /**
     * Sets the details property value. Extra details about the plan. Read-only. Nullable.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final PlannerPlanDetails value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the isArchived property value. Read-only. If set to true, the plan is archived. An archived plan is read-only.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isArchived", value);
    }
    /**
     * Sets the owner property value. Use the container property instead. ID of the group that owns the plan. After it&apos;s set, this property cant be updated. This property doesn&apos;t return a valid group ID if the container of the plan isn&apos;t a group.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("owner", value);
    }
    /**
     * Sets the sharedWithContainers property value. List of containers the plan is shared with.
     * @param value Value to set for the sharedWithContainers property.
     */
    public void setSharedWithContainers(@jakarta.annotation.Nullable final java.util.List<PlannerSharedWithContainer> value) {
        this.backingStore.set("sharedWithContainers", value);
    }
    /**
     * Sets the tasks property value. Collection of tasks in the plan. Read-only. Nullable.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.backingStore.set("tasks", value);
    }
    /**
     * Sets the title property value. Required. Title of the plan.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
