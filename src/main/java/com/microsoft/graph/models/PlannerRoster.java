package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerRoster extends Entity implements Parsable {
    /**
     * Retrieves the members of the plannerRoster.
     */
    private java.util.List<PlannerRosterMember> members;
    /**
     * Retrieves the plans contained by the plannerRoster.
     */
    private java.util.List<PlannerPlan> plans;
    /**
     * Instantiates a new plannerRoster and sets the default values.
     */
    public PlannerRoster() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerRoster
     */
    @jakarta.annotation.Nonnull
    public static PlannerRoster createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerRoster();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(PlannerRosterMember::createFromDiscriminatorValue)); });
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. Retrieves the members of the plannerRoster.
     * @return a plannerRosterMember
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerRosterMember> getMembers() {
        return this.members;
    }
    /**
     * Gets the plans property value. Retrieves the plans contained by the plannerRoster.
     * @return a plannerPlan
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.plans;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
    }
    /**
     * Sets the members property value. Retrieves the members of the plannerRoster.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<PlannerRosterMember> value) {
        this.members = value;
    }
    /**
     * Sets the plans property value. Retrieves the plans contained by the plannerRoster.
     * @param value Value to set for the plans property.
     */
    public void setPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.plans = value;
    }
}
