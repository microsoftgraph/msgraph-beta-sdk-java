package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Planner extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Planner} and sets the default values.
     */
    public Planner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Planner}
     */
    @jakarta.annotation.Nonnull
    public static Planner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Planner();
    }
    /**
     * Gets the buckets property value. Read-only. Nullable. Returns a collection of the specified buckets
     * @return a {@link java.util.List<PlannerBucket>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerBucket> getBuckets() {
        return this.backingStore.get("buckets");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("buckets", (n) -> { this.setBuckets(n.getCollectionOfObjectValues(PlannerBucket::createFromDiscriminatorValue)); });
        deserializerMap.put("goals", (n) -> { this.setGoals(n.getCollectionOfObjectValues(PlannerGoal::createFromDiscriminatorValue)); });
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("plans_v2", (n) -> { this.setPlansV2(n.getCollectionOfObjectValues(Plan::createFromDiscriminatorValue)); });
        deserializerMap.put("rosters", (n) -> { this.setRosters(n.getCollectionOfObjectValues(PlannerRoster::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks_v2", (n) -> { this.setTasksV2(n.getCollectionOfObjectValues(Task::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the goals property value. Read-only. Nullable. Returns a collection of the specified goals
     * @return a {@link java.util.List<PlannerGoal>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerGoal> getGoals() {
        return this.backingStore.get("goals");
    }
    /**
     * Gets the plans property value. Read-only. Nullable. Returns a collection of the specified plans
     * @return a {@link java.util.List<PlannerPlan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.backingStore.get("plans");
    }
    /**
     * Gets the plans_v2 property value. Read-only. Nullable. The collection of Planner Graph V4 plans.
     * @return a {@link java.util.List<Plan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Plan> getPlansV2() {
        return this.backingStore.get("plansV2");
    }
    /**
     * Gets the rosters property value. Read-only. Nullable. Returns a collection of the specified rosters
     * @return a {@link java.util.List<PlannerRoster>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerRoster> getRosters() {
        return this.backingStore.get("rosters");
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Returns a collection of the specified tasks
     * @return a {@link java.util.List<PlannerTask>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.backingStore.get("tasks");
    }
    /**
     * Gets the tasks_v2 property value. Read-only. Nullable. The collection of Planner Graph V4 tasks.
     * @return a {@link java.util.List<Task>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Task> getTasksV2() {
        return this.backingStore.get("tasksV2");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("buckets", this.getBuckets());
        writer.writeCollectionOfObjectValues("goals", this.getGoals());
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
        writer.writeCollectionOfObjectValues("plans_v2", this.getPlansV2());
        writer.writeCollectionOfObjectValues("rosters", this.getRosters());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
        writer.writeCollectionOfObjectValues("tasks_v2", this.getTasksV2());
    }
    /**
     * Sets the buckets property value. Read-only. Nullable. Returns a collection of the specified buckets
     * @param value Value to set for the buckets property.
     */
    public void setBuckets(@jakarta.annotation.Nullable final java.util.List<PlannerBucket> value) {
        this.backingStore.set("buckets", value);
    }
    /**
     * Sets the goals property value. Read-only. Nullable. Returns a collection of the specified goals
     * @param value Value to set for the goals property.
     */
    public void setGoals(@jakarta.annotation.Nullable final java.util.List<PlannerGoal> value) {
        this.backingStore.set("goals", value);
    }
    /**
     * Sets the plans property value. Read-only. Nullable. Returns a collection of the specified plans
     * @param value Value to set for the plans property.
     */
    public void setPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.backingStore.set("plans", value);
    }
    /**
     * Sets the plans_v2 property value. Read-only. Nullable. The collection of Planner Graph V4 plans.
     * @param value Value to set for the plans_v2 property.
     */
    public void setPlansV2(@jakarta.annotation.Nullable final java.util.List<Plan> value) {
        this.backingStore.set("plansV2", value);
    }
    /**
     * Sets the rosters property value. Read-only. Nullable. Returns a collection of the specified rosters
     * @param value Value to set for the rosters property.
     */
    public void setRosters(@jakarta.annotation.Nullable final java.util.List<PlannerRoster> value) {
        this.backingStore.set("rosters", value);
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Returns a collection of the specified tasks
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.backingStore.set("tasks", value);
    }
    /**
     * Sets the tasks_v2 property value. Read-only. Nullable. The collection of Planner Graph V4 tasks.
     * @param value Value to set for the tasks_v2 property.
     */
    public void setTasksV2(@jakarta.annotation.Nullable final java.util.List<Task> value) {
        this.backingStore.set("tasksV2", value);
    }
}
