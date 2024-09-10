package com.microsoft.graph.beta.models;

import com.microsoft.graph.beta.models.devicemanagement.Monitoring;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Singleton entity that acts as a container for all device management functionality.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagement extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagement} and sets the default values.
     */
    public DeviceManagement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagement}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagement();
    }
    /**
     * Gets the accountMoveCompletionDateTime property value. The date & time when tenant data moved between scaleunits.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAccountMoveCompletionDateTime() {
        return this.backingStore.get("accountMoveCompletionDateTime");
    }
    /**
     * Gets the adminConsent property value. Admin consent information.
     * @return a {@link AdminConsent}
     */
    @jakarta.annotation.Nullable
    public AdminConsent getAdminConsent() {
        return this.backingStore.get("adminConsent");
    }
    /**
     * Gets the advancedThreatProtectionOnboardingStateSummary property value. The summary state of ATP onboarding state for this account.
     * @return a {@link AdvancedThreatProtectionOnboardingStateSummary}
     */
    @jakarta.annotation.Nullable
    public AdvancedThreatProtectionOnboardingStateSummary getAdvancedThreatProtectionOnboardingStateSummary() {
        return this.backingStore.get("advancedThreatProtectionOnboardingStateSummary");
    }
    /**
     * Gets the androidDeviceOwnerEnrollmentProfiles property value. Android device owner enrollment profile entities.
     * @return a {@link java.util.List<AndroidDeviceOwnerEnrollmentProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerEnrollmentProfile> getAndroidDeviceOwnerEnrollmentProfiles() {
        return this.backingStore.get("androidDeviceOwnerEnrollmentProfiles");
    }
    /**
     * Gets the androidForWorkAppConfigurationSchemas property value. Android for Work app configuration schema entities.
     * @return a {@link java.util.List<AndroidForWorkAppConfigurationSchema>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidForWorkAppConfigurationSchema> getAndroidForWorkAppConfigurationSchemas() {
        return this.backingStore.get("androidForWorkAppConfigurationSchemas");
    }
    /**
     * Gets the androidForWorkEnrollmentProfiles property value. Android for Work enrollment profile entities.
     * @return a {@link java.util.List<AndroidForWorkEnrollmentProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidForWorkEnrollmentProfile> getAndroidForWorkEnrollmentProfiles() {
        return this.backingStore.get("androidForWorkEnrollmentProfiles");
    }
    /**
     * Gets the androidForWorkSettings property value. The singleton Android for Work settings entity.
     * @return a {@link AndroidForWorkSettings}
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkSettings getAndroidForWorkSettings() {
        return this.backingStore.get("androidForWorkSettings");
    }
    /**
     * Gets the androidManagedStoreAccountEnterpriseSettings property value. The singleton Android managed store account enterprise settings entity.
     * @return a {@link AndroidManagedStoreAccountEnterpriseSettings}
     */
    @jakarta.annotation.Nullable
    public AndroidManagedStoreAccountEnterpriseSettings getAndroidManagedStoreAccountEnterpriseSettings() {
        return this.backingStore.get("androidManagedStoreAccountEnterpriseSettings");
    }
    /**
     * Gets the androidManagedStoreAppConfigurationSchemas property value. Android Enterprise app configuration schema entities.
     * @return a {@link java.util.List<AndroidManagedStoreAppConfigurationSchema>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidManagedStoreAppConfigurationSchema> getAndroidManagedStoreAppConfigurationSchemas() {
        return this.backingStore.get("androidManagedStoreAppConfigurationSchemas");
    }
    /**
     * Gets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @return a {@link ApplePushNotificationCertificate}
     */
    @jakarta.annotation.Nullable
    public ApplePushNotificationCertificate getApplePushNotificationCertificate() {
        return this.backingStore.get("applePushNotificationCertificate");
    }
    /**
     * Gets the appleUserInitiatedEnrollmentProfiles property value. Apple user initiated enrollment profiles
     * @return a {@link java.util.List<AppleUserInitiatedEnrollmentProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppleUserInitiatedEnrollmentProfile> getAppleUserInitiatedEnrollmentProfiles() {
        return this.backingStore.get("appleUserInitiatedEnrollmentProfiles");
    }
    /**
     * Gets the assignmentFilters property value. The list of assignment filters
     * @return a {@link java.util.List<DeviceAndAppManagementAssignmentFilter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAndAppManagementAssignmentFilter> getAssignmentFilters() {
        return this.backingStore.get("assignmentFilters");
    }
    /**
     * Gets the auditEvents property value. The Audit Events
     * @return a {@link java.util.List<AuditEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuditEvent> getAuditEvents() {
        return this.backingStore.get("auditEvents");
    }
    /**
     * Gets the autopilotEvents property value. The list of autopilot events for the tenant.
     * @return a {@link java.util.List<DeviceManagementAutopilotEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementAutopilotEvent> getAutopilotEvents() {
        return this.backingStore.get("autopilotEvents");
    }
    /**
     * Gets the cartToClassAssociations property value. The Cart To Class Associations.
     * @return a {@link java.util.List<CartToClassAssociation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CartToClassAssociation> getCartToClassAssociations() {
        return this.backingStore.get("cartToClassAssociations");
    }
    /**
     * Gets the categories property value. The available categories
     * @return a {@link java.util.List<DeviceManagementSettingCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingCategory> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the certificateConnectorDetails property value. Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector.
     * @return a {@link java.util.List<CertificateConnectorDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CertificateConnectorDetails> getCertificateConnectorDetails() {
        return this.backingStore.get("certificateConnectorDetails");
    }
    /**
     * Gets the chromeOSOnboardingSettings property value. Collection of ChromeOSOnboardingSettings settings associated with account.
     * @return a {@link java.util.List<ChromeOSOnboardingSettings>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChromeOSOnboardingSettings> getChromeOSOnboardingSettings() {
        return this.backingStore.get("chromeOSOnboardingSettings");
    }
    /**
     * Gets the cloudPCConnectivityIssues property value. The list of CloudPC Connectivity Issue.
     * @return a {@link java.util.List<CloudPCConnectivityIssue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPCConnectivityIssue> getCloudPCConnectivityIssues() {
        return this.backingStore.get("cloudPCConnectivityIssues");
    }
    /**
     * Gets the comanagedDevices property value. The list of co-managed devices report
     * @return a {@link java.util.List<ManagedDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDevice> getComanagedDevices() {
        return this.backingStore.get("comanagedDevices");
    }
    /**
     * Gets the comanagementEligibleDevices property value. The list of co-management eligible devices report
     * @return a {@link java.util.List<ComanagementEligibleDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComanagementEligibleDevice> getComanagementEligibleDevices() {
        return this.backingStore.get("comanagementEligibleDevices");
    }
    /**
     * Gets the complianceCategories property value. List of all compliance categories
     * @return a {@link java.util.List<DeviceManagementConfigurationCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationCategory> getComplianceCategories() {
        return this.backingStore.get("complianceCategories");
    }
    /**
     * Gets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @return a {@link java.util.List<ComplianceManagementPartner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceManagementPartner> getComplianceManagementPartners() {
        return this.backingStore.get("complianceManagementPartners");
    }
    /**
     * Gets the compliancePolicies property value. List of all compliance policies
     * @return a {@link java.util.List<DeviceManagementCompliancePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementCompliancePolicy> getCompliancePolicies() {
        return this.backingStore.get("compliancePolicies");
    }
    /**
     * Gets the complianceSettings property value. List of all ComplianceSettings
     * @return a {@link java.util.List<DeviceManagementConfigurationSettingDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getComplianceSettings() {
        return this.backingStore.get("complianceSettings");
    }
    /**
     * Gets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @return a {@link OnPremisesConditionalAccessSettings}
     */
    @jakarta.annotation.Nullable
    public OnPremisesConditionalAccessSettings getConditionalAccessSettings() {
        return this.backingStore.get("conditionalAccessSettings");
    }
    /**
     * Gets the configManagerCollections property value. A list of ConfigManagerCollection
     * @return a {@link java.util.List<ConfigManagerCollection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConfigManagerCollection> getConfigManagerCollections() {
        return this.backingStore.get("configManagerCollections");
    }
    /**
     * Gets the configurationCategories property value. List of all Configuration Categories
     * @return a {@link java.util.List<DeviceManagementConfigurationCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationCategory> getConfigurationCategories() {
        return this.backingStore.get("configurationCategories");
    }
    /**
     * Gets the configurationPolicies property value. List of all Configuration policies
     * @return a {@link java.util.List<DeviceManagementConfigurationPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicy> getConfigurationPolicies() {
        return this.backingStore.get("configurationPolicies");
    }
    /**
     * Gets the configurationPolicyTemplates property value. List of all templates
     * @return a {@link java.util.List<DeviceManagementConfigurationPolicyTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicyTemplate> getConfigurationPolicyTemplates() {
        return this.backingStore.get("configurationPolicyTemplates");
    }
    /**
     * Gets the configurationSettings property value. List of all ConfigurationSettings
     * @return a {@link java.util.List<DeviceManagementConfigurationSettingDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getConfigurationSettings() {
        return this.backingStore.get("configurationSettings");
    }
    /**
     * Gets the connectorStatus property value. The list of connector status for the tenant.
     * @return a {@link java.util.List<ConnectorStatusDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectorStatusDetails> getConnectorStatus() {
        return this.backingStore.get("connectorStatus");
    }
    /**
     * Gets the dataProcessorServiceForWindowsFeaturesOnboarding property value. A configuration entity for MEM features that utilize Data Processor Service for Windows (DPSW) data.
     * @return a {@link DataProcessorServiceForWindowsFeaturesOnboarding}
     */
    @jakarta.annotation.Nullable
    public DataProcessorServiceForWindowsFeaturesOnboarding getDataProcessorServiceForWindowsFeaturesOnboarding() {
        return this.backingStore.get("dataProcessorServiceForWindowsFeaturesOnboarding");
    }
    /**
     * Gets the dataSharingConsents property value. Data sharing consents.
     * @return a {@link java.util.List<DataSharingConsent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DataSharingConsent> getDataSharingConsents() {
        return this.backingStore.get("dataSharingConsents");
    }
    /**
     * Gets the depOnboardingSettings property value. This collections of multiple DEP tokens per-tenant.
     * @return a {@link java.util.List<DepOnboardingSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DepOnboardingSetting> getDepOnboardingSettings() {
        return this.backingStore.get("depOnboardingSettings");
    }
    /**
     * Gets the derivedCredentials property value. Collection of Derived credential settings associated with account.
     * @return a {@link java.util.List<DeviceManagementDerivedCredentialSettings>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementDerivedCredentialSettings> getDerivedCredentials() {
        return this.backingStore.get("derivedCredentials");
    }
    /**
     * Gets the detectedApps property value. The list of detected apps associated with a device.
     * @return a {@link java.util.List<DetectedApp>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this.backingStore.get("detectedApps");
    }
    /**
     * Gets the deviceCategories property value. The list of device categories with the tenant.
     * @return a {@link java.util.List<DeviceCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCategory> getDeviceCategories() {
        return this.backingStore.get("deviceCategories");
    }
    /**
     * Gets the deviceCompliancePolicies property value. The device compliance policies.
     * @return a {@link java.util.List<DeviceCompliancePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicy> getDeviceCompliancePolicies() {
        return this.backingStore.get("deviceCompliancePolicies");
    }
    /**
     * Gets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @return a {@link DeviceCompliancePolicyDeviceStateSummary}
     */
    @jakarta.annotation.Nullable
    public DeviceCompliancePolicyDeviceStateSummary getDeviceCompliancePolicyDeviceStateSummary() {
        return this.backingStore.get("deviceCompliancePolicyDeviceStateSummary");
    }
    /**
     * Gets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @return a {@link java.util.List<DeviceCompliancePolicySettingStateSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicySettingStateSummary> getDeviceCompliancePolicySettingStateSummaries() {
        return this.backingStore.get("deviceCompliancePolicySettingStateSummaries");
    }
    /**
     * Gets the deviceComplianceReportSummarizationDateTime property value. The last requested time of device compliance reporting for this account. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeviceComplianceReportSummarizationDateTime() {
        return this.backingStore.get("deviceComplianceReportSummarizationDateTime");
    }
    /**
     * Gets the deviceComplianceScripts property value. The list of device compliance scripts associated with the tenant.
     * @return a {@link java.util.List<DeviceComplianceScript>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceComplianceScript> getDeviceComplianceScripts() {
        return this.backingStore.get("deviceComplianceScripts");
    }
    /**
     * Gets the deviceConfigurationConflictSummary property value. Summary of policies in conflict state for this account.
     * @return a {@link java.util.List<DeviceConfigurationConflictSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationConflictSummary> getDeviceConfigurationConflictSummary() {
        return this.backingStore.get("deviceConfigurationConflictSummary");
    }
    /**
     * Gets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @return a {@link DeviceConfigurationDeviceStateSummary}
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationDeviceStateSummary getDeviceConfigurationDeviceStateSummaries() {
        return this.backingStore.get("deviceConfigurationDeviceStateSummaries");
    }
    /**
     * Gets the deviceConfigurationProfiles property value. Profile Id of the object.
     * @return a {@link java.util.List<DeviceConfigurationProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationProfile> getDeviceConfigurationProfiles() {
        return this.backingStore.get("deviceConfigurationProfiles");
    }
    /**
     * Gets the deviceConfigurationRestrictedAppsViolations property value. Restricted apps violations for this account.
     * @return a {@link java.util.List<RestrictedAppsViolation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RestrictedAppsViolation> getDeviceConfigurationRestrictedAppsViolations() {
        return this.backingStore.get("deviceConfigurationRestrictedAppsViolations");
    }
    /**
     * Gets the deviceConfigurations property value. The device configurations.
     * @return a {@link java.util.List<DeviceConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfiguration> getDeviceConfigurations() {
        return this.backingStore.get("deviceConfigurations");
    }
    /**
     * Gets the deviceConfigurationsAllManagedDeviceCertificateStates property value. Summary of all certificates for all devices.
     * @return a {@link java.util.List<ManagedAllDeviceCertificateState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedAllDeviceCertificateState> getDeviceConfigurationsAllManagedDeviceCertificateStates() {
        return this.backingStore.get("deviceConfigurationsAllManagedDeviceCertificateStates");
    }
    /**
     * Gets the deviceConfigurationUserStateSummaries property value. The device configuration user state summary for this account.
     * @return a {@link DeviceConfigurationUserStateSummary}
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationUserStateSummary getDeviceConfigurationUserStateSummaries() {
        return this.backingStore.get("deviceConfigurationUserStateSummaries");
    }
    /**
     * Gets the deviceCustomAttributeShellScripts property value. The list of device custom attribute shell scripts associated with the tenant.
     * @return a {@link java.util.List<DeviceCustomAttributeShellScript>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCustomAttributeShellScript> getDeviceCustomAttributeShellScripts() {
        return this.backingStore.get("deviceCustomAttributeShellScripts");
    }
    /**
     * Gets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @return a {@link java.util.List<DeviceEnrollmentConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceEnrollmentConfiguration> getDeviceEnrollmentConfigurations() {
        return this.backingStore.get("deviceEnrollmentConfigurations");
    }
    /**
     * Gets the deviceHealthScripts property value. The list of device health scripts associated with the tenant.
     * @return a {@link java.util.List<DeviceHealthScript>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthScript> getDeviceHealthScripts() {
        return this.backingStore.get("deviceHealthScripts");
    }
    /**
     * Gets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @return a {@link java.util.List<DeviceManagementPartner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementPartner> getDeviceManagementPartners() {
        return this.backingStore.get("deviceManagementPartners");
    }
    /**
     * Gets the deviceManagementScripts property value. The list of device management scripts associated with the tenant.
     * @return a {@link java.util.List<DeviceManagementScript>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementScript> getDeviceManagementScripts() {
        return this.backingStore.get("deviceManagementScripts");
    }
    /**
     * Gets the deviceProtectionOverview property value. Device protection overview.
     * @return a {@link DeviceProtectionOverview}
     */
    @jakarta.annotation.Nullable
    public DeviceProtectionOverview getDeviceProtectionOverview() {
        return this.backingStore.get("deviceProtectionOverview");
    }
    /**
     * Gets the deviceShellScripts property value. The list of device shell scripts associated with the tenant.
     * @return a {@link java.util.List<DeviceShellScript>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceShellScript> getDeviceShellScripts() {
        return this.backingStore.get("deviceShellScripts");
    }
    /**
     * Gets the domainJoinConnectors property value. A list of connector objects.
     * @return a {@link java.util.List<DeviceManagementDomainJoinConnector>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementDomainJoinConnector> getDomainJoinConnectors() {
        return this.backingStore.get("domainJoinConnectors");
    }
    /**
     * Gets the elevationRequests property value. List of elevation requests
     * @return a {@link java.util.List<PrivilegeManagementElevationRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegeManagementElevationRequest> getElevationRequests() {
        return this.backingStore.get("elevationRequests");
    }
    /**
     * Gets the embeddedSIMActivationCodePools property value. The embedded SIM activation code pools created by this account.
     * @return a {@link java.util.List<EmbeddedSIMActivationCodePool>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmbeddedSIMActivationCodePool> getEmbeddedSIMActivationCodePools() {
        return this.backingStore.get("embeddedSIMActivationCodePools");
    }
    /**
     * Gets the endpointPrivilegeManagementProvisioningStatus property value. Endpoint privilege management (EPM) tenant provisioning status contains tenant level license and onboarding state information.
     * @return a {@link EndpointPrivilegeManagementProvisioningStatus}
     */
    @jakarta.annotation.Nullable
    public EndpointPrivilegeManagementProvisioningStatus getEndpointPrivilegeManagementProvisioningStatus() {
        return this.backingStore.get("endpointPrivilegeManagementProvisioningStatus");
    }
    /**
     * Gets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @return a {@link java.util.List<DeviceManagementExchangeConnector>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementExchangeConnector> getExchangeConnectors() {
        return this.backingStore.get("exchangeConnectors");
    }
    /**
     * Gets the exchangeOnPremisesPolicies property value. The list of Exchange On Premisis policies configured by the tenant.
     * @return a {@link java.util.List<DeviceManagementExchangeOnPremisesPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementExchangeOnPremisesPolicy> getExchangeOnPremisesPolicies() {
        return this.backingStore.get("exchangeOnPremisesPolicies");
    }
    /**
     * Gets the exchangeOnPremisesPolicy property value. The policy which controls mobile device access to Exchange On Premises
     * @return a {@link DeviceManagementExchangeOnPremisesPolicy}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeOnPremisesPolicy getExchangeOnPremisesPolicy() {
        return this.backingStore.get("exchangeOnPremisesPolicy");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountMoveCompletionDateTime", (n) -> { this.setAccountMoveCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("adminConsent", (n) -> { this.setAdminConsent(n.getObjectValue(AdminConsent::createFromDiscriminatorValue)); });
        deserializerMap.put("advancedThreatProtectionOnboardingStateSummary", (n) -> { this.setAdvancedThreatProtectionOnboardingStateSummary(n.getObjectValue(AdvancedThreatProtectionOnboardingStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("androidDeviceOwnerEnrollmentProfiles", (n) -> { this.setAndroidDeviceOwnerEnrollmentProfiles(n.getCollectionOfObjectValues(AndroidDeviceOwnerEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("androidForWorkAppConfigurationSchemas", (n) -> { this.setAndroidForWorkAppConfigurationSchemas(n.getCollectionOfObjectValues(AndroidForWorkAppConfigurationSchema::createFromDiscriminatorValue)); });
        deserializerMap.put("androidForWorkEnrollmentProfiles", (n) -> { this.setAndroidForWorkEnrollmentProfiles(n.getCollectionOfObjectValues(AndroidForWorkEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("androidForWorkSettings", (n) -> { this.setAndroidForWorkSettings(n.getObjectValue(AndroidForWorkSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("androidManagedStoreAccountEnterpriseSettings", (n) -> { this.setAndroidManagedStoreAccountEnterpriseSettings(n.getObjectValue(AndroidManagedStoreAccountEnterpriseSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("androidManagedStoreAppConfigurationSchemas", (n) -> { this.setAndroidManagedStoreAppConfigurationSchemas(n.getCollectionOfObjectValues(AndroidManagedStoreAppConfigurationSchema::createFromDiscriminatorValue)); });
        deserializerMap.put("applePushNotificationCertificate", (n) -> { this.setApplePushNotificationCertificate(n.getObjectValue(ApplePushNotificationCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("appleUserInitiatedEnrollmentProfiles", (n) -> { this.setAppleUserInitiatedEnrollmentProfiles(n.getCollectionOfObjectValues(AppleUserInitiatedEnrollmentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentFilters", (n) -> { this.setAssignmentFilters(n.getCollectionOfObjectValues(DeviceAndAppManagementAssignmentFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("auditEvents", (n) -> { this.setAuditEvents(n.getCollectionOfObjectValues(AuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("autopilotEvents", (n) -> { this.setAutopilotEvents(n.getCollectionOfObjectValues(DeviceManagementAutopilotEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("cartToClassAssociations", (n) -> { this.setCartToClassAssociations(n.getCollectionOfObjectValues(CartToClassAssociation::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(DeviceManagementSettingCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("certificateConnectorDetails", (n) -> { this.setCertificateConnectorDetails(n.getCollectionOfObjectValues(CertificateConnectorDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("chromeOSOnboardingSettings", (n) -> { this.setChromeOSOnboardingSettings(n.getCollectionOfObjectValues(ChromeOSOnboardingSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPCConnectivityIssues", (n) -> { this.setCloudPCConnectivityIssues(n.getCollectionOfObjectValues(CloudPCConnectivityIssue::createFromDiscriminatorValue)); });
        deserializerMap.put("comanagedDevices", (n) -> { this.setComanagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("comanagementEligibleDevices", (n) -> { this.setComanagementEligibleDevices(n.getCollectionOfObjectValues(ComanagementEligibleDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceCategories", (n) -> { this.setComplianceCategories(n.getCollectionOfObjectValues(DeviceManagementConfigurationCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceManagementPartners", (n) -> { this.setComplianceManagementPartners(n.getCollectionOfObjectValues(ComplianceManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("compliancePolicies", (n) -> { this.setCompliancePolicies(n.getCollectionOfObjectValues(DeviceManagementCompliancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceSettings", (n) -> { this.setComplianceSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessSettings", (n) -> { this.setConditionalAccessSettings(n.getObjectValue(OnPremisesConditionalAccessSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("configManagerCollections", (n) -> { this.setConfigManagerCollections(n.getCollectionOfObjectValues(ConfigManagerCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationCategories", (n) -> { this.setConfigurationCategories(n.getCollectionOfObjectValues(DeviceManagementConfigurationCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationPolicies", (n) -> { this.setConfigurationPolicies(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationPolicyTemplates", (n) -> { this.setConfigurationPolicyTemplates(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicyTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationSettings", (n) -> { this.setConfigurationSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorStatus", (n) -> { this.setConnectorStatus(n.getCollectionOfObjectValues(ConnectorStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("dataProcessorServiceForWindowsFeaturesOnboarding", (n) -> { this.setDataProcessorServiceForWindowsFeaturesOnboarding(n.getObjectValue(DataProcessorServiceForWindowsFeaturesOnboarding::createFromDiscriminatorValue)); });
        deserializerMap.put("dataSharingConsents", (n) -> { this.setDataSharingConsents(n.getCollectionOfObjectValues(DataSharingConsent::createFromDiscriminatorValue)); });
        deserializerMap.put("depOnboardingSettings", (n) -> { this.setDepOnboardingSettings(n.getCollectionOfObjectValues(DepOnboardingSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("derivedCredentials", (n) -> { this.setDerivedCredentials(n.getCollectionOfObjectValues(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("detectedApps", (n) -> { this.setDetectedApps(n.getCollectionOfObjectValues(DetectedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategories", (n) -> { this.setDeviceCategories(n.getCollectionOfObjectValues(DeviceCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicies", (n) -> { this.setDeviceCompliancePolicies(n.getCollectionOfObjectValues(DeviceCompliancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicyDeviceStateSummary", (n) -> { this.setDeviceCompliancePolicyDeviceStateSummary(n.getObjectValue(DeviceCompliancePolicyDeviceStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCompliancePolicySettingStateSummaries", (n) -> { this.setDeviceCompliancePolicySettingStateSummaries(n.getCollectionOfObjectValues(DeviceCompliancePolicySettingStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceComplianceReportSummarizationDateTime", (n) -> { this.setDeviceComplianceReportSummarizationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceComplianceScripts", (n) -> { this.setDeviceComplianceScripts(n.getCollectionOfObjectValues(DeviceComplianceScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationConflictSummary", (n) -> { this.setDeviceConfigurationConflictSummary(n.getCollectionOfObjectValues(DeviceConfigurationConflictSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationDeviceStateSummaries", (n) -> { this.setDeviceConfigurationDeviceStateSummaries(n.getObjectValue(DeviceConfigurationDeviceStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationProfiles", (n) -> { this.setDeviceConfigurationProfiles(n.getCollectionOfObjectValues(DeviceConfigurationProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationRestrictedAppsViolations", (n) -> { this.setDeviceConfigurationRestrictedAppsViolations(n.getCollectionOfObjectValues(RestrictedAppsViolation::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurations", (n) -> { this.setDeviceConfigurations(n.getCollectionOfObjectValues(DeviceConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationsAllManagedDeviceCertificateStates", (n) -> { this.setDeviceConfigurationsAllManagedDeviceCertificateStates(n.getCollectionOfObjectValues(ManagedAllDeviceCertificateState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationUserStateSummaries", (n) -> { this.setDeviceConfigurationUserStateSummaries(n.getObjectValue(DeviceConfigurationUserStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCustomAttributeShellScripts", (n) -> { this.setDeviceCustomAttributeShellScripts(n.getCollectionOfObjectValues(DeviceCustomAttributeShellScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceEnrollmentConfigurations", (n) -> { this.setDeviceEnrollmentConfigurations(n.getCollectionOfObjectValues(DeviceEnrollmentConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceHealthScripts", (n) -> { this.setDeviceHealthScripts(n.getCollectionOfObjectValues(DeviceHealthScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementPartners", (n) -> { this.setDeviceManagementPartners(n.getCollectionOfObjectValues(DeviceManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementScripts", (n) -> { this.setDeviceManagementScripts(n.getCollectionOfObjectValues(DeviceManagementScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceProtectionOverview", (n) -> { this.setDeviceProtectionOverview(n.getObjectValue(DeviceProtectionOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceShellScripts", (n) -> { this.setDeviceShellScripts(n.getCollectionOfObjectValues(DeviceShellScript::createFromDiscriminatorValue)); });
        deserializerMap.put("domainJoinConnectors", (n) -> { this.setDomainJoinConnectors(n.getCollectionOfObjectValues(DeviceManagementDomainJoinConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("elevationRequests", (n) -> { this.setElevationRequests(n.getCollectionOfObjectValues(PrivilegeManagementElevationRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("embeddedSIMActivationCodePools", (n) -> { this.setEmbeddedSIMActivationCodePools(n.getCollectionOfObjectValues(EmbeddedSIMActivationCodePool::createFromDiscriminatorValue)); });
        deserializerMap.put("endpointPrivilegeManagementProvisioningStatus", (n) -> { this.setEndpointPrivilegeManagementProvisioningStatus(n.getObjectValue(EndpointPrivilegeManagementProvisioningStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeConnectors", (n) -> { this.setExchangeConnectors(n.getCollectionOfObjectValues(DeviceManagementExchangeConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeOnPremisesPolicies", (n) -> { this.setExchangeOnPremisesPolicies(n.getCollectionOfObjectValues(DeviceManagementExchangeOnPremisesPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("exchangeOnPremisesPolicy", (n) -> { this.setExchangeOnPremisesPolicy(n.getObjectValue(DeviceManagementExchangeOnPremisesPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyCategories", (n) -> { this.setGroupPolicyCategories(n.getCollectionOfObjectValues(GroupPolicyCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyConfigurations", (n) -> { this.setGroupPolicyConfigurations(n.getCollectionOfObjectValues(GroupPolicyConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyDefinitionFiles", (n) -> { this.setGroupPolicyDefinitionFiles(n.getCollectionOfObjectValues(GroupPolicyDefinitionFile::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyDefinitions", (n) -> { this.setGroupPolicyDefinitions(n.getCollectionOfObjectValues(GroupPolicyDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyMigrationReports", (n) -> { this.setGroupPolicyMigrationReports(n.getCollectionOfObjectValues(GroupPolicyMigrationReport::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyObjectFiles", (n) -> { this.setGroupPolicyObjectFiles(n.getCollectionOfObjectValues(GroupPolicyObjectFile::createFromDiscriminatorValue)); });
        deserializerMap.put("groupPolicyUploadedDefinitionFiles", (n) -> { this.setGroupPolicyUploadedDefinitionFiles(n.getCollectionOfObjectValues(GroupPolicyUploadedDefinitionFile::createFromDiscriminatorValue)); });
        deserializerMap.put("hardwareConfigurations", (n) -> { this.setHardwareConfigurations(n.getCollectionOfObjectValues(HardwareConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("hardwarePasswordDetails", (n) -> { this.setHardwarePasswordDetails(n.getCollectionOfObjectValues(HardwarePasswordDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("hardwarePasswordInfo", (n) -> { this.setHardwarePasswordInfo(n.getCollectionOfObjectValues(HardwarePasswordInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("importedDeviceIdentities", (n) -> { this.setImportedDeviceIdentities(n.getCollectionOfObjectValues(ImportedDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("importedWindowsAutopilotDeviceIdentities", (n) -> { this.setImportedWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(ImportedWindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("intents", (n) -> { this.setIntents(n.getCollectionOfObjectValues(DeviceManagementIntent::createFromDiscriminatorValue)); });
        deserializerMap.put("intuneAccountId", (n) -> { this.setIntuneAccountId(n.getUUIDValue()); });
        deserializerMap.put("intuneBrand", (n) -> { this.setIntuneBrand(n.getObjectValue(IntuneBrand::createFromDiscriminatorValue)); });
        deserializerMap.put("intuneBrandingProfiles", (n) -> { this.setIntuneBrandingProfiles(n.getCollectionOfObjectValues(IntuneBrandingProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("iosUpdateStatuses", (n) -> { this.setIosUpdateStatuses(n.getCollectionOfObjectValues(IosUpdateDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("lastReportAggregationDateTime", (n) -> { this.setLastReportAggregationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("legacyPcManangementEnabled", (n) -> { this.setLegacyPcManangementEnabled(n.getBooleanValue()); });
        deserializerMap.put("macOSSoftwareUpdateAccountSummaries", (n) -> { this.setMacOSSoftwareUpdateAccountSummaries(n.getCollectionOfObjectValues(MacOSSoftwareUpdateAccountSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceCleanupRules", (n) -> { this.setManagedDeviceCleanupRules(n.getCollectionOfObjectValues(ManagedDeviceCleanupRule::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceCleanupSettings", (n) -> { this.setManagedDeviceCleanupSettings(n.getObjectValue(ManagedDeviceCleanupSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceEncryptionStates", (n) -> { this.setManagedDeviceEncryptionStates(n.getCollectionOfObjectValues(ManagedDeviceEncryptionState::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceOverview", (n) -> { this.setManagedDeviceOverview(n.getObjectValue(ManagedDeviceOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDevices", (n) -> { this.setManagedDevices(n.getCollectionOfObjectValues(ManagedDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceWindowsOSImages", (n) -> { this.setManagedDeviceWindowsOSImages(n.getCollectionOfObjectValues(ManagedDeviceWindowsOperatingSystemImage::createFromDiscriminatorValue)); });
        deserializerMap.put("maximumDepTokens", (n) -> { this.setMaximumDepTokens(n.getIntegerValue()); });
        deserializerMap.put("microsoftTunnelConfigurations", (n) -> { this.setMicrosoftTunnelConfigurations(n.getCollectionOfObjectValues(MicrosoftTunnelConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelHealthThresholds", (n) -> { this.setMicrosoftTunnelHealthThresholds(n.getCollectionOfObjectValues(MicrosoftTunnelHealthThreshold::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelServerLogCollectionResponses", (n) -> { this.setMicrosoftTunnelServerLogCollectionResponses(n.getCollectionOfObjectValues(MicrosoftTunnelServerLogCollectionResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelSites", (n) -> { this.setMicrosoftTunnelSites(n.getCollectionOfObjectValues(MicrosoftTunnelSite::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileAppTroubleshootingEvents", (n) -> { this.setMobileAppTroubleshootingEvents(n.getCollectionOfObjectValues(MobileAppTroubleshootingEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileThreatDefenseConnectors", (n) -> { this.setMobileThreatDefenseConnectors(n.getCollectionOfObjectValues(MobileThreatDefenseConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("monitoring", (n) -> { this.setMonitoring(n.getObjectValue(Monitoring::createFromDiscriminatorValue)); });
        deserializerMap.put("ndesConnectors", (n) -> { this.setNdesConnectors(n.getCollectionOfObjectValues(NdesConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("notificationMessageTemplates", (n) -> { this.setNotificationMessageTemplates(n.getCollectionOfObjectValues(NotificationMessageTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("operationApprovalPolicies", (n) -> { this.setOperationApprovalPolicies(n.getCollectionOfObjectValues(OperationApprovalPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("operationApprovalRequests", (n) -> { this.setOperationApprovalRequests(n.getCollectionOfObjectValues(OperationApprovalRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("privilegeManagementElevations", (n) -> { this.setPrivilegeManagementElevations(n.getCollectionOfObjectValues(PrivilegeManagementElevation::createFromDiscriminatorValue)); });
        deserializerMap.put("remoteActionAudits", (n) -> { this.setRemoteActionAudits(n.getCollectionOfObjectValues(RemoteActionAudit::createFromDiscriminatorValue)); });
        deserializerMap.put("remoteAssistancePartners", (n) -> { this.setRemoteAssistancePartners(n.getCollectionOfObjectValues(RemoteAssistancePartner::createFromDiscriminatorValue)); });
        deserializerMap.put("remoteAssistanceSettings", (n) -> { this.setRemoteAssistanceSettings(n.getObjectValue(RemoteAssistanceSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("reports", (n) -> { this.setReports(n.getObjectValue(DeviceManagementReports::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceAccessProfiles", (n) -> { this.setResourceAccessProfiles(n.getCollectionOfObjectValues(DeviceManagementResourceAccessProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceOperations", (n) -> { this.setResourceOperations(n.getCollectionOfObjectValues(ResourceOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("reusablePolicySettings", (n) -> { this.setReusablePolicySettings(n.getCollectionOfObjectValues(DeviceManagementReusablePolicySetting::createFromDiscriminatorValue)); });
        deserializerMap.put("reusableSettings", (n) -> { this.setReusableSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleAssignments", (n) -> { this.setRoleAssignments(n.getCollectionOfObjectValues(DeviceAndAppManagementRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitions", (n) -> { this.setRoleDefinitions(n.getCollectionOfObjectValues(RoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTags", (n) -> { this.setRoleScopeTags(n.getCollectionOfObjectValues(RoleScopeTag::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceNowConnections", (n) -> { this.setServiceNowConnections(n.getCollectionOfObjectValues(ServiceNowConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("settingDefinitions", (n) -> { this.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(DeviceManagementSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("softwareUpdateStatusSummary", (n) -> { this.setSoftwareUpdateStatusSummary(n.getObjectValue(SoftwareUpdateStatusSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptions", (n) -> { this.setSubscriptions(n.getEnumSetValue(DeviceManagementSubscriptions::forValue)); });
        deserializerMap.put("subscriptionState", (n) -> { this.setSubscriptionState(n.getEnumValue(DeviceManagementSubscriptionState::forValue)); });
        deserializerMap.put("telecomExpenseManagementPartners", (n) -> { this.setTelecomExpenseManagementPartners(n.getCollectionOfObjectValues(TelecomExpenseManagementPartner::createFromDiscriminatorValue)); });
        deserializerMap.put("templateInsights", (n) -> { this.setTemplateInsights(n.getCollectionOfObjectValues(DeviceManagementTemplateInsightsDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("templates", (n) -> { this.setTemplates(n.getCollectionOfObjectValues(DeviceManagementTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("templateSettings", (n) -> { this.setTemplateSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("tenantAttachRBAC", (n) -> { this.setTenantAttachRBAC(n.getObjectValue(TenantAttachRBAC::createFromDiscriminatorValue)); });
        deserializerMap.put("termsAndConditions", (n) -> { this.setTermsAndConditions(n.getCollectionOfObjectValues(TermsAndConditions::createFromDiscriminatorValue)); });
        deserializerMap.put("troubleshootingEvents", (n) -> { this.setTroubleshootingEvents(n.getCollectionOfObjectValues(DeviceManagementTroubleshootingEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("unlicensedAdminstratorsEnabled", (n) -> { this.setUnlicensedAdminstratorsEnabled(n.getBooleanValue()); });
        deserializerMap.put("userExperienceAnalyticsAnomaly", (n) -> { this.setUserExperienceAnalyticsAnomaly(n.getCollectionOfObjectValues(UserExperienceAnalyticsAnomaly::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAnomalyCorrelationGroupOverview", (n) -> { this.setUserExperienceAnalyticsAnomalyCorrelationGroupOverview(n.getCollectionOfObjectValues(UserExperienceAnalyticsAnomalyCorrelationGroupOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAnomalyDevice", (n) -> { this.setUserExperienceAnalyticsAnomalyDevice(n.getCollectionOfObjectValues(UserExperienceAnalyticsAnomalyDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAnomalySeverityOverview", (n) -> { this.setUserExperienceAnalyticsAnomalySeverityOverview(n.getObjectValue(UserExperienceAnalyticsAnomalySeverityOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthApplicationPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", (n) -> { this.setUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDeviceModelPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthDeviceModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDeviceModelPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDevicePerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDevicePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthDevicePerformanceDetails", (n) -> { this.setUserExperienceAnalyticsAppHealthDevicePerformanceDetails(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthDevicePerformanceDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthOSVersionPerformance", (n) -> { this.setUserExperienceAnalyticsAppHealthOSVersionPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsAppHealthOSVersionPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsAppHealthOverview", (n) -> { this.setUserExperienceAnalyticsAppHealthOverview(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBaselines", (n) -> { this.setUserExperienceAnalyticsBaselines(n.getCollectionOfObjectValues(UserExperienceAnalyticsBaseline::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthAppImpact", (n) -> { this.setUserExperienceAnalyticsBatteryHealthAppImpact(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthAppImpact::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthCapacityDetails", (n) -> { this.setUserExperienceAnalyticsBatteryHealthCapacityDetails(n.getObjectValue(UserExperienceAnalyticsBatteryHealthCapacityDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthDeviceAppImpact", (n) -> { this.setUserExperienceAnalyticsBatteryHealthDeviceAppImpact(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDeviceAppImpact::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthDevicePerformance", (n) -> { this.setUserExperienceAnalyticsBatteryHealthDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDevicePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory", (n) -> { this.setUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthModelPerformance", (n) -> { this.setUserExperienceAnalyticsBatteryHealthModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthModelPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthOsPerformance", (n) -> { this.setUserExperienceAnalyticsBatteryHealthOsPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsBatteryHealthOsPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsBatteryHealthRuntimeDetails", (n) -> { this.setUserExperienceAnalyticsBatteryHealthRuntimeDetails(n.getObjectValue(UserExperienceAnalyticsBatteryHealthRuntimeDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsCategories", (n) -> { this.setUserExperienceAnalyticsCategories(n.getCollectionOfObjectValues(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceMetricHistory", (n) -> { this.setUserExperienceAnalyticsDeviceMetricHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetricHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDevicePerformance", (n) -> { this.setUserExperienceAnalyticsDevicePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsDevicePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceScope", (n) -> { this.setUserExperienceAnalyticsDeviceScope(n.getObjectValue(UserExperienceAnalyticsDeviceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceScopes", (n) -> { this.setUserExperienceAnalyticsDeviceScopes(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceScores", (n) -> { this.setUserExperienceAnalyticsDeviceScores(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceScores::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupHistory", (n) -> { this.setUserExperienceAnalyticsDeviceStartupHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupProcesses", (n) -> { this.setUserExperienceAnalyticsDeviceStartupProcesses(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupProcess::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceStartupProcessPerformance", (n) -> { this.setUserExperienceAnalyticsDeviceStartupProcessPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceStartupProcessPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDevicesWithoutCloudIdentity", (n) -> { this.setUserExperienceAnalyticsDevicesWithoutCloudIdentity(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceWithoutCloudIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsDeviceTimelineEvent", (n) -> { this.setUserExperienceAnalyticsDeviceTimelineEvent(n.getCollectionOfObjectValues(UserExperienceAnalyticsDeviceTimelineEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsImpactingProcess", (n) -> { this.setUserExperienceAnalyticsImpactingProcess(n.getCollectionOfObjectValues(UserExperienceAnalyticsImpactingProcess::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsMetricHistory", (n) -> { this.setUserExperienceAnalyticsMetricHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsMetricHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsModelScores", (n) -> { this.setUserExperienceAnalyticsModelScores(n.getCollectionOfObjectValues(UserExperienceAnalyticsModelScores::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsNotAutopilotReadyDevice", (n) -> { this.setUserExperienceAnalyticsNotAutopilotReadyDevice(n.getCollectionOfObjectValues(UserExperienceAnalyticsNotAutopilotReadyDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsOverview", (n) -> { this.setUserExperienceAnalyticsOverview(n.getObjectValue(UserExperienceAnalyticsOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsRemoteConnection", (n) -> { this.setUserExperienceAnalyticsRemoteConnection(n.getCollectionOfObjectValues(UserExperienceAnalyticsRemoteConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsResourcePerformance", (n) -> { this.setUserExperienceAnalyticsResourcePerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsResourcePerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsScoreHistory", (n) -> { this.setUserExperienceAnalyticsScoreHistory(n.getCollectionOfObjectValues(UserExperienceAnalyticsScoreHistory::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsSettings", (n) -> { this.setUserExperienceAnalyticsSettings(n.getObjectValue(UserExperienceAnalyticsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric(n.getObjectValue(UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereMetrics", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereMetrics(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereMetric::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperienceAnalyticsWorkFromAnywhereModelPerformance", (n) -> { this.setUserExperienceAnalyticsWorkFromAnywhereModelPerformance(n.getCollectionOfObjectValues(UserExperienceAnalyticsWorkFromAnywhereModelPerformance::createFromDiscriminatorValue)); });
        deserializerMap.put("userPfxCertificates", (n) -> { this.setUserPfxCertificates(n.getCollectionOfObjectValues(UserPFXCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("virtualEndpoint", (n) -> { this.setVirtualEndpoint(n.getObjectValue(VirtualEndpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsAutopilotDeploymentProfiles", (n) -> { this.setWindowsAutopilotDeploymentProfiles(n.getCollectionOfObjectValues(WindowsAutopilotDeploymentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsAutopilotDeviceIdentities", (n) -> { this.setWindowsAutopilotDeviceIdentities(n.getCollectionOfObjectValues(WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsAutopilotSettings", (n) -> { this.setWindowsAutopilotSettings(n.getObjectValue(WindowsAutopilotSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsDriverUpdateProfiles", (n) -> { this.setWindowsDriverUpdateProfiles(n.getCollectionOfObjectValues(WindowsDriverUpdateProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsFeatureUpdateProfiles", (n) -> { this.setWindowsFeatureUpdateProfiles(n.getCollectionOfObjectValues(WindowsFeatureUpdateProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionAppLearningSummaries", (n) -> { this.setWindowsInformationProtectionAppLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionAppLearningSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsInformationProtectionNetworkLearningSummaries", (n) -> { this.setWindowsInformationProtectionNetworkLearningSummaries(n.getCollectionOfObjectValues(WindowsInformationProtectionNetworkLearningSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsMalwareInformation", (n) -> { this.setWindowsMalwareInformation(n.getCollectionOfObjectValues(WindowsMalwareInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsMalwareOverview", (n) -> { this.setWindowsMalwareOverview(n.getObjectValue(WindowsMalwareOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsQualityUpdatePolicies", (n) -> { this.setWindowsQualityUpdatePolicies(n.getCollectionOfObjectValues(WindowsQualityUpdatePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsQualityUpdateProfiles", (n) -> { this.setWindowsQualityUpdateProfiles(n.getCollectionOfObjectValues(WindowsQualityUpdateProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsUpdateCatalogItems", (n) -> { this.setWindowsUpdateCatalogItems(n.getCollectionOfObjectValues(WindowsUpdateCatalogItem::createFromDiscriminatorValue)); });
        deserializerMap.put("zebraFotaArtifacts", (n) -> { this.setZebraFotaArtifacts(n.getCollectionOfObjectValues(ZebraFotaArtifact::createFromDiscriminatorValue)); });
        deserializerMap.put("zebraFotaConnector", (n) -> { this.setZebraFotaConnector(n.getObjectValue(ZebraFotaConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("zebraFotaDeployments", (n) -> { this.setZebraFotaDeployments(n.getCollectionOfObjectValues(ZebraFotaDeployment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyCategories property value. The available group policy categories for this account.
     * @return a {@link java.util.List<GroupPolicyCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyCategory> getGroupPolicyCategories() {
        return this.backingStore.get("groupPolicyCategories");
    }
    /**
     * Gets the groupPolicyConfigurations property value. The group policy configurations created by this account.
     * @return a {@link java.util.List<GroupPolicyConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyConfiguration> getGroupPolicyConfigurations() {
        return this.backingStore.get("groupPolicyConfigurations");
    }
    /**
     * Gets the groupPolicyDefinitionFiles property value. The available group policy definition files for this account.
     * @return a {@link java.util.List<GroupPolicyDefinitionFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinitionFile> getGroupPolicyDefinitionFiles() {
        return this.backingStore.get("groupPolicyDefinitionFiles");
    }
    /**
     * Gets the groupPolicyDefinitions property value. The available group policy definitions for this account.
     * @return a {@link java.util.List<GroupPolicyDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyDefinition> getGroupPolicyDefinitions() {
        return this.backingStore.get("groupPolicyDefinitions");
    }
    /**
     * Gets the groupPolicyMigrationReports property value. A list of Group Policy migration reports.
     * @return a {@link java.util.List<GroupPolicyMigrationReport>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyMigrationReport> getGroupPolicyMigrationReports() {
        return this.backingStore.get("groupPolicyMigrationReports");
    }
    /**
     * Gets the groupPolicyObjectFiles property value. A list of Group Policy Object files uploaded.
     * @return a {@link java.util.List<GroupPolicyObjectFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyObjectFile> getGroupPolicyObjectFiles() {
        return this.backingStore.get("groupPolicyObjectFiles");
    }
    /**
     * Gets the groupPolicyUploadedDefinitionFiles property value. The available group policy uploaded definition files for this account.
     * @return a {@link java.util.List<GroupPolicyUploadedDefinitionFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GroupPolicyUploadedDefinitionFile> getGroupPolicyUploadedDefinitionFiles() {
        return this.backingStore.get("groupPolicyUploadedDefinitionFiles");
    }
    /**
     * Gets the hardwareConfigurations property value. BIOS configuration and other settings provides customers the ability to configure hardware/bios settings on the enrolled Windows 10/11 Entra ID joined devices by uploading a configuration file generated with their OEM tool (e.g. Dell Command tool). A BIOS configuration policy can be assigned to multiple devices, allowing admins to remotely control a device's hardware properties (e.g. enable Secure Boot) from the Intune Portal. Supported for Dell only at this time.
     * @return a {@link java.util.List<HardwareConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HardwareConfiguration> getHardwareConfigurations() {
        return this.backingStore.get("hardwareConfigurations");
    }
    /**
     * Gets the hardwarePasswordDetails property value. Device BIOS password information for devices with managed BIOS and firmware configuration, which provides device serial number, list of previous passwords, and current password.
     * @return a {@link java.util.List<HardwarePasswordDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HardwarePasswordDetail> getHardwarePasswordDetails() {
        return this.backingStore.get("hardwarePasswordDetails");
    }
    /**
     * Gets the hardwarePasswordInfo property value. Intune will provide customer the ability to configure BIOS configuration settings on the enrolled Windows 10 and Windows 11 Microsoft Entra joined devices. Starting from June, 2024, customers should start using hardwarePasswordDetail resource type - Microsoft Graph beta | Microsoft Learn. HardwarePasswordInfo will be marked as deprecated with Intune Release 2409
     * @return a {@link java.util.List<HardwarePasswordInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HardwarePasswordInfo> getHardwarePasswordInfo() {
        return this.backingStore.get("hardwarePasswordInfo");
    }
    /**
     * Gets the importedDeviceIdentities property value. The imported device identities.
     * @return a {@link java.util.List<ImportedDeviceIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImportedDeviceIdentity> getImportedDeviceIdentities() {
        return this.backingStore.get("importedDeviceIdentities");
    }
    /**
     * Gets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @return a {@link java.util.List<ImportedWindowsAutopilotDeviceIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImportedWindowsAutopilotDeviceIdentity> getImportedWindowsAutopilotDeviceIdentities() {
        return this.backingStore.get("importedWindowsAutopilotDeviceIdentities");
    }
    /**
     * Gets the intents property value. The device management intents
     * @return a {@link java.util.List<DeviceManagementIntent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementIntent> getIntents() {
        return this.backingStore.get("intents");
    }
    /**
     * Gets the intuneAccountId property value. Intune Account ID for given tenant
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getIntuneAccountId() {
        return this.backingStore.get("intuneAccountId");
    }
    /**
     * Gets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @return a {@link IntuneBrand}
     */
    @jakarta.annotation.Nullable
    public IntuneBrand getIntuneBrand() {
        return this.backingStore.get("intuneBrand");
    }
    /**
     * Gets the intuneBrandingProfiles property value. Intune branding profiles targeted to AAD groups
     * @return a {@link java.util.List<IntuneBrandingProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IntuneBrandingProfile> getIntuneBrandingProfiles() {
        return this.backingStore.get("intuneBrandingProfiles");
    }
    /**
     * Gets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @return a {@link java.util.List<IosUpdateDeviceStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosUpdateDeviceStatus> getIosUpdateStatuses() {
        return this.backingStore.get("iosUpdateStatuses");
    }
    /**
     * Gets the lastReportAggregationDateTime property value. The last modified time of reporting for this account. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportAggregationDateTime() {
        return this.backingStore.get("lastReportAggregationDateTime");
    }
    /**
     * Gets the legacyPcManangementEnabled property value. The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLegacyPcManangementEnabled() {
        return this.backingStore.get("legacyPcManangementEnabled");
    }
    /**
     * Gets the macOSSoftwareUpdateAccountSummaries property value. The MacOS software update account summaries for this account.
     * @return a {@link java.util.List<MacOSSoftwareUpdateAccountSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSSoftwareUpdateAccountSummary> getMacOSSoftwareUpdateAccountSummaries() {
        return this.backingStore.get("macOSSoftwareUpdateAccountSummaries");
    }
    /**
     * Gets the managedDeviceCleanupRules property value. Device cleanup rule V2
     * @return a {@link java.util.List<ManagedDeviceCleanupRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceCleanupRule> getManagedDeviceCleanupRules() {
        return this.backingStore.get("managedDeviceCleanupRules");
    }
    /**
     * Gets the managedDeviceCleanupSettings property value. Device cleanup rule
     * @return a {@link ManagedDeviceCleanupSettings}
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceCleanupSettings getManagedDeviceCleanupSettings() {
        return this.backingStore.get("managedDeviceCleanupSettings");
    }
    /**
     * Gets the managedDeviceEncryptionStates property value. Encryption report for devices in this account
     * @return a {@link java.util.List<ManagedDeviceEncryptionState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceEncryptionState> getManagedDeviceEncryptionStates() {
        return this.backingStore.get("managedDeviceEncryptionStates");
    }
    /**
     * Gets the managedDeviceOverview property value. Device overview
     * @return a {@link ManagedDeviceOverview}
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceOverview getManagedDeviceOverview() {
        return this.backingStore.get("managedDeviceOverview");
    }
    /**
     * Gets the managedDevices property value. The list of managed devices.
     * @return a {@link java.util.List<ManagedDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDevice> getManagedDevices() {
        return this.backingStore.get("managedDevices");
    }
    /**
     * Gets the managedDeviceWindowsOSImages property value. A list of ManagedDeviceWindowsOperatingSystemImages
     * @return a {@link java.util.List<ManagedDeviceWindowsOperatingSystemImage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceWindowsOperatingSystemImage> getManagedDeviceWindowsOSImages() {
        return this.backingStore.get("managedDeviceWindowsOSImages");
    }
    /**
     * Gets the maximumDepTokens property value. Maximum number of DEP tokens allowed per-tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumDepTokens() {
        return this.backingStore.get("maximumDepTokens");
    }
    /**
     * Gets the microsoftTunnelConfigurations property value. Collection of MicrosoftTunnelConfiguration settings associated with account.
     * @return a {@link java.util.List<MicrosoftTunnelConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftTunnelConfiguration> getMicrosoftTunnelConfigurations() {
        return this.backingStore.get("microsoftTunnelConfigurations");
    }
    /**
     * Gets the microsoftTunnelHealthThresholds property value. Collection of MicrosoftTunnelHealthThreshold settings associated with account.
     * @return a {@link java.util.List<MicrosoftTunnelHealthThreshold>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftTunnelHealthThreshold> getMicrosoftTunnelHealthThresholds() {
        return this.backingStore.get("microsoftTunnelHealthThresholds");
    }
    /**
     * Gets the microsoftTunnelServerLogCollectionResponses property value. Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @return a {@link java.util.List<MicrosoftTunnelServerLogCollectionResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftTunnelServerLogCollectionResponse> getMicrosoftTunnelServerLogCollectionResponses() {
        return this.backingStore.get("microsoftTunnelServerLogCollectionResponses");
    }
    /**
     * Gets the microsoftTunnelSites property value. Collection of MicrosoftTunnelSite settings associated with account.
     * @return a {@link java.util.List<MicrosoftTunnelSite>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftTunnelSite> getMicrosoftTunnelSites() {
        return this.backingStore.get("microsoftTunnelSites");
    }
    /**
     * Gets the mobileAppTroubleshootingEvents property value. The collection property of MobileAppTroubleshootingEvent.
     * @return a {@link java.util.List<MobileAppTroubleshootingEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileAppTroubleshootingEvent> getMobileAppTroubleshootingEvents() {
        return this.backingStore.get("mobileAppTroubleshootingEvents");
    }
    /**
     * Gets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @return a {@link java.util.List<MobileThreatDefenseConnector>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileThreatDefenseConnector> getMobileThreatDefenseConnectors() {
        return this.backingStore.get("mobileThreatDefenseConnectors");
    }
    /**
     * Gets the monitoring property value. The monitoring property
     * @return a {@link Monitoring}
     */
    @jakarta.annotation.Nullable
    public Monitoring getMonitoring() {
        return this.backingStore.get("monitoring");
    }
    /**
     * Gets the ndesConnectors property value. The collection of Ndes connectors for this account.
     * @return a {@link java.util.List<NdesConnector>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NdesConnector> getNdesConnectors() {
        return this.backingStore.get("ndesConnectors");
    }
    /**
     * Gets the notificationMessageTemplates property value. The Notification Message Templates.
     * @return a {@link java.util.List<NotificationMessageTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationMessageTemplate> getNotificationMessageTemplates() {
        return this.backingStore.get("notificationMessageTemplates");
    }
    /**
     * Gets the operationApprovalPolicies property value. The Operation Approval Policies
     * @return a {@link java.util.List<OperationApprovalPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OperationApprovalPolicy> getOperationApprovalPolicies() {
        return this.backingStore.get("operationApprovalPolicies");
    }
    /**
     * Gets the operationApprovalRequests property value. The Operation Approval Requests
     * @return a {@link java.util.List<OperationApprovalRequest>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OperationApprovalRequest> getOperationApprovalRequests() {
        return this.backingStore.get("operationApprovalRequests");
    }
    /**
     * Gets the privilegeManagementElevations property value. The endpoint privilege management elevation event entity contains elevation details.
     * @return a {@link java.util.List<PrivilegeManagementElevation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivilegeManagementElevation> getPrivilegeManagementElevations() {
        return this.backingStore.get("privilegeManagementElevations");
    }
    /**
     * Gets the remoteActionAudits property value. The list of device remote action audits with the tenant.
     * @return a {@link java.util.List<RemoteActionAudit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RemoteActionAudit> getRemoteActionAudits() {
        return this.backingStore.get("remoteActionAudits");
    }
    /**
     * Gets the remoteAssistancePartners property value. The remote assist partners.
     * @return a {@link java.util.List<RemoteAssistancePartner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RemoteAssistancePartner> getRemoteAssistancePartners() {
        return this.backingStore.get("remoteAssistancePartners");
    }
    /**
     * Gets the remoteAssistanceSettings property value. The remote assistance settings singleton
     * @return a {@link RemoteAssistanceSettings}
     */
    @jakarta.annotation.Nullable
    public RemoteAssistanceSettings getRemoteAssistanceSettings() {
        return this.backingStore.get("remoteAssistanceSettings");
    }
    /**
     * Gets the reports property value. Reports singleton
     * @return a {@link DeviceManagementReports}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementReports getReports() {
        return this.backingStore.get("reports");
    }
    /**
     * Gets the resourceAccessProfiles property value. Collection of resource access settings associated with account.
     * @return a {@link java.util.List<DeviceManagementResourceAccessProfileBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementResourceAccessProfileBase> getResourceAccessProfiles() {
        return this.backingStore.get("resourceAccessProfiles");
    }
    /**
     * Gets the resourceOperations property value. The Resource Operations.
     * @return a {@link java.util.List<ResourceOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ResourceOperation> getResourceOperations() {
        return this.backingStore.get("resourceOperations");
    }
    /**
     * Gets the reusablePolicySettings property value. List of all reusable settings that can be referred in a policy
     * @return a {@link java.util.List<DeviceManagementReusablePolicySetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementReusablePolicySetting> getReusablePolicySettings() {
        return this.backingStore.get("reusablePolicySettings");
    }
    /**
     * Gets the reusableSettings property value. List of all reusable settings
     * @return a {@link java.util.List<DeviceManagementConfigurationSettingDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getReusableSettings() {
        return this.backingStore.get("reusableSettings");
    }
    /**
     * Gets the roleAssignments property value. The Role Assignments.
     * @return a {@link java.util.List<DeviceAndAppManagementRoleAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceAndAppManagementRoleAssignment> getRoleAssignments() {
        return this.backingStore.get("roleAssignments");
    }
    /**
     * Gets the roleDefinitions property value. The Role Definitions.
     * @return a {@link java.util.List<RoleDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RoleDefinition> getRoleDefinitions() {
        return this.backingStore.get("roleDefinitions");
    }
    /**
     * Gets the roleScopeTags property value. The Role Scope Tags.
     * @return a {@link java.util.List<RoleScopeTag>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RoleScopeTag> getRoleScopeTags() {
        return this.backingStore.get("roleScopeTags");
    }
    /**
     * Gets the serviceNowConnections property value. A list of ServiceNowConnections
     * @return a {@link java.util.List<ServiceNowConnection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceNowConnection> getServiceNowConnections() {
        return this.backingStore.get("serviceNowConnections");
    }
    /**
     * Gets the settingDefinitions property value. The device management intent setting definitions
     * @return a {@link java.util.List<DeviceManagementSettingDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingDefinition> getSettingDefinitions() {
        return this.backingStore.get("settingDefinitions");
    }
    /**
     * Gets the settings property value. Account level settings.
     * @return a {@link DeviceManagementSettings}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the softwareUpdateStatusSummary property value. The software update status summary.
     * @return a {@link SoftwareUpdateStatusSummary}
     */
    @jakarta.annotation.Nullable
    public SoftwareUpdateStatusSummary getSoftwareUpdateStatusSummary() {
        return this.backingStore.get("softwareUpdateStatusSummary");
    }
    /**
     * Gets the subscriptions property value. Tenant mobile device management subscriptions.
     * @return a {@link EnumSet<DeviceManagementSubscriptions>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementSubscriptions> getSubscriptions() {
        return this.backingStore.get("subscriptions");
    }
    /**
     * Gets the subscriptionState property value. Tenant mobile device management subscription state.
     * @return a {@link DeviceManagementSubscriptionState}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementSubscriptionState getSubscriptionState() {
        return this.backingStore.get("subscriptionState");
    }
    /**
     * Gets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @return a {@link java.util.List<TelecomExpenseManagementPartner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TelecomExpenseManagementPartner> getTelecomExpenseManagementPartners() {
        return this.backingStore.get("telecomExpenseManagementPartners");
    }
    /**
     * Gets the templateInsights property value. List of setting insights in a template
     * @return a {@link java.util.List<DeviceManagementTemplateInsightsDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTemplateInsightsDefinition> getTemplateInsights() {
        return this.backingStore.get("templateInsights");
    }
    /**
     * Gets the templates property value. The available templates
     * @return a {@link java.util.List<DeviceManagementTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTemplate> getTemplates() {
        return this.backingStore.get("templates");
    }
    /**
     * Gets the templateSettings property value. List of all TemplateSettings
     * @return a {@link java.util.List<DeviceManagementConfigurationSettingTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingTemplate> getTemplateSettings() {
        return this.backingStore.get("templateSettings");
    }
    /**
     * Gets the tenantAttachRBAC property value. TenantAttach RBAC Enablement
     * @return a {@link TenantAttachRBAC}
     */
    @jakarta.annotation.Nullable
    public TenantAttachRBAC getTenantAttachRBAC() {
        return this.backingStore.get("tenantAttachRBAC");
    }
    /**
     * Gets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @return a {@link java.util.List<TermsAndConditions>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TermsAndConditions> getTermsAndConditions() {
        return this.backingStore.get("termsAndConditions");
    }
    /**
     * Gets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @return a {@link java.util.List<DeviceManagementTroubleshootingEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingEvent> getTroubleshootingEvents() {
        return this.backingStore.get("troubleshootingEvents");
    }
    /**
     * Gets the unlicensedAdminstratorsEnabled property value. When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUnlicensedAdminstratorsEnabled() {
        return this.backingStore.get("unlicensedAdminstratorsEnabled");
    }
    /**
     * Gets the userExperienceAnalyticsAnomaly property value. The user experience analytics anomaly entity contains anomaly details.
     * @return a {@link java.util.List<UserExperienceAnalyticsAnomaly>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAnomaly> getUserExperienceAnalyticsAnomaly() {
        return this.backingStore.get("userExperienceAnalyticsAnomaly");
    }
    /**
     * Gets the userExperienceAnalyticsAnomalyCorrelationGroupOverview property value. The user experience analytics anomaly correlation group overview entity contains the information for each correlation group of an anomaly.
     * @return a {@link java.util.List<UserExperienceAnalyticsAnomalyCorrelationGroupOverview>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAnomalyCorrelationGroupOverview> getUserExperienceAnalyticsAnomalyCorrelationGroupOverview() {
        return this.backingStore.get("userExperienceAnalyticsAnomalyCorrelationGroupOverview");
    }
    /**
     * Gets the userExperienceAnalyticsAnomalyDevice property value. The user experience analytics anomaly entity contains device details.
     * @return a {@link java.util.List<UserExperienceAnalyticsAnomalyDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAnomalyDevice> getUserExperienceAnalyticsAnomalyDevice() {
        return this.backingStore.get("userExperienceAnalyticsAnomalyDevice");
    }
    /**
     * Gets the userExperienceAnalyticsAnomalySeverityOverview property value. The user experience analytics anomaly severity overview entity contains the count information for each severity of anomaly.
     * @return a {@link UserExperienceAnalyticsAnomalySeverityOverview}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAnomalySeverityOverview getUserExperienceAnalyticsAnomalySeverityOverview() {
        return this.backingStore.get("userExperienceAnalyticsAnomalySeverityOverview");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformance property value. User experience analytics appHealth Application Performance
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> getUserExperienceAnalyticsAppHealthApplicationPerformance() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthApplicationPerformance");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property value. User experience analytics appHealth Application Performance by App Version
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property value. User experience analytics appHealth Application Performance by App Version details
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property value. User experience analytics appHealth Application Performance by App Version Device Id
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property value. User experience analytics appHealth Application Performance by OS Version
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> getUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDeviceModelPerformance property value. User experience analytics appHealth Model Performance
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> getUserExperienceAnalyticsAppHealthDeviceModelPerformance() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthDeviceModelPerformance");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDevicePerformance property value. User experience analytics appHealth Device Performance
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> getUserExperienceAnalyticsAppHealthDevicePerformance() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthDevicePerformance");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthDevicePerformanceDetails property value. User experience analytics device performance details
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> getUserExperienceAnalyticsAppHealthDevicePerformanceDetails() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthDevicePerformanceDetails");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthOSVersionPerformance property value. User experience analytics appHealth OS version Performance
     * @return a {@link java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> getUserExperienceAnalyticsAppHealthOSVersionPerformance() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthOSVersionPerformance");
    }
    /**
     * Gets the userExperienceAnalyticsAppHealthOverview property value. User experience analytics appHealth overview
     * @return a {@link UserExperienceAnalyticsCategory}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsCategory getUserExperienceAnalyticsAppHealthOverview() {
        return this.backingStore.get("userExperienceAnalyticsAppHealthOverview");
    }
    /**
     * Gets the userExperienceAnalyticsBaselines property value. User experience analytics baselines
     * @return a {@link java.util.List<UserExperienceAnalyticsBaseline>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBaseline> getUserExperienceAnalyticsBaselines() {
        return this.backingStore.get("userExperienceAnalyticsBaselines");
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthAppImpact property value. User Experience Analytics Battery Health App Impact
     * @return a {@link java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact> getUserExperienceAnalyticsBatteryHealthAppImpact() {
        return this.backingStore.get("userExperienceAnalyticsBatteryHealthAppImpact");
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthCapacityDetails property value. User Experience Analytics Battery Health Capacity Details
     * @return a {@link UserExperienceAnalyticsBatteryHealthCapacityDetails}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthCapacityDetails getUserExperienceAnalyticsBatteryHealthCapacityDetails() {
        return this.backingStore.get("userExperienceAnalyticsBatteryHealthCapacityDetails");
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDeviceAppImpact property value. User Experience Analytics Battery Health Device App Impact
     * @return a {@link java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact> getUserExperienceAnalyticsBatteryHealthDeviceAppImpact() {
        return this.backingStore.get("userExperienceAnalyticsBatteryHealthDeviceAppImpact");
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDevicePerformance property value. User Experience Analytics Battery Health Device Performance
     * @return a {@link java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance> getUserExperienceAnalyticsBatteryHealthDevicePerformance() {
        return this.backingStore.get("userExperienceAnalyticsBatteryHealthDevicePerformance");
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property value. User Experience Analytics Battery Health Device Runtime History
     * @return a {@link java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory> getUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory() {
        return this.backingStore.get("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory");
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthModelPerformance property value. User Experience Analytics Battery Health Model Performance
     * @return a {@link java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance> getUserExperienceAnalyticsBatteryHealthModelPerformance() {
        return this.backingStore.get("userExperienceAnalyticsBatteryHealthModelPerformance");
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthOsPerformance property value. User Experience Analytics Battery Health Os Performance
     * @return a {@link java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance> getUserExperienceAnalyticsBatteryHealthOsPerformance() {
        return this.backingStore.get("userExperienceAnalyticsBatteryHealthOsPerformance");
    }
    /**
     * Gets the userExperienceAnalyticsBatteryHealthRuntimeDetails property value. User Experience Analytics Battery Health Runtime Details
     * @return a {@link UserExperienceAnalyticsBatteryHealthRuntimeDetails}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthRuntimeDetails getUserExperienceAnalyticsBatteryHealthRuntimeDetails() {
        return this.backingStore.get("userExperienceAnalyticsBatteryHealthRuntimeDetails");
    }
    /**
     * Gets the userExperienceAnalyticsCategories property value. User experience analytics categories
     * @return a {@link java.util.List<UserExperienceAnalyticsCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsCategory> getUserExperienceAnalyticsCategories() {
        return this.backingStore.get("userExperienceAnalyticsCategories");
    }
    /**
     * Gets the userExperienceAnalyticsDeviceMetricHistory property value. User experience analytics device metric history
     * @return a {@link java.util.List<UserExperienceAnalyticsMetricHistory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetricHistory> getUserExperienceAnalyticsDeviceMetricHistory() {
        return this.backingStore.get("userExperienceAnalyticsDeviceMetricHistory");
    }
    /**
     * Gets the userExperienceAnalyticsDevicePerformance property value. User experience analytics device performance
     * @return a {@link java.util.List<UserExperienceAnalyticsDevicePerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDevicePerformance> getUserExperienceAnalyticsDevicePerformance() {
        return this.backingStore.get("userExperienceAnalyticsDevicePerformance");
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScope property value. The user experience analytics device scope entity endpoint to trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @return a {@link UserExperienceAnalyticsDeviceScope}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsDeviceScope getUserExperienceAnalyticsDeviceScope() {
        return this.backingStore.get("userExperienceAnalyticsDeviceScope");
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScopes property value. The user experience analytics device scope entity contains device scope configuration use to apply filtering on the endpoint analytics reports.
     * @return a {@link java.util.List<UserExperienceAnalyticsDeviceScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceScope> getUserExperienceAnalyticsDeviceScopes() {
        return this.backingStore.get("userExperienceAnalyticsDeviceScopes");
    }
    /**
     * Gets the userExperienceAnalyticsDeviceScores property value. User experience analytics device scores
     * @return a {@link java.util.List<UserExperienceAnalyticsDeviceScores>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceScores> getUserExperienceAnalyticsDeviceScores() {
        return this.backingStore.get("userExperienceAnalyticsDeviceScores");
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupHistory property value. User experience analytics device Startup History
     * @return a {@link java.util.List<UserExperienceAnalyticsDeviceStartupHistory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupHistory> getUserExperienceAnalyticsDeviceStartupHistory() {
        return this.backingStore.get("userExperienceAnalyticsDeviceStartupHistory");
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupProcesses property value. User experience analytics device Startup Processes
     * @return a {@link java.util.List<UserExperienceAnalyticsDeviceStartupProcess>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupProcess> getUserExperienceAnalyticsDeviceStartupProcesses() {
        return this.backingStore.get("userExperienceAnalyticsDeviceStartupProcesses");
    }
    /**
     * Gets the userExperienceAnalyticsDeviceStartupProcessPerformance property value. User experience analytics device Startup Process Performance
     * @return a {@link java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> getUserExperienceAnalyticsDeviceStartupProcessPerformance() {
        return this.backingStore.get("userExperienceAnalyticsDeviceStartupProcessPerformance");
    }
    /**
     * Gets the userExperienceAnalyticsDevicesWithoutCloudIdentity property value. User experience analytics devices without cloud identity.
     * @return a {@link java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity> getUserExperienceAnalyticsDevicesWithoutCloudIdentity() {
        return this.backingStore.get("userExperienceAnalyticsDevicesWithoutCloudIdentity");
    }
    /**
     * Gets the userExperienceAnalyticsDeviceTimelineEvent property value. The user experience analytics device events entity contains NRT device timeline event details.
     * @return a {@link java.util.List<UserExperienceAnalyticsDeviceTimelineEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsDeviceTimelineEvent> getUserExperienceAnalyticsDeviceTimelineEvent() {
        return this.backingStore.get("userExperienceAnalyticsDeviceTimelineEvent");
    }
    /**
     * Gets the userExperienceAnalyticsImpactingProcess property value. User experience analytics impacting process
     * @return a {@link java.util.List<UserExperienceAnalyticsImpactingProcess>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsImpactingProcess> getUserExperienceAnalyticsImpactingProcess() {
        return this.backingStore.get("userExperienceAnalyticsImpactingProcess");
    }
    /**
     * Gets the userExperienceAnalyticsMetricHistory property value. User experience analytics metric history
     * @return a {@link java.util.List<UserExperienceAnalyticsMetricHistory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsMetricHistory> getUserExperienceAnalyticsMetricHistory() {
        return this.backingStore.get("userExperienceAnalyticsMetricHistory");
    }
    /**
     * Gets the userExperienceAnalyticsModelScores property value. User experience analytics model scores
     * @return a {@link java.util.List<UserExperienceAnalyticsModelScores>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsModelScores> getUserExperienceAnalyticsModelScores() {
        return this.backingStore.get("userExperienceAnalyticsModelScores");
    }
    /**
     * Gets the userExperienceAnalyticsNotAutopilotReadyDevice property value. User experience analytics devices not Windows Autopilot ready.
     * @return a {@link java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice> getUserExperienceAnalyticsNotAutopilotReadyDevice() {
        return this.backingStore.get("userExperienceAnalyticsNotAutopilotReadyDevice");
    }
    /**
     * Gets the userExperienceAnalyticsOverview property value. User experience analytics overview
     * @return a {@link UserExperienceAnalyticsOverview}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsOverview getUserExperienceAnalyticsOverview() {
        return this.backingStore.get("userExperienceAnalyticsOverview");
    }
    /**
     * Gets the userExperienceAnalyticsRemoteConnection property value. User experience analytics remote connection
     * @return a {@link java.util.List<UserExperienceAnalyticsRemoteConnection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsRemoteConnection> getUserExperienceAnalyticsRemoteConnection() {
        return this.backingStore.get("userExperienceAnalyticsRemoteConnection");
    }
    /**
     * Gets the userExperienceAnalyticsResourcePerformance property value. User experience analytics resource performance
     * @return a {@link java.util.List<UserExperienceAnalyticsResourcePerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsResourcePerformance> getUserExperienceAnalyticsResourcePerformance() {
        return this.backingStore.get("userExperienceAnalyticsResourcePerformance");
    }
    /**
     * Gets the userExperienceAnalyticsScoreHistory property value. User experience analytics device Startup Score History
     * @return a {@link java.util.List<UserExperienceAnalyticsScoreHistory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsScoreHistory> getUserExperienceAnalyticsScoreHistory() {
        return this.backingStore.get("userExperienceAnalyticsScoreHistory");
    }
    /**
     * Gets the userExperienceAnalyticsSettings property value. User experience analytics device settings
     * @return a {@link UserExperienceAnalyticsSettings}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsSettings getUserExperienceAnalyticsSettings() {
        return this.backingStore.get("userExperienceAnalyticsSettings");
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property value. User experience analytics work from anywhere hardware readiness metrics.
     * @return a {@link UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric}
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric getUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric() {
        return this.backingStore.get("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric");
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereMetrics property value. User experience analytics work from anywhere metrics.
     * @return a {@link java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> getUserExperienceAnalyticsWorkFromAnywhereMetrics() {
        return this.backingStore.get("userExperienceAnalyticsWorkFromAnywhereMetrics");
    }
    /**
     * Gets the userExperienceAnalyticsWorkFromAnywhereModelPerformance property value. The user experience analytics work from anywhere model performance
     * @return a {@link java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> getUserExperienceAnalyticsWorkFromAnywhereModelPerformance() {
        return this.backingStore.get("userExperienceAnalyticsWorkFromAnywhereModelPerformance");
    }
    /**
     * Gets the userPfxCertificates property value. Collection of PFX certificates associated with a user.
     * @return a {@link java.util.List<UserPFXCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserPFXCertificate> getUserPfxCertificates() {
        return this.backingStore.get("userPfxCertificates");
    }
    /**
     * Gets the virtualEndpoint property value. The virtualEndpoint property
     * @return a {@link VirtualEndpoint}
     */
    @jakarta.annotation.Nullable
    public VirtualEndpoint getVirtualEndpoint() {
        return this.backingStore.get("virtualEndpoint");
    }
    /**
     * Gets the windowsAutopilotDeploymentProfiles property value. Windows auto pilot deployment profiles
     * @return a {@link java.util.List<WindowsAutopilotDeploymentProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsAutopilotDeploymentProfile> getWindowsAutopilotDeploymentProfiles() {
        return this.backingStore.get("windowsAutopilotDeploymentProfiles");
    }
    /**
     * Gets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @return a {@link java.util.List<WindowsAutopilotDeviceIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsAutopilotDeviceIdentity> getWindowsAutopilotDeviceIdentities() {
        return this.backingStore.get("windowsAutopilotDeviceIdentities");
    }
    /**
     * Gets the windowsAutopilotSettings property value. The Windows autopilot account settings.
     * @return a {@link WindowsAutopilotSettings}
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotSettings getWindowsAutopilotSettings() {
        return this.backingStore.get("windowsAutopilotSettings");
    }
    /**
     * Gets the windowsDriverUpdateProfiles property value. A collection of windows driver update profiles
     * @return a {@link java.util.List<WindowsDriverUpdateProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsDriverUpdateProfile> getWindowsDriverUpdateProfiles() {
        return this.backingStore.get("windowsDriverUpdateProfiles");
    }
    /**
     * Gets the windowsFeatureUpdateProfiles property value. A collection of windows feature update profiles
     * @return a {@link java.util.List<WindowsFeatureUpdateProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsFeatureUpdateProfile> getWindowsFeatureUpdateProfiles() {
        return this.backingStore.get("windowsFeatureUpdateProfiles");
    }
    /**
     * Gets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @return a {@link java.util.List<WindowsInformationProtectionAppLearningSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionAppLearningSummary> getWindowsInformationProtectionAppLearningSummaries() {
        return this.backingStore.get("windowsInformationProtectionAppLearningSummaries");
    }
    /**
     * Gets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @return a {@link java.util.List<WindowsInformationProtectionNetworkLearningSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsInformationProtectionNetworkLearningSummary> getWindowsInformationProtectionNetworkLearningSummaries() {
        return this.backingStore.get("windowsInformationProtectionNetworkLearningSummaries");
    }
    /**
     * Gets the windowsMalwareInformation property value. The list of affected malware in the tenant.
     * @return a {@link java.util.List<WindowsMalwareInformation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsMalwareInformation> getWindowsMalwareInformation() {
        return this.backingStore.get("windowsMalwareInformation");
    }
    /**
     * Gets the windowsMalwareOverview property value. Malware overview for windows devices.
     * @return a {@link WindowsMalwareOverview}
     */
    @jakarta.annotation.Nullable
    public WindowsMalwareOverview getWindowsMalwareOverview() {
        return this.backingStore.get("windowsMalwareOverview");
    }
    /**
     * Gets the windowsQualityUpdatePolicies property value. A collection of Windows quality update policies
     * @return a {@link java.util.List<WindowsQualityUpdatePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsQualityUpdatePolicy> getWindowsQualityUpdatePolicies() {
        return this.backingStore.get("windowsQualityUpdatePolicies");
    }
    /**
     * Gets the windowsQualityUpdateProfiles property value. A collection of windows quality update profiles
     * @return a {@link java.util.List<WindowsQualityUpdateProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsQualityUpdateProfile> getWindowsQualityUpdateProfiles() {
        return this.backingStore.get("windowsQualityUpdateProfiles");
    }
    /**
     * Gets the windowsUpdateCatalogItems property value. A collection of windows update catalog items (fetaure updates item , quality updates item)
     * @return a {@link java.util.List<WindowsUpdateCatalogItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsUpdateCatalogItem> getWindowsUpdateCatalogItems() {
        return this.backingStore.get("windowsUpdateCatalogItems");
    }
    /**
     * Gets the zebraFotaArtifacts property value. The Collection of ZebraFotaArtifacts.
     * @return a {@link java.util.List<ZebraFotaArtifact>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ZebraFotaArtifact> getZebraFotaArtifacts() {
        return this.backingStore.get("zebraFotaArtifacts");
    }
    /**
     * Gets the zebraFotaConnector property value. The singleton ZebraFotaConnector associated with account.
     * @return a {@link ZebraFotaConnector}
     */
    @jakarta.annotation.Nullable
    public ZebraFotaConnector getZebraFotaConnector() {
        return this.backingStore.get("zebraFotaConnector");
    }
    /**
     * Gets the zebraFotaDeployments property value. Collection of ZebraFotaDeployments associated with account.
     * @return a {@link java.util.List<ZebraFotaDeployment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ZebraFotaDeployment> getZebraFotaDeployments() {
        return this.backingStore.get("zebraFotaDeployments");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("accountMoveCompletionDateTime", this.getAccountMoveCompletionDateTime());
        writer.writeObjectValue("adminConsent", this.getAdminConsent());
        writer.writeObjectValue("advancedThreatProtectionOnboardingStateSummary", this.getAdvancedThreatProtectionOnboardingStateSummary());
        writer.writeCollectionOfObjectValues("androidDeviceOwnerEnrollmentProfiles", this.getAndroidDeviceOwnerEnrollmentProfiles());
        writer.writeCollectionOfObjectValues("androidForWorkAppConfigurationSchemas", this.getAndroidForWorkAppConfigurationSchemas());
        writer.writeCollectionOfObjectValues("androidForWorkEnrollmentProfiles", this.getAndroidForWorkEnrollmentProfiles());
        writer.writeObjectValue("androidForWorkSettings", this.getAndroidForWorkSettings());
        writer.writeObjectValue("androidManagedStoreAccountEnterpriseSettings", this.getAndroidManagedStoreAccountEnterpriseSettings());
        writer.writeCollectionOfObjectValues("androidManagedStoreAppConfigurationSchemas", this.getAndroidManagedStoreAppConfigurationSchemas());
        writer.writeObjectValue("applePushNotificationCertificate", this.getApplePushNotificationCertificate());
        writer.writeCollectionOfObjectValues("appleUserInitiatedEnrollmentProfiles", this.getAppleUserInitiatedEnrollmentProfiles());
        writer.writeCollectionOfObjectValues("assignmentFilters", this.getAssignmentFilters());
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("autopilotEvents", this.getAutopilotEvents());
        writer.writeCollectionOfObjectValues("cartToClassAssociations", this.getCartToClassAssociations());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("certificateConnectorDetails", this.getCertificateConnectorDetails());
        writer.writeCollectionOfObjectValues("chromeOSOnboardingSettings", this.getChromeOSOnboardingSettings());
        writer.writeCollectionOfObjectValues("cloudPCConnectivityIssues", this.getCloudPCConnectivityIssues());
        writer.writeCollectionOfObjectValues("comanagedDevices", this.getComanagedDevices());
        writer.writeCollectionOfObjectValues("comanagementEligibleDevices", this.getComanagementEligibleDevices());
        writer.writeCollectionOfObjectValues("complianceCategories", this.getComplianceCategories());
        writer.writeCollectionOfObjectValues("complianceManagementPartners", this.getComplianceManagementPartners());
        writer.writeCollectionOfObjectValues("compliancePolicies", this.getCompliancePolicies());
        writer.writeCollectionOfObjectValues("complianceSettings", this.getComplianceSettings());
        writer.writeObjectValue("conditionalAccessSettings", this.getConditionalAccessSettings());
        writer.writeCollectionOfObjectValues("configManagerCollections", this.getConfigManagerCollections());
        writer.writeCollectionOfObjectValues("configurationCategories", this.getConfigurationCategories());
        writer.writeCollectionOfObjectValues("configurationPolicies", this.getConfigurationPolicies());
        writer.writeCollectionOfObjectValues("configurationPolicyTemplates", this.getConfigurationPolicyTemplates());
        writer.writeCollectionOfObjectValues("configurationSettings", this.getConfigurationSettings());
        writer.writeCollectionOfObjectValues("connectorStatus", this.getConnectorStatus());
        writer.writeObjectValue("dataProcessorServiceForWindowsFeaturesOnboarding", this.getDataProcessorServiceForWindowsFeaturesOnboarding());
        writer.writeCollectionOfObjectValues("dataSharingConsents", this.getDataSharingConsents());
        writer.writeCollectionOfObjectValues("depOnboardingSettings", this.getDepOnboardingSettings());
        writer.writeCollectionOfObjectValues("derivedCredentials", this.getDerivedCredentials());
        writer.writeCollectionOfObjectValues("detectedApps", this.getDetectedApps());
        writer.writeCollectionOfObjectValues("deviceCategories", this.getDeviceCategories());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicies", this.getDeviceCompliancePolicies());
        writer.writeObjectValue("deviceCompliancePolicyDeviceStateSummary", this.getDeviceCompliancePolicyDeviceStateSummary());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicySettingStateSummaries", this.getDeviceCompliancePolicySettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceComplianceScripts", this.getDeviceComplianceScripts());
        writer.writeCollectionOfObjectValues("deviceConfigurationConflictSummary", this.getDeviceConfigurationConflictSummary());
        writer.writeObjectValue("deviceConfigurationDeviceStateSummaries", this.getDeviceConfigurationDeviceStateSummaries());
        writer.writeCollectionOfObjectValues("deviceConfigurationProfiles", this.getDeviceConfigurationProfiles());
        writer.writeCollectionOfObjectValues("deviceConfigurationRestrictedAppsViolations", this.getDeviceConfigurationRestrictedAppsViolations());
        writer.writeCollectionOfObjectValues("deviceConfigurations", this.getDeviceConfigurations());
        writer.writeCollectionOfObjectValues("deviceConfigurationsAllManagedDeviceCertificateStates", this.getDeviceConfigurationsAllManagedDeviceCertificateStates());
        writer.writeObjectValue("deviceConfigurationUserStateSummaries", this.getDeviceConfigurationUserStateSummaries());
        writer.writeCollectionOfObjectValues("deviceCustomAttributeShellScripts", this.getDeviceCustomAttributeShellScripts());
        writer.writeCollectionOfObjectValues("deviceEnrollmentConfigurations", this.getDeviceEnrollmentConfigurations());
        writer.writeCollectionOfObjectValues("deviceHealthScripts", this.getDeviceHealthScripts());
        writer.writeCollectionOfObjectValues("deviceManagementPartners", this.getDeviceManagementPartners());
        writer.writeCollectionOfObjectValues("deviceManagementScripts", this.getDeviceManagementScripts());
        writer.writeObjectValue("deviceProtectionOverview", this.getDeviceProtectionOverview());
        writer.writeCollectionOfObjectValues("deviceShellScripts", this.getDeviceShellScripts());
        writer.writeCollectionOfObjectValues("domainJoinConnectors", this.getDomainJoinConnectors());
        writer.writeCollectionOfObjectValues("elevationRequests", this.getElevationRequests());
        writer.writeCollectionOfObjectValues("embeddedSIMActivationCodePools", this.getEmbeddedSIMActivationCodePools());
        writer.writeObjectValue("endpointPrivilegeManagementProvisioningStatus", this.getEndpointPrivilegeManagementProvisioningStatus());
        writer.writeCollectionOfObjectValues("exchangeConnectors", this.getExchangeConnectors());
        writer.writeCollectionOfObjectValues("exchangeOnPremisesPolicies", this.getExchangeOnPremisesPolicies());
        writer.writeObjectValue("exchangeOnPremisesPolicy", this.getExchangeOnPremisesPolicy());
        writer.writeCollectionOfObjectValues("groupPolicyCategories", this.getGroupPolicyCategories());
        writer.writeCollectionOfObjectValues("groupPolicyConfigurations", this.getGroupPolicyConfigurations());
        writer.writeCollectionOfObjectValues("groupPolicyDefinitionFiles", this.getGroupPolicyDefinitionFiles());
        writer.writeCollectionOfObjectValues("groupPolicyDefinitions", this.getGroupPolicyDefinitions());
        writer.writeCollectionOfObjectValues("groupPolicyMigrationReports", this.getGroupPolicyMigrationReports());
        writer.writeCollectionOfObjectValues("groupPolicyObjectFiles", this.getGroupPolicyObjectFiles());
        writer.writeCollectionOfObjectValues("groupPolicyUploadedDefinitionFiles", this.getGroupPolicyUploadedDefinitionFiles());
        writer.writeCollectionOfObjectValues("hardwareConfigurations", this.getHardwareConfigurations());
        writer.writeCollectionOfObjectValues("hardwarePasswordDetails", this.getHardwarePasswordDetails());
        writer.writeCollectionOfObjectValues("hardwarePasswordInfo", this.getHardwarePasswordInfo());
        writer.writeCollectionOfObjectValues("importedDeviceIdentities", this.getImportedDeviceIdentities());
        writer.writeCollectionOfObjectValues("importedWindowsAutopilotDeviceIdentities", this.getImportedWindowsAutopilotDeviceIdentities());
        writer.writeCollectionOfObjectValues("intents", this.getIntents());
        writer.writeUUIDValue("intuneAccountId", this.getIntuneAccountId());
        writer.writeObjectValue("intuneBrand", this.getIntuneBrand());
        writer.writeCollectionOfObjectValues("intuneBrandingProfiles", this.getIntuneBrandingProfiles());
        writer.writeCollectionOfObjectValues("iosUpdateStatuses", this.getIosUpdateStatuses());
        writer.writeCollectionOfObjectValues("macOSSoftwareUpdateAccountSummaries", this.getMacOSSoftwareUpdateAccountSummaries());
        writer.writeCollectionOfObjectValues("managedDeviceCleanupRules", this.getManagedDeviceCleanupRules());
        writer.writeObjectValue("managedDeviceCleanupSettings", this.getManagedDeviceCleanupSettings());
        writer.writeCollectionOfObjectValues("managedDeviceEncryptionStates", this.getManagedDeviceEncryptionStates());
        writer.writeObjectValue("managedDeviceOverview", this.getManagedDeviceOverview());
        writer.writeCollectionOfObjectValues("managedDevices", this.getManagedDevices());
        writer.writeCollectionOfObjectValues("managedDeviceWindowsOSImages", this.getManagedDeviceWindowsOSImages());
        writer.writeIntegerValue("maximumDepTokens", this.getMaximumDepTokens());
        writer.writeCollectionOfObjectValues("microsoftTunnelConfigurations", this.getMicrosoftTunnelConfigurations());
        writer.writeCollectionOfObjectValues("microsoftTunnelHealthThresholds", this.getMicrosoftTunnelHealthThresholds());
        writer.writeCollectionOfObjectValues("microsoftTunnelServerLogCollectionResponses", this.getMicrosoftTunnelServerLogCollectionResponses());
        writer.writeCollectionOfObjectValues("microsoftTunnelSites", this.getMicrosoftTunnelSites());
        writer.writeCollectionOfObjectValues("mobileAppTroubleshootingEvents", this.getMobileAppTroubleshootingEvents());
        writer.writeCollectionOfObjectValues("mobileThreatDefenseConnectors", this.getMobileThreatDefenseConnectors());
        writer.writeObjectValue("monitoring", this.getMonitoring());
        writer.writeCollectionOfObjectValues("ndesConnectors", this.getNdesConnectors());
        writer.writeCollectionOfObjectValues("notificationMessageTemplates", this.getNotificationMessageTemplates());
        writer.writeCollectionOfObjectValues("operationApprovalPolicies", this.getOperationApprovalPolicies());
        writer.writeCollectionOfObjectValues("operationApprovalRequests", this.getOperationApprovalRequests());
        writer.writeCollectionOfObjectValues("privilegeManagementElevations", this.getPrivilegeManagementElevations());
        writer.writeCollectionOfObjectValues("remoteActionAudits", this.getRemoteActionAudits());
        writer.writeCollectionOfObjectValues("remoteAssistancePartners", this.getRemoteAssistancePartners());
        writer.writeObjectValue("remoteAssistanceSettings", this.getRemoteAssistanceSettings());
        writer.writeObjectValue("reports", this.getReports());
        writer.writeCollectionOfObjectValues("resourceAccessProfiles", this.getResourceAccessProfiles());
        writer.writeCollectionOfObjectValues("resourceOperations", this.getResourceOperations());
        writer.writeCollectionOfObjectValues("reusablePolicySettings", this.getReusablePolicySettings());
        writer.writeCollectionOfObjectValues("reusableSettings", this.getReusableSettings());
        writer.writeCollectionOfObjectValues("roleAssignments", this.getRoleAssignments());
        writer.writeCollectionOfObjectValues("roleDefinitions", this.getRoleDefinitions());
        writer.writeCollectionOfObjectValues("roleScopeTags", this.getRoleScopeTags());
        writer.writeCollectionOfObjectValues("serviceNowConnections", this.getServiceNowConnections());
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("softwareUpdateStatusSummary", this.getSoftwareUpdateStatusSummary());
        writer.writeEnumSetValue("subscriptions", this.getSubscriptions());
        writer.writeEnumValue("subscriptionState", this.getSubscriptionState());
        writer.writeCollectionOfObjectValues("telecomExpenseManagementPartners", this.getTelecomExpenseManagementPartners());
        writer.writeCollectionOfObjectValues("templateInsights", this.getTemplateInsights());
        writer.writeCollectionOfObjectValues("templates", this.getTemplates());
        writer.writeCollectionOfObjectValues("templateSettings", this.getTemplateSettings());
        writer.writeObjectValue("tenantAttachRBAC", this.getTenantAttachRBAC());
        writer.writeCollectionOfObjectValues("termsAndConditions", this.getTermsAndConditions());
        writer.writeCollectionOfObjectValues("troubleshootingEvents", this.getTroubleshootingEvents());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAnomaly", this.getUserExperienceAnalyticsAnomaly());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAnomalyCorrelationGroupOverview", this.getUserExperienceAnalyticsAnomalyCorrelationGroupOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAnomalyDevice", this.getUserExperienceAnalyticsAnomalyDevice());
        writer.writeObjectValue("userExperienceAnalyticsAnomalySeverityOverview", this.getUserExperienceAnalyticsAnomalySeverityOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformance", this.getUserExperienceAnalyticsAppHealthApplicationPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", this.getUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDeviceModelPerformance", this.getUserExperienceAnalyticsAppHealthDeviceModelPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDevicePerformance", this.getUserExperienceAnalyticsAppHealthDevicePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthDevicePerformanceDetails", this.getUserExperienceAnalyticsAppHealthDevicePerformanceDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsAppHealthOSVersionPerformance", this.getUserExperienceAnalyticsAppHealthOSVersionPerformance());
        writer.writeObjectValue("userExperienceAnalyticsAppHealthOverview", this.getUserExperienceAnalyticsAppHealthOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBaselines", this.getUserExperienceAnalyticsBaselines());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthAppImpact", this.getUserExperienceAnalyticsBatteryHealthAppImpact());
        writer.writeObjectValue("userExperienceAnalyticsBatteryHealthCapacityDetails", this.getUserExperienceAnalyticsBatteryHealthCapacityDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDeviceAppImpact", this.getUserExperienceAnalyticsBatteryHealthDeviceAppImpact());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDevicePerformance", this.getUserExperienceAnalyticsBatteryHealthDevicePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory", this.getUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthModelPerformance", this.getUserExperienceAnalyticsBatteryHealthModelPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsBatteryHealthOsPerformance", this.getUserExperienceAnalyticsBatteryHealthOsPerformance());
        writer.writeObjectValue("userExperienceAnalyticsBatteryHealthRuntimeDetails", this.getUserExperienceAnalyticsBatteryHealthRuntimeDetails());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsCategories", this.getUserExperienceAnalyticsCategories());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceMetricHistory", this.getUserExperienceAnalyticsDeviceMetricHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDevicePerformance", this.getUserExperienceAnalyticsDevicePerformance());
        writer.writeObjectValue("userExperienceAnalyticsDeviceScope", this.getUserExperienceAnalyticsDeviceScope());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceScopes", this.getUserExperienceAnalyticsDeviceScopes());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceScores", this.getUserExperienceAnalyticsDeviceScores());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupHistory", this.getUserExperienceAnalyticsDeviceStartupHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupProcesses", this.getUserExperienceAnalyticsDeviceStartupProcesses());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceStartupProcessPerformance", this.getUserExperienceAnalyticsDeviceStartupProcessPerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDevicesWithoutCloudIdentity", this.getUserExperienceAnalyticsDevicesWithoutCloudIdentity());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsDeviceTimelineEvent", this.getUserExperienceAnalyticsDeviceTimelineEvent());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsImpactingProcess", this.getUserExperienceAnalyticsImpactingProcess());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsMetricHistory", this.getUserExperienceAnalyticsMetricHistory());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsModelScores", this.getUserExperienceAnalyticsModelScores());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsNotAutopilotReadyDevice", this.getUserExperienceAnalyticsNotAutopilotReadyDevice());
        writer.writeObjectValue("userExperienceAnalyticsOverview", this.getUserExperienceAnalyticsOverview());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsRemoteConnection", this.getUserExperienceAnalyticsRemoteConnection());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsResourcePerformance", this.getUserExperienceAnalyticsResourcePerformance());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsScoreHistory", this.getUserExperienceAnalyticsScoreHistory());
        writer.writeObjectValue("userExperienceAnalyticsSettings", this.getUserExperienceAnalyticsSettings());
        writer.writeObjectValue("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", this.getUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsWorkFromAnywhereMetrics", this.getUserExperienceAnalyticsWorkFromAnywhereMetrics());
        writer.writeCollectionOfObjectValues("userExperienceAnalyticsWorkFromAnywhereModelPerformance", this.getUserExperienceAnalyticsWorkFromAnywhereModelPerformance());
        writer.writeCollectionOfObjectValues("userPfxCertificates", this.getUserPfxCertificates());
        writer.writeObjectValue("virtualEndpoint", this.getVirtualEndpoint());
        writer.writeCollectionOfObjectValues("windowsAutopilotDeploymentProfiles", this.getWindowsAutopilotDeploymentProfiles());
        writer.writeCollectionOfObjectValues("windowsAutopilotDeviceIdentities", this.getWindowsAutopilotDeviceIdentities());
        writer.writeObjectValue("windowsAutopilotSettings", this.getWindowsAutopilotSettings());
        writer.writeCollectionOfObjectValues("windowsDriverUpdateProfiles", this.getWindowsDriverUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsFeatureUpdateProfiles", this.getWindowsFeatureUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionAppLearningSummaries", this.getWindowsInformationProtectionAppLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsInformationProtectionNetworkLearningSummaries", this.getWindowsInformationProtectionNetworkLearningSummaries());
        writer.writeCollectionOfObjectValues("windowsMalwareInformation", this.getWindowsMalwareInformation());
        writer.writeObjectValue("windowsMalwareOverview", this.getWindowsMalwareOverview());
        writer.writeCollectionOfObjectValues("windowsQualityUpdatePolicies", this.getWindowsQualityUpdatePolicies());
        writer.writeCollectionOfObjectValues("windowsQualityUpdateProfiles", this.getWindowsQualityUpdateProfiles());
        writer.writeCollectionOfObjectValues("windowsUpdateCatalogItems", this.getWindowsUpdateCatalogItems());
        writer.writeCollectionOfObjectValues("zebraFotaArtifacts", this.getZebraFotaArtifacts());
        writer.writeObjectValue("zebraFotaConnector", this.getZebraFotaConnector());
        writer.writeCollectionOfObjectValues("zebraFotaDeployments", this.getZebraFotaDeployments());
    }
    /**
     * Sets the accountMoveCompletionDateTime property value. The date & time when tenant data moved between scaleunits.
     * @param value Value to set for the accountMoveCompletionDateTime property.
     */
    public void setAccountMoveCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("accountMoveCompletionDateTime", value);
    }
    /**
     * Sets the adminConsent property value. Admin consent information.
     * @param value Value to set for the adminConsent property.
     */
    public void setAdminConsent(@jakarta.annotation.Nullable final AdminConsent value) {
        this.backingStore.set("adminConsent", value);
    }
    /**
     * Sets the advancedThreatProtectionOnboardingStateSummary property value. The summary state of ATP onboarding state for this account.
     * @param value Value to set for the advancedThreatProtectionOnboardingStateSummary property.
     */
    public void setAdvancedThreatProtectionOnboardingStateSummary(@jakarta.annotation.Nullable final AdvancedThreatProtectionOnboardingStateSummary value) {
        this.backingStore.set("advancedThreatProtectionOnboardingStateSummary", value);
    }
    /**
     * Sets the androidDeviceOwnerEnrollmentProfiles property value. Android device owner enrollment profile entities.
     * @param value Value to set for the androidDeviceOwnerEnrollmentProfiles property.
     */
    public void setAndroidDeviceOwnerEnrollmentProfiles(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerEnrollmentProfile> value) {
        this.backingStore.set("androidDeviceOwnerEnrollmentProfiles", value);
    }
    /**
     * Sets the androidForWorkAppConfigurationSchemas property value. Android for Work app configuration schema entities.
     * @param value Value to set for the androidForWorkAppConfigurationSchemas property.
     */
    public void setAndroidForWorkAppConfigurationSchemas(@jakarta.annotation.Nullable final java.util.List<AndroidForWorkAppConfigurationSchema> value) {
        this.backingStore.set("androidForWorkAppConfigurationSchemas", value);
    }
    /**
     * Sets the androidForWorkEnrollmentProfiles property value. Android for Work enrollment profile entities.
     * @param value Value to set for the androidForWorkEnrollmentProfiles property.
     */
    public void setAndroidForWorkEnrollmentProfiles(@jakarta.annotation.Nullable final java.util.List<AndroidForWorkEnrollmentProfile> value) {
        this.backingStore.set("androidForWorkEnrollmentProfiles", value);
    }
    /**
     * Sets the androidForWorkSettings property value. The singleton Android for Work settings entity.
     * @param value Value to set for the androidForWorkSettings property.
     */
    public void setAndroidForWorkSettings(@jakarta.annotation.Nullable final AndroidForWorkSettings value) {
        this.backingStore.set("androidForWorkSettings", value);
    }
    /**
     * Sets the androidManagedStoreAccountEnterpriseSettings property value. The singleton Android managed store account enterprise settings entity.
     * @param value Value to set for the androidManagedStoreAccountEnterpriseSettings property.
     */
    public void setAndroidManagedStoreAccountEnterpriseSettings(@jakarta.annotation.Nullable final AndroidManagedStoreAccountEnterpriseSettings value) {
        this.backingStore.set("androidManagedStoreAccountEnterpriseSettings", value);
    }
    /**
     * Sets the androidManagedStoreAppConfigurationSchemas property value. Android Enterprise app configuration schema entities.
     * @param value Value to set for the androidManagedStoreAppConfigurationSchemas property.
     */
    public void setAndroidManagedStoreAppConfigurationSchemas(@jakarta.annotation.Nullable final java.util.List<AndroidManagedStoreAppConfigurationSchema> value) {
        this.backingStore.set("androidManagedStoreAppConfigurationSchemas", value);
    }
    /**
     * Sets the applePushNotificationCertificate property value. Apple push notification certificate.
     * @param value Value to set for the applePushNotificationCertificate property.
     */
    public void setApplePushNotificationCertificate(@jakarta.annotation.Nullable final ApplePushNotificationCertificate value) {
        this.backingStore.set("applePushNotificationCertificate", value);
    }
    /**
     * Sets the appleUserInitiatedEnrollmentProfiles property value. Apple user initiated enrollment profiles
     * @param value Value to set for the appleUserInitiatedEnrollmentProfiles property.
     */
    public void setAppleUserInitiatedEnrollmentProfiles(@jakarta.annotation.Nullable final java.util.List<AppleUserInitiatedEnrollmentProfile> value) {
        this.backingStore.set("appleUserInitiatedEnrollmentProfiles", value);
    }
    /**
     * Sets the assignmentFilters property value. The list of assignment filters
     * @param value Value to set for the assignmentFilters property.
     */
    public void setAssignmentFilters(@jakarta.annotation.Nullable final java.util.List<DeviceAndAppManagementAssignmentFilter> value) {
        this.backingStore.set("assignmentFilters", value);
    }
    /**
     * Sets the auditEvents property value. The Audit Events
     * @param value Value to set for the auditEvents property.
     */
    public void setAuditEvents(@jakarta.annotation.Nullable final java.util.List<AuditEvent> value) {
        this.backingStore.set("auditEvents", value);
    }
    /**
     * Sets the autopilotEvents property value. The list of autopilot events for the tenant.
     * @param value Value to set for the autopilotEvents property.
     */
    public void setAutopilotEvents(@jakarta.annotation.Nullable final java.util.List<DeviceManagementAutopilotEvent> value) {
        this.backingStore.set("autopilotEvents", value);
    }
    /**
     * Sets the cartToClassAssociations property value. The Cart To Class Associations.
     * @param value Value to set for the cartToClassAssociations property.
     */
    public void setCartToClassAssociations(@jakarta.annotation.Nullable final java.util.List<CartToClassAssociation> value) {
        this.backingStore.set("cartToClassAssociations", value);
    }
    /**
     * Sets the categories property value. The available categories
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingCategory> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the certificateConnectorDetails property value. Collection of certificate connector details, each associated with a corresponding Intune Certificate Connector.
     * @param value Value to set for the certificateConnectorDetails property.
     */
    public void setCertificateConnectorDetails(@jakarta.annotation.Nullable final java.util.List<CertificateConnectorDetails> value) {
        this.backingStore.set("certificateConnectorDetails", value);
    }
    /**
     * Sets the chromeOSOnboardingSettings property value. Collection of ChromeOSOnboardingSettings settings associated with account.
     * @param value Value to set for the chromeOSOnboardingSettings property.
     */
    public void setChromeOSOnboardingSettings(@jakarta.annotation.Nullable final java.util.List<ChromeOSOnboardingSettings> value) {
        this.backingStore.set("chromeOSOnboardingSettings", value);
    }
    /**
     * Sets the cloudPCConnectivityIssues property value. The list of CloudPC Connectivity Issue.
     * @param value Value to set for the cloudPCConnectivityIssues property.
     */
    public void setCloudPCConnectivityIssues(@jakarta.annotation.Nullable final java.util.List<CloudPCConnectivityIssue> value) {
        this.backingStore.set("cloudPCConnectivityIssues", value);
    }
    /**
     * Sets the comanagedDevices property value. The list of co-managed devices report
     * @param value Value to set for the comanagedDevices property.
     */
    public void setComanagedDevices(@jakarta.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this.backingStore.set("comanagedDevices", value);
    }
    /**
     * Sets the comanagementEligibleDevices property value. The list of co-management eligible devices report
     * @param value Value to set for the comanagementEligibleDevices property.
     */
    public void setComanagementEligibleDevices(@jakarta.annotation.Nullable final java.util.List<ComanagementEligibleDevice> value) {
        this.backingStore.set("comanagementEligibleDevices", value);
    }
    /**
     * Sets the complianceCategories property value. List of all compliance categories
     * @param value Value to set for the complianceCategories property.
     */
    public void setComplianceCategories(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationCategory> value) {
        this.backingStore.set("complianceCategories", value);
    }
    /**
     * Sets the complianceManagementPartners property value. The list of Compliance Management Partners configured by the tenant.
     * @param value Value to set for the complianceManagementPartners property.
     */
    public void setComplianceManagementPartners(@jakarta.annotation.Nullable final java.util.List<ComplianceManagementPartner> value) {
        this.backingStore.set("complianceManagementPartners", value);
    }
    /**
     * Sets the compliancePolicies property value. List of all compliance policies
     * @param value Value to set for the compliancePolicies property.
     */
    public void setCompliancePolicies(@jakarta.annotation.Nullable final java.util.List<DeviceManagementCompliancePolicy> value) {
        this.backingStore.set("compliancePolicies", value);
    }
    /**
     * Sets the complianceSettings property value. List of all ComplianceSettings
     * @param value Value to set for the complianceSettings property.
     */
    public void setComplianceSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.backingStore.set("complianceSettings", value);
    }
    /**
     * Sets the conditionalAccessSettings property value. The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access
     * @param value Value to set for the conditionalAccessSettings property.
     */
    public void setConditionalAccessSettings(@jakarta.annotation.Nullable final OnPremisesConditionalAccessSettings value) {
        this.backingStore.set("conditionalAccessSettings", value);
    }
    /**
     * Sets the configManagerCollections property value. A list of ConfigManagerCollection
     * @param value Value to set for the configManagerCollections property.
     */
    public void setConfigManagerCollections(@jakarta.annotation.Nullable final java.util.List<ConfigManagerCollection> value) {
        this.backingStore.set("configManagerCollections", value);
    }
    /**
     * Sets the configurationCategories property value. List of all Configuration Categories
     * @param value Value to set for the configurationCategories property.
     */
    public void setConfigurationCategories(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationCategory> value) {
        this.backingStore.set("configurationCategories", value);
    }
    /**
     * Sets the configurationPolicies property value. List of all Configuration policies
     * @param value Value to set for the configurationPolicies property.
     */
    public void setConfigurationPolicies(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicy> value) {
        this.backingStore.set("configurationPolicies", value);
    }
    /**
     * Sets the configurationPolicyTemplates property value. List of all templates
     * @param value Value to set for the configurationPolicyTemplates property.
     */
    public void setConfigurationPolicyTemplates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicyTemplate> value) {
        this.backingStore.set("configurationPolicyTemplates", value);
    }
    /**
     * Sets the configurationSettings property value. List of all ConfigurationSettings
     * @param value Value to set for the configurationSettings property.
     */
    public void setConfigurationSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.backingStore.set("configurationSettings", value);
    }
    /**
     * Sets the connectorStatus property value. The list of connector status for the tenant.
     * @param value Value to set for the connectorStatus property.
     */
    public void setConnectorStatus(@jakarta.annotation.Nullable final java.util.List<ConnectorStatusDetails> value) {
        this.backingStore.set("connectorStatus", value);
    }
    /**
     * Sets the dataProcessorServiceForWindowsFeaturesOnboarding property value. A configuration entity for MEM features that utilize Data Processor Service for Windows (DPSW) data.
     * @param value Value to set for the dataProcessorServiceForWindowsFeaturesOnboarding property.
     */
    public void setDataProcessorServiceForWindowsFeaturesOnboarding(@jakarta.annotation.Nullable final DataProcessorServiceForWindowsFeaturesOnboarding value) {
        this.backingStore.set("dataProcessorServiceForWindowsFeaturesOnboarding", value);
    }
    /**
     * Sets the dataSharingConsents property value. Data sharing consents.
     * @param value Value to set for the dataSharingConsents property.
     */
    public void setDataSharingConsents(@jakarta.annotation.Nullable final java.util.List<DataSharingConsent> value) {
        this.backingStore.set("dataSharingConsents", value);
    }
    /**
     * Sets the depOnboardingSettings property value. This collections of multiple DEP tokens per-tenant.
     * @param value Value to set for the depOnboardingSettings property.
     */
    public void setDepOnboardingSettings(@jakarta.annotation.Nullable final java.util.List<DepOnboardingSetting> value) {
        this.backingStore.set("depOnboardingSettings", value);
    }
    /**
     * Sets the derivedCredentials property value. Collection of Derived credential settings associated with account.
     * @param value Value to set for the derivedCredentials property.
     */
    public void setDerivedCredentials(@jakarta.annotation.Nullable final java.util.List<DeviceManagementDerivedCredentialSettings> value) {
        this.backingStore.set("derivedCredentials", value);
    }
    /**
     * Sets the detectedApps property value. The list of detected apps associated with a device.
     * @param value Value to set for the detectedApps property.
     */
    public void setDetectedApps(@jakarta.annotation.Nullable final java.util.List<DetectedApp> value) {
        this.backingStore.set("detectedApps", value);
    }
    /**
     * Sets the deviceCategories property value. The list of device categories with the tenant.
     * @param value Value to set for the deviceCategories property.
     */
    public void setDeviceCategories(@jakarta.annotation.Nullable final java.util.List<DeviceCategory> value) {
        this.backingStore.set("deviceCategories", value);
    }
    /**
     * Sets the deviceCompliancePolicies property value. The device compliance policies.
     * @param value Value to set for the deviceCompliancePolicies property.
     */
    public void setDeviceCompliancePolicies(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicy> value) {
        this.backingStore.set("deviceCompliancePolicies", value);
    }
    /**
     * Sets the deviceCompliancePolicyDeviceStateSummary property value. The device compliance state summary for this account.
     * @param value Value to set for the deviceCompliancePolicyDeviceStateSummary property.
     */
    public void setDeviceCompliancePolicyDeviceStateSummary(@jakarta.annotation.Nullable final DeviceCompliancePolicyDeviceStateSummary value) {
        this.backingStore.set("deviceCompliancePolicyDeviceStateSummary", value);
    }
    /**
     * Sets the deviceCompliancePolicySettingStateSummaries property value. The summary states of compliance policy settings for this account.
     * @param value Value to set for the deviceCompliancePolicySettingStateSummaries property.
     */
    public void setDeviceCompliancePolicySettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicySettingStateSummary> value) {
        this.backingStore.set("deviceCompliancePolicySettingStateSummaries", value);
    }
    /**
     * Sets the deviceComplianceReportSummarizationDateTime property value. The last requested time of device compliance reporting for this account. This property is read-only.
     * @param value Value to set for the deviceComplianceReportSummarizationDateTime property.
     */
    public void setDeviceComplianceReportSummarizationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deviceComplianceReportSummarizationDateTime", value);
    }
    /**
     * Sets the deviceComplianceScripts property value. The list of device compliance scripts associated with the tenant.
     * @param value Value to set for the deviceComplianceScripts property.
     */
    public void setDeviceComplianceScripts(@jakarta.annotation.Nullable final java.util.List<DeviceComplianceScript> value) {
        this.backingStore.set("deviceComplianceScripts", value);
    }
    /**
     * Sets the deviceConfigurationConflictSummary property value. Summary of policies in conflict state for this account.
     * @param value Value to set for the deviceConfigurationConflictSummary property.
     */
    public void setDeviceConfigurationConflictSummary(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationConflictSummary> value) {
        this.backingStore.set("deviceConfigurationConflictSummary", value);
    }
    /**
     * Sets the deviceConfigurationDeviceStateSummaries property value. The device configuration device state summary for this account.
     * @param value Value to set for the deviceConfigurationDeviceStateSummaries property.
     */
    public void setDeviceConfigurationDeviceStateSummaries(@jakarta.annotation.Nullable final DeviceConfigurationDeviceStateSummary value) {
        this.backingStore.set("deviceConfigurationDeviceStateSummaries", value);
    }
    /**
     * Sets the deviceConfigurationProfiles property value. Profile Id of the object.
     * @param value Value to set for the deviceConfigurationProfiles property.
     */
    public void setDeviceConfigurationProfiles(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationProfile> value) {
        this.backingStore.set("deviceConfigurationProfiles", value);
    }
    /**
     * Sets the deviceConfigurationRestrictedAppsViolations property value. Restricted apps violations for this account.
     * @param value Value to set for the deviceConfigurationRestrictedAppsViolations property.
     */
    public void setDeviceConfigurationRestrictedAppsViolations(@jakarta.annotation.Nullable final java.util.List<RestrictedAppsViolation> value) {
        this.backingStore.set("deviceConfigurationRestrictedAppsViolations", value);
    }
    /**
     * Sets the deviceConfigurations property value. The device configurations.
     * @param value Value to set for the deviceConfigurations property.
     */
    public void setDeviceConfigurations(@jakarta.annotation.Nullable final java.util.List<DeviceConfiguration> value) {
        this.backingStore.set("deviceConfigurations", value);
    }
    /**
     * Sets the deviceConfigurationsAllManagedDeviceCertificateStates property value. Summary of all certificates for all devices.
     * @param value Value to set for the deviceConfigurationsAllManagedDeviceCertificateStates property.
     */
    public void setDeviceConfigurationsAllManagedDeviceCertificateStates(@jakarta.annotation.Nullable final java.util.List<ManagedAllDeviceCertificateState> value) {
        this.backingStore.set("deviceConfigurationsAllManagedDeviceCertificateStates", value);
    }
    /**
     * Sets the deviceConfigurationUserStateSummaries property value. The device configuration user state summary for this account.
     * @param value Value to set for the deviceConfigurationUserStateSummaries property.
     */
    public void setDeviceConfigurationUserStateSummaries(@jakarta.annotation.Nullable final DeviceConfigurationUserStateSummary value) {
        this.backingStore.set("deviceConfigurationUserStateSummaries", value);
    }
    /**
     * Sets the deviceCustomAttributeShellScripts property value. The list of device custom attribute shell scripts associated with the tenant.
     * @param value Value to set for the deviceCustomAttributeShellScripts property.
     */
    public void setDeviceCustomAttributeShellScripts(@jakarta.annotation.Nullable final java.util.List<DeviceCustomAttributeShellScript> value) {
        this.backingStore.set("deviceCustomAttributeShellScripts", value);
    }
    /**
     * Sets the deviceEnrollmentConfigurations property value. The list of device enrollment configurations
     * @param value Value to set for the deviceEnrollmentConfigurations property.
     */
    public void setDeviceEnrollmentConfigurations(@jakarta.annotation.Nullable final java.util.List<DeviceEnrollmentConfiguration> value) {
        this.backingStore.set("deviceEnrollmentConfigurations", value);
    }
    /**
     * Sets the deviceHealthScripts property value. The list of device health scripts associated with the tenant.
     * @param value Value to set for the deviceHealthScripts property.
     */
    public void setDeviceHealthScripts(@jakarta.annotation.Nullable final java.util.List<DeviceHealthScript> value) {
        this.backingStore.set("deviceHealthScripts", value);
    }
    /**
     * Sets the deviceManagementPartners property value. The list of Device Management Partners configured by the tenant.
     * @param value Value to set for the deviceManagementPartners property.
     */
    public void setDeviceManagementPartners(@jakarta.annotation.Nullable final java.util.List<DeviceManagementPartner> value) {
        this.backingStore.set("deviceManagementPartners", value);
    }
    /**
     * Sets the deviceManagementScripts property value. The list of device management scripts associated with the tenant.
     * @param value Value to set for the deviceManagementScripts property.
     */
    public void setDeviceManagementScripts(@jakarta.annotation.Nullable final java.util.List<DeviceManagementScript> value) {
        this.backingStore.set("deviceManagementScripts", value);
    }
    /**
     * Sets the deviceProtectionOverview property value. Device protection overview.
     * @param value Value to set for the deviceProtectionOverview property.
     */
    public void setDeviceProtectionOverview(@jakarta.annotation.Nullable final DeviceProtectionOverview value) {
        this.backingStore.set("deviceProtectionOverview", value);
    }
    /**
     * Sets the deviceShellScripts property value. The list of device shell scripts associated with the tenant.
     * @param value Value to set for the deviceShellScripts property.
     */
    public void setDeviceShellScripts(@jakarta.annotation.Nullable final java.util.List<DeviceShellScript> value) {
        this.backingStore.set("deviceShellScripts", value);
    }
    /**
     * Sets the domainJoinConnectors property value. A list of connector objects.
     * @param value Value to set for the domainJoinConnectors property.
     */
    public void setDomainJoinConnectors(@jakarta.annotation.Nullable final java.util.List<DeviceManagementDomainJoinConnector> value) {
        this.backingStore.set("domainJoinConnectors", value);
    }
    /**
     * Sets the elevationRequests property value. List of elevation requests
     * @param value Value to set for the elevationRequests property.
     */
    public void setElevationRequests(@jakarta.annotation.Nullable final java.util.List<PrivilegeManagementElevationRequest> value) {
        this.backingStore.set("elevationRequests", value);
    }
    /**
     * Sets the embeddedSIMActivationCodePools property value. The embedded SIM activation code pools created by this account.
     * @param value Value to set for the embeddedSIMActivationCodePools property.
     */
    public void setEmbeddedSIMActivationCodePools(@jakarta.annotation.Nullable final java.util.List<EmbeddedSIMActivationCodePool> value) {
        this.backingStore.set("embeddedSIMActivationCodePools", value);
    }
    /**
     * Sets the endpointPrivilegeManagementProvisioningStatus property value. Endpoint privilege management (EPM) tenant provisioning status contains tenant level license and onboarding state information.
     * @param value Value to set for the endpointPrivilegeManagementProvisioningStatus property.
     */
    public void setEndpointPrivilegeManagementProvisioningStatus(@jakarta.annotation.Nullable final EndpointPrivilegeManagementProvisioningStatus value) {
        this.backingStore.set("endpointPrivilegeManagementProvisioningStatus", value);
    }
    /**
     * Sets the exchangeConnectors property value. The list of Exchange Connectors configured by the tenant.
     * @param value Value to set for the exchangeConnectors property.
     */
    public void setExchangeConnectors(@jakarta.annotation.Nullable final java.util.List<DeviceManagementExchangeConnector> value) {
        this.backingStore.set("exchangeConnectors", value);
    }
    /**
     * Sets the exchangeOnPremisesPolicies property value. The list of Exchange On Premisis policies configured by the tenant.
     * @param value Value to set for the exchangeOnPremisesPolicies property.
     */
    public void setExchangeOnPremisesPolicies(@jakarta.annotation.Nullable final java.util.List<DeviceManagementExchangeOnPremisesPolicy> value) {
        this.backingStore.set("exchangeOnPremisesPolicies", value);
    }
    /**
     * Sets the exchangeOnPremisesPolicy property value. The policy which controls mobile device access to Exchange On Premises
     * @param value Value to set for the exchangeOnPremisesPolicy property.
     */
    public void setExchangeOnPremisesPolicy(@jakarta.annotation.Nullable final DeviceManagementExchangeOnPremisesPolicy value) {
        this.backingStore.set("exchangeOnPremisesPolicy", value);
    }
    /**
     * Sets the groupPolicyCategories property value. The available group policy categories for this account.
     * @param value Value to set for the groupPolicyCategories property.
     */
    public void setGroupPolicyCategories(@jakarta.annotation.Nullable final java.util.List<GroupPolicyCategory> value) {
        this.backingStore.set("groupPolicyCategories", value);
    }
    /**
     * Sets the groupPolicyConfigurations property value. The group policy configurations created by this account.
     * @param value Value to set for the groupPolicyConfigurations property.
     */
    public void setGroupPolicyConfigurations(@jakarta.annotation.Nullable final java.util.List<GroupPolicyConfiguration> value) {
        this.backingStore.set("groupPolicyConfigurations", value);
    }
    /**
     * Sets the groupPolicyDefinitionFiles property value. The available group policy definition files for this account.
     * @param value Value to set for the groupPolicyDefinitionFiles property.
     */
    public void setGroupPolicyDefinitionFiles(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinitionFile> value) {
        this.backingStore.set("groupPolicyDefinitionFiles", value);
    }
    /**
     * Sets the groupPolicyDefinitions property value. The available group policy definitions for this account.
     * @param value Value to set for the groupPolicyDefinitions property.
     */
    public void setGroupPolicyDefinitions(@jakarta.annotation.Nullable final java.util.List<GroupPolicyDefinition> value) {
        this.backingStore.set("groupPolicyDefinitions", value);
    }
    /**
     * Sets the groupPolicyMigrationReports property value. A list of Group Policy migration reports.
     * @param value Value to set for the groupPolicyMigrationReports property.
     */
    public void setGroupPolicyMigrationReports(@jakarta.annotation.Nullable final java.util.List<GroupPolicyMigrationReport> value) {
        this.backingStore.set("groupPolicyMigrationReports", value);
    }
    /**
     * Sets the groupPolicyObjectFiles property value. A list of Group Policy Object files uploaded.
     * @param value Value to set for the groupPolicyObjectFiles property.
     */
    public void setGroupPolicyObjectFiles(@jakarta.annotation.Nullable final java.util.List<GroupPolicyObjectFile> value) {
        this.backingStore.set("groupPolicyObjectFiles", value);
    }
    /**
     * Sets the groupPolicyUploadedDefinitionFiles property value. The available group policy uploaded definition files for this account.
     * @param value Value to set for the groupPolicyUploadedDefinitionFiles property.
     */
    public void setGroupPolicyUploadedDefinitionFiles(@jakarta.annotation.Nullable final java.util.List<GroupPolicyUploadedDefinitionFile> value) {
        this.backingStore.set("groupPolicyUploadedDefinitionFiles", value);
    }
    /**
     * Sets the hardwareConfigurations property value. BIOS configuration and other settings provides customers the ability to configure hardware/bios settings on the enrolled Windows 10/11 Entra ID joined devices by uploading a configuration file generated with their OEM tool (e.g. Dell Command tool). A BIOS configuration policy can be assigned to multiple devices, allowing admins to remotely control a device's hardware properties (e.g. enable Secure Boot) from the Intune Portal. Supported for Dell only at this time.
     * @param value Value to set for the hardwareConfigurations property.
     */
    public void setHardwareConfigurations(@jakarta.annotation.Nullable final java.util.List<HardwareConfiguration> value) {
        this.backingStore.set("hardwareConfigurations", value);
    }
    /**
     * Sets the hardwarePasswordDetails property value. Device BIOS password information for devices with managed BIOS and firmware configuration, which provides device serial number, list of previous passwords, and current password.
     * @param value Value to set for the hardwarePasswordDetails property.
     */
    public void setHardwarePasswordDetails(@jakarta.annotation.Nullable final java.util.List<HardwarePasswordDetail> value) {
        this.backingStore.set("hardwarePasswordDetails", value);
    }
    /**
     * Sets the hardwarePasswordInfo property value. Intune will provide customer the ability to configure BIOS configuration settings on the enrolled Windows 10 and Windows 11 Microsoft Entra joined devices. Starting from June, 2024, customers should start using hardwarePasswordDetail resource type - Microsoft Graph beta | Microsoft Learn. HardwarePasswordInfo will be marked as deprecated with Intune Release 2409
     * @param value Value to set for the hardwarePasswordInfo property.
     */
    public void setHardwarePasswordInfo(@jakarta.annotation.Nullable final java.util.List<HardwarePasswordInfo> value) {
        this.backingStore.set("hardwarePasswordInfo", value);
    }
    /**
     * Sets the importedDeviceIdentities property value. The imported device identities.
     * @param value Value to set for the importedDeviceIdentities property.
     */
    public void setImportedDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<ImportedDeviceIdentity> value) {
        this.backingStore.set("importedDeviceIdentities", value);
    }
    /**
     * Sets the importedWindowsAutopilotDeviceIdentities property value. Collection of imported Windows autopilot devices.
     * @param value Value to set for the importedWindowsAutopilotDeviceIdentities property.
     */
    public void setImportedWindowsAutopilotDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<ImportedWindowsAutopilotDeviceIdentity> value) {
        this.backingStore.set("importedWindowsAutopilotDeviceIdentities", value);
    }
    /**
     * Sets the intents property value. The device management intents
     * @param value Value to set for the intents property.
     */
    public void setIntents(@jakarta.annotation.Nullable final java.util.List<DeviceManagementIntent> value) {
        this.backingStore.set("intents", value);
    }
    /**
     * Sets the intuneAccountId property value. Intune Account ID for given tenant
     * @param value Value to set for the intuneAccountId property.
     */
    public void setIntuneAccountId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("intuneAccountId", value);
    }
    /**
     * Sets the intuneBrand property value. intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.
     * @param value Value to set for the intuneBrand property.
     */
    public void setIntuneBrand(@jakarta.annotation.Nullable final IntuneBrand value) {
        this.backingStore.set("intuneBrand", value);
    }
    /**
     * Sets the intuneBrandingProfiles property value. Intune branding profiles targeted to AAD groups
     * @param value Value to set for the intuneBrandingProfiles property.
     */
    public void setIntuneBrandingProfiles(@jakarta.annotation.Nullable final java.util.List<IntuneBrandingProfile> value) {
        this.backingStore.set("intuneBrandingProfiles", value);
    }
    /**
     * Sets the iosUpdateStatuses property value. The IOS software update installation statuses for this account.
     * @param value Value to set for the iosUpdateStatuses property.
     */
    public void setIosUpdateStatuses(@jakarta.annotation.Nullable final java.util.List<IosUpdateDeviceStatus> value) {
        this.backingStore.set("iosUpdateStatuses", value);
    }
    /**
     * Sets the lastReportAggregationDateTime property value. The last modified time of reporting for this account. This property is read-only.
     * @param value Value to set for the lastReportAggregationDateTime property.
     */
    public void setLastReportAggregationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastReportAggregationDateTime", value);
    }
    /**
     * Sets the legacyPcManangementEnabled property value. The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.
     * @param value Value to set for the legacyPcManangementEnabled property.
     */
    public void setLegacyPcManangementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("legacyPcManangementEnabled", value);
    }
    /**
     * Sets the macOSSoftwareUpdateAccountSummaries property value. The MacOS software update account summaries for this account.
     * @param value Value to set for the macOSSoftwareUpdateAccountSummaries property.
     */
    public void setMacOSSoftwareUpdateAccountSummaries(@jakarta.annotation.Nullable final java.util.List<MacOSSoftwareUpdateAccountSummary> value) {
        this.backingStore.set("macOSSoftwareUpdateAccountSummaries", value);
    }
    /**
     * Sets the managedDeviceCleanupRules property value. Device cleanup rule V2
     * @param value Value to set for the managedDeviceCleanupRules property.
     */
    public void setManagedDeviceCleanupRules(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceCleanupRule> value) {
        this.backingStore.set("managedDeviceCleanupRules", value);
    }
    /**
     * Sets the managedDeviceCleanupSettings property value. Device cleanup rule
     * @param value Value to set for the managedDeviceCleanupSettings property.
     */
    public void setManagedDeviceCleanupSettings(@jakarta.annotation.Nullable final ManagedDeviceCleanupSettings value) {
        this.backingStore.set("managedDeviceCleanupSettings", value);
    }
    /**
     * Sets the managedDeviceEncryptionStates property value. Encryption report for devices in this account
     * @param value Value to set for the managedDeviceEncryptionStates property.
     */
    public void setManagedDeviceEncryptionStates(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceEncryptionState> value) {
        this.backingStore.set("managedDeviceEncryptionStates", value);
    }
    /**
     * Sets the managedDeviceOverview property value. Device overview
     * @param value Value to set for the managedDeviceOverview property.
     */
    public void setManagedDeviceOverview(@jakarta.annotation.Nullable final ManagedDeviceOverview value) {
        this.backingStore.set("managedDeviceOverview", value);
    }
    /**
     * Sets the managedDevices property value. The list of managed devices.
     * @param value Value to set for the managedDevices property.
     */
    public void setManagedDevices(@jakarta.annotation.Nullable final java.util.List<ManagedDevice> value) {
        this.backingStore.set("managedDevices", value);
    }
    /**
     * Sets the managedDeviceWindowsOSImages property value. A list of ManagedDeviceWindowsOperatingSystemImages
     * @param value Value to set for the managedDeviceWindowsOSImages property.
     */
    public void setManagedDeviceWindowsOSImages(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceWindowsOperatingSystemImage> value) {
        this.backingStore.set("managedDeviceWindowsOSImages", value);
    }
    /**
     * Sets the maximumDepTokens property value. Maximum number of DEP tokens allowed per-tenant.
     * @param value Value to set for the maximumDepTokens property.
     */
    public void setMaximumDepTokens(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumDepTokens", value);
    }
    /**
     * Sets the microsoftTunnelConfigurations property value. Collection of MicrosoftTunnelConfiguration settings associated with account.
     * @param value Value to set for the microsoftTunnelConfigurations property.
     */
    public void setMicrosoftTunnelConfigurations(@jakarta.annotation.Nullable final java.util.List<MicrosoftTunnelConfiguration> value) {
        this.backingStore.set("microsoftTunnelConfigurations", value);
    }
    /**
     * Sets the microsoftTunnelHealthThresholds property value. Collection of MicrosoftTunnelHealthThreshold settings associated with account.
     * @param value Value to set for the microsoftTunnelHealthThresholds property.
     */
    public void setMicrosoftTunnelHealthThresholds(@jakarta.annotation.Nullable final java.util.List<MicrosoftTunnelHealthThreshold> value) {
        this.backingStore.set("microsoftTunnelHealthThresholds", value);
    }
    /**
     * Sets the microsoftTunnelServerLogCollectionResponses property value. Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @param value Value to set for the microsoftTunnelServerLogCollectionResponses property.
     */
    public void setMicrosoftTunnelServerLogCollectionResponses(@jakarta.annotation.Nullable final java.util.List<MicrosoftTunnelServerLogCollectionResponse> value) {
        this.backingStore.set("microsoftTunnelServerLogCollectionResponses", value);
    }
    /**
     * Sets the microsoftTunnelSites property value. Collection of MicrosoftTunnelSite settings associated with account.
     * @param value Value to set for the microsoftTunnelSites property.
     */
    public void setMicrosoftTunnelSites(@jakarta.annotation.Nullable final java.util.List<MicrosoftTunnelSite> value) {
        this.backingStore.set("microsoftTunnelSites", value);
    }
    /**
     * Sets the mobileAppTroubleshootingEvents property value. The collection property of MobileAppTroubleshootingEvent.
     * @param value Value to set for the mobileAppTroubleshootingEvents property.
     */
    public void setMobileAppTroubleshootingEvents(@jakarta.annotation.Nullable final java.util.List<MobileAppTroubleshootingEvent> value) {
        this.backingStore.set("mobileAppTroubleshootingEvents", value);
    }
    /**
     * Sets the mobileThreatDefenseConnectors property value. The list of Mobile threat Defense connectors configured by the tenant.
     * @param value Value to set for the mobileThreatDefenseConnectors property.
     */
    public void setMobileThreatDefenseConnectors(@jakarta.annotation.Nullable final java.util.List<MobileThreatDefenseConnector> value) {
        this.backingStore.set("mobileThreatDefenseConnectors", value);
    }
    /**
     * Sets the monitoring property value. The monitoring property
     * @param value Value to set for the monitoring property.
     */
    public void setMonitoring(@jakarta.annotation.Nullable final Monitoring value) {
        this.backingStore.set("monitoring", value);
    }
    /**
     * Sets the ndesConnectors property value. The collection of Ndes connectors for this account.
     * @param value Value to set for the ndesConnectors property.
     */
    public void setNdesConnectors(@jakarta.annotation.Nullable final java.util.List<NdesConnector> value) {
        this.backingStore.set("ndesConnectors", value);
    }
    /**
     * Sets the notificationMessageTemplates property value. The Notification Message Templates.
     * @param value Value to set for the notificationMessageTemplates property.
     */
    public void setNotificationMessageTemplates(@jakarta.annotation.Nullable final java.util.List<NotificationMessageTemplate> value) {
        this.backingStore.set("notificationMessageTemplates", value);
    }
    /**
     * Sets the operationApprovalPolicies property value. The Operation Approval Policies
     * @param value Value to set for the operationApprovalPolicies property.
     */
    public void setOperationApprovalPolicies(@jakarta.annotation.Nullable final java.util.List<OperationApprovalPolicy> value) {
        this.backingStore.set("operationApprovalPolicies", value);
    }
    /**
     * Sets the operationApprovalRequests property value. The Operation Approval Requests
     * @param value Value to set for the operationApprovalRequests property.
     */
    public void setOperationApprovalRequests(@jakarta.annotation.Nullable final java.util.List<OperationApprovalRequest> value) {
        this.backingStore.set("operationApprovalRequests", value);
    }
    /**
     * Sets the privilegeManagementElevations property value. The endpoint privilege management elevation event entity contains elevation details.
     * @param value Value to set for the privilegeManagementElevations property.
     */
    public void setPrivilegeManagementElevations(@jakarta.annotation.Nullable final java.util.List<PrivilegeManagementElevation> value) {
        this.backingStore.set("privilegeManagementElevations", value);
    }
    /**
     * Sets the remoteActionAudits property value. The list of device remote action audits with the tenant.
     * @param value Value to set for the remoteActionAudits property.
     */
    public void setRemoteActionAudits(@jakarta.annotation.Nullable final java.util.List<RemoteActionAudit> value) {
        this.backingStore.set("remoteActionAudits", value);
    }
    /**
     * Sets the remoteAssistancePartners property value. The remote assist partners.
     * @param value Value to set for the remoteAssistancePartners property.
     */
    public void setRemoteAssistancePartners(@jakarta.annotation.Nullable final java.util.List<RemoteAssistancePartner> value) {
        this.backingStore.set("remoteAssistancePartners", value);
    }
    /**
     * Sets the remoteAssistanceSettings property value. The remote assistance settings singleton
     * @param value Value to set for the remoteAssistanceSettings property.
     */
    public void setRemoteAssistanceSettings(@jakarta.annotation.Nullable final RemoteAssistanceSettings value) {
        this.backingStore.set("remoteAssistanceSettings", value);
    }
    /**
     * Sets the reports property value. Reports singleton
     * @param value Value to set for the reports property.
     */
    public void setReports(@jakarta.annotation.Nullable final DeviceManagementReports value) {
        this.backingStore.set("reports", value);
    }
    /**
     * Sets the resourceAccessProfiles property value. Collection of resource access settings associated with account.
     * @param value Value to set for the resourceAccessProfiles property.
     */
    public void setResourceAccessProfiles(@jakarta.annotation.Nullable final java.util.List<DeviceManagementResourceAccessProfileBase> value) {
        this.backingStore.set("resourceAccessProfiles", value);
    }
    /**
     * Sets the resourceOperations property value. The Resource Operations.
     * @param value Value to set for the resourceOperations property.
     */
    public void setResourceOperations(@jakarta.annotation.Nullable final java.util.List<ResourceOperation> value) {
        this.backingStore.set("resourceOperations", value);
    }
    /**
     * Sets the reusablePolicySettings property value. List of all reusable settings that can be referred in a policy
     * @param value Value to set for the reusablePolicySettings property.
     */
    public void setReusablePolicySettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementReusablePolicySetting> value) {
        this.backingStore.set("reusablePolicySettings", value);
    }
    /**
     * Sets the reusableSettings property value. List of all reusable settings
     * @param value Value to set for the reusableSettings property.
     */
    public void setReusableSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.backingStore.set("reusableSettings", value);
    }
    /**
     * Sets the roleAssignments property value. The Role Assignments.
     * @param value Value to set for the roleAssignments property.
     */
    public void setRoleAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceAndAppManagementRoleAssignment> value) {
        this.backingStore.set("roleAssignments", value);
    }
    /**
     * Sets the roleDefinitions property value. The Role Definitions.
     * @param value Value to set for the roleDefinitions property.
     */
    public void setRoleDefinitions(@jakarta.annotation.Nullable final java.util.List<RoleDefinition> value) {
        this.backingStore.set("roleDefinitions", value);
    }
    /**
     * Sets the roleScopeTags property value. The Role Scope Tags.
     * @param value Value to set for the roleScopeTags property.
     */
    public void setRoleScopeTags(@jakarta.annotation.Nullable final java.util.List<RoleScopeTag> value) {
        this.backingStore.set("roleScopeTags", value);
    }
    /**
     * Sets the serviceNowConnections property value. A list of ServiceNowConnections
     * @param value Value to set for the serviceNowConnections property.
     */
    public void setServiceNowConnections(@jakarta.annotation.Nullable final java.util.List<ServiceNowConnection> value) {
        this.backingStore.set("serviceNowConnections", value);
    }
    /**
     * Sets the settingDefinitions property value. The device management intent setting definitions
     * @param value Value to set for the settingDefinitions property.
     */
    public void setSettingDefinitions(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingDefinition> value) {
        this.backingStore.set("settingDefinitions", value);
    }
    /**
     * Sets the settings property value. Account level settings.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final DeviceManagementSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the softwareUpdateStatusSummary property value. The software update status summary.
     * @param value Value to set for the softwareUpdateStatusSummary property.
     */
    public void setSoftwareUpdateStatusSummary(@jakarta.annotation.Nullable final SoftwareUpdateStatusSummary value) {
        this.backingStore.set("softwareUpdateStatusSummary", value);
    }
    /**
     * Sets the subscriptions property value. Tenant mobile device management subscriptions.
     * @param value Value to set for the subscriptions property.
     */
    public void setSubscriptions(@jakarta.annotation.Nullable final EnumSet<DeviceManagementSubscriptions> value) {
        this.backingStore.set("subscriptions", value);
    }
    /**
     * Sets the subscriptionState property value. Tenant mobile device management subscription state.
     * @param value Value to set for the subscriptionState property.
     */
    public void setSubscriptionState(@jakarta.annotation.Nullable final DeviceManagementSubscriptionState value) {
        this.backingStore.set("subscriptionState", value);
    }
    /**
     * Sets the telecomExpenseManagementPartners property value. The telecom expense management partners.
     * @param value Value to set for the telecomExpenseManagementPartners property.
     */
    public void setTelecomExpenseManagementPartners(@jakarta.annotation.Nullable final java.util.List<TelecomExpenseManagementPartner> value) {
        this.backingStore.set("telecomExpenseManagementPartners", value);
    }
    /**
     * Sets the templateInsights property value. List of setting insights in a template
     * @param value Value to set for the templateInsights property.
     */
    public void setTemplateInsights(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTemplateInsightsDefinition> value) {
        this.backingStore.set("templateInsights", value);
    }
    /**
     * Sets the templates property value. The available templates
     * @param value Value to set for the templates property.
     */
    public void setTemplates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTemplate> value) {
        this.backingStore.set("templates", value);
    }
    /**
     * Sets the templateSettings property value. List of all TemplateSettings
     * @param value Value to set for the templateSettings property.
     */
    public void setTemplateSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingTemplate> value) {
        this.backingStore.set("templateSettings", value);
    }
    /**
     * Sets the tenantAttachRBAC property value. TenantAttach RBAC Enablement
     * @param value Value to set for the tenantAttachRBAC property.
     */
    public void setTenantAttachRBAC(@jakarta.annotation.Nullable final TenantAttachRBAC value) {
        this.backingStore.set("tenantAttachRBAC", value);
    }
    /**
     * Sets the termsAndConditions property value. The terms and conditions associated with device management of the company.
     * @param value Value to set for the termsAndConditions property.
     */
    public void setTermsAndConditions(@jakarta.annotation.Nullable final java.util.List<TermsAndConditions> value) {
        this.backingStore.set("termsAndConditions", value);
    }
    /**
     * Sets the troubleshootingEvents property value. The list of troubleshooting events for the tenant.
     * @param value Value to set for the troubleshootingEvents property.
     */
    public void setTroubleshootingEvents(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingEvent> value) {
        this.backingStore.set("troubleshootingEvents", value);
    }
    /**
     * Sets the unlicensedAdminstratorsEnabled property value. When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.
     * @param value Value to set for the unlicensedAdminstratorsEnabled property.
     */
    public void setUnlicensedAdminstratorsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("unlicensedAdminstratorsEnabled", value);
    }
    /**
     * Sets the userExperienceAnalyticsAnomaly property value. The user experience analytics anomaly entity contains anomaly details.
     * @param value Value to set for the userExperienceAnalyticsAnomaly property.
     */
    public void setUserExperienceAnalyticsAnomaly(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAnomaly> value) {
        this.backingStore.set("userExperienceAnalyticsAnomaly", value);
    }
    /**
     * Sets the userExperienceAnalyticsAnomalyCorrelationGroupOverview property value. The user experience analytics anomaly correlation group overview entity contains the information for each correlation group of an anomaly.
     * @param value Value to set for the userExperienceAnalyticsAnomalyCorrelationGroupOverview property.
     */
    public void setUserExperienceAnalyticsAnomalyCorrelationGroupOverview(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAnomalyCorrelationGroupOverview> value) {
        this.backingStore.set("userExperienceAnalyticsAnomalyCorrelationGroupOverview", value);
    }
    /**
     * Sets the userExperienceAnalyticsAnomalyDevice property value. The user experience analytics anomaly entity contains device details.
     * @param value Value to set for the userExperienceAnalyticsAnomalyDevice property.
     */
    public void setUserExperienceAnalyticsAnomalyDevice(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAnomalyDevice> value) {
        this.backingStore.set("userExperienceAnalyticsAnomalyDevice", value);
    }
    /**
     * Sets the userExperienceAnalyticsAnomalySeverityOverview property value. The user experience analytics anomaly severity overview entity contains the count information for each severity of anomaly.
     * @param value Value to set for the userExperienceAnalyticsAnomalySeverityOverview property.
     */
    public void setUserExperienceAnalyticsAnomalySeverityOverview(@jakarta.annotation.Nullable final UserExperienceAnalyticsAnomalySeverityOverview value) {
        this.backingStore.set("userExperienceAnalyticsAnomalySeverityOverview", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformance property value. User experience analytics appHealth Application Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformance property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthApplicationPerformance> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthApplicationPerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property value. User experience analytics appHealth Application Performance by App Version
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property value. User experience analytics appHealth Application Performance by App Version details
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property value. User experience analytics appHealth Application Performance by App Version Device Id
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property value. User experience analytics appHealth Application Performance by OS Version
     * @param value Value to set for the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion property.
     */
    public void setUserExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDeviceModelPerformance property value. User experience analytics appHealth Model Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthDeviceModelPerformance property.
     */
    public void setUserExperienceAnalyticsAppHealthDeviceModelPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDeviceModelPerformance> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthDeviceModelPerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDevicePerformance property value. User experience analytics appHealth Device Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthDevicePerformance property.
     */
    public void setUserExperienceAnalyticsAppHealthDevicePerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformance> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthDevicePerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthDevicePerformanceDetails property value. User experience analytics device performance details
     * @param value Value to set for the userExperienceAnalyticsAppHealthDevicePerformanceDetails property.
     */
    public void setUserExperienceAnalyticsAppHealthDevicePerformanceDetails(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthDevicePerformanceDetails> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthDevicePerformanceDetails", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthOSVersionPerformance property value. User experience analytics appHealth OS version Performance
     * @param value Value to set for the userExperienceAnalyticsAppHealthOSVersionPerformance property.
     */
    public void setUserExperienceAnalyticsAppHealthOSVersionPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsAppHealthOSVersionPerformance> value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthOSVersionPerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsAppHealthOverview property value. User experience analytics appHealth overview
     * @param value Value to set for the userExperienceAnalyticsAppHealthOverview property.
     */
    public void setUserExperienceAnalyticsAppHealthOverview(@jakarta.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.backingStore.set("userExperienceAnalyticsAppHealthOverview", value);
    }
    /**
     * Sets the userExperienceAnalyticsBaselines property value. User experience analytics baselines
     * @param value Value to set for the userExperienceAnalyticsBaselines property.
     */
    public void setUserExperienceAnalyticsBaselines(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsBaseline> value) {
        this.backingStore.set("userExperienceAnalyticsBaselines", value);
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthAppImpact property value. User Experience Analytics Battery Health App Impact
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthAppImpact property.
     */
    public void setUserExperienceAnalyticsBatteryHealthAppImpact(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthAppImpact> value) {
        this.backingStore.set("userExperienceAnalyticsBatteryHealthAppImpact", value);
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthCapacityDetails property value. User Experience Analytics Battery Health Capacity Details
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthCapacityDetails property.
     */
    public void setUserExperienceAnalyticsBatteryHealthCapacityDetails(@jakarta.annotation.Nullable final UserExperienceAnalyticsBatteryHealthCapacityDetails value) {
        this.backingStore.set("userExperienceAnalyticsBatteryHealthCapacityDetails", value);
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDeviceAppImpact property value. User Experience Analytics Battery Health Device App Impact
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDeviceAppImpact property.
     */
    public void setUserExperienceAnalyticsBatteryHealthDeviceAppImpact(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDeviceAppImpact> value) {
        this.backingStore.set("userExperienceAnalyticsBatteryHealthDeviceAppImpact", value);
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDevicePerformance property value. User Experience Analytics Battery Health Device Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDevicePerformance property.
     */
    public void setUserExperienceAnalyticsBatteryHealthDevicePerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDevicePerformance> value) {
        this.backingStore.set("userExperienceAnalyticsBatteryHealthDevicePerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property value. User Experience Analytics Battery Health Device Runtime History
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory property.
     */
    public void setUserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthDeviceRuntimeHistory> value) {
        this.backingStore.set("userExperienceAnalyticsBatteryHealthDeviceRuntimeHistory", value);
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthModelPerformance property value. User Experience Analytics Battery Health Model Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthModelPerformance property.
     */
    public void setUserExperienceAnalyticsBatteryHealthModelPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthModelPerformance> value) {
        this.backingStore.set("userExperienceAnalyticsBatteryHealthModelPerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthOsPerformance property value. User Experience Analytics Battery Health Os Performance
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthOsPerformance property.
     */
    public void setUserExperienceAnalyticsBatteryHealthOsPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsBatteryHealthOsPerformance> value) {
        this.backingStore.set("userExperienceAnalyticsBatteryHealthOsPerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsBatteryHealthRuntimeDetails property value. User Experience Analytics Battery Health Runtime Details
     * @param value Value to set for the userExperienceAnalyticsBatteryHealthRuntimeDetails property.
     */
    public void setUserExperienceAnalyticsBatteryHealthRuntimeDetails(@jakarta.annotation.Nullable final UserExperienceAnalyticsBatteryHealthRuntimeDetails value) {
        this.backingStore.set("userExperienceAnalyticsBatteryHealthRuntimeDetails", value);
    }
    /**
     * Sets the userExperienceAnalyticsCategories property value. User experience analytics categories
     * @param value Value to set for the userExperienceAnalyticsCategories property.
     */
    public void setUserExperienceAnalyticsCategories(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsCategory> value) {
        this.backingStore.set("userExperienceAnalyticsCategories", value);
    }
    /**
     * Sets the userExperienceAnalyticsDeviceMetricHistory property value. User experience analytics device metric history
     * @param value Value to set for the userExperienceAnalyticsDeviceMetricHistory property.
     */
    public void setUserExperienceAnalyticsDeviceMetricHistory(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetricHistory> value) {
        this.backingStore.set("userExperienceAnalyticsDeviceMetricHistory", value);
    }
    /**
     * Sets the userExperienceAnalyticsDevicePerformance property value. User experience analytics device performance
     * @param value Value to set for the userExperienceAnalyticsDevicePerformance property.
     */
    public void setUserExperienceAnalyticsDevicePerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDevicePerformance> value) {
        this.backingStore.set("userExperienceAnalyticsDevicePerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScope property value. The user experience analytics device scope entity endpoint to trigger on the service to either START or STOP computing metrics data based on a device scope configuration.
     * @param value Value to set for the userExperienceAnalyticsDeviceScope property.
     */
    public void setUserExperienceAnalyticsDeviceScope(@jakarta.annotation.Nullable final UserExperienceAnalyticsDeviceScope value) {
        this.backingStore.set("userExperienceAnalyticsDeviceScope", value);
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScopes property value. The user experience analytics device scope entity contains device scope configuration use to apply filtering on the endpoint analytics reports.
     * @param value Value to set for the userExperienceAnalyticsDeviceScopes property.
     */
    public void setUserExperienceAnalyticsDeviceScopes(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceScope> value) {
        this.backingStore.set("userExperienceAnalyticsDeviceScopes", value);
    }
    /**
     * Sets the userExperienceAnalyticsDeviceScores property value. User experience analytics device scores
     * @param value Value to set for the userExperienceAnalyticsDeviceScores property.
     */
    public void setUserExperienceAnalyticsDeviceScores(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceScores> value) {
        this.backingStore.set("userExperienceAnalyticsDeviceScores", value);
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupHistory property value. User experience analytics device Startup History
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupHistory property.
     */
    public void setUserExperienceAnalyticsDeviceStartupHistory(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupHistory> value) {
        this.backingStore.set("userExperienceAnalyticsDeviceStartupHistory", value);
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupProcesses property value. User experience analytics device Startup Processes
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupProcesses property.
     */
    public void setUserExperienceAnalyticsDeviceStartupProcesses(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupProcess> value) {
        this.backingStore.set("userExperienceAnalyticsDeviceStartupProcesses", value);
    }
    /**
     * Sets the userExperienceAnalyticsDeviceStartupProcessPerformance property value. User experience analytics device Startup Process Performance
     * @param value Value to set for the userExperienceAnalyticsDeviceStartupProcessPerformance property.
     */
    public void setUserExperienceAnalyticsDeviceStartupProcessPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceStartupProcessPerformance> value) {
        this.backingStore.set("userExperienceAnalyticsDeviceStartupProcessPerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsDevicesWithoutCloudIdentity property value. User experience analytics devices without cloud identity.
     * @param value Value to set for the userExperienceAnalyticsDevicesWithoutCloudIdentity property.
     */
    public void setUserExperienceAnalyticsDevicesWithoutCloudIdentity(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceWithoutCloudIdentity> value) {
        this.backingStore.set("userExperienceAnalyticsDevicesWithoutCloudIdentity", value);
    }
    /**
     * Sets the userExperienceAnalyticsDeviceTimelineEvent property value. The user experience analytics device events entity contains NRT device timeline event details.
     * @param value Value to set for the userExperienceAnalyticsDeviceTimelineEvent property.
     */
    public void setUserExperienceAnalyticsDeviceTimelineEvent(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsDeviceTimelineEvent> value) {
        this.backingStore.set("userExperienceAnalyticsDeviceTimelineEvent", value);
    }
    /**
     * Sets the userExperienceAnalyticsImpactingProcess property value. User experience analytics impacting process
     * @param value Value to set for the userExperienceAnalyticsImpactingProcess property.
     */
    public void setUserExperienceAnalyticsImpactingProcess(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsImpactingProcess> value) {
        this.backingStore.set("userExperienceAnalyticsImpactingProcess", value);
    }
    /**
     * Sets the userExperienceAnalyticsMetricHistory property value. User experience analytics metric history
     * @param value Value to set for the userExperienceAnalyticsMetricHistory property.
     */
    public void setUserExperienceAnalyticsMetricHistory(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsMetricHistory> value) {
        this.backingStore.set("userExperienceAnalyticsMetricHistory", value);
    }
    /**
     * Sets the userExperienceAnalyticsModelScores property value. User experience analytics model scores
     * @param value Value to set for the userExperienceAnalyticsModelScores property.
     */
    public void setUserExperienceAnalyticsModelScores(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsModelScores> value) {
        this.backingStore.set("userExperienceAnalyticsModelScores", value);
    }
    /**
     * Sets the userExperienceAnalyticsNotAutopilotReadyDevice property value. User experience analytics devices not Windows Autopilot ready.
     * @param value Value to set for the userExperienceAnalyticsNotAutopilotReadyDevice property.
     */
    public void setUserExperienceAnalyticsNotAutopilotReadyDevice(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsNotAutopilotReadyDevice> value) {
        this.backingStore.set("userExperienceAnalyticsNotAutopilotReadyDevice", value);
    }
    /**
     * Sets the userExperienceAnalyticsOverview property value. User experience analytics overview
     * @param value Value to set for the userExperienceAnalyticsOverview property.
     */
    public void setUserExperienceAnalyticsOverview(@jakarta.annotation.Nullable final UserExperienceAnalyticsOverview value) {
        this.backingStore.set("userExperienceAnalyticsOverview", value);
    }
    /**
     * Sets the userExperienceAnalyticsRemoteConnection property value. User experience analytics remote connection
     * @param value Value to set for the userExperienceAnalyticsRemoteConnection property.
     */
    public void setUserExperienceAnalyticsRemoteConnection(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsRemoteConnection> value) {
        this.backingStore.set("userExperienceAnalyticsRemoteConnection", value);
    }
    /**
     * Sets the userExperienceAnalyticsResourcePerformance property value. User experience analytics resource performance
     * @param value Value to set for the userExperienceAnalyticsResourcePerformance property.
     */
    public void setUserExperienceAnalyticsResourcePerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsResourcePerformance> value) {
        this.backingStore.set("userExperienceAnalyticsResourcePerformance", value);
    }
    /**
     * Sets the userExperienceAnalyticsScoreHistory property value. User experience analytics device Startup Score History
     * @param value Value to set for the userExperienceAnalyticsScoreHistory property.
     */
    public void setUserExperienceAnalyticsScoreHistory(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsScoreHistory> value) {
        this.backingStore.set("userExperienceAnalyticsScoreHistory", value);
    }
    /**
     * Sets the userExperienceAnalyticsSettings property value. User experience analytics device settings
     * @param value Value to set for the userExperienceAnalyticsSettings property.
     */
    public void setUserExperienceAnalyticsSettings(@jakarta.annotation.Nullable final UserExperienceAnalyticsSettings value) {
        this.backingStore.set("userExperienceAnalyticsSettings", value);
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property value. User experience analytics work from anywhere hardware readiness metrics.
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric property.
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric(@jakarta.annotation.Nullable final UserExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric value) {
        this.backingStore.set("userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric", value);
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereMetrics property value. User experience analytics work from anywhere metrics.
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereMetrics property.
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereMetrics(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereMetric> value) {
        this.backingStore.set("userExperienceAnalyticsWorkFromAnywhereMetrics", value);
    }
    /**
     * Sets the userExperienceAnalyticsWorkFromAnywhereModelPerformance property value. The user experience analytics work from anywhere model performance
     * @param value Value to set for the userExperienceAnalyticsWorkFromAnywhereModelPerformance property.
     */
    public void setUserExperienceAnalyticsWorkFromAnywhereModelPerformance(@jakarta.annotation.Nullable final java.util.List<UserExperienceAnalyticsWorkFromAnywhereModelPerformance> value) {
        this.backingStore.set("userExperienceAnalyticsWorkFromAnywhereModelPerformance", value);
    }
    /**
     * Sets the userPfxCertificates property value. Collection of PFX certificates associated with a user.
     * @param value Value to set for the userPfxCertificates property.
     */
    public void setUserPfxCertificates(@jakarta.annotation.Nullable final java.util.List<UserPFXCertificate> value) {
        this.backingStore.set("userPfxCertificates", value);
    }
    /**
     * Sets the virtualEndpoint property value. The virtualEndpoint property
     * @param value Value to set for the virtualEndpoint property.
     */
    public void setVirtualEndpoint(@jakarta.annotation.Nullable final VirtualEndpoint value) {
        this.backingStore.set("virtualEndpoint", value);
    }
    /**
     * Sets the windowsAutopilotDeploymentProfiles property value. Windows auto pilot deployment profiles
     * @param value Value to set for the windowsAutopilotDeploymentProfiles property.
     */
    public void setWindowsAutopilotDeploymentProfiles(@jakarta.annotation.Nullable final java.util.List<WindowsAutopilotDeploymentProfile> value) {
        this.backingStore.set("windowsAutopilotDeploymentProfiles", value);
    }
    /**
     * Sets the windowsAutopilotDeviceIdentities property value. The Windows autopilot device identities contained collection.
     * @param value Value to set for the windowsAutopilotDeviceIdentities property.
     */
    public void setWindowsAutopilotDeviceIdentities(@jakarta.annotation.Nullable final java.util.List<WindowsAutopilotDeviceIdentity> value) {
        this.backingStore.set("windowsAutopilotDeviceIdentities", value);
    }
    /**
     * Sets the windowsAutopilotSettings property value. The Windows autopilot account settings.
     * @param value Value to set for the windowsAutopilotSettings property.
     */
    public void setWindowsAutopilotSettings(@jakarta.annotation.Nullable final WindowsAutopilotSettings value) {
        this.backingStore.set("windowsAutopilotSettings", value);
    }
    /**
     * Sets the windowsDriverUpdateProfiles property value. A collection of windows driver update profiles
     * @param value Value to set for the windowsDriverUpdateProfiles property.
     */
    public void setWindowsDriverUpdateProfiles(@jakarta.annotation.Nullable final java.util.List<WindowsDriverUpdateProfile> value) {
        this.backingStore.set("windowsDriverUpdateProfiles", value);
    }
    /**
     * Sets the windowsFeatureUpdateProfiles property value. A collection of windows feature update profiles
     * @param value Value to set for the windowsFeatureUpdateProfiles property.
     */
    public void setWindowsFeatureUpdateProfiles(@jakarta.annotation.Nullable final java.util.List<WindowsFeatureUpdateProfile> value) {
        this.backingStore.set("windowsFeatureUpdateProfiles", value);
    }
    /**
     * Sets the windowsInformationProtectionAppLearningSummaries property value. The windows information protection app learning summaries.
     * @param value Value to set for the windowsInformationProtectionAppLearningSummaries property.
     */
    public void setWindowsInformationProtectionAppLearningSummaries(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionAppLearningSummary> value) {
        this.backingStore.set("windowsInformationProtectionAppLearningSummaries", value);
    }
    /**
     * Sets the windowsInformationProtectionNetworkLearningSummaries property value. The windows information protection network learning summaries.
     * @param value Value to set for the windowsInformationProtectionNetworkLearningSummaries property.
     */
    public void setWindowsInformationProtectionNetworkLearningSummaries(@jakarta.annotation.Nullable final java.util.List<WindowsInformationProtectionNetworkLearningSummary> value) {
        this.backingStore.set("windowsInformationProtectionNetworkLearningSummaries", value);
    }
    /**
     * Sets the windowsMalwareInformation property value. The list of affected malware in the tenant.
     * @param value Value to set for the windowsMalwareInformation property.
     */
    public void setWindowsMalwareInformation(@jakarta.annotation.Nullable final java.util.List<WindowsMalwareInformation> value) {
        this.backingStore.set("windowsMalwareInformation", value);
    }
    /**
     * Sets the windowsMalwareOverview property value. Malware overview for windows devices.
     * @param value Value to set for the windowsMalwareOverview property.
     */
    public void setWindowsMalwareOverview(@jakarta.annotation.Nullable final WindowsMalwareOverview value) {
        this.backingStore.set("windowsMalwareOverview", value);
    }
    /**
     * Sets the windowsQualityUpdatePolicies property value. A collection of Windows quality update policies
     * @param value Value to set for the windowsQualityUpdatePolicies property.
     */
    public void setWindowsQualityUpdatePolicies(@jakarta.annotation.Nullable final java.util.List<WindowsQualityUpdatePolicy> value) {
        this.backingStore.set("windowsQualityUpdatePolicies", value);
    }
    /**
     * Sets the windowsQualityUpdateProfiles property value. A collection of windows quality update profiles
     * @param value Value to set for the windowsQualityUpdateProfiles property.
     */
    public void setWindowsQualityUpdateProfiles(@jakarta.annotation.Nullable final java.util.List<WindowsQualityUpdateProfile> value) {
        this.backingStore.set("windowsQualityUpdateProfiles", value);
    }
    /**
     * Sets the windowsUpdateCatalogItems property value. A collection of windows update catalog items (fetaure updates item , quality updates item)
     * @param value Value to set for the windowsUpdateCatalogItems property.
     */
    public void setWindowsUpdateCatalogItems(@jakarta.annotation.Nullable final java.util.List<WindowsUpdateCatalogItem> value) {
        this.backingStore.set("windowsUpdateCatalogItems", value);
    }
    /**
     * Sets the zebraFotaArtifacts property value. The Collection of ZebraFotaArtifacts.
     * @param value Value to set for the zebraFotaArtifacts property.
     */
    public void setZebraFotaArtifacts(@jakarta.annotation.Nullable final java.util.List<ZebraFotaArtifact> value) {
        this.backingStore.set("zebraFotaArtifacts", value);
    }
    /**
     * Sets the zebraFotaConnector property value. The singleton ZebraFotaConnector associated with account.
     * @param value Value to set for the zebraFotaConnector property.
     */
    public void setZebraFotaConnector(@jakarta.annotation.Nullable final ZebraFotaConnector value) {
        this.backingStore.set("zebraFotaConnector", value);
    }
    /**
     * Sets the zebraFotaDeployments property value. Collection of ZebraFotaDeployments associated with account.
     * @param value Value to set for the zebraFotaDeployments property.
     */
    public void setZebraFotaDeployments(@jakarta.annotation.Nullable final java.util.List<ZebraFotaDeployment> value) {
        this.backingStore.set("zebraFotaDeployments", value);
    }
}
