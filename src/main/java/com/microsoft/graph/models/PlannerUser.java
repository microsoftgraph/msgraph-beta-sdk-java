package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerUser extends PlannerDelta implements Parsable {
    /**
     * The all property
     */
    private java.util.List<PlannerDelta> all;
    /**
     * A collection that contains the references to the plans that the user has marked as favorites.
     */
    private PlannerFavoritePlanReferenceCollection favoritePlanReferences;
    /**
     * Read-only. Nullable. Returns the plannerPlans that the user marked as favorites.
     */
    private java.util.List<PlannerPlan> favoritePlans;
    /**
     * The plans property
     */
    private java.util.List<PlannerPlan> plans;
    /**
     * A collection that contains references to the plans that were viewed recently by the user in apps that support recent plans.
     */
    private PlannerRecentPlanReferenceCollection recentPlanReferences;
    /**
     * Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans.
     */
    private java.util.List<PlannerPlan> recentPlans;
    /**
     * Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member.
     */
    private java.util.List<PlannerPlan> rosterPlans;
    /**
     * Read-only. Nullable. Returns the plannerTasks assigned to the user.
     */
    private java.util.List<PlannerTask> tasks;
    /**
     * Instantiates a new plannerUser and sets the default values.
     */
    public PlannerUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerUser
     */
    @jakarta.annotation.Nonnull
    public static PlannerUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerUser();
    }
    /**
     * Gets the all property value. The all property
     * @return a plannerDelta
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerDelta> getAll() {
        return this.all;
    }
    /**
     * Gets the favoritePlanReferences property value. A collection that contains the references to the plans that the user has marked as favorites.
     * @return a plannerFavoritePlanReferenceCollection
     */
    @jakarta.annotation.Nullable
    public PlannerFavoritePlanReferenceCollection getFavoritePlanReferences() {
        return this.favoritePlanReferences;
    }
    /**
     * Gets the favoritePlans property value. Read-only. Nullable. Returns the plannerPlans that the user marked as favorites.
     * @return a plannerPlan
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getFavoritePlans() {
        return this.favoritePlans;
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
     * @return a plannerPlan
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this.plans;
    }
    /**
     * Gets the recentPlanReferences property value. A collection that contains references to the plans that were viewed recently by the user in apps that support recent plans.
     * @return a plannerRecentPlanReferenceCollection
     */
    @jakarta.annotation.Nullable
    public PlannerRecentPlanReferenceCollection getRecentPlanReferences() {
        return this.recentPlanReferences;
    }
    /**
     * Gets the recentPlans property value. Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans.
     * @return a plannerPlan
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getRecentPlans() {
        return this.recentPlans;
    }
    /**
     * Gets the rosterPlans property value. Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member.
     * @return a plannerPlan
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerPlan> getRosterPlans() {
        return this.rosterPlans;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @return a plannerTask
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this.tasks;
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
        this.all = value;
    }
    /**
     * Sets the favoritePlanReferences property value. A collection that contains the references to the plans that the user has marked as favorites.
     * @param value Value to set for the favoritePlanReferences property.
     */
    public void setFavoritePlanReferences(@jakarta.annotation.Nullable final PlannerFavoritePlanReferenceCollection value) {
        this.favoritePlanReferences = value;
    }
    /**
     * Sets the favoritePlans property value. Read-only. Nullable. Returns the plannerPlans that the user marked as favorites.
     * @param value Value to set for the favoritePlans property.
     */
    public void setFavoritePlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.favoritePlans = value;
    }
    /**
     * Sets the plans property value. The plans property
     * @param value Value to set for the plans property.
     */
    public void setPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.plans = value;
    }
    /**
     * Sets the recentPlanReferences property value. A collection that contains references to the plans that were viewed recently by the user in apps that support recent plans.
     * @param value Value to set for the recentPlanReferences property.
     */
    public void setRecentPlanReferences(@jakarta.annotation.Nullable final PlannerRecentPlanReferenceCollection value) {
        this.recentPlanReferences = value;
    }
    /**
     * Sets the recentPlans property value. Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans.
     * @param value Value to set for the recentPlans property.
     */
    public void setRecentPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.recentPlans = value;
    }
    /**
     * Sets the rosterPlans property value. Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member.
     * @param value Value to set for the rosterPlans property.
     */
    public void setRosterPlans(@jakarta.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this.rosterPlans = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @param value Value to set for the tasks property.
     */
    public void setTasks(@jakarta.annotation.Nullable final java.util.List<PlannerTask> value) {
        this.tasks = value;
    }
}
