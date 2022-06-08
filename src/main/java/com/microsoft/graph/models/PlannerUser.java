package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to group. */
public class PlannerUser extends PlannerDelta implements Parsable {
    /** The all property */
    private java.util.List<PlannerDelta> _all;
    /** A collection containing the references to the plans that the user has marked as favorites. */
    private PlannerFavoritePlanReferenceCollection _favoritePlanReferences;
    /** Read-only. Nullable. Returns the plannerPlans that the user marked as favorites. */
    private java.util.List<PlannerPlan> _favoritePlans;
    /** Read-only. Nullable. Returns the plannerTasks assigned to the user. */
    private java.util.List<PlannerPlan> _plans;
    /** A collection containing references to the plans that were viewed recently by the user in apps that support recent plans. */
    private PlannerRecentPlanReferenceCollection _recentPlanReferences;
    /** Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans. */
    private java.util.List<PlannerPlan> _recentPlans;
    /** Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member. */
    private java.util.List<PlannerPlan> _rosterPlans;
    /** Read-only. Nullable. Returns the plannerTasks assigned to the user. */
    private java.util.List<PlannerTask> _tasks;
    /**
     * Instantiates a new plannerUser and sets the default values.
     * @return a void
     */
    public PlannerUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerUser
     */
    @javax.annotation.Nonnull
    public static PlannerUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerUser();
    }
    /**
     * Gets the all property value. The all property
     * @return a plannerDelta
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerDelta> getAll() {
        return this._all;
    }
    /**
     * Gets the favoritePlanReferences property value. A collection containing the references to the plans that the user has marked as favorites.
     * @return a plannerFavoritePlanReferenceCollection
     */
    @javax.annotation.Nullable
    public PlannerFavoritePlanReferenceCollection getFavoritePlanReferences() {
        return this._favoritePlanReferences;
    }
    /**
     * Gets the favoritePlans property value. Read-only. Nullable. Returns the plannerPlans that the user marked as favorites.
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getFavoritePlans() {
        return this._favoritePlans;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlannerUser currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("all", (n) -> { currentObject.setAll(n.getCollectionOfObjectValues(PlannerDelta::createFromDiscriminatorValue)); });
            this.put("favoritePlanReferences", (n) -> { currentObject.setFavoritePlanReferences(n.getObjectValue(PlannerFavoritePlanReferenceCollection::createFromDiscriminatorValue)); });
            this.put("favoritePlans", (n) -> { currentObject.setFavoritePlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
            this.put("plans", (n) -> { currentObject.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
            this.put("recentPlanReferences", (n) -> { currentObject.setRecentPlanReferences(n.getObjectValue(PlannerRecentPlanReferenceCollection::createFromDiscriminatorValue)); });
            this.put("recentPlans", (n) -> { currentObject.setRecentPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
            this.put("rosterPlans", (n) -> { currentObject.setRosterPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
            this.put("tasks", (n) -> { currentObject.setTasks(n.getCollectionOfObjectValues(PlannerTask::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the plans property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this._plans;
    }
    /**
     * Gets the recentPlanReferences property value. A collection containing references to the plans that were viewed recently by the user in apps that support recent plans.
     * @return a plannerRecentPlanReferenceCollection
     */
    @javax.annotation.Nullable
    public PlannerRecentPlanReferenceCollection getRecentPlanReferences() {
        return this._recentPlanReferences;
    }
    /**
     * Gets the recentPlans property value. Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans.
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getRecentPlans() {
        return this._recentPlans;
    }
    /**
     * Gets the rosterPlans property value. Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member.
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getRosterPlans() {
        return this._rosterPlans;
    }
    /**
     * Gets the tasks property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @return a plannerTask
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerTask> getTasks() {
        return this._tasks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAll(@javax.annotation.Nullable final java.util.List<PlannerDelta> value) {
        this._all = value;
    }
    /**
     * Sets the favoritePlanReferences property value. A collection containing the references to the plans that the user has marked as favorites.
     * @param value Value to set for the favoritePlanReferences property.
     * @return a void
     */
    public void setFavoritePlanReferences(@javax.annotation.Nullable final PlannerFavoritePlanReferenceCollection value) {
        this._favoritePlanReferences = value;
    }
    /**
     * Sets the favoritePlans property value. Read-only. Nullable. Returns the plannerPlans that the user marked as favorites.
     * @param value Value to set for the favoritePlans property.
     * @return a void
     */
    public void setFavoritePlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this._favoritePlans = value;
    }
    /**
     * Sets the plans property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @param value Value to set for the plans property.
     * @return a void
     */
    public void setPlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this._plans = value;
    }
    /**
     * Sets the recentPlanReferences property value. A collection containing references to the plans that were viewed recently by the user in apps that support recent plans.
     * @param value Value to set for the recentPlanReferences property.
     * @return a void
     */
    public void setRecentPlanReferences(@javax.annotation.Nullable final PlannerRecentPlanReferenceCollection value) {
        this._recentPlanReferences = value;
    }
    /**
     * Sets the recentPlans property value. Read-only. Nullable. Returns the plannerPlans that have been recently viewed by the user in apps that support recent plans.
     * @param value Value to set for the recentPlans property.
     * @return a void
     */
    public void setRecentPlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this._recentPlans = value;
    }
    /**
     * Sets the rosterPlans property value. Read-only. Nullable. Returns the plannerPlans contained by the plannerRosters the user is a member.
     * @param value Value to set for the rosterPlans property.
     * @return a void
     */
    public void setRosterPlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this._rosterPlans = value;
    }
    /**
     * Sets the tasks property value. Read-only. Nullable. Returns the plannerTasks assigned to the user.
     * @param value Value to set for the tasks property.
     * @return a void
     */
    public void setTasks(@javax.annotation.Nullable final java.util.List<PlannerTask> value) {
        this._tasks = value;
    }
}
