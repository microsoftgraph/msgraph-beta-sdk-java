package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedTenant extends Entity implements Parsable {
    /**
     * Instantiates a new ManagedTenant and sets the default values.
     */
    public ManagedTenant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedTenant
     */
    @jakarta.annotation.Nonnull
    public static ManagedTenant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedTenant();
    }
    /**
     * Gets the aggregatedPolicyCompliances property value. Aggregate view of device compliance policies across managed tenants.
     * @return a java.util.List<AggregatedPolicyCompliance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AggregatedPolicyCompliance> getAggregatedPolicyCompliances() {
        return this.BackingStore.get("aggregatedPolicyCompliances");
    }
    /**
     * Gets the appPerformances property value. The appPerformances property
     * @return a java.util.List<AppPerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppPerformance> getAppPerformances() {
        return this.BackingStore.get("appPerformances");
    }
    /**
     * Gets the auditEvents property value. The collection of audit events across managed tenants.
     * @return a java.util.List<AuditEvent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this.BackingStore.get("auditEvents");
    }
    /**
     * Gets the cloudPcConnections property value. The collection of cloud PC connections across managed tenants.
     * @return a java.util.List<CloudPcConnection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcConnection> getCloudPcConnections() {
        return this.BackingStore.get("cloudPcConnections");
    }
    /**
     * Gets the cloudPcDevices property value. The collection of cloud PC devices across managed tenants.
     * @return a java.util.List<CloudPcDevice>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcDevice> getCloudPcDevices() {
        return this.BackingStore.get("cloudPcDevices");
    }
    /**
     * Gets the cloudPcsOverview property value. Overview of cloud PC information across managed tenants.
     * @return a java.util.List<CloudPcOverview>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcOverview> getCloudPcsOverview() {
        return this.BackingStore.get("cloudPcsOverview");
    }
    /**
     * Gets the conditionalAccessPolicyCoverages property value. Aggregate view of conditional access policy coverage across managed tenants.
     * @return a java.util.List<ConditionalAccessPolicyCoverage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicyCoverage> getConditionalAccessPolicyCoverages() {
        return this.BackingStore.get("conditionalAccessPolicyCoverages");
    }
    /**
     * Gets the credentialUserRegistrationsSummaries property value. Summary information for user registration for multi-factor authentication and self service password reset across managed tenants.
     * @return a java.util.List<CredentialUserRegistrationsSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CredentialUserRegistrationsSummary> getCredentialUserRegistrationsSummaries() {
        return this.BackingStore.get("credentialUserRegistrationsSummaries");
    }
    /**
     * Gets the deviceAppPerformances property value. The deviceAppPerformances property
     * @return a java.util.List<DeviceAppPerformance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAppPerformance> getDeviceAppPerformances() {
        return this.BackingStore.get("deviceAppPerformances");
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. Summary information for device compliance policy setting states across managed tenants.
     * @return a java.util.List<DeviceCompliancePolicySettingStateSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this.BackingStore.get("deviceCompliancePolicySettingStateSummaries");
    }
    /**
     * Gets the deviceHealthStatuses property value. The deviceHealthStatuses property
     * @return a java.util.List<DeviceHealthStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthStatus> getDeviceHealthStatuses() {
        return this.BackingStore.get("deviceHealthStatuses");
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
     * @return a java.util.List<ManagedDeviceCompliance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceCompliance> getManagedDeviceCompliances() {
        return this.BackingStore.get("managedDeviceCompliances");
    }
    /**
     * Gets the managedDeviceComplianceTrends property value. Trend insights for device compliance across managed tenants.
     * @return a java.util.List<ManagedDeviceComplianceTrend>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceComplianceTrend> getManagedDeviceComplianceTrends() {
        return this.BackingStore.get("managedDeviceComplianceTrends");
    }
    /**
     * Gets the managedTenantAlertLogs property value. The managedTenantAlertLogs property
     * @return a java.util.List<ManagedTenantAlertLog>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertLog> getManagedTenantAlertLogs() {
        return this.BackingStore.get("managedTenantAlertLogs");
    }
    /**
     * Gets the managedTenantAlertRuleDefinitions property value. The managedTenantAlertRuleDefinitions property
     * @return a java.util.List<ManagedTenantAlertRuleDefinition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertRuleDefinition> getManagedTenantAlertRuleDefinitions() {
        return this.BackingStore.get("managedTenantAlertRuleDefinitions");
    }
    /**
     * Gets the managedTenantAlertRules property value. The managedTenantAlertRules property
     * @return a java.util.List<ManagedTenantAlertRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlertRule> getManagedTenantAlertRules() {
        return this.BackingStore.get("managedTenantAlertRules");
    }
    /**
     * Gets the managedTenantAlerts property value. The managedTenantAlerts property
     * @return a java.util.List<ManagedTenantAlert>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantAlert> getManagedTenantAlerts() {
        return this.BackingStore.get("managedTenantAlerts");
    }
    /**
     * Gets the managedTenantApiNotifications property value. The managedTenantApiNotifications property
     * @return a java.util.List<ManagedTenantApiNotification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantApiNotification> getManagedTenantApiNotifications() {
        return this.BackingStore.get("managedTenantApiNotifications");
    }
    /**
     * Gets the managedTenantEmailNotifications property value. The managedTenantEmailNotifications property
     * @return a java.util.List<ManagedTenantEmailNotification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantEmailNotification> getManagedTenantEmailNotifications() {
        return this.BackingStore.get("managedTenantEmailNotifications");
    }
    /**
     * Gets the managedTenantTicketingEndpoints property value. The managedTenantTicketingEndpoints property
     * @return a java.util.List<ManagedTenantTicketingEndpoint>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedTenantTicketingEndpoint> getManagedTenantTicketingEndpoints() {
        return this.BackingStore.get("managedTenantTicketingEndpoints");
    }
    /**
     * Gets the managementActions property value. The collection of baseline management actions across managed tenants.
     * @return a java.util.List<ManagementAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementAction> getManagementActions() {
        return this.BackingStore.get("managementActions");
    }
    /**
     * Gets the managementActionTenantDeploymentStatuses property value. The tenant level status of management actions across managed tenants.
     * @return a java.util.List<ManagementActionTenantDeploymentStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementActionTenantDeploymentStatus> getManagementActionTenantDeploymentStatuses() {
        return this.BackingStore.get("managementActionTenantDeploymentStatuses");
    }
    /**
     * Gets the managementIntents property value. The collection of baseline management intents across managed tenants.
     * @return a java.util.List<ManagementIntent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementIntent> getManagementIntents() {
        return this.BackingStore.get("managementIntents");
    }
    /**
     * Gets the managementTemplateCollections property value. The managementTemplateCollections property
     * @return a java.util.List<ManagementTemplateCollection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateCollection> getManagementTemplateCollections() {
        return this.BackingStore.get("managementTemplateCollections");
    }
    /**
     * Gets the managementTemplateCollectionTenantSummaries property value. The managementTemplateCollectionTenantSummaries property
     * @return a java.util.List<ManagementTemplateCollectionTenantSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateCollectionTenantSummary> getManagementTemplateCollectionTenantSummaries() {
        return this.BackingStore.get("managementTemplateCollectionTenantSummaries");
    }
    /**
     * Gets the managementTemplates property value. The collection of baseline management templates across managed tenants.
     * @return a java.util.List<ManagementTemplate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplate> getManagementTemplates() {
        return this.BackingStore.get("managementTemplates");
    }
    /**
     * Gets the managementTemplateSteps property value. The managementTemplateSteps property
     * @return a java.util.List<ManagementTemplateStep>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStep> getManagementTemplateSteps() {
        return this.BackingStore.get("managementTemplateSteps");
    }
    /**
     * Gets the managementTemplateStepTenantSummaries property value. The managementTemplateStepTenantSummaries property
     * @return a java.util.List<ManagementTemplateStepTenantSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStepTenantSummary> getManagementTemplateStepTenantSummaries() {
        return this.BackingStore.get("managementTemplateStepTenantSummaries");
    }
    /**
     * Gets the managementTemplateStepVersions property value. The managementTemplateStepVersions property
     * @return a java.util.List<ManagementTemplateStepVersion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagementTemplateStepVersion> getManagementTemplateStepVersions() {
        return this.BackingStore.get("managementTemplateStepVersions");
    }
    /**
     * Gets the myRoles property value. The collection of role assignments to a signed-in user for a managed tenant.
     * @return a java.util.List<MyRole>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MyRole> getMyRoles() {
        return this.BackingStore.get("myRoles");
    }
    /**
     * Gets the tenantGroups property value. The collection of a logical grouping of managed tenants used by the multi-tenant management platform.
     * @return a java.util.List<TenantGroup>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantGroup> getTenantGroups() {
        return this.BackingStore.get("tenantGroups");
    }
    /**
     * Gets the tenants property value. The collection of tenants associated with the managing entity.
     * @return a java.util.List<Tenant>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Tenant> getTenants() {
        return this.BackingStore.get("tenants");
    }
    /**
     * Gets the tenantsCustomizedInformation property value. The collection of tenant level customized information across managed tenants.
     * @return a java.util.List<TenantCustomizedInformation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantCustomizedInformation> getTenantsCustomizedInformation() {
        return this.BackingStore.get("tenantsCustomizedInformation");
    }
    /**
     * Gets the tenantsDetailedInformation property value. The collection tenant level detailed information across managed tenants.
     * @return a java.util.List<TenantDetailedInformation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantDetailedInformation> getTenantsDetailedInformation() {
        return this.BackingStore.get("tenantsDetailedInformation");
    }
    /**
     * Gets the tenantTags property value. The collection of tenant tags across managed tenants.
     * @return a java.util.List<TenantTag>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantTag> getTenantTags() {
        return this.BackingStore.get("tenantTags");
    }
    /**
     * Gets the windowsDeviceMalwareStates property value. The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @return a java.util.List<WindowsDeviceMalwareState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDeviceMalwareState> getWindowsDeviceMalwareStates() {
        return this.BackingStore.get("windowsDeviceMalwareStates");
    }
    /**
     * Gets the windowsProtectionStates property value. The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @return a java.util.List<WindowsProtectionState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsProtectionState> getWindowsProtectionStates() {
        return this.BackingStore.get("windowsProtectionStates");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setAggregatedPolicyCompliances(@jakarta.annotation.Nullable final java.util.List<AggregatedPolicyCompliance> value) {
        this.BackingStore.set("aggregatedPolicyCompliances", value);
    }
    /**
     * Sets the appPerformances property value. The appPerformances property
     * @param value Value to set for the appPerformances property.
     */
    public void setAppPerformances(@jakarta.annotation.Nullable final java.util.List<AppPerformance> value) {
        this.BackingStore.set("appPerformances", value);
    }
    /**
     * Sets the auditEvents property value. The collection of audit events across managed tenants.
     * @param value Value to set for the auditEvents property.
     */
    public void setAuditEvents(@jakarta.annotation.Nullable final java.util.List<AuditEvent> value) {
        this.BackingStore.set("auditEvents", value);
    }
    /**
     * Sets the cloudPcConnections property value. The collection of cloud PC connections across managed tenants.
     * @param value Value to set for the cloudPcConnections property.
     */
    public void setCloudPcConnections(@jakarta.annotation.Nullable final java.util.List<CloudPcConnection> value) {
        this.BackingStore.set("cloudPcConnections", value);
    }
    /**
     * Sets the cloudPcDevices property value. The collection of cloud PC devices across managed tenants.
     * @param value Value to set for the cloudPcDevices property.
     */
    public void setCloudPcDevices(@jakarta.annotation.Nullable final java.util.List<CloudPcDevice> value) {
        this.BackingStore.set("cloudPcDevices", value);
    }
    /**
     * Sets the cloudPcsOverview property value. Overview of cloud PC information across managed tenants.
     * @param value Value to set for the cloudPcsOverview property.
     */
    public void setCloudPcsOverview(@jakarta.annotation.Nullable final java.util.List<CloudPcOverview> value) {
        this.BackingStore.set("cloudPcsOverview", value);
    }
    /**
     * Sets the conditionalAccessPolicyCoverages property value. Aggregate view of conditional access policy coverage across managed tenants.
     * @param value Value to set for the conditionalAccessPolicyCoverages property.
     */
    public void setConditionalAccessPolicyCoverages(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicyCoverage> value) {
        this.BackingStore.set("conditionalAccessPolicyCoverages", value);
    }
    /**
     * Sets the credentialUserRegistrationsSummaries property value. Summary information for user registration for multi-factor authentication and self service password reset across managed tenants.
     * @param value Value to set for the credentialUserRegistrationsSummaries property.
     */
    public void setCredentialUserRegistrationsSummaries(@jakarta.annotation.Nullable final java.util.List<CredentialUserRegistrationsSummary> value) {
        this.BackingStore.set("credentialUserRegistrationsSummaries", value);
    }
    /**
     * Sets the deviceAppPerformances property value. The deviceAppPerformances property
     * @param value Value to set for the deviceAppPerformances property.
     */
    public void setDeviceAppPerformances(@jakarta.annotation.Nullable final java.util.List<DeviceAppPerformance> value) {
        this.BackingStore.set("deviceAppPerformances", value);
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. Summary information for device compliance policy setting states across managed tenants.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     */
    public void setDeviceCompliancePolicySettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this.BackingStore.set("deviceCompliancePolicySettingStateSummaries", value);
    }
    /**
     * Sets the deviceHealthStatuses property value. The deviceHealthStatuses property
     * @param value Value to set for the deviceHealthStatuses property.
     */
    public void setDeviceHealthStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceHealthStatus> value) {
        this.BackingStore.set("deviceHealthStatuses", value);
    }
    /**
     * Sets the managedDeviceCompliances property value. The collection of compliance for managed devices across managed tenants.
     * @param value Value to set for the managedDeviceCompliances property.
     */
    public void setManagedDeviceCompliances(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceCompliance> value) {
        this.BackingStore.set("managedDeviceCompliances", value);
    }
    /**
     * Sets the managedDeviceComplianceTrends property value. Trend insights for device compliance across managed tenants.
     * @param value Value to set for the managedDeviceComplianceTrends property.
     */
    public void setManagedDeviceComplianceTrends(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceComplianceTrend> value) {
        this.BackingStore.set("managedDeviceComplianceTrends", value);
    }
    /**
     * Sets the managedTenantAlertLogs property value. The managedTenantAlertLogs property
     * @param value Value to set for the managedTenantAlertLogs property.
     */
    public void setManagedTenantAlertLogs(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertLog> value) {
        this.BackingStore.set("managedTenantAlertLogs", value);
    }
    /**
     * Sets the managedTenantAlertRuleDefinitions property value. The managedTenantAlertRuleDefinitions property
     * @param value Value to set for the managedTenantAlertRuleDefinitions property.
     */
    public void setManagedTenantAlertRuleDefinitions(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertRuleDefinition> value) {
        this.BackingStore.set("managedTenantAlertRuleDefinitions", value);
    }
    /**
     * Sets the managedTenantAlertRules property value. The managedTenantAlertRules property
     * @param value Value to set for the managedTenantAlertRules property.
     */
    public void setManagedTenantAlertRules(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlertRule> value) {
        this.BackingStore.set("managedTenantAlertRules", value);
    }
    /**
     * Sets the managedTenantAlerts property value. The managedTenantAlerts property
     * @param value Value to set for the managedTenantAlerts property.
     */
    public void setManagedTenantAlerts(@jakarta.annotation.Nullable final java.util.List<ManagedTenantAlert> value) {
        this.BackingStore.set("managedTenantAlerts", value);
    }
    /**
     * Sets the managedTenantApiNotifications property value. The managedTenantApiNotifications property
     * @param value Value to set for the managedTenantApiNotifications property.
     */
    public void setManagedTenantApiNotifications(@jakarta.annotation.Nullable final java.util.List<ManagedTenantApiNotification> value) {
        this.BackingStore.set("managedTenantApiNotifications", value);
    }
    /**
     * Sets the managedTenantEmailNotifications property value. The managedTenantEmailNotifications property
     * @param value Value to set for the managedTenantEmailNotifications property.
     */
    public void setManagedTenantEmailNotifications(@jakarta.annotation.Nullable final java.util.List<ManagedTenantEmailNotification> value) {
        this.BackingStore.set("managedTenantEmailNotifications", value);
    }
    /**
     * Sets the managedTenantTicketingEndpoints property value. The managedTenantTicketingEndpoints property
     * @param value Value to set for the managedTenantTicketingEndpoints property.
     */
    public void setManagedTenantTicketingEndpoints(@jakarta.annotation.Nullable final java.util.List<ManagedTenantTicketingEndpoint> value) {
        this.BackingStore.set("managedTenantTicketingEndpoints", value);
    }
    /**
     * Sets the managementActions property value. The collection of baseline management actions across managed tenants.
     * @param value Value to set for the managementActions property.
     */
    public void setManagementActions(@jakarta.annotation.Nullable final java.util.List<ManagementAction> value) {
        this.BackingStore.set("managementActions", value);
    }
    /**
     * Sets the managementActionTenantDeploymentStatuses property value. The tenant level status of management actions across managed tenants.
     * @param value Value to set for the managementActionTenantDeploymentStatuses property.
     */
    public void setManagementActionTenantDeploymentStatuses(@jakarta.annotation.Nullable final java.util.List<ManagementActionTenantDeploymentStatus> value) {
        this.BackingStore.set("managementActionTenantDeploymentStatuses", value);
    }
    /**
     * Sets the managementIntents property value. The collection of baseline management intents across managed tenants.
     * @param value Value to set for the managementIntents property.
     */
    public void setManagementIntents(@jakarta.annotation.Nullable final java.util.List<ManagementIntent> value) {
        this.BackingStore.set("managementIntents", value);
    }
    /**
     * Sets the managementTemplateCollections property value. The managementTemplateCollections property
     * @param value Value to set for the managementTemplateCollections property.
     */
    public void setManagementTemplateCollections(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateCollection> value) {
        this.BackingStore.set("managementTemplateCollections", value);
    }
    /**
     * Sets the managementTemplateCollectionTenantSummaries property value. The managementTemplateCollectionTenantSummaries property
     * @param value Value to set for the managementTemplateCollectionTenantSummaries property.
     */
    public void setManagementTemplateCollectionTenantSummaries(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateCollectionTenantSummary> value) {
        this.BackingStore.set("managementTemplateCollectionTenantSummaries", value);
    }
    /**
     * Sets the managementTemplates property value. The collection of baseline management templates across managed tenants.
     * @param value Value to set for the managementTemplates property.
     */
    public void setManagementTemplates(@jakarta.annotation.Nullable final java.util.List<ManagementTemplate> value) {
        this.BackingStore.set("managementTemplates", value);
    }
    /**
     * Sets the managementTemplateSteps property value. The managementTemplateSteps property
     * @param value Value to set for the managementTemplateSteps property.
     */
    public void setManagementTemplateSteps(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStep> value) {
        this.BackingStore.set("managementTemplateSteps", value);
    }
    /**
     * Sets the managementTemplateStepTenantSummaries property value. The managementTemplateStepTenantSummaries property
     * @param value Value to set for the managementTemplateStepTenantSummaries property.
     */
    public void setManagementTemplateStepTenantSummaries(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStepTenantSummary> value) {
        this.BackingStore.set("managementTemplateStepTenantSummaries", value);
    }
    /**
     * Sets the managementTemplateStepVersions property value. The managementTemplateStepVersions property
     * @param value Value to set for the managementTemplateStepVersions property.
     */
    public void setManagementTemplateStepVersions(@jakarta.annotation.Nullable final java.util.List<ManagementTemplateStepVersion> value) {
        this.BackingStore.set("managementTemplateStepVersions", value);
    }
    /**
     * Sets the myRoles property value. The collection of role assignments to a signed-in user for a managed tenant.
     * @param value Value to set for the myRoles property.
     */
    public void setMyRoles(@jakarta.annotation.Nullable final java.util.List<MyRole> value) {
        this.BackingStore.set("myRoles", value);
    }
    /**
     * Sets the tenantGroups property value. The collection of a logical grouping of managed tenants used by the multi-tenant management platform.
     * @param value Value to set for the tenantGroups property.
     */
    public void setTenantGroups(@jakarta.annotation.Nullable final java.util.List<TenantGroup> value) {
        this.BackingStore.set("tenantGroups", value);
    }
    /**
     * Sets the tenants property value. The collection of tenants associated with the managing entity.
     * @param value Value to set for the tenants property.
     */
    public void setTenants(@jakarta.annotation.Nullable final java.util.List<Tenant> value) {
        this.BackingStore.set("tenants", value);
    }
    /**
     * Sets the tenantsCustomizedInformation property value. The collection of tenant level customized information across managed tenants.
     * @param value Value to set for the tenantsCustomizedInformation property.
     */
    public void setTenantsCustomizedInformation(@jakarta.annotation.Nullable final java.util.List<TenantCustomizedInformation> value) {
        this.BackingStore.set("tenantsCustomizedInformation", value);
    }
    /**
     * Sets the tenantsDetailedInformation property value. The collection tenant level detailed information across managed tenants.
     * @param value Value to set for the tenantsDetailedInformation property.
     */
    public void setTenantsDetailedInformation(@jakarta.annotation.Nullable final java.util.List<TenantDetailedInformation> value) {
        this.BackingStore.set("tenantsDetailedInformation", value);
    }
    /**
     * Sets the tenantTags property value. The collection of tenant tags across managed tenants.
     * @param value Value to set for the tenantTags property.
     */
    public void setTenantTags(@jakarta.annotation.Nullable final java.util.List<TenantTag> value) {
        this.BackingStore.set("tenantTags", value);
    }
    /**
     * Sets the windowsDeviceMalwareStates property value. The state of malware for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @param value Value to set for the windowsDeviceMalwareStates property.
     */
    public void setWindowsDeviceMalwareStates(@jakarta.annotation.Nullable final java.util.List<WindowsDeviceMalwareState> value) {
        this.BackingStore.set("windowsDeviceMalwareStates", value);
    }
    /**
     * Sets the windowsProtectionStates property value. The protection state for Windows devices, registered with Microsoft Endpoint Manager, across managed tenants.
     * @param value Value to set for the windowsProtectionStates property.
     */
    public void setWindowsProtectionStates(@jakarta.annotation.Nullable final java.util.List<WindowsProtectionState> value) {
        this.BackingStore.set("windowsProtectionStates", value);
    }
}
