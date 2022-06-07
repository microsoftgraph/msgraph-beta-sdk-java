// Template Source: BaseClient.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.requests.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.DriveItemRequestBuilder;
import com.microsoft.graph.requests.InvitationCollectionRequestBuilder;
import com.microsoft.graph.requests.InvitationRequestBuilder;
import com.microsoft.graph.requests.UserCollectionRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.ActivityStatisticsCollectionRequestBuilder;
import com.microsoft.graph.requests.ActivityStatisticsRequestBuilder;
import com.microsoft.graph.requests.ApplicationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.ApplicationTemplateRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalCollectionRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.AuthenticationMethodConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.AuthenticationMethodConfigurationRequestBuilder;
import com.microsoft.graph.requests.BookingBusinessCollectionRequestBuilder;
import com.microsoft.graph.requests.BookingBusinessRequestBuilder;
import com.microsoft.graph.requests.BookingCurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.BookingCurrencyRequestBuilder;
import com.microsoft.graph.requests.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.AdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.AdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.AllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.AllowedDataLocationRequestBuilder;
import com.microsoft.graph.requests.ApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.ApplicationRequestBuilder;
import com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationRequestBuilder;
import com.microsoft.graph.requests.OrgContactCollectionRequestBuilder;
import com.microsoft.graph.requests.OrgContactRequestBuilder;
import com.microsoft.graph.requests.ContractCollectionRequestBuilder;
import com.microsoft.graph.requests.ContractRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.DirectoryRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryRoleRequestBuilder;
import com.microsoft.graph.requests.DirectoryRoleTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryRoleTemplateRequestBuilder;
import com.microsoft.graph.requests.DirectorySettingTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectorySettingTemplateRequestBuilder;
import com.microsoft.graph.requests.DomainDnsRecordCollectionRequestBuilder;
import com.microsoft.graph.requests.DomainDnsRecordRequestBuilder;
import com.microsoft.graph.requests.DomainCollectionRequestBuilder;
import com.microsoft.graph.requests.DomainRequestBuilder;
import com.microsoft.graph.requests.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupRequestBuilder;
import com.microsoft.graph.requests.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.OrganizationCollectionRequestBuilder;
import com.microsoft.graph.requests.OrganizationRequestBuilder;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.ResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.DirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectorySettingRequestBuilder;
import com.microsoft.graph.requests.SubscribedSkuCollectionRequestBuilder;
import com.microsoft.graph.requests.SubscribedSkuRequestBuilder;
import com.microsoft.graph.requests.PlaceCollectionRequestBuilder;
import com.microsoft.graph.requests.PlaceRequestBuilder;
import com.microsoft.graph.requests.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.DriveRequestBuilder;
import com.microsoft.graph.requests.SharedDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.SharedDriveItemRequestBuilder;
import com.microsoft.graph.requests.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.SiteRequestBuilder;
import com.microsoft.graph.requests.MessageEventCollectionRequestBuilder;
import com.microsoft.graph.requests.MessageEventRequestBuilder;
import com.microsoft.graph.requests.MessageRecipientCollectionRequestBuilder;
import com.microsoft.graph.requests.MessageRecipientRequestBuilder;
import com.microsoft.graph.requests.MessageTraceCollectionRequestBuilder;
import com.microsoft.graph.requests.MessageTraceRequestBuilder;
import com.microsoft.graph.requests.SchemaExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.SchemaExtensionRequestBuilder;
import com.microsoft.graph.requests.OnPremisesPublishingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.OnPremisesPublishingProfileRequestBuilder;
import com.microsoft.graph.requests.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.FilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.FilterOperatorSchemaRequestBuilder;
import com.microsoft.graph.requests.AttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.AttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.AccessReviewDecisionCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewDecisionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewRequestBuilder;
import com.microsoft.graph.requests.ApprovalWorkflowProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.ApprovalWorkflowProviderRequestBuilder;
import com.microsoft.graph.requests.BusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.BusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.ProgramControlCollectionRequestBuilder;
import com.microsoft.graph.requests.ProgramControlRequestBuilder;
import com.microsoft.graph.requests.ProgramControlTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.ProgramControlTypeRequestBuilder;
import com.microsoft.graph.requests.ProgramCollectionRequestBuilder;
import com.microsoft.graph.requests.ProgramRequestBuilder;
import com.microsoft.graph.requests.AgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.AgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.AgreementCollectionRequestBuilder;
import com.microsoft.graph.requests.AgreementRequestBuilder;
import com.microsoft.graph.requests.RiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.RiskDetectionRequestBuilder;
import com.microsoft.graph.requests.RiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.RiskyUserRequestBuilder;
import com.microsoft.graph.requests.MobilityManagementPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.MobilityManagementPolicyRequestBuilder;
import com.microsoft.graph.requests.GovernanceResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.GovernanceSubjectCollectionRequestBuilder;
import com.microsoft.graph.requests.GovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.PrivilegedAccessCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedAccessRequestBuilder;
import com.microsoft.graph.requests.PrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedApprovalRequestBuilder;
import com.microsoft.graph.requests.PrivilegedOperationEventCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedOperationEventRequestBuilder;
import com.microsoft.graph.requests.PrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.PrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.PrivilegedRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.PrivilegedSignupStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedSignupStatusRequestBuilder;
import com.microsoft.graph.requests.CommandCollectionRequestBuilder;
import com.microsoft.graph.requests.CommandRequestBuilder;
import com.microsoft.graph.requests.PayloadResponseCollectionRequestBuilder;
import com.microsoft.graph.requests.PayloadResponseRequestBuilder;
import com.microsoft.graph.requests.DataPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.DataPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.SubscriptionRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ExternalConnectionRequestBuilder;
import com.microsoft.graph.requests.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatRequestBuilder;
import com.microsoft.graph.requests.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamRequestBuilder;
import com.microsoft.graph.requests.TeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamsTemplateRequestBuilder;
import com.microsoft.graph.requests.IdentityGovernanceRequestBuilder;
import com.microsoft.graph.requests.AuditLogRootRequestBuilder;
import com.microsoft.graph.requests.ReportRootRequestBuilder;
import com.microsoft.graph.requests.AuthenticationMethodsPolicyRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementRequestBuilder;
import com.microsoft.graph.requests.RoleManagementRequestBuilder;
import com.microsoft.graph.requests.PrivacyRequestBuilder;
import com.microsoft.graph.requests.SecurityRequestBuilder;
import com.microsoft.graph.requests.ComplianceRequestBuilder;
import com.microsoft.graph.requests.IdentityContainerRequestBuilder;
import com.microsoft.graph.requests.TrustFrameworkRequestBuilder;
import com.microsoft.graph.requests.DataClassificationServiceRequestBuilder;
import com.microsoft.graph.requests.InformationProtectionRequestBuilder;
import com.microsoft.graph.requests.DeviceRegistrationPolicyRequestBuilder;
import com.microsoft.graph.requests.OrganizationalBrandingRequestBuilder;
import com.microsoft.graph.requests.DirectoryRequestBuilder;
import com.microsoft.graph.requests.PolicyRootRequestBuilder;
import com.microsoft.graph.requests.TenantRelationshipRequestBuilder;
import com.microsoft.graph.requests.EducationRootRequestBuilder;
import com.microsoft.graph.termstore.requests.StoreRequestBuilder;
import com.microsoft.graph.requests.CloudCommunicationsRequestBuilder;
import com.microsoft.graph.requests.IdentityProtectionRootRequestBuilder;
import com.microsoft.graph.requests.DeviceAppManagementRequestBuilder;
import com.microsoft.graph.requests.OfficeConfigurationRequestBuilder;
import com.microsoft.graph.requests.SearchEntityRequestBuilder;
import com.microsoft.graph.requests.FinancialsRequestBuilder;
import com.microsoft.graph.requests.PlannerRequestBuilder;
import com.microsoft.graph.requests.PrintRequestBuilder;
import com.microsoft.graph.requests.CommsApplicationRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ExternalRequestBuilder;
import com.microsoft.graph.requests.AppCatalogsRequestBuilder;
import com.microsoft.graph.requests.TeamworkRequestBuilder;
import com.microsoft.graph.requests.StorageRequestBuilder;
import com.microsoft.graph.requests.AdminRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseClient;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.ISerializer;
import okhttp3.OkHttpClient;
import okhttp3.Request;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Graph Service Client.
 * @param <nativeRequestType> type of a request for the native http client
 */
public class GraphServiceClient<nativeRequestType> extends BaseClient<nativeRequestType> implements IBaseClient<nativeRequestType> {
    /**
     * Restricted constructor
     */
    protected GraphServiceClient() {
        setServiceRoot("https://graph.microsoft.com/beta");
    }
    /**
     * Gets the service SDK version if the service SDK is in use, null otherwise
     * @return the service SDK version if the service SDK is in use, null otherwise
     */
    @Override
    @Nullable
    public String getServiceSDKVersion() {
        return com.microsoft.graph.info.Constants.VERSION_NAME;
    }
    /**
     * Gets the builder to start configuring the client
     *
     * @return builder to start configuring the client
     */
    @Nonnull
    public static Builder<OkHttpClient, Request> builder() {
        return builder(OkHttpClient.class, Request.class);
    }

    /**
     * Gets the builder to start configuring the client
     *
     * @param <nativeClient> the type of the native http client
     * @param <nativeRequest> the type of the native http request
     * @param nativeClientClass the class of the native http client
     * @param nativeRequestClass the class of the native http request
     * @return builder to start configuring the client
     */
    @Nonnull
    public static <nativeClient, nativeRequest> Builder<nativeClient, nativeRequest> builder(@Nonnull final Class<nativeClient> nativeClientClass, @Nonnull final Class<nativeRequest> nativeRequestClass) {
        return new Builder<>();
    }
    /**
     * Builder to help configure the Graph service client
     * @param <nativeRequestType> type of a request for the native http client
     */
    public static class Builder<httpClientType, nativeRequestType> extends BaseClient.Builder<httpClientType, nativeRequestType> {
        /**
         * Sets the serializer.
         *
         * @param serializer
         *            the serializer
         * @return the instance of this builder
         */
        @Nonnull
        @Override
        public Builder<httpClientType, nativeRequestType> serializer(@Nonnull final ISerializer serializer) {
            super.serializer(serializer);
            return this;
        }

        /**
         * Sets the httpProvider
         *
         * @param httpProvider
         *            the httpProvider
         * @return the instance of this builder
         */
        @Nonnull
        @Override
        public Builder<httpClientType, nativeRequestType> httpProvider(@Nonnull final IHttpProvider<nativeRequestType> httpProvider) {
            super.httpProvider(httpProvider);
            return this;
        }

        /**
         * Sets the logger
         *
         * @param logger
         *            the logger
         * @return the instance of this builder
         */
        @Nonnull
        @Override
        public Builder<httpClientType, nativeRequestType> logger(@Nonnull final ILogger logger) {
            super.logger(logger);
            return this;
        }

        /**
         * Sets the http client
         *
         * @param client the http client
         *
         * @return the instance of this builder
         */
        @Nonnull
        @Override
        public Builder<httpClientType, nativeRequestType> httpClient(@Nonnull final httpClientType client) {
            super.httpClient(client);
            return this;
        }

        /**
         * Sets the authentication provider
         *
         * @param auth the authentication provider
         * @return the instance of this builder
         */
        @Nonnull
        @Override
        public Builder<httpClientType, nativeRequestType> authenticationProvider(@Nonnull final IAuthenticationProvider auth) {
            super.authenticationProvider(auth);
            return this;
        }

        /**
         * Builds and returns the Graph service client.
         *
         * @return the Graph service client object
         * @throws ClientException
         *             if there was an exception creating the client
         */
        @Nonnull
        @Override
        public GraphServiceClient<nativeRequestType> buildClient() throws ClientException {
            return buildClient(new GraphServiceClient<>());
        }
    }

    /**
     * Gets the collection of Workbooks objects
     *
     * @return the request builder for the collection of Workbooks objects
     */
    @Nonnull
    public DriveItemCollectionRequestBuilder workbooks() {
        return new DriveItemCollectionRequestBuilder(getServiceRoot() + "/workbooks", this, null);
    }

    /**
     * Gets a single Workbooks
     *
     * @param id the id of the Workbooks to retrieve
     * @return the request builder for the Workbooks object
     */
    @Nonnull
    public DriveItemRequestBuilder workbooks(@Nonnull final String id) {
        return new DriveItemRequestBuilder(getServiceRoot() + "/workbooks/" + id, this, null);
    }

    /**
     * Gets the collection of Invitations objects
     *
     * @return the request builder for the collection of Invitations objects
     */
    @Nonnull
    public InvitationCollectionRequestBuilder invitations() {
        return new InvitationCollectionRequestBuilder(getServiceRoot() + "/invitations", this, null);
    }

    /**
     * Gets a single Invitations
     *
     * @param id the id of the Invitations to retrieve
     * @return the request builder for the Invitations object
     */
    @Nonnull
    public InvitationRequestBuilder invitations(@Nonnull final String id) {
        return new InvitationRequestBuilder(getServiceRoot() + "/invitations/" + id, this, null);
    }

    /**
     * Gets the collection of Users objects
     *
     * @return the request builder for the collection of Users objects
     */
    @Nonnull
    public UserCollectionRequestBuilder users() {
        return new UserCollectionRequestBuilder(getServiceRoot() + "/users", this, null);
    }

    /**
     * Gets a single Users
     *
     * @param id the id of the Users to retrieve
     * @return the request builder for the Users object
     */
    @Nonnull
    public UserRequestBuilder users(@Nonnull final String id) {
        return new UserRequestBuilder(getServiceRoot() + "/users/" + id, this, null);
    }

    /**
     * Gets the collection of Activitystatistics objects
     *
     * @return the request builder for the collection of Activitystatistics objects
     */
    @Nonnull
    public ActivityStatisticsCollectionRequestBuilder activitystatistics() {
        return new ActivityStatisticsCollectionRequestBuilder(getServiceRoot() + "/activitystatistics", this, null);
    }

    /**
     * Gets a single Activitystatistics
     *
     * @param id the id of the Activitystatistics to retrieve
     * @return the request builder for the Activitystatistics object
     */
    @Nonnull
    public ActivityStatisticsRequestBuilder activitystatistics(@Nonnull final String id) {
        return new ActivityStatisticsRequestBuilder(getServiceRoot() + "/activitystatistics/" + id, this, null);
    }

    /**
     * Gets the collection of ApplicationTemplates objects
     *
     * @return the request builder for the collection of ApplicationTemplates objects
     */
    @Nonnull
    public ApplicationTemplateCollectionRequestBuilder applicationTemplates() {
        return new ApplicationTemplateCollectionRequestBuilder(getServiceRoot() + "/applicationTemplates", this, null);
    }

    /**
     * Gets a single ApplicationTemplates
     *
     * @param id the id of the ApplicationTemplates to retrieve
     * @return the request builder for the ApplicationTemplates object
     */
    @Nonnull
    public ApplicationTemplateRequestBuilder applicationTemplates(@Nonnull final String id) {
        return new ApplicationTemplateRequestBuilder(getServiceRoot() + "/applicationTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of ServicePrincipals objects
     *
     * @return the request builder for the collection of ServicePrincipals objects
     */
    @Nonnull
    public ServicePrincipalCollectionRequestBuilder servicePrincipals() {
        return new ServicePrincipalCollectionRequestBuilder(getServiceRoot() + "/servicePrincipals", this, null);
    }

    /**
     * Gets a single ServicePrincipals
     *
     * @param id the id of the ServicePrincipals to retrieve
     * @return the request builder for the ServicePrincipals object
     */
    @Nonnull
    public ServicePrincipalRequestBuilder servicePrincipals(@Nonnull final String id) {
        return new ServicePrincipalRequestBuilder(getServiceRoot() + "/servicePrincipals/" + id, this, null);
    }

    /**
     * Gets the collection of AuthenticationMethodConfigurations objects
     *
     * @return the request builder for the collection of AuthenticationMethodConfigurations objects
     */
    @Nonnull
    public AuthenticationMethodConfigurationCollectionRequestBuilder authenticationMethodConfigurations() {
        return new AuthenticationMethodConfigurationCollectionRequestBuilder(getServiceRoot() + "/authenticationMethodConfigurations", this, null);
    }

    /**
     * Gets a single AuthenticationMethodConfigurations
     *
     * @param id the id of the AuthenticationMethodConfigurations to retrieve
     * @return the request builder for the AuthenticationMethodConfigurations object
     */
    @Nonnull
    public AuthenticationMethodConfigurationRequestBuilder authenticationMethodConfigurations(@Nonnull final String id) {
        return new AuthenticationMethodConfigurationRequestBuilder(getServiceRoot() + "/authenticationMethodConfigurations/" + id, this, null);
    }

    /**
     * Gets the collection of BookingBusinesses objects
     *
     * @return the request builder for the collection of BookingBusinesses objects
     */
    @Nonnull
    public BookingBusinessCollectionRequestBuilder bookingBusinesses() {
        return new BookingBusinessCollectionRequestBuilder(getServiceRoot() + "/bookingBusinesses", this, null);
    }

    /**
     * Gets a single BookingBusinesses
     *
     * @param id the id of the BookingBusinesses to retrieve
     * @return the request builder for the BookingBusinesses object
     */
    @Nonnull
    public BookingBusinessRequestBuilder bookingBusinesses(@Nonnull final String id) {
        return new BookingBusinessRequestBuilder(getServiceRoot() + "/bookingBusinesses/" + id, this, null);
    }

    /**
     * Gets the collection of BookingCurrencies objects
     *
     * @return the request builder for the collection of BookingCurrencies objects
     */
    @Nonnull
    public BookingCurrencyCollectionRequestBuilder bookingCurrencies() {
        return new BookingCurrencyCollectionRequestBuilder(getServiceRoot() + "/bookingCurrencies", this, null);
    }

    /**
     * Gets a single BookingCurrencies
     *
     * @param id the id of the BookingCurrencies to retrieve
     * @return the request builder for the BookingCurrencies object
     */
    @Nonnull
    public BookingCurrencyRequestBuilder bookingCurrencies(@Nonnull final String id) {
        return new BookingCurrencyRequestBuilder(getServiceRoot() + "/bookingCurrencies/" + id, this, null);
    }

    /**
     * Gets the collection of Devices objects
     *
     * @return the request builder for the collection of Devices objects
     */
    @Nonnull
    public DeviceCollectionRequestBuilder devices() {
        return new DeviceCollectionRequestBuilder(getServiceRoot() + "/devices", this, null);
    }

    /**
     * Gets a single Devices
     *
     * @param id the id of the Devices to retrieve
     * @return the request builder for the Devices object
     */
    @Nonnull
    public DeviceRequestBuilder devices(@Nonnull final String id) {
        return new DeviceRequestBuilder(getServiceRoot() + "/devices/" + id, this, null);
    }

    /**
     * Gets the collection of IdentityProviders objects
     *
     * @return the request builder for the collection of IdentityProviders objects
     * @deprecated The identityProvider API is deprecated and will stop returning data on March 2023. Please use the new identityProviderBase API.
     */
    @Deprecated
    @Nonnull
    public IdentityProviderCollectionRequestBuilder identityProviders() {
        return new IdentityProviderCollectionRequestBuilder(getServiceRoot() + "/identityProviders", this, null);
    }

    /**
     * Gets a single IdentityProviders
     *
     * @param id the id of the IdentityProviders to retrieve
     * @return the request builder for the IdentityProviders object
     * @deprecated The identityProvider API is deprecated and will stop returning data on March 2023. Please use the new identityProviderBase API.
     */
    @Deprecated
    @Nonnull
    public IdentityProviderRequestBuilder identityProviders(@Nonnull final String id) {
        return new IdentityProviderRequestBuilder(getServiceRoot() + "/identityProviders/" + id, this, null);
    }

    /**
     * Gets the collection of AdministrativeUnits objects
     *
     * @return the request builder for the collection of AdministrativeUnits objects
     */
    @Nonnull
    public AdministrativeUnitCollectionRequestBuilder administrativeUnits() {
        return new AdministrativeUnitCollectionRequestBuilder(getServiceRoot() + "/administrativeUnits", this, null);
    }

    /**
     * Gets a single AdministrativeUnits
     *
     * @param id the id of the AdministrativeUnits to retrieve
     * @return the request builder for the AdministrativeUnits object
     */
    @Nonnull
    public AdministrativeUnitRequestBuilder administrativeUnits(@Nonnull final String id) {
        return new AdministrativeUnitRequestBuilder(getServiceRoot() + "/administrativeUnits/" + id, this, null);
    }

    /**
     * Gets the collection of AllowedDataLocations objects
     *
     * @return the request builder for the collection of AllowedDataLocations objects
     */
    @Nonnull
    public AllowedDataLocationCollectionRequestBuilder allowedDataLocations() {
        return new AllowedDataLocationCollectionRequestBuilder(getServiceRoot() + "/allowedDataLocations", this, null);
    }

    /**
     * Gets a single AllowedDataLocations
     *
     * @param id the id of the AllowedDataLocations to retrieve
     * @return the request builder for the AllowedDataLocations object
     */
    @Nonnull
    public AllowedDataLocationRequestBuilder allowedDataLocations(@Nonnull final String id) {
        return new AllowedDataLocationRequestBuilder(getServiceRoot() + "/allowedDataLocations/" + id, this, null);
    }

    /**
     * Gets the collection of Applications objects
     *
     * @return the request builder for the collection of Applications objects
     */
    @Nonnull
    public ApplicationCollectionRequestBuilder applications() {
        return new ApplicationCollectionRequestBuilder(getServiceRoot() + "/applications", this, null);
    }

    /**
     * Gets a single Applications
     *
     * @param id the id of the Applications to retrieve
     * @return the request builder for the Applications object
     */
    @Nonnull
    public ApplicationRequestBuilder applications(@Nonnull final String id) {
        return new ApplicationRequestBuilder(getServiceRoot() + "/applications/" + id, this, null);
    }

    /**
     * Gets the collection of AppRoleAssignments objects
     *
     * @return the request builder for the collection of AppRoleAssignments objects
     */
    @Nonnull
    public AppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getServiceRoot() + "/appRoleAssignments", this, null);
    }

    /**
     * Gets a single AppRoleAssignments
     *
     * @param id the id of the AppRoleAssignments to retrieve
     * @return the request builder for the AppRoleAssignments object
     */
    @Nonnull
    public AppRoleAssignmentRequestBuilder appRoleAssignments(@Nonnull final String id) {
        return new AppRoleAssignmentRequestBuilder(getServiceRoot() + "/appRoleAssignments/" + id, this, null);
    }

    /**
     * Gets the collection of CertificateBasedAuthConfiguration objects
     *
     * @return the request builder for the collection of CertificateBasedAuthConfiguration objects
     */
    @Nonnull
    public CertificateBasedAuthConfigurationCollectionRequestBuilder certificateBasedAuthConfiguration() {
        return new CertificateBasedAuthConfigurationCollectionRequestBuilder(getServiceRoot() + "/certificateBasedAuthConfiguration", this, null);
    }

    /**
     * Gets a single CertificateBasedAuthConfiguration
     *
     * @param id the id of the CertificateBasedAuthConfiguration to retrieve
     * @return the request builder for the CertificateBasedAuthConfiguration object
     */
    @Nonnull
    public CertificateBasedAuthConfigurationRequestBuilder certificateBasedAuthConfiguration(@Nonnull final String id) {
        return new CertificateBasedAuthConfigurationRequestBuilder(getServiceRoot() + "/certificateBasedAuthConfiguration/" + id, this, null);
    }

    /**
     * Gets the collection of Contacts objects
     *
     * @return the request builder for the collection of Contacts objects
     */
    @Nonnull
    public OrgContactCollectionRequestBuilder contacts() {
        return new OrgContactCollectionRequestBuilder(getServiceRoot() + "/contacts", this, null);
    }

    /**
     * Gets a single Contacts
     *
     * @param id the id of the Contacts to retrieve
     * @return the request builder for the Contacts object
     */
    @Nonnull
    public OrgContactRequestBuilder contacts(@Nonnull final String id) {
        return new OrgContactRequestBuilder(getServiceRoot() + "/contacts/" + id, this, null);
    }

    /**
     * Gets the collection of Contracts objects
     *
     * @return the request builder for the collection of Contracts objects
     */
    @Nonnull
    public ContractCollectionRequestBuilder contracts() {
        return new ContractCollectionRequestBuilder(getServiceRoot() + "/contracts", this, null);
    }

    /**
     * Gets a single Contracts
     *
     * @param id the id of the Contracts to retrieve
     * @return the request builder for the Contracts object
     */
    @Nonnull
    public ContractRequestBuilder contracts(@Nonnull final String id) {
        return new ContractRequestBuilder(getServiceRoot() + "/contracts/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryObjects objects
     *
     * @return the request builder for the collection of DirectoryObjects objects
     */
    @Nonnull
    public DirectoryObjectCollectionRequestBuilder directoryObjects() {
        return new DirectoryObjectCollectionRequestBuilder(getServiceRoot() + "/directoryObjects", this, null);
    }

    /**
     * Gets a single DirectoryObjects
     *
     * @param id the id of the DirectoryObjects to retrieve
     * @return the request builder for the DirectoryObjects object
     */
    @Nonnull
    public DirectoryObjectRequestBuilder directoryObjects(@Nonnull final String id) {
        return new DirectoryObjectRequestBuilder(getServiceRoot() + "/directoryObjects/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryRoles objects
     *
     * @return the request builder for the collection of DirectoryRoles objects
     */
    @Nonnull
    public DirectoryRoleCollectionRequestBuilder directoryRoles() {
        return new DirectoryRoleCollectionRequestBuilder(getServiceRoot() + "/directoryRoles", this, null);
    }

    /**
     * Gets a single DirectoryRoles
     *
     * @param id the id of the DirectoryRoles to retrieve
     * @return the request builder for the DirectoryRoles object
     */
    @Nonnull
    public DirectoryRoleRequestBuilder directoryRoles(@Nonnull final String id) {
        return new DirectoryRoleRequestBuilder(getServiceRoot() + "/directoryRoles/" + id, this, null);
    }

    /**
     * Gets the collection of DirectoryRoleTemplates objects
     *
     * @return the request builder for the collection of DirectoryRoleTemplates objects
     */
    @Nonnull
    public DirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplateCollectionRequestBuilder(getServiceRoot() + "/directoryRoleTemplates", this, null);
    }

    /**
     * Gets a single DirectoryRoleTemplates
     *
     * @param id the id of the DirectoryRoleTemplates to retrieve
     * @return the request builder for the DirectoryRoleTemplates object
     */
    @Nonnull
    public DirectoryRoleTemplateRequestBuilder directoryRoleTemplates(@Nonnull final String id) {
        return new DirectoryRoleTemplateRequestBuilder(getServiceRoot() + "/directoryRoleTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of DirectorySettingTemplates objects
     *
     * @return the request builder for the collection of DirectorySettingTemplates objects
     */
    @Nonnull
    public DirectorySettingTemplateCollectionRequestBuilder directorySettingTemplates() {
        return new DirectorySettingTemplateCollectionRequestBuilder(getServiceRoot() + "/directorySettingTemplates", this, null);
    }

    /**
     * Gets a single DirectorySettingTemplates
     *
     * @param id the id of the DirectorySettingTemplates to retrieve
     * @return the request builder for the DirectorySettingTemplates object
     */
    @Nonnull
    public DirectorySettingTemplateRequestBuilder directorySettingTemplates(@Nonnull final String id) {
        return new DirectorySettingTemplateRequestBuilder(getServiceRoot() + "/directorySettingTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of DomainDnsRecords objects
     *
     * @return the request builder for the collection of DomainDnsRecords objects
     */
    @Nonnull
    public DomainDnsRecordCollectionRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getServiceRoot() + "/domainDnsRecords", this, null);
    }

    /**
     * Gets a single DomainDnsRecords
     *
     * @param id the id of the DomainDnsRecords to retrieve
     * @return the request builder for the DomainDnsRecords object
     */
    @Nonnull
    public DomainDnsRecordRequestBuilder domainDnsRecords(@Nonnull final String id) {
        return new DomainDnsRecordRequestBuilder(getServiceRoot() + "/domainDnsRecords/" + id, this, null);
    }

    /**
     * Gets the collection of Domains objects
     *
     * @return the request builder for the collection of Domains objects
     */
    @Nonnull
    public DomainCollectionRequestBuilder domains() {
        return new DomainCollectionRequestBuilder(getServiceRoot() + "/domains", this, null);
    }

    /**
     * Gets a single Domains
     *
     * @param id the id of the Domains to retrieve
     * @return the request builder for the Domains object
     */
    @Nonnull
    public DomainRequestBuilder domains(@Nonnull final String id) {
        return new DomainRequestBuilder(getServiceRoot() + "/domains/" + id, this, null);
    }

    /**
     * Gets the collection of Groups objects
     *
     * @return the request builder for the collection of Groups objects
     */
    @Nonnull
    public GroupCollectionRequestBuilder groups() {
        return new GroupCollectionRequestBuilder(getServiceRoot() + "/groups", this, null);
    }

    /**
     * Gets a single Groups
     *
     * @param id the id of the Groups to retrieve
     * @return the request builder for the Groups object
     */
    @Nonnull
    public GroupRequestBuilder groups(@Nonnull final String id) {
        return new GroupRequestBuilder(getServiceRoot() + "/groups/" + id, this, null);
    }

    /**
     * Gets the collection of Oauth2PermissionGrants objects
     *
     * @return the request builder for the collection of Oauth2PermissionGrants objects
     */
    @Nonnull
    public OAuth2PermissionGrantCollectionRequestBuilder oauth2PermissionGrants() {
        return new OAuth2PermissionGrantCollectionRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants", this, null);
    }

    /**
     * Gets a single Oauth2PermissionGrants
     *
     * @param id the id of the Oauth2PermissionGrants to retrieve
     * @return the request builder for the Oauth2PermissionGrants object
     */
    @Nonnull
    public OAuth2PermissionGrantRequestBuilder oauth2PermissionGrants(@Nonnull final String id) {
        return new OAuth2PermissionGrantRequestBuilder(getServiceRoot() + "/oauth2PermissionGrants/" + id, this, null);
    }

    /**
     * Gets the collection of Organization objects
     *
     * @return the request builder for the collection of Organization objects
     */
    @Nonnull
    public OrganizationCollectionRequestBuilder organization() {
        return new OrganizationCollectionRequestBuilder(getServiceRoot() + "/organization", this, null);
    }

    /**
     * Gets a single Organization
     *
     * @param id the id of the Organization to retrieve
     * @return the request builder for the Organization object
     */
    @Nonnull
    public OrganizationRequestBuilder organization(@Nonnull final String id) {
        return new OrganizationRequestBuilder(getServiceRoot() + "/organization/" + id, this, null);
    }

    /**
     * Gets the collection of PermissionGrants objects
     *
     * @return the request builder for the collection of PermissionGrants objects
     */
    @Nonnull
    public ResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants() {
        return new ResourceSpecificPermissionGrantCollectionRequestBuilder(getServiceRoot() + "/permissionGrants", this, null);
    }

    /**
     * Gets a single PermissionGrants
     *
     * @param id the id of the PermissionGrants to retrieve
     * @return the request builder for the PermissionGrants object
     */
    @Nonnull
    public ResourceSpecificPermissionGrantRequestBuilder permissionGrants(@Nonnull final String id) {
        return new ResourceSpecificPermissionGrantRequestBuilder(getServiceRoot() + "/permissionGrants/" + id, this, null);
    }

    /**
     * Gets the collection of ScopedRoleMemberships objects
     *
     * @return the request builder for the collection of ScopedRoleMemberships objects
     */
    @Nonnull
    public ScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberships() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getServiceRoot() + "/scopedRoleMemberships", this, null);
    }

    /**
     * Gets a single ScopedRoleMemberships
     *
     * @param id the id of the ScopedRoleMemberships to retrieve
     * @return the request builder for the ScopedRoleMemberships object
     */
    @Nonnull
    public ScopedRoleMembershipRequestBuilder scopedRoleMemberships(@Nonnull final String id) {
        return new ScopedRoleMembershipRequestBuilder(getServiceRoot() + "/scopedRoleMemberships/" + id, this, null);
    }

    /**
     * Gets the collection of Settings objects
     *
     * @return the request builder for the collection of Settings objects
     */
    @Nonnull
    public DirectorySettingCollectionRequestBuilder settings() {
        return new DirectorySettingCollectionRequestBuilder(getServiceRoot() + "/settings", this, null);
    }

    /**
     * Gets a single Settings
     *
     * @param id the id of the Settings to retrieve
     * @return the request builder for the Settings object
     */
    @Nonnull
    public DirectorySettingRequestBuilder settings(@Nonnull final String id) {
        return new DirectorySettingRequestBuilder(getServiceRoot() + "/settings/" + id, this, null);
    }

    /**
     * Gets the collection of SubscribedSkus objects
     *
     * @return the request builder for the collection of SubscribedSkus objects
     */
    @Nonnull
    public SubscribedSkuCollectionRequestBuilder subscribedSkus() {
        return new SubscribedSkuCollectionRequestBuilder(getServiceRoot() + "/subscribedSkus", this, null);
    }

    /**
     * Gets a single SubscribedSkus
     *
     * @param id the id of the SubscribedSkus to retrieve
     * @return the request builder for the SubscribedSkus object
     */
    @Nonnull
    public SubscribedSkuRequestBuilder subscribedSkus(@Nonnull final String id) {
        return new SubscribedSkuRequestBuilder(getServiceRoot() + "/subscribedSkus/" + id, this, null);
    }

    /**
     * Gets the collection of Places objects
     *
     * @return the request builder for the collection of Places objects
     */
    @Nonnull
    public PlaceCollectionRequestBuilder places() {
        return new PlaceCollectionRequestBuilder(getServiceRoot() + "/places", this, null);
    }

    /**
     * Gets a single Places
     *
     * @param id the id of the Places to retrieve
     * @return the request builder for the Places object
     */
    @Nonnull
    public PlaceRequestBuilder places(@Nonnull final String id) {
        return new PlaceRequestBuilder(getServiceRoot() + "/places/" + id, this, null);
    }

    /**
     * Gets the collection of Drives objects
     *
     * @return the request builder for the collection of Drives objects
     */
    @Nonnull
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getServiceRoot() + "/drives", this, null);
    }

    /**
     * Gets a single Drives
     *
     * @param id the id of the Drives to retrieve
     * @return the request builder for the Drives object
     */
    @Nonnull
    public DriveRequestBuilder drives(@Nonnull final String id) {
        return new DriveRequestBuilder(getServiceRoot() + "/drives/" + id, this, null);
    }

    /**
     * Gets the collection of Shares objects
     *
     * @return the request builder for the collection of Shares objects
     */
    @Nonnull
    public SharedDriveItemCollectionRequestBuilder shares() {
        return new SharedDriveItemCollectionRequestBuilder(getServiceRoot() + "/shares", this, null);
    }

    /**
     * Gets a single Shares
     *
     * @param id the id of the Shares to retrieve
     * @return the request builder for the Shares object
     */
    @Nonnull
    public SharedDriveItemRequestBuilder shares(@Nonnull final String id) {
        return new SharedDriveItemRequestBuilder(getServiceRoot() + "/shares/" + id, this, null);
    }

    /**
     * Gets the collection of Sites objects
     *
     * @return the request builder for the collection of Sites objects
     */
    @Nonnull
    public SiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getServiceRoot() + "/sites", this, null);
    }

    /**
     * Gets a single Sites
     *
     * @param id the id of the Sites to retrieve
     * @return the request builder for the Sites object
     */
    @Nonnull
    public SiteRequestBuilder sites(@Nonnull final String id) {
        return new SiteRequestBuilder(getServiceRoot() + "/sites/" + id, this, null);
    }

    /**
     * Gets the collection of MessageEvents objects
     *
     * @return the request builder for the collection of MessageEvents objects
     */
    @Nonnull
    public MessageEventCollectionRequestBuilder messageEvents() {
        return new MessageEventCollectionRequestBuilder(getServiceRoot() + "/messageEvents", this, null);
    }

    /**
     * Gets a single MessageEvents
     *
     * @param id the id of the MessageEvents to retrieve
     * @return the request builder for the MessageEvents object
     */
    @Nonnull
    public MessageEventRequestBuilder messageEvents(@Nonnull final String id) {
        return new MessageEventRequestBuilder(getServiceRoot() + "/messageEvents/" + id, this, null);
    }

    /**
     * Gets the collection of MessageRecipients objects
     *
     * @return the request builder for the collection of MessageRecipients objects
     */
    @Nonnull
    public MessageRecipientCollectionRequestBuilder messageRecipients() {
        return new MessageRecipientCollectionRequestBuilder(getServiceRoot() + "/messageRecipients", this, null);
    }

    /**
     * Gets a single MessageRecipients
     *
     * @param id the id of the MessageRecipients to retrieve
     * @return the request builder for the MessageRecipients object
     */
    @Nonnull
    public MessageRecipientRequestBuilder messageRecipients(@Nonnull final String id) {
        return new MessageRecipientRequestBuilder(getServiceRoot() + "/messageRecipients/" + id, this, null);
    }

    /**
     * Gets the collection of MessageTraces objects
     *
     * @return the request builder for the collection of MessageTraces objects
     */
    @Nonnull
    public MessageTraceCollectionRequestBuilder messageTraces() {
        return new MessageTraceCollectionRequestBuilder(getServiceRoot() + "/messageTraces", this, null);
    }

    /**
     * Gets a single MessageTraces
     *
     * @param id the id of the MessageTraces to retrieve
     * @return the request builder for the MessageTraces object
     */
    @Nonnull
    public MessageTraceRequestBuilder messageTraces(@Nonnull final String id) {
        return new MessageTraceRequestBuilder(getServiceRoot() + "/messageTraces/" + id, this, null);
    }

    /**
     * Gets the collection of SchemaExtensions objects
     *
     * @return the request builder for the collection of SchemaExtensions objects
     */
    @Nonnull
    public SchemaExtensionCollectionRequestBuilder schemaExtensions() {
        return new SchemaExtensionCollectionRequestBuilder(getServiceRoot() + "/schemaExtensions", this, null);
    }

    /**
     * Gets a single SchemaExtensions
     *
     * @param id the id of the SchemaExtensions to retrieve
     * @return the request builder for the SchemaExtensions object
     */
    @Nonnull
    public SchemaExtensionRequestBuilder schemaExtensions(@Nonnull final String id) {
        return new SchemaExtensionRequestBuilder(getServiceRoot() + "/schemaExtensions/" + id, this, null);
    }

    /**
     * Gets the collection of OnPremisesPublishingProfiles objects
     *
     * @return the request builder for the collection of OnPremisesPublishingProfiles objects
     */
    @Nonnull
    public OnPremisesPublishingProfileCollectionRequestBuilder onPremisesPublishingProfiles() {
        return new OnPremisesPublishingProfileCollectionRequestBuilder(getServiceRoot() + "/onPremisesPublishingProfiles", this, null);
    }

    /**
     * Gets a single OnPremisesPublishingProfiles
     *
     * @param id the id of the OnPremisesPublishingProfiles to retrieve
     * @return the request builder for the OnPremisesPublishingProfiles object
     */
    @Nonnull
    public OnPremisesPublishingProfileRequestBuilder onPremisesPublishingProfiles(@Nonnull final String id) {
        return new OnPremisesPublishingProfileRequestBuilder(getServiceRoot() + "/onPremisesPublishingProfiles/" + id, this, null);
    }

    /**
     * Gets the collection of GroupLifecyclePolicies objects
     *
     * @return the request builder for the collection of GroupLifecyclePolicies objects
     */
    @Nonnull
    public GroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePolicyCollectionRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies", this, null);
    }

    /**
     * Gets a single GroupLifecyclePolicies
     *
     * @param id the id of the GroupLifecyclePolicies to retrieve
     * @return the request builder for the GroupLifecyclePolicies object
     */
    @Nonnull
    public GroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(@Nonnull final String id) {
        return new GroupLifecyclePolicyRequestBuilder(getServiceRoot() + "/groupLifecyclePolicies/" + id, this, null);
    }

    /**
     * Gets the collection of FilterOperators objects
     *
     * @return the request builder for the collection of FilterOperators objects
     */
    @Nonnull
    public FilterOperatorSchemaCollectionRequestBuilder filterOperators() {
        return new FilterOperatorSchemaCollectionRequestBuilder(getServiceRoot() + "/filterOperators", this, null);
    }

    /**
     * Gets a single FilterOperators
     *
     * @param id the id of the FilterOperators to retrieve
     * @return the request builder for the FilterOperators object
     */
    @Nonnull
    public FilterOperatorSchemaRequestBuilder filterOperators(@Nonnull final String id) {
        return new FilterOperatorSchemaRequestBuilder(getServiceRoot() + "/filterOperators/" + id, this, null);
    }

    /**
     * Gets the collection of Functions objects
     *
     * @return the request builder for the collection of Functions objects
     */
    @Nonnull
    public AttributeMappingFunctionSchemaCollectionRequestBuilder functions() {
        return new AttributeMappingFunctionSchemaCollectionRequestBuilder(getServiceRoot() + "/functions", this, null);
    }

    /**
     * Gets a single Functions
     *
     * @param id the id of the Functions to retrieve
     * @return the request builder for the Functions object
     */
    @Nonnull
    public AttributeMappingFunctionSchemaRequestBuilder functions(@Nonnull final String id) {
        return new AttributeMappingFunctionSchemaRequestBuilder(getServiceRoot() + "/functions/" + id, this, null);
    }

    /**
     * Gets the collection of AccessReviewDecisions objects
     *
     * @return the request builder for the collection of AccessReviewDecisions objects
     */
    @Nonnull
    public AccessReviewDecisionCollectionRequestBuilder accessReviewDecisions() {
        return new AccessReviewDecisionCollectionRequestBuilder(getServiceRoot() + "/accessReviewDecisions", this, null);
    }

    /**
     * Gets a single AccessReviewDecisions
     *
     * @param id the id of the AccessReviewDecisions to retrieve
     * @return the request builder for the AccessReviewDecisions object
     */
    @Nonnull
    public AccessReviewDecisionRequestBuilder accessReviewDecisions(@Nonnull final String id) {
        return new AccessReviewDecisionRequestBuilder(getServiceRoot() + "/accessReviewDecisions/" + id, this, null);
    }

    /**
     * Gets the collection of AccessReviews objects
     *
     * @return the request builder for the collection of AccessReviews objects
     */
    @Nonnull
    public AccessReviewCollectionRequestBuilder accessReviews() {
        return new AccessReviewCollectionRequestBuilder(getServiceRoot() + "/accessReviews", this, null);
    }

    /**
     * Gets a single AccessReviews
     *
     * @param id the id of the AccessReviews to retrieve
     * @return the request builder for the AccessReviews object
     */
    @Nonnull
    public AccessReviewRequestBuilder accessReviews(@Nonnull final String id) {
        return new AccessReviewRequestBuilder(getServiceRoot() + "/accessReviews/" + id, this, null);
    }

    /**
     * Gets the collection of ApprovalWorkflowProviders objects
     *
     * @return the request builder for the collection of ApprovalWorkflowProviders objects
     */
    @Nonnull
    public ApprovalWorkflowProviderCollectionRequestBuilder approvalWorkflowProviders() {
        return new ApprovalWorkflowProviderCollectionRequestBuilder(getServiceRoot() + "/approvalWorkflowProviders", this, null);
    }

    /**
     * Gets a single ApprovalWorkflowProviders
     *
     * @param id the id of the ApprovalWorkflowProviders to retrieve
     * @return the request builder for the ApprovalWorkflowProviders object
     */
    @Nonnull
    public ApprovalWorkflowProviderRequestBuilder approvalWorkflowProviders(@Nonnull final String id) {
        return new ApprovalWorkflowProviderRequestBuilder(getServiceRoot() + "/approvalWorkflowProviders/" + id, this, null);
    }

    /**
     * Gets the collection of BusinessFlowTemplates objects
     *
     * @return the request builder for the collection of BusinessFlowTemplates objects
     */
    @Nonnull
    public BusinessFlowTemplateCollectionRequestBuilder businessFlowTemplates() {
        return new BusinessFlowTemplateCollectionRequestBuilder(getServiceRoot() + "/businessFlowTemplates", this, null);
    }

    /**
     * Gets a single BusinessFlowTemplates
     *
     * @param id the id of the BusinessFlowTemplates to retrieve
     * @return the request builder for the BusinessFlowTemplates object
     */
    @Nonnull
    public BusinessFlowTemplateRequestBuilder businessFlowTemplates(@Nonnull final String id) {
        return new BusinessFlowTemplateRequestBuilder(getServiceRoot() + "/businessFlowTemplates/" + id, this, null);
    }

    /**
     * Gets the collection of ProgramControls objects
     *
     * @return the request builder for the collection of ProgramControls objects
     */
    @Nonnull
    public ProgramControlCollectionRequestBuilder programControls() {
        return new ProgramControlCollectionRequestBuilder(getServiceRoot() + "/programControls", this, null);
    }

    /**
     * Gets a single ProgramControls
     *
     * @param id the id of the ProgramControls to retrieve
     * @return the request builder for the ProgramControls object
     */
    @Nonnull
    public ProgramControlRequestBuilder programControls(@Nonnull final String id) {
        return new ProgramControlRequestBuilder(getServiceRoot() + "/programControls/" + id, this, null);
    }

    /**
     * Gets the collection of ProgramControlTypes objects
     *
     * @return the request builder for the collection of ProgramControlTypes objects
     */
    @Nonnull
    public ProgramControlTypeCollectionRequestBuilder programControlTypes() {
        return new ProgramControlTypeCollectionRequestBuilder(getServiceRoot() + "/programControlTypes", this, null);
    }

    /**
     * Gets a single ProgramControlTypes
     *
     * @param id the id of the ProgramControlTypes to retrieve
     * @return the request builder for the ProgramControlTypes object
     */
    @Nonnull
    public ProgramControlTypeRequestBuilder programControlTypes(@Nonnull final String id) {
        return new ProgramControlTypeRequestBuilder(getServiceRoot() + "/programControlTypes/" + id, this, null);
    }

    /**
     * Gets the collection of Programs objects
     *
     * @return the request builder for the collection of Programs objects
     */
    @Nonnull
    public ProgramCollectionRequestBuilder programs() {
        return new ProgramCollectionRequestBuilder(getServiceRoot() + "/programs", this, null);
    }

    /**
     * Gets a single Programs
     *
     * @param id the id of the Programs to retrieve
     * @return the request builder for the Programs object
     */
    @Nonnull
    public ProgramRequestBuilder programs(@Nonnull final String id) {
        return new ProgramRequestBuilder(getServiceRoot() + "/programs/" + id, this, null);
    }

    /**
     * Gets the collection of AgreementAcceptances objects
     *
     * @return the request builder for the collection of AgreementAcceptances objects
     */
    @Nonnull
    public AgreementAcceptanceCollectionRequestBuilder agreementAcceptances() {
        return new AgreementAcceptanceCollectionRequestBuilder(getServiceRoot() + "/agreementAcceptances", this, null);
    }

    /**
     * Gets a single AgreementAcceptances
     *
     * @param id the id of the AgreementAcceptances to retrieve
     * @return the request builder for the AgreementAcceptances object
     */
    @Nonnull
    public AgreementAcceptanceRequestBuilder agreementAcceptances(@Nonnull final String id) {
        return new AgreementAcceptanceRequestBuilder(getServiceRoot() + "/agreementAcceptances/" + id, this, null);
    }

    /**
     * Gets the collection of Agreements objects
     *
     * @return the request builder for the collection of Agreements objects
     */
    @Nonnull
    public AgreementCollectionRequestBuilder agreements() {
        return new AgreementCollectionRequestBuilder(getServiceRoot() + "/agreements", this, null);
    }

    /**
     * Gets a single Agreements
     *
     * @param id the id of the Agreements to retrieve
     * @return the request builder for the Agreements object
     */
    @Nonnull
    public AgreementRequestBuilder agreements(@Nonnull final String id) {
        return new AgreementRequestBuilder(getServiceRoot() + "/agreements/" + id, this, null);
    }

    /**
     * Gets the collection of RiskDetections objects
     *
     * @return the request builder for the collection of RiskDetections objects
     */
    @Nonnull
    public RiskDetectionCollectionRequestBuilder riskDetections() {
        return new RiskDetectionCollectionRequestBuilder(getServiceRoot() + "/riskDetections", this, null);
    }

    /**
     * Gets a single RiskDetections
     *
     * @param id the id of the RiskDetections to retrieve
     * @return the request builder for the RiskDetections object
     */
    @Nonnull
    public RiskDetectionRequestBuilder riskDetections(@Nonnull final String id) {
        return new RiskDetectionRequestBuilder(getServiceRoot() + "/riskDetections/" + id, this, null);
    }

    /**
     * Gets the collection of RiskyUsers objects
     *
     * @return the request builder for the collection of RiskyUsers objects
     */
    @Nonnull
    public RiskyUserCollectionRequestBuilder riskyUsers() {
        return new RiskyUserCollectionRequestBuilder(getServiceRoot() + "/riskyUsers", this, null);
    }

    /**
     * Gets a single RiskyUsers
     *
     * @param id the id of the RiskyUsers to retrieve
     * @return the request builder for the RiskyUsers object
     */
    @Nonnull
    public RiskyUserRequestBuilder riskyUsers(@Nonnull final String id) {
        return new RiskyUserRequestBuilder(getServiceRoot() + "/riskyUsers/" + id, this, null);
    }

    /**
     * Gets the collection of MobilityManagementPolicies objects
     *
     * @return the request builder for the collection of MobilityManagementPolicies objects
     */
    @Nonnull
    public MobilityManagementPolicyCollectionRequestBuilder mobilityManagementPolicies() {
        return new MobilityManagementPolicyCollectionRequestBuilder(getServiceRoot() + "/mobilityManagementPolicies", this, null);
    }

    /**
     * Gets a single MobilityManagementPolicies
     *
     * @param id the id of the MobilityManagementPolicies to retrieve
     * @return the request builder for the MobilityManagementPolicies object
     */
    @Nonnull
    public MobilityManagementPolicyRequestBuilder mobilityManagementPolicies(@Nonnull final String id) {
        return new MobilityManagementPolicyRequestBuilder(getServiceRoot() + "/mobilityManagementPolicies/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceResources objects
     *
     * @return the request builder for the collection of GovernanceResources objects
     */
    @Nonnull
    public GovernanceResourceCollectionRequestBuilder governanceResources() {
        return new GovernanceResourceCollectionRequestBuilder(getServiceRoot() + "/governanceResources", this, null);
    }

    /**
     * Gets a single GovernanceResources
     *
     * @param id the id of the GovernanceResources to retrieve
     * @return the request builder for the GovernanceResources object
     */
    @Nonnull
    public GovernanceResourceRequestBuilder governanceResources(@Nonnull final String id) {
        return new GovernanceResourceRequestBuilder(getServiceRoot() + "/governanceResources/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceRoleAssignmentRequests objects
     *
     * @return the request builder for the collection of GovernanceRoleAssignmentRequests objects
     */
    @Nonnull
    public GovernanceRoleAssignmentRequestCollectionRequestBuilder governanceRoleAssignmentRequests() {
        return new GovernanceRoleAssignmentRequestCollectionRequestBuilder(getServiceRoot() + "/governanceRoleAssignmentRequests", this, null);
    }

    /**
     * Gets a single GovernanceRoleAssignmentRequests
     *
     * @param id the id of the GovernanceRoleAssignmentRequests to retrieve
     * @return the request builder for the GovernanceRoleAssignmentRequests object
     */
    @Nonnull
    public GovernanceRoleAssignmentRequestRequestBuilder governanceRoleAssignmentRequests(@Nonnull final String id) {
        return new GovernanceRoleAssignmentRequestRequestBuilder(getServiceRoot() + "/governanceRoleAssignmentRequests/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceRoleAssignments objects
     *
     * @return the request builder for the collection of GovernanceRoleAssignments objects
     */
    @Nonnull
    public GovernanceRoleAssignmentCollectionRequestBuilder governanceRoleAssignments() {
        return new GovernanceRoleAssignmentCollectionRequestBuilder(getServiceRoot() + "/governanceRoleAssignments", this, null);
    }

    /**
     * Gets a single GovernanceRoleAssignments
     *
     * @param id the id of the GovernanceRoleAssignments to retrieve
     * @return the request builder for the GovernanceRoleAssignments object
     */
    @Nonnull
    public GovernanceRoleAssignmentRequestBuilder governanceRoleAssignments(@Nonnull final String id) {
        return new GovernanceRoleAssignmentRequestBuilder(getServiceRoot() + "/governanceRoleAssignments/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceRoleDefinitions objects
     *
     * @return the request builder for the collection of GovernanceRoleDefinitions objects
     */
    @Nonnull
    public GovernanceRoleDefinitionCollectionRequestBuilder governanceRoleDefinitions() {
        return new GovernanceRoleDefinitionCollectionRequestBuilder(getServiceRoot() + "/governanceRoleDefinitions", this, null);
    }

    /**
     * Gets a single GovernanceRoleDefinitions
     *
     * @param id the id of the GovernanceRoleDefinitions to retrieve
     * @return the request builder for the GovernanceRoleDefinitions object
     */
    @Nonnull
    public GovernanceRoleDefinitionRequestBuilder governanceRoleDefinitions(@Nonnull final String id) {
        return new GovernanceRoleDefinitionRequestBuilder(getServiceRoot() + "/governanceRoleDefinitions/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceRoleSettings objects
     *
     * @return the request builder for the collection of GovernanceRoleSettings objects
     */
    @Nonnull
    public GovernanceRoleSettingCollectionRequestBuilder governanceRoleSettings() {
        return new GovernanceRoleSettingCollectionRequestBuilder(getServiceRoot() + "/governanceRoleSettings", this, null);
    }

    /**
     * Gets a single GovernanceRoleSettings
     *
     * @param id the id of the GovernanceRoleSettings to retrieve
     * @return the request builder for the GovernanceRoleSettings object
     */
    @Nonnull
    public GovernanceRoleSettingRequestBuilder governanceRoleSettings(@Nonnull final String id) {
        return new GovernanceRoleSettingRequestBuilder(getServiceRoot() + "/governanceRoleSettings/" + id, this, null);
    }

    /**
     * Gets the collection of GovernanceSubjects objects
     *
     * @return the request builder for the collection of GovernanceSubjects objects
     */
    @Nonnull
    public GovernanceSubjectCollectionRequestBuilder governanceSubjects() {
        return new GovernanceSubjectCollectionRequestBuilder(getServiceRoot() + "/governanceSubjects", this, null);
    }

    /**
     * Gets a single GovernanceSubjects
     *
     * @param id the id of the GovernanceSubjects to retrieve
     * @return the request builder for the GovernanceSubjects object
     */
    @Nonnull
    public GovernanceSubjectRequestBuilder governanceSubjects(@Nonnull final String id) {
        return new GovernanceSubjectRequestBuilder(getServiceRoot() + "/governanceSubjects/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedAccess objects
     *
     * @return the request builder for the collection of PrivilegedAccess objects
     */
    @Nonnull
    public PrivilegedAccessCollectionRequestBuilder privilegedAccess() {
        return new PrivilegedAccessCollectionRequestBuilder(getServiceRoot() + "/privilegedAccess", this, null);
    }

    /**
     * Gets a single PrivilegedAccess
     *
     * @param id the id of the PrivilegedAccess to retrieve
     * @return the request builder for the PrivilegedAccess object
     */
    @Nonnull
    public PrivilegedAccessRequestBuilder privilegedAccess(@Nonnull final String id) {
        return new PrivilegedAccessRequestBuilder(getServiceRoot() + "/privilegedAccess/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedApproval objects
     *
     * @return the request builder for the collection of PrivilegedApproval objects
     */
    @Nonnull
    public PrivilegedApprovalCollectionRequestBuilder privilegedApproval() {
        return new PrivilegedApprovalCollectionRequestBuilder(getServiceRoot() + "/privilegedApproval", this, null);
    }

    /**
     * Gets a single PrivilegedApproval
     *
     * @param id the id of the PrivilegedApproval to retrieve
     * @return the request builder for the PrivilegedApproval object
     */
    @Nonnull
    public PrivilegedApprovalRequestBuilder privilegedApproval(@Nonnull final String id) {
        return new PrivilegedApprovalRequestBuilder(getServiceRoot() + "/privilegedApproval/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedOperationEvents objects
     *
     * @return the request builder for the collection of PrivilegedOperationEvents objects
     */
    @Nonnull
    public PrivilegedOperationEventCollectionRequestBuilder privilegedOperationEvents() {
        return new PrivilegedOperationEventCollectionRequestBuilder(getServiceRoot() + "/privilegedOperationEvents", this, null);
    }

    /**
     * Gets a single PrivilegedOperationEvents
     *
     * @param id the id of the PrivilegedOperationEvents to retrieve
     * @return the request builder for the PrivilegedOperationEvents object
     */
    @Nonnull
    public PrivilegedOperationEventRequestBuilder privilegedOperationEvents(@Nonnull final String id) {
        return new PrivilegedOperationEventRequestBuilder(getServiceRoot() + "/privilegedOperationEvents/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedRoleAssignmentRequests objects
     *
     * @return the request builder for the collection of PrivilegedRoleAssignmentRequests objects
     */
    @Nonnull
    public PrivilegedRoleAssignmentRequestCollectionRequestBuilder privilegedRoleAssignmentRequests() {
        return new PrivilegedRoleAssignmentRequestCollectionRequestBuilder(getServiceRoot() + "/privilegedRoleAssignmentRequests", this, null);
    }

    /**
     * Gets a single PrivilegedRoleAssignmentRequests
     *
     * @param id the id of the PrivilegedRoleAssignmentRequests to retrieve
     * @return the request builder for the PrivilegedRoleAssignmentRequests object
     */
    @Nonnull
    public PrivilegedRoleAssignmentRequestRequestBuilder privilegedRoleAssignmentRequests(@Nonnull final String id) {
        return new PrivilegedRoleAssignmentRequestRequestBuilder(getServiceRoot() + "/privilegedRoleAssignmentRequests/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedRoleAssignments objects
     *
     * @return the request builder for the collection of PrivilegedRoleAssignments objects
     */
    @Nonnull
    public PrivilegedRoleAssignmentCollectionRequestBuilder privilegedRoleAssignments() {
        return new PrivilegedRoleAssignmentCollectionRequestBuilder(getServiceRoot() + "/privilegedRoleAssignments", this, null);
    }

    /**
     * Gets a single PrivilegedRoleAssignments
     *
     * @param id the id of the PrivilegedRoleAssignments to retrieve
     * @return the request builder for the PrivilegedRoleAssignments object
     */
    @Nonnull
    public PrivilegedRoleAssignmentRequestBuilder privilegedRoleAssignments(@Nonnull final String id) {
        return new PrivilegedRoleAssignmentRequestBuilder(getServiceRoot() + "/privilegedRoleAssignments/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedRoles objects
     *
     * @return the request builder for the collection of PrivilegedRoles objects
     */
    @Nonnull
    public PrivilegedRoleCollectionRequestBuilder privilegedRoles() {
        return new PrivilegedRoleCollectionRequestBuilder(getServiceRoot() + "/privilegedRoles", this, null);
    }

    /**
     * Gets a single PrivilegedRoles
     *
     * @param id the id of the PrivilegedRoles to retrieve
     * @return the request builder for the PrivilegedRoles object
     */
    @Nonnull
    public PrivilegedRoleRequestBuilder privilegedRoles(@Nonnull final String id) {
        return new PrivilegedRoleRequestBuilder(getServiceRoot() + "/privilegedRoles/" + id, this, null);
    }

    /**
     * Gets the collection of PrivilegedSignupStatus objects
     *
     * @return the request builder for the collection of PrivilegedSignupStatus objects
     */
    @Nonnull
    public PrivilegedSignupStatusCollectionRequestBuilder privilegedSignupStatus() {
        return new PrivilegedSignupStatusCollectionRequestBuilder(getServiceRoot() + "/privilegedSignupStatus", this, null);
    }

    /**
     * Gets a single PrivilegedSignupStatus
     *
     * @param id the id of the PrivilegedSignupStatus to retrieve
     * @return the request builder for the PrivilegedSignupStatus object
     */
    @Nonnull
    public PrivilegedSignupStatusRequestBuilder privilegedSignupStatus(@Nonnull final String id) {
        return new PrivilegedSignupStatusRequestBuilder(getServiceRoot() + "/privilegedSignupStatus/" + id, this, null);
    }

    /**
     * Gets the collection of Commands objects
     *
     * @return the request builder for the collection of Commands objects
     */
    @Nonnull
    public CommandCollectionRequestBuilder commands() {
        return new CommandCollectionRequestBuilder(getServiceRoot() + "/commands", this, null);
    }

    /**
     * Gets a single Commands
     *
     * @param id the id of the Commands to retrieve
     * @return the request builder for the Commands object
     */
    @Nonnull
    public CommandRequestBuilder commands(@Nonnull final String id) {
        return new CommandRequestBuilder(getServiceRoot() + "/commands/" + id, this, null);
    }

    /**
     * Gets the collection of PayloadResponse objects
     *
     * @return the request builder for the collection of PayloadResponse objects
     */
    @Nonnull
    public PayloadResponseCollectionRequestBuilder payloadResponse() {
        return new PayloadResponseCollectionRequestBuilder(getServiceRoot() + "/payloadResponse", this, null);
    }

    /**
     * Gets a single PayloadResponse
     *
     * @param id the id of the PayloadResponse to retrieve
     * @return the request builder for the PayloadResponse object
     */
    @Nonnull
    public PayloadResponseRequestBuilder payloadResponse(@Nonnull final String id) {
        return new PayloadResponseRequestBuilder(getServiceRoot() + "/payloadResponse/" + id, this, null);
    }

    /**
     * Gets the collection of DataPolicyOperations objects
     *
     * @return the request builder for the collection of DataPolicyOperations objects
     */
    @Nonnull
    public DataPolicyOperationCollectionRequestBuilder dataPolicyOperations() {
        return new DataPolicyOperationCollectionRequestBuilder(getServiceRoot() + "/dataPolicyOperations", this, null);
    }

    /**
     * Gets a single DataPolicyOperations
     *
     * @param id the id of the DataPolicyOperations to retrieve
     * @return the request builder for the DataPolicyOperations object
     */
    @Nonnull
    public DataPolicyOperationRequestBuilder dataPolicyOperations(@Nonnull final String id) {
        return new DataPolicyOperationRequestBuilder(getServiceRoot() + "/dataPolicyOperations/" + id, this, null);
    }

    /**
     * Gets the collection of Subscriptions objects
     *
     * @return the request builder for the collection of Subscriptions objects
     */
    @Nonnull
    public SubscriptionCollectionRequestBuilder subscriptions() {
        return new SubscriptionCollectionRequestBuilder(getServiceRoot() + "/subscriptions", this, null);
    }

    /**
     * Gets a single Subscriptions
     *
     * @param id the id of the Subscriptions to retrieve
     * @return the request builder for the Subscriptions object
     */
    @Nonnull
    public SubscriptionRequestBuilder subscriptions(@Nonnull final String id) {
        return new SubscriptionRequestBuilder(getServiceRoot() + "/subscriptions/" + id, this, null);
    }

    /**
     * Gets the collection of Connections objects
     *
     * @return the request builder for the collection of Connections objects
     */
    @Nonnull
    public ExternalConnectionCollectionRequestBuilder connections() {
        return new ExternalConnectionCollectionRequestBuilder(getServiceRoot() + "/connections", this, null);
    }

    /**
     * Gets a single Connections
     *
     * @param id the id of the Connections to retrieve
     * @return the request builder for the Connections object
     */
    @Nonnull
    public ExternalConnectionRequestBuilder connections(@Nonnull final String id) {
        return new ExternalConnectionRequestBuilder(getServiceRoot() + "/connections/" + id, this, null);
    }

    /**
     * Gets the collection of Chats objects
     *
     * @return the request builder for the collection of Chats objects
     */
    @Nonnull
    public ChatCollectionRequestBuilder chats() {
        return new ChatCollectionRequestBuilder(getServiceRoot() + "/chats", this, null);
    }

    /**
     * Gets a single Chats
     *
     * @param id the id of the Chats to retrieve
     * @return the request builder for the Chats object
     */
    @Nonnull
    public ChatRequestBuilder chats(@Nonnull final String id) {
        return new ChatRequestBuilder(getServiceRoot() + "/chats/" + id, this, null);
    }

    /**
     * Gets the collection of Teams objects
     *
     * @return the request builder for the collection of Teams objects
     */
    @Nonnull
    public TeamCollectionRequestBuilder teams() {
        return new TeamCollectionRequestBuilder(getServiceRoot() + "/teams", this, null);
    }

    /**
     * Gets a single Teams
     *
     * @param id the id of the Teams to retrieve
     * @return the request builder for the Teams object
     */
    @Nonnull
    public TeamRequestBuilder teams(@Nonnull final String id) {
        return new TeamRequestBuilder(getServiceRoot() + "/teams/" + id, this, null);
    }

    /**
     * Gets the collection of TeamsTemplates objects
     *
     * @return the request builder for the collection of TeamsTemplates objects
     */
    @Nonnull
    public TeamsTemplateCollectionRequestBuilder teamsTemplates() {
        return new TeamsTemplateCollectionRequestBuilder(getServiceRoot() + "/teamsTemplates", this, null);
    }

    /**
     * Gets a single TeamsTemplates
     *
     * @param id the id of the TeamsTemplates to retrieve
     * @return the request builder for the TeamsTemplates object
     */
    @Nonnull
    public TeamsTemplateRequestBuilder teamsTemplates(@Nonnull final String id) {
        return new TeamsTemplateRequestBuilder(getServiceRoot() + "/teamsTemplates/" + id, this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityGovernance
     */
    @Nonnull
    public IdentityGovernanceRequestBuilder identityGovernance() {
        return new IdentityGovernanceRequestBuilder(getServiceRoot() + "/identityGovernance", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AuditLogRoot
     */
    @Nonnull
    public AuditLogRootRequestBuilder auditLogs() {
        return new AuditLogRootRequestBuilder(getServiceRoot() + "/auditLogs", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the ReportRoot
     */
    @Nonnull
    public ReportRootRequestBuilder reports() {
        return new ReportRootRequestBuilder(getServiceRoot() + "/reports", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AuthenticationMethodsPolicy
     */
    @Nonnull
    public AuthenticationMethodsPolicyRequestBuilder authenticationMethodsPolicy() {
        return new AuthenticationMethodsPolicyRequestBuilder(getServiceRoot() + "/authenticationMethodsPolicy", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceManagement
     */
    @Nonnull
    public DeviceManagementRequestBuilder deviceManagement() {
        return new DeviceManagementRequestBuilder(getServiceRoot() + "/deviceManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the RoleManagement
     */
    @Nonnull
    public RoleManagementRequestBuilder roleManagement() {
        return new RoleManagementRequestBuilder(getServiceRoot() + "/roleManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Privacy
     */
    @Nonnull
    public PrivacyRequestBuilder privacy() {
        return new PrivacyRequestBuilder(getServiceRoot() + "/privacy", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Security
     */
    @Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(getServiceRoot() + "/security", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Compliance
     */
    @Nonnull
    public ComplianceRequestBuilder compliance() {
        return new ComplianceRequestBuilder(getServiceRoot() + "/compliance", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityContainer
     */
    @Nonnull
    public IdentityContainerRequestBuilder identity() {
        return new IdentityContainerRequestBuilder(getServiceRoot() + "/identity", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the TrustFramework
     */
    @Nonnull
    public TrustFrameworkRequestBuilder trustFramework() {
        return new TrustFrameworkRequestBuilder(getServiceRoot() + "/trustFramework", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DataClassificationService
     */
    @Nonnull
    public DataClassificationServiceRequestBuilder dataClassification() {
        return new DataClassificationServiceRequestBuilder(getServiceRoot() + "/dataClassification", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the InformationProtection
     */
    @Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(getServiceRoot() + "/informationProtection", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceRegistrationPolicy
     */
    @Nonnull
    public DeviceRegistrationPolicyRequestBuilder deviceRegistrationPolicy() {
        return new DeviceRegistrationPolicyRequestBuilder(getServiceRoot() + "/deviceRegistrationPolicy", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the OrganizationalBranding
     */
    @Nonnull
    public OrganizationalBrandingRequestBuilder branding() {
        return new OrganizationalBrandingRequestBuilder(getServiceRoot() + "/branding", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Directory
     */
    @Nonnull
    public DirectoryRequestBuilder directory() {
        return new DirectoryRequestBuilder(getServiceRoot() + "/directory", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the User
     */
    @Nonnull
    public UserRequestBuilder me() {
        return new UserRequestBuilder(getServiceRoot() + "/me", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the PolicyRoot
     */
    @Nonnull
    public PolicyRootRequestBuilder policies() {
        return new PolicyRootRequestBuilder(getServiceRoot() + "/policies", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the TenantRelationship
     */
    @Nonnull
    public TenantRelationshipRequestBuilder tenantRelationships() {
        return new TenantRelationshipRequestBuilder(getServiceRoot() + "/tenantRelationships", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the EducationRoot
     */
    @Nonnull
    public EducationRootRequestBuilder education() {
        return new EducationRootRequestBuilder(getServiceRoot() + "/education", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Drive
     */
    @Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getServiceRoot() + "/drive", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Store
     */
    @Nonnull
    public StoreRequestBuilder termStore() {
        return new StoreRequestBuilder(getServiceRoot() + "/termStore", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CloudCommunications
     */
    @Nonnull
    public CloudCommunicationsRequestBuilder communications() {
        return new CloudCommunicationsRequestBuilder(getServiceRoot() + "/communications", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the IdentityProtectionRoot
     */
    @Nonnull
    public IdentityProtectionRootRequestBuilder identityProtection() {
        return new IdentityProtectionRootRequestBuilder(getServiceRoot() + "/identityProtection", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the DeviceAppManagement
     */
    @Nonnull
    public DeviceAppManagementRequestBuilder deviceAppManagement() {
        return new DeviceAppManagementRequestBuilder(getServiceRoot() + "/deviceAppManagement", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the OfficeConfiguration
     */
    @Nonnull
    public OfficeConfigurationRequestBuilder officeConfiguration() {
        return new OfficeConfigurationRequestBuilder(getServiceRoot() + "/officeConfiguration", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the SearchEntity
     */
    @Nonnull
    public SearchEntityRequestBuilder search() {
        return new SearchEntityRequestBuilder(getServiceRoot() + "/search", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Financials
     */
    @Nonnull
    public FinancialsRequestBuilder financials() {
        return new FinancialsRequestBuilder(getServiceRoot() + "/financials", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Planner
     */
    @Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(getServiceRoot() + "/planner", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Print
     */
    @Nonnull
    public PrintRequestBuilder print() {
        return new PrintRequestBuilder(getServiceRoot() + "/print", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the CommsApplication
     */
    @Nonnull
    public CommsApplicationRequestBuilder app() {
        return new CommsApplicationRequestBuilder(getServiceRoot() + "/app", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the External
     */
    @Nonnull
    public ExternalRequestBuilder external() {
        return new ExternalRequestBuilder(getServiceRoot() + "/external", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the AppCatalogs
     */
    @Nonnull
    public AppCatalogsRequestBuilder appCatalogs() {
        return new AppCatalogsRequestBuilder(getServiceRoot() + "/appCatalogs", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Teamwork
     */
    @Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(getServiceRoot() + "/teamwork", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Storage
     */
    @Nonnull
    public StorageRequestBuilder storage() {
        return new StorageRequestBuilder(getServiceRoot() + "/storage", this, null);
    }

    /**
     * Gets the GraphServiceRequestBuilder
     *
     * @return the Admin
     */
    @Nonnull
    public AdminRequestBuilder admin() {
        return new AdminRequestBuilder(getServiceRoot() + "/admin", this, null);
    }
}
