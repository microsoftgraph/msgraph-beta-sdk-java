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
import com.microsoft.graph.beta.placeswithplaceid.PlacesWithPlaceIdRequestBuilder;
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
import com.microsoft.graph.beta.workplace.WorkplaceRequestBuilder;
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
     * @return a {@link AccessReviewDecisionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessReviewDecisionsRequestBuilder accessReviewDecisions() {
        return new AccessReviewDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of accessReview entities.
     * @return a {@link AccessReviewsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AccessReviewsRequestBuilder accessReviews() {
        return new AccessReviewsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of activityStatistics entities.
     * @return a {@link ActivitystatisticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivitystatisticsRequestBuilder activitystatistics() {
        return new ActivitystatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the admin singleton.
     * @return a {@link AdminRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdminRequestBuilder admin() {
        return new AdminRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of administrativeUnit entities.
     * @return a {@link AdministrativeUnitsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AdministrativeUnitsRequestBuilder administrativeUnits() {
        return new AdministrativeUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of agreementAcceptance entities.
     * @return a {@link AgreementAcceptancesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of agreement entities.
     * @return a {@link AgreementsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AgreementsRequestBuilder agreements() {
        return new AgreementsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of allowedDataLocation entities.
     * @return a {@link AllowedDataLocationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AllowedDataLocationsRequestBuilder allowedDataLocations() {
        return new AllowedDataLocationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the commsApplication singleton.
     * @return a {@link AppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRequestBuilder app() {
        return new AppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appCatalogs singleton.
     * @return a {@link AppCatalogsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @return a {@link ApplicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationsRequestBuilder applications() {
        return new ApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of applicationTemplate entities.
     * @return a {@link ApplicationTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationTemplatesRequestBuilder applicationTemplates() {
        return new ApplicationTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of appRoleAssignment entities.
     * @return a {@link AppRoleAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of approvalWorkflowProvider entities.
     * @return a {@link ApprovalWorkflowProvidersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApprovalWorkflowProvidersRequestBuilder approvalWorkflowProviders() {
        return new ApprovalWorkflowProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the auditLogRoot singleton.
     * @return a {@link AuditLogsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuditLogsRequestBuilder auditLogs() {
        return new AuditLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of authenticationMethodConfiguration entities.
     * @return a {@link AuthenticationMethodConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodConfigurationsRequestBuilder authenticationMethodConfigurations() {
        return new AuthenticationMethodConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authenticationMethodsPolicy singleton.
     * @return a {@link AuthenticationMethodsPolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of bookingBusiness entities.
     * @return a {@link BookingBusinessesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BookingBusinessesRequestBuilder bookingBusinesses() {
        return new BookingBusinessesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of bookingCurrency entities.
     * @return a {@link BookingCurrenciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BookingCurrenciesRequestBuilder bookingCurrencies() {
        return new BookingCurrenciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of businessFlowTemplate entities.
     * @return a {@link BusinessFlowTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BusinessFlowTemplatesRequestBuilder businessFlowTemplates() {
        return new BusinessFlowTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of certificateBasedAuthConfiguration entities.
     * @return a {@link CertificateBasedAuthConfigurationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of chat entities.
     * @return a {@link ChatsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of command entities.
     * @return a {@link CommandsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CommandsRequestBuilder commands() {
        return new CommandsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudCommunications singleton.
     * @return a {@link CommunicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CommunicationsRequestBuilder communications() {
        return new CommunicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the compliance singleton.
     * @return a {@link ComplianceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComplianceRequestBuilder compliance() {
        return new ComplianceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of externalConnection entities.
     * @return a {@link ConnectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConnectionsRequestBuilder connections() {
        return new ConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of orgContact entities.
     * @return a {@link ContactsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of contract entities.
     * @return a {@link ContractsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContractsRequestBuilder contracts() {
        return new ContractsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dataClassificationService singleton.
     * @return a {@link DataClassificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataClassificationRequestBuilder dataClassification() {
        return new DataClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of dataPolicyOperation entities.
     * @return a {@link DataPolicyOperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataPolicyOperationsRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceAppManagement singleton.
     * @return a {@link DeviceAppManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of deviceLocalCredentialInfo entities.
     * @return a {@link DeviceLocalCredentialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceLocalCredentialsRequestBuilder deviceLocalCredentials() {
        return new DeviceLocalCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceManagement singleton.
     * @return a {@link DeviceManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of device entities.
     * @return a {@link DevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DevicesRequestBuilder devices() {
        return new DevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directory singleton.
     * @return a {@link DirectoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryObject entities.
     * @return a {@link DirectoryObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryObjectsRequestBuilder directoryObjects() {
        return new DirectoryObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     * @return a {@link DirectoryRolesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRolesRequestBuilder directoryRoles() {
        return new DirectoryRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRoleTemplate entities.
     * @return a {@link DirectoryRoleTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRoleTemplatesRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directorySettingTemplate entities.
     * @return a {@link DirectorySettingTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectorySettingTemplatesRequestBuilder directorySettingTemplates() {
        return new DirectorySettingTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of domainDnsRecord entities.
     * @return a {@link DomainDnsRecordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainDnsRecordsRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of domain entities.
     * @return a {@link DomainsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DomainsRequestBuilder domains() {
        return new DomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of drive entities.
     * @return a {@link DrivesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the educationRoot singleton.
     * @return a {@link EducationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EducationRequestBuilder education() {
        return new EducationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the employeeExperience singleton.
     * @return a {@link EmployeeExperienceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmployeeExperienceRequestBuilder employeeExperience() {
        return new EmployeeExperienceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the external singleton.
     * @return a {@link ExternalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExternalRequestBuilder external() {
        return new ExternalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of filterOperatorSchema entities.
     * @return a {@link FilterOperatorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilterOperatorsRequestBuilder filterOperators() {
        return new FilterOperatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the financials singleton.
     * @return a {@link FinancialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FinancialsRequestBuilder financials() {
        return new FinancialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of attributeMappingFunctionSchema entities.
     * @return a {@link FunctionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FunctionsRequestBuilder functions() {
        return new FunctionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceResource entities.
     * @return a {@link GovernanceResourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GovernanceResourcesRequestBuilder governanceResources() {
        return new GovernanceResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleAssignmentRequest entities.
     * @return a {@link GovernanceRoleAssignmentRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleAssignmentRequestsRequestBuilder governanceRoleAssignmentRequests() {
        return new GovernanceRoleAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleAssignment entities.
     * @return a {@link GovernanceRoleAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleAssignmentsRequestBuilder governanceRoleAssignments() {
        return new GovernanceRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleDefinition entities.
     * @return a {@link GovernanceRoleDefinitionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleDefinitionsRequestBuilder governanceRoleDefinitions() {
        return new GovernanceRoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleSetting entities.
     * @return a {@link GovernanceRoleSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GovernanceRoleSettingsRequestBuilder governanceRoleSettings() {
        return new GovernanceRoleSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceSubject entities.
     * @return a {@link GovernanceSubjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GovernanceSubjectsRequestBuilder governanceSubjects() {
        return new GovernanceSubjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of groupLifecyclePolicy entities.
     * @return a {@link GroupLifecyclePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupLifecyclePoliciesRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of group entities.
     * @return a {@link GroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupsRequestBuilder groups() {
        return new GroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityContainer singleton.
     * @return a {@link IdentityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityRequestBuilder identity() {
        return new IdentityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityGovernance singleton.
     * @return a {@link IdentityGovernanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityGovernanceRequestBuilder identityGovernance() {
        return new IdentityGovernanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the identityProtectionRoot singleton.
     * @return a {@link IdentityProtectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityProtectionRequestBuilder identityProtection() {
        return new IdentityProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of identityProvider entities.
     * @return a {@link IdentityProvidersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the informationProtection singleton.
     * @return a {@link InformationProtectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of invitation entities.
     * @return a {@link InvitationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageEvent entities.
     * @return a {@link MessageEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessageEventsRequestBuilder messageEvents() {
        return new MessageEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageRecipient entities.
     * @return a {@link MessageRecipientsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessageRecipientsRequestBuilder messageRecipients() {
        return new MessageRecipientsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageTrace entities.
     * @return a {@link MessageTracesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessageTracesRequestBuilder messageTraces() {
        return new MessageTracesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of mobilityManagementPolicy entities.
     * @return a {@link MobilityManagementPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobilityManagementPoliciesRequestBuilder mobilityManagementPolicies() {
        return new MobilityManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the monitoring singleton.
     * @return a {@link MonitoringRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MonitoringRequestBuilder monitoring() {
        return new MonitoringRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the networkAccessRoot singleton.
     * @return a {@link NetworkAccessRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NetworkAccessRequestBuilder networkAccess() {
        return new NetworkAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of oAuth2PermissionGrant entities.
     * @return a {@link Oauth2PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of onPremisesPublishingProfile entities.
     * @return a {@link OnPremisesPublishingProfilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnPremisesPublishingProfilesRequestBuilder onPremisesPublishingProfiles() {
        return new OnPremisesPublishingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of organization entities.
     * @return a {@link OrganizationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of payloadResponse entities.
     * @return a {@link PayloadResponseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PayloadResponseRequestBuilder payloadResponse() {
        return new PayloadResponseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of resourceSpecificPermissionGrant entities.
     * @return a {@link PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The places property
     * @return a {@link PlacesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlacesRequestBuilder places() {
        return new PlacesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the planner singleton.
     * @return a {@link PlannerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the policyRoot singleton.
     * @return a {@link PoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PoliciesRequestBuilder policies() {
        return new PoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the print singleton.
     * @return a {@link PrintRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrintRequestBuilder print() {
        return new PrintRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the privacy singleton.
     * @return a {@link PrivacyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivacyRequestBuilder privacy() {
        return new PrivacyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedAccess entities.
     * @return a {@link PrivilegedAccessRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedAccessRequestBuilder privilegedAccess() {
        return new PrivilegedAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedApproval entities.
     * @return a {@link PrivilegedApprovalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedApprovalRequestBuilder privilegedApproval() {
        return new PrivilegedApprovalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedOperationEvent entities.
     * @return a {@link PrivilegedOperationEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedOperationEventsRequestBuilder privilegedOperationEvents() {
        return new PrivilegedOperationEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRoleAssignmentRequest entities.
     * @return a {@link PrivilegedRoleAssignmentRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedRoleAssignmentRequestsRequestBuilder privilegedRoleAssignmentRequests() {
        return new PrivilegedRoleAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRoleAssignment entities.
     * @return a {@link PrivilegedRoleAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedRoleAssignmentsRequestBuilder privilegedRoleAssignments() {
        return new PrivilegedRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRole entities.
     * @return a {@link PrivilegedRolesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedRolesRequestBuilder privilegedRoles() {
        return new PrivilegedRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedSignupStatus entities.
     * @return a {@link PrivilegedSignupStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrivilegedSignupStatusRequestBuilder privilegedSignupStatus() {
        return new PrivilegedSignupStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of programControl entities.
     * @return a {@link ProgramControlsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProgramControlsRequestBuilder programControls() {
        return new ProgramControlsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of programControlType entities.
     * @return a {@link ProgramControlTypesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProgramControlTypesRequestBuilder programControlTypes() {
        return new ProgramControlTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of program entities.
     * @return a {@link ProgramsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProgramsRequestBuilder programs() {
        return new ProgramsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reportRoot singleton.
     * @return a {@link ReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of riskDetection entities.
     * @return a {@link RiskDetectionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RiskDetectionsRequestBuilder riskDetections() {
        return new RiskDetectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of riskyUser entities.
     * @return a {@link RiskyUsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RiskyUsersRequestBuilder riskyUsers() {
        return new RiskyUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleManagement singleton.
     * @return a {@link RoleManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RoleManagementRequestBuilder roleManagement() {
        return new RoleManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of schemaExtension entities.
     * @return a {@link SchemaExtensionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SchemaExtensionsRequestBuilder schemaExtensions() {
        return new SchemaExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of scopedRoleMembership entities.
     * @return a {@link ScopedRoleMembershipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScopedRoleMembershipsRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the searchEntity singleton.
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the security singleton.
     * @return a {@link SecurityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @return a {@link ServicePrincipalsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalsRequestBuilder servicePrincipals() {
        return new ServicePrincipalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directorySetting entities.
     * @return a {@link SettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of sharedDriveItem entities.
     * @return a {@link SharesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharesRequestBuilder shares() {
        return new SharesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of site entities.
     * @return a {@link SitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the solutionsRoot singleton.
     * @return a {@link SolutionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SolutionsRequestBuilder solutions() {
        return new SolutionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of subscribedSku entities.
     * @return a {@link SubscribedSkusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscribedSkusRequestBuilder subscribedSkus() {
        return new SubscribedSkusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of subscription entities.
     * @return a {@link SubscriptionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of team entities.
     * @return a {@link TeamsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of teamsTemplate entities.
     * @return a {@link TeamsTemplatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamsTemplatesRequestBuilder teamsTemplates() {
        return new TeamsTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of teamTemplateDefinition entities.
     * @return a {@link TeamTemplateDefinitionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamTemplateDefinitionRequestBuilder teamTemplateDefinition() {
        return new TeamTemplateDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the teamwork singleton.
     * @return a {@link TeamworkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantRelationship singleton.
     * @return a {@link TenantRelationshipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TenantRelationshipsRequestBuilder tenantRelationships() {
        return new TenantRelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the store singleton.
     * @return a {@link TermStoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TermStoreRequestBuilder termStore() {
        return new TermStoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threatSubmissionRoot singleton.
     * @return a {@link ThreatSubmissionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThreatSubmissionRequestBuilder threatSubmission() {
        return new ThreatSubmissionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the trustFramework singleton.
     * @return a {@link TrustFrameworkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrustFrameworkRequestBuilder trustFramework() {
        return new TrustFrameworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of user entities.
     * @return a {@link UsersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workplace singleton.
     * @return a {@link WorkplaceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkplaceRequestBuilder workplace() {
        return new WorkplaceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @param appId Alternate key of application
     * @return a {@link ApplicationsWithAppIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithAppIdRequestBuilder applicationsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ApplicationsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @param uniqueName Alternate key of application
     * @return a {@link ApplicationsWithUniqueNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithUniqueNameRequestBuilder applicationsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new ApplicationsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Instantiates a new {@link BaseGraphServiceClient} and sets the default values.
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
     * @return a {@link DevicesWithDeviceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DevicesWithDeviceIdRequestBuilder devicesWithDeviceId(@jakarta.annotation.Nonnull final String deviceId) {
        Objects.requireNonNull(deviceId);
        return new DevicesWithDeviceIdRequestBuilder(pathParameters, requestAdapter, deviceId);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     * @param roleTemplateId Alternate key of directoryRole
     * @return a {@link DirectoryRolesWithRoleTemplateIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRolesWithRoleTemplateIdRequestBuilder directoryRolesWithRoleTemplateId(@jakarta.annotation.Nonnull final String roleTemplateId) {
        Objects.requireNonNull(roleTemplateId);
        return new DirectoryRolesWithRoleTemplateIdRequestBuilder(pathParameters, requestAdapter, roleTemplateId);
    }
    /**
     * Provides operations to manage the collection of group entities.
     * @param uniqueName Alternate key of group
     * @return a {@link GroupsWithUniqueNameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupsWithUniqueNameRequestBuilder groupsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new GroupsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Provides operations to manage the collection of place entities.
     * @param placeId Alternate key of place
     * @return a {@link PlacesWithPlaceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlacesWithPlaceIdRequestBuilder placesWithPlaceId(@jakarta.annotation.Nonnull final String placeId) {
        Objects.requireNonNull(placeId);
        return new PlacesWithPlaceIdRequestBuilder(pathParameters, requestAdapter, placeId);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @param appId Alternate key of servicePrincipal
     * @return a {@link ServicePrincipalsWithAppIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalsWithAppIdRequestBuilder servicePrincipalsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ServicePrincipalsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
}
