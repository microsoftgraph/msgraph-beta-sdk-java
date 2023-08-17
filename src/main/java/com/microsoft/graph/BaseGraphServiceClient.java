package com.microsoft.graph;

import com.microsoft.graph.accessreviewdecisions.AccessReviewDecisionsRequestBuilder;
import com.microsoft.graph.accessreviews.AccessReviewsRequestBuilder;
import com.microsoft.graph.activitystatistics.ActivitystatisticsRequestBuilder;
import com.microsoft.graph.admin.AdminRequestBuilder;
import com.microsoft.graph.administrativeunits.AdministrativeUnitsRequestBuilder;
import com.microsoft.graph.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.agreements.AgreementsRequestBuilder;
import com.microsoft.graph.alloweddatalocations.AllowedDataLocationsRequestBuilder;
import com.microsoft.graph.app.AppRequestBuilder;
import com.microsoft.graph.appcatalogs.AppCatalogsRequestBuilder;
import com.microsoft.graph.applications.ApplicationsRequestBuilder;
import com.microsoft.graph.applicationswithappid.ApplicationsWithAppIdRequestBuilder;
import com.microsoft.graph.applicationswithuniquename.ApplicationsWithUniqueNameRequestBuilder;
import com.microsoft.graph.applicationtemplates.ApplicationTemplatesRequestBuilder;
import com.microsoft.graph.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.approvalworkflowproviders.ApprovalWorkflowProvidersRequestBuilder;
import com.microsoft.graph.auditlogs.AuditLogsRequestBuilder;
import com.microsoft.graph.authenticationmethodconfigurations.AuthenticationMethodConfigurationsRequestBuilder;
import com.microsoft.graph.authenticationmethodspolicy.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.bookingbusinesses.BookingBusinessesRequestBuilder;
import com.microsoft.graph.bookingcurrencies.BookingCurrenciesRequestBuilder;
import com.microsoft.graph.businessflowtemplates.BusinessFlowTemplatesRequestBuilder;
import com.microsoft.graph.certificatebasedauthconfiguration.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.chats.ChatsRequestBuilder;
import com.microsoft.graph.commands.CommandsRequestBuilder;
import com.microsoft.graph.communications.CommunicationsRequestBuilder;
import com.microsoft.graph.compliance.ComplianceRequestBuilder;
import com.microsoft.graph.connections.ConnectionsRequestBuilder;
import com.microsoft.graph.contacts.ContactsRequestBuilder;
import com.microsoft.graph.contracts.ContractsRequestBuilder;
import com.microsoft.graph.dataclassification.DataClassificationRequestBuilder;
import com.microsoft.graph.datapolicyoperations.DataPolicyOperationsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.devicelocalcredentials.DeviceLocalCredentialsRequestBuilder;
import com.microsoft.graph.devicemanagement.DeviceManagementRequestBuilder;
import com.microsoft.graph.devices.DevicesRequestBuilder;
import com.microsoft.graph.deviceswithdeviceid.DevicesWithDeviceIdRequestBuilder;
import com.microsoft.graph.directory.DirectoryRequestBuilder;
import com.microsoft.graph.directoryobjects.DirectoryObjectsRequestBuilder;
import com.microsoft.graph.directoryroles.DirectoryRolesRequestBuilder;
import com.microsoft.graph.directoryroleswithroletemplateid.DirectoryRolesWithRoleTemplateIdRequestBuilder;
import com.microsoft.graph.directoryroletemplates.DirectoryRoleTemplatesRequestBuilder;
import com.microsoft.graph.directorysettingtemplates.DirectorySettingTemplatesRequestBuilder;
import com.microsoft.graph.domaindnsrecords.DomainDnsRecordsRequestBuilder;
import com.microsoft.graph.domains.DomainsRequestBuilder;
import com.microsoft.graph.drives.DrivesRequestBuilder;
import com.microsoft.graph.education.EducationRequestBuilder;
import com.microsoft.graph.employeeexperience.EmployeeExperienceRequestBuilder;
import com.microsoft.graph.external.ExternalRequestBuilder;
import com.microsoft.graph.filteroperators.FilterOperatorsRequestBuilder;
import com.microsoft.graph.financials.FinancialsRequestBuilder;
import com.microsoft.graph.functions.FunctionsRequestBuilder;
import com.microsoft.graph.governanceresources.GovernanceResourcesRequestBuilder;
import com.microsoft.graph.governanceroleassignmentrequests.GovernanceRoleAssignmentRequestsRequestBuilder;
import com.microsoft.graph.governanceroleassignments.GovernanceRoleAssignmentsRequestBuilder;
import com.microsoft.graph.governanceroledefinitions.GovernanceRoleDefinitionsRequestBuilder;
import com.microsoft.graph.governancerolesettings.GovernanceRoleSettingsRequestBuilder;
import com.microsoft.graph.governancesubjects.GovernanceSubjectsRequestBuilder;
import com.microsoft.graph.grouplifecyclepolicies.GroupLifecyclePoliciesRequestBuilder;
import com.microsoft.graph.groups.GroupsRequestBuilder;
import com.microsoft.graph.groupswithuniquename.GroupsWithUniqueNameRequestBuilder;
import com.microsoft.graph.identity.IdentityRequestBuilder;
import com.microsoft.graph.identitygovernance.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.identityprotection.IdentityProtectionRequestBuilder;
import com.microsoft.graph.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.invitations.InvitationsRequestBuilder;
import com.microsoft.graph.messageevents.MessageEventsRequestBuilder;
import com.microsoft.graph.messagerecipients.MessageRecipientsRequestBuilder;
import com.microsoft.graph.messagetraces.MessageTracesRequestBuilder;
import com.microsoft.graph.mobilitymanagementpolicies.MobilityManagementPoliciesRequestBuilder;
import com.microsoft.graph.monitoring.MonitoringRequestBuilder;
import com.microsoft.graph.networkaccess.NetworkAccessRequestBuilder;
import com.microsoft.graph.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.OnPremisesPublishingProfilesRequestBuilder;
import com.microsoft.graph.organization.OrganizationRequestBuilder;
import com.microsoft.graph.payloadresponse.PayloadResponseRequestBuilder;
import com.microsoft.graph.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.places.PlacesRequestBuilder;
import com.microsoft.graph.planner.PlannerRequestBuilder;
import com.microsoft.graph.policies.PoliciesRequestBuilder;
import com.microsoft.graph.print.PrintRequestBuilder;
import com.microsoft.graph.privacy.PrivacyRequestBuilder;
import com.microsoft.graph.privilegedaccess.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.privilegedapproval.PrivilegedApprovalRequestBuilder;
import com.microsoft.graph.privilegedoperationevents.PrivilegedOperationEventsRequestBuilder;
import com.microsoft.graph.privilegedroleassignmentrequests.PrivilegedRoleAssignmentRequestsRequestBuilder;
import com.microsoft.graph.privilegedroleassignments.PrivilegedRoleAssignmentsRequestBuilder;
import com.microsoft.graph.privilegedroles.PrivilegedRolesRequestBuilder;
import com.microsoft.graph.privilegedsignupstatus.PrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.programcontrols.ProgramControlsRequestBuilder;
import com.microsoft.graph.programcontroltypes.ProgramControlTypesRequestBuilder;
import com.microsoft.graph.programs.ProgramsRequestBuilder;
import com.microsoft.graph.reports.ReportsRequestBuilder;
import com.microsoft.graph.riskdetections.RiskDetectionsRequestBuilder;
import com.microsoft.graph.riskyusers.RiskyUsersRequestBuilder;
import com.microsoft.graph.rolemanagement.RoleManagementRequestBuilder;
import com.microsoft.graph.schemaextensions.SchemaExtensionsRequestBuilder;
import com.microsoft.graph.scopedrolememberships.ScopedRoleMembershipsRequestBuilder;
import com.microsoft.graph.search.SearchRequestBuilder;
import com.microsoft.graph.security.SecurityRequestBuilder;
import com.microsoft.graph.serviceprincipals.ServicePrincipalsRequestBuilder;
import com.microsoft.graph.serviceprincipalswithappid.ServicePrincipalsWithAppIdRequestBuilder;
import com.microsoft.graph.settings.SettingsRequestBuilder;
import com.microsoft.graph.shares.SharesRequestBuilder;
import com.microsoft.graph.sites.SitesRequestBuilder;
import com.microsoft.graph.solutions.SolutionsRequestBuilder;
import com.microsoft.graph.subscribedskus.SubscribedSkusRequestBuilder;
import com.microsoft.graph.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.teams.TeamsRequestBuilder;
import com.microsoft.graph.teamstemplates.TeamsTemplatesRequestBuilder;
import com.microsoft.graph.teamtemplatedefinition.TeamTemplateDefinitionRequestBuilder;
import com.microsoft.graph.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.tenantrelationships.TenantRelationshipsRequestBuilder;
import com.microsoft.graph.termstore.TermStoreRequestBuilder;
import com.microsoft.graph.threatsubmission.ThreatSubmissionRequestBuilder;
import com.microsoft.graph.trustframework.TrustFrameworkRequestBuilder;
import com.microsoft.graph.users.UsersRequestBuilder;
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
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
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
     * @return a applicationsWithAppIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithAppIdRequestBuilder applicationsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ApplicationsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @param uniqueName Alternate key of application
     * @return a applicationsWithUniqueNameRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithUniqueNameRequestBuilder applicationsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new ApplicationsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Instantiates a new BaseGraphServiceClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BaseGraphServiceClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(JsonSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(TextSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(FormSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(MultipartSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(JsonParseNodeFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(FormParseNodeFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(TextParseNodeFactory.class);
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://graph.microsoft.com/beta");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
    /**
     * Provides operations to manage the collection of device entities.
     * @param deviceId Alternate key of device
     * @return a devicesWithDeviceIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DevicesWithDeviceIdRequestBuilder devicesWithDeviceId(@jakarta.annotation.Nonnull final String deviceId) {
        Objects.requireNonNull(deviceId);
        return new DevicesWithDeviceIdRequestBuilder(pathParameters, requestAdapter, deviceId);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     * @param roleTemplateId Alternate key of directoryRole
     * @return a directoryRolesWithRoleTemplateIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DirectoryRolesWithRoleTemplateIdRequestBuilder directoryRolesWithRoleTemplateId(@jakarta.annotation.Nonnull final String roleTemplateId) {
        Objects.requireNonNull(roleTemplateId);
        return new DirectoryRolesWithRoleTemplateIdRequestBuilder(pathParameters, requestAdapter, roleTemplateId);
    }
    /**
     * Provides operations to manage the collection of group entities.
     * @param uniqueName Alternate key of group
     * @return a groupsWithUniqueNameRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GroupsWithUniqueNameRequestBuilder groupsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new GroupsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @param appId Alternate key of servicePrincipal
     * @return a servicePrincipalsWithAppIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalsWithAppIdRequestBuilder servicePrincipalsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ServicePrincipalsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
}
