package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class PlannerRoster extends Entity implements Parsable {
    /** Retrieves the members of the plannerRoster. */
    private java.util.List<PlannerRosterMember> _members;
    /** Retrieves the plans contained by the plannerRoster. */
    private java.util.List<PlannerPlan> _plans;
    /**
     * Instantiates a new plannerRoster and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerRoster() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerRoster
     */
    @javax.annotation.Nonnull
    public static PlannerRoster createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerRoster();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(PlannerRosterMember::createFromDiscriminatorValue)); });
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(PlannerPlan::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. Retrieves the members of the plannerRoster.
     * @return a plannerRosterMember
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerRosterMember> getMembers() {
        return this._members;
    }
    /**
     * Gets the plans property value. Retrieves the plans contained by the plannerRoster.
     * @return a plannerPlan
     */
    @javax.annotation.Nullable
    public java.util.List<PlannerPlan> getPlans() {
        return this._plans;
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
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeCollectionOfObjectValues("plans", this.getPlans());
    }
    /**
     * Sets the members property value. Retrieves the members of the plannerRoster.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<PlannerRosterMember> value) {
        this._members = value;
    }
    /**
     * Sets the plans property value. Retrieves the plans contained by the plannerRoster.
     * @param value Value to set for the plans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlans(@javax.annotation.Nullable final java.util.List<PlannerPlan> value) {
        this._plans = value;
    }
}
