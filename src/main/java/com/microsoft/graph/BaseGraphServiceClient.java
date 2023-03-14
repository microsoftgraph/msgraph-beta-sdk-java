package com.microsoft.graph;

import com.microsoft.graph.accessreviewdecisions.AccessReviewDecisionsRequestBuilder;
import com.microsoft.graph.accessreviewdecisions.item.AccessReviewDecisionItemRequestBuilder;
import com.microsoft.graph.accessreviews.AccessReviewsRequestBuilder;
import com.microsoft.graph.accessreviews.item.AccessReviewItemRequestBuilder;
import com.microsoft.graph.activitystatistics.ActivitystatisticsRequestBuilder;
import com.microsoft.graph.activitystatistics.item.ActivityStatisticsItemRequestBuilder;
import com.microsoft.graph.admin.AdminRequestBuilder;
import com.microsoft.graph.administrativeunits.AdministrativeUnitsRequestBuilder;
import com.microsoft.graph.administrativeunits.item.AdministrativeUnitItemRequestBuilder;
import com.microsoft.graph.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.agreementacceptances.item.AgreementAcceptanceItemRequestBuilder;
import com.microsoft.graph.agreements.AgreementsRequestBuilder;
import com.microsoft.graph.agreements.item.AgreementItemRequestBuilder;
import com.microsoft.graph.alloweddatalocations.AllowedDataLocationsRequestBuilder;
import com.microsoft.graph.alloweddatalocations.item.AllowedDataLocationItemRequestBuilder;
import com.microsoft.graph.app.AppRequestBuilder;
import com.microsoft.graph.appcatalogs.AppCatalogsRequestBuilder;
import com.microsoft.graph.applications.ApplicationsRequestBuilder;
import com.microsoft.graph.applications.item.ApplicationItemRequestBuilder;
import com.microsoft.graph.applicationtemplates.ApplicationTemplatesRequestBuilder;
import com.microsoft.graph.applicationtemplates.item.ApplicationTemplateItemRequestBuilder;
import com.microsoft.graph.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.approleassignments.item.AppRoleAssignmentItemRequestBuilder;
import com.microsoft.graph.approvalworkflowproviders.ApprovalWorkflowProvidersRequestBuilder;
import com.microsoft.graph.approvalworkflowproviders.item.ApprovalWorkflowProviderItemRequestBuilder;
import com.microsoft.graph.auditlogs.AuditLogsRequestBuilder;
import com.microsoft.graph.authenticationmethodconfigurations.AuthenticationMethodConfigurationsRequestBuilder;
import com.microsoft.graph.authenticationmethodconfigurations.item.AuthenticationMethodConfigurationItemRequestBuilder;
import com.microsoft.graph.authenticationmethodspolicy.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.bookingbusinesses.BookingBusinessesRequestBuilder;
import com.microsoft.graph.bookingbusinesses.item.BookingBusinessItemRequestBuilder;
import com.microsoft.graph.bookingcurrencies.BookingCurrenciesRequestBuilder;
import com.microsoft.graph.bookingcurrencies.item.BookingCurrencyItemRequestBuilder;
import com.microsoft.graph.branding.BrandingRequestBuilder;
import com.microsoft.graph.businessflowtemplates.BusinessFlowTemplatesRequestBuilder;
import com.microsoft.graph.businessflowtemplates.item.BusinessFlowTemplateItemRequestBuilder;
import com.microsoft.graph.certificatebasedauthconfiguration.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.certificatebasedauthconfiguration.item.CertificateBasedAuthConfigurationItemRequestBuilder;
import com.microsoft.graph.chats.ChatsRequestBuilder;
import com.microsoft.graph.chats.item.ChatItemRequestBuilder;
import com.microsoft.graph.commands.CommandsRequestBuilder;
import com.microsoft.graph.commands.item.CommandItemRequestBuilder;
import com.microsoft.graph.communications.CommunicationsRequestBuilder;
import com.microsoft.graph.compliance.ComplianceRequestBuilder;
import com.microsoft.graph.connections.ConnectionsRequestBuilder;
import com.microsoft.graph.connections.item.ExternalConnectionItemRequestBuilder;
import com.microsoft.graph.contacts.ContactsRequestBuilder;
import com.microsoft.graph.contacts.item.OrgContactItemRequestBuilder;
import com.microsoft.graph.contracts.ContractsRequestBuilder;
import com.microsoft.graph.contracts.item.ContractItemRequestBuilder;
import com.microsoft.graph.dataclassification.DataClassificationRequestBuilder;
import com.microsoft.graph.datapolicyoperations.DataPolicyOperationsRequestBuilder;
import com.microsoft.graph.datapolicyoperations.item.DataPolicyOperationItemRequestBuilder;
import com.microsoft.graph.deviceappmanagement.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.devicemanagement.DeviceManagementRequestBuilder;
import com.microsoft.graph.devices.DevicesRequestBuilder;
import com.microsoft.graph.devices.item.DeviceItemRequestBuilder;
import com.microsoft.graph.directory.DirectoryRequestBuilder;
import com.microsoft.graph.directoryobjects.DirectoryObjectsRequestBuilder;
import com.microsoft.graph.directoryobjects.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.directoryroles.DirectoryRolesRequestBuilder;
import com.microsoft.graph.directoryroles.item.DirectoryRoleItemRequestBuilder;
import com.microsoft.graph.directoryroletemplates.DirectoryRoleTemplatesRequestBuilder;
import com.microsoft.graph.directoryroletemplates.item.DirectoryRoleTemplateItemRequestBuilder;
import com.microsoft.graph.directorysettingtemplates.DirectorySettingTemplatesRequestBuilder;
import com.microsoft.graph.directorysettingtemplates.item.DirectorySettingTemplateItemRequestBuilder;
import com.microsoft.graph.domaindnsrecords.DomainDnsRecordsRequestBuilder;
import com.microsoft.graph.domaindnsrecords.item.DomainDnsRecordItemRequestBuilder;
import com.microsoft.graph.domains.DomainsRequestBuilder;
import com.microsoft.graph.domains.item.DomainItemRequestBuilder;
import com.microsoft.graph.drives.DrivesRequestBuilder;
import com.microsoft.graph.drives.item.DriveItemRequestBuilder;
import com.microsoft.graph.education.EducationRequestBuilder;
import com.microsoft.graph.employeeexperience.EmployeeExperienceRequestBuilder;
import com.microsoft.graph.external.ExternalRequestBuilder;
import com.microsoft.graph.filteroperators.FilterOperatorsRequestBuilder;
import com.microsoft.graph.filteroperators.item.FilterOperatorSchemaItemRequestBuilder;
import com.microsoft.graph.financials.FinancialsRequestBuilder;
import com.microsoft.graph.functions.FunctionsRequestBuilder;
import com.microsoft.graph.functions.item.AttributeMappingFunctionSchemaItemRequestBuilder;
import com.microsoft.graph.governanceresources.GovernanceResourcesRequestBuilder;
import com.microsoft.graph.governanceresources.item.GovernanceResourceItemRequestBuilder;
import com.microsoft.graph.governanceroleassignmentrequests.GovernanceRoleAssignmentRequestsRequestBuilder;
import com.microsoft.graph.governanceroleassignmentrequests.item.GovernanceRoleAssignmentRequestItemRequestBuilder;
import com.microsoft.graph.governanceroleassignments.GovernanceRoleAssignmentsRequestBuilder;
import com.microsoft.graph.governanceroleassignments.item.GovernanceRoleAssignmentItemRequestBuilder;
import com.microsoft.graph.governanceroledefinitions.GovernanceRoleDefinitionsRequestBuilder;
import com.microsoft.graph.governanceroledefinitions.item.GovernanceRoleDefinitionItemRequestBuilder;
import com.microsoft.graph.governancerolesettings.GovernanceRoleSettingsRequestBuilder;
import com.microsoft.graph.governancerolesettings.item.GovernanceRoleSettingItemRequestBuilder;
import com.microsoft.graph.governancesubjects.GovernanceSubjectsRequestBuilder;
import com.microsoft.graph.governancesubjects.item.GovernanceSubjectItemRequestBuilder;
import com.microsoft.graph.grouplifecyclepolicies.GroupLifecyclePoliciesRequestBuilder;
import com.microsoft.graph.grouplifecyclepolicies.item.GroupLifecyclePolicyItemRequestBuilder;
import com.microsoft.graph.groups.GroupsRequestBuilder;
import com.microsoft.graph.groups.item.GroupItemRequestBuilder;
import com.microsoft.graph.identity.IdentityRequestBuilder;
import com.microsoft.graph.identitygovernance.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.identityprotection.IdentityProtectionRequestBuilder;
import com.microsoft.graph.identityproviders.IdentityProvidersRequestBuilder;
import com.microsoft.graph.identityproviders.item.IdentityProviderItemRequestBuilder;
import com.microsoft.graph.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.invitations.InvitationsRequestBuilder;
import com.microsoft.graph.invitations.item.InvitationItemRequestBuilder;
import com.microsoft.graph.me.MeRequestBuilder;
import com.microsoft.graph.messageevents.item.MessageEventItemRequestBuilder;
import com.microsoft.graph.messageevents.MessageEventsRequestBuilder;
import com.microsoft.graph.messagerecipients.item.MessageRecipientItemRequestBuilder;
import com.microsoft.graph.messagerecipients.MessageRecipientsRequestBuilder;
import com.microsoft.graph.messagetraces.item.MessageTraceItemRequestBuilder;
import com.microsoft.graph.messagetraces.MessageTracesRequestBuilder;
import com.microsoft.graph.mobilitymanagementpolicies.item.MobilityManagementPolicyItemRequestBuilder;
import com.microsoft.graph.mobilitymanagementpolicies.MobilityManagementPoliciesRequestBuilder;
import com.microsoft.graph.monitoring.MonitoringRequestBuilder;
import com.microsoft.graph.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import com.microsoft.graph.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.officeconfiguration.OfficeConfigurationRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.OnPremisesPublishingProfileItemRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.OnPremisesPublishingProfilesRequestBuilder;
import com.microsoft.graph.organization.item.OrganizationItemRequestBuilder;
import com.microsoft.graph.organization.OrganizationRequestBuilder;
import com.microsoft.graph.payloadresponse.item.PayloadResponseItemRequestBuilder;
import com.microsoft.graph.payloadresponse.PayloadResponseRequestBuilder;
import com.microsoft.graph.permissiongrants.item.ResourceSpecificPermissionGrantItemRequestBuilder;
import com.microsoft.graph.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.places.item.PlaceItemRequestBuilder;
import com.microsoft.graph.places.PlacesRequestBuilder;
import com.microsoft.graph.planner.PlannerRequestBuilder;
import com.microsoft.graph.policies.PoliciesRequestBuilder;
import com.microsoft.graph.print.PrintRequestBuilder;
import com.microsoft.graph.privacy.PrivacyRequestBuilder;
import com.microsoft.graph.privilegedaccess.item.PrivilegedAccessItemRequestBuilder;
import com.microsoft.graph.privilegedaccess.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.privilegedapproval.item.PrivilegedApprovalItemRequestBuilder;
import com.microsoft.graph.privilegedapproval.PrivilegedApprovalRequestBuilder;
import com.microsoft.graph.privilegedoperationevents.item.PrivilegedOperationEventItemRequestBuilder;
import com.microsoft.graph.privilegedoperationevents.PrivilegedOperationEventsRequestBuilder;
import com.microsoft.graph.privilegedroleassignmentrequests.item.PrivilegedRoleAssignmentRequestItemRequestBuilder;
import com.microsoft.graph.privilegedroleassignmentrequests.PrivilegedRoleAssignmentRequestsRequestBuilder;
import com.microsoft.graph.privilegedroleassignments.item.PrivilegedRoleAssignmentItemRequestBuilder;
import com.microsoft.graph.privilegedroleassignments.PrivilegedRoleAssignmentsRequestBuilder;
import com.microsoft.graph.privilegedroles.item.PrivilegedRoleItemRequestBuilder;
import com.microsoft.graph.privilegedroles.PrivilegedRolesRequestBuilder;
import com.microsoft.graph.privilegedsignupstatus.item.PrivilegedSignupStatusItemRequestBuilder;
import com.microsoft.graph.privilegedsignupstatus.PrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.programcontrols.item.ProgramControlItemRequestBuilder;
import com.microsoft.graph.programcontrols.ProgramControlsRequestBuilder;
import com.microsoft.graph.programcontroltypes.item.ProgramControlTypeItemRequestBuilder;
import com.microsoft.graph.programcontroltypes.ProgramControlTypesRequestBuilder;
import com.microsoft.graph.programs.item.ProgramItemRequestBuilder;
import com.microsoft.graph.programs.ProgramsRequestBuilder;
import com.microsoft.graph.reports.ReportsRequestBuilder;
import com.microsoft.graph.riskdetections.item.RiskDetectionItemRequestBuilder;
import com.microsoft.graph.riskdetections.RiskDetectionsRequestBuilder;
import com.microsoft.graph.riskyusers.item.RiskyUserItemRequestBuilder;
import com.microsoft.graph.riskyusers.RiskyUsersRequestBuilder;
import com.microsoft.graph.rolemanagement.RoleManagementRequestBuilder;
import com.microsoft.graph.schemaextensions.item.SchemaExtensionItemRequestBuilder;
import com.microsoft.graph.schemaextensions.SchemaExtensionsRequestBuilder;
import com.microsoft.graph.scopedrolememberships.item.ScopedRoleMembershipItemRequestBuilder;
import com.microsoft.graph.scopedrolememberships.ScopedRoleMembershipsRequestBuilder;
import com.microsoft.graph.search.SearchRequestBuilder;
import com.microsoft.graph.security.SecurityRequestBuilder;
import com.microsoft.graph.serviceprincipals.item.ServicePrincipalItemRequestBuilder;
import com.microsoft.graph.serviceprincipals.ServicePrincipalsRequestBuilder;
import com.microsoft.graph.settings.item.DirectorySettingItemRequestBuilder;
import com.microsoft.graph.settings.SettingsRequestBuilder;
import com.microsoft.graph.shares.item.SharedDriveItemItemRequestBuilder;
import com.microsoft.graph.shares.SharesRequestBuilder;
import com.microsoft.graph.sites.item.SiteItemRequestBuilder;
import com.microsoft.graph.sites.SitesRequestBuilder;
import com.microsoft.graph.solutions.SolutionsRequestBuilder;
import com.microsoft.graph.storage.StorageRequestBuilder;
import com.microsoft.graph.subscribedskus.item.SubscribedSkuItemRequestBuilder;
import com.microsoft.graph.subscribedskus.SubscribedSkusRequestBuilder;
import com.microsoft.graph.subscriptions.item.SubscriptionItemRequestBuilder;
import com.microsoft.graph.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.teams.item.TeamItemRequestBuilder;
import com.microsoft.graph.teams.TeamsRequestBuilder;
import com.microsoft.graph.teamstemplates.item.TeamsTemplateItemRequestBuilder;
import com.microsoft.graph.teamstemplates.TeamsTemplatesRequestBuilder;
import com.microsoft.graph.teamtemplatedefinition.item.TeamTemplateDefinitionItemRequestBuilder;
import com.microsoft.graph.teamtemplatedefinition.TeamTemplateDefinitionRequestBuilder;
import com.microsoft.graph.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.tenantrelationships.TenantRelationshipsRequestBuilder;
import com.microsoft.graph.termstore.TermStoreRequestBuilder;
import com.microsoft.graph.threatsubmission.ThreatSubmissionRequestBuilder;
import com.microsoft.graph.trustframework.TrustFrameworkRequestBuilder;
import com.microsoft.graph.users.item.UserItemRequestBuilder;
import com.microsoft.graph.users.UsersRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
public class BaseGraphServiceClient {
    /** Provides operations to manage the collection of accessReviewDecision entities. */
    @javax.annotation.Nonnull
    public AccessReviewDecisionsRequestBuilder accessReviewDecisions() {
        return new AccessReviewDecisionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of accessReview entities. */
    @javax.annotation.Nonnull
    public AccessReviewsRequestBuilder accessReviews() {
        return new AccessReviewsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of activityStatistics entities. */
    @javax.annotation.Nonnull
    public ActivitystatisticsRequestBuilder activitystatistics() {
        return new ActivitystatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the admin singleton. */
    @javax.annotation.Nonnull
    public AdminRequestBuilder admin() {
        return new AdminRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of administrativeUnit entities. */
    @javax.annotation.Nonnull
    public AdministrativeUnitsRequestBuilder administrativeUnits() {
        return new AdministrativeUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of agreementAcceptance entities. */
    @javax.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of agreement entities. */
    @javax.annotation.Nonnull
    public AgreementsRequestBuilder agreements() {
        return new AgreementsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of allowedDataLocation entities. */
    @javax.annotation.Nonnull
    public AllowedDataLocationsRequestBuilder allowedDataLocations() {
        return new AllowedDataLocationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the commsApplication singleton. */
    @javax.annotation.Nonnull
    public AppRequestBuilder app() {
        return new AppRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the appCatalogs singleton. */
    @javax.annotation.Nonnull
    public AppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of application entities. */
    @javax.annotation.Nonnull
    public ApplicationsRequestBuilder applications() {
        return new ApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of applicationTemplate entities. */
    @javax.annotation.Nonnull
    public ApplicationTemplatesRequestBuilder applicationTemplates() {
        return new ApplicationTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of appRoleAssignment entities. */
    @javax.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of approvalWorkflowProvider entities. */
    @javax.annotation.Nonnull
    public ApprovalWorkflowProvidersRequestBuilder approvalWorkflowProviders() {
        return new ApprovalWorkflowProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the auditLogRoot singleton. */
    @javax.annotation.Nonnull
    public AuditLogsRequestBuilder auditLogs() {
        return new AuditLogsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of authenticationMethodConfiguration entities. */
    @javax.annotation.Nonnull
    public AuthenticationMethodConfigurationsRequestBuilder authenticationMethodConfigurations() {
        return new AuthenticationMethodConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the authenticationMethodsPolicy singleton. */
    @javax.annotation.Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of bookingBusiness entities. */
    @javax.annotation.Nonnull
    public BookingBusinessesRequestBuilder bookingBusinesses() {
        return new BookingBusinessesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of bookingCurrency entities. */
    @javax.annotation.Nonnull
    public BookingCurrenciesRequestBuilder bookingCurrencies() {
        return new BookingCurrenciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the organizationalBranding singleton. */
    @javax.annotation.Nonnull
    public BrandingRequestBuilder branding() {
        return new BrandingRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of businessFlowTemplate entities. */
    @javax.annotation.Nonnull
    public BusinessFlowTemplatesRequestBuilder businessFlowTemplates() {
        return new BusinessFlowTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of certificateBasedAuthConfiguration entities. */
    @javax.annotation.Nonnull
    public CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of chat entities. */
    @javax.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of command entities. */
    @javax.annotation.Nonnull
    public CommandsRequestBuilder commands() {
        return new CommandsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the cloudCommunications singleton. */
    @javax.annotation.Nonnull
    public CommunicationsRequestBuilder communications() {
        return new CommunicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the compliance singleton. */
    @javax.annotation.Nonnull
    public ComplianceRequestBuilder compliance() {
        return new ComplianceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of externalConnection entities. */
    @javax.annotation.Nonnull
    public ConnectionsRequestBuilder connections() {
        return new ConnectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of orgContact entities. */
    @javax.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of contract entities. */
    @javax.annotation.Nonnull
    public ContractsRequestBuilder contracts() {
        return new ContractsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the dataClassificationService singleton. */
    @javax.annotation.Nonnull
    public DataClassificationRequestBuilder dataClassification() {
        return new DataClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of dataPolicyOperation entities. */
    @javax.annotation.Nonnull
    public DataPolicyOperationsRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceAppManagement singleton. */
    @javax.annotation.Nonnull
    public DeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceManagement singleton. */
    @javax.annotation.Nonnull
    public DeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of device entities. */
    @javax.annotation.Nonnull
    public DevicesRequestBuilder devices() {
        return new DevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the directory singleton. */
    @javax.annotation.Nonnull
    public DirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of directoryObject entities. */
    @javax.annotation.Nonnull
    public DirectoryObjectsRequestBuilder directoryObjects() {
        return new DirectoryObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of directoryRole entities. */
    @javax.annotation.Nonnull
    public DirectoryRolesRequestBuilder directoryRoles() {
        return new DirectoryRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of directoryRoleTemplate entities. */
    @javax.annotation.Nonnull
    public DirectoryRoleTemplatesRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of directorySettingTemplate entities. */
    @javax.annotation.Nonnull
    public DirectorySettingTemplatesRequestBuilder directorySettingTemplates() {
        return new DirectorySettingTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of domainDnsRecord entities. */
    @javax.annotation.Nonnull
    public DomainDnsRecordsRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of domain entities. */
    @javax.annotation.Nonnull
    public DomainsRequestBuilder domains() {
        return new DomainsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of drive entities. */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the educationRoot singleton. */
    @javax.annotation.Nonnull
    public EducationRequestBuilder education() {
        return new EducationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the employeeExperience singleton. */
    @javax.annotation.Nonnull
    public EmployeeExperienceRequestBuilder employeeExperience() {
        return new EmployeeExperienceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the external singleton. */
    @javax.annotation.Nonnull
    public ExternalRequestBuilder external() {
        return new ExternalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of filterOperatorSchema entities. */
    @javax.annotation.Nonnull
    public FilterOperatorsRequestBuilder filterOperators() {
        return new FilterOperatorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the financials singleton. */
    @javax.annotation.Nonnull
    public FinancialsRequestBuilder financials() {
        return new FinancialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of attributeMappingFunctionSchema entities. */
    @javax.annotation.Nonnull
    public FunctionsRequestBuilder functions() {
        return new FunctionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of governanceResource entities. */
    @javax.annotation.Nonnull
    public GovernanceResourcesRequestBuilder governanceResources() {
        return new GovernanceResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of governanceRoleAssignmentRequest entities. */
    @javax.annotation.Nonnull
    public GovernanceRoleAssignmentRequestsRequestBuilder governanceRoleAssignmentRequests() {
        return new GovernanceRoleAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of governanceRoleAssignment entities. */
    @javax.annotation.Nonnull
    public GovernanceRoleAssignmentsRequestBuilder governanceRoleAssignments() {
        return new GovernanceRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of governanceRoleDefinition entities. */
    @javax.annotation.Nonnull
    public GovernanceRoleDefinitionsRequestBuilder governanceRoleDefinitions() {
        return new GovernanceRoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of governanceRoleSetting entities. */
    @javax.annotation.Nonnull
    public GovernanceRoleSettingsRequestBuilder governanceRoleSettings() {
        return new GovernanceRoleSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of governanceSubject entities. */
    @javax.annotation.Nonnull
    public GovernanceSubjectsRequestBuilder governanceSubjects() {
        return new GovernanceSubjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of groupLifecyclePolicy entities. */
    @javax.annotation.Nonnull
    public GroupLifecyclePoliciesRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of group entities. */
    @javax.annotation.Nonnull
    public GroupsRequestBuilder groups() {
        return new GroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the identityContainer singleton. */
    @javax.annotation.Nonnull
    public IdentityRequestBuilder identity() {
        return new IdentityRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the identityGovernance singleton. */
    @javax.annotation.Nonnull
    public IdentityGovernanceRequestBuilder identityGovernance() {
        return new IdentityGovernanceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the identityProtectionRoot singleton. */
    @javax.annotation.Nonnull
    public IdentityProtectionRequestBuilder identityProtection() {
        return new IdentityProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of identityProvider entities. */
    @javax.annotation.Nonnull
    public IdentityProvidersRequestBuilder identityProviders() {
        return new IdentityProvidersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the informationProtection singleton. */
    @javax.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of invitation entities. */
    @javax.annotation.Nonnull
    public InvitationsRequestBuilder invitations() {
        return new InvitationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the user singleton. */
    @javax.annotation.Nonnull
    public MeRequestBuilder me() {
        return new MeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of messageEvent entities. */
    @javax.annotation.Nonnull
    public MessageEventsRequestBuilder messageEvents() {
        return new MessageEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of messageRecipient entities. */
    @javax.annotation.Nonnull
    public MessageRecipientsRequestBuilder messageRecipients() {
        return new MessageRecipientsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of messageTrace entities. */
    @javax.annotation.Nonnull
    public MessageTracesRequestBuilder messageTraces() {
        return new MessageTracesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of mobilityManagementPolicy entities. */
    @javax.annotation.Nonnull
    public MobilityManagementPoliciesRequestBuilder mobilityManagementPolicies() {
        return new MobilityManagementPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the monitoring singleton. */
    @javax.annotation.Nonnull
    public MonitoringRequestBuilder monitoring() {
        return new MonitoringRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of oAuth2PermissionGrant entities. */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the officeConfiguration singleton. */
    @javax.annotation.Nonnull
    public OfficeConfigurationRequestBuilder officeConfiguration() {
        return new OfficeConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of onPremisesPublishingProfile entities. */
    @javax.annotation.Nonnull
    public OnPremisesPublishingProfilesRequestBuilder onPremisesPublishingProfiles() {
        return new OnPremisesPublishingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of organization entities. */
    @javax.annotation.Nonnull
    public OrganizationRequestBuilder organization() {
        return new OrganizationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the collection of payloadResponse entities. */
    @javax.annotation.Nonnull
    public PayloadResponseRequestBuilder payloadResponse() {
        return new PayloadResponseRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of resourceSpecificPermissionGrant entities. */
    @javax.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The places property */
    @javax.annotation.Nonnull
    public PlacesRequestBuilder places() {
        return new PlacesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the planner singleton. */
    @javax.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the policyRoot singleton. */
    @javax.annotation.Nonnull
    public PoliciesRequestBuilder policies() {
        return new PoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the print singleton. */
    @javax.annotation.Nonnull
    public PrintRequestBuilder print() {
        return new PrintRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the privacy singleton. */
    @javax.annotation.Nonnull
    public PrivacyRequestBuilder privacy() {
        return new PrivacyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of privilegedAccess entities. */
    @javax.annotation.Nonnull
    public PrivilegedAccessRequestBuilder privilegedAccess() {
        return new PrivilegedAccessRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of privilegedApproval entities. */
    @javax.annotation.Nonnull
    public PrivilegedApprovalRequestBuilder privilegedApproval() {
        return new PrivilegedApprovalRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of privilegedOperationEvent entities. */
    @javax.annotation.Nonnull
    public PrivilegedOperationEventsRequestBuilder privilegedOperationEvents() {
        return new PrivilegedOperationEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of privilegedRoleAssignmentRequest entities. */
    @javax.annotation.Nonnull
    public PrivilegedRoleAssignmentRequestsRequestBuilder privilegedRoleAssignmentRequests() {
        return new PrivilegedRoleAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of privilegedRoleAssignment entities. */
    @javax.annotation.Nonnull
    public PrivilegedRoleAssignmentsRequestBuilder privilegedRoleAssignments() {
        return new PrivilegedRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of privilegedRole entities. */
    @javax.annotation.Nonnull
    public PrivilegedRolesRequestBuilder privilegedRoles() {
        return new PrivilegedRolesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of privilegedSignupStatus entities. */
    @javax.annotation.Nonnull
    public PrivilegedSignupStatusRequestBuilder privilegedSignupStatus() {
        return new PrivilegedSignupStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of programControl entities. */
    @javax.annotation.Nonnull
    public ProgramControlsRequestBuilder programControls() {
        return new ProgramControlsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of programControlType entities. */
    @javax.annotation.Nonnull
    public ProgramControlTypesRequestBuilder programControlTypes() {
        return new ProgramControlTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of program entities. */
    @javax.annotation.Nonnull
    public ProgramsRequestBuilder programs() {
        return new ProgramsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the reportRoot singleton. */
    @javax.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the collection of riskDetection entities. */
    @javax.annotation.Nonnull
    public RiskDetectionsRequestBuilder riskDetections() {
        return new RiskDetectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of riskyUser entities. */
    @javax.annotation.Nonnull
    public RiskyUsersRequestBuilder riskyUsers() {
        return new RiskyUsersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleManagement singleton. */
    @javax.annotation.Nonnull
    public RoleManagementRequestBuilder roleManagement() {
        return new RoleManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of schemaExtension entities. */
    @javax.annotation.Nonnull
    public SchemaExtensionsRequestBuilder schemaExtensions() {
        return new SchemaExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of scopedRoleMembership entities. */
    @javax.annotation.Nonnull
    public ScopedRoleMembershipsRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the searchEntity singleton. */
    @javax.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the security singleton. */
    @javax.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of servicePrincipal entities. */
    @javax.annotation.Nonnull
    public ServicePrincipalsRequestBuilder servicePrincipals() {
        return new ServicePrincipalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of directorySetting entities. */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of sharedDriveItem entities. */
    @javax.annotation.Nonnull
    public SharesRequestBuilder shares() {
        return new SharesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of site entities. */
    @javax.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the solutionsRoot singleton. */
    @javax.annotation.Nonnull
    public SolutionsRequestBuilder solutions() {
        return new SolutionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the storage singleton. */
    @javax.annotation.Nonnull
    public StorageRequestBuilder storage() {
        return new StorageRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of subscribedSku entities. */
    @javax.annotation.Nonnull
    public SubscribedSkusRequestBuilder subscribedSkus() {
        return new SubscribedSkusRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of subscription entities. */
    @javax.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of team entities. */
    @javax.annotation.Nonnull
    public TeamsRequestBuilder teams() {
        return new TeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of teamsTemplate entities. */
    @javax.annotation.Nonnull
    public TeamsTemplatesRequestBuilder teamsTemplates() {
        return new TeamsTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the collection of teamTemplateDefinition entities. */
    @javax.annotation.Nonnull
    public TeamTemplateDefinitionRequestBuilder teamTemplateDefinition() {
        return new TeamTemplateDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the teamwork singleton. */
    @javax.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tenantRelationship singleton. */
    @javax.annotation.Nonnull
    public TenantRelationshipsRequestBuilder tenantRelationships() {
        return new TenantRelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the store singleton. */
    @javax.annotation.Nonnull
    public TermStoreRequestBuilder termStore() {
        return new TermStoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the threatSubmissionRoot singleton. */
    @javax.annotation.Nonnull
    public ThreatSubmissionRequestBuilder threatSubmission() {
        return new ThreatSubmissionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the trustFramework singleton. */
    @javax.annotation.Nonnull
    public TrustFrameworkRequestBuilder trustFramework() {
        return new TrustFrameworkRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to manage the collection of user entities. */
    @javax.annotation.Nonnull
    public UsersRequestBuilder users() {
        return new UsersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of accessReviewDecision entities.
     * @param id Unique identifier of the item
     * @return a AccessReviewDecisionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessReviewDecisionItemRequestBuilder accessReviewDecisions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessReviewDecision%2Did", id);
        return new AccessReviewDecisionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of accessReview entities.
     * @param id Unique identifier of the item
     * @return a AccessReviewItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessReviewItemRequestBuilder accessReviews(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessReview%2Did", id);
        return new AccessReviewItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of activityStatistics entities.
     * @param id Unique identifier of the item
     * @return a ActivityStatisticsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ActivityStatisticsItemRequestBuilder activitystatistics(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("activityStatistics%2Did", id);
        return new ActivityStatisticsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of administrativeUnit entities.
     * @param id Unique identifier of the item
     * @return a AdministrativeUnitItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AdministrativeUnitItemRequestBuilder administrativeUnits(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("administrativeUnit%2Did", id);
        return new AdministrativeUnitItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of agreementAcceptance entities.
     * @param id Unique identifier of the item
     * @return a AgreementAcceptanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgreementAcceptanceItemRequestBuilder agreementAcceptances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agreementAcceptance%2Did", id);
        return new AgreementAcceptanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of agreement entities.
     * @param id Unique identifier of the item
     * @return a AgreementItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgreementItemRequestBuilder agreements(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agreement%2Did", id);
        return new AgreementItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of allowedDataLocation entities.
     * @param id Unique identifier of the item
     * @return a AllowedDataLocationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AllowedDataLocationItemRequestBuilder allowedDataLocations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("allowedDataLocation%2Did", id);
        return new AllowedDataLocationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of application entities.
     * @param id Unique identifier of the item
     * @return a ApplicationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApplicationItemRequestBuilder applications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("application%2Did", id);
        return new ApplicationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of applicationTemplate entities.
     * @param id Unique identifier of the item
     * @return a ApplicationTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApplicationTemplateItemRequestBuilder applicationTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("applicationTemplate%2Did", id);
        return new ApplicationTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of appRoleAssignment entities.
     * @param id Unique identifier of the item
     * @return a AppRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AppRoleAssignmentItemRequestBuilder appRoleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appRoleAssignment%2Did", id);
        return new AppRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of approvalWorkflowProvider entities.
     * @param id Unique identifier of the item
     * @return a ApprovalWorkflowProviderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApprovalWorkflowProviderItemRequestBuilder approvalWorkflowProviders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("approvalWorkflowProvider%2Did", id);
        return new ApprovalWorkflowProviderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of authenticationMethodConfiguration entities.
     * @param id Unique identifier of the item
     * @return a AuthenticationMethodConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AuthenticationMethodConfigurationItemRequestBuilder authenticationMethodConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("authenticationMethodConfiguration%2Did", id);
        return new AuthenticationMethodConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of bookingBusiness entities.
     * @param id Unique identifier of the item
     * @return a BookingBusinessItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BookingBusinessItemRequestBuilder bookingBusinesses(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingBusiness%2Did", id);
        return new BookingBusinessItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of bookingCurrency entities.
     * @param id Unique identifier of the item
     * @return a BookingCurrencyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BookingCurrencyItemRequestBuilder bookingCurrencies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bookingCurrency%2Did", id);
        return new BookingCurrencyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of businessFlowTemplate entities.
     * @param id Unique identifier of the item
     * @return a BusinessFlowTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public BusinessFlowTemplateItemRequestBuilder businessFlowTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("businessFlowTemplate%2Did", id);
        return new BusinessFlowTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of certificateBasedAuthConfiguration entities.
     * @param id Unique identifier of the item
     * @return a CertificateBasedAuthConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CertificateBasedAuthConfigurationItemRequestBuilder certificateBasedAuthConfiguration(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("certificateBasedAuthConfiguration%2Did", id);
        return new CertificateBasedAuthConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of chat entities.
     * @param id Unique identifier of the item
     * @return a ChatItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ChatItemRequestBuilder chats(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("chat%2Did", id);
        return new ChatItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of command entities.
     * @param id Unique identifier of the item
     * @return a CommandItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CommandItemRequestBuilder commands(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("command%2Did", id);
        return new CommandItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of externalConnection entities.
     * @param id Unique identifier of the item
     * @return a ExternalConnectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExternalConnectionItemRequestBuilder connections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("externalConnection%2Did", id);
        return new ExternalConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new BaseGraphServiceClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public BaseGraphServiceClient(@javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(requestAdapter);
        this.pathParameters = new HashMap<>();
        this.urlTemplate = "{+baseurl}";
        this.requestAdapter = requestAdapter;
        ApiClientBuilder.registerDefaultSerializer(JsonSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(TextSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultSerializer(FormSerializationWriterFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(JsonParseNodeFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(FormParseNodeFactory.class);
        ApiClientBuilder.registerDefaultDeserializer(TextParseNodeFactory.class);
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://graph.microsoft.com/beta");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
    /**
     * Provides operations to manage the collection of orgContact entities.
     * @param id Unique identifier of the item
     * @return a OrgContactItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OrgContactItemRequestBuilder contacts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("orgContact%2Did", id);
        return new OrgContactItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of contract entities.
     * @param id Unique identifier of the item
     * @return a ContractItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContractItemRequestBuilder contracts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contract%2Did", id);
        return new ContractItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of dataPolicyOperation entities.
     * @param id Unique identifier of the item
     * @return a DataPolicyOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DataPolicyOperationItemRequestBuilder dataPolicyOperations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dataPolicyOperation%2Did", id);
        return new DataPolicyOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of device entities.
     * @param id Unique identifier of the item
     * @return a DeviceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceItemRequestBuilder devices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("device%2Did", id);
        return new DeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryObject entities.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder directoryObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     * @param id Unique identifier of the item
     * @return a DirectoryRoleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryRoleItemRequestBuilder directoryRoles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryRole%2Did", id);
        return new DirectoryRoleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRoleTemplate entities.
     * @param id Unique identifier of the item
     * @return a DirectoryRoleTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryRoleTemplateItemRequestBuilder directoryRoleTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryRoleTemplate%2Did", id);
        return new DirectoryRoleTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directorySettingTemplate entities.
     * @param id Unique identifier of the item
     * @return a DirectorySettingTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectorySettingTemplateItemRequestBuilder directorySettingTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directorySettingTemplate%2Did", id);
        return new DirectorySettingTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of domainDnsRecord entities.
     * @param id Unique identifier of the item
     * @return a DomainDnsRecordItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DomainDnsRecordItemRequestBuilder domainDnsRecords(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domainDnsRecord%2Did", id);
        return new DomainDnsRecordItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of domain entities.
     * @param id Unique identifier of the item
     * @return a DomainItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DomainItemRequestBuilder domains(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domain%2Did", id);
        return new DomainItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of drive entities.
     * @param id Unique identifier of the item
     * @return a DriveItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemRequestBuilder drives(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("drive%2Did", id);
        return new DriveItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of filterOperatorSchema entities.
     * @param id Unique identifier of the item
     * @return a FilterOperatorSchemaItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FilterOperatorSchemaItemRequestBuilder filterOperators(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("filterOperatorSchema%2Did", id);
        return new FilterOperatorSchemaItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of attributeMappingFunctionSchema entities.
     * @param id Unique identifier of the item
     * @return a AttributeMappingFunctionSchemaItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AttributeMappingFunctionSchemaItemRequestBuilder functions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("attributeMappingFunctionSchema%2Did", id);
        return new AttributeMappingFunctionSchemaItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceResource entities.
     * @param id Unique identifier of the item
     * @return a GovernanceResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceResourceItemRequestBuilder governanceResources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceResource%2Did", id);
        return new GovernanceResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleAssignmentRequest entities.
     * @param id Unique identifier of the item
     * @return a GovernanceRoleAssignmentRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceRoleAssignmentRequestItemRequestBuilder governanceRoleAssignmentRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceRoleAssignmentRequest%2Did", id);
        return new GovernanceRoleAssignmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleAssignment entities.
     * @param id Unique identifier of the item
     * @return a GovernanceRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceRoleAssignmentItemRequestBuilder governanceRoleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceRoleAssignment%2Did", id);
        return new GovernanceRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleDefinition entities.
     * @param id Unique identifier of the item
     * @return a GovernanceRoleDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceRoleDefinitionItemRequestBuilder governanceRoleDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceRoleDefinition%2Did", id);
        return new GovernanceRoleDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceRoleSetting entities.
     * @param id Unique identifier of the item
     * @return a GovernanceRoleSettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceRoleSettingItemRequestBuilder governanceRoleSettings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceRoleSetting%2Did", id);
        return new GovernanceRoleSettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of governanceSubject entities.
     * @param id Unique identifier of the item
     * @return a GovernanceSubjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GovernanceSubjectItemRequestBuilder governanceSubjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("governanceSubject%2Did", id);
        return new GovernanceSubjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of groupLifecyclePolicy entities.
     * @param id Unique identifier of the item
     * @return a GroupLifecyclePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupLifecyclePolicyItemRequestBuilder groupLifecyclePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("groupLifecyclePolicy%2Did", id);
        return new GroupLifecyclePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of group entities.
     * @param id Unique identifier of the item
     * @return a GroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public GroupItemRequestBuilder groups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("group%2Did", id);
        return new GroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of identityProvider entities.
     * @param id Unique identifier of the item
     * @return a IdentityProviderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IdentityProviderItemRequestBuilder identityProviders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identityProvider%2Did", id);
        return new IdentityProviderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of invitation entities.
     * @param id Unique identifier of the item
     * @return a InvitationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public InvitationItemRequestBuilder invitations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("invitation%2Did", id);
        return new InvitationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageEvent entities.
     * @param id Unique identifier of the item
     * @return a MessageEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MessageEventItemRequestBuilder messageEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("messageEvent%2Did", id);
        return new MessageEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageRecipient entities.
     * @param id Unique identifier of the item
     * @return a MessageRecipientItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MessageRecipientItemRequestBuilder messageRecipients(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("messageRecipient%2Did", id);
        return new MessageRecipientItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of messageTrace entities.
     * @param id Unique identifier of the item
     * @return a MessageTraceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MessageTraceItemRequestBuilder messageTraces(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("messageTrace%2Did", id);
        return new MessageTraceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of mobilityManagementPolicy entities.
     * @param id Unique identifier of the item
     * @return a MobilityManagementPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobilityManagementPolicyItemRequestBuilder mobilityManagementPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobilityManagementPolicy%2Did", id);
        return new MobilityManagementPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of oAuth2PermissionGrant entities.
     * @param id Unique identifier of the item
     * @return a OAuth2PermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder oauth2PermissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", id);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of onPremisesPublishingProfile entities.
     * @param id Unique identifier of the item
     * @return a OnPremisesPublishingProfileItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OnPremisesPublishingProfileItemRequestBuilder onPremisesPublishingProfiles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("onPremisesPublishingProfile%2Did", id);
        return new OnPremisesPublishingProfileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of organization entities.
     * @param id Unique identifier of the item
     * @return a OrganizationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OrganizationItemRequestBuilder organization(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("organization%2Did", id);
        return new OrganizationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of payloadResponse entities.
     * @param id Unique identifier of the item
     * @return a PayloadResponseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PayloadResponseItemRequestBuilder payloadResponse(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("payloadResponse%2Did", id);
        return new PayloadResponseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of resourceSpecificPermissionGrant entities.
     * @param id Unique identifier of the item
     * @return a ResourceSpecificPermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ResourceSpecificPermissionGrantItemRequestBuilder permissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("resourceSpecificPermissionGrant%2Did", id);
        return new ResourceSpecificPermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of place entities.
     * @param id Unique identifier of the item
     * @return a PlaceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PlaceItemRequestBuilder places(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("place%2Did", id);
        return new PlaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedAccess entities.
     * @param id Unique identifier of the item
     * @return a PrivilegedAccessItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedAccessItemRequestBuilder privilegedAccess(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedAccess%2Did", id);
        return new PrivilegedAccessItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedApproval entities.
     * @param id Unique identifier of the item
     * @return a PrivilegedApprovalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedApprovalItemRequestBuilder privilegedApproval(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedApproval%2Did", id);
        return new PrivilegedApprovalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedOperationEvent entities.
     * @param id Unique identifier of the item
     * @return a PrivilegedOperationEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedOperationEventItemRequestBuilder privilegedOperationEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedOperationEvent%2Did", id);
        return new PrivilegedOperationEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRoleAssignmentRequest entities.
     * @param id Unique identifier of the item
     * @return a PrivilegedRoleAssignmentRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedRoleAssignmentRequestItemRequestBuilder privilegedRoleAssignmentRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedRoleAssignmentRequest%2Did", id);
        return new PrivilegedRoleAssignmentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRoleAssignment entities.
     * @param id Unique identifier of the item
     * @return a PrivilegedRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedRoleAssignmentItemRequestBuilder privilegedRoleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedRoleAssignment%2Did", id);
        return new PrivilegedRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedRole entities.
     * @param id Unique identifier of the item
     * @return a PrivilegedRoleItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedRoleItemRequestBuilder privilegedRoles(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedRole%2Did", id);
        return new PrivilegedRoleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedSignupStatus entities.
     * @param id Unique identifier of the item
     * @return a PrivilegedSignupStatusItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PrivilegedSignupStatusItemRequestBuilder privilegedSignupStatus(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedSignupStatus%2Did", id);
        return new PrivilegedSignupStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of programControl entities.
     * @param id Unique identifier of the item
     * @return a ProgramControlItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProgramControlItemRequestBuilder programControls(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("programControl%2Did", id);
        return new ProgramControlItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of programControlType entities.
     * @param id Unique identifier of the item
     * @return a ProgramControlTypeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProgramControlTypeItemRequestBuilder programControlTypes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("programControlType%2Did", id);
        return new ProgramControlTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of program entities.
     * @param id Unique identifier of the item
     * @return a ProgramItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProgramItemRequestBuilder programs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("program%2Did", id);
        return new ProgramItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of riskDetection entities.
     * @param id Unique identifier of the item
     * @return a RiskDetectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RiskDetectionItemRequestBuilder riskDetections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("riskDetection%2Did", id);
        return new RiskDetectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of riskyUser entities.
     * @param id Unique identifier of the item
     * @return a RiskyUserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RiskyUserItemRequestBuilder riskyUsers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("riskyUser%2Did", id);
        return new RiskyUserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of schemaExtension entities.
     * @param id Unique identifier of the item
     * @return a SchemaExtensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SchemaExtensionItemRequestBuilder schemaExtensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schemaExtension%2Did", id);
        return new SchemaExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of scopedRoleMembership entities.
     * @param id Unique identifier of the item
     * @return a ScopedRoleMembershipItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ScopedRoleMembershipItemRequestBuilder scopedRoleMemberships(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("scopedRoleMembership%2Did", id);
        return new ScopedRoleMembershipItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of servicePrincipal entities.
     * @param id Unique identifier of the item
     * @return a ServicePrincipalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ServicePrincipalItemRequestBuilder servicePrincipals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("servicePrincipal%2Did", id);
        return new ServicePrincipalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directorySetting entities.
     * @param id Unique identifier of the item
     * @return a DirectorySettingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectorySettingItemRequestBuilder settings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directorySetting%2Did", id);
        return new DirectorySettingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of sharedDriveItem entities.
     * @param id Unique identifier of the item
     * @return a SharedDriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SharedDriveItemItemRequestBuilder shares(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sharedDriveItem%2Did", id);
        return new SharedDriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of site entities.
     * @param id Unique identifier of the item
     * @return a SiteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SiteItemRequestBuilder sites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did", id);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of subscribedSku entities.
     * @param id Unique identifier of the item
     * @return a SubscribedSkuItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscribedSkuItemRequestBuilder subscribedSkus(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscribedSku%2Did", id);
        return new SubscribedSkuItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of subscription entities.
     * @param id Unique identifier of the item
     * @return a SubscriptionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscriptionItemRequestBuilder subscriptions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscription%2Did", id);
        return new SubscriptionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of team entities.
     * @param id Unique identifier of the item
     * @return a TeamItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamItemRequestBuilder teams(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("team%2Did", id);
        return new TeamItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of teamsTemplate entities.
     * @param id Unique identifier of the item
     * @return a TeamsTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamsTemplateItemRequestBuilder teamsTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamsTemplate%2Did", id);
        return new TeamsTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of teamTemplateDefinition entities.
     * @param id Unique identifier of the item
     * @return a TeamTemplateDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamTemplateDefinitionItemRequestBuilder teamTemplateDefinition(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("teamTemplateDefinition%2Did", id);
        return new TeamTemplateDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of user entities.
     * @param id Unique identifier of the item
     * @return a UserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserItemRequestBuilder users(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user%2Did", id);
        return new UserItemRequestBuilder(urlTplParams, requestAdapter);
    }
}
