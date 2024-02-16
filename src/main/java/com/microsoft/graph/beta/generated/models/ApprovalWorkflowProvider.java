package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalWorkflowProvider extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApprovalWorkflowProvider} and sets the default values.
     */
    public ApprovalWorkflowProvider() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApprovalWorkflowProvider}
     */
    @jakarta.annotation.Nonnull
    public static ApprovalWorkflowProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalWorkflowProvider();
    }
    /**
     * Gets the businessFlows property value. The businessFlows property
     * @return a {@link java.util.List<BusinessFlow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BusinessFlow> getBusinessFlows() {
        return this.backingStore.get("businessFlows");
    }
    /**
     * Gets the businessFlowsWithRequestsAwaitingMyDecision property value. The businessFlowsWithRequestsAwaitingMyDecision property
     * @return a {@link java.util.List<BusinessFlow>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BusinessFlow> getBusinessFlowsWithRequestsAwaitingMyDecision() {
        return this.backingStore.get("businessFlowsWithRequestsAwaitingMyDecision");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("businessFlows", (n) -> { this.setBusinessFlows(n.getCollectionOfObjectValues(BusinessFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("businessFlowsWithRequestsAwaitingMyDecision", (n) -> { this.setBusinessFlowsWithRequestsAwaitingMyDecision(n.getCollectionOfObjectValues(BusinessFlow::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("policyTemplates", (n) -> { this.setPolicyTemplates(n.getCollectionOfObjectValues(GovernancePolicyTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policyTemplates property value. The policyTemplates property
     * @return a {@link java.util.List<GovernancePolicyTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernancePolicyTemplate> getPolicyTemplates() {
        return this.backingStore.get("policyTemplates");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("businessFlows", this.getBusinessFlows());
        writer.writeCollectionOfObjectValues("businessFlowsWithRequestsAwaitingMyDecision", this.getBusinessFlowsWithRequestsAwaitingMyDecision());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("policyTemplates", this.getPolicyTemplates());
    }
    /**
     * Sets the businessFlows property value. The businessFlows property
     * @param value Value to set for the businessFlows property.
     */
    public void setBusinessFlows(@jakarta.annotation.Nullable final java.util.List<BusinessFlow> value) {
        this.backingStore.set("businessFlows", value);
    }
    /**
     * Sets the businessFlowsWithRequestsAwaitingMyDecision property value. The businessFlowsWithRequestsAwaitingMyDecision property
     * @param value Value to set for the businessFlowsWithRequestsAwaitingMyDecision property.
     */
    public void setBusinessFlowsWithRequestsAwaitingMyDecision(@jakarta.annotation.Nullable final java.util.List<BusinessFlow> value) {
        this.backingStore.set("businessFlowsWithRequestsAwaitingMyDecision", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the policyTemplates property value. The policyTemplates property
     * @param value Value to set for the policyTemplates property.
     */
    public void setPolicyTemplates(@jakarta.annotation.Nullable final java.util.List<GovernancePolicyTemplate> value) {
        this.backingStore.set("policyTemplates", value);
    }
}
