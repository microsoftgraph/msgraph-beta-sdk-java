package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedTenant extends Entity implements Parsable {
    /**
     * Aggregate view of device compliance policies across managed tenants.
     */
    private java.util.List<AggregatedPolicyCompliance> aggregatedPolicyCompliances;
    /**
     * The appPerformances property
     */
    private java.util.List<AppPerformance> appPerformances;
    /**
     * The collection of audit events across managed tenants.
     */
    private java.util.List<AuditEvent> auditEvents;
    /**
     * The collection of cloud PC connections across managed tenants.
     */
    private java.util.List<CloudPcConnection> cloudPcConnections;
    /**
     * The collection of cloud PC devices across managed tenants.
     */
    private java.util.List<CloudPcDevice> cloudPcDevices;
    /**
     * Overview of cloud PC information across managed tenants.
     */
    private java.util.List<CloudPcOverview> cloudPcsOverview;
    /**
     * Aggregate view of conditional access policy coverage across managed tenants.
     */
    private java.util.List<ConditionalAccessPolicyCoverage> conditionalAccessPolicyCoverages;
    /**
     * Summary information for user registration for multi-factor authentication and self service password reset across managed tenants.
     */
    private java.util.List<CredentialUserRegistrationsSummary> credentialUserRegistrationsSummaries;
    /**
     * The deviceAppPerformances property
     */
    private java.util.List<DeviceAppPerformance> deviceAppPerformances;
    /**
     * Summary information for device compliance policy setting states across managed tenants.
     */
    private java.util.List<DeviceCompliancePolicySettingStateSummary> deviceCompliancePolicySettingStateSummaries;
    /**
     * The deviceHealthStatuses property
     */
    private java.util.List<DeviceHealthStatus> deviceHealthStatuses;
    /**
     * The collection of compliance for managed devices across managed tenants.
     */
    private java.util.List<ManagedDeviceCompliance> managedDeviceCompliances;
    /**
     * Trend insights for device compliance across managed tenants.
     */
    private java.util.List<ManagedDeviceComplianceTrend> managedDeviceComplianceTrends;
    /**
     * The managedTenantAlertLogs property
     */
    private java.util.List<ManagedTenantAlertLog> managedTenantAlertLogs;
    /**
     * The managedTenantAlertRuleDefinitions property
     */
    private java.util.List<ManagedTenantAlertRuleDefinition> managedTenantAlertRuleDefinitions;
    /**
     * The managedTenantAlertRules property
     */
    private java.util.List<ManagedTenantAlertRule> managedTenantAlertRules;
    /**
     * The managedTenantAlerts property
     */
    private java.util.List<ManagedTenantAlert> managedTenantAlerts;
    /**
     * The managedTenantApiNotifications property
     */
    private java.util.List<ManagedTenantApiNotification> managedTenantApiNotifications;
    /**
     * The managedTenantEmailNotifications property
     */
    private java.util.List<ManagedTenantEmailNotification> managedTenantEmailNotifications;
    /**
     * The managedTenantTicketingEndpoints property
     */
    private java.util.List<ManagedTenantTicketingEndpoint> managedTenantTicketingEndpoints;
    /**
     * The collection of baseline management actions across managed tenants.
     */
    private java.util.List<ManagementAction> managementActions;
    /**
     * The tenant level status of management actions across managed tenants.
     */
    private java.util.List<ManagementActionTenantDeploymentStatus> managementActionTenantDeploymentStatuses;
    /**
     * The collection of baseline management intents across managed tenants.
     */
    private java.util.List<ManagementIntent> managementIntents;
    /**
     * The managementTemplateCollections property
     */
    private java.util.List<ManagementTemplateCollection> managementTemplateCollections;
    /**
     * The managementTemplateCollectionTenantSummaries property
     */
    private java.util.List<ManagementTemplateCollectionTenantSummary> managementTemplateCollectionTenantSummaries;
    /**
     * The collection of baseline management templates across managed tenants.
     */
    private java.util.List<ManagementTemplate> managementTemplates;
    /**
     * The managementTemplateSteps property
     */
    private java.util.List<ManagementTemplateStep> managementTemplateSteps;
    /**
     * The managementTemplateStepTenantSummaries property
     */
    private java.util.List<ManagementTemplateStepTenantSummary> managementTemplateStepTenantSummaries;
    /**
     * The managementTemplateStepVersions property
     */
    private java.util.List<ManagementTemplateStepVersion> managementTemplateStepVersions;
    /**
     * The collection of role assignments to a signed-in user for a managed tenant.
     */
    private java.util.List<MyRole> myRoles;
    /**
     * The collection of a logical grouping of managed tenants used by the multi-tenant management platform.
     */
    private java.util.List<TenantGroup> tenantGroups;
    /**
     * The collection of tenants associated with the managing entity.
     */
    private java.util.List<Tenant> tenants;
    /**
     * The collection of tenant level customized information across managed tenants.
     */
    private java.util.List<TenantCustomizedInformation> tenantsCustomizedInformation;
    /**
     * The collection tenant level detailed information across managed tenants.
     */
    private java.util.List<TenantDetailedInformation> tenantsDetailedInformation;
    /**
     * The collection of tenant tags across managed tenants.
     */
    private java.util.List<TenantTag> tenantTags;
    /**
     * The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     */
    private java.util.List<WindowsDeviceMalwareState> windowsDeviceMalwareStates;
    /**
     * The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     */
    private java.util.List<WindowsProtectionState> windowsProtectionStates;
    /**
     * Instantiates a new managedTenant and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagedTenant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedTenant
     */
    @jakarta.annotation.Nonnull
    public static ManagedTenant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenant();
    }
    /**
     * Gets the aggregatedPolicyCompliances property value. Aggregate view of device compliance policies across managed tenants.
     * @return a aggregatedPolicyCompliance
     */
    @jakarta.annotation.Nullable
    public java.util.List<AggregatedPolicyCompliance> getAggregatedPolicyCompliances() {
        return this.aggregatedPolicyCompliances;
    }
    /**
     * Gets the appPerformances property value. The appPerformances property
     * @return a appPerformance
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppPerformance> getAppPerformances() {
        return this.appPerformances;
    }
    /**
     * Gets the auditEvents property value. The collection of audit events across managed tenants.
     * @return a auditEvent
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this.auditEvents;
    }
    /**
     * Gets the cloudPcConnections property value. The collection of cloud PC connections across managed tenants.
     * @return a cloudPcConnection
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcConnection> getCloudPcConnections() {
        return this.cloudPcConnections;
    }
    /**
     * Gets the cloudPcDevices property value. The collection of cloud PC devices across managed tenants.
     * @return a cloudPcDevice
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcDevice> getCloudPcDevices() {
        return this.cloudPcDevices;
    }
    /**
     * Gets the cloudPcsOverview property value. Overview of cloud PC information across managed tenants.
     * @return a cloudPcOverview
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcOverview> getCloudPcsOverview() {
        return this.cloudPcsOverview;
    }
    /**
     * Gets the conditionalAccessPolicyCoverages property value. Aggregate view of conditional access policy coverage across managed tenants.
     * @return a conditionalAccessPolicyCoverage
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicyCoverage> getConditionalAccessPolicyCoverages() {
        return this.conditionalAccessPolicyCoverages;
    }
    /**
     * Gets the credentialUserRegistrationsSummaries property value. Summary information for user registration for multi-factor authentication and self service password reset across managed tenants.
     * @return a credentialUserRegistrationsSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<CredentialUserRegistrationsSummary> getCredentialUserRegistrationsSummaries() {
        return this.credentialUserRegistrationsSummaries;
    }
    /**
     * Gets the deviceAppPerformances property value. The deviceAppPerformances property
     * @return a deviceAppPerformance
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAppPerformance> getDeviceAppPerformances() {
        return this.deviceAppPerformances;
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. Summary information for device compliance policy setting states across managed tenants.
     * @return a deviceCompliancePolicySettingStateSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this.deviceCompliancePolicySettingStateSummaries;
    }
    /**
     * Gets the deviceHealthStatuses property value. The deviceHealthStatuses property
     * @return a deviceHealthStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthStatus> getDeviceHealthStatuses() {
        return this.deviceHealthStatuses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aggregatedPolicyCompliances", (n) -> { this.setAggregatedPolicyCompliances(n.getCollectionOfObjectValues(AggregatedPolicyCompliance::createFromDiscriminatorValue)); });
        deserializerMap.put("appPerformances", (n) -> { this.setAppPerformances(n.getCollectionOfObjectValues(AppPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("auditEvents", (n) -> { this.setAuditEvents(n.getCollectionOfObjectValues(AuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcConnections", (n) -> { this.setCloudPcConnections(n.getCollectionOfObjectValues(CloudPcConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcDevices", (n) -> { this.setCloudPcDevices(n.getCollectionOfObjectValues(CloudPcDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcsOverview", (n) -> { this.setCloudPcsOverview(n.getCollectionOfObjectValues(CloudPcOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessPolicyCoverages", (n) -> { this.setConditionalAccessPolicyCoverages(n.getCollectionOfObjectValues(ConditionalAccessPolicyCoverage::createFromDiscriminatorValue)); });
        deserializerMap.put("credentialUserRegistrationsSummaries", (n) -> { this.setCredentialUserRegistrationsSummaries(n.getCollectionOfObjectValues(CredentialUserRegistrationsSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceAppPerformances", (n) -> { this.setDeviceAppPerformances(n.getCollectionOfObjectValues(DeviceAppPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicySettingStateSummaries", (n) -> { this.setDeviceCompliancePolicySettingStateSummaries(n.getCollectionOfObjectValues(DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceHealthStatuses", (n) -> { this.setDeviceHealthStatuses(n.getCollectionOfObjectValues(DeviceHealthStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceCompliances", (n) -> { this.setManagedDeviceCompliances(n.getCollectionOfObjectValues(ManagedDeviceCompliance::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceComplianceTrends", (n) -> { this.setManagedDeviceComplianceTrends(n.getCollectionOfObjectValues(ManagedDeviceComplianceTrend::createFromDiscriminatorValue)); });
        deserializerMap.put("managedTenantAlertLogs", (n) -> { this.setManagedTenantAlertLogs(n.getCollectionOfObjectValues(ManagedTenantAlertLog::createFromDiscriminatorValue)); });
        deserializerMap.put("managedTenantAlertRuleDefinitions", (n) -> { this.setManagedTenantAlertRuleDefinitions(n.getCollectionOfObjectValues(ManagedTenantAlertRuleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("managedTenantAlertRules", (n) -> { this.setManagedTenantAlertRules(n.getCollectionOfObjectValues(ManagedTenantAlertRule::createFromDiscriminatorValue)); });
        deserializerMap.put("managedTenantAlerts", (n) -> { this.setManagedTenantAlerts(n.getCollectionOfObjectValues(ManagedTenantAlert::createFromDiscriminatorValue)); });
        deserializerMap.put("managedTenantApiNotifications", (n) -> { this.setManagedTenantApiNotifications(n.getCollectionOfObjectValues(ManagedTenantApiNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("managedTenantEmailNotifications", (n) -> { this.setManagedTenantEmailNotifications(n.getCollectionOfObjectValues(ManagedTenantEmailNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("managedTenantTicketingEndpoints", (n) -> { this.setManagedTenantTicketingEndpoints(n.getCollectionOfObjectValues(ManagedTenantTicketingEndpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("managementActions", (n) -> { this.setManagementActions(n.getCollectionOfObjectValues(ManagementAction::createFromDiscriminatorValue)); });
        deserializerMap.put("managementActionTenantDeploymentStatuses", (n) -> { this.setManagementActionTenantDeploymentStatuses(n.getCollectionOfObjectValues(ManagementActionTenantDeploymentStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("managementIntents", (n) -> { this.setManagementIntents(n.getCollectionOfObjectValues(ManagementIntent::createFromDiscriminatorValue)); });
        deserializerMap.put("managementTemplateCollections", (n) -> { this.setManagementTemplateCollections(n.getCollectionOfObjectValues(ManagementTemplateCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("managementTemplateCollectionTenantSummaries", (n) -> { this.setManagementTemplateCollectionTenantSummaries(n.getCollectionOfObjectValues(ManagementTemplateCollectionTenantSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("managementTemplates", (n) -> { this.setManagementTemplates(n.getCollectionOfObjectValues(ManagementTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("managementTemplateSteps", (n) -> { this.setManagementTemplateSteps(n.getCollectionOfObjectValues(ManagementTemplateStep::createFromDiscriminatorValue)); });
        deserializerMap.put("managementTemplateStepTenantSummaries", (n) -> { this.setManagementTemplateStepTenantSummaries(n.getCollectionOfObjectValues(ManagementTemplateStepTenantSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("managementTemplateStepVersions", (n) -> { this.setManagementTemplateStepVersions(n.getCollectionOfObjectValues(ManagementTemplateStepVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("myRoles", (n) -> { this.setMyRoles(n.getCollectionOfObjectValues(MyRole::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantGroups", (n) -> { this.setTenantGroups(n.getCollectionOfObjectValues(TenantGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("tenants", (n) -> { this.setTenants(n.getCollectionOfObjectValues(Tenant::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantsCustomizedInformation", (n) -> { this.setTenantsCustomizedInformation(n.getCollectionOfObjectValues(TenantCustomizedInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantsDetailedInformation", (n) -> { this.setTenantsDetailedInformation(n.getCollectionOfObjectValues(TenantDetailedInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantTags", (n) -> { this.setTenantTags(n.getCollectionOfObjectValues(TenantTag::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsDeviceMalwareStates", (n) -> { this.setWindowsDeviceMalwareStates(n.getCollectionOfObjectValues(WindowsDeviceMalwareState::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsProtectionStates", (n) -> { this.setWindowsProtectionStates(n.getCollectionOfObjectValues(WindowsProtectionState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceCompliances property value. The collection of compliance for managed devices across managed tenants.
     * @return a managedDeviceCompliance
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceCompliance> getManagedDeviceCompliances() {
        return this.managedDeviceCompliances;
    }
    /**
     * Gets the managedDeviceComplianceTrends property value. Trend insights for device compliance across managed tenants.
     * @return a managedDeviceComplianceTrend
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceComplianceTrend> getManagedDeviceComplianceTrends() {
        return this.managedDeviceComplianceTrends;
    }
    /**
     * Gets the managedTenantAlertLogs property value. The managedTenantAlertLogs property
     * @return a managedTenantAlertLog
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertLog> getManagedTenantAlertLogs() {
        return this.managedTenantAlertLogs;
    }
    /**
     * Gets the managedTenantAlertRuleDefinitions property value. The managedTenantAlertRuleDefinitions property
     * @return a managedTenantAlertRuleDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertRuleDefinition> getManagedTenantAlertRuleDefinitions() {
        return this.managedTenantAlertRuleDefinitions;
    }
    /**
     * Gets the managedTenantAlertRules property value. The managedTenantAlertRules property
     * @return a managedTenantAlertRule
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertRule> getManagedTenantAlertRules() {
        return this.managedTenantAlertRules;
    }
    /**
     * Gets the managedTenantAlerts property value. The managedTenantAlerts property
     * @return a managedTenantAlert
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlert> getManagedTenantAlerts() {
        return this.managedTenantAlerts;
    }
    /**
     * Gets the managedTenantApiNotifications property value. The managedTenantApiNotifications property
     * @return a managedTenantApiNotification
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantApiNotification> getManagedTenantApiNotifications() {
        return this.managedTenantApiNotifications;
    }
    /**
     * Gets the managedTenantEmailNotifications property value. The managedTenantEmailNotifications property
     * @return a managedTenantEmailNotification
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantEmailNotification> getManagedTenantEmailNotifications() {
        return this.managedTenantEmailNotifications;
    }
    /**
     * Gets the managedTenantTicketingEndpoints property value. The managedTenantTicketingEndpoints property
     * @return a managedTenantTicketingEndpoint
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantTicketingEndpoint> getManagedTenantTicketingEndpoints() {
        return this.managedTenantTicketingEndpoints;
    }
    /**
     * Gets the managementActions property value. The collection of baseline management actions across managed tenants.
     * @return a managementAction
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementAction> getManagementActions() {
        return this.managementActions;
    }
    /**
     * Gets the managementActionTenantDeploymentStatuses property value. The tenant level status of management actions across managed tenants.
     * @return a managementActionTenantDeploymentStatus
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementActionTenantDeploymentStatus> getManagementActionTenantDeploymentStatuses() {
        return this.managementActionTenantDeploymentStatuses;
    }
    /**
     * Gets the managementIntents property value. The collection of baseline management intents across managed tenants.
     * @return a managementIntent
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementIntent> getManagementIntents() {
        return this.managementIntents;
    }
    /**
     * Gets the managementTemplateCollections property value. The managementTemplateCollections property
     * @return a managementTemplateCollection
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateCollection> getManagementTemplateCollections() {
        return this.managementTemplateCollections;
    }
    /**
     * Gets the managementTemplateCollectionTenantSummaries property value. The managementTemplateCollectionTenantSummaries property
     * @return a managementTemplateCollectionTenantSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateCollectionTenantSummary> getManagementTemplateCollectionTenantSummaries() {
        return this.managementTemplateCollectionTenantSummaries;
    }
    /**
     * Gets the managementTemplates property value. The collection of baseline management templates across managed tenants.
     * @return a managementTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplate> getManagementTemplates() {
        return this.managementTemplates;
    }
    /**
     * Gets the managementTemplateSteps property value. The managementTemplateSteps property
     * @return a managementTemplateStep
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStep> getManagementTemplateSteps() {
        return this.managementTemplateSteps;
    }
    /**
     * Gets the managementTemplateStepTenantSummaries property value. The managementTemplateStepTenantSummaries property
     * @return a managementTemplateStepTenantSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStepTenantSummary> getManagementTemplateStepTenantSummaries() {
        return this.managementTemplateStepTenantSummaries;
    }
    /**
     * Gets the managementTemplateStepVersions property value. The managementTemplateStepVersions property
     * @return a managementTemplateStepVersion
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStepVersion> getManagementTemplateStepVersions() {
        return this.managementTemplateStepVersions;
    }
    /**
     * Gets the myRoles property value. The collection of role assignments to a signed-in user for a managed tenant.
     * @return a myRole
     */
    @jakarta.annotation.Nullable
    public java.util.List<MyRole> getMyRoles() {
        return this.myRoles;
    }
    /**
     * Gets the tenantGroups property value. The collection of a logical grouping of managed tenants used by the multi-tenant management platform.
     * @return a tenantGroup
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantGroup> getTenantGroups() {
        return this.tenantGroups;
    }
    /**
     * Gets the tenants property value. The collection of tenants associated with the managing entity.
     * @return a tenant
     */
    @jakarta.annotation.Nullable
    public java.util.List<Tenant> getTenants() {
        return this.tenants;
    }
    /**
     * Gets the tenantsCustomizedInformation property value. The collection of tenant level customized information across managed tenants.
     * @return a tenantCustomizedInformation
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantCustomizedInformation> getTenantsCustomizedInformation() {
        return this.tenantsCustomizedInformation;
    }
    /**
     * Gets the tenantsDetailedInformation property value. The collection tenant level detailed information across managed tenants.
     * @return a tenantDetailedInformation
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantDetailedInformation> getTenantsDetailedInformation() {
        return this.tenantsDetailedInformation;
    }
    /**
     * Gets the tenantTags property value. The collection of tenant tags across managed tenants.
     * @return a tenantTag
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantTag> getTenantTags() {
        return this.tenantTags;
    }
    /**
     * Gets the windowsDeviceMalwareStates property value. The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @return a windowsDeviceMalwareState
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDeviceMalwareState> getWindowsDeviceMalwareStates() {
        return this.windowsDeviceMalwareStates;
    }
    /**
     * Gets the windowsProtectionStates property value. The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @return a windowsProtectionState
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsProtectionState> getWindowsProtectionStates() {
        return this.windowsProtectionStates;
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
        writer.writeCollectionOfObjectValues("aggregatedPolicyCompliances", this.getAggregatedPolicyCompliances());
        writer.writeCollectionOfObjectValues("appPerformances", this.getAppPerformances());
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("cloudPcConnections", this.getCloudPcConnections());
        writer.writeCollectionOfObjectValues("cloudPcDevices", this.getCloudPcDevices());
        writer.writeCollectionOfObjectValues("cloudPcsOverview", this.getCloudPcsOverview());
        writer.writeCollectionOfObjectValues("conditionalAccessPolicyCoverages", this.getConditionalAccessPolicyCoverages());
        writer.writeCollectionOfObjectValues("credentialUserRegistrationsSummaries", this.getCredentialUserRegistrationsSummaries());
        writer.writeCollectionOfObjectValues("deviceAppPerformances", this.getDeviceAppPerformances());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicySettingStateSummaries", this.getDeviceCompliancePolicySettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceHealthStatuses", this.getDeviceHealthStatuses());
        writer.writeCollectionOfObjectValues("managedDeviceCompliances", this.getManagedDeviceCompliances());
        writer.writeCollectionOfObjectValues("managedDeviceComplianceTrends", this.getManagedDeviceComplianceTrends());
        writer.writeCollectionOfObjectValues("managedTenantAlertLogs", this.getManagedTenantAlertLogs());
        writer.writeCollectionOfObjectValues("managedTenantAlertRuleDefinitions", this.getManagedTenantAlertRuleDefinitions());
        writer.writeCollectionOfObjectValues("managedTenantAlertRules", this.getManagedTenantAlertRules());
        writer.writeCollectionOfObjectValues("managedTenantAlerts", this.getManagedTenantAlerts());
        writer.writeCollectionOfObjectValues("managedTenantApiNotifications", this.getManagedTenantApiNotifications());
        writer.writeCollectionOfObjectValues("managedTenantEmailNotifications", this.getManagedTenantEmailNotifications());
        writer.writeCollectionOfObjectValues("managedTenantTicketingEndpoints", this.getManagedTenantTicketingEndpoints());
        writer.writeCollectionOfObjectValues("managementActions", this.getManagementActions());
        writer.writeCollectionOfObjectValues("managementActionTenantDeploymentStatuses", this.getManagementActionTenantDeploymentStatuses());
        writer.writeCollectionOfObjectValues("managementIntents", this.getManagementIntents());
        writer.writeCollectionOfObjectValues("managementTemplateCollections", this.getManagementTemplateCollections());
        writer.writeCollectionOfObjectValues("managementTemplateCollectionTenantSummaries", this.getManagementTemplateCollectionTenantSummaries());
        writer.writeCollectionOfObjectValues("managementTemplates", this.getManagementTemplates());
        writer.writeCollectionOfObjectValues("managementTemplateSteps", this.getManagementTemplateSteps());
        writer.writeCollectionOfObjectValues("managementTemplateStepTenantSummaries", this.getManagementTemplateStepTenantSummaries());
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
    @jakarta.annotation.Nonnull
    public void setAggregatedPolicyCompliances(@jakarta.annotation.Nullable final java.util.List<AggregatedPolicyCompliance> value) {
        this.aggregatedPolicyCompliances = value;
    }
    /**
     * Sets the appPerformances property value. The appPerformances property
     * @param value Value to set for the appPerformances property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAppPerformances(@jakarta.annotation.Nullable final java.util.List<AppPerformance> value) {
        this.appPerformances = value;
    }
    /**
     * Sets the auditEvents property value. The collection of audit events across managed tenants.
     * @param value Value to set for the auditEvents property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuditEvents(@jakarta.annotation.Nullable final java.util.List<AuditEvent> value) {
        this.auditEvents = value;
    }
    /**
     * Sets the cloudPcConnections property value. The collection of cloud PC connections across managed tenants.
     * @param value Value to set for the cloudPcConnections property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudPcConnections(@jakarta.annotation.Nullable final java.util.List<CloudPcConnection> value) {
        this.cloudPcConnections = value;
    }
    /**
     * Sets the cloudPcDevices property value. The collection of cloud PC devices across managed tenants.
     * @param value Value to set for the cloudPcDevices property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudPcDevices(@jakarta.annotation.Nullable final java.util.List<CloudPcDevice> value) {
        this.cloudPcDevices = value;
    }
    /**
     * Sets the cloudPcsOverview property value. Overview of cloud PC information across managed tenants.
     * @param value Value to set for the cloudPcsOverview property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCloudPcsOverview(@jakarta.annotation.Nullable final java.util.List<CloudPcOverview> value) {
        this.cloudPcsOverview = value;
    }
    /**
     * Sets the conditionalAccessPolicyCoverages property value. Aggregate view of conditional access policy coverage across managed tenants.
     * @param value Value to set for the conditionalAccessPolicyCoverages property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConditionalAccessPolicyCoverages(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicyCoverage> value) {
        this.conditionalAccessPolicyCoverages = value;
    }
    /**
     * Sets the credentialUserRegistrationsSummaries property value. Summary information for user registration for multi-factor authentication and self service password reset across managed tenants.
     * @param value Value to set for the credentialUserRegistrationsSummaries property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCredentialUserRegistrationsSummaries(@jakarta.annotation.Nullable final java.util.List<CredentialUserRegistrationsSummary> value) {
        this.credentialUserRegistrationsSummaries = value;
    }
    /**
     * Sets the deviceAppPerformances property value. The deviceAppPerformances property
     * @param value Value to set for the deviceAppPerformances property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceAppPerformances(@jakarta.annotation.Nullable final java.util.List<DeviceAppPerformance> value) {
        this.deviceAppPerformances = value;
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. Summary information for device compliance policy setting states across managed tenants.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceCompliancePolicySettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this.deviceCompliancePolicySettingStateSummaries = value;
    }
    /**
     * Sets the deviceHealthStatuses property value. The deviceHealthStatuses property
     * @param value Value to set for the deviceHealthStatuses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceHealthStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceHealthStatus> value) {
        this.deviceHealthStatuses = value;
    }
    /**
     * Sets the managedDeviceCompliances property value. The collection of compliance for managed devices across managed tenants.
     * @param value Value to set for the managedDeviceCompliances property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDeviceCompliances(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceCompliance> value) {
        this.managedDeviceCompliances = value;
    }
    /**
     * Sets the managedDeviceComplianceTrends property value. Trend insights for device compliance across managed tenants.
     * @param value Value to set for the managedDeviceComplianceTrends property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedDeviceComplianceTrends(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceComplianceTrend> value) {
        this.managedDeviceComplianceTrends = value;
    }
    /**
     * Sets the managedTenantAlertLogs property value. The managedTenantAlertLogs property
     * @param value Value to set for the managedTenantAlertLogs property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedTenantAlertLogs(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertLog> value) {
        this.managedTenantAlertLogs = value;
    }
    /**
     * Sets the managedTenantAlertRuleDefinitions property value. The managedTenantAlertRuleDefinitions property
     * @param value Value to set for the managedTenantAlertRuleDefinitions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedTenantAlertRuleDefinitions(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertRuleDefinition> value) {
        this.managedTenantAlertRuleDefinitions = value;
    }
    /**
     * Sets the managedTenantAlertRules property value. The managedTenantAlertRules property
     * @param value Value to set for the managedTenantAlertRules property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedTenantAlertRules(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertRule> value) {
        this.managedTenantAlertRules = value;
    }
    /**
     * Sets the managedTenantAlerts property value. The managedTenantAlerts property
     * @param value Value to set for the managedTenantAlerts property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedTenantAlerts(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlert> value) {
        this.managedTenantAlerts = value;
    }
    /**
     * Sets the managedTenantApiNotifications property value. The managedTenantApiNotifications property
     * @param value Value to set for the managedTenantApiNotifications property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedTenantApiNotifications(@jakarta.annotation.Nullable final java.util.List<ManagedTenantApiNotification> value) {
        this.managedTenantApiNotifications = value;
    }
    /**
     * Sets the managedTenantEmailNotifications property value. The managedTenantEmailNotifications property
     * @param value Value to set for the managedTenantEmailNotifications property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedTenantEmailNotifications(@jakarta.annotation.Nullable final java.util.List<ManagedTenantEmailNotification> value) {
        this.managedTenantEmailNotifications = value;
    }
    /**
     * Sets the managedTenantTicketingEndpoints property value. The managedTenantTicketingEndpoints property
     * @param value Value to set for the managedTenantTicketingEndpoints property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagedTenantTicketingEndpoints(@jakarta.annotation.Nullable final java.util.List<ManagedTenantTicketingEndpoint> value) {
        this.managedTenantTicketingEndpoints = value;
    }
    /**
     * Sets the managementActions property value. The collection of baseline management actions across managed tenants.
     * @param value Value to set for the managementActions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementActions(@jakarta.annotation.Nullable final java.util.List<ManagementAction> value) {
        this.managementActions = value;
    }
    /**
     * Sets the managementActionTenantDeploymentStatuses property value. The tenant level status of management actions across managed tenants.
     * @param value Value to set for the managementActionTenantDeploymentStatuses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementActionTenantDeploymentStatuses(@jakarta.annotation.Nullable final java.util.List<ManagementActionTenantDeploymentStatus> value) {
        this.managementActionTenantDeploymentStatuses = value;
    }
    /**
     * Sets the managementIntents property value. The collection of baseline management intents across managed tenants.
     * @param value Value to set for the managementIntents property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementIntents(@jakarta.annotation.Nullable final java.util.List<ManagementIntent> value) {
        this.managementIntents = value;
    }
    /**
     * Sets the managementTemplateCollections property value. The managementTemplateCollections property
     * @param value Value to set for the managementTemplateCollections property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementTemplateCollections(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateCollection> value) {
        this.managementTemplateCollections = value;
    }
    /**
     * Sets the managementTemplateCollectionTenantSummaries property value. The managementTemplateCollectionTenantSummaries property
     * @param value Value to set for the managementTemplateCollectionTenantSummaries property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementTemplateCollectionTenantSummaries(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateCollectionTenantSummary> value) {
        this.managementTemplateCollectionTenantSummaries = value;
    }
    /**
     * Sets the managementTemplates property value. The collection of baseline management templates across managed tenants.
     * @param value Value to set for the managementTemplates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementTemplates(@jakarta.annotation.Nullable final java.util.List<ManagementTemplate> value) {
        this.managementTemplates = value;
    }
    /**
     * Sets the managementTemplateSteps property value. The managementTemplateSteps property
     * @param value Value to set for the managementTemplateSteps property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementTemplateSteps(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStep> value) {
        this.managementTemplateSteps = value;
    }
    /**
     * Sets the managementTemplateStepTenantSummaries property value. The managementTemplateStepTenantSummaries property
     * @param value Value to set for the managementTemplateStepTenantSummaries property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementTemplateStepTenantSummaries(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStepTenantSummary> value) {
        this.managementTemplateStepTenantSummaries = value;
    }
    /**
     * Sets the managementTemplateStepVersions property value. The managementTemplateStepVersions property
     * @param value Value to set for the managementTemplateStepVersions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManagementTemplateStepVersions(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStepVersion> value) {
        this.managementTemplateStepVersions = value;
    }
    /**
     * Sets the myRoles property value. The collection of role assignments to a signed-in user for a managed tenant.
     * @param value Value to set for the myRoles property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMyRoles(@jakarta.annotation.Nullable final java.util.List<MyRole> value) {
        this.myRoles = value;
    }
    /**
     * Sets the tenantGroups property value. The collection of a logical grouping of managed tenants used by the multi-tenant management platform.
     * @param value Value to set for the tenantGroups property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantGroups(@jakarta.annotation.Nullable final java.util.List<TenantGroup> value) {
        this.tenantGroups = value;
    }
    /**
     * Sets the tenants property value. The collection of tenants associated with the managing entity.
     * @param value Value to set for the tenants property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenants(@jakarta.annotation.Nullable final java.util.List<Tenant> value) {
        this.tenants = value;
    }
    /**
     * Sets the tenantsCustomizedInformation property value. The collection of tenant level customized information across managed tenants.
     * @param value Value to set for the tenantsCustomizedInformation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantsCustomizedInformation(@jakarta.annotation.Nullable final java.util.List<TenantCustomizedInformation> value) {
        this.tenantsCustomizedInformation = value;
    }
    /**
     * Sets the tenantsDetailedInformation property value. The collection tenant level detailed information across managed tenants.
     * @param value Value to set for the tenantsDetailedInformation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantsDetailedInformation(@jakarta.annotation.Nullable final java.util.List<TenantDetailedInformation> value) {
        this.tenantsDetailedInformation = value;
    }
    /**
     * Sets the tenantTags property value. The collection of tenant tags across managed tenants.
     * @param value Value to set for the tenantTags property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantTags(@jakarta.annotation.Nullable final java.util.List<TenantTag> value) {
        this.tenantTags = value;
    }
    /**
     * Sets the windowsDeviceMalwareStates property value. The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @param value Value to set for the windowsDeviceMalwareStates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWindowsDeviceMalwareStates(@jakarta.annotation.Nullable final java.util.List<WindowsDeviceMalwareState> value) {
        this.windowsDeviceMalwareStates = value;
    }
    /**
     * Sets the windowsProtectionStates property value. The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @param value Value to set for the windowsProtectionStates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWindowsProtectionStates(@jakarta.annotation.Nullable final java.util.List<WindowsProtectionState> value) {
        this.windowsProtectionStates = value;
    }
}
