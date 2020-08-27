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
import com.microsoft.graph.requests.extensions.IIdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.AllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AllowedDataLocationRequestBuilder;
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
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
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
import com.microsoft.graph.requests.extensions.IOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantRequestBuilder;
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
import com.microsoft.graph.requests.extensions.IContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractRequestBuilder;
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
import com.microsoft.graph.requests.extensions.IConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.FilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.FilterOperatorSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalWorkflowProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalWorkflowProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalWorkflowProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalWorkflowProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskyUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedOperationEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandRequestBuilder;
import com.microsoft.graph.requests.extensions.CommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CommandRequestBuilder;
import com.microsoft.graph.requests.extensions.IPayloadResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPayloadResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.PayloadResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PayloadResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalConnectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalConnectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
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
import com.microsoft.graph.requests.extensions.IIdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrustFrameworkRequestBuilder;
import com.microsoft.graph.requests.extensions.TrustFrameworkRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataClassificationServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.DataClassificationServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IStoreRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.StoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityGovernanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProtectionRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProtectionRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfficeConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.OfficeConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISearchRequestBuilder;
import com.microsoft.graph.requests.extensions.SearchRequestBuilder;
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
import com.microsoft.graph.requests.extensions.ITeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.AppCatalogsRequestBuilder;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.authentication.*;
import com.microsoft.graph.logger.*;
import com.google.gson.JsonObject;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.models.extensions.IGraphServiceClient;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.core.IClientConfig;
import com.microsoft.graph.core.DefaultClientConfig;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Graph Service Client.
 */
public class GraphServiceClient extends BaseGraphServiceClient implements IGraphServiceClient {

    /**
     * Restricted constructor
     */
    protected GraphServiceClient() {
    }

	/**
     * Send a custom request to Graph
     * 
     * @param url
     *            the full URL to make a request with
     * @param responseType
     *            the response class to deserialize the response into
     * @return the instance of this builder
     */
    public <T> CustomRequestBuilder<T> customRequest(final String url, final Class<T> responseType) {
        return new CustomRequestBuilder<T>(getServiceRoot() + url, this, null, responseType);
    }

    /**
     * Send a custom request to Graph
     * 
     * @param url
     *            the full URL to make a request with
     * @return the instance of this builder
     */
    public CustomRequestBuilder<JsonObject> customRequest(final String url) {
        return new CustomRequestBuilder<JsonObject>(getServiceRoot() + url, this, null,
                JsonObject.class);
    }

    /**
     * Returns a Graph service client using the given configuration.
     * 
     * @param config
     *            the client configuration
     * @return a Graph service client
     */
    public static IGraphServiceClient fromConfig(final IClientConfig config) {
        GraphServiceClient client = new GraphServiceClient();
        client.setAuthenticationProvider(config.getAuthenticationProvider());
        client.setExecutors(config.getExecutors());
        client.setHttpProvider(config.getHttpProvider());
        client.setLogger(config.getLogger());
        client.setSerializer(config.getSerializer());
        client.validate();
        return client;
    }

	public static Builder builder() {
        return new Builder();
    }
    
    public static final class Builder {
        
        Builder() {
            // restrict instantiation
        }

        /**
         * Sets the authentication provider
         * 
         * @param authenticationProvider
         *            the authentication provider
         * @return a new builder that allows specification of other aspects of the GraphServiceClient
         */
        public Builder2 authenticationProvider(IAuthenticationProvider authenticationProvider) {
            checkNotNull(authenticationProvider, "authenticationProvider");
            return new Builder2(authenticationProvider);
        }
    }

	/**
     * The builder for this GraphServiceClient
     */
    public static final class Builder2 {
        
        private final IAuthenticationProvider authenticationProvider;
        private ISerializer serializer;
        private IHttpProvider httpProvider;
        private IExecutors executors;
        private ILogger logger;

        
        Builder2(IAuthenticationProvider authenticationProvider) {
            this.authenticationProvider = authenticationProvider;
        }

        /**
         * Sets the serializer.
         * 
         * @param serializer
         *            the serializer
         * @return the instance of this builder
         */
        public Builder2 serializer(final ISerializer serializer) {
            checkNotNull(serializer, "serializer");
            this.serializer = serializer;
            return this;
        }

        /**
         * Sets the httpProvider
         * 
         * @param httpProvider
         *            the httpProvider
         * @return the instance of this builder
         */
        public Builder2 httpProvider(final IHttpProvider httpProvider) {
            checkNotNull(httpProvider, "httpProvider");
            this.httpProvider = httpProvider;
            return this;
        }

        /**
         * Sets the executors
         * 
         * @param executors
         *            the executors
         * @return the instance of this builder
         */
        public Builder2 executors(final IExecutors executors) {
            checkNotNull(executors, "executors");
            this.executors = executors;
            return this;
        }

        /**
         * Sets the logger
         * 
         * @param logger
         *            the logger
         * @return the instance of this builder
         */
        public Builder2 logger(final ILogger logger) {
            checkNotNull(logger, "logger");
            this.logger = logger;
            return this;
        }

        /**
         * Builds and returns the Graph service client.
         * 
         * @return the Graph service client object
         * @throws ClientException
         *             if there was an exception creating the client
         */
        public IGraphServiceClient buildClient() throws ClientException {
            DefaultClientConfig config = new DefaultClientConfig() {

                @Override
                public IAuthenticationProvider getAuthenticationProvider() {
                    return authenticationProvider; 
                }

                @Override
                public IHttpProvider getHttpProvider() {
                    if (httpProvider != null) {
                        return httpProvider;
                    } else {
                        return super.getHttpProvider();
                    }
                }

                @Override
                public IExecutors getExecutors() {
                    if (executors != null) {
                        return executors;
                    } else {
                        return super.getExecutors();
                    }
                }

                @Override
                public ILogger getLogger() {
                    if (logger !=null) {
                        return logger;
                    } else {
                        return super.getLogger();
                    }
                }

                @Override
                public ISerializer getSerializer() {
                    if (serializer != null) {
                        return serializer;
                    } else {
                        return super.getSerializer();
                    }
                }
            };
            return GraphServiceClient.fromConfig(config);
        }
    }
    
    private static void checkNotNull(Object o, String name) {
        if (o==null) {
            throw new NullPointerException(name + " cannot be null");
        }
    }
}
