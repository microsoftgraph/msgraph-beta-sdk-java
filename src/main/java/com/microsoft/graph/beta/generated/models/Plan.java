package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Plan extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link Plan} and sets the default values.
     */
    public Plan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Plan}
     */
    @jakarta.annotation.Nonnull
    public static Plan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Plan();
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
     * Gets the buckets property value. The collection of buckets in the plan. Read-only. Nullable.
     * @return a {@link java.util.List<Bucket>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Bucket> getBuckets() {
        return this.backingStore.get("buckets");
    }
    /**
     * Gets the calendar property value. Working-time calendar settings for the plan.
     * @return a {@link PlanCalendar}
     */
    @jakarta.annotation.Nullable
    public PlanCalendar getCalendar() {
        return this.backingStore.get("calendar");
    }
    /**
     * Gets the capabilities property value. Server-computed, read-only capability flags indicating which optional features are enabled for the entity.
     * @return a {@link PlanCapability}
     */
    @jakarta.annotation.Nullable
    public PlanCapability getCapabilities() {
        return this.backingStore.get("capabilities");
    }
    /**
     * Gets the container property value. Identifies the group, Teams channel, or user that owns the plan. Required, and immutable after creation.
     * @return a {@link PlanContainer}
     */
    @jakarta.annotation.Nullable
    public PlanContainer getContainer() {
        return this.backingStore.get("container");
    }
    /**
     * Gets the contentSensitivityLabelAssignment property value. The sensitivity label assigned to content associated with the plan.
     * @return a {@link ContentSensitivityLabelAssignment}
     */
    @jakarta.annotation.Nullable
    public ContentSensitivityLabelAssignment getContentSensitivityLabelAssignment() {
        return this.backingStore.get("contentSensitivityLabelAssignment");
    }
    /**
     * Gets the contexts property value. The collection of context links describing where the plan is surfaced. Read-only. Nullable.
     * @return a {@link java.util.List<PlanContextLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlanContextLink> getContexts() {
        return this.backingStore.get("contexts");
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
     * Gets the customFieldDefinitions property value. The collection of custom field definitions in the plan. Read-only. Nullable.
     * @return a {@link java.util.List<CustomFieldDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomFieldDefinition> getCustomFieldDefinitions() {
        return this.backingStore.get("customFieldDefinitions");
    }
    /**
     * Gets the dependencies property value. The collection of dependencies between items in the plan. Read-only. Nullable.
     * @return a {@link java.util.List<Dependency>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Dependency> getDependencies() {
        return this.backingStore.get("dependencies");
    }
    /**
     * Gets the displayName property value. Title of the plan.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the duration property value. Duration of the plan, in days.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDuration() {
        return this.backingStore.get("duration");
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
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(Bucket::createFromDiscriminatorValue)); });
        deserializerMap.put("calendar", (n) -> { this.setCalendar(n.getObjectValue(PlanCalendar::createFromDiscriminatorValue)); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(PlanCapability::createFromDiscriminatorValue)); });
        deserializerMap.put("container", (n) -> { this.setContainer(n.getObjectValue(PlanContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("contentSensitivityLabelAssignment", (n) -> { this.setContentSensitivityLabelAssignment(n.getObjectValue(ContentSensitivityLabelAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("contexts", (n) -> { this.setContexts(n.getCollectionOfObjectValues(PlanContextLink::createFromDiscriminatorValue)); });
        deserializerMap.put("creationInfo", (n) -> { this.setCreationInfo(n.getObjectValue(CreationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("customFieldDefinitions", (n) -> { this.setCustomFieldDefinitions(n.getCollectionOfObjectValues(CustomFieldDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("dependencies", (n) -> { this.setDependencies(n.getCollectionOfObjectValues(Dependency::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getIntegerValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getObjectValue(ExtensionFieldCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("goals", (n) -> { this.setGoals(n.getCollectionOfObjectValues(Goal::createFromDiscriminatorValue)); });
        deserializerMap.put("hasChat", (n) -> { this.setHasChat(n.getBooleanValue()); });
        deserializerMap.put("historyItems", (n) -> { this.setHistoryItems(n.getCollectionOfObjectValues(HistoryItem::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("links", (n) -> { this.setLinks(n.getCollectionOfObjectValues(ContentLink::createFromDiscriminatorValue)); });
        deserializerMap.put("planView", (n) -> { this.setPlanView(n.getObjectValue(PlanView::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedWithContainers", (n) -> { this.setSharedWithContainers(n.getCollectionOfObjectValues(PlannerSharedWithContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(Task::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the goals property value. The collection of goals in the plan. Read-only. Nullable.
     * @return a {@link java.util.List<Goal>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Goal> getGoals() {
        return this.backingStore.get("goals");
    }
    /**
     * Gets the hasChat property value. Indicates whether the plan has an associated chat.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasChat() {
        return this.backingStore.get("hasChat");
    }
    /**
     * Gets the historyItems property value. The collection of history (audit) items for the plan. Read-only. Nullable.
     * @return a {@link java.util.List<HistoryItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HistoryItem> getHistoryItems() {
        return this.backingStore.get("historyItems");
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
     * Gets the links property value. The collection of content links attached to the plan. Read-only. Nullable.
     * @return a {@link java.util.List<ContentLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContentLink> getLinks() {
        return this.backingStore.get("links");
    }
    /**
     * Gets the planView property value. Plan-scoped view settings, including category definitions.
     * @return a {@link PlanView}
     */
    @jakarta.annotation.Nullable
    public PlanView getPlanView() {
        return this.backingStore.get("planView");
    }
    /**
     * Gets the sharedWithContainers property value. The list of containers (for example, additional groups or channels) that the plan is shared with.
     * @return a {@link java.util.List<PlannerSharedWithContainer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerSharedWithContainer> getSharedWithContainers() {
        return this.backingStore.get("sharedWithContainers");
    }
    /**
     * Gets the tasks property value. The collection of tasks in the plan. Read-only. Nullable.
     * @return a {@link java.util.List<Task>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Task> getTasks() {
        return this.backingStore.get("tasks");
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
        writer.writeObjectValue("calendar", this.getCalendar());
        writer.writeObjectValue("container", this.getContainer());
        writer.writeObjectValue("contentSensitivityLabelAssignment", this.getContentSensitivityLabelAssignment());
        writer.writeCollectionOfObjectValues("contexts", this.getContexts());
        writer.writeCollectionOfObjectValues("customFieldDefinitions", this.getCustomFieldDefinitions());
        writer.writeCollectionOfObjectValues("dependencies", this.getDependencies());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("duration", this.getDuration());
        writer.writeObjectValue("extensions", this.getExtensions());
        writer.writeCollectionOfObjectValues("goals", this.getGoals());
        writer.writeBooleanValue("hasChat", this.getHasChat());
        writer.writeCollectionOfObjectValues("historyItems", this.getHistoryItems());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("links", this.getLinks());
        writer.writeObjectValue("planView", this.getPlanView());
        writer.writeCollectionOfObjectValues("sharedWithContainers", this.getSharedWithContainers());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the archivalInfo property value. Information about whether the entity is archived, and when it was archived.
     * @param value Value to set for the archivalInfo property.
     */
    public void setArchivalInfo(@jakarta.annotation.Nullable final PlannerArchivalInfo value) {
        this.backingStore.set("archivalInfo", value);
    }
    /**
     * Sets the buckets property value. The collection of buckets in the plan. Read-only. Nullable.
     * @param value Value to set for the buckets property.
     */
    public void setBuckets(@jakarta.annotation.Nullable final java.util.List<Bucket> value) {
        this.backingStore.set("buckets", value);
    }
    /**
     * Sets the calendar property value. Working-time calendar settings for the plan.
     * @param value Value to set for the calendar property.
     */
    public void setCalendar(@jakarta.annotation.Nullable final PlanCalendar value) {
        this.backingStore.set("calendar", value);
    }
    /**
     * Sets the capabilities property value. Server-computed, read-only capability flags indicating which optional features are enabled for the entity.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final PlanCapability value) {
        this.backingStore.set("capabilities", value);
    }
    /**
     * Sets the container property value. Identifies the group, Teams channel, or user that owns the plan. Required, and immutable after creation.
     * @param value Value to set for the container property.
     */
    public void setContainer(@jakarta.annotation.Nullable final PlanContainer value) {
        this.backingStore.set("container", value);
    }
    /**
     * Sets the contentSensitivityLabelAssignment property value. The sensitivity label assigned to content associated with the plan.
     * @param value Value to set for the contentSensitivityLabelAssignment property.
     */
    public void setContentSensitivityLabelAssignment(@jakarta.annotation.Nullable final ContentSensitivityLabelAssignment value) {
        this.backingStore.set("contentSensitivityLabelAssignment", value);
    }
    /**
     * Sets the contexts property value. The collection of context links describing where the plan is surfaced. Read-only. Nullable.
     * @param value Value to set for the contexts property.
     */
    public void setContexts(@jakarta.annotation.Nullable final java.util.List<PlanContextLink> value) {
        this.backingStore.set("contexts", value);
    }
    /**
     * Sets the creationInfo property value. Read-only creation metadata for the entity.
     * @param value Value to set for the creationInfo property.
     */
    public void setCreationInfo(@jakarta.annotation.Nullable final CreationInfo value) {
        this.backingStore.set("creationInfo", value);
    }
    /**
     * Sets the customFieldDefinitions property value. The collection of custom field definitions in the plan. Read-only. Nullable.
     * @param value Value to set for the customFieldDefinitions property.
     */
    public void setCustomFieldDefinitions(@jakarta.annotation.Nullable final java.util.List<CustomFieldDefinition> value) {
        this.backingStore.set("customFieldDefinitions", value);
    }
    /**
     * Sets the dependencies property value. The collection of dependencies between items in the plan. Read-only. Nullable.
     * @param value Value to set for the dependencies property.
     */
    public void setDependencies(@jakarta.annotation.Nullable final java.util.List<Dependency> value) {
        this.backingStore.set("dependencies", value);
    }
    /**
     * Sets the displayName property value. Title of the plan.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the duration property value. Duration of the plan, in days.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("duration", value);
    }
    /**
     * Sets the extensions property value. Custom extension field values set on the entity. Supports $select.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final ExtensionFieldCollection value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the goals property value. The collection of goals in the plan. Read-only. Nullable.
     * @param value Value to set for the goals property.
     */
    public void setGoals(@jakarta.annotation.Nullable final java.util.List<Goal> value) {
        this.backingStore.set("goals", value);
    }
    /**
     * Sets the hasChat property value. Indicates whether the plan has an associated chat.
     * @param value Value to set for the hasChat property.
     */
    public void setHasChat(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasChat", value);
    }
    /**
     * Sets the historyItems property value. The collection of history (audit) items for the plan. Read-only. Nullable.
     * @param value Value to set for the historyItems property.
     */
    public void setHistoryItems(@jakarta.annotation.Nullable final java.util.List<HistoryItem> value) {
        this.backingStore.set("historyItems", value);
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
     * Sets the links property value. The collection of content links attached to the plan. Read-only. Nullable.
     * @param value Value to set for the links property.
     */
    public void setLinks(@jakarta.annotation.Nullable final java.util.List<ContentLink> value) {
        this.backingStore.set("links", value);
    }
    /**
     * Sets the planView property value. Plan-scoped view settings, including category definitions.
     * @param value Value to set for the planView property.
     */
    public void setPlanView(@jakarta.annotation.Nullable final PlanView value) {
        this.backingStore.set("planView", value);
    }
    /**
     * Sets the sharedWithContainers property value. The list of containers (for example, additional groups or channels) that the plan is shared with.
     * @param value Value to set for the sharedWithContainers property.
     */
    public void setSharedWithContainers(@jakarta.annotation.Nullable final java.util.List<PlannerSharedWithContainer> value) {
        this.backingStore.set("sharedWithContainers", value);
    }
    /**
     * Sets the tasks property value. The collection of tasks in the plan. Read-only. Nullable.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<Task> value) {
        this.backingStore.set("tasks", value);
    }
}
