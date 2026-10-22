package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerGroup extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PlannerGroup} and sets the default values.
     */
    public PlannerGroup() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerGroup}
     */
    @jakarta.annotation.Nonnull
    public static PlannerGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("plans_v2", (n) -> { this.setPlansV2(n.getCollectionOfObjectValues(Plan::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the plans property value. Read-only. Nullable. Returns the plannerPlans owned by the group.
     * @return a {@link java.util.List<PlannerPlan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.backingStore.get("plans");
    }
    /**
     * Gets the plans_v2 property value. Read-only. Nullable. The collection of Planner Graph V4 plans owned by the group.
     * @return a {@link java.util.List<Plan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Plan> getPlansV2() {
        return this.backingStore.get("plansV2");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
        writer.writeCollectionOfObjectValues("plans_v2", this.getPlansV2());
    }
    /**
     * Sets the plans property value. Read-only. Nullable. Returns the plannerPlans owned by the group.
     * @param value Value to set for the plans property.
     */
    public void setPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.backingStore.set("plans", value);
    }
    /**
     * Sets the plans_v2 property value. Read-only. Nullable. The collection of Planner Graph V4 plans owned by the group.
     * @param value Value to set for the plans_v2 property.
     */
    public void setPlansV2(@jakarta.annotation.Nullable final java.util.List<Plan> value) {
        this.backingStore.set("plansV2", value);
    }
}
