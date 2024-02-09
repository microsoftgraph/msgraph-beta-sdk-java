package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessScenarioPlanner extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BusinessScenarioPlanner} and sets the default values.
     */
    public BusinessScenarioPlanner() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessScenarioPlanner}
     */
    @jakarta.annotation.Nonnull
    public static BusinessScenarioPlanner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessScenarioPlanner();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("planConfiguration", (n) -> { this.setPlanConfiguration(n.getObjectValue(PlannerPlanConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("taskConfiguration", (n) -> { this.setTaskConfiguration(n.getObjectValue(PlannerTaskConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(BusinessScenarioTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the planConfiguration property value. The configuration of Planner plans that will be created for the scenario.
     * @return a {@link PlannerPlanConfiguration}
     */
    @jakarta.annotation.Nullable
    public PlannerPlanConfiguration getPlanConfiguration() {
        return this.backingStore.get("planConfiguration");
    }
    /**
     * Gets the taskConfiguration property value. The configuration of Planner tasks that will be created for the scenario.
     * @return a {@link PlannerTaskConfiguration}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskConfiguration getTaskConfiguration() {
        return this.backingStore.get("taskConfiguration");
    }
    /**
     * Gets the tasks property value. The Planner tasks for the scenario.
     * @return a {@link java.util.List<BusinessScenarioTask>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BusinessScenarioTask> getTasks() {
        return this.backingStore.get("tasks");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("planConfiguration", this.getPlanConfiguration());
        writer.writeObjectValue("taskConfiguration", this.getTaskConfiguration());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the planConfiguration property value. The configuration of Planner plans that will be created for the scenario.
     * @param value Value to set for the planConfiguration property.
     */
    public void setPlanConfiguration(@jakarta.annotation.Nullable final PlannerPlanConfiguration value) {
        this.backingStore.set("planConfiguration", value);
    }
    /**
     * Sets the taskConfiguration property value. The configuration of Planner tasks that will be created for the scenario.
     * @param value Value to set for the taskConfiguration property.
     */
    public void setTaskConfiguration(@jakarta.annotation.Nullable final PlannerTaskConfiguration value) {
        this.backingStore.set("taskConfiguration", value);
    }
    /**
     * Sets the tasks property value. The Planner tasks for the scenario.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<BusinessScenarioTask> value) {
        this.backingStore.set("tasks", value);
    }
}
