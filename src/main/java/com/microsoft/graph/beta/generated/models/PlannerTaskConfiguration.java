package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new PlannerTaskConfiguration and sets the default values.
     */
    public PlannerTaskConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerTaskConfiguration
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskConfiguration();
    }
    /**
     * Gets the editPolicy property value. Policy configuration for tasks created for the businessScenario when they're being changed outside of the scenario.
     * @return a PlannerTaskPolicy
     */
    @jakarta.annotation.Nullable
    public PlannerTaskPolicy getEditPolicy() {
        return this.backingStore.get("editPolicy");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("editPolicy", (n) -> { this.setEditPolicy(n.getObjectValue(PlannerTaskPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("editPolicy", this.getEditPolicy());
    }
    /**
     * Sets the editPolicy property value. Policy configuration for tasks created for the businessScenario when they're being changed outside of the scenario.
     * @param value Value to set for the editPolicy property.
     */
    public void setEditPolicy(@jakarta.annotation.Nullable final PlannerTaskPolicy value) {
        this.backingStore.set("editPolicy", value);
    }
}
