package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BusinessScenarioTask extends PlannerTask implements Parsable {
    /**
     * Scenario-specific properties of the task. externalObjectId and externalBucketId properties must be specified when creating a task.
     */
    private BusinessScenarioProperties businessScenarioProperties;
    /**
     * Target of the task that specifies where the task should be placed. Must be specified when creating a task.
     */
    private BusinessScenarioTaskTargetBase target;
    /**
     * Instantiates a new businessScenarioTask and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public BusinessScenarioTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a businessScenarioTask
     */
    @javax.annotation.Nonnull
    public static BusinessScenarioTask createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessScenarioTask();
    }
    /**
     * Gets the businessScenarioProperties property value. Scenario-specific properties of the task. externalObjectId and externalBucketId properties must be specified when creating a task.
     * @return a businessScenarioProperties
     */
    @javax.annotation.Nullable
    public BusinessScenarioProperties getBusinessScenarioProperties() {
        return this.businessScenarioProperties;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("businessScenarioProperties", (n) -> { this.setBusinessScenarioProperties(n.getObjectValue(BusinessScenarioProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(BusinessScenarioTaskTargetBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the target property value. Target of the task that specifies where the task should be placed. Must be specified when creating a task.
     * @return a businessScenarioTaskTargetBase
     */
    @javax.annotation.Nullable
    public BusinessScenarioTaskTargetBase getTarget() {
        return this.target;
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
        writer.writeObjectValue("businessScenarioProperties", this.getBusinessScenarioProperties());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the businessScenarioProperties property value. Scenario-specific properties of the task. externalObjectId and externalBucketId properties must be specified when creating a task.
     * @param value Value to set for the businessScenarioProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessScenarioProperties(@javax.annotation.Nullable final BusinessScenarioProperties value) {
        this.businessScenarioProperties = value;
    }
    /**
     * Sets the target property value. Target of the task that specifies where the task should be placed. Must be specified when creating a task.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final BusinessScenarioTaskTargetBase value) {
        this.target = value;
    }
}
