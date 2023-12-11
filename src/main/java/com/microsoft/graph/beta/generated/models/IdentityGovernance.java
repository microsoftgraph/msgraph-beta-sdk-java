package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.identitygovernance.LifecycleWorkflowsContainer;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityGovernance implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new IdentityGovernance and sets the default values.
     */
    public IdentityGovernance() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentityGovernance
     */
    @jakarta.annotation.Nonnull
    public static IdentityGovernance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityGovernance();
    }
    /**
     * Gets the accessReviews property value. The accessReviews property
     * @return a AccessReviewSet
     */
    @jakarta.annotation.Nullable
    public AccessReviewSet getAccessReviews() {
        return this.backingStore.get("accessReviews");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the appConsent property value. The appConsent property
     * @return a AppConsentApprovalRoute
     */
    @jakarta.annotation.Nullable
    public AppConsentApprovalRoute getAppConsent() {
        return this.backingStore.get("appConsent");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the entitlementManagement property value. The entitlementManagement property
     * @return a EntitlementManagement
     */
    @jakarta.annotation.Nullable
    public EntitlementManagement getEntitlementManagement() {
        return this.backingStore.get("entitlementManagement");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("accessReviews", (n) -> { this.setAccessReviews(n.getObjectValue(AccessReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("appConsent", (n) -> { this.setAppConsent(n.getObjectValue(AppConsentApprovalRoute::createFromDiscriminatorValue)); });
        deserializerMap.put("entitlementManagement", (n) -> { this.setEntitlementManagement(n.getObjectValue(EntitlementManagement::createFromDiscriminatorValue)); });
        deserializerMap.put("lifecycleWorkflows", (n) -> { this.setLifecycleWorkflows(n.getObjectValue(LifecycleWorkflowsContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permissionsAnalytics", (n) -> { this.setPermissionsAnalytics(n.getObjectValue(PermissionsAnalyticsAggregation::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsManagement", (n) -> { this.setPermissionsManagement(n.getObjectValue(PermissionsManagement::createFromDiscriminatorValue)); });
        deserializerMap.put("privilegedAccess", (n) -> { this.setPrivilegedAccess(n.getObjectValue(PrivilegedAccessRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("roleManagementAlerts", (n) -> { this.setRoleManagementAlerts(n.getObjectValue(RoleManagementAlert::createFromDiscriminatorValue)); });
        deserializerMap.put("termsOfUse", (n) -> { this.setTermsOfUse(n.getObjectValue(TermsOfUseContainer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lifecycleWorkflows property value. The lifecycleWorkflows property
     * @return a LifecycleWorkflowsContainer
     */
    @jakarta.annotation.Nullable
    public LifecycleWorkflowsContainer getLifecycleWorkflows() {
        return this.backingStore.get("lifecycleWorkflows");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the permissionsAnalytics property value. The permissionsAnalytics property
     * @return a PermissionsAnalyticsAggregation
     */
    @jakarta.annotation.Nullable
    public PermissionsAnalyticsAggregation getPermissionsAnalytics() {
        return this.backingStore.get("permissionsAnalytics");
    }
    /**
     * Gets the permissionsManagement property value. The permissionsManagement property
     * @return a PermissionsManagement
     */
    @jakarta.annotation.Nullable
    public PermissionsManagement getPermissionsManagement() {
        return this.backingStore.get("permissionsManagement");
    }
    /**
     * Gets the privilegedAccess property value. The privilegedAccess property
     * @return a PrivilegedAccessRoot
     */
    @jakarta.annotation.Nullable
    public PrivilegedAccessRoot getPrivilegedAccess() {
        return this.backingStore.get("privilegedAccess");
    }
    /**
     * Gets the roleManagementAlerts property value. The roleManagementAlerts property
     * @return a RoleManagementAlert
     */
    @jakarta.annotation.Nullable
    public RoleManagementAlert getRoleManagementAlerts() {
        return this.backingStore.get("roleManagementAlerts");
    }
    /**
     * Gets the termsOfUse property value. The termsOfUse property
     * @return a TermsOfUseContainer
     */
    @jakarta.annotation.Nullable
    public TermsOfUseContainer getTermsOfUse() {
        return this.backingStore.get("termsOfUse");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accessReviews", this.getAccessReviews());
        writer.writeObjectValue("appConsent", this.getAppConsent());
        writer.writeObjectValue("entitlementManagement", this.getEntitlementManagement());
        writer.writeObjectValue("lifecycleWorkflows", this.getLifecycleWorkflows());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("permissionsAnalytics", this.getPermissionsAnalytics());
        writer.writeObjectValue("permissionsManagement", this.getPermissionsManagement());
        writer.writeObjectValue("privilegedAccess", this.getPrivilegedAccess());
        writer.writeObjectValue("roleManagementAlerts", this.getRoleManagementAlerts());
        writer.writeObjectValue("termsOfUse", this.getTermsOfUse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessReviews property value. The accessReviews property
     * @param value Value to set for the accessReviews property.
     */
    public void setAccessReviews(@jakarta.annotation.Nullable final AccessReviewSet value) {
        this.backingStore.set("accessReviews", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the appConsent property value. The appConsent property
     * @param value Value to set for the appConsent property.
     */
    public void setAppConsent(@jakarta.annotation.Nullable final AppConsentApprovalRoute value) {
        this.backingStore.set("appConsent", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the entitlementManagement property value. The entitlementManagement property
     * @param value Value to set for the entitlementManagement property.
     */
    public void setEntitlementManagement(@jakarta.annotation.Nullable final EntitlementManagement value) {
        this.backingStore.set("entitlementManagement", value);
    }
    /**
     * Sets the lifecycleWorkflows property value. The lifecycleWorkflows property
     * @param value Value to set for the lifecycleWorkflows property.
     */
    public void setLifecycleWorkflows(@jakarta.annotation.Nullable final LifecycleWorkflowsContainer value) {
        this.backingStore.set("lifecycleWorkflows", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the permissionsAnalytics property value. The permissionsAnalytics property
     * @param value Value to set for the permissionsAnalytics property.
     */
    public void setPermissionsAnalytics(@jakarta.annotation.Nullable final PermissionsAnalyticsAggregation value) {
        this.backingStore.set("permissionsAnalytics", value);
    }
    /**
     * Sets the permissionsManagement property value. The permissionsManagement property
     * @param value Value to set for the permissionsManagement property.
     */
    public void setPermissionsManagement(@jakarta.annotation.Nullable final PermissionsManagement value) {
        this.backingStore.set("permissionsManagement", value);
    }
    /**
     * Sets the privilegedAccess property value. The privilegedAccess property
     * @param value Value to set for the privilegedAccess property.
     */
    public void setPrivilegedAccess(@jakarta.annotation.Nullable final PrivilegedAccessRoot value) {
        this.backingStore.set("privilegedAccess", value);
    }
    /**
     * Sets the roleManagementAlerts property value. The roleManagementAlerts property
     * @param value Value to set for the roleManagementAlerts property.
     */
    public void setRoleManagementAlerts(@jakarta.annotation.Nullable final RoleManagementAlert value) {
        this.backingStore.set("roleManagementAlerts", value);
    }
    /**
     * Sets the termsOfUse property value. The termsOfUse property
     * @param value Value to set for the termsOfUse property.
     */
    public void setTermsOfUse(@jakarta.annotation.Nullable final TermsOfUseContainer value) {
        this.backingStore.set("termsOfUse", value);
    }
}
