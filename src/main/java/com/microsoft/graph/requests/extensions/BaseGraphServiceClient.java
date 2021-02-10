// Template Source: BaseClient.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.requests.extensions.IInvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityStatisticsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityStatisticsRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityStatisticsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityStatisticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingBusinessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingBusinessRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingBusinessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingBusinessRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingCurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingCurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.AllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AllowedDataLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesPublishingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesPublishingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesPublishingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesPublishingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.FilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.FilterOperatorSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalWorkflowProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalWorkflowProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalWorkflowProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalWorkflowProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskyUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedOperationEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandRequestBuilder;
import com.microsoft.graph.requests.extensions.CommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CommandRequestBuilder;
import com.microsoft.graph.requests.extensions.IPayloadResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPayloadResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.PayloadResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PayloadResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalConnectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalConnectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IBitlockerRequestBuilder;
import com.microsoft.graph.requests.extensions.BitlockerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrustFrameworkRequestBuilder;
import com.microsoft.graph.requests.extensions.TrustFrameworkRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataClassificationServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.DataClassificationServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRootRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IStoreRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.StoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProtectionRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProtectionRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityGovernanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfficeConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.OfficeConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISearchEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.SearchEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.IFinancialsRequestBuilder;
import com.microsoft.graph.requests.extensions.FinancialsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.AppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamworkRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IBaseGraphServiceClient;
import com.microsoft.graph.core.BaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Graph Service Client.
 */
public class BaseGraphServiceClient extends BaseClient implements IBaseGraphServiceClient {

    /**
     * The default endpoint for the Microsoft Graph Service
     */
    public static final String DEFAULT_GRAPH_ENDPOINT = "https://graph.microsoft.com/beta";

    /**
     * The current endpoint
     */
    private String endpoint;

    @Override
    public String getServiceRoot() {
        if (endpoint == null) {
            endpoint = DEFAULT_GRAPH_ENDPOINT;
        }
        return endpoint;
    }

    @Override
    public void setServiceRoot(String value) {
        endpoint = value;
    }

    /**
     * Gets the collection of Invitations objects
     *
     * @return the request builder for the collection of Invitations objects
     */
    public IInvitationCollectionRequestBuilder invitations() {
        return new InvitationCollectionRequestBuilder(getServiceRoot() + "/invitations", this, null);
    }

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    public IInvitationRequestBuilder invitations(final String id) {
        return new InvitationRequestBuilder(getServiceRoot() + "/invitations/" + id, this, null);
    }

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    public IUserCollectionRequestBuilder users() {
        return new UserCollectionRequestBuilder(getServiceRoot() + "/users", this, null);
    }

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    public IUserRequestBuilder users(final String id) {
        return new UserRequestBuilder(getServiceRoot() + "/users/" + id, this, null);
    }

    /**
     * Gets the collection of Activitystatistics objects
     *
     * @return the request builder for the collection of Activitystatistics objects
     */
    public IActivityStatisticsCollectionRequestBuilder activitystatistics() {
        return new ActivityStatisticsCollectionRequestBuilder(getServiceRoot() + "/activitystatistics", this, null);
    }

    /**
     * Gets a single Activitystatistics
     *
     * @param id the id of the Activitystatistics to retrieve
     * @return the request builder for the Activitystatistics object
     */
    public IActivityStatisticsRequestBuilder activitystatistics(final String id) {
        return new ActivityStatisticsRequestBuilder(getServiceRoot() + "/activitystatistics/" + id, this, null);
    }

    /**
     * Gets the collection of ApplicationTemplates objects
     *
     * @return the request builder for the collection of ApplicationTemplates objects
     */
    public IApplicationTemplateCollectionRequestBuilder applicationTemplates() {
        return new ApplicationTemplateCollectionRequestBuilder(getServiceRoot() + "/applicationTemplates", this, null);
    }

    /**
     * Gets a single ApplicationTemplates
     *
     * @param id the id of the ApplicationTemplates to retrieve
     * @return the request builder for the ApplicationTemplates object
     */
    public IApplicationTemplateRequestBuilder applicationTemplates(final String id) {
        return new ApplicationTemplateRequestBuilder(getServiceRoot() + "/applicationTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of ServicePrincipals objects
     *
     * @return the request builder for the collection of ServicePrincipals objects
     */
    public IServicePrincipalCollectionRequestBuilder servicePrincipals() {
        return new ServicePrincipalCollectionRequestBuilder(getServiceRoot() + "/servicePrincipals", this, null);
    }

    /**
     * Gets a single ServicePrincipals
     *
     * @param id the id of the ServicePrincipals to retrieve
     * @return the request builder for the ServicePrincipals object
     */
    public IServicePrincipalRequestBuilder servicePrincipals(final String id) {
        return new ServicePrincipalRequestBuilder(getServiceRoot() + "/servicePrincipals/" + id, this, null);
    }

    /**
     * Gets the collection of BookingBusinesses objects
     *
     * @return the request builder for the collection of BookingBusinesses objects
     */
    public IBookingBusinessCollectionRequestBuilder bookingBusinesses() {
        return new BookingBusinessCollectionRequestBuilder(getServiceRoot() + "/bookingBusinesses", this, null);
    }

    /**
     * Gets a single BookingBusinesses
     *
     * @param id the id of the BookingBusinesses to retrieve
     * @return the request builder for the BookingBusinesses object
     */
    public IBookingBusinessRequestBuilder bookingBusinesses(final String id) {
        return new BookingBusinessRequestBuilder(getServiceRoot() + "/bookingBusinesses/" + id, this, null);
    }

    /**
     * Gets the collection of BookingCurrencies objects
     *
     * @return the request builder for the collection of BookingCurrencies objects
     */
    public IBookingCurrencyCollectionRequestBuilder bookingCurrencies() {
        return new BookingCurrencyCollectionRequestBuilder(getServiceRoot() + "/bookingCurrencies", this, null);
    }

    /**
     * Gets a single BookingCurrencies
     *
     * @param id the id of the BookingCurrencies to retrieve
     * @return the request builder for the BookingCurrencies object
     */
    public IBookingCurrencyRequestBuilder bookingCurrencies(final String id) {
        return new BookingCurrencyRequestBuilder(getServiceRoot() + "/bookingCurrencies/" + id, this, null);
    }

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    public IDeviceCollectionRequestBuilder devices() {
        return new DeviceCollectionRequestBuilder(getServiceRoot() + "/devices", this, null);
    }

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    public IDeviceRequestBuilder devices(final String id) {
        return new DeviceRequestBuilder(getServiceRoot() + "/devices/" + id, this, null);
    }

    /**
     * Gets the collection of IdentityProviders objects
     *
     * @return the request builder for the collection of IdentityProviders objects
     */
    public IIdentityProviderCollectionRequestBuilder identityProviders() {
        return new IdentityProviderCollectionRequestBuilder(getServiceRoot() + "/identityProviders", this, null);
    }

    /**
     * Gets a single IdentityProviders
     *
     * @param id the id of the IdentityProviders to retrieve
     * @return the request builder for the IdentityProviders object
     */
    public IIdentityProviderRequestBuilder identityProviders(final String id) {
        return new IdentityProviderRequestBuilder(getServiceRoot() + "/identityProviders/" + id, this, null);
    }

    /**
     * Gets the collection of AdministrativeUnits objects
     *
     * @return the request builder for the collection of AdministrativeUnits objects
     */
    public IAdministrativeUnitCollectionRequestBuilder administrativeUnits() {
        return new AdministrativeUnitCollectionRequestBuilder(getServiceRoot() + "/administrativeUnits", this, null);
    }

    /**
     * Gets a single AdministrativeUnits
     *
     * @param id the id of the AdministrativeUnits to retrieve
     * @return the request builder for the AdministrativeUnits object
     */
    public IAdministrativeUnitRequestBuilder administrativeUnits(final String id) {
        return new AdministrativeUnitRequestBuilder(getServiceRoot() + "/administrativeUnits/" + id, this, null);
    }

    /**
     * Gets the collection of AllowedDataLocations objects
     *
     * @return the request builder for the collection of AllowedDataLocations objects
     */
    public IAllowedDataLocationCollectionRequestBuilder allowedDataLocations() {
        return new AllowedDataLocationCollectionRequestBuilder(getServiceRoot() + "/allowedDataLocations", this, null);
    }

    /**
     * Gets a single AllowedDataLocations
     *
     * @param id the id of the AllowedDataLocations to retrieve
     * @return the request builder for the AllowedDataLocations object
     */
    public IAllowedDataLocationRequestBuilder allowedDataLocations(final String id) {
        return new AllowedDataLocationRequestBuilder(getServiceRoot() + "/allowedDataLocations/" + id, this, null);
    }

    /**
     * Gets the collection of Applications objects
     *
     * @return the request builder for the collection of Applications objects
     */
    public IApplicationCollectionRequestBuilder applications() {
        return new ApplicationCollectionRequestBuilder(getServiceRoot() + "/applications", this, null);
    }

    /**
     * Gets a single Applications
     *
     * @param id the id of the Applications to retrieve
     * @return the request builder for the Applications object
     */
    public IApplicationRequestBuilder applications(final String id) {
        return new ApplicationRequestBuilder(getServiceRoot() + "/applications/" + id, this, null);
    }

    /**
     * Gets the collection of AppRoleAssignments objects
     *
     * @return the request builder for the collection of AppRoleAssignments objects
     */
    public IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getServiceRoot() + "/appRoleAssignments", this, null);
    }

    /**
     * Gets a single AppRoleAssignments
     *
     * @param id the id of the AppRoleAssignments to retrieve
     * @return the request builder for the AppRoleAssignments object
     */
    public IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id) {
        return new AppRoleAssignmentRequestBuilder(getServiceRoot() + "/appRoleAssignments/" + id, this, null);
    }

    /**
     * Gets the collection of CertificateBasedAuthConfiguration objects
     *
     * @return the request builder for the collection of CertificateBasedAuthConfiguration objects
     */
    public ICertificateBasedAuthConfigurationCollectionRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationCollectionRequestBuilder(getServiceRoot() + "/certificateBasedAuthConfiguration", this, null);
    }

    /**
     * Gets a single CertificateBasedAuthConfiguration
     *
     * @param id the id of the CertificateBasedAuthConfiguration to retrieve
     * @return the request builder for the CertificateBasedAuthConfiguration object
     */
    public ICertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration(final String id) {
        return new CertificateBasedAuthConfigurationRequestBuilder(getServiceRoot() + "/certificateBasedAuthConfiguration/" + id, this, null);
    }

    /**
     * Gets the collection of Contacts objects
     *
     * @return the request builder for the collection of Contacts objects
     */
    public IOrgContactCollectionRequestBuilder contacts() {
        return new OrgContactCollectionRequestBuilder(getServiceRoot() + "/contacts", this, null);
    }

    /**
     * Gets a single Contacts
     *
     * @param id the id of the Contacts to retrieve
     * @return the request builder for the Contacts object
     */
    public IOrgContactRequestBuilder contacts(final String id) {
        return new OrgContactRequestBuilder(getServiceRoot() + "/contacts/" + id, this, null);
    }

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    public IContractCollectionRequestBuilder contracts() {
        return new ContractCollectionRequestBuilder(getServiceRoot() + "/contracts", this, null);
    }

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    public IContractRequestBuilder contracts(final String id) {
        return new ContractRequestBuilder(getServiceRoot() + "/contracts/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    public IDirectoryObjectCollectionRequestBuilder directoryObjects() {
        return new DirectoryObjectCollectionRequestBuilder(getServiceRoot() + "/directoryObjects", this, null);
    }

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    public IDirectoryObjectRequestBuilder directoryObjects(final String id) {
        return new DirectoryObjectRequestBuilder(getServiceRoot() + "/directoryObjects/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    public IDirectoryRoleCollectionRequestBuilder directoryRoles() {
        return new DirectoryRoleCollectionRequestBuilder(getServiceRoot() + "/directoryRoles", this, null);
    }

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    public IDirectoryRoleRequestBuilder directoryRoles(final String id) {
        return new DirectoryRoleRequestBuilder(getServiceRoot() + "/directoryRoles/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    public IDirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplateCollectionRequestBuilder(getServiceRoot() + "/directoryRoleTemplates", this, null);
    }

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    public IDirectoryRoleTemplateRequestBuilder directoryRoleTemplates(final String id) {
        return new DirectoryRoleTemplateRequestBuilder(getServiceRoot() + "/directoryRoleTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of DirectorySettingTemplates objects
     *
     * @return the request builder for the collection of DirectorySettingTemplates objects
     */
    public IDirectorySettingTemplateCollectionRequestBuilder directorySettingTemplates() {
        return new DirectorySettingTemplateCollectionRequestBuilder(getServiceRoot() + "/directorySettingTemplates", this, null);
    }

    /**
     * Gets a single DirectorySettingTemplates
     *
     * @param id the id of the DirectorySettingTemplates to retrieve
     * @return the request builder for the DirectorySettingTemplates object
     */
    public IDirectorySettingTemplateRequestBuilder directorySettingTemplates(final String id) {
        return new DirectorySettingTemplateRequestBuilder(getServiceRoot() + "/directorySettingTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    public IDomainDnsRecordCollectionRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getServiceRoot() + "/domainDnsRecords", this, null);
    }

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    public IDomainDnsRecordRequestBuilder domainDnsRecords(final String id) {
        return new DomainDnsRecordRequestBuilder(getServiceRoot() + "/domainDnsRecords/" + id, this, null);
    }

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    public IDomainCollectionRequestBuilder domains() {
        return new DomainCollectionRequestBuilder(getServiceRoot() + "/domains", this, null);
    }

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    public IDomainRequestBuilder domains(final String id) {
        return new DomainRequestBuilder(getServiceRoot() + "/domains/" + id, this, null);
    }

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    public IGroupCollectionRequestBuilder groups() {
        return new GroupCollectionRequestBuilder(getServiceRoot() + "/groups", this, null);
    }

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    public IGroupRequestBuilder groups(final String id) {
        return new GroupRequestBuilder(getServiceRoot() + "/groups/" + id, this, null);
    }

    /**
     * Gets the collection of Oauth2PermissionGrants objects
     *
     * @return the request builder for the collection of Oauth2PermissionGrants objects
     */
    public IOAuth2PermissionGrantCollectionRequestBuilder oauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants", this, null);
    }

    /**
     * Gets a single Oauth2PermissionGrants
     *
     * @param id the id of the Oauth2PermissionGrants to retrieve
     * @return the request builder for the Oauth2PermissionGrants object
     */
    public IOAuth2PermissionGrantRequestBuilder oauth2PermissionGrants(final String id) {
        return new OAuth2PermissionGrantRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants/" + id, this, null);
    }

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    public IOrganizationCollectionRequestBuilder organization() {
        return new OrganizationCollectionRequestBuilder(getServiceRoot() + "/organization", this, null);
    }

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    public IOrganizationRequestBuilder organization(final String id) {
        return new OrganizationRequestBuilder(getServiceRoot() + "/organization/" + id, this, null);
    }

    /**
     * Gets the collection of PermissionGrants objects
     *
     * @return the request builder for the collection of PermissionGrants objects
     */
    public IResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants() {
        return new ResourceSpecificPermissionGrantCollectionRequestBuilder(getServiceRoot() + "/permissionGrants", this, null);
    }

    /**
     * Gets a single PermissionGrants
     *
     * @param id the id of the PermissionGrants to retrieve
     * @return the request builder for the PermissionGrants object
     */
    public IResourceSpecificPermissionGrantRequestBuilder permissionGrants(final String id) {
        return new ResourceSpecificPermissionGrantRequestBuilder(getServiceRoot() + "/permissionGrants/" + id, this, null);
    }

    /**
     * Gets the collection of ScopedRoleMemberships objects
     *
     * @return the request builder for the collection of ScopedRoleMemberships objects
     */
    public IScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getServiceRoot() + "/scopedRoleMemberships", this, null);
    }

    /**
     * Gets a single ScopedRoleMemberships
     *
     * @param id the id of the ScopedRoleMemberships to retrieve
     * @return the request builder for the ScopedRoleMemberships object
     */
    public IScopedRoleMembershipRequestBuilder scopedRoleMemberships(final String id) {
        return new ScopedRoleMembershipRequestBuilder(getServiceRoot() + "/scopedRoleMemberships/" + id, this, null);
    }

    /**
     * Gets the collection of Settings objects
     *
     * @return the request builder for the collection of Settings objects
     */
    public IDirectorySettingCollectionRequestBuilder settings() {
        return new DirectorySettingCollectionRequestBuilder(getServiceRoot() + "/settings", this, null);
    }

    /**
     * Gets a single Settings
     *
     * @param id the id of the Settings to retrieve
     * @return the request builder for the Settings object
     */
    public IDirectorySettingRequestBuilder settings(final String id) {
        return new DirectorySettingRequestBuilder(getServiceRoot() + "/settings/" + id, this, null);
    }

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    public ISubscribedSkuCollectionRequestBuilder subscribedSkus() {
        return new SubscribedSkuCollectionRequestBuilder(getServiceRoot() + "/subscribedSkus", this, null);
    }

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    public ISubscribedSkuRequestBuilder subscribedSkus(final String id) {
        return new SubscribedSkuRequestBuilder(getServiceRoot() + "/subscribedSkus/" + id, this, null);
    }

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    public IDriveItemCollectionRequestBuilder workbooks() {
        return new DriveItemCollectionRequestBuilder(getServiceRoot() + "/workbooks", this, null);
    }

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    public IDriveItemRequestBuilder workbooks(final String id) {
        return new DriveItemRequestBuilder(getServiceRoot() + "/workbooks/" + id, this, null);
    }

    /**
     * Gets the collection of Places objects
     *
     * @return the request builder for the collection of Places objects
     */
    public IPlaceCollectionRequestBuilder places() {
        return new PlaceCollectionRequestBuilder(getServiceRoot() + "/places", this, null);
    }

    /**
     * Gets a single Places
     *
     * @param id the id of the Places to retrieve
     * @return the request builder for the Places object
     */
    public IPlaceRequestBuilder places(final String id) {
        return new PlaceRequestBuilder(getServiceRoot() + "/places/" + id, this, null);
    }

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    public IDriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getServiceRoot() + "/drives", this, null);
    }

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    public IDriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getServiceRoot() + "/drives/" + id, this, null);
    }

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    public ISharedDriveItemCollectionRequestBuilder shares() {
        return new SharedDriveItemCollectionRequestBuilder(getServiceRoot() + "/shares", this, null);
    }

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    public ISharedDriveItemRequestBuilder shares(final String id) {
        return new SharedDriveItemRequestBuilder(getServiceRoot() + "/shares/" + id, this, null);
    }

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    public ISiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getServiceRoot() + "/sites", this, null);
    }

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    public ISiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getServiceRoot() + "/sites/" + id, this, null);
    }

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    public ISchemaExtensionCollectionRequestBuilder schemaExtensions() {
        return new SchemaExtensionCollectionRequestBuilder(getServiceRoot() + "/schemaExtensions", this, null);
    }

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    public ISchemaExtensionRequestBuilder schemaExtensions(final String id) {
        return new SchemaExtensionRequestBuilder(getServiceRoot() + "/schemaExtensions/" + id, this, null);
    }

    /**
     * Gets the collection of OnPremisesPublishingProfiles objects
     *
     * @return the request builder for the collection of OnPremisesPublishingProfiles objects
     */
    public IOnPremisesPublishingProfileCollectionRequestBuilder onPremisesPublishingProfiles() {
        return new OnPremisesPublishingProfileCollectionRequestBuilder(getServiceRoot() + "/onPremisesPublishingProfiles", this, null);
    }

    /**
     * Gets a single OnPremisesPublishingProfiles
     *
     * @param id the id of the OnPremisesPublishingProfiles to retrieve
     * @return the request builder for the OnPremisesPublishingProfiles object
     */
    public IOnPremisesPublishingProfileRequestBuilder onPremisesPublishingProfiles(final String id) {
        return new OnPremisesPublishingProfileRequestBuilder(getServiceRoot() + "/onPremisesPublishingProfiles/" + id, this, null);
    }

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    public IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePolicyCollectionRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies", this, null);
    }

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    public IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id) {
        return new GroupLifecyclePolicyRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies/" + id, this, null);
    }

    /**
     * Gets the collection of FilterOperators objects
     *
     * @return the request builder for the collection of FilterOperators objects
     */
    public IFilterOperatorSchemaCollectionRequestBuilder filterOperators() {
        return new FilterOperatorSchemaCollectionRequestBuilder(getServiceRoot() + "/filterOperators", this, null);
    }

    /**
     * Gets a single FilterOperators
     *
     * @param id the id of the FilterOperators to retrieve
     * @return the request builder for the FilterOperators object
     */
    public IFilterOperatorSchemaRequestBuilder filterOperators(final String id) {
        return new FilterOperatorSchemaRequestBuilder(getServiceRoot() + "/filterOperators/" + id, this, null);
    }

    /**
     * Gets the collection of Functions objects
     *
     * @return the request builder for the collection of Functions objects
     */
    public IAttributeMappingFunctionSchemaCollectionRequestBuilder functions() {
        return new AttributeMappingFunctionSchemaCollectionRequestBuilder(getServiceRoot() + "/functions", this, null);
    }

    /**
     * Gets a single Functions
     *
     * @param id the id of the Functions to retrieve
     * @return the request builder for the Functions object
     */
    public IAttributeMappingFunctionSchemaRequestBuilder functions(final String id) {
        return new AttributeMappingFunctionSchemaRequestBuilder(getServiceRoot() + "/functions/" + id, this, null);
    }

    /**
     * Gets the collection of AccessReviewDecisions objects
     *
     * @return the request builder for the collection of AccessReviewDecisions objects
     */
    public IAccessReviewDecisionCollectionRequestBuilder accessReviewDecisions() {
        return new AccessReviewDecisionCollectionRequestBuilder(getServiceRoot() + "/accessReviewDecisions", this, null);
    }

    /**
     * Gets a single AccessReviewDecisions
     *
     * @param id the id of the AccessReviewDecisions to retrieve
     * @return the request builder for the AccessReviewDecisions object
     */
    public IAccessReviewDecisionRequestBuilder accessReviewDecisions(final String id) {
        return new AccessReviewDecisionRequestBuilder(getServiceRoot() + "/accessReviewDecisions/" + id, this, null);
    }

    /**
     * Gets the collection of AccessReviews objects
     *
     * @return the request builder for the collection of AccessReviews objects
     */
    public IAccessReviewCollectionRequestBuilder accessReviews() {
        return new AccessReviewCollectionRequestBuilder(getServiceRoot() + "/accessReviews", this, null);
    }

    /**
     * Gets a single AccessReviews
     *
     * @param id the id of the AccessReviews to retrieve
     * @return the request builder for the AccessReviews object
     */
    public IAccessReviewRequestBuilder accessReviews(final String id) {
        return new AccessReviewRequestBuilder(getServiceRoot() + "/accessReviews/" + id, this, null);
    }

    /**
     * Gets the collection of ApprovalWorkflowProviders objects
     *
     * @return the request builder for the collection of ApprovalWorkflowProviders objects
     */
    public IApprovalWorkflowProviderCollectionRequestBuilder approvalWorkflowProviders() {
        return new ApprovalWorkflowProviderCollectionRequestBuilder(getServiceRoot() + "/approvalWorkflowProviders", this, null);
    }

    /**
     * Gets a single ApprovalWorkflowProviders
     *
     * @param id the id of the ApprovalWorkflowProviders to retrieve
     * @return the request builder for the ApprovalWorkflowProviders object
     */
    public IApprovalWorkflowProviderRequestBuilder approvalWorkflowProviders(final String id) {
        return new ApprovalWorkflowProviderRequestBuilder(getServiceRoot() + "/approvalWorkflowProviders/" + id, this, null);
    }

    /**
     * Gets the collection of BusinessFlowTemplates objects
     *
     * @return the request builder for the collection of BusinessFlowTemplates objects
     */
    public IBusinessFlowTemplateCollectionRequestBuilder businessFlowTemplates() {
        return new BusinessFlowTemplateCollectionRequestBuilder(getServiceRoot() + "/businessFlowTemplates", this, null);
    }

    /**
     * Gets a single BusinessFlowTemplates
     *
     * @param id the id of the BusinessFlowTemplates to retrieve
     * @return the request builder for the BusinessFlowTemplates object
     */
    public IBusinessFlowTemplateRequestBuilder businessFlowTemplates(final String id) {
        return new BusinessFlowTemplateRequestBuilder(getServiceRoot() + "/businessFlowTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of ProgramControls objects
     *
     * @return the request builder for the collection of ProgramControls objects
     */
    public IProgramControlCollectionRequestBuilder programControls() {
        return new ProgramControlCollectionRequestBuilder(getServiceRoot() + "/programControls", this, null);
    }

    /**
     * Gets a single ProgramControls
     *
     * @param id the id of the ProgramControls to retrieve
     * @return the request builder for the ProgramControls object
     */
    public IProgramControlRequestBuilder programControls(final String id) {
        return new ProgramControlRequestBuilder(getServiceRoot() + "/programControls/" + id, this, null);
    }

    /**
     * Gets the collection of ProgramControlTypes objects
     *
     * @return the request builder for the collection of ProgramControlTypes objects
     */
    public IProgramControlTypeCollectionRequestBuilder programControlTypes() {
        return new ProgramControlTypeCollectionRequestBuilder(getServiceRoot() + "/programControlTypes", this, null);
    }

    /**
     * Gets a single ProgramControlTypes
     *
     * @param id the id of the ProgramControlTypes to retrieve
     * @return the request builder for the ProgramControlTypes object
     */
    public IProgramControlTypeRequestBuilder programControlTypes(final String id) {
        return new ProgramControlTypeRequestBuilder(getServiceRoot() + "/programControlTypes/" + id, this, null);
    }

    /**
     * Gets the collection of Programs objects
     *
     * @return the request builder for the collection of Programs objects
     */
    public IProgramCollectionRequestBuilder programs() {
        return new ProgramCollectionRequestBuilder(getServiceRoot() + "/programs", this, null);
    }

    /**
     * Gets a single Programs
     *
     * @param id the id of the Programs to retrieve
     * @return the request builder for the Programs object
     */
    public IProgramRequestBuilder programs(final String id) {
        return new ProgramRequestBuilder(getServiceRoot() + "/programs/" + id, this, null);
    }

    /**
     * Gets the collection of AgreementAcceptances objects
     *
     * @return the request builder for the collection of AgreementAcceptances objects
     */
    public IAgreementAcceptanceCollectionRequestBuilder agreementAcceptances() {
        return new AgreementAcceptanceCollectionRequestBuilder(getServiceRoot() + "/agreementAcceptances", this, null);
    }

    /**
     * Gets a single AgreementAcceptances
     *
     * @param id the id of the AgreementAcceptances to retrieve
     * @return the request builder for the AgreementAcceptances object
     */
    public IAgreementAcceptanceRequestBuilder agreementAcceptances(final String id) {
        return new AgreementAcceptanceRequestBuilder(getServiceRoot() + "/agreementAcceptances/" + id, this, null);
    }

    /**
     * Gets the collection of Agreements objects
     *
     * @return the request builder for the collection of Agreements objects
     */
    public IAgreementCollectionRequestBuilder agreements() {
        return new AgreementCollectionRequestBuilder(getServiceRoot() + "/agreements", this, null);
    }

    /**
     * Gets a single Agreements
     *
     * @param id the id of the Agreements to retrieve
     * @return the request builder for the Agreements object
     */
    public IAgreementRequestBuilder agreements(final String id) {
        return new AgreementRequestBuilder(getServiceRoot() + "/agreements/" + id, this, null);
    }

    /**
     * Gets the collection of RiskDetections objects
     *
     * @return the request builder for the collection of RiskDetections objects
     */
    public IRiskDetectionCollectionRequestBuilder riskDetections() {
        return new RiskDetectionCollectionRequestBuilder(getServiceRoot() + "/riskDetections", this, null);
    }

    /**
     * Gets a single RiskDetections
     *
     * @param id the id of the RiskDetections to retrieve
     * @return the request builder for the RiskDetections object
     */
    public IRiskDetectionRequestBuilder riskDetections(final String id) {
        return new RiskDetectionRequestBuilder(getServiceRoot() + "/riskDetections/" + id, this, null);
    }

    /**
     * Gets the collection of RiskyUsers objects
     *
     * @return the request builder for the collection of RiskyUsers objects
     */
    public IRiskyUserCollectionRequestBuilder riskyUsers() {
        return new RiskyUserCollectionRequestBuilder(getServiceRoot() + "/riskyUsers", this, null);
    }

    /**
     * Gets a single RiskyUsers
     *
     * @param id the id of the RiskyUsers to retrieve
     * @return the request builder for the RiskyUsers object
     */
    public IRiskyUserRequestBuilder riskyUsers(final String id) {
        return new RiskyUserRequestBuilder(getServiceRoot() + "/riskyUsers/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceResources objects
     *
     * @return the request builder for the collection of GovernanceResources objects
     */
    public IGovernanceResourceCollectionRequestBuilder governanceResources() {
        return new GovernanceResourceCollectionRequestBuilder(getServiceRoot() + "/governanceResources", this, null);
    }

    /**
     * Gets a single GovernanceResources
     *
     * @param id the id of the GovernanceResources to retrieve
     * @return the request builder for the GovernanceResources object
     */
    public IGovernanceResourceRequestBuilder governanceResources(final String id) {
        return new GovernanceResourceRequestBuilder(getServiceRoot() + "/governanceResources/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceRoleAssignmentRequests objects
     *
     * @return the request builder for the collection of GovernanceRoleAssignmentRequests objects
     */
    public IGovernanceRoleAssignmentRequestCollectionRequestBuilder governanceRoleAssignmentRequests() {
        return new GovernanceRoleAssignmentRequestCollectionRequestBuilder(getServiceRoot() + "/governanceRoleAssignmentRequests", this, null);
    }

    /**
     * Gets a single GovernanceRoleAssignmentRequests
     *
     * @param id the id of the GovernanceRoleAssignmentRequests to retrieve
     * @return the request builder for the GovernanceRoleAssignmentRequests object
     */
    public IGovernanceRoleAssignmentRequestRequestBuilder governanceRoleAssignmentRequests(final String id) {
        return new GovernanceRoleAssignmentRequestRequestBuilder(getServiceRoot() + "/governanceRoleAssignmentRequests/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceRoleAssignments objects
     *
     * @return the request builder for the collection of GovernanceRoleAssignments objects
     */
    public IGovernanceRoleAssignmentCollectionRequestBuilder governanceRoleAssignments() {
        return new GovernanceRoleAssignmentCollectionRequestBuilder(getServiceRoot() + "/governanceRoleAssignments", this, null);
    }

    /**
     * Gets a single GovernanceRoleAssignments
     *
     * @param id the id of the GovernanceRoleAssignments to retrieve
     * @return the request builder for the GovernanceRoleAssignments object
     */
    public IGovernanceRoleAssignmentRequestBuilder governanceRoleAssignments(final String id) {
        return new GovernanceRoleAssignmentRequestBuilder(getServiceRoot() + "/governanceRoleAssignments/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceRoleDefinitions objects
     *
     * @return the request builder for the collection of GovernanceRoleDefinitions objects
     */
    public IGovernanceRoleDefinitionCollectionRequestBuilder governanceRoleDefinitions() {
        return new GovernanceRoleDefinitionCollectionRequestBuilder(getServiceRoot() + "/governanceRoleDefinitions", this, null);
    }

    /**
     * Gets a single GovernanceRoleDefinitions
     *
     * @param id the id of the GovernanceRoleDefinitions to retrieve
     * @return the request builder for the GovernanceRoleDefinitions object
     */
    public IGovernanceRoleDefinitionRequestBuilder governanceRoleDefinitions(final String id) {
        return new GovernanceRoleDefinitionRequestBuilder(getServiceRoot() + "/governanceRoleDefinitions/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceRoleSettings objects
     *
     * @return the request builder for the collection of GovernanceRoleSettings objects
     */
    public IGovernanceRoleSettingCollectionRequestBuilder governanceRoleSettings() {
        return new GovernanceRoleSettingCollectionRequestBuilder(getServiceRoot() + "/governanceRoleSettings", this, null);
    }

    /**
     * Gets a single GovernanceRoleSettings
     *
     * @param id the id of the GovernanceRoleSettings to retrieve
     * @return the request builder for the GovernanceRoleSettings object
     */
    public IGovernanceRoleSettingRequestBuilder governanceRoleSettings(final String id) {
        return new GovernanceRoleSettingRequestBuilder(getServiceRoot() + "/governanceRoleSettings/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceSubjects objects
     *
     * @return the request builder for the collection of GovernanceSubjects objects
     */
    public IGovernanceSubjectCollectionRequestBuilder governanceSubjects() {
        return new GovernanceSubjectCollectionRequestBuilder(getServiceRoot() + "/governanceSubjects", this, null);
    }

    /**
     * Gets a single GovernanceSubjects
     *
     * @param id the id of the GovernanceSubjects to retrieve
     * @return the request builder for the GovernanceSubjects object
     */
    public IGovernanceSubjectRequestBuilder governanceSubjects(final String id) {
        return new GovernanceSubjectRequestBuilder(getServiceRoot() + "/governanceSubjects/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedAccess objects
     *
     * @return the request builder for the collection of PrivilegedAccess objects
     */
    public IPrivilegedAccessCollectionRequestBuilder privilegedAccess() {
        return new PrivilegedAccessCollectionRequestBuilder(getServiceRoot() + "/privilegedAccess", this, null);
    }

    /**
     * Gets a single PrivilegedAccess
     *
     * @param id the id of the PrivilegedAccess to retrieve
     * @return the request builder for the PrivilegedAccess object
     */
    public IPrivilegedAccessRequestBuilder privilegedAccess(final String id) {
        return new PrivilegedAccessRequestBuilder(getServiceRoot() + "/privilegedAccess/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedApproval objects
     *
     * @return the request builder for the collection of PrivilegedApproval objects
     */
    public IPrivilegedApprovalCollectionRequestBuilder privilegedApproval() {
        return new PrivilegedApprovalCollectionRequestBuilder(getServiceRoot() + "/privilegedApproval", this, null);
    }

    /**
     * Gets a single PrivilegedApproval
     *
     * @param id the id of the PrivilegedApproval to retrieve
     * @return the request builder for the PrivilegedApproval object
     */
    public IPrivilegedApprovalRequestBuilder privilegedApproval(final String id) {
        return new PrivilegedApprovalRequestBuilder(getServiceRoot() + "/privilegedApproval/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedOperationEvents objects
     *
     * @return the request builder for the collection of PrivilegedOperationEvents objects
     */
    public IPrivilegedOperationEventCollectionRequestBuilder privilegedOperationEvents() {
        return new PrivilegedOperationEventCollectionRequestBuilder(getServiceRoot() + "/privilegedOperationEvents", this, null);
    }

    /**
     * Gets a single PrivilegedOperationEvents
     *
     * @param id the id of the PrivilegedOperationEvents to retrieve
     * @return the request builder for the PrivilegedOperationEvents object
     */
    public IPrivilegedOperationEventRequestBuilder privilegedOperationEvents(final String id) {
        return new PrivilegedOperationEventRequestBuilder(getServiceRoot() + "/privilegedOperationEvents/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedRoleAssignmentRequests objects
     *
     * @return the request builder for the collection of PrivilegedRoleAssignmentRequests objects
     */
    public IPrivilegedRoleAssignmentRequestCollectionRequestBuilder privilegedRoleAssignmentRequests() {
        return new PrivilegedRoleAssignmentRequestCollectionRequestBuilder(getServiceRoot() + "/privilegedRoleAssignmentRequests", this, null);
    }

    /**
     * Gets a single PrivilegedRoleAssignmentRequests
     *
     * @param id the id of the PrivilegedRoleAssignmentRequests to retrieve
     * @return the request builder for the PrivilegedRoleAssignmentRequests object
     */
    public IPrivilegedRoleAssignmentRequestRequestBuilder privilegedRoleAssignmentRequests(final String id) {
        return new PrivilegedRoleAssignmentRequestRequestBuilder(getServiceRoot() + "/privilegedRoleAssignmentRequests/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedRoleAssignments objects
     *
     * @return the request builder for the collection of PrivilegedRoleAssignments objects
     */
    public IPrivilegedRoleAssignmentCollectionRequestBuilder privilegedRoleAssignments() {
        return new PrivilegedRoleAssignmentCollectionRequestBuilder(getServiceRoot() + "/privilegedRoleAssignments", this, null);
    }

    /**
     * Gets a single PrivilegedRoleAssignments
     *
     * @param id the id of the PrivilegedRoleAssignments to retrieve
     * @return the request builder for the PrivilegedRoleAssignments object
     */
    public IPrivilegedRoleAssignmentRequestBuilder privilegedRoleAssignments(final String id) {
        return new PrivilegedRoleAssignmentRequestBuilder(getServiceRoot() + "/privilegedRoleAssignments/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedRoles objects
     *
     * @return the request builder for the collection of PrivilegedRoles objects
     */
    public IPrivilegedRoleCollectionRequestBuilder privilegedRoles() {
        return new PrivilegedRoleCollectionRequestBuilder(getServiceRoot() + "/privilegedRoles", this, null);
    }

    /**
     * Gets a single PrivilegedRoles
     *
     * @param id the id of the PrivilegedRoles to retrieve
     * @return the request builder for the PrivilegedRoles object
     */
    public IPrivilegedRoleRequestBuilder privilegedRoles(final String id) {
        return new PrivilegedRoleRequestBuilder(getServiceRoot() + "/privilegedRoles/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedSignupStatus objects
     *
     * @return the request builder for the collection of PrivilegedSignupStatus objects
     */
    public IPrivilegedSignupStatusCollectionRequestBuilder privilegedSignupStatus() {
        return new PrivilegedSignupStatusCollectionRequestBuilder(getServiceRoot() + "/privilegedSignupStatus", this, null);
    }

    /**
     * Gets a single PrivilegedSignupStatus
     *
     * @param id the id of the PrivilegedSignupStatus to retrieve
     * @return the request builder for the PrivilegedSignupStatus object
     */
    public IPrivilegedSignupStatusRequestBuilder privilegedSignupStatus(final String id) {
        return new PrivilegedSignupStatusRequestBuilder(getServiceRoot() + "/privilegedSignupStatus/" + id, this, null);
    }

    /**
     * Gets the collection of Commands objects
     *
     * @return the request builder for the collection of Commands objects
     */
    public ICommandCollectionRequestBuilder commands() {
        return new CommandCollectionRequestBuilder(getServiceRoot() + "/commands", this, null);
    }

    /**
     * Gets a single Commands
     *
     * @param id the id of the Commands to retrieve
     * @return the request builder for the Commands object
     */
    public ICommandRequestBuilder commands(final String id) {
        return new CommandRequestBuilder(getServiceRoot() + "/commands/" + id, this, null);
    }

    /**
     * Gets the collection of PayloadResponse objects
     *
     * @return the request builder for the collection of PayloadResponse objects
     */
    public IPayloadResponseCollectionRequestBuilder payloadResponse() {
        return new PayloadResponseCollectionRequestBuilder(getServiceRoot() + "/payloadResponse", this, null);
    }

    /**
     * Gets a single PayloadResponse
     *
     * @param id the id of the PayloadResponse to retrieve
     * @return the request builder for the PayloadResponse object
     */
    public IPayloadResponseRequestBuilder payloadResponse(final String id) {
        return new PayloadResponseRequestBuilder(getServiceRoot() + "/payloadResponse/" + id, this, null);
    }

    /**
     * Gets the collection of DataPolicyOperations objects
     *
     * @return the request builder for the collection of DataPolicyOperations objects
     */
    public IDataPolicyOperationCollectionRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationCollectionRequestBuilder(getServiceRoot() + "/dataPolicyOperations", this, null);
    }

    /**
     * Gets a single DataPolicyOperations
     *
     * @param id the id of the DataPolicyOperations to retrieve
     * @return the request builder for the DataPolicyOperations object
     */
    public IDataPolicyOperationRequestBuilder dataPolicyOperations(final String id) {
        return new DataPolicyOperationRequestBuilder(getServiceRoot() + "/dataPolicyOperations/" + id, this, null);
    }

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    public ISubscriptionCollectionRequestBuilder subscriptions() {
        return new SubscriptionCollectionRequestBuilder(getServiceRoot() + "/subscriptions", this, null);
    }

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    public ISubscriptionRequestBuilder subscriptions(final String id) {
        return new SubscriptionRequestBuilder(getServiceRoot() + "/subscriptions/" + id, this, null);
    }

    /**
     * Gets the collection of Connections objects
     *
     * @return the request builder for the collection of Connections objects
     */
    public IExternalConnectionCollectionRequestBuilder connections() {
        return new ExternalConnectionCollectionRequestBuilder(getServiceRoot() + "/connections", this, null);
    }

    /**
     * Gets a single Connections
     *
     * @param id the id of the Connections to retrieve
     * @return the request builder for the Connections object
     */
    public IExternalConnectionRequestBuilder connections(final String id) {
        return new ExternalConnectionRequestBuilder(getServiceRoot() + "/connections/" + id, this, null);
    }

    /**
     * Gets the collection of Chats objects
     *
     * @return the request builder for the collection of Chats objects
     */
    public IChatCollectionRequestBuilder chats() {
        return new ChatCollectionRequestBuilder(getServiceRoot() + "/chats", this, null);
    }

    /**
     * Gets a single Chats
     *
     * @param id the id of the Chats to retrieve
     * @return the request builder for the Chats object
     */
    public IChatRequestBuilder chats(final String id) {
        return new ChatRequestBuilder(getServiceRoot() + "/chats/" + id, this, null);
    }

    /**
     * Gets the collection of Teams objects
     *
     * @return the request builder for the collection of Teams objects
     */
    public ITeamCollectionRequestBuilder teams() {
        return new TeamCollectionRequestBuilder(getServiceRoot() + "/teams", this, null);
    }

    /**
     * Gets a single Teams
     *
     * @param id the id of the Teams to retrieve
     * @return the request builder for the Teams object
     */
    public ITeamRequestBuilder teams(final String id) {
        return new TeamRequestBuilder(getServiceRoot() + "/teams/" + id, this, null);
    }

    /**
     * Gets the collection of TeamsTemplates objects
     *
     * @return the request builder for the collection of TeamsTemplates objects
     */
    public ITeamsTemplateCollectionRequestBuilder teamsTemplates() {
        return new TeamsTemplateCollectionRequestBuilder(getServiceRoot() + "/teamsTemplates", this, null);
    }

    /**
     * Gets a single TeamsTemplates
     *
     * @param id the id of the TeamsTemplates to retrieve
     * @return the request builder for the TeamsTemplates object
     */
    public ITeamsTemplateRequestBuilder teamsTemplates(final String id) {
        return new TeamsTemplateRequestBuilder(getServiceRoot() + "/teamsTemplates/" + id, this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AuditLogRoot
     */
    public IAuditLogRootRequestBuilder auditLogs() {
        return new AuditLogRootRequestBuilder(getServiceRoot() + "/auditLogs", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    public IReportRootRequestBuilder reports() {
        return new ReportRootRequestBuilder(getServiceRoot() + "/reports", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Bitlocker
     */
    public IBitlockerRequestBuilder bitlocker() {
        return new BitlockerRequestBuilder(getServiceRoot() + "/bitlocker", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    public IDeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(getServiceRoot() + "/deviceManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Compliance
     */
    public IComplianceRequestBuilder compliance() {
        return new ComplianceRequestBuilder(getServiceRoot() + "/compliance", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityContainer
     */
    public IIdentityContainerRequestBuilder identity() {
        return new IdentityContainerRequestBuilder(getServiceRoot() + "/identity", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the TrustFramework
     */
    public ITrustFrameworkRequestBuilder trustFramework() {
        return new TrustFrameworkRequestBuilder(getServiceRoot() + "/trustFramework", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DataClassificationService
     */
    public IDataClassificationServiceRequestBuilder dataClassification() {
        return new DataClassificationServiceRequestBuilder(getServiceRoot() + "/dataClassification", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the InformationProtection
     */
    public IInformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(getServiceRoot() + "/informationProtection", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the OrganizationalBranding
     */
    public IOrganizationalBrandingRequestBuilder branding() {
        return new OrganizationalBrandingRequestBuilder(getServiceRoot() + "/branding", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Directory
     */
    public IDirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(getServiceRoot() + "/directory", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    public IUserRequestBuilder me() {
        return new UserRequestBuilder(getServiceRoot() + "/me", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the PolicyRoot
     */
    public IPolicyRootRequestBuilder policies() {
        return new PolicyRootRequestBuilder(getServiceRoot() + "/policies", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the RoleManagement
     */
    public IRoleManagementRequestBuilder roleManagement() {
        return new RoleManagementRequestBuilder(getServiceRoot() + "/roleManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    public IEducationRootRequestBuilder education() {
        return new EducationRootRequestBuilder(getServiceRoot() + "/education", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getServiceRoot() + "/drive", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Store
     */
    public IStoreRequestBuilder termStore() {
        return new StoreRequestBuilder(getServiceRoot() + "/termStore", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CloudCommunications
     */
    public ICloudCommunicationsRequestBuilder communications() {
        return new CloudCommunicationsRequestBuilder(getServiceRoot() + "/communications", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityProtectionRoot
     */
    public IIdentityProtectionRootRequestBuilder identityProtection() {
        return new IdentityProtectionRootRequestBuilder(getServiceRoot() + "/identityProtection", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityGovernance
     */
    public IIdentityGovernanceRequestBuilder identityGovernance() {
        return new IdentityGovernanceRequestBuilder(getServiceRoot() + "/identityGovernance", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    public IDeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(getServiceRoot() + "/deviceAppManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the OfficeConfiguration
     */
    public IOfficeConfigurationRequestBuilder officeConfiguration() {
        return new OfficeConfigurationRequestBuilder(getServiceRoot() + "/officeConfiguration", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SearchEntity
     */
    public ISearchEntityRequestBuilder search() {
        return new SearchEntityRequestBuilder(getServiceRoot() + "/search", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Financials
     */
    public IFinancialsRequestBuilder financials() {
        return new FinancialsRequestBuilder(getServiceRoot() + "/financials", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    public IPlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(getServiceRoot() + "/planner", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Print
     */
    public IPrintRequestBuilder print() {
        return new PrintRequestBuilder(getServiceRoot() + "/print", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Security
     */
    public ISecurityRequestBuilder security() {
        return new SecurityRequestBuilder(getServiceRoot() + "/security", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CommsApplication
     */
    public ICommsApplicationRequestBuilder app() {
        return new CommsApplicationRequestBuilder(getServiceRoot() + "/app", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the External
     */
    public IExternalRequestBuilder external() {
        return new ExternalRequestBuilder(getServiceRoot() + "/external", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AppCatalogs
     */
    public IAppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(getServiceRoot() + "/appCatalogs", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Teamwork
     */
    public ITeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(getServiceRoot() + "/teamwork", this, null);
    }
}
