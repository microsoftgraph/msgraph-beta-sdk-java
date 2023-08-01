package com.microsoft.graph.models;

import com.microsoft.graph.models.identitygovernance.LifecycleWorkflowsContainer;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentityGovernance implements AdditionalDataHolder, Parsable {
    /**
     * The accessReviews property
     */
    private AccessReviewSet accessReviews;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The appConsent property
     */
    private AppConsentApprovalRoute appConsent;
    /**
     * The entitlementManagement property
     */
    private EntitlementManagement entitlementManagement;
    /**
     * The lifecycleWorkflows property
     */
    private LifecycleWorkflowsContainer lifecycleWorkflows;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The privilegedAccess property
     */
    private PrivilegedAccessRoot privilegedAccess;
    /**
     * The roleManagementAlerts property
     */
    private RoleManagementAlert roleManagementAlerts;
    /**
     * The termsOfUse property
     */
    private TermsOfUseContainer termsOfUse;
    /**
     * Instantiates a new identityGovernance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentityGovernance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a identityGovernance
     */
    @javax.annotation.Nonnull
    public static IdentityGovernance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityGovernance();
    }
    /**
     * Gets the accessReviews property value. The accessReviews property
     * @return a accessReviewSet
     */
    @javax.annotation.Nullable
    public AccessReviewSet getAccessReviews() {
        return this.accessReviews;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the appConsent property value. The appConsent property
     * @return a appConsentApprovalRoute
     */
    @javax.annotation.Nullable
    public AppConsentApprovalRoute getAppConsent() {
        return this.appConsent;
    }
    /**
     * Gets the entitlementManagement property value. The entitlementManagement property
     * @return a entitlementManagement
     */
    @javax.annotation.Nullable
    public EntitlementManagement getEntitlementManagement() {
        return this.entitlementManagement;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("accessReviews", (n) -> { this.setAccessReviews(n.getObjectValue(AccessReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("appConsent", (n) -> { this.setAppConsent(n.getObjectValue(AppConsentApprovalRoute::createFromDiscriminatorValue)); });
        deserializerMap.put("entitlementManagement", (n) -> { this.setEntitlementManagement(n.getObjectValue(EntitlementManagement::createFromDiscriminatorValue)); });
        deserializerMap.put("lifecycleWorkflows", (n) -> { this.setLifecycleWorkflows(n.getObjectValue(LifecycleWorkflowsContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("privilegedAccess", (n) -> { this.setPrivilegedAccess(n.getObjectValue(PrivilegedAccessRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("roleManagementAlerts", (n) -> { this.setRoleManagementAlerts(n.getObjectValue(RoleManagementAlert::createFromDiscriminatorValue)); });
        deserializerMap.put("termsOfUse", (n) -> { this.setTermsOfUse(n.getObjectValue(TermsOfUseContainer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lifecycleWorkflows property value. The lifecycleWorkflows property
     * @return a lifecycleWorkflowsContainer
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowsContainer getLifecycleWorkflows() {
        return this.lifecycleWorkflows;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the privilegedAccess property value. The privilegedAccess property
     * @return a privilegedAccessRoot
     */
    @javax.annotation.Nullable
    public PrivilegedAccessRoot getPrivilegedAccess() {
        return this.privilegedAccess;
    }
    /**
     * Gets the roleManagementAlerts property value. The roleManagementAlerts property
     * @return a roleManagementAlert
     */
    @javax.annotation.Nullable
    public RoleManagementAlert getRoleManagementAlerts() {
        return this.roleManagementAlerts;
    }
    /**
     * Gets the termsOfUse property value. The termsOfUse property
     * @return a termsOfUseContainer
     */
    @javax.annotation.Nullable
    public TermsOfUseContainer getTermsOfUse() {
        return this.termsOfUse;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accessReviews", this.getAccessReviews());
        writer.writeObjectValue("appConsent", this.getAppConsent());
        writer.writeObjectValue("entitlementManagement", this.getEntitlementManagement());
        writer.writeObjectValue("lifecycleWorkflows", this.getLifecycleWorkflows());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("privilegedAccess", this.getPrivilegedAccess());
        writer.writeObjectValue("roleManagementAlerts", this.getRoleManagementAlerts());
        writer.writeObjectValue("termsOfUse", this.getTermsOfUse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessReviews property value. The accessReviews property
     * @param value Value to set for the accessReviews property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessReviews(@javax.annotation.Nullable final AccessReviewSet value) {
        this.accessReviews = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appConsent property value. The appConsent property
     * @param value Value to set for the appConsent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppConsent(@javax.annotation.Nullable final AppConsentApprovalRoute value) {
        this.appConsent = value;
    }
    /**
     * Sets the entitlementManagement property value. The entitlementManagement property
     * @param value Value to set for the entitlementManagement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEntitlementManagement(@javax.annotation.Nullable final EntitlementManagement value) {
        this.entitlementManagement = value;
    }
    /**
     * Sets the lifecycleWorkflows property value. The lifecycleWorkflows property
     * @param value Value to set for the lifecycleWorkflows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLifecycleWorkflows(@javax.annotation.Nullable final LifecycleWorkflowsContainer value) {
        this.lifecycleWorkflows = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the privilegedAccess property value. The privilegedAccess property
     * @param value Value to set for the privilegedAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivilegedAccess(@javax.annotation.Nullable final PrivilegedAccessRoot value) {
        this.privilegedAccess = value;
    }
    /**
     * Sets the roleManagementAlerts property value. The roleManagementAlerts property
     * @param value Value to set for the roleManagementAlerts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleManagementAlerts(@javax.annotation.Nullable final RoleManagementAlert value) {
        this.roleManagementAlerts = value;
    }
    /**
     * Sets the termsOfUse property value. The termsOfUse property
     * @param value Value to set for the termsOfUse property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTermsOfUse(@javax.annotation.Nullable final TermsOfUseContainer value) {
        this.termsOfUse = value;
    }
}
