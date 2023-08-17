package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApprovalWorkflowProvider extends Entity implements Parsable {
    /**
     * The businessFlows property
     */
    private java.util.List<BusinessFlow> businessFlows;
    /**
     * The businessFlowsWithRequestsAwaitingMyDecision property
     */
    private java.util.List<BusinessFlow> businessFlowsWithRequestsAwaitingMyDecision;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The policyTemplates property
     */
    private java.util.List<GovernancePolicyTemplate> policyTemplates;
    /**
     * Instantiates a new approvalWorkflowProvider and sets the default values.
     */
    public ApprovalWorkflowProvider() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approvalWorkflowProvider
     */
    @jakarta.annotation.Nonnull
    public static ApprovalWorkflowProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalWorkflowProvider();
    }
    /**
     * Gets the businessFlows property value. The businessFlows property
     * @return a businessFlow
     */
    @jakarta.annotation.Nullable
    public java.util.List<BusinessFlow> getBusinessFlows() {
        return this.businessFlows;
    }
    /**
     * Gets the businessFlowsWithRequestsAwaitingMyDecision property value. The businessFlowsWithRequestsAwaitingMyDecision property
     * @return a businessFlow
     */
    @jakarta.annotation.Nullable
    public java.util.List<BusinessFlow> getBusinessFlowsWithRequestsAwaitingMyDecision() {
        return this.businessFlowsWithRequestsAwaitingMyDecision;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a governancePolicyTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernancePolicyTemplate> getPolicyTemplates() {
        return this.policyTemplates;
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
        this.businessFlows = value;
    }
    /**
     * Sets the businessFlowsWithRequestsAwaitingMyDecision property value. The businessFlowsWithRequestsAwaitingMyDecision property
     * @param value Value to set for the businessFlowsWithRequestsAwaitingMyDecision property.
     */
    public void setBusinessFlowsWithRequestsAwaitingMyDecision(@jakarta.annotation.Nullable final java.util.List<BusinessFlow> value) {
        this.businessFlowsWithRequestsAwaitingMyDecision = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the policyTemplates property value. The policyTemplates property
     * @param value Value to set for the policyTemplates property.
     */
    public void setPolicyTemplates(@jakarta.annotation.Nullable final java.util.List<GovernancePolicyTemplate> value) {
        this.policyTemplates = value;
    }
}
