// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.requests.extensions.IInvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IInvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityStatisticsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityStatisticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingBusinessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingBusinessRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContractRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesPublishingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesPublishingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalWorkflowProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalWorkflowProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramControlTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProgramRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedAccessRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedOperationEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommandRequestBuilder;
import com.microsoft.graph.requests.extensions.IPayloadResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPayloadResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalConnectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IBitlockerRequestBuilder;
import com.microsoft.graph.requests.extensions.IComplianceRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrustFrameworkRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataClassificationServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRootRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IStoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityProtectionRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IIdentityGovernanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfficeConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ISearchEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.IFinancialsRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamworkRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Graph Service Client.
 */
public interface IBaseGraphServiceClient extends IBaseClient {

    /**
     * Gets the collection of Invitations objects
     *
     * @return the request builder for the collection of Invitations objects
     */
    IInvitationCollectionRequestBuilder invitations();

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    IInvitationRequestBuilder invitations(final String id);

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    IUserCollectionRequestBuilder users();

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    IUserRequestBuilder users(final String id);

    /**
     * Gets the collection of Activitystatistics objects
     *
     * @return the request builder for the collection of Activitystatistics objects
     */
    IActivityStatisticsCollectionRequestBuilder activitystatistics();

    /**
     * Gets a single Activitystatistics
     *
     * @param id the id of the Activitystatistics to retrieve
     * @return the request builder for the Activitystatistics object
     */
    IActivityStatisticsRequestBuilder activitystatistics(final String id);

    /**
     * Gets the collection of ApplicationTemplates objects
     *
     * @return the request builder for the collection of ApplicationTemplates objects
     */
    IApplicationTemplateCollectionRequestBuilder applicationTemplates();

    /**
     * Gets a single ApplicationTemplates
     *
     * @param id the id of the ApplicationTemplates to retrieve
     * @return the request builder for the ApplicationTemplates object
     */
    IApplicationTemplateRequestBuilder applicationTemplates(final String id);

    /**
     * Gets the collection of ServicePrincipals objects
     *
     * @return the request builder for the collection of ServicePrincipals objects
     */
    IServicePrincipalCollectionRequestBuilder servicePrincipals();

    /**
     * Gets a single ServicePrincipals
     *
     * @param id the id of the ServicePrincipals to retrieve
     * @return the request builder for the ServicePrincipals object
     */
    IServicePrincipalRequestBuilder servicePrincipals(final String id);

    /**
     * Gets the collection of BookingBusinesses objects
     *
     * @return the request builder for the collection of BookingBusinesses objects
     */
    IBookingBusinessCollectionRequestBuilder bookingBusinesses();

    /**
     * Gets a single BookingBusinesses
     *
     * @param id the id of the BookingBusinesses to retrieve
     * @return the request builder for the BookingBusinesses object
     */
    IBookingBusinessRequestBuilder bookingBusinesses(final String id);

    /**
     * Gets the collection of BookingCurrencies objects
     *
     * @return the request builder for the collection of BookingCurrencies objects
     */
    IBookingCurrencyCollectionRequestBuilder bookingCurrencies();

    /**
     * Gets a single BookingCurrencies
     *
     * @param id the id of the BookingCurrencies to retrieve
     * @return the request builder for the BookingCurrencies object
     */
    IBookingCurrencyRequestBuilder bookingCurrencies(final String id);

    /**
     * Gets the collection of IdentityProviders objects
     *
     * @return the request builder for the collection of IdentityProviders objects
     */
    IIdentityProviderCollectionRequestBuilder identityProviders();

    /**
     * Gets a single IdentityProviders
     *
     * @param id the id of the IdentityProviders to retrieve
     * @return the request builder for the IdentityProviders object
     */
    IIdentityProviderRequestBuilder identityProviders(final String id);

    /**
     * Gets the collection of AdministrativeUnits objects
     *
     * @return the request builder for the collection of AdministrativeUnits objects
     */
    IAdministrativeUnitCollectionRequestBuilder administrativeUnits();

    /**
     * Gets a single AdministrativeUnits
     *
     * @param id the id of the AdministrativeUnits to retrieve
     * @return the request builder for the AdministrativeUnits object
     */
    IAdministrativeUnitRequestBuilder administrativeUnits(final String id);

    /**
     * Gets the collection of AllowedDataLocations objects
     *
     * @return the request builder for the collection of AllowedDataLocations objects
     */
    IAllowedDataLocationCollectionRequestBuilder allowedDataLocations();

    /**
     * Gets a single AllowedDataLocations
     *
     * @param id the id of the AllowedDataLocations to retrieve
     * @return the request builder for the AllowedDataLocations object
     */
    IAllowedDataLocationRequestBuilder allowedDataLocations(final String id);

    /**
     * Gets the collection of Applications objects
     *
     * @return the request builder for the collection of Applications objects
     */
    IApplicationCollectionRequestBuilder applications();

    /**
     * Gets a single Applications
     *
     * @param id the id of the Applications to retrieve
     * @return the request builder for the Applications object
     */
    IApplicationRequestBuilder applications(final String id);

    /**
     * Gets the collection of AppRoleAssignments objects
     *
     * @return the request builder for the collection of AppRoleAssignments objects
     */
    IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments();

    /**
     * Gets a single AppRoleAssignments
     *
     * @param id the id of the AppRoleAssignments to retrieve
     * @return the request builder for the AppRoleAssignments object
     */
    IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id);

    /**
     * Gets the collection of CertificateBasedAuthConfiguration objects
     *
     * @return the request builder for the collection of CertificateBasedAuthConfiguration objects
     */
    ICertificateBasedAuthConfigurationCollectionRequestBuilder certificateBasedAuthConfiguration();

    /**
     * Gets a single CertificateBasedAuthConfiguration
     *
     * @param id the id of the CertificateBasedAuthConfiguration to retrieve
     * @return the request builder for the CertificateBasedAuthConfiguration object
     */
    ICertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration(final String id);

    /**
     * Gets the collection of Contacts objects
     *
     * @return the request builder for the collection of Contacts objects
     */
    IOrgContactCollectionRequestBuilder contacts();

    /**
     * Gets a single Contacts
     *
     * @param id the id of the Contacts to retrieve
     * @return the request builder for the Contacts object
     */
    IOrgContactRequestBuilder contacts(final String id);

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    IContractCollectionRequestBuilder contracts();

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    IContractRequestBuilder contracts(final String id);

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    IDeviceCollectionRequestBuilder devices();

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    IDeviceRequestBuilder devices(final String id);

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    IDirectoryObjectCollectionRequestBuilder directoryObjects();

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    IDirectoryObjectRequestBuilder directoryObjects(final String id);

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    IDirectoryRoleCollectionRequestBuilder directoryRoles();

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    IDirectoryRoleRequestBuilder directoryRoles(final String id);

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    IDirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates();

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    IDirectoryRoleTemplateRequestBuilder directoryRoleTemplates(final String id);

    /**
     * Gets the collection of DirectorySettingTemplates objects
     *
     * @return the request builder for the collection of DirectorySettingTemplates objects
     */
    IDirectorySettingTemplateCollectionRequestBuilder directorySettingTemplates();

    /**
     * Gets a single DirectorySettingTemplates
     *
     * @param id the id of the DirectorySettingTemplates to retrieve
     * @return the request builder for the DirectorySettingTemplates object
     */
    IDirectorySettingTemplateRequestBuilder directorySettingTemplates(final String id);

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    IDomainDnsRecordCollectionRequestBuilder domainDnsRecords();

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    IDomainDnsRecordRequestBuilder domainDnsRecords(final String id);

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    IDomainCollectionRequestBuilder domains();

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    IDomainRequestBuilder domains(final String id);

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    IGroupCollectionRequestBuilder groups();

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    IGroupRequestBuilder groups(final String id);

    /**
     * Gets the collection of Oauth2PermissionGrants objects
     *
     * @return the request builder for the collection of Oauth2PermissionGrants objects
     */
    IOAuth2PermissionGrantCollectionRequestBuilder oauth2PermissionGrants();

    /**
     * Gets a single Oauth2PermissionGrants
     *
     * @param id the id of the Oauth2PermissionGrants to retrieve
     * @return the request builder for the Oauth2PermissionGrants object
     */
    IOAuth2PermissionGrantRequestBuilder oauth2PermissionGrants(final String id);

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    IOrganizationCollectionRequestBuilder organization();

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    IOrganizationRequestBuilder organization(final String id);

    /**
     * Gets the collection of PermissionGrants objects
     *
     * @return the request builder for the collection of PermissionGrants objects
     */
    IResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants();

    /**
     * Gets a single PermissionGrants
     *
     * @param id the id of the PermissionGrants to retrieve
     * @return the request builder for the PermissionGrants object
     */
    IResourceSpecificPermissionGrantRequestBuilder permissionGrants(final String id);

    /**
     * Gets the collection of ScopedRoleMemberships objects
     *
     * @return the request builder for the collection of ScopedRoleMemberships objects
     */
    IScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberships();

    /**
     * Gets a single ScopedRoleMemberships
     *
     * @param id the id of the ScopedRoleMemberships to retrieve
     * @return the request builder for the ScopedRoleMemberships object
     */
    IScopedRoleMembershipRequestBuilder scopedRoleMemberships(final String id);

    /**
     * Gets the collection of Settings objects
     *
     * @return the request builder for the collection of Settings objects
     */
    IDirectorySettingCollectionRequestBuilder settings();

    /**
     * Gets a single Settings
     *
     * @param id the id of the Settings to retrieve
     * @return the request builder for the Settings object
     */
    IDirectorySettingRequestBuilder settings(final String id);

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    ISubscribedSkuCollectionRequestBuilder subscribedSkus();

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    ISubscribedSkuRequestBuilder subscribedSkus(final String id);

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    IDriveItemCollectionRequestBuilder workbooks();

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    IDriveItemRequestBuilder workbooks(final String id);

    /**
     * Gets the collection of Places objects
     *
     * @return the request builder for the collection of Places objects
     */
    IPlaceCollectionRequestBuilder places();

    /**
     * Gets a single Places
     *
     * @param id the id of the Places to retrieve
     * @return the request builder for the Places object
     */
    IPlaceRequestBuilder places(final String id);

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    IDriveCollectionRequestBuilder drives();

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    IDriveRequestBuilder drives(final String id);

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    ISharedDriveItemCollectionRequestBuilder shares();

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    ISharedDriveItemRequestBuilder shares(final String id);

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    ISiteCollectionRequestBuilder sites();

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    ISiteRequestBuilder sites(final String id);

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    ISchemaExtensionCollectionRequestBuilder schemaExtensions();

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    ISchemaExtensionRequestBuilder schemaExtensions(final String id);

    /**
     * Gets the collection of ConnectorGroups objects
     *
     * @return the request builder for the collection of ConnectorGroups objects
     */
    IConnectorGroupCollectionRequestBuilder connectorGroups();

    /**
     * Gets a single ConnectorGroups
     *
     * @param id the id of the ConnectorGroups to retrieve
     * @return the request builder for the ConnectorGroups object
     */
    IConnectorGroupRequestBuilder connectorGroups(final String id);

    /**
     * Gets the collection of Connectors objects
     *
     * @return the request builder for the collection of Connectors objects
     */
    IConnectorCollectionRequestBuilder connectors();

    /**
     * Gets a single Connectors
     *
     * @param id the id of the Connectors to retrieve
     * @return the request builder for the Connectors object
     */
    IConnectorRequestBuilder connectors(final String id);

    /**
     * Gets the collection of OnPremisesPublishingProfiles objects
     *
     * @return the request builder for the collection of OnPremisesPublishingProfiles objects
     */
    IOnPremisesPublishingProfileCollectionRequestBuilder onPremisesPublishingProfiles();

    /**
     * Gets a single OnPremisesPublishingProfiles
     *
     * @param id the id of the OnPremisesPublishingProfiles to retrieve
     * @return the request builder for the OnPremisesPublishingProfiles object
     */
    IOnPremisesPublishingProfileRequestBuilder onPremisesPublishingProfiles(final String id);

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies();

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id);

    /**
     * Gets the collection of FilterOperators objects
     *
     * @return the request builder for the collection of FilterOperators objects
     */
    IFilterOperatorSchemaCollectionRequestBuilder filterOperators();

    /**
     * Gets a single FilterOperators
     *
     * @param id the id of the FilterOperators to retrieve
     * @return the request builder for the FilterOperators object
     */
    IFilterOperatorSchemaRequestBuilder filterOperators(final String id);

    /**
     * Gets the collection of Functions objects
     *
     * @return the request builder for the collection of Functions objects
     */
    IAttributeMappingFunctionSchemaCollectionRequestBuilder functions();

    /**
     * Gets a single Functions
     *
     * @param id the id of the Functions to retrieve
     * @return the request builder for the Functions object
     */
    IAttributeMappingFunctionSchemaRequestBuilder functions(final String id);

    /**
     * Gets the collection of AccessReviewDecisions objects
     *
     * @return the request builder for the collection of AccessReviewDecisions objects
     */
    IAccessReviewDecisionCollectionRequestBuilder accessReviewDecisions();

    /**
     * Gets a single AccessReviewDecisions
     *
     * @param id the id of the AccessReviewDecisions to retrieve
     * @return the request builder for the AccessReviewDecisions object
     */
    IAccessReviewDecisionRequestBuilder accessReviewDecisions(final String id);

    /**
     * Gets the collection of AccessReviews objects
     *
     * @return the request builder for the collection of AccessReviews objects
     */
    IAccessReviewCollectionRequestBuilder accessReviews();

    /**
     * Gets a single AccessReviews
     *
     * @param id the id of the AccessReviews to retrieve
     * @return the request builder for the AccessReviews object
     */
    IAccessReviewRequestBuilder accessReviews(final String id);

    /**
     * Gets the collection of ApprovalWorkflowProviders objects
     *
     * @return the request builder for the collection of ApprovalWorkflowProviders objects
     */
    IApprovalWorkflowProviderCollectionRequestBuilder approvalWorkflowProviders();

    /**
     * Gets a single ApprovalWorkflowProviders
     *
     * @param id the id of the ApprovalWorkflowProviders to retrieve
     * @return the request builder for the ApprovalWorkflowProviders object
     */
    IApprovalWorkflowProviderRequestBuilder approvalWorkflowProviders(final String id);

    /**
     * Gets the collection of BusinessFlowTemplates objects
     *
     * @return the request builder for the collection of BusinessFlowTemplates objects
     */
    IBusinessFlowTemplateCollectionRequestBuilder businessFlowTemplates();

    /**
     * Gets a single BusinessFlowTemplates
     *
     * @param id the id of the BusinessFlowTemplates to retrieve
     * @return the request builder for the BusinessFlowTemplates object
     */
    IBusinessFlowTemplateRequestBuilder businessFlowTemplates(final String id);

    /**
     * Gets the collection of ProgramControls objects
     *
     * @return the request builder for the collection of ProgramControls objects
     */
    IProgramControlCollectionRequestBuilder programControls();

    /**
     * Gets a single ProgramControls
     *
     * @param id the id of the ProgramControls to retrieve
     * @return the request builder for the ProgramControls object
     */
    IProgramControlRequestBuilder programControls(final String id);

    /**
     * Gets the collection of ProgramControlTypes objects
     *
     * @return the request builder for the collection of ProgramControlTypes objects
     */
    IProgramControlTypeCollectionRequestBuilder programControlTypes();

    /**
     * Gets a single ProgramControlTypes
     *
     * @param id the id of the ProgramControlTypes to retrieve
     * @return the request builder for the ProgramControlTypes object
     */
    IProgramControlTypeRequestBuilder programControlTypes(final String id);

    /**
     * Gets the collection of Programs objects
     *
     * @return the request builder for the collection of Programs objects
     */
    IProgramCollectionRequestBuilder programs();

    /**
     * Gets a single Programs
     *
     * @param id the id of the Programs to retrieve
     * @return the request builder for the Programs object
     */
    IProgramRequestBuilder programs(final String id);

    /**
     * Gets the collection of AgreementAcceptances objects
     *
     * @return the request builder for the collection of AgreementAcceptances objects
     */
    IAgreementAcceptanceCollectionRequestBuilder agreementAcceptances();

    /**
     * Gets a single AgreementAcceptances
     *
     * @param id the id of the AgreementAcceptances to retrieve
     * @return the request builder for the AgreementAcceptances object
     */
    IAgreementAcceptanceRequestBuilder agreementAcceptances(final String id);

    /**
     * Gets the collection of Agreements objects
     *
     * @return the request builder for the collection of Agreements objects
     */
    IAgreementCollectionRequestBuilder agreements();

    /**
     * Gets a single Agreements
     *
     * @param id the id of the Agreements to retrieve
     * @return the request builder for the Agreements object
     */
    IAgreementRequestBuilder agreements(final String id);

    /**
     * Gets the collection of RiskDetections objects
     *
     * @return the request builder for the collection of RiskDetections objects
     */
    IRiskDetectionCollectionRequestBuilder riskDetections();

    /**
     * Gets a single RiskDetections
     *
     * @param id the id of the RiskDetections to retrieve
     * @return the request builder for the RiskDetections object
     */
    IRiskDetectionRequestBuilder riskDetections(final String id);

    /**
     * Gets the collection of RiskyUsers objects
     *
     * @return the request builder for the collection of RiskyUsers objects
     */
    IRiskyUserCollectionRequestBuilder riskyUsers();

    /**
     * Gets a single RiskyUsers
     *
     * @param id the id of the RiskyUsers to retrieve
     * @return the request builder for the RiskyUsers object
     */
    IRiskyUserRequestBuilder riskyUsers(final String id);

    /**
     * Gets the collection of GovernanceResources objects
     *
     * @return the request builder for the collection of GovernanceResources objects
     */
    IGovernanceResourceCollectionRequestBuilder governanceResources();

    /**
     * Gets a single GovernanceResources
     *
     * @param id the id of the GovernanceResources to retrieve
     * @return the request builder for the GovernanceResources object
     */
    IGovernanceResourceRequestBuilder governanceResources(final String id);

    /**
     * Gets the collection of GovernanceRoleAssignmentRequests objects
     *
     * @return the request builder for the collection of GovernanceRoleAssignmentRequests objects
     */
    IGovernanceRoleAssignmentRequestCollectionRequestBuilder governanceRoleAssignmentRequests();

    /**
     * Gets a single GovernanceRoleAssignmentRequests
     *
     * @param id the id of the GovernanceRoleAssignmentRequests to retrieve
     * @return the request builder for the GovernanceRoleAssignmentRequests object
     */
    IGovernanceRoleAssignmentRequestRequestBuilder governanceRoleAssignmentRequests(final String id);

    /**
     * Gets the collection of GovernanceRoleAssignments objects
     *
     * @return the request builder for the collection of GovernanceRoleAssignments objects
     */
    IGovernanceRoleAssignmentCollectionRequestBuilder governanceRoleAssignments();

    /**
     * Gets a single GovernanceRoleAssignments
     *
     * @param id the id of the GovernanceRoleAssignments to retrieve
     * @return the request builder for the GovernanceRoleAssignments object
     */
    IGovernanceRoleAssignmentRequestBuilder governanceRoleAssignments(final String id);

    /**
     * Gets the collection of GovernanceRoleDefinitions objects
     *
     * @return the request builder for the collection of GovernanceRoleDefinitions objects
     */
    IGovernanceRoleDefinitionCollectionRequestBuilder governanceRoleDefinitions();

    /**
     * Gets a single GovernanceRoleDefinitions
     *
     * @param id the id of the GovernanceRoleDefinitions to retrieve
     * @return the request builder for the GovernanceRoleDefinitions object
     */
    IGovernanceRoleDefinitionRequestBuilder governanceRoleDefinitions(final String id);

    /**
     * Gets the collection of GovernanceRoleSettings objects
     *
     * @return the request builder for the collection of GovernanceRoleSettings objects
     */
    IGovernanceRoleSettingCollectionRequestBuilder governanceRoleSettings();

    /**
     * Gets a single GovernanceRoleSettings
     *
     * @param id the id of the GovernanceRoleSettings to retrieve
     * @return the request builder for the GovernanceRoleSettings object
     */
    IGovernanceRoleSettingRequestBuilder governanceRoleSettings(final String id);

    /**
     * Gets the collection of GovernanceSubjects objects
     *
     * @return the request builder for the collection of GovernanceSubjects objects
     */
    IGovernanceSubjectCollectionRequestBuilder governanceSubjects();

    /**
     * Gets a single GovernanceSubjects
     *
     * @param id the id of the GovernanceSubjects to retrieve
     * @return the request builder for the GovernanceSubjects object
     */
    IGovernanceSubjectRequestBuilder governanceSubjects(final String id);

    /**
     * Gets the collection of PrivilegedAccess objects
     *
     * @return the request builder for the collection of PrivilegedAccess objects
     */
    IPrivilegedAccessCollectionRequestBuilder privilegedAccess();

    /**
     * Gets a single PrivilegedAccess
     *
     * @param id the id of the PrivilegedAccess to retrieve
     * @return the request builder for the PrivilegedAccess object
     */
    IPrivilegedAccessRequestBuilder privilegedAccess(final String id);

    /**
     * Gets the collection of PrivilegedApproval objects
     *
     * @return the request builder for the collection of PrivilegedApproval objects
     */
    IPrivilegedApprovalCollectionRequestBuilder privilegedApproval();

    /**
     * Gets a single PrivilegedApproval
     *
     * @param id the id of the PrivilegedApproval to retrieve
     * @return the request builder for the PrivilegedApproval object
     */
    IPrivilegedApprovalRequestBuilder privilegedApproval(final String id);

    /**
     * Gets the collection of PrivilegedOperationEvents objects
     *
     * @return the request builder for the collection of PrivilegedOperationEvents objects
     */
    IPrivilegedOperationEventCollectionRequestBuilder privilegedOperationEvents();

    /**
     * Gets a single PrivilegedOperationEvents
     *
     * @param id the id of the PrivilegedOperationEvents to retrieve
     * @return the request builder for the PrivilegedOperationEvents object
     */
    IPrivilegedOperationEventRequestBuilder privilegedOperationEvents(final String id);

    /**
     * Gets the collection of PrivilegedRoleAssignmentRequests objects
     *
     * @return the request builder for the collection of PrivilegedRoleAssignmentRequests objects
     */
    IPrivilegedRoleAssignmentRequestCollectionRequestBuilder privilegedRoleAssignmentRequests();

    /**
     * Gets a single PrivilegedRoleAssignmentRequests
     *
     * @param id the id of the PrivilegedRoleAssignmentRequests to retrieve
     * @return the request builder for the PrivilegedRoleAssignmentRequests object
     */
    IPrivilegedRoleAssignmentRequestRequestBuilder privilegedRoleAssignmentRequests(final String id);

    /**
     * Gets the collection of PrivilegedRoleAssignments objects
     *
     * @return the request builder for the collection of PrivilegedRoleAssignments objects
     */
    IPrivilegedRoleAssignmentCollectionRequestBuilder privilegedRoleAssignments();

    /**
     * Gets a single PrivilegedRoleAssignments
     *
     * @param id the id of the PrivilegedRoleAssignments to retrieve
     * @return the request builder for the PrivilegedRoleAssignments object
     */
    IPrivilegedRoleAssignmentRequestBuilder privilegedRoleAssignments(final String id);

    /**
     * Gets the collection of PrivilegedRoles objects
     *
     * @return the request builder for the collection of PrivilegedRoles objects
     */
    IPrivilegedRoleCollectionRequestBuilder privilegedRoles();

    /**
     * Gets a single PrivilegedRoles
     *
     * @param id the id of the PrivilegedRoles to retrieve
     * @return the request builder for the PrivilegedRoles object
     */
    IPrivilegedRoleRequestBuilder privilegedRoles(final String id);

    /**
     * Gets the collection of PrivilegedSignupStatus objects
     *
     * @return the request builder for the collection of PrivilegedSignupStatus objects
     */
    IPrivilegedSignupStatusCollectionRequestBuilder privilegedSignupStatus();

    /**
     * Gets a single PrivilegedSignupStatus
     *
     * @param id the id of the PrivilegedSignupStatus to retrieve
     * @return the request builder for the PrivilegedSignupStatus object
     */
    IPrivilegedSignupStatusRequestBuilder privilegedSignupStatus(final String id);

    /**
     * Gets the collection of Commands objects
     *
     * @return the request builder for the collection of Commands objects
     */
    ICommandCollectionRequestBuilder commands();

    /**
     * Gets a single Commands
     *
     * @param id the id of the Commands to retrieve
     * @return the request builder for the Commands object
     */
    ICommandRequestBuilder commands(final String id);

    /**
     * Gets the collection of PayloadResponse objects
     *
     * @return the request builder for the collection of PayloadResponse objects
     */
    IPayloadResponseCollectionRequestBuilder payloadResponse();

    /**
     * Gets a single PayloadResponse
     *
     * @param id the id of the PayloadResponse to retrieve
     * @return the request builder for the PayloadResponse object
     */
    IPayloadResponseRequestBuilder payloadResponse(final String id);

    /**
     * Gets the collection of DataPolicyOperations objects
     *
     * @return the request builder for the collection of DataPolicyOperations objects
     */
    IDataPolicyOperationCollectionRequestBuilder dataPolicyOperations();

    /**
     * Gets a single DataPolicyOperations
     *
     * @param id the id of the DataPolicyOperations to retrieve
     * @return the request builder for the DataPolicyOperations object
     */
    IDataPolicyOperationRequestBuilder dataPolicyOperations(final String id);

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    ISubscriptionCollectionRequestBuilder subscriptions();

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    ISubscriptionRequestBuilder subscriptions(final String id);

    /**
     * Gets the collection of Connections objects
     *
     * @return the request builder for the collection of Connections objects
     */
    IExternalConnectionCollectionRequestBuilder connections();

    /**
     * Gets a single Connections
     *
     * @param id the id of the Connections to retrieve
     * @return the request builder for the Connections object
     */
    IExternalConnectionRequestBuilder connections(final String id);

    /**
     * Gets the collection of Chats objects
     *
     * @return the request builder for the collection of Chats objects
     */
    IChatCollectionRequestBuilder chats();

    /**
     * Gets a single Chats
     *
     * @param id the id of the Chats to retrieve
     * @return the request builder for the Chats object
     */
    IChatRequestBuilder chats(final String id);

    /**
     * Gets the collection of Teams objects
     *
     * @return the request builder for the collection of Teams objects
     */
    ITeamCollectionRequestBuilder teams();

    /**
     * Gets a single Teams
     *
     * @param id the id of the Teams to retrieve
     * @return the request builder for the Teams object
     */
    ITeamRequestBuilder teams(final String id);

    /**
     * Gets the collection of TeamsTemplates objects
     *
     * @return the request builder for the collection of TeamsTemplates objects
     */
    ITeamsTemplateCollectionRequestBuilder teamsTemplates();

    /**
     * Gets a single TeamsTemplates
     *
     * @param id the id of the TeamsTemplates to retrieve
     * @return the request builder for the TeamsTemplates object
     */
    ITeamsTemplateRequestBuilder teamsTemplates(final String id);

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AuditLogRoot
     */
    IAuditLogRootRequestBuilder auditLogs();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    IReportRootRequestBuilder reports();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Bitlocker
     */
    IBitlockerRequestBuilder bitlocker();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Compliance
     */
    IComplianceRequestBuilder compliance();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityContainer
     */
    IIdentityContainerRequestBuilder identity();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the TrustFramework
     */
    ITrustFrameworkRequestBuilder trustFramework();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DataClassificationService
     */
    IDataClassificationServiceRequestBuilder dataClassification();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the InformationProtection
     */
    IInformationProtectionRequestBuilder informationProtection();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the OrganizationalBranding
     */
    IOrganizationalBrandingRequestBuilder branding();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Directory
     */
    IDirectoryRequestBuilder directory();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    IUserRequestBuilder me();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the PolicyRoot
     */
    IPolicyRootRequestBuilder policies();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the RoleManagement
     */
    IRoleManagementRequestBuilder roleManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    IEducationRootRequestBuilder education();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    IDriveRequestBuilder drive();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Store
     */
    IStoreRequestBuilder termStore();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CloudCommunications
     */
    ICloudCommunicationsRequestBuilder communications();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityProtectionRoot
     */
    IIdentityProtectionRootRequestBuilder identityProtection();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityGovernance
     */
    IIdentityGovernanceRequestBuilder identityGovernance();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    IDeviceManagementRequestBuilder deviceManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    IDeviceAppManagementRequestBuilder deviceAppManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the OfficeConfiguration
     */
    IOfficeConfigurationRequestBuilder officeConfiguration();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SearchEntity
     */
    ISearchEntityRequestBuilder search();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Financials
     */
    IFinancialsRequestBuilder financials();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    IPlannerRequestBuilder planner();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Print
     */
    IPrintRequestBuilder print();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Security
     */
    ISecurityRequestBuilder Security();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CommsApplication
     */
    ICommsApplicationRequestBuilder app();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the External
     */
    IExternalRequestBuilder external();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AppCatalogs
     */
    IAppCatalogsRequestBuilder appCatalogs();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Teamwork
     */
    ITeamworkRequestBuilder teamwork();

}
