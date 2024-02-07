package com.microsoft.graph.beta;

import com.microsoft.graph.beta.accessreviewdecisions.AccessReviewDecisionsRequestBuilder;
import com.microsoft.graph.beta.accessreviews.AccessReviewsRequestBuilder;
import com.microsoft.graph.beta.activitystatistics.ActivitystatisticsRequestBuilder;
import com.microsoft.graph.beta.admin.AdminRequestBuilder;
import com.microsoft.graph.beta.administrativeunits.AdministrativeUnitsRequestBuilder;
import com.microsoft.graph.beta.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.beta.agreements.AgreementsRequestBuilder;
import com.microsoft.graph.beta.alloweddatalocations.AllowedDataLocationsRequestBuilder;
import com.microsoft.graph.beta.app.AppRequestBuilder;
import com.microsoft.graph.beta.appcatalogs.AppCatalogsRequestBuilder;
import com.microsoft.graph.beta.applications.ApplicationsRequestBuilder;
import com.microsoft.graph.beta.applicationswithappid.ApplicationsWithAppIdRequestBuilder;
import com.microsoft.graph.beta.applicationswithuniquename.ApplicationsWithUniqueNameRequestBuilder;
import com.microsoft.graph.beta.applicationtemplates.ApplicationTemplatesRequestBuilder;
import com.microsoft.graph.beta.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.beta.approvalworkflowproviders.ApprovalWorkflowProvidersRequestBuilder;
import com.microsoft.graph.beta.auditlogs.AuditLogsRequestBuilder;
import com.microsoft.graph.beta.authenticationmethodconfigurations.AuthenticationMethodConfigurationsRequestBuilder;
import com.microsoft.graph.beta.authenticationmethodspolicy.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.beta.bookingbusinesses.BookingBusinessesRequestBuilder;
import com.microsoft.graph.beta.bookingcurrencies.BookingCurrenciesRequestBuilder;
import com.microsoft.graph.beta.businessflowtemplates.BusinessFlowTemplatesRequestBuilder;
import com.microsoft.graph.beta.certificatebasedauthconfiguration.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.beta.chats.ChatsRequestBuilder;
import com.microsoft.graph.beta.commands.CommandsRequestBuilder;
import com.microsoft.graph.beta.communications.CommunicationsRequestBuilder;
import com.microsoft.graph.beta.compliance.ComplianceRequestBuilder;
import com.microsoft.graph.beta.connections.ConnectionsRequestBuilder;
import com.microsoft.graph.beta.contacts.ContactsRequestBuilder;
import com.microsoft.graph.beta.contracts.ContractsRequestBuilder;
import com.microsoft.graph.beta.dataclassification.DataClassificationRequestBuilder;
import com.microsoft.graph.beta.datapolicyoperations.DataPolicyOperationsRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.beta.devicelocalcredentials.DeviceLocalCredentialsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.DeviceManagementRequestBuilder;
import com.microsoft.graph.beta.devices.DevicesRequestBuilder;
import com.microsoft.graph.beta.deviceswithdeviceid.DevicesWithDeviceIdRequestBuilder;
import com.microsoft.graph.beta.directory.DirectoryRequestBuilder;
import com.microsoft.graph.beta.directoryobjects.DirectoryObjectsRequestBuilder;
import com.microsoft.graph.beta.directoryroles.DirectoryRolesRequestBuilder;
import com.microsoft.graph.beta.directoryroleswithroletemplateid.DirectoryRolesWithRoleTemplateIdRequestBuilder;
import com.microsoft.graph.beta.directoryroletemplates.DirectoryRoleTemplatesRequestBuilder;
import com.microsoft.graph.beta.directorysettingtemplates.DirectorySettingTemplatesRequestBuilder;
import com.microsoft.graph.beta.domaindnsrecords.DomainDnsRecordsRequestBuilder;
import com.microsoft.graph.beta.domains.DomainsRequestBuilder;
import com.microsoft.graph.beta.drives.DrivesRequestBuilder;
import com.microsoft.graph.beta.education.EducationRequestBuilder;
import com.microsoft.graph.beta.employeeexperience.EmployeeExperienceRequestBuilder;
import com.microsoft.graph.beta.external.ExternalRequestBuilder;
import com.microsoft.graph.beta.filteroperators.FilterOperatorsRequestBuilder;
import com.microsoft.graph.beta.financials.FinancialsRequestBuilder;
import com.microsoft.graph.beta.functions.FunctionsRequestBuilder;
import com.microsoft.graph.beta.governanceresources.GovernanceResourcesRequestBuilder;
import com.microsoft.graph.beta.governanceroleassignmentrequests.GovernanceRoleAssignmentRequestsRequestBuilder;
import com.microsoft.graph.beta.governanceroleassignments.GovernanceRoleAssignmentsRequestBuilder;
import com.microsoft.graph.beta.governanceroledefinitions.GovernanceRoleDefinitionsRequestBuilder;
import com.microsoft.graph.beta.governancerolesettings.GovernanceRoleSettingsRequestBuilder;
import com.microsoft.graph.beta.governancesubjects.GovernanceSubjectsRequestBuilder;
import com.microsoft.graph.beta.grouplifecyclepolicies.GroupLifecyclePoliciesRequestBuilder;
import com.microsoft.graph.beta.groups.GroupsRequestBuilder;
import com.microsoft.graph.beta.groupswithuniquename.GroupsWithUniqueNameRequestBuilder;
import com.microsoft.graph.beta.identity.IdentityRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.beta.identityprotection.IdentityProtectionRequestBuilder;
import com.microsoft.graph.beta.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.beta.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.beta.invitations.InvitationsRequestBuilder;
import com.microsoft.graph.beta.messageevents.MessageEventsRequestBuilder;
import com.microsoft.graph.beta.messagerecipients.MessageRecipientsRequestBuilder;
import com.microsoft.graph.beta.messagetraces.MessageTracesRequestBuilder;
import com.microsoft.graph.beta.mobilitymanagementpolicies.MobilityManagementPoliciesRequestBuilder;
import com.microsoft.graph.beta.monitoring.MonitoringRequestBuilder;
import com.microsoft.graph.beta.networkaccess.NetworkAccessRequestBuilder;
import com.microsoft.graph.beta.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.beta.onpremisespublishingprofiles.OnPremisesPublishingProfilesRequestBuilder;
import com.microsoft.graph.beta.organization.OrganizationRequestBuilder;
import com.microsoft.graph.beta.payloadresponse.PayloadResponseRequestBuilder;
import com.microsoft.graph.beta.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.beta.places.PlacesRequestBuilder;
import com.microsoft.graph.beta.planner.PlannerRequestBuilder;
import com.microsoft.graph.beta.policies.PoliciesRequestBuilder;
import com.microsoft.graph.beta.print.PrintRequestBuilder;
import com.microsoft.graph.beta.privacy.PrivacyRequestBuilder;
import com.microsoft.graph.beta.privilegedaccess.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.beta.privilegedapproval.PrivilegedApprovalRequestBuilder;
import com.microsoft.graph.beta.privilegedoperationevents.PrivilegedOperationEventsRequestBuilder;
import com.microsoft.graph.beta.privilegedroleassignmentrequests.PrivilegedRoleAssignmentRequestsRequestBuilder;
import com.microsoft.graph.beta.privilegedroleassignments.PrivilegedRoleAssignmentsRequestBuilder;
import com.microsoft.graph.beta.privilegedroles.PrivilegedRolesRequestBuilder;
import com.microsoft.graph.beta.privilegedsignupstatus.PrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.beta.programcontrols.ProgramControlsRequestBuilder;
import com.microsoft.graph.beta.programcontroltypes.ProgramControlTypesRequestBuilder;
import com.microsoft.graph.beta.programs.ProgramsRequestBuilder;
import com.microsoft.graph.beta.reports.ReportsRequestBuilder;
import com.microsoft.graph.beta.riskdetections.RiskDetectionsRequestBuilder;
import com.microsoft.graph.beta.riskyusers.RiskyUsersRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.RoleManagementRequestBuilder;
import com.microsoft.graph.beta.schemaextensions.SchemaExtensionsRequestBuilder;
import com.microsoft.graph.beta.scopedrolememberships.ScopedRoleMembershipsRequestBuilder;
import com.microsoft.graph.beta.search.SearchRequestBuilder;
import com.microsoft.graph.beta.security.SecurityRequestBuilder;
import com.microsoft.graph.beta.serviceprincipals.ServicePrincipalsRequestBuilder;
import com.microsoft.graph.beta.serviceprincipalswithappid.ServicePrincipalsWithAppIdRequestBuilder;
import com.microsoft.graph.beta.settings.SettingsRequestBuilder;
import com.microsoft.graph.beta.shares.SharesRequestBuilder;
import com.microsoft.graph.beta.sites.SitesRequestBuilder;
import com.microsoft.graph.beta.solutions.SolutionsRequestBuilder;
import com.microsoft.graph.beta.subscribedskus.SubscribedSkusRequestBuilder;
import com.microsoft.graph.beta.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.beta.teams.TeamsRequestBuilder;
import com.microsoft.graph.beta.teamstemplates.TeamsTemplatesRequestBuilder;
import com.microsoft.graph.beta.teamtemplatedefinition.TeamTemplateDefinitionRequestBuilder;
import com.microsoft.graph.beta.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.TenantRelationshipsRequestBuilder;
import com.microsoft.graph.beta.termstore.TermStoreRequestBuilder;
import com.microsoft.graph.beta.threatsubmission.ThreatSubmissionRequestBuilder;
import com.microsoft.graph.beta.trustframework.TrustFrameworkRequestBuilder;
import com.microsoft.graph.beta.users.UsersRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import com.microsoft.kiota.store.BackingStoreFactory;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseGraphServiceClient extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of accessReviewDecision entities.
     */
    @jakarta.annotation.Nonnull
    public AccessReviewDecisionsRequestBuilder accessReviewDecisions() {
        return new AccessReviewDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of accessReview entities.
     */
    @jakarta.annotation.Nonnull
    public AccessReviewsRequestBuilder accessReviews() {
        return new AccessReviewsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of activityStatistics entities.
     */
    @jakarta.annotation.Nonnull
    public ActivitystatisticsRequestBuilder activitystatistics() {
        return new ActivitystatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the admin singleton.
     */
    @jakarta.annotation.Nonnull
    public AdminRequestBuilder admin() {
        return new AdminRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of administrativeUnit entities.
     */
    @jakarta.annotation.Nonnull
    public AdministrativeUnitsRequestBuilder administrativeUnits() {
        return new AdministrativeUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of agreementAcceptance entities.
     */
    @jakarta.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of agreement entities.
     */
    @jakarta.annotation.Nonnull
    public AgreementsRequestBuilder agreements() {
        return new AgreementsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of allowedDataLocation entities.
     */
    @jakarta.annotation.Nonnull
    public AllowedDataLocationsRequestBuilder allowedDataLocations() {
        return new AllowedDataLocationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the commsApplication singleton.
     */
    @jakarta.annotation.Nonnull
    public AppRequestBuilder app() {
        return new AppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appCatalogs singleton.
     */
    @jakarta.annotation.Nonnull
    public AppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of application entities.
     */
    @jakarta.annotation.Nonnull
    public ApplicationsRequestBuilder applications() {
        return new ApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of applicationTemplate entities.
     */
    @jakarta.annotation.Nonnull
    public ApplicationTemplatesRequestBuilder applicationTemplates() {
        return new ApplicationTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of appRoleAssignment entities.
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of approvalWorkflowProvider entities.
     */
    @jakarta.annotation.Nonnull
    public ApprovalWorkflowProvidersRequestBuilder approvalWorkflowProviders() {
        return new ApprovalWorkflowProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the auditLogRoot singleton.
     */
    @jakarta.annotation.Nonnull
    public AuditLogsRequestBuilder auditLogs() {
        return new AuditLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of authenticationMethodConfiguration entities.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodConfigurationsRequestBuilder authenticationMethodConfigurations() {
        return new AuthenticationMethodConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationMethodsPolicy singleton.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of bookingBusiness entities.
     */
    @jakarta.annotation.Nonnull
    public BookingBusinessesRequestBuilder bookingBusinesses() {
        return new BookingBusinessesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of bookingCurrency entities.
     */
    @jakarta.annotation.Nonnull
    public BookingCurrenciesRequestBuilder bookingCurrencies() {
        return new BookingCurrenciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of businessFlowTemplate entities.
     */
    @jakarta.annotation.Nonnull
    public BusinessFlowTemplatesRequestBuilder businessFlowTemplates() {
        return new BusinessFlowTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of certificateBasedAuthConfiguration entities.
     */
    @jakarta.annotation.Nonnull
    public CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of chat entities.
     */
    @jakarta.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of command entities.
     */
    @jakarta.annotation.Nonnull
    public CommandsRequestBuilder commands() {
        return new CommandsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudCommunications singleton.
     */
    @jakarta.annotation.Nonnull
    public CommunicationsRequestBuilder communications() {
        return new CommunicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the compliance singleton.
     */
    @jakarta.annotation.Nonnull
    public ComplianceRequestBuilder compliance() {
        return new ComplianceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of externalConnection entities.
     */
    @jakarta.annotation.Nonnull
    public ConnectionsRequestBuilder connections() {
        return new ConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of orgContact entities.
     */
    @jakarta.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of contract entities.
     */
    @jakarta.annotation.Nonnull
    public ContractsRequestBuilder contracts() {
        return new ContractsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dataClassificationService singleton.
     */
    @jakarta.annotation.Nonnull
    public DataClassificationRequestBuilder dataClassification() {
        return new DataClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of dataPolicyOperation entities.
     */
    @jakarta.annotation.Nonnull
    public DataPolicyOperationsRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceAppManagement singleton.
     */
    @jakarta.annotation.Nonnull
    public DeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of deviceLocalCredentialInfo entities.
     */
    @jakarta.annotation.Nonnull
    public DeviceLocalCredentialsRequestBuilder deviceLocalCredentials() {
        return new DeviceLocalCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceManagement singleton.
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of device entities.
     */
    @jakarta.annotation.Nonnull
    public DevicesRequestBuilder devices() {
        return new DevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directory singleton.
     */
    @jakarta.annotation.Nonnull
    public DirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryObject entities.
     */
    @jakarta.annotation.Nonnull
    public DirectoryObjectsRequestBuilder directoryObjects() {
        return new DirectoryObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     */
    @jakarta.annotation.Nonnull
    public DirectoryRolesRequestBuilder directoryRoles() {
        return new DirectoryRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRoleTemplate entities.
     */
    @jakarta.annotation.Nonnull
    public DirectoryRoleTemplatesRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directorySettingTemplate entities.
     */
    @jakarta.annotation.Nonnull
    public DirectorySettingTemplatesRequestBuilder directorySettingTemplates() {
        return new DirectorySettingTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of domainDnsRecord entities.
     */
    @jakarta.annotation.Nonnull
    public DomainDnsRecordsRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of domain entities.
     */
    @jakarta.annotation.Nonnull
    public DomainsRequestBuilder domains() {
        return new DomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of drive entities.
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the educationRoot singleton.
     */
    @jakarta.annotation.Nonnull
    public EducationRequestBuilder education() {
        return new EducationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the employeeExperience singleton.
     */
    @jakarta.annotation.Nonnull
    public EmployeeExperienceRequestBuilder employeeExperience() {
        return new EmployeeExperienceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the external singleton.
     */
    @jakarta.annotation.Nonnull
    public ExternalRequestBuilder external() {
        return new ExternalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of filterOperatorSchema entities.
     */
    @jakarta.annotation.Nonnull
    public FilterOperatorsRequestBuilder filterOperators() {
        return new FilterOperatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the financials singleton.
     */
    @jakarta.annotation.Nonnull
    public FinancialsRequestBuilder financials() {
        return new FinancialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of attributeMappingFunctionSchema entities.
     */
    @jakarta.annotation.Nonnull
    public FunctionsRequestBuilder functions() {
        return new FunctionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceResource entities.
     */
    @jakarta.annotation.Nonnull
    public GovernanceResourcesRequestBuilder governanceResources() {
        return new GovernanceResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleAssignmentRequest entities.
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleAssignmentRequestsRequestBuilder governanceRoleAssignmentRequests() {
        return new GovernanceRoleAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleAssignment entities.
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleAssignmentsRequestBuilder governanceRoleAssignments() {
        return new GovernanceRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleDefinition entities.
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleDefinitionsRequestBuilder governanceRoleDefinitions() {
        return new GovernanceRoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleSetting entities.
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleSettingsRequestBuilder governanceRoleSettings() {
        return new GovernanceRoleSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceSubject entities.
     */
    @jakarta.annotation.Nonnull
    public GovernanceSubjectsRequestBuilder governanceSubjects() {
        return new GovernanceSubjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of groupLifecyclePolicy entities.
     */
    @jakarta.annotation.Nonnull
    public GroupLifecyclePoliciesRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of group entities.
     */
    @jakarta.annotation.Nonnull
    public GroupsRequestBuilder groups() {
        return new GroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityContainer singleton.
     */
    @jakarta.annotation.Nonnull
    public IdentityRequestBuilder identity() {
        return new IdentityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityGovernance singleton.
     */
    @jakarta.annotation.Nonnull
    public IdentityGovernanceRequestBuilder identityGovernance() {
        return new IdentityGovernanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityProtectionRoot singleton.
     */
    @jakarta.annotation.Nonnull
    public IdentityProtectionRequestBuilder identityProtection() {
        return new IdentityProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of identityProvider entities.
     */
    @jakarta.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the informationProtection singleton.
     */
    @jakarta.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of invitation entities.
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageEvent entities.
     */
    @jakarta.annotation.Nonnull
    public MessageEventsRequestBuilder messageEvents() {
        return new MessageEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageRecipient entities.
     */
    @jakarta.annotation.Nonnull
    public MessageRecipientsRequestBuilder messageRecipients() {
        return new MessageRecipientsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageTrace entities.
     */
    @jakarta.annotation.Nonnull
    public MessageTracesRequestBuilder messageTraces() {
        return new MessageTracesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of mobilityManagementPolicy entities.
     */
    @jakarta.annotation.Nonnull
    public MobilityManagementPoliciesRequestBuilder mobilityManagementPolicies() {
        return new MobilityManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the monitoring singleton.
     */
    @jakarta.annotation.Nonnull
    public MonitoringRequestBuilder monitoring() {
        return new MonitoringRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the networkAccessRoot singleton.
     */
    @jakarta.annotation.Nonnull
    public NetworkAccessRequestBuilder networkAccess() {
        return new NetworkAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of oAuth2PermissionGrant entities.
     */
    @jakarta.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of onPremisesPublishingProfile entities.
     */
    @jakarta.annotation.Nonnull
    public OnPremisesPublishingProfilesRequestBuilder onPremisesPublishingProfiles() {
        return new OnPremisesPublishingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of organization entities.
     */
    @jakarta.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of payloadResponse entities.
     */
    @jakarta.annotation.Nonnull
    public PayloadResponseRequestBuilder payloadResponse() {
        return new PayloadResponseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of resourceSpecificPermissionGrant entities.
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The places property
     */
    @jakarta.annotation.Nonnull
    public PlacesRequestBuilder places() {
        return new PlacesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the planner singleton.
     */
    @jakarta.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the policyRoot singleton.
     */
    @jakarta.annotation.Nonnull
    public PoliciesRequestBuilder policies() {
        return new PoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the print singleton.
     */
    @jakarta.annotation.Nonnull
    public PrintRequestBuilder print() {
        return new PrintRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the privacy singleton.
     */
    @jakarta.annotation.Nonnull
    public PrivacyRequestBuilder privacy() {
        return new PrivacyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedAccess entities.
     */
    @jakarta.annotation.Nonnull
    public PrivilegedAccessRequestBuilder privilegedAccess() {
        return new PrivilegedAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedApproval entities.
     */
    @jakarta.annotation.Nonnull
    public PrivilegedApprovalRequestBuilder privilegedApproval() {
        return new PrivilegedApprovalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedOperationEvent entities.
     */
    @jakarta.annotation.Nonnull
    public PrivilegedOperationEventsRequestBuilder privilegedOperationEvents() {
        return new PrivilegedOperationEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRoleAssignmentRequest entities.
     */
    @jakarta.annotation.Nonnull
    public PrivilegedRoleAssignmentRequestsRequestBuilder privilegedRoleAssignmentRequests() {
        return new PrivilegedRoleAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRoleAssignment entities.
     */
    @jakarta.annotation.Nonnull
    public PrivilegedRoleAssignmentsRequestBuilder privilegedRoleAssignments() {
        return new PrivilegedRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRole entities.
     */
    @jakarta.annotation.Nonnull
    public PrivilegedRolesRequestBuilder privilegedRoles() {
        return new PrivilegedRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedSignupStatus entities.
     */
    @jakarta.annotation.Nonnull
    public PrivilegedSignupStatusRequestBuilder privilegedSignupStatus() {
        return new PrivilegedSignupStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of programControl entities.
     */
    @jakarta.annotation.Nonnull
    public ProgramControlsRequestBuilder programControls() {
        return new ProgramControlsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of programControlType entities.
     */
    @jakarta.annotation.Nonnull
    public ProgramControlTypesRequestBuilder programControlTypes() {
        return new ProgramControlTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of program entities.
     */
    @jakarta.annotation.Nonnull
    public ProgramsRequestBuilder programs() {
        return new ProgramsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reportRoot singleton.
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of riskDetection entities.
     */
    @jakarta.annotation.Nonnull
    public RiskDetectionsRequestBuilder riskDetections() {
        return new RiskDetectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of riskyUser entities.
     */
    @jakarta.annotation.Nonnull
    public RiskyUsersRequestBuilder riskyUsers() {
        return new RiskyUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagement singleton.
     */
    @jakarta.annotation.Nonnull
    public RoleManagementRequestBuilder roleManagement() {
        return new RoleManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of schemaExtension entities.
     */
    @jakarta.annotation.Nonnull
    public SchemaExtensionsRequestBuilder schemaExtensions() {
        return new SchemaExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of scopedRoleMembership entities.
     */
    @jakarta.annotation.Nonnull
    public ScopedRoleMembershipsRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the searchEntity singleton.
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the security singleton.
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalsRequestBuilder servicePrincipals() {
        return new ServicePrincipalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directorySetting entities.
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of sharedDriveItem entities.
     */
    @jakarta.annotation.Nonnull
    public SharesRequestBuilder shares() {
        return new SharesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of site entities.
     */
    @jakarta.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the solutionsRoot singleton.
     */
    @jakarta.annotation.Nonnull
    public SolutionsRequestBuilder solutions() {
        return new SolutionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of subscribedSku entities.
     */
    @jakarta.annotation.Nonnull
    public SubscribedSkusRequestBuilder subscribedSkus() {
        return new SubscribedSkusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of subscription entities.
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of team entities.
     */
    @jakarta.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of teamsTemplate entities.
     */
    @jakarta.annotation.Nonnull
    public TeamsTemplatesRequestBuilder teamsTemplates() {
        return new TeamsTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of teamTemplateDefinition entities.
     */
    @jakarta.annotation.Nonnull
    public TeamTemplateDefinitionRequestBuilder teamTemplateDefinition() {
        return new TeamTemplateDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the teamwork singleton.
     */
    @jakarta.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantRelationship singleton.
     */
    @jakarta.annotation.Nonnull
    public TenantRelationshipsRequestBuilder tenantRelationships() {
        return new TenantRelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the store singleton.
     */
    @jakarta.annotation.Nonnull
    public TermStoreRequestBuilder termStore() {
        return new TermStoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threatSubmissionRoot singleton.
     */
    @jakarta.annotation.Nonnull
    public ThreatSubmissionRequestBuilder threatSubmission() {
        return new ThreatSubmissionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the trustFramework singleton.
     */
    @jakarta.annotation.Nonnull
    public TrustFrameworkRequestBuilder trustFramework() {
        return new TrustFrameworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of user entities.
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @param appId Alternate key of application
     * @return a ApplicationsWithAppIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithAppIdRequestBuilder applicationsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ApplicationsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @param uniqueName Alternate key of application
     * @return a ApplicationsWithUniqueNameRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithUniqueNameRequestBuilder applicationsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new ApplicationsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Instantiates a new BaseGraphServiceClient and sets the default values.
     * @param backingStore The backing store to use for the models.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BaseGraphServiceClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final BackingStoreFactory backingStore) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://graph.microsoft.com/beta");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
        this.requestAdapter.enableBackingStore(backingStore);
    }
    /**
     * Provides operations to manage the collection of device entities.
     * @param deviceId Alternate key of device
     * @return a DevicesWithDeviceIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DevicesWithDeviceIdRequestBuilder devicesWithDeviceId(@jakarta.annotation.Nonnull final String deviceId) {
        Objects.requireNonNull(deviceId);
        return new DevicesWithDeviceIdRequestBuilder(pathParameters, requestAdapter, deviceId);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     * @param roleTemplateId Alternate key of directoryRole
     * @return a DirectoryRolesWithRoleTemplateIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DirectoryRolesWithRoleTemplateIdRequestBuilder directoryRolesWithRoleTemplateId(@jakarta.annotation.Nonnull final String roleTemplateId) {
        Objects.requireNonNull(roleTemplateId);
        return new DirectoryRolesWithRoleTemplateIdRequestBuilder(pathParameters, requestAdapter, roleTemplateId);
    }
    /**
     * Provides operations to manage the collection of group entities.
     * @param uniqueName Alternate key of group
     * @return a GroupsWithUniqueNameRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GroupsWithUniqueNameRequestBuilder groupsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new GroupsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @param appId Alternate key of servicePrincipal
     * @return a ServicePrincipalsWithAppIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalsWithAppIdRequestBuilder servicePrincipalsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ServicePrincipalsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
}
