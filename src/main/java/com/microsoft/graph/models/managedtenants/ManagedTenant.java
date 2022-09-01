package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedTenant extends Entity implements Parsable {
    /** Aggregate view of device compliance policies across managed tenants. */
    private java.util.List<AggregatedPolicyCompliance> _aggregatedPolicyCompliances;
    /** The collection of audit events across managed tenants. */
    private java.util.List<AuditEvent> _auditEvents;
    /** The collection of cloud PC connections across managed tenants. */
    private java.util.List<CloudPcConnection> _cloudPcConnections;
    /** The collection of cloud PC devices across managed tenants. */
    private java.util.List<CloudPcDevice> _cloudPcDevices;
    /** Overview of cloud PC information across managed tenants. */
    private java.util.List<CloudPcOverview> _cloudPcsOverview;
    /** Aggregate view of conditional access policy coverage across managed tenants. */
    private java.util.List<ConditionalAccessPolicyCoverage> _conditionalAccessPolicyCoverages;
    /** Summary information for user registration for multi-factor authentication and self service password reset across managed tenants. */
    private java.util.List<CredentialUserRegistrationsSummary> _credentialUserRegistrationsSummaries;
    /** Summary information for device compliance policy setting states across managed tenants. */
    private java.util.List<DeviceCompliancePolicySettingStateSummary> _deviceCompliancePolicySettingStateSummaries;
    /** The collection of compliance for managed devices across managed tenants. */
    private java.util.List<ManagedDeviceCompliance> _managedDeviceCompliances;
    /** Trend insights for device compliance across managed tenants. */
    private java.util.List<ManagedDeviceComplianceTrend> _managedDeviceComplianceTrends;
    /** The collection of baseline management actions across managed tenants. */
    private java.util.List<ManagementAction> _managementActions;
    /** The tenant level status of management actions across managed tenants. */
    private java.util.List<ManagementActionTenantDeploymentStatus> _managementActionTenantDeploymentStatuses;
    /** The collection of baseline management intents across managed tenants. */
    private java.util.List<ManagementIntent> _managementIntents;
    /** The managementTemplateCollections property */
    private java.util.List<ManagementTemplateCollection> _managementTemplateCollections;
    /** The collection of baseline management templates across managed tenants. */
    private java.util.List<ManagementTemplate> _managementTemplates;
    /** The managementTemplateSteps property */
    private java.util.List<ManagementTemplateStep> _managementTemplateSteps;
    /** The managementTemplateStepVersions property */
    private java.util.List<ManagementTemplateStepVersion> _managementTemplateStepVersions;
    /** The collection of role assignments to a signed-in user for a managed tenant. */
    private java.util.List<MyRole> _myRoles;
    /** The collection of a logical grouping of managed tenants used by the multi-tenant management platform. */
    private java.util.List<TenantGroup> _tenantGroups;
    /** The collection of tenants associated with the managing entity. */
    private java.util.List<Tenant> _tenants;
    /** The collection of tenant level customized information across managed tenants. */
    private java.util.List<TenantCustomizedInformation> _tenantsCustomizedInformation;
    /** The collection tenant level detailed information across managed tenants. */
    private java.util.List<TenantDetailedInformation> _tenantsDetailedInformation;
    /** The collection of tenant tags across managed tenants. */
    private java.util.List<TenantTag> _tenantTags;
    /** The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants. */
    private java.util.List<WindowsDeviceMalwareState> _windowsDeviceMalwareStates;
    /** The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants. */
    private java.util.List<WindowsProtectionState> _windowsProtectionStates;
    /**
     * Instantiates a new managedTenant and sets the default values.
     * @return a void
     */
    public ManagedTenant() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managedTenant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedTenant
     */
    @javax.annotation.Nonnull
    public static ManagedTenant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenant();
    }
    /**
     * Gets the aggregatedPolicyCompliances property value. Aggregate view of device compliance policies across managed tenants.
     * @return a aggregatedPolicyCompliance
     */
    @javax.annotation.Nullable
    public java.util.List<AggregatedPolicyCompliance> getAggregatedPolicyCompliances() {
        return this._aggregatedPolicyCompliances;
    }
    /**
     * Gets the auditEvents property value. The collection of audit events across managed tenants.
     * @return a auditEvent
     */
    @javax.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this._auditEvents;
    }
    /**
     * Gets the cloudPcConnections property value. The collection of cloud PC connections across managed tenants.
     * @return a cloudPcConnection
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcConnection> getCloudPcConnections() {
        return this._cloudPcConnections;
    }
    /**
     * Gets the cloudPcDevices property value. The collection of cloud PC devices across managed tenants.
     * @return a cloudPcDevice
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcDevice> getCloudPcDevices() {
        return this._cloudPcDevices;
    }
    /**
     * Gets the cloudPcsOverview property value. Overview of cloud PC information across managed tenants.
     * @return a cloudPcOverview
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcOverview> getCloudPcsOverview() {
        return this._cloudPcsOverview;
    }
    /**
     * Gets the conditionalAccessPolicyCoverages property value. Aggregate view of conditional access policy coverage across managed tenants.
     * @return a conditionalAccessPolicyCoverage
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessPolicyCoverage> getConditionalAccessPolicyCoverages() {
        return this._conditionalAccessPolicyCoverages;
    }
    /**
     * Gets the credentialUserRegistrationsSummaries property value. Summary information for user registration for multi-factor authentication and self service password reset across managed tenants.
     * @return a credentialUserRegistrationsSummary
     */
    @javax.annotation.Nullable
    public java.util.List<CredentialUserRegistrationsSummary> getCredentialUserRegistrationsSummaries() {
        return this._credentialUserRegistrationsSummaries;
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. Summary information for device compliance policy setting states across managed tenants.
     * @return a deviceCompliancePolicySettingStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this._deviceCompliancePolicySettingStateSummaries;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedTenant currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("aggregatedPolicyCompliances", (n) -> { currentObject.setAggregatedPolicyCompliances(n.getCollectionOfObjectValues(AggregatedPolicyCompliance::createFromDiscriminatorValue)); });
            this.put("auditEvents", (n) -> { currentObject.setAuditEvents(n.getCollectionOfObjectValues(AuditEvent::createFromDiscriminatorValue)); });
            this.put("cloudPcConnections", (n) -> { currentObject.setCloudPcConnections(n.getCollectionOfObjectValues(CloudPcConnection::createFromDiscriminatorValue)); });
            this.put("cloudPcDevices", (n) -> { currentObject.setCloudPcDevices(n.getCollectionOfObjectValues(CloudPcDevice::createFromDiscriminatorValue)); });
            this.put("cloudPcsOverview", (n) -> { currentObject.setCloudPcsOverview(n.getCollectionOfObjectValues(CloudPcOverview::createFromDiscriminatorValue)); });
            this.put("conditionalAccessPolicyCoverages", (n) -> { currentObject.setConditionalAccessPolicyCoverages(n.getCollectionOfObjectValues(ConditionalAccessPolicyCoverage::createFromDiscriminatorValue)); });
            this.put("credentialUserRegistrationsSummaries", (n) -> { currentObject.setCredentialUserRegistrationsSummaries(n.getCollectionOfObjectValues(CredentialUserRegistrationsSummary::createFromDiscriminatorValue)); });
            this.put("deviceCompliancePolicySettingStateSummaries", (n) -> { currentObject.setDeviceCompliancePolicySettingStateSummaries(n.getCollectionOfObjectValues(DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue)); });
            this.put("managedDeviceCompliances", (n) -> { currentObject.setManagedDeviceCompliances(n.getCollectionOfObjectValues(ManagedDeviceCompliance::createFromDiscriminatorValue)); });
            this.put("managedDeviceComplianceTrends", (n) -> { currentObject.setManagedDeviceComplianceTrends(n.getCollectionOfObjectValues(ManagedDeviceComplianceTrend::createFromDiscriminatorValue)); });
            this.put("managementActions", (n) -> { currentObject.setManagementActions(n.getCollectionOfObjectValues(ManagementAction::createFromDiscriminatorValue)); });
            this.put("managementActionTenantDeploymentStatuses", (n) -> { currentObject.setManagementActionTenantDeploymentStatuses(n.getCollectionOfObjectValues(ManagementActionTenantDeploymentStatus::createFromDiscriminatorValue)); });
            this.put("managementIntents", (n) -> { currentObject.setManagementIntents(n.getCollectionOfObjectValues(ManagementIntent::createFromDiscriminatorValue)); });
            this.put("managementTemplateCollections", (n) -> { currentObject.setManagementTemplateCollections(n.getCollectionOfObjectValues(ManagementTemplateCollection::createFromDiscriminatorValue)); });
            this.put("managementTemplates", (n) -> { currentObject.setManagementTemplates(n.getCollectionOfObjectValues(ManagementTemplate::createFromDiscriminatorValue)); });
            this.put("managementTemplateSteps", (n) -> { currentObject.setManagementTemplateSteps(n.getCollectionOfObjectValues(ManagementTemplateStep::createFromDiscriminatorValue)); });
            this.put("managementTemplateStepVersions", (n) -> { currentObject.setManagementTemplateStepVersions(n.getCollectionOfObjectValues(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
            this.put("myRoles", (n) -> { currentObject.setMyRoles(n.getCollectionOfObjectValues(MyRole::createFromDiscriminatorValue)); });
            this.put("tenantGroups", (n) -> { currentObject.setTenantGroups(n.getCollectionOfObjectValues(TenantGroup::createFromDiscriminatorValue)); });
            this.put("tenants", (n) -> { currentObject.setTenants(n.getCollectionOfObjectValues(Tenant::createFromDiscriminatorValue)); });
            this.put("tenantsCustomizedInformation", (n) -> { currentObject.setTenantsCustomizedInformation(n.getCollectionOfObjectValues(TenantCustomizedInformation::createFromDiscriminatorValue)); });
            this.put("tenantsDetailedInformation", (n) -> { currentObject.setTenantsDetailedInformation(n.getCollectionOfObjectValues(TenantDetailedInformation::createFromDiscriminatorValue)); });
            this.put("tenantTags", (n) -> { currentObject.setTenantTags(n.getCollectionOfObjectValues(TenantTag::createFromDiscriminatorValue)); });
            this.put("windowsDeviceMalwareStates", (n) -> { currentObject.setWindowsDeviceMalwareStates(n.getCollectionOfObjectValues(WindowsDeviceMalwareState::createFromDiscriminatorValue)); });
            this.put("windowsProtectionStates", (n) -> { currentObject.setWindowsProtectionStates(n.getCollectionOfObjectValues(WindowsProtectionState::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the managedDeviceCompliances property value. The collection of compliance for managed devices across managed tenants.
     * @return a managedDeviceCompliance
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceCompliance> getManagedDeviceCompliances() {
        return this._managedDeviceCompliances;
    }
    /**
     * Gets the managedDeviceComplianceTrends property value. Trend insights for device compliance across managed tenants.
     * @return a managedDeviceComplianceTrend
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceComplianceTrend> getManagedDeviceComplianceTrends() {
        return this._managedDeviceComplianceTrends;
    }
    /**
     * Gets the managementActions property value. The collection of baseline management actions across managed tenants.
     * @return a managementAction
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementAction> getManagementActions() {
        return this._managementActions;
    }
    /**
     * Gets the managementActionTenantDeploymentStatuses property value. The tenant level status of management actions across managed tenants.
     * @return a managementActionTenantDeploymentStatus
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementActionTenantDeploymentStatus> getManagementActionTenantDeploymentStatuses() {
        return this._managementActionTenantDeploymentStatuses;
    }
    /**
     * Gets the managementIntents property value. The collection of baseline management intents across managed tenants.
     * @return a managementIntent
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementIntent> getManagementIntents() {
        return this._managementIntents;
    }
    /**
     * Gets the managementTemplateCollections property value. The managementTemplateCollections property
     * @return a managementTemplateCollection
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateCollection> getManagementTemplateCollections() {
        return this._managementTemplateCollections;
    }
    /**
     * Gets the managementTemplates property value. The collection of baseline management templates across managed tenants.
     * @return a managementTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplate> getManagementTemplates() {
        return this._managementTemplates;
    }
    /**
     * Gets the managementTemplateSteps property value. The managementTemplateSteps property
     * @return a managementTemplateStep
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateStep> getManagementTemplateSteps() {
        return this._managementTemplateSteps;
    }
    /**
     * Gets the managementTemplateStepVersions property value. The managementTemplateStepVersions property
     * @return a managementTemplateStepVersion
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateStepVersion> getManagementTemplateStepVersions() {
        return this._managementTemplateStepVersions;
    }
    /**
     * Gets the myRoles property value. The collection of role assignments to a signed-in user for a managed tenant.
     * @return a myRole
     */
    @javax.annotation.Nullable
    public java.util.List<MyRole> getMyRoles() {
        return this._myRoles;
    }
    /**
     * Gets the tenantGroups property value. The collection of a logical grouping of managed tenants used by the multi-tenant management platform.
     * @return a tenantGroup
     */
    @javax.annotation.Nullable
    public java.util.List<TenantGroup> getTenantGroups() {
        return this._tenantGroups;
    }
    /**
     * Gets the tenants property value. The collection of tenants associated with the managing entity.
     * @return a tenant
     */
    @javax.annotation.Nullable
    public java.util.List<Tenant> getTenants() {
        return this._tenants;
    }
    /**
     * Gets the tenantsCustomizedInformation property value. The collection of tenant level customized information across managed tenants.
     * @return a tenantCustomizedInformation
     */
    @javax.annotation.Nullable
    public java.util.List<TenantCustomizedInformation> getTenantsCustomizedInformation() {
        return this._tenantsCustomizedInformation;
    }
    /**
     * Gets the tenantsDetailedInformation property value. The collection tenant level detailed information across managed tenants.
     * @return a tenantDetailedInformation
     */
    @javax.annotation.Nullable
    public java.util.List<TenantDetailedInformation> getTenantsDetailedInformation() {
        return this._tenantsDetailedInformation;
    }
    /**
     * Gets the tenantTags property value. The collection of tenant tags across managed tenants.
     * @return a tenantTag
     */
    @javax.annotation.Nullable
    public java.util.List<TenantTag> getTenantTags() {
        return this._tenantTags;
    }
    /**
     * Gets the windowsDeviceMalwareStates property value. The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @return a windowsDeviceMalwareState
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsDeviceMalwareState> getWindowsDeviceMalwareStates() {
        return this._windowsDeviceMalwareStates;
    }
    /**
     * Gets the windowsProtectionStates property value. The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @return a windowsProtectionState
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsProtectionState> getWindowsProtectionStates() {
        return this._windowsProtectionStates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("aggregatedPolicyCompliances", this.getAggregatedPolicyCompliances());
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("cloudPcConnections", this.getCloudPcConnections());
        writer.writeCollectionOfObjectValues("cloudPcDevices", this.getCloudPcDevices());
        writer.writeCollectionOfObjectValues("cloudPcsOverview", this.getCloudPcsOverview());
        writer.writeCollectionOfObjectValues("conditionalAccessPolicyCoverages", this.getConditionalAccessPolicyCoverages());
        writer.writeCollectionOfObjectValues("credentialUserRegistrationsSummaries", this.getCredentialUserRegistrationsSummaries());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicySettingStateSummaries", this.getDeviceCompliancePolicySettingStateSummaries());
        writer.writeCollectionOfObjectValues("managedDeviceCompliances", this.getManagedDeviceCompliances());
        writer.writeCollectionOfObjectValues("managedDeviceComplianceTrends", this.getManagedDeviceComplianceTrends());
        writer.writeCollectionOfObjectValues("managementActions", this.getManagementActions());
        writer.writeCollectionOfObjectValues("managementActionTenantDeploymentStatuses", this.getManagementActionTenantDeploymentStatuses());
        writer.writeCollectionOfObjectValues("managementIntents", this.getManagementIntents());
        writer.writeCollectionOfObjectValues("managementTemplateCollections", this.getManagementTemplateCollections());
        writer.writeCollectionOfObjectValues("managementTemplates", this.getManagementTemplates());
        writer.writeCollectionOfObjectValues("managementTemplateSteps", this.getManagementTemplateSteps());
        writer.writeCollectionOfObjectValues("managementTemplateStepVersions", this.getManagementTemplateStepVersions());
        writer.writeCollectionOfObjectValues("myRoles", this.getMyRoles());
        writer.writeCollectionOfObjectValues("tenantGroups", this.getTenantGroups());
        writer.writeCollectionOfObjectValues("tenants", this.getTenants());
        writer.writeCollectionOfObjectValues("tenantsCustomizedInformation", this.getTenantsCustomizedInformation());
        writer.writeCollectionOfObjectValues("tenantsDetailedInformation", this.getTenantsDetailedInformation());
        writer.writeCollectionOfObjectValues("tenantTags", this.getTenantTags());
        writer.writeCollectionOfObjectValues("windowsDeviceMalwareStates", this.getWindowsDeviceMalwareStates());
        writer.writeCollectionOfObjectValues("windowsProtectionStates", this.getWindowsProtectionStates());
    }
    /**
     * Sets the aggregatedPolicyCompliances property value. Aggregate view of device compliance policies across managed tenants.
     * @param value Value to set for the aggregatedPolicyCompliances property.
     * @return a void
     */
    public void setAggregatedPolicyCompliances(@javax.annotation.Nullable final java.util.List<AggregatedPolicyCompliance> value) {
        this._aggregatedPolicyCompliances = value;
    }
    /**
     * Sets the auditEvents property value. The collection of audit events across managed tenants.
     * @param value Value to set for the auditEvents property.
     * @return a void
     */
    public void setAuditEvents(@javax.annotation.Nullable final java.util.List<AuditEvent> value) {
        this._auditEvents = value;
    }
    /**
     * Sets the cloudPcConnections property value. The collection of cloud PC connections across managed tenants.
     * @param value Value to set for the cloudPcConnections property.
     * @return a void
     */
    public void setCloudPcConnections(@javax.annotation.Nullable final java.util.List<CloudPcConnection> value) {
        this._cloudPcConnections = value;
    }
    /**
     * Sets the cloudPcDevices property value. The collection of cloud PC devices across managed tenants.
     * @param value Value to set for the cloudPcDevices property.
     * @return a void
     */
    public void setCloudPcDevices(@javax.annotation.Nullable final java.util.List<CloudPcDevice> value) {
        this._cloudPcDevices = value;
    }
    /**
     * Sets the cloudPcsOverview property value. Overview of cloud PC information across managed tenants.
     * @param value Value to set for the cloudPcsOverview property.
     * @return a void
     */
    public void setCloudPcsOverview(@javax.annotation.Nullable final java.util.List<CloudPcOverview> value) {
        this._cloudPcsOverview = value;
    }
    /**
     * Sets the conditionalAccessPolicyCoverages property value. Aggregate view of conditional access policy coverage across managed tenants.
     * @param value Value to set for the conditionalAccessPolicyCoverages property.
     * @return a void
     */
    public void setConditionalAccessPolicyCoverages(@javax.annotation.Nullable final java.util.List<ConditionalAccessPolicyCoverage> value) {
        this._conditionalAccessPolicyCoverages = value;
    }
    /**
     * Sets the credentialUserRegistrationsSummaries property value. Summary information for user registration for multi-factor authentication and self service password reset across managed tenants.
     * @param value Value to set for the credentialUserRegistrationsSummaries property.
     * @return a void
     */
    public void setCredentialUserRegistrationsSummaries(@javax.annotation.Nullable final java.util.List<CredentialUserRegistrationsSummary> value) {
        this._credentialUserRegistrationsSummaries = value;
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. Summary information for device compliance policy setting states across managed tenants.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     * @return a void
     */
    public void setDeviceCompliancePolicySettingStateSummaries(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this._deviceCompliancePolicySettingStateSummaries = value;
    }
    /**
     * Sets the managedDeviceCompliances property value. The collection of compliance for managed devices across managed tenants.
     * @param value Value to set for the managedDeviceCompliances property.
     * @return a void
     */
    public void setManagedDeviceCompliances(@javax.annotation.Nullable final java.util.List<ManagedDeviceCompliance> value) {
        this._managedDeviceCompliances = value;
    }
    /**
     * Sets the managedDeviceComplianceTrends property value. Trend insights for device compliance across managed tenants.
     * @param value Value to set for the managedDeviceComplianceTrends property.
     * @return a void
     */
    public void setManagedDeviceComplianceTrends(@javax.annotation.Nullable final java.util.List<ManagedDeviceComplianceTrend> value) {
        this._managedDeviceComplianceTrends = value;
    }
    /**
     * Sets the managementActions property value. The collection of baseline management actions across managed tenants.
     * @param value Value to set for the managementActions property.
     * @return a void
     */
    public void setManagementActions(@javax.annotation.Nullable final java.util.List<ManagementAction> value) {
        this._managementActions = value;
    }
    /**
     * Sets the managementActionTenantDeploymentStatuses property value. The tenant level status of management actions across managed tenants.
     * @param value Value to set for the managementActionTenantDeploymentStatuses property.
     * @return a void
     */
    public void setManagementActionTenantDeploymentStatuses(@javax.annotation.Nullable final java.util.List<ManagementActionTenantDeploymentStatus> value) {
        this._managementActionTenantDeploymentStatuses = value;
    }
    /**
     * Sets the managementIntents property value. The collection of baseline management intents across managed tenants.
     * @param value Value to set for the managementIntents property.
     * @return a void
     */
    public void setManagementIntents(@javax.annotation.Nullable final java.util.List<ManagementIntent> value) {
        this._managementIntents = value;
    }
    /**
     * Sets the managementTemplateCollections property value. The managementTemplateCollections property
     * @param value Value to set for the managementTemplateCollections property.
     * @return a void
     */
    public void setManagementTemplateCollections(@javax.annotation.Nullable final java.util.List<ManagementTemplateCollection> value) {
        this._managementTemplateCollections = value;
    }
    /**
     * Sets the managementTemplates property value. The collection of baseline management templates across managed tenants.
     * @param value Value to set for the managementTemplates property.
     * @return a void
     */
    public void setManagementTemplates(@javax.annotation.Nullable final java.util.List<ManagementTemplate> value) {
        this._managementTemplates = value;
    }
    /**
     * Sets the managementTemplateSteps property value. The managementTemplateSteps property
     * @param value Value to set for the managementTemplateSteps property.
     * @return a void
     */
    public void setManagementTemplateSteps(@javax.annotation.Nullable final java.util.List<ManagementTemplateStep> value) {
        this._managementTemplateSteps = value;
    }
    /**
     * Sets the managementTemplateStepVersions property value. The managementTemplateStepVersions property
     * @param value Value to set for the managementTemplateStepVersions property.
     * @return a void
     */
    public void setManagementTemplateStepVersions(@javax.annotation.Nullable final java.util.List<ManagementTemplateStepVersion> value) {
        this._managementTemplateStepVersions = value;
    }
    /**
     * Sets the myRoles property value. The collection of role assignments to a signed-in user for a managed tenant.
     * @param value Value to set for the myRoles property.
     * @return a void
     */
    public void setMyRoles(@javax.annotation.Nullable final java.util.List<MyRole> value) {
        this._myRoles = value;
    }
    /**
     * Sets the tenantGroups property value. The collection of a logical grouping of managed tenants used by the multi-tenant management platform.
     * @param value Value to set for the tenantGroups property.
     * @return a void
     */
    public void setTenantGroups(@javax.annotation.Nullable final java.util.List<TenantGroup> value) {
        this._tenantGroups = value;
    }
    /**
     * Sets the tenants property value. The collection of tenants associated with the managing entity.
     * @param value Value to set for the tenants property.
     * @return a void
     */
    public void setTenants(@javax.annotation.Nullable final java.util.List<Tenant> value) {
        this._tenants = value;
    }
    /**
     * Sets the tenantsCustomizedInformation property value. The collection of tenant level customized information across managed tenants.
     * @param value Value to set for the tenantsCustomizedInformation property.
     * @return a void
     */
    public void setTenantsCustomizedInformation(@javax.annotation.Nullable final java.util.List<TenantCustomizedInformation> value) {
        this._tenantsCustomizedInformation = value;
    }
    /**
     * Sets the tenantsDetailedInformation property value. The collection tenant level detailed information across managed tenants.
     * @param value Value to set for the tenantsDetailedInformation property.
     * @return a void
     */
    public void setTenantsDetailedInformation(@javax.annotation.Nullable final java.util.List<TenantDetailedInformation> value) {
        this._tenantsDetailedInformation = value;
    }
    /**
     * Sets the tenantTags property value. The collection of tenant tags across managed tenants.
     * @param value Value to set for the tenantTags property.
     * @return a void
     */
    public void setTenantTags(@javax.annotation.Nullable final java.util.List<TenantTag> value) {
        this._tenantTags = value;
    }
    /**
     * Sets the windowsDeviceMalwareStates property value. The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @param value Value to set for the windowsDeviceMalwareStates property.
     * @return a void
     */
    public void setWindowsDeviceMalwareStates(@javax.annotation.Nullable final java.util.List<WindowsDeviceMalwareState> value) {
        this._windowsDeviceMalwareStates = value;
    }
    /**
     * Sets the windowsProtectionStates property value. The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @param value Value to set for the windowsProtectionStates property.
     * @return a void
     */
    public void setWindowsProtectionStates(@javax.annotation.Nullable final java.util.List<WindowsProtectionState> value) {
        this._windowsProtectionStates = value;
    }
}
