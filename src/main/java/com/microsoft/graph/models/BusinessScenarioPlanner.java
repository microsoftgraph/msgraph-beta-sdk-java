package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BusinessScenarioPlanner extends Entity implements Parsable {
    /** The configuration of Planner plans that will be created for the scenario. */
    private PlannerPlanConfiguration planConfiguration;
    /** The configuration of Planner tasks that will be created for the scenario. */
    private PlannerTaskConfiguration taskConfiguration;
    /** The Planner tasks for the scenario. */
    private java.util.List<BusinessScenarioTask> tasks;
    /**
     * Instantiates a new businessScenarioPlanner and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BusinessScenarioPlanner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a businessScenarioPlanner
     */
    @javax.annotation.Nonnull
    public static BusinessScenarioPlanner createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessScenarioPlanner();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("planConfiguration", (n) -> { this.setPlanConfiguration(n.getObjectValue(PlannerPlanConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("taskConfiguration", (n) -> { this.setTaskConfiguration(n.getObjectValue(PlannerTaskConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(BusinessScenarioTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the planConfiguration property value. The configuration of Planner plans that will be created for the scenario.
     * @return a plannerPlanConfiguration
     */
    @javax.annotation.Nullable
    public PlannerPlanConfiguration getPlanConfiguration() {
        return this.planConfiguration;
    }
    /**
     * Gets the taskConfiguration property value. The configuration of Planner tasks that will be created for the scenario.
     * @return a plannerTaskConfiguration
     */
    @javax.annotation.Nullable
    public PlannerTaskConfiguration getTaskConfiguration() {
        return this.taskConfiguration;
    }
    /**
     * Gets the tasks property value. The Planner tasks for the scenario.
     * @return a businessScenarioTask
     */
    @javax.annotation.Nullable
    public java.util.List<BusinessScenarioTask> getTasks() {
        return this.tasks;
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
        writer.writeObjectValue("planConfiguration", this.getPlanConfiguration());
        writer.writeObjectValue("taskConfiguration", this.getTaskConfiguration());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the planConfiguration property value. The configuration of Planner plans that will be created for the scenario.
     * @param value Value to set for the planConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlanConfiguration(@javax.annotation.Nullable final PlannerPlanConfiguration value) {
        this.planConfiguration = value;
    }
    /**
     * Sets the taskConfiguration property value. The configuration of Planner tasks that will be created for the scenario.
     * @param value Value to set for the taskConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskConfiguration(@javax.annotation.Nullable final PlannerTaskConfiguration value) {
        this.taskConfiguration = value;
    }
    /**
     * Sets the tasks property value. The Planner tasks for the scenario.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTasks(@javax.annotation.Nullable final java.util.List<BusinessScenarioTask> value) {
        this.tasks = value;
    }
}
