package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessScenarioTask extends PlannerTask implements Parsable {
    /**
     * Instantiates a new {@link BusinessScenarioTask} and sets the default values.
     */
    public BusinessScenarioTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessScenarioTask}
     */
    @jakarta.annotation.Nonnull
    public static BusinessScenarioTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessScenarioTask();
    }
    /**
     * Gets the businessScenarioProperties property value. Scenario-specific properties of the task. externalObjectId and externalBucketId properties must be specified when creating a task.
     * @return a {@link BusinessScenarioProperties}
     */
    @jakarta.annotation.Nullable
    public BusinessScenarioProperties getBusinessScenarioProperties() {
        return this.backingStore.get("businessScenarioProperties");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("businessScenarioProperties", (n) -> { this.setBusinessScenarioProperties(n.getObjectValue(BusinessScenarioProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(BusinessScenarioTaskTargetBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the target property value. Target of the task that specifies where the task should be placed. Must be specified when creating a task.
     * @return a {@link BusinessScenarioTaskTargetBase}
     */
    @jakarta.annotation.Nullable
    public BusinessScenarioTaskTargetBase getTarget() {
        return this.backingStore.get("target");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("businessScenarioProperties", this.getBusinessScenarioProperties());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the businessScenarioProperties property value. Scenario-specific properties of the task. externalObjectId and externalBucketId properties must be specified when creating a task.
     * @param value Value to set for the businessScenarioProperties property.
     */
    public void setBusinessScenarioProperties(@jakarta.annotation.Nullable final BusinessScenarioProperties value) {
        this.backingStore.set("businessScenarioProperties", value);
    }
    /**
     * Sets the target property value. Target of the task that specifies where the task should be placed. Must be specified when creating a task.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final BusinessScenarioTaskTargetBase value) {
        this.backingStore.set("target", value);
    }
}
