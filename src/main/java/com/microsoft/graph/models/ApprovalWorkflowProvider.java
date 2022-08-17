package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of approvalWorkflowProvider entities. */
public class ApprovalWorkflowProvider extends Entity implements Parsable {
    /** The businessFlows property */
    private java.util.List<BusinessFlow> _businessFlows;
    /** The businessFlowsWithRequestsAwaitingMyDecision property */
    private java.util.List<BusinessFlow> _businessFlowsWithRequestsAwaitingMyDecision;
    /** The displayName property */
    private String _displayName;
    /** The policyTemplates property */
    private java.util.List<GovernancePolicyTemplate> _policyTemplates;
    /**
     * Instantiates a new approvalWorkflowProvider and sets the default values.
     * @return a void
     */
    public ApprovalWorkflowProvider() {
        super();
        this.setOdataType("#microsoft.graph.approvalWorkflowProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approvalWorkflowProvider
     */
    @javax.annotation.Nonnull
    public static ApprovalWorkflowProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalWorkflowProvider();
    }
    /**
     * Gets the businessFlows property value. The businessFlows property
     * @return a businessFlow
     */
    @javax.annotation.Nullable
    public java.util.List<BusinessFlow> getBusinessFlows() {
        return this._businessFlows;
    }
    /**
     * Gets the businessFlowsWithRequestsAwaitingMyDecision property value. The businessFlowsWithRequestsAwaitingMyDecision property
     * @return a businessFlow
     */
    @javax.annotation.Nullable
    public java.util.List<BusinessFlow> getBusinessFlowsWithRequestsAwaitingMyDecision() {
        return this._businessFlowsWithRequestsAwaitingMyDecision;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApprovalWorkflowProvider currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("businessFlows", (n) -> { currentObject.setBusinessFlows(n.getCollectionOfObjectValues(BusinessFlow::createFromDiscriminatorValue)); });
            this.put("businessFlowsWithRequestsAwaitingMyDecision", (n) -> { currentObject.setBusinessFlowsWithRequestsAwaitingMyDecision(n.getCollectionOfObjectValues(BusinessFlow::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("policyTemplates", (n) -> { currentObject.setPolicyTemplates(n.getCollectionOfObjectValues(GovernancePolicyTemplate::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the policyTemplates property value. The policyTemplates property
     * @return a governancePolicyTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<GovernancePolicyTemplate> getPolicyTemplates() {
        return this._policyTemplates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setBusinessFlows(@javax.annotation.Nullable final java.util.List<BusinessFlow> value) {
        this._businessFlows = value;
    }
    /**
     * Sets the businessFlowsWithRequestsAwaitingMyDecision property value. The businessFlowsWithRequestsAwaitingMyDecision property
     * @param value Value to set for the businessFlowsWithRequestsAwaitingMyDecision property.
     * @return a void
     */
    public void setBusinessFlowsWithRequestsAwaitingMyDecision(@javax.annotation.Nullable final java.util.List<BusinessFlow> value) {
        this._businessFlowsWithRequestsAwaitingMyDecision = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the policyTemplates property value. The policyTemplates property
     * @param value Value to set for the policyTemplates property.
     * @return a void
     */
    public void setPolicyTemplates(@javax.annotation.Nullable final java.util.List<GovernancePolicyTemplate> value) {
        this._policyTemplates = value;
    }
}
