package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewSet extends Entity implements Parsable {
    /**
     * Represents an Azure AD access review decision on an instance of a review.
     */
    private java.util.List<AccessReviewInstanceDecisionItem> decisions;
    /**
     * Represents the template and scheduling for an access review.
     */
    private java.util.List<AccessReviewScheduleDefinition> definitions;
    /**
     * Represents a collection of access review history data and the scopes used to collect that data.
     */
    private java.util.List<AccessReviewHistoryDefinition> historyDefinitions;
    /**
     * Resource that enables administrators to manage directory-level access review policies in their tenant.
     */
    private AccessReviewPolicy policy;
    /**
     * Instantiates a new accessReviewSet and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessReviewSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewSet
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewSet();
    }
    /**
     * Gets the decisions property value. Represents an Azure AD access review decision on an instance of a review.
     * @return a accessReviewInstanceDecisionItem
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewInstanceDecisionItem> getDecisions() {
        return this.decisions;
    }
    /**
     * Gets the definitions property value. Represents the template and scheduling for an access review.
     * @return a accessReviewScheduleDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewScheduleDefinition> getDefinitions() {
        return this.definitions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a accessReviewHistoryDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewHistoryDefinition> getHistoryDefinitions() {
        return this.historyDefinitions;
    }
    /**
     * Gets the policy property value. Resource that enables administrators to manage directory-level access review policies in their tenant.
     * @return a accessReviewPolicy
     */
    @jakarta.annotation.Nullable
    public AccessReviewPolicy getPolicy() {
        return this.policy;
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
        writer.writeCollectionOfObjectValues("decisions", this.getDecisions());
        writer.writeCollectionOfObjectValues("definitions", this.getDefinitions());
        writer.writeCollectionOfObjectValues("historyDefinitions", this.getHistoryDefinitions());
        writer.writeObjectValue("policy", this.getPolicy());
    }
    /**
     * Sets the decisions property value. Represents an Azure AD access review decision on an instance of a review.
     * @param value Value to set for the decisions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDecisions(@jakarta.annotation.Nullable final java.util.List<AccessReviewInstanceDecisionItem> value) {
        this.decisions = value;
    }
    /**
     * Sets the definitions property value. Represents the template and scheduling for an access review.
     * @param value Value to set for the definitions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefinitions(@jakarta.annotation.Nullable final java.util.List<AccessReviewScheduleDefinition> value) {
        this.definitions = value;
    }
    /**
     * Sets the historyDefinitions property value. Represents a collection of access review history data and the scopes used to collect that data.
     * @param value Value to set for the historyDefinitions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHistoryDefinitions(@jakarta.annotation.Nullable final java.util.List<AccessReviewHistoryDefinition> value) {
        this.historyDefinitions = value;
    }
    /**
     * Sets the policy property value. Resource that enables administrators to manage directory-level access review policies in their tenant.
     * @param value Value to set for the policy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPolicy(@jakarta.annotation.Nullable final AccessReviewPolicy value) {
        this.policy = value;
    }
}
