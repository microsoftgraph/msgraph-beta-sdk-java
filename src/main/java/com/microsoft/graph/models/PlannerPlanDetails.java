package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerPlanDetails extends PlannerDelta implements Parsable {
    /**
     * An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan.
     */
    private PlannerCategoryDescriptions categoryDescriptions;
    /**
     * A collection of additional information associated with plannerPlanContext entries that are defined for the plannerPlan container. Read-only.
     */
    private PlannerPlanContextDetailsCollection contextDetails;
    /**
     * The set of user IDs that this plan is shared with. If you are using Microsoft 365 groups, use the groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it is not required in order for them to access the plan owned by the group.
     */
    private PlannerUserIds sharedWith;
    /**
     * Instantiates a new plannerPlanDetails and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public PlannerPlanDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerPlanDetails
     */
    @jakarta.annotation.Nonnull
    public static PlannerPlanDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerPlanDetails();
    }
    /**
     * Gets the categoryDescriptions property value. An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan.
     * @return a plannerCategoryDescriptions
     */
    @jakarta.annotation.Nullable
    public PlannerCategoryDescriptions getCategoryDescriptions() {
        return this.categoryDescriptions;
    }
    /**
     * Gets the contextDetails property value. A collection of additional information associated with plannerPlanContext entries that are defined for the plannerPlan container. Read-only.
     * @return a plannerPlanContextDetailsCollection
     */
    @jakarta.annotation.Nullable
    public PlannerPlanContextDetailsCollection getContextDetails() {
        return this.contextDetails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categoryDescriptions", (n) -> { this.setCategoryDescriptions(n.getObjectValue(PlannerCategoryDescriptions::createFromDiscriminatorValue)); });
        deserializerMap.put("contextDetails", (n) -> { this.setContextDetails(n.getObjectValue(PlannerPlanContextDetailsCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedWith", (n) -> { this.setSharedWith(n.getObjectValue(PlannerUserIds::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sharedWith property value. The set of user IDs that this plan is shared with. If you are using Microsoft 365 groups, use the groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it is not required in order for them to access the plan owned by the group.
     * @return a plannerUserIds
     */
    @jakarta.annotation.Nullable
    public PlannerUserIds getSharedWith() {
        return this.sharedWith;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("categoryDescriptions", this.getCategoryDescriptions());
        writer.writeObjectValue("contextDetails", this.getContextDetails());
        writer.writeObjectValue("sharedWith", this.getSharedWith());
    }
    /**
     * Sets the categoryDescriptions property value. An object that specifies the descriptions of the 25 categories that can be associated with tasks in the plan.
     * @param value Value to set for the categoryDescriptions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCategoryDescriptions(@jakarta.annotation.Nullable final PlannerCategoryDescriptions value) {
        this.categoryDescriptions = value;
    }
    /**
     * Sets the contextDetails property value. A collection of additional information associated with plannerPlanContext entries that are defined for the plannerPlan container. Read-only.
     * @param value Value to set for the contextDetails property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContextDetails(@jakarta.annotation.Nullable final PlannerPlanContextDetailsCollection value) {
        this.contextDetails = value;
    }
    /**
     * Sets the sharedWith property value. The set of user IDs that this plan is shared with. If you are using Microsoft 365 groups, use the groups API to manage group membership to share the group's plan. You can also add existing members of the group to this collection, although it is not required in order for them to access the plan owned by the group.
     * @param value Value to set for the sharedWith property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSharedWith(@jakarta.annotation.Nullable final PlannerUserIds value) {
        this.sharedWith = value;
    }
}
