package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerGoal extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link PlannerGoal} and sets the default values.
     */
    public PlannerGoal() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerGoal}
     */
    @jakarta.annotation.Nonnull
    public static PlannerGoal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerGoal();
    }
    /**
     * Gets the displayName property value. Required. The display name of the goal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("finishDate", (n) -> { this.setFinishDate(n.getLocalDateValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PlannerGoalStatus::forValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the finishDate property value. Nullable. The date on which the goal is scheduled to finish.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getFinishDate() {
        return this.backingStore.get("finishDate");
    }
    /**
     * Gets the notes property value. Nullable. The notes associated with the goal.
     * @return a {@link ItemBody}
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the planId property value. Required. The ID of the plan that contains the goal.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.backingStore.get("planId");
    }
    /**
     * Gets the priority property value. Optional. The relative priority of the goal. Valid values range from 0 to 10, inclusive. The default value is 5.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the startDate property value. Nullable. The date on which the goal is scheduled to start.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.backingStore.get("startDate");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link PlannerGoalStatus}
     */
    @jakarta.annotation.Nullable
    public PlannerGoalStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. The tasks associated with the goal. This relationship doesn&apos;t support direct retrieval or $expand. To identify the goals associated with a task, read the goalIds property of the plannerTask resource.
     * @return a {@link java.util.List<PlannerTask>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.backingStore.get("tasks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("finishDate", this.getFinishDate());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeStringValue("planId", this.getPlanId());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the displayName property value. Required. The display name of the goal.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the finishDate property value. Nullable. The date on which the goal is scheduled to finish.
     * @param value Value to set for the finishDate property.
     */
    public void setFinishDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("finishDate", value);
    }
    /**
     * Sets the notes property value. Nullable. The notes associated with the goal.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the planId property value. Required. The ID of the plan that contains the goal.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planId", value);
    }
    /**
     * Sets the priority property value. Optional. The relative priority of the goal. Valid values range from 0 to 10, inclusive. The default value is 5.
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the startDate property value. Nullable. The date on which the goal is scheduled to start.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("startDate", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PlannerGoalStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. The tasks associated with the goal. This relationship doesn&apos;t support direct retrieval or $expand. To identify the goals associated with a task, read the goalIds property of the plannerTask resource.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.backingStore.set("tasks", value);
    }
}
