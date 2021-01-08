// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.generated.MailTipsType;
import com.microsoft.graph.models.extensions.MailTips;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.extensions.ConvertIdResult;
import com.microsoft.graph.models.extensions.EmailAddress;
import com.microsoft.graph.models.extensions.Reminder;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementData;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.models.extensions.ManagedDeviceSummarizedAppState;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppConsentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppIntentAndStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppIntentAndStateRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationRequestBuilder;
import com.microsoft.graph.requests.extensions.UserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InferenceClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookUserRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerUserRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemInsightsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.PresenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationRequestBuilder;
import com.microsoft.graph.requests.extensions.UserTeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.UserAssignLicenseParameterSet;
import com.microsoft.graph.models.extensions.UserChangePasswordParameterSet;
import com.microsoft.graph.models.extensions.UserFindMeetingTimesParameterSet;
import com.microsoft.graph.models.extensions.UserGetMailTipsParameterSet;
import com.microsoft.graph.models.extensions.UserSendMailParameterSet;
import com.microsoft.graph.models.extensions.UserTranslateExchangeIdsParameterSet;
import com.microsoft.graph.models.extensions.UserWipeManagedAppRegistrationByDeviceTagParameterSet;
import com.microsoft.graph.models.extensions.UserWipeManagedAppRegistrationsByDeviceTagParameterSet;
import com.microsoft.graph.models.extensions.UserExportPersonalDataParameterSet;
import com.microsoft.graph.models.extensions.UserFindRoomsParameterSet;
import com.microsoft.graph.models.extensions.UserReminderViewParameterSet;
import com.microsoft.graph.models.extensions.UserExportDeviceAndAppManagementDataParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Request Builder.
 */
public class UserRequestBuilder extends BaseRequestBuilder<User> {

    /**
     * The request builder for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserRequest instance
     */
    @Nonnull
    public UserRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the UserRequest instance
     */
    @Nonnull
    public UserRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UserRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for UserAnalytics
     *
     * @return the UserAnalyticsRequestBuilder instance
     */
    @Nonnull
    public UserAnalyticsRequestBuilder analytics() {
        return new UserAnalyticsRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }

    /**
     * Gets the request builder for InformationProtection
     *
     * @return the InformationProtectionRequestBuilder instance
     */
    @Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("informationProtection"), getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AppRoleAssignmentRequestBuilder appRoleAssignments(@Nonnull final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder createdObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder createdObjects(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ServicePrincipalCollectionRequestBuilder createdObjectsAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ServicePrincipalRequestBuilder createdObjectsAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder directReports() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directReports"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder directReports(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserCollectionRequestBuilder directReportsAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserRequestBuilder directReportsAsUser(@Nonnull final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the OrgContact collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OrgContactCollectionRequestBuilder directReportsAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets a request builder for the OrgContact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OrgContactRequestBuilder directReportsAsOrgContact(@Nonnull final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    /**
     *  Gets a request builder for the LicenseDetails collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public LicenseDetailsCollectionRequestBuilder licenseDetails() {
        return new LicenseDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails"), getClient(), null);
    }

    /**
     * Gets a request builder for the LicenseDetails item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public LicenseDetailsRequestBuilder licenseDetails(@Nonnull final String id) {
        return new LicenseDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder manager() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("manager"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder memberOf(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserCollectionRequestBuilder memberOfAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserRequestBuilder memberOfAsUser(@Nonnull final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupCollectionRequestBuilder memberOfAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupRequestBuilder memberOfAsGroup(@Nonnull final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ApplicationCollectionRequestBuilder memberOfAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ApplicationRequestBuilder memberOfAsApplication(@Nonnull final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ServicePrincipalCollectionRequestBuilder memberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ServicePrincipalRequestBuilder memberOfAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCollectionRequestBuilder memberOfAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceRequestBuilder memberOfAsDevice(@Nonnull final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the OrgContact collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OrgContactCollectionRequestBuilder memberOfAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets a request builder for the OrgContact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OrgContactRequestBuilder memberOfAsOrgContact(@Nonnull final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder ownedDevices() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder ownedDevices(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCollectionRequestBuilder ownedDevicesAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceRequestBuilder ownedDevicesAsDevice(@Nonnull final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AppRoleAssignmentCollectionRequestBuilder ownedDevicesAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AppRoleAssignmentRequestBuilder ownedDevicesAsAppRoleAssignment(@Nonnull final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    /**
     *  Gets a request builder for the Endpoint collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EndpointCollectionRequestBuilder ownedDevicesAsEndpoint() {
        return new EndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/microsoft.graph.endpoint", getClient(), null);
    }

    /**
     * Gets a request builder for the Endpoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EndpointRequestBuilder ownedDevicesAsEndpoint(@Nonnull final String id) {
        return new EndpointRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder ownedObjects(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ApplicationCollectionRequestBuilder ownedObjectsAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ApplicationRequestBuilder ownedObjectsAsApplication(@Nonnull final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupCollectionRequestBuilder ownedObjectsAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupRequestBuilder ownedObjectsAsGroup(@Nonnull final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ServicePrincipalCollectionRequestBuilder ownedObjectsAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ServicePrincipalRequestBuilder ownedObjectsAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder registeredDevices() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder registeredDevices(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCollectionRequestBuilder registeredDevicesAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceRequestBuilder registeredDevicesAsDevice(@Nonnull final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the AppRoleAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AppRoleAssignmentCollectionRequestBuilder registeredDevicesAsAppRoleAssignment() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }

    /**
     * Gets a request builder for the AppRoleAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AppRoleAssignmentRequestBuilder registeredDevicesAsAppRoleAssignment(@Nonnull final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.appRoleAssignment", getClient(), null);
    }
    /**
     *  Gets a request builder for the Endpoint collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EndpointCollectionRequestBuilder registeredDevicesAsEndpoint() {
        return new EndpointCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/microsoft.graph.endpoint", getClient(), null);
    }

    /**
     * Gets a request builder for the Endpoint item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EndpointRequestBuilder registeredDevicesAsEndpoint(@Nonnull final String id) {
        return new EndpointRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id + "/microsoft.graph.endpoint", getClient(), null);
    }
    /**
     *  Gets a request builder for the ScopedRoleMembership collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMemberOf"), getClient(), null);
    }

    /**
     * Gets a request builder for the ScopedRoleMembership item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ScopedRoleMembershipRequestBuilder scopedRoleMemberOf(@Nonnull final String id) {
        return new ScopedRoleMembershipRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMemberOf") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserCollectionRequestBuilder transitiveMemberOfAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserRequestBuilder transitiveMemberOfAsUser(@Nonnull final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupCollectionRequestBuilder transitiveMemberOfAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupRequestBuilder transitiveMemberOfAsGroup(@Nonnull final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ApplicationCollectionRequestBuilder transitiveMemberOfAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ApplicationRequestBuilder transitiveMemberOfAsApplication(@Nonnull final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ServicePrincipalCollectionRequestBuilder transitiveMemberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ServicePrincipalRequestBuilder transitiveMemberOfAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCollectionRequestBuilder transitiveMemberOfAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceRequestBuilder transitiveMemberOfAsDevice(@Nonnull final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the OrgContact collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OrgContactCollectionRequestBuilder transitiveMemberOfAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets a request builder for the OrgContact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OrgContactRequestBuilder transitiveMemberOfAsOrgContact(@Nonnull final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets the request builder for Calendar
     *
     * @return the CalendarRequestBuilder instance
     */
    @Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    /**
     *  Gets a request builder for the CalendarGroup collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CalendarGroupCollectionRequestBuilder calendarGroups() {
        return new CalendarGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroups"), getClient(), null);
    }

    /**
     * Gets a request builder for the CalendarGroup item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CalendarGroupRequestBuilder calendarGroups(@Nonnull final String id) {
        return new CalendarGroupRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroups") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Calendar collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CalendarCollectionRequestBuilder calendars() {
        return new CalendarCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendars"), getClient(), null);
    }

    /**
     * Gets a request builder for the Calendar item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CalendarRequestBuilder calendars(@Nonnull final String id) {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendars") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Event collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EventCollectionRequestBuilder calendarView() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView"), getClient(), null);
    }

    /**
     * Gets a request builder for the Event item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EventRequestBuilder calendarView(@Nonnull final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ContactFolder collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ContactFolderCollectionRequestBuilder contactFolders() {
        return new ContactFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolders"), getClient(), null);
    }

    /**
     * Gets a request builder for the ContactFolder item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ContactFolderRequestBuilder contactFolders(@Nonnull final String id) {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolders") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Contact collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ContactCollectionRequestBuilder contacts() {
        return new ContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contacts"), getClient(), null);
    }

    /**
     * Gets a request builder for the Contact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ContactRequestBuilder contacts(@Nonnull final String id) {
        return new ContactRequestBuilder(getRequestUrlWithAdditionalSegment("contacts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Event collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EventCollectionRequestBuilder events() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    /**
     * Gets a request builder for the Event item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EventRequestBuilder events(@Nonnull final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for InferenceClassification
     *
     * @return the InferenceClassificationRequestBuilder instance
     */
    @Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(getRequestUrlWithAdditionalSegment("inferenceClassification"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupCollectionRequestBuilder joinedGroups() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("joinedGroups"), getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupRequestBuilder joinedGroups(@Nonnull final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("joinedGroups") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MailFolder collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MailFolderCollectionRequestBuilder mailFolders() {
        return new MailFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolders"), getClient(), null);
    }

    /**
     * Gets a request builder for the MailFolder item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MailFolderRequestBuilder mailFolders(@Nonnull final String id) {
        return new MailFolderRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolders") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Message collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MessageCollectionRequestBuilder messages() {
        return new MessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    /**
     * Gets a request builder for the Message item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MessageRequestBuilder messages(@Nonnull final String id) {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for OutlookUser
     *
     * @return the OutlookUserRequestBuilder instance
     */
    @Nonnull
    public OutlookUserRequestBuilder outlook() {
        return new OutlookUserRequestBuilder(getRequestUrlWithAdditionalSegment("outlook"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Person collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PersonCollectionRequestBuilder people() {
        return new PersonCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("people"), getClient(), null);
    }

    /**
     * Gets a request builder for the Person item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PersonRequestBuilder people(@Nonnull final String id) {
        return new PersonRequestBuilder(getRequestUrlWithAdditionalSegment("people") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the ProfilePhotoRequestBuilder instance
     */
    @Nonnull
    public ProfilePhotoRequestBuilder photo() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ProfilePhoto collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ProfilePhotoCollectionRequestBuilder photos() {
        return new ProfilePhotoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("photos"), getClient(), null);
    }

    /**
     * Gets a request builder for the ProfilePhoto item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ProfilePhotoRequestBuilder photos(@Nonnull final String id) {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photos") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the DriveRequestBuilder instance
     */
    @Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Drive collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    /**
     * Gets a request builder for the Drive item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DriveRequestBuilder drives(@Nonnull final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Site collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SiteCollectionWithReferencesRequestBuilder followedSites() {
        return new SiteCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("followedSites"), getClient(), null);
    }

    /**
     * Gets a request builder for the Site item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SiteWithReferenceRequestBuilder followedSites(@Nonnull final String id) {
        return new SiteWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("followedSites") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Extension collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Extension item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ExtensionRequestBuilder extensions(@Nonnull final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AppConsentRequest collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AppConsentRequestCollectionRequestBuilder appConsentRequestsForApproval() {
        return new AppConsentRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appConsentRequestsForApproval"), getClient(), null);
    }

    /**
     * Gets a request builder for the AppConsentRequest item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AppConsentRequestRequestBuilder appConsentRequestsForApproval(@Nonnull final String id) {
        return new AppConsentRequestRequestBuilder(getRequestUrlWithAdditionalSegment("appConsentRequestsForApproval") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Approval collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ApprovalCollectionRequestBuilder approvals() {
        return new ApprovalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("approvals"), getClient(), null);
    }

    /**
     * Gets a request builder for the Approval item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ApprovalRequestBuilder approvals(@Nonnull final String id) {
        return new ApprovalRequestBuilder(getRequestUrlWithAdditionalSegment("approvals") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AccessReviewInstance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccessReviewInstanceCollectionRequestBuilder pendingAccessReviewInstances() {
        return new AccessReviewInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pendingAccessReviewInstances"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewInstance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccessReviewInstanceRequestBuilder pendingAccessReviewInstances(@Nonnull final String id) {
        return new AccessReviewInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("pendingAccessReviewInstances") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AgreementAcceptance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AgreementAcceptanceCollectionWithReferencesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptanceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("agreementAcceptances"), getClient(), null);
    }

    /**
     * Gets a request builder for the AgreementAcceptance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AgreementAcceptanceWithReferenceRequestBuilder agreementAcceptances(@Nonnull final String id) {
        return new AgreementAcceptanceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("agreementAcceptances") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceEnrollmentConfiguration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceEnrollmentConfiguration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(@Nonnull final String id) {
        return new DeviceEnrollmentConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDevice collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedDeviceCollectionRequestBuilder managedDevices() {
        return new ManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDevice item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedDeviceRequestBuilder managedDevices(@Nonnull final String id) {
        return new ManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppRegistration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedAppRegistrationCollectionWithReferencesRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppRegistration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedAppRegistrationWithReferenceRequestBuilder managedAppRegistrations(@Nonnull final String id) {
        return new ManagedAppRegistrationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionDeviceRegistration collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder windowsInformationProtectionDeviceRegistrations() {
        return new WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionDeviceRegistrations"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionDeviceRegistration item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder windowsInformationProtectionDeviceRegistrations(@Nonnull final String id) {
        return new WindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionDeviceRegistrations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementTroubleshootingEvent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementTroubleshootingEventCollectionRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementTroubleshootingEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementTroubleshootingEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementTroubleshootingEventRequestBuilder deviceManagementTroubleshootingEvents(@Nonnull final String id) {
        return new DeviceManagementTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementTroubleshootingEvents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppIntentAndState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppIntentAndStateCollectionRequestBuilder mobileAppIntentAndStates() {
        return new MobileAppIntentAndStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppIntentAndStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppIntentAndState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppIntentAndStateRequestBuilder mobileAppIntentAndStates(@Nonnull final String id) {
        return new MobileAppIntentAndStateRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppIntentAndStates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppTroubleshootingEvent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppTroubleshootingEventCollectionRequestBuilder mobileAppTroubleshootingEvents() {
        return new MobileAppTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppTroubleshootingEvents"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppTroubleshootingEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppTroubleshootingEventRequestBuilder mobileAppTroubleshootingEvents(@Nonnull final String id) {
        return new MobileAppTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppTroubleshootingEvents") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Notification collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public NotificationCollectionRequestBuilder notifications() {
        return new NotificationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notifications"), getClient(), null);
    }

    /**
     * Gets a request builder for the Notification item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public NotificationRequestBuilder notifications(@Nonnull final String id) {
        return new NotificationRequestBuilder(getRequestUrlWithAdditionalSegment("notifications") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PlannerUser
     *
     * @return the PlannerUserRequestBuilder instance
     */
    @Nonnull
    public PlannerUserRequestBuilder planner() {
        return new PlannerUserRequestBuilder(getRequestUrlWithAdditionalSegment("planner"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemInsights
     *
     * @return the ItemInsightsRequestBuilder instance
     */
    @Nonnull
    public ItemInsightsRequestBuilder insights() {
        return new ItemInsightsRequestBuilder(getRequestUrlWithAdditionalSegment("insights"), getClient(), null);
    }

    /**
     * Gets the request builder for UserSettings
     *
     * @return the UserSettingsRequestBuilder instance
     */
    @Nonnull
    public UserSettingsRequestBuilder settings() {
        return new UserSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the OnenoteRequestBuilder instance
     */
    @Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    /**
     * Gets the request builder for Profile
     *
     * @return the ProfileRequestBuilder instance
     */
    @Nonnull
    public ProfileRequestBuilder profile() {
        return new ProfileRequestBuilder(getRequestUrlWithAdditionalSegment("profile"), getClient(), null);
    }
    /**
     *  Gets a request builder for the UserActivity collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserActivityCollectionRequestBuilder activities() {
        return new UserActivityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("activities"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserActivity item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserActivityRequestBuilder activities(@Nonnull final String id) {
        return new UserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("activities") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCollectionRequestBuilder devices() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("devices"), getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceRequestBuilder devices(@Nonnull final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("devices") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OnlineMeeting collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OnlineMeetingCollectionRequestBuilder onlineMeetings() {
        return new OnlineMeetingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings"), getClient(), null);
    }

    /**
     * Gets a request builder for the OnlineMeeting item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OnlineMeetingRequestBuilder onlineMeetings(@Nonnull final String id) {
        return new OnlineMeetingRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Presence
     *
     * @return the PresenceRequestBuilder instance
     */
    @Nonnull
    public PresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(getRequestUrlWithAdditionalSegment("presence"), getClient(), null);
    }

    /**
     * Gets the request builder for Authentication
     *
     * @return the AuthenticationRequestBuilder instance
     */
    @Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(getRequestUrlWithAdditionalSegment("authentication"), getClient(), null);
    }
    /**
     *  Gets a request builder for the Chat collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ChatCollectionRequestBuilder chats() {
        return new ChatCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("chats"), getClient(), null);
    }

    /**
     * Gets a request builder for the Chat item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ChatRequestBuilder chats(@Nonnull final String id) {
        return new ChatRequestBuilder(getRequestUrlWithAdditionalSegment("chats") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Team collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TeamCollectionWithReferencesRequestBuilder joinedTeams() {
        return new TeamCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("joinedTeams"), getClient(), null);
    }

    /**
     * Gets a request builder for the Team item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TeamWithReferenceRequestBuilder joinedTeams(@Nonnull final String id) {
        return new TeamWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("joinedTeams") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for UserTeamwork
     *
     * @return the UserTeamworkRequestBuilder instance
     */
    @Nonnull
    public UserTeamworkRequestBuilder teamwork() {
        return new UserTeamworkRequestBuilder(getRequestUrlWithAdditionalSegment("teamwork"), getClient(), null);
    }

    /**
     * Gets the request builder for Todo
     *
     * @return the TodoRequestBuilder instance
     */
    @Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(getRequestUrlWithAdditionalSegment("todo"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserAssignLicenseRequestBuilder assignLicense(@Nonnull final UserAssignLicenseParameterSet parameters) {
        return new UserAssignLicenseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignLicense"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserChangePasswordRequestBuilder changePassword(@Nonnull final UserChangePasswordParameterSet parameters) {
        return new UserChangePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.changePassword"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UserInvalidateAllRefreshTokensRequestBuilder invalidateAllRefreshTokens() {
        return new UserInvalidateAllRefreshTokensRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.invalidateAllRefreshTokens"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UserReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new UserReprocessLicenseAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reprocessLicenseAssignment"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UserRevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new UserRevokeSignInSessionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.revokeSignInSessions"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserFindMeetingTimesRequestBuilder findMeetingTimes(@Nonnull final UserFindMeetingTimesParameterSet parameters) {
        return new UserFindMeetingTimesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findMeetingTimes"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserGetMailTipsCollectionRequestBuilder getMailTips(@Nonnull final UserGetMailTipsParameterSet parameters) {
        return new UserGetMailTipsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailTips"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserSendMailRequestBuilder sendMail(@Nonnull final UserSendMailParameterSet parameters) {
        return new UserSendMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendMail"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserTranslateExchangeIdsCollectionRequestBuilder translateExchangeIds(@Nonnull final UserTranslateExchangeIdsParameterSet parameters) {
        return new UserTranslateExchangeIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.translateExchangeIds"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UserRemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new UserRemoveAllDevicesFromManagementRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeAllDevicesFromManagement"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UserUnblockManagedAppsRequestBuilder unblockManagedApps() {
        return new UserUnblockManagedAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unblockManagedApps"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UserWipeAndBlockManagedAppsRequestBuilder wipeAndBlockManagedApps() {
        return new UserWipeAndBlockManagedAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipeAndBlockManagedApps"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserWipeManagedAppRegistrationByDeviceTagRequestBuilder wipeManagedAppRegistrationByDeviceTag(@Nonnull final UserWipeManagedAppRegistrationByDeviceTagParameterSet parameters) {
        return new UserWipeManagedAppRegistrationByDeviceTagRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipeManagedAppRegistrationByDeviceTag"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag(@Nonnull final UserWipeManagedAppRegistrationsByDeviceTagParameterSet parameters) {
        return new UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipeManagedAppRegistrationsByDeviceTag"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserExportPersonalDataRequestBuilder exportPersonalData(@Nonnull final UserExportPersonalDataParameterSet parameters) {
        return new UserExportPersonalDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportPersonalData"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserFindRoomListsCollectionRequestBuilder findRoomLists() {
        return new UserFindRoomListsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findRoomLists"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserFindRoomsCollectionRequestBuilder findRooms() {
        return new UserFindRoomsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findRooms"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserFindRoomsCollectionRequestBuilder findRooms(@Nonnull final UserFindRoomsParameterSet parameters) {
        return new UserFindRoomsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findRooms"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserReminderViewCollectionRequestBuilder reminderView(@Nonnull final UserReminderViewParameterSet parameters) {
        return new UserReminderViewCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reminderView"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UserExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData() {
        return new UserExportDeviceAndAppManagementDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportDeviceAndAppManagementData"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData(@Nonnull final UserExportDeviceAndAppManagementDataParameterSet parameters) {
        return new UserExportDeviceAndAppManagementDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportDeviceAndAppManagementData"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder getEffectiveDeviceEnrollmentConfigurations() {
        return new UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEffectiveDeviceEnrollmentConfigurations"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserGetLoggedOnManagedDevicesCollectionRequestBuilder getLoggedOnManagedDevices() {
        return new UserGetLoggedOnManagedDevicesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getLoggedOnManagedDevices"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder getManagedAppDiagnosticStatuses() {
        return new UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppDiagnosticStatuses"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserGetManagedAppPoliciesCollectionRequestBuilder getManagedAppPolicies() {
        return new UserGetManagedAppPoliciesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppPolicies"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public UserIsManagedAppUserBlockedRequestBuilder isManagedAppUserBlocked() {
        return new UserIsManagedAppUserBlockedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isManagedAppUserBlocked"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserGetManagedDevicesWithAppFailuresCollectionRequestBuilder getManagedDevicesWithAppFailures() {
        return new UserGetManagedDevicesWithAppFailuresCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedDevicesWithAppFailures"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public UserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder getManagedDevicesWithFailedOrPendingApps() {
        return new UserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedDevicesWithFailedOrPendingApps"), getClient(), null);
    }
}
