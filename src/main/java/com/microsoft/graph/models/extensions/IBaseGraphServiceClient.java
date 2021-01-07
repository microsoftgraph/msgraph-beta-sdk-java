// Template Source: IBaseClient.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.requests.extensions.InvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InvitationRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityStatisticsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityStatisticsRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingBusinessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingBusinessRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingCurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingCurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.AllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AllowedDataLocationRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrgContactRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContractRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DomainRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectorySettingRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlaceRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesPublishingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesPublishingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.FilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.FilterOperatorSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalWorkflowProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalWorkflowProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramControlTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProgramRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskyUserRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedOperationEventRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.CommandCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CommandRequestBuilder;
import com.microsoft.graph.requests.extensions.PayloadResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PayloadResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalConnectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditLogRootRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootRequestBuilder;
import com.microsoft.graph.requests.extensions.BitlockerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.TrustFrameworkRequestBuilder;
import com.microsoft.graph.requests.extensions.DataClassificationServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicyRootRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRootRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.StoreRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProtectionRootRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.OfficeConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.SearchEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.FinancialsRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalRequestBuilder;
import com.microsoft.graph.requests.extensions.AppCatalogsRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamworkRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
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
    @Nonnull
    InvitationCollectionRequestBuilder invitations();

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    @Nonnull
    InvitationRequestBuilder invitations(@Nonnull final String id);

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    @Nonnull
    UserCollectionRequestBuilder users();

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    @Nonnull
    UserRequestBuilder users(@Nonnull final String id);

    /**
     * Gets the collection of Activitystatistics objects
     *
     * @return the request builder for the collection of Activitystatistics objects
     */
    @Nonnull
    ActivityStatisticsCollectionRequestBuilder activitystatistics();

    /**
     * Gets a single Activitystatistics
     *
     * @param id the id of the Activitystatistics to retrieve
     * @return the request builder for the Activitystatistics object
     */
    @Nonnull
    ActivityStatisticsRequestBuilder activitystatistics(@Nonnull final String id);

    /**
     * Gets the collection of ApplicationTemplates objects
     *
     * @return the request builder for the collection of ApplicationTemplates objects
     */
    @Nonnull
    ApplicationTemplateCollectionRequestBuilder applicationTemplates();

    /**
     * Gets a single ApplicationTemplates
     *
     * @param id the id of the ApplicationTemplates to retrieve
     * @return the request builder for the ApplicationTemplates object
     */
    @Nonnull
    ApplicationTemplateRequestBuilder applicationTemplates(@Nonnull final String id);

    /**
     * Gets the collection of ServicePrincipals objects
     *
     * @return the request builder for the collection of ServicePrincipals objects
     */
    @Nonnull
    ServicePrincipalCollectionRequestBuilder servicePrincipals();

    /**
     * Gets a single ServicePrincipals
     *
     * @param id the id of the ServicePrincipals to retrieve
     * @return the request builder for the ServicePrincipals object
     */
    @Nonnull
    ServicePrincipalRequestBuilder servicePrincipals(@Nonnull final String id);

    /**
     * Gets the collection of BookingBusinesses objects
     *
     * @return the request builder for the collection of BookingBusinesses objects
     */
    @Nonnull
    BookingBusinessCollectionRequestBuilder bookingBusinesses();

    /**
     * Gets a single BookingBusinesses
     *
     * @param id the id of the BookingBusinesses to retrieve
     * @return the request builder for the BookingBusinesses object
     */
    @Nonnull
    BookingBusinessRequestBuilder bookingBusinesses(@Nonnull final String id);

    /**
     * Gets the collection of BookingCurrencies objects
     *
     * @return the request builder for the collection of BookingCurrencies objects
     */
    @Nonnull
    BookingCurrencyCollectionRequestBuilder bookingCurrencies();

    /**
     * Gets a single BookingCurrencies
     *
     * @param id the id of the BookingCurrencies to retrieve
     * @return the request builder for the BookingCurrencies object
     */
    @Nonnull
    BookingCurrencyRequestBuilder bookingCurrencies(@Nonnull final String id);

    /**
     * Gets the collection of IdentityProviders objects
     *
     * @return the request builder for the collection of IdentityProviders objects
     */
    @Nonnull
    IdentityProviderCollectionRequestBuilder identityProviders();

    /**
     * Gets a single IdentityProviders
     *
     * @param id the id of the IdentityProviders to retrieve
     * @return the request builder for the IdentityProviders object
     */
    @Nonnull
    IdentityProviderRequestBuilder identityProviders(@Nonnull final String id);

    /**
     * Gets the collection of AdministrativeUnits objects
     *
     * @return the request builder for the collection of AdministrativeUnits objects
     */
    @Nonnull
    AdministrativeUnitCollectionRequestBuilder administrativeUnits();

    /**
     * Gets a single AdministrativeUnits
     *
     * @param id the id of the AdministrativeUnits to retrieve
     * @return the request builder for the AdministrativeUnits object
     */
    @Nonnull
    AdministrativeUnitRequestBuilder administrativeUnits(@Nonnull final String id);

    /**
     * Gets the collection of AllowedDataLocations objects
     *
     * @return the request builder for the collection of AllowedDataLocations objects
     */
    @Nonnull
    AllowedDataLocationCollectionRequestBuilder allowedDataLocations();

    /**
     * Gets a single AllowedDataLocations
     *
     * @param id the id of the AllowedDataLocations to retrieve
     * @return the request builder for the AllowedDataLocations object
     */
    @Nonnull
    AllowedDataLocationRequestBuilder allowedDataLocations(@Nonnull final String id);

    /**
     * Gets the collection of Applications objects
     *
     * @return the request builder for the collection of Applications objects
     */
    @Nonnull
    ApplicationCollectionRequestBuilder applications();

    /**
     * Gets a single Applications
     *
     * @param id the id of the Applications to retrieve
     * @return the request builder for the Applications object
     */
    @Nonnull
    ApplicationRequestBuilder applications(@Nonnull final String id);

    /**
     * Gets the collection of AppRoleAssignments objects
     *
     * @return the request builder for the collection of AppRoleAssignments objects
     */
    @Nonnull
    AppRoleAssignmentCollectionRequestBuilder appRoleAssignments();

    /**
     * Gets a single AppRoleAssignments
     *
     * @param id the id of the AppRoleAssignments to retrieve
     * @return the request builder for the AppRoleAssignments object
     */
    @Nonnull
    AppRoleAssignmentRequestBuilder appRoleAssignments(@Nonnull final String id);

    /**
     * Gets the collection of CertificateBasedAuthConfiguration objects
     *
     * @return the request builder for the collection of CertificateBasedAuthConfiguration objects
     */
    @Nonnull
    CertificateBasedAuthConfigurationCollectionRequestBuilder certificateBasedAuthConfiguration();

    /**
     * Gets a single CertificateBasedAuthConfiguration
     *
     * @param id the id of the CertificateBasedAuthConfiguration to retrieve
     * @return the request builder for the CertificateBasedAuthConfiguration object
     */
    @Nonnull
    CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration(@Nonnull final String id);

    /**
     * Gets the collection of Contacts objects
     *
     * @return the request builder for the collection of Contacts objects
     */
    @Nonnull
    OrgContactCollectionRequestBuilder contacts();

    /**
     * Gets a single Contacts
     *
     * @param id the id of the Contacts to retrieve
     * @return the request builder for the Contacts object
     */
    @Nonnull
    OrgContactRequestBuilder contacts(@Nonnull final String id);

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    @Nonnull
    ContractCollectionRequestBuilder contracts();

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    @Nonnull
    ContractRequestBuilder contracts(@Nonnull final String id);

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    @Nonnull
    DeviceCollectionRequestBuilder devices();

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    @Nonnull
    DeviceRequestBuilder devices(@Nonnull final String id);

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    @Nonnull
    DirectoryObjectCollectionRequestBuilder directoryObjects();

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    @Nonnull
    DirectoryObjectRequestBuilder directoryObjects(@Nonnull final String id);

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    @Nonnull
    DirectoryRoleCollectionRequestBuilder directoryRoles();

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    @Nonnull
    DirectoryRoleRequestBuilder directoryRoles(@Nonnull final String id);

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    @Nonnull
    DirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates();

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    @Nonnull
    DirectoryRoleTemplateRequestBuilder directoryRoleTemplates(@Nonnull final String id);

    /**
     * Gets the collection of DirectorySettingTemplates objects
     *
     * @return the request builder for the collection of DirectorySettingTemplates objects
     */
    @Nonnull
    DirectorySettingTemplateCollectionRequestBuilder directorySettingTemplates();

    /**
     * Gets a single DirectorySettingTemplates
     *
     * @param id the id of the DirectorySettingTemplates to retrieve
     * @return the request builder for the DirectorySettingTemplates object
     */
    @Nonnull
    DirectorySettingTemplateRequestBuilder directorySettingTemplates(@Nonnull final String id);

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    @Nonnull
    DomainDnsRecordCollectionRequestBuilder domainDnsRecords();

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    @Nonnull
    DomainDnsRecordRequestBuilder domainDnsRecords(@Nonnull final String id);

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    @Nonnull
    DomainCollectionRequestBuilder domains();

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    @Nonnull
    DomainRequestBuilder domains(@Nonnull final String id);

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    @Nonnull
    GroupCollectionRequestBuilder groups();

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    @Nonnull
    GroupRequestBuilder groups(@Nonnull final String id);

    /**
     * Gets the collection of Oauth2PermissionGrants objects
     *
     * @return the request builder for the collection of Oauth2PermissionGrants objects
     */
    @Nonnull
    OAuth2PermissionGrantCollectionRequestBuilder oauth2PermissionGrants();

    /**
     * Gets a single Oauth2PermissionGrants
     *
     * @param id the id of the Oauth2PermissionGrants to retrieve
     * @return the request builder for the Oauth2PermissionGrants object
     */
    @Nonnull
    OAuth2PermissionGrantRequestBuilder oauth2PermissionGrants(@Nonnull final String id);

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    @Nonnull
    OrganizationCollectionRequestBuilder organization();

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    @Nonnull
    OrganizationRequestBuilder organization(@Nonnull final String id);

    /**
     * Gets the collection of PermissionGrants objects
     *
     * @return the request builder for the collection of PermissionGrants objects
     */
    @Nonnull
    ResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants();

    /**
     * Gets a single PermissionGrants
     *
     * @param id the id of the PermissionGrants to retrieve
     * @return the request builder for the PermissionGrants object
     */
    @Nonnull
    ResourceSpecificPermissionGrantRequestBuilder permissionGrants(@Nonnull final String id);

    /**
     * Gets the collection of ScopedRoleMemberships objects
     *
     * @return the request builder for the collection of ScopedRoleMemberships objects
     */
    @Nonnull
    ScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberships();

    /**
     * Gets a single ScopedRoleMemberships
     *
     * @param id the id of the ScopedRoleMemberships to retrieve
     * @return the request builder for the ScopedRoleMemberships object
     */
    @Nonnull
    ScopedRoleMembershipRequestBuilder scopedRoleMemberships(@Nonnull final String id);

    /**
     * Gets the collection of Settings objects
     *
     * @return the request builder for the collection of Settings objects
     */
    @Nonnull
    DirectorySettingCollectionRequestBuilder settings();

    /**
     * Gets a single Settings
     *
     * @param id the id of the Settings to retrieve
     * @return the request builder for the Settings object
     */
    @Nonnull
    DirectorySettingRequestBuilder settings(@Nonnull final String id);

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    @Nonnull
    SubscribedSkuCollectionRequestBuilder subscribedSkus();

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    @Nonnull
    SubscribedSkuRequestBuilder subscribedSkus(@Nonnull final String id);

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    @Nonnull
    DriveItemCollectionRequestBuilder workbooks();

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    @Nonnull
    DriveItemRequestBuilder workbooks(@Nonnull final String id);

    /**
     * Gets the collection of Places objects
     *
     * @return the request builder for the collection of Places objects
     */
    @Nonnull
    PlaceCollectionRequestBuilder places();

    /**
     * Gets a single Places
     *
     * @param id the id of the Places to retrieve
     * @return the request builder for the Places object
     */
    @Nonnull
    PlaceRequestBuilder places(@Nonnull final String id);

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    @Nonnull
    DriveCollectionRequestBuilder drives();

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    @Nonnull
    DriveRequestBuilder drives(@Nonnull final String id);

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    @Nonnull
    SharedDriveItemCollectionRequestBuilder shares();

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    @Nonnull
    SharedDriveItemRequestBuilder shares(@Nonnull final String id);

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    @Nonnull
    SiteCollectionRequestBuilder sites();

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    @Nonnull
    SiteRequestBuilder sites(@Nonnull final String id);

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    @Nonnull
    SchemaExtensionCollectionRequestBuilder schemaExtensions();

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    @Nonnull
    SchemaExtensionRequestBuilder schemaExtensions(@Nonnull final String id);

    /**
     * Gets the collection of OnPremisesPublishingProfiles objects
     *
     * @return the request builder for the collection of OnPremisesPublishingProfiles objects
     */
    @Nonnull
    OnPremisesPublishingProfileCollectionRequestBuilder onPremisesPublishingProfiles();

    /**
     * Gets a single OnPremisesPublishingProfiles
     *
     * @param id the id of the OnPremisesPublishingProfiles to retrieve
     * @return the request builder for the OnPremisesPublishingProfiles object
     */
    @Nonnull
    OnPremisesPublishingProfileRequestBuilder onPremisesPublishingProfiles(@Nonnull final String id);

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    @Nonnull
    GroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies();

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    @Nonnull
    GroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(@Nonnull final String id);

    /**
     * Gets the collection of FilterOperators objects
     *
     * @return the request builder for the collection of FilterOperators objects
     */
    @Nonnull
    FilterOperatorSchemaCollectionRequestBuilder filterOperators();

    /**
     * Gets a single FilterOperators
     *
     * @param id the id of the FilterOperators to retrieve
     * @return the request builder for the FilterOperators object
     */
    @Nonnull
    FilterOperatorSchemaRequestBuilder filterOperators(@Nonnull final String id);

    /**
     * Gets the collection of Functions objects
     *
     * @return the request builder for the collection of Functions objects
     */
    @Nonnull
    AttributeMappingFunctionSchemaCollectionRequestBuilder functions();

    /**
     * Gets a single Functions
     *
     * @param id the id of the Functions to retrieve
     * @return the request builder for the Functions object
     */
    @Nonnull
    AttributeMappingFunctionSchemaRequestBuilder functions(@Nonnull final String id);

    /**
     * Gets the collection of AccessReviewDecisions objects
     *
     * @return the request builder for the collection of AccessReviewDecisions objects
     */
    @Nonnull
    AccessReviewDecisionCollectionRequestBuilder accessReviewDecisions();

    /**
     * Gets a single AccessReviewDecisions
     *
     * @param id the id of the AccessReviewDecisions to retrieve
     * @return the request builder for the AccessReviewDecisions object
     */
    @Nonnull
    AccessReviewDecisionRequestBuilder accessReviewDecisions(@Nonnull final String id);

    /**
     * Gets the collection of AccessReviews objects
     *
     * @return the request builder for the collection of AccessReviews objects
     */
    @Nonnull
    AccessReviewCollectionRequestBuilder accessReviews();

    /**
     * Gets a single AccessReviews
     *
     * @param id the id of the AccessReviews to retrieve
     * @return the request builder for the AccessReviews object
     */
    @Nonnull
    AccessReviewRequestBuilder accessReviews(@Nonnull final String id);

    /**
     * Gets the collection of ApprovalWorkflowProviders objects
     *
     * @return the request builder for the collection of ApprovalWorkflowProviders objects
     */
    @Nonnull
    ApprovalWorkflowProviderCollectionRequestBuilder approvalWorkflowProviders();

    /**
     * Gets a single ApprovalWorkflowProviders
     *
     * @param id the id of the ApprovalWorkflowProviders to retrieve
     * @return the request builder for the ApprovalWorkflowProviders object
     */
    @Nonnull
    ApprovalWorkflowProviderRequestBuilder approvalWorkflowProviders(@Nonnull final String id);

    /**
     * Gets the collection of BusinessFlowTemplates objects
     *
     * @return the request builder for the collection of BusinessFlowTemplates objects
     */
    @Nonnull
    BusinessFlowTemplateCollectionRequestBuilder businessFlowTemplates();

    /**
     * Gets a single BusinessFlowTemplates
     *
     * @param id the id of the BusinessFlowTemplates to retrieve
     * @return the request builder for the BusinessFlowTemplates object
     */
    @Nonnull
    BusinessFlowTemplateRequestBuilder businessFlowTemplates(@Nonnull final String id);

    /**
     * Gets the collection of ProgramControls objects
     *
     * @return the request builder for the collection of ProgramControls objects
     */
    @Nonnull
    ProgramControlCollectionRequestBuilder programControls();

    /**
     * Gets a single ProgramControls
     *
     * @param id the id of the ProgramControls to retrieve
     * @return the request builder for the ProgramControls object
     */
    @Nonnull
    ProgramControlRequestBuilder programControls(@Nonnull final String id);

    /**
     * Gets the collection of ProgramControlTypes objects
     *
     * @return the request builder for the collection of ProgramControlTypes objects
     */
    @Nonnull
    ProgramControlTypeCollectionRequestBuilder programControlTypes();

    /**
     * Gets a single ProgramControlTypes
     *
     * @param id the id of the ProgramControlTypes to retrieve
     * @return the request builder for the ProgramControlTypes object
     */
    @Nonnull
    ProgramControlTypeRequestBuilder programControlTypes(@Nonnull final String id);

    /**
     * Gets the collection of Programs objects
     *
     * @return the request builder for the collection of Programs objects
     */
    @Nonnull
    ProgramCollectionRequestBuilder programs();

    /**
     * Gets a single Programs
     *
     * @param id the id of the Programs to retrieve
     * @return the request builder for the Programs object
     */
    @Nonnull
    ProgramRequestBuilder programs(@Nonnull final String id);

    /**
     * Gets the collection of AgreementAcceptances objects
     *
     * @return the request builder for the collection of AgreementAcceptances objects
     */
    @Nonnull
    AgreementAcceptanceCollectionRequestBuilder agreementAcceptances();

    /**
     * Gets a single AgreementAcceptances
     *
     * @param id the id of the AgreementAcceptances to retrieve
     * @return the request builder for the AgreementAcceptances object
     */
    @Nonnull
    AgreementAcceptanceRequestBuilder agreementAcceptances(@Nonnull final String id);

    /**
     * Gets the collection of Agreements objects
     *
     * @return the request builder for the collection of Agreements objects
     */
    @Nonnull
    AgreementCollectionRequestBuilder agreements();

    /**
     * Gets a single Agreements
     *
     * @param id the id of the Agreements to retrieve
     * @return the request builder for the Agreements object
     */
    @Nonnull
    AgreementRequestBuilder agreements(@Nonnull final String id);

    /**
     * Gets the collection of RiskDetections objects
     *
     * @return the request builder for the collection of RiskDetections objects
     */
    @Nonnull
    RiskDetectionCollectionRequestBuilder riskDetections();

    /**
     * Gets a single RiskDetections
     *
     * @param id the id of the RiskDetections to retrieve
     * @return the request builder for the RiskDetections object
     */
    @Nonnull
    RiskDetectionRequestBuilder riskDetections(@Nonnull final String id);

    /**
     * Gets the collection of RiskyUsers objects
     *
     * @return the request builder for the collection of RiskyUsers objects
     */
    @Nonnull
    RiskyUserCollectionRequestBuilder riskyUsers();

    /**
     * Gets a single RiskyUsers
     *
     * @param id the id of the RiskyUsers to retrieve
     * @return the request builder for the RiskyUsers object
     */
    @Nonnull
    RiskyUserRequestBuilder riskyUsers(@Nonnull final String id);

    /**
     * Gets the collection of GovernanceResources objects
     *
     * @return the request builder for the collection of GovernanceResources objects
     */
    @Nonnull
    GovernanceResourceCollectionRequestBuilder governanceResources();

    /**
     * Gets a single GovernanceResources
     *
     * @param id the id of the GovernanceResources to retrieve
     * @return the request builder for the GovernanceResources object
     */
    @Nonnull
    GovernanceResourceRequestBuilder governanceResources(@Nonnull final String id);

    /**
     * Gets the collection of GovernanceRoleAssignmentRequests objects
     *
     * @return the request builder for the collection of GovernanceRoleAssignmentRequests objects
     */
    @Nonnull
    GovernanceRoleAssignmentRequestCollectionRequestBuilder governanceRoleAssignmentRequests();

    /**
     * Gets a single GovernanceRoleAssignmentRequests
     *
     * @param id the id of the GovernanceRoleAssignmentRequests to retrieve
     * @return the request builder for the GovernanceRoleAssignmentRequests object
     */
    @Nonnull
    GovernanceRoleAssignmentRequestRequestBuilder governanceRoleAssignmentRequests(@Nonnull final String id);

    /**
     * Gets the collection of GovernanceRoleAssignments objects
     *
     * @return the request builder for the collection of GovernanceRoleAssignments objects
     */
    @Nonnull
    GovernanceRoleAssignmentCollectionRequestBuilder governanceRoleAssignments();

    /**
     * Gets a single GovernanceRoleAssignments
     *
     * @param id the id of the GovernanceRoleAssignments to retrieve
     * @return the request builder for the GovernanceRoleAssignments object
     */
    @Nonnull
    GovernanceRoleAssignmentRequestBuilder governanceRoleAssignments(@Nonnull final String id);

    /**
     * Gets the collection of GovernanceRoleDefinitions objects
     *
     * @return the request builder for the collection of GovernanceRoleDefinitions objects
     */
    @Nonnull
    GovernanceRoleDefinitionCollectionRequestBuilder governanceRoleDefinitions();

    /**
     * Gets a single GovernanceRoleDefinitions
     *
     * @param id the id of the GovernanceRoleDefinitions to retrieve
     * @return the request builder for the GovernanceRoleDefinitions object
     */
    @Nonnull
    GovernanceRoleDefinitionRequestBuilder governanceRoleDefinitions(@Nonnull final String id);

    /**
     * Gets the collection of GovernanceRoleSettings objects
     *
     * @return the request builder for the collection of GovernanceRoleSettings objects
     */
    @Nonnull
    GovernanceRoleSettingCollectionRequestBuilder governanceRoleSettings();

    /**
     * Gets a single GovernanceRoleSettings
     *
     * @param id the id of the GovernanceRoleSettings to retrieve
     * @return the request builder for the GovernanceRoleSettings object
     */
    @Nonnull
    GovernanceRoleSettingRequestBuilder governanceRoleSettings(@Nonnull final String id);

    /**
     * Gets the collection of GovernanceSubjects objects
     *
     * @return the request builder for the collection of GovernanceSubjects objects
     */
    @Nonnull
    GovernanceSubjectCollectionRequestBuilder governanceSubjects();

    /**
     * Gets a single GovernanceSubjects
     *
     * @param id the id of the GovernanceSubjects to retrieve
     * @return the request builder for the GovernanceSubjects object
     */
    @Nonnull
    GovernanceSubjectRequestBuilder governanceSubjects(@Nonnull final String id);

    /**
     * Gets the collection of PrivilegedAccess objects
     *
     * @return the request builder for the collection of PrivilegedAccess objects
     */
    @Nonnull
    PrivilegedAccessCollectionRequestBuilder privilegedAccess();

    /**
     * Gets a single PrivilegedAccess
     *
     * @param id the id of the PrivilegedAccess to retrieve
     * @return the request builder for the PrivilegedAccess object
     */
    @Nonnull
    PrivilegedAccessRequestBuilder privilegedAccess(@Nonnull final String id);

    /**
     * Gets the collection of PrivilegedApproval objects
     *
     * @return the request builder for the collection of PrivilegedApproval objects
     */
    @Nonnull
    PrivilegedApprovalCollectionRequestBuilder privilegedApproval();

    /**
     * Gets a single PrivilegedApproval
     *
     * @param id the id of the PrivilegedApproval to retrieve
     * @return the request builder for the PrivilegedApproval object
     */
    @Nonnull
    PrivilegedApprovalRequestBuilder privilegedApproval(@Nonnull final String id);

    /**
     * Gets the collection of PrivilegedOperationEvents objects
     *
     * @return the request builder for the collection of PrivilegedOperationEvents objects
     */
    @Nonnull
    PrivilegedOperationEventCollectionRequestBuilder privilegedOperationEvents();

    /**
     * Gets a single PrivilegedOperationEvents
     *
     * @param id the id of the PrivilegedOperationEvents to retrieve
     * @return the request builder for the PrivilegedOperationEvents object
     */
    @Nonnull
    PrivilegedOperationEventRequestBuilder privilegedOperationEvents(@Nonnull final String id);

    /**
     * Gets the collection of PrivilegedRoleAssignmentRequests objects
     *
     * @return the request builder for the collection of PrivilegedRoleAssignmentRequests objects
     */
    @Nonnull
    PrivilegedRoleAssignmentRequestCollectionRequestBuilder privilegedRoleAssignmentRequests();

    /**
     * Gets a single PrivilegedRoleAssignmentRequests
     *
     * @param id the id of the PrivilegedRoleAssignmentRequests to retrieve
     * @return the request builder for the PrivilegedRoleAssignmentRequests object
     */
    @Nonnull
    PrivilegedRoleAssignmentRequestRequestBuilder privilegedRoleAssignmentRequests(@Nonnull final String id);

    /**
     * Gets the collection of PrivilegedRoleAssignments objects
     *
     * @return the request builder for the collection of PrivilegedRoleAssignments objects
     */
    @Nonnull
    PrivilegedRoleAssignmentCollectionRequestBuilder privilegedRoleAssignments();

    /**
     * Gets a single PrivilegedRoleAssignments
     *
     * @param id the id of the PrivilegedRoleAssignments to retrieve
     * @return the request builder for the PrivilegedRoleAssignments object
     */
    @Nonnull
    PrivilegedRoleAssignmentRequestBuilder privilegedRoleAssignments(@Nonnull final String id);

    /**
     * Gets the collection of PrivilegedRoles objects
     *
     * @return the request builder for the collection of PrivilegedRoles objects
     */
    @Nonnull
    PrivilegedRoleCollectionRequestBuilder privilegedRoles();

    /**
     * Gets a single PrivilegedRoles
     *
     * @param id the id of the PrivilegedRoles to retrieve
     * @return the request builder for the PrivilegedRoles object
     */
    @Nonnull
    PrivilegedRoleRequestBuilder privilegedRoles(@Nonnull final String id);

    /**
     * Gets the collection of PrivilegedSignupStatus objects
     *
     * @return the request builder for the collection of PrivilegedSignupStatus objects
     */
    @Nonnull
    PrivilegedSignupStatusCollectionRequestBuilder privilegedSignupStatus();

    /**
     * Gets a single PrivilegedSignupStatus
     *
     * @param id the id of the PrivilegedSignupStatus to retrieve
     * @return the request builder for the PrivilegedSignupStatus object
     */
    @Nonnull
    PrivilegedSignupStatusRequestBuilder privilegedSignupStatus(@Nonnull final String id);

    /**
     * Gets the collection of Commands objects
     *
     * @return the request builder for the collection of Commands objects
     */
    @Nonnull
    CommandCollectionRequestBuilder commands();

    /**
     * Gets a single Commands
     *
     * @param id the id of the Commands to retrieve
     * @return the request builder for the Commands object
     */
    @Nonnull
    CommandRequestBuilder commands(@Nonnull final String id);

    /**
     * Gets the collection of PayloadResponse objects
     *
     * @return the request builder for the collection of PayloadResponse objects
     */
    @Nonnull
    PayloadResponseCollectionRequestBuilder payloadResponse();

    /**
     * Gets a single PayloadResponse
     *
     * @param id the id of the PayloadResponse to retrieve
     * @return the request builder for the PayloadResponse object
     */
    @Nonnull
    PayloadResponseRequestBuilder payloadResponse(@Nonnull final String id);

    /**
     * Gets the collection of DataPolicyOperations objects
     *
     * @return the request builder for the collection of DataPolicyOperations objects
     */
    @Nonnull
    DataPolicyOperationCollectionRequestBuilder dataPolicyOperations();

    /**
     * Gets a single DataPolicyOperations
     *
     * @param id the id of the DataPolicyOperations to retrieve
     * @return the request builder for the DataPolicyOperations object
     */
    @Nonnull
    DataPolicyOperationRequestBuilder dataPolicyOperations(@Nonnull final String id);

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    @Nonnull
    SubscriptionCollectionRequestBuilder subscriptions();

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    @Nonnull
    SubscriptionRequestBuilder subscriptions(@Nonnull final String id);

    /**
     * Gets the collection of Connections objects
     *
     * @return the request builder for the collection of Connections objects
     */
    @Nonnull
    ExternalConnectionCollectionRequestBuilder connections();

    /**
     * Gets a single Connections
     *
     * @param id the id of the Connections to retrieve
     * @return the request builder for the Connections object
     */
    @Nonnull
    ExternalConnectionRequestBuilder connections(@Nonnull final String id);

    /**
     * Gets the collection of Chats objects
     *
     * @return the request builder for the collection of Chats objects
     */
    @Nonnull
    ChatCollectionRequestBuilder chats();

    /**
     * Gets a single Chats
     *
     * @param id the id of the Chats to retrieve
     * @return the request builder for the Chats object
     */
    @Nonnull
    ChatRequestBuilder chats(@Nonnull final String id);

    /**
     * Gets the collection of Teams objects
     *
     * @return the request builder for the collection of Teams objects
     */
    @Nonnull
    TeamCollectionRequestBuilder teams();

    /**
     * Gets a single Teams
     *
     * @param id the id of the Teams to retrieve
     * @return the request builder for the Teams object
     */
    @Nonnull
    TeamRequestBuilder teams(@Nonnull final String id);

    /**
     * Gets the collection of TeamsTemplates objects
     *
     * @return the request builder for the collection of TeamsTemplates objects
     */
    @Nonnull
    TeamsTemplateCollectionRequestBuilder teamsTemplates();

    /**
     * Gets a single TeamsTemplates
     *
     * @param id the id of the TeamsTemplates to retrieve
     * @return the request builder for the TeamsTemplates object
     */
    @Nonnull
    TeamsTemplateRequestBuilder teamsTemplates(@Nonnull final String id);

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AuditLogRoot
     */
    @Nonnull
    AuditLogRootRequestBuilder auditLogs();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    @Nonnull
    ReportRootRequestBuilder reports();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Bitlocker
     */
    @Nonnull
    BitlockerRequestBuilder bitlocker();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    @Nonnull
    DeviceManagementRequestBuilder deviceManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Compliance
     */
    @Nonnull
    ComplianceRequestBuilder compliance();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityContainer
     */
    @Nonnull
    IdentityContainerRequestBuilder identity();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the TrustFramework
     */
    @Nonnull
    TrustFrameworkRequestBuilder trustFramework();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DataClassificationService
     */
    @Nonnull
    DataClassificationServiceRequestBuilder dataClassification();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the InformationProtection
     */
    @Nonnull
    InformationProtectionRequestBuilder informationProtection();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the OrganizationalBranding
     */
    @Nonnull
    OrganizationalBrandingRequestBuilder branding();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Directory
     */
    @Nonnull
    DirectoryRequestBuilder directory();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    @Nonnull
    UserRequestBuilder me();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the PolicyRoot
     */
    @Nonnull
    PolicyRootRequestBuilder policies();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the RoleManagement
     */
    @Nonnull
    RoleManagementRequestBuilder roleManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    @Nonnull
    EducationRootRequestBuilder education();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    @Nonnull
    DriveRequestBuilder drive();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Store
     */
    @Nonnull
    StoreRequestBuilder termStore();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CloudCommunications
     */
    @Nonnull
    CloudCommunicationsRequestBuilder communications();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityProtectionRoot
     */
    @Nonnull
    IdentityProtectionRootRequestBuilder identityProtection();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityGovernance
     */
    @Nonnull
    IdentityGovernanceRequestBuilder identityGovernance();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    @Nonnull
    DeviceAppManagementRequestBuilder deviceAppManagement();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the OfficeConfiguration
     */
    @Nonnull
    OfficeConfigurationRequestBuilder officeConfiguration();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SearchEntity
     */
    @Nonnull
    SearchEntityRequestBuilder search();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Financials
     */
    @Nonnull
    FinancialsRequestBuilder financials();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    @Nonnull
    PlannerRequestBuilder planner();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Print
     */
    @Nonnull
    PrintRequestBuilder print();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Security
     */
    @Nonnull
    SecurityRequestBuilder security();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CommsApplication
     */
    @Nonnull
    CommsApplicationRequestBuilder app();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the External
     */
    @Nonnull
    ExternalRequestBuilder external();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AppCatalogs
     */
    @Nonnull
    AppCatalogsRequestBuilder appCatalogs();

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Teamwork
     */
    @Nonnull
    TeamworkRequestBuilder teamwork();

}
