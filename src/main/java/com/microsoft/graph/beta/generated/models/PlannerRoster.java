package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerRoster extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PlannerRoster} and sets the default values.
     */
    public PlannerRoster() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerRoster}
     */
    @jakarta.annotation.Nonnull
    public static PlannerRoster createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerRoster();
    }
    /**
     * Gets the assignedSensitivityLabel property value. The assignedSensitivityLabel property
     * @return a {@link SensitivityLabelAssignment}
     */
    @jakarta.annotation.Nullable
    public SensitivityLabelAssignment getAssignedSensitivityLabel() {
        return this.backingStore.get("assignedSensitivityLabel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignedSensitivityLabel", (n) -> { this.setAssignedSensitivityLabel(n.getObjectValue(SensitivityLabelAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(PlannerRosterMember::createFromDiscriminatorValue)); });
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. Retrieves the members of the plannerRoster.
     * @return a {@link java.util.List<PlannerRosterMember>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerRosterMember> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the plans property value. Retrieves the plans contained by the plannerRoster.
     * @return a {@link java.util.List<PlannerPlan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.backingStore.get("plans");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("assignedSensitivityLabel", this.getAssignedSensitivityLabel());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
    }
    /**
     * Sets the assignedSensitivityLabel property value. The assignedSensitivityLabel property
     * @param value Value to set for the assignedSensitivityLabel property.
     */
    public void setAssignedSensitivityLabel(@jakarta.annotation.Nullable final SensitivityLabelAssignment value) {
        this.backingStore.set("assignedSensitivityLabel", value);
    }
    /**
     * Sets the members property value. Retrieves the members of the plannerRoster.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<PlannerRosterMember> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the plans property value. Retrieves the plans contained by the plannerRoster.
     * @param value Value to set for the plans property.
     */
    public void setPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.backingStore.set("plans", value);
    }
}
