package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewSet extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewSet} and sets the default values.
     */
    public AccessReviewSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewSet}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewSet();
    }
    /**
     * Gets the decisions property value. Represents a Microsoft Entra access review decision on an instance of a review.
     * @return a {@link java.util.List<AccessReviewInstanceDecisionItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewInstanceDecisionItem> getDecisions() {
        return this.backingStore.get("decisions");
    }
    /**
     * Gets the definitions property value. Represents the template and scheduling for an access review.
     * @return a {@link java.util.List<AccessReviewScheduleDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewScheduleDefinition> getDefinitions() {
        return this.backingStore.get("definitions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("decisions", (n) -> { this.setDecisions(n.getCollectionOfObjectValues(AccessReviewInstanceDecisionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("definitions", (n) -> { this.setDefinitions(n.getCollectionOfObjectValues(AccessReviewScheduleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("historyDefinitions", (n) -> { this.setHistoryDefinitions(n.getCollectionOfObjectValues(AccessReviewHistoryDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(AccessReviewPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the historyDefinitions property value. Represents a collection of access review history data and the scopes used to collect that data.
     * @return a {@link java.util.List<AccessReviewHistoryDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewHistoryDefinition> getHistoryDefinitions() {
        return this.backingStore.get("historyDefinitions");
    }
    /**
     * Gets the policy property value. Resource that enables administrators to manage directory-level access review policies in their tenant.
     * @return a {@link AccessReviewPolicy}
     */
    @jakarta.annotation.Nullable
    public AccessReviewPolicy getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("decisions", this.getDecisions());
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
        writer.writeCollectionOfObjectValues("historyDefinitions", this.getHistoryDefinitions());
        writer.writeObjectValue("policy", this.getPolicy());
    }
    /**
     * Sets the decisions property value. Represents a Microsoft Entra access review decision on an instance of a review.
     * @param value Value to set for the decisions property.
     */
    public void setDecisions(@jakarta.annotation.Nullable final java.util.List<AccessReviewInstanceDecisionItem> value) {
        this.backingStore.set("decisions", value);
    }
    /**
     * Sets the definitions property value. Represents the template and scheduling for an access review.
     * @param value Value to set for the definitions property.
     */
    public void setDefinitions(@jakarta.annotation.Nullable final java.util.List<AccessReviewScheduleDefinition> value) {
        this.backingStore.set("definitions", value);
    }
    /**
     * Sets the historyDefinitions property value. Represents a collection of access review history data and the scopes used to collect that data.
     * @param value Value to set for the historyDefinitions property.
     */
    public void setHistoryDefinitions(@jakarta.annotation.Nullable final java.util.List<AccessReviewHistoryDefinition> value) {
        this.backingStore.set("historyDefinitions", value);
    }
    /**
     * Sets the policy property value. Resource that enables administrators to manage directory-level access review policies in their tenant.
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final AccessReviewPolicy value) {
        this.backingStore.set("policy", value);
    }
}
