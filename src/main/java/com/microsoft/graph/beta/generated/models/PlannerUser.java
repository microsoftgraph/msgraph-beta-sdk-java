package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerUser extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new PlannerUser and sets the default values.
     */
    public PlannerUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerUser
     */
    @jakarta.annotation.Nonnull
    public static PlannerUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerUser();
    }
    /**
     * Gets the all property value. The all property
     * @return a java.util.List<PlannerDelta>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerDelta> getAll() {
        return this.backingStore.get("all");
    }
    /**
     * Gets the favoritePlanReferences property value. A collection that contains the references to the plans that the user has marked as favorites.
     * @return a PlannerFavoritePlanReferenceCollection
     */
    @jakarta.annotation.Nullable
    public PlannerFavoritePlanReferenceCollection getFavoritePlanReferences() {
        return this.backingStore.get("favoritePlanReferences");
    }
    /**
     * Gets the favoritePlans property value. Read-only. Nullable. Returns the plannerPlans that the user marked as favorites.
     * @return a java.util.List<PlannerPlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getFavoritePlans() {
        return this.backingStore.get("favoritePlans");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("all", (n) -> { this.setAll(n.getCollectionOfObjectValues(PlannerDelta::createFromDiscriminatorValue)); });
        deserializerMap.put("favoritePlanReferences", (n) -> { this.setFavoritePlanReferences(n.getObjectValue(PlannerFavoritePlanReferenceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("favoritePlans", (n) -> { this.setFavoritePlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("recentPlanReferences", (n) -> { this.setRecentPlanReferences(n.getObjectValue(PlannerRecentPlanReferenceCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("recentPlans", (n) -> { this.setRecentPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("rosterPlans", (n) -> { this.setRosterPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        deserializerMap.put("tasks", (n) -> { this.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the plans property value. The plans property
     * @return a java.util.List<PlannerPlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.backingStore.get("plans");
    }
    /**
     * Gets the recentPlanReferences property value. A collection that contains references to the plans that were viewed recently by the user in apps that support recent plans.
     * @return a PlannerRecentPlanReferenceCollection
     */
    @jakarta.annotation.Nullable
    public PlannerRecentPlanReferenceCollection getRecentPlanReferences() {
        return this.backingStore.get("recentPlanReferences");
    }
    /**
     * Gets the recentPlans property value. Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans.
     * @return a java.util.List<PlannerPlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getRecentPlans() {
        return this.backingStore.get("recentPlans");
    }
    /**
     * Gets the rosterPlans property value. Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member.
     * @return a java.util.List<PlannerPlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getRosterPlans() {
        return this.backingStore.get("rosterPlans");
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @return a java.util.List<PlannerTask>
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
        writer.writeCollectionOfObjectValues("all", this.getAll());
        writer.writeObjectValue("favoritePlanReferences", this.getFavoritePlanReferences());
        writer.writeCollectionOfObjectValues("favoritePlans", this.getFavoritePlans());
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
        writer.writeObjectValue("recentPlanReferences", this.getRecentPlanReferences());
        writer.writeCollectionOfObjectValues("recentPlans", this.getRecentPlans());
        writer.writeCollectionOfObjectValues("rosterPlans", this.getRosterPlans());
        writer.writeCollectionOfObjectValues("tasks", this.getTasks());
    }
    /**
     * Sets the all property value. The all property
     * @param value Value to set for the all property.
     */
    public void setAll(@jakarta.annotation.Nullable final java.util.List<PlannerDelta> value) {
        this.backingStore.set("all", value);
    }
    /**
     * Sets the favoritePlanReferences property value. A collection that contains the references to the plans that the user has marked as favorites.
     * @param value Value to set for the favoritePlanReferences property.
     */
    public void setFavoritePlanReferences(@jakarta.annotation.Nullable final PlannerFavoritePlanReferenceCollection value) {
        this.backingStore.set("favoritePlanReferences", value);
    }
    /**
     * Sets the favoritePlans property value. Read-only. Nullable. Returns the plannerPlans that the user marked as favorites.
     * @param value Value to set for the favoritePlans property.
     */
    public void setFavoritePlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.backingStore.set("favoritePlans", value);
    }
    /**
     * Sets the plans property value. The plans property
     * @param value Value to set for the plans property.
     */
    public void setPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.backingStore.set("plans", value);
    }
    /**
     * Sets the recentPlanReferences property value. A collection that contains references to the plans that were viewed recently by the user in apps that support recent plans.
     * @param value Value to set for the recentPlanReferences property.
     */
    public void setRecentPlanReferences(@jakarta.annotation.Nullable final PlannerRecentPlanReferenceCollection value) {
        this.backingStore.set("recentPlanReferences", value);
    }
    /**
     * Sets the recentPlans property value. Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans.
     * @param value Value to set for the recentPlans property.
     */
    public void setRecentPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.backingStore.set("recentPlans", value);
    }
    /**
     * Sets the rosterPlans property value. Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member.
     * @param value Value to set for the rosterPlans property.
     */
    public void setRosterPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.backingStore.set("rosterPlans", value);
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.backingStore.set("tasks", value);
    }
}
