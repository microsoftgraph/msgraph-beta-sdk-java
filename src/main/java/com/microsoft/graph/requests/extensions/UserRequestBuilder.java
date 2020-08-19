// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserRequest;
import com.microsoft.graph.requests.extensions.UserRequest;
import com.microsoft.graph.requests.extensions.IUserAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.IInformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ILicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.LicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookUserRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMessageRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IMailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMailFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.MailFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonRequestBuilder;
import com.microsoft.graph.requests.extensions.PersonRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContactFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.IInferenceClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.InferenceClassificationRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.ApprovalRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppConsentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.AppConsentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppIntentAndStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppIntentAndStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppIntentAndStateRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppIntentAndStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerUserRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerUserRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemInsightsRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemInsightsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.UserActivityRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.OnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.extensions.IPresenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PresenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationRequestBuilder;
import com.microsoft.graph.requests.extensions.AuthenticationRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserTeamworkRequestBuilder;
import com.microsoft.graph.requests.extensions.UserTeamworkRequestBuilder;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.requests.extensions.IUserAssignLicenseRequestBuilder;
import com.microsoft.graph.requests.extensions.UserAssignLicenseRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserChangePasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.UserChangePasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserInvalidateAllRefreshTokensRequestBuilder;
import com.microsoft.graph.requests.extensions.UserInvalidateAllRefreshTokensRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRevokeSignInSessionsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRevokeSignInSessionsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserReprocessLicenseAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.UserReprocessLicenseAssignmentRequestBuilder;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;
import com.microsoft.graph.requests.extensions.IUserFindMeetingTimesRequestBuilder;
import com.microsoft.graph.requests.extensions.UserFindMeetingTimesRequestBuilder;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.requests.extensions.IUserSendMailRequestBuilder;
import com.microsoft.graph.requests.extensions.UserSendMailRequestBuilder;
import com.microsoft.graph.models.generated.MailTipsType;
import com.microsoft.graph.requests.extensions.IUserGetMailTipsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetMailTipsCollectionRequestBuilder;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.requests.extensions.IUserTranslateExchangeIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserTranslateExchangeIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRemoveAllDevicesFromManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRemoveAllDevicesFromManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserWipeManagedAppRegistrationByDeviceTagRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWipeManagedAppRegistrationByDeviceTagRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserWipeManagedAppRegistrationsByDeviceTagRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserWipeAndBlockManagedAppsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWipeAndBlockManagedAppsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserUnblockManagedAppsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserUnblockManagedAppsRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExportPersonalDataRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExportPersonalDataRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserReminderViewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserFindRoomsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserFindRoomsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserFindRoomsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserFindRoomsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserFindRoomListsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserFindRoomListsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExportDeviceAndAppManagementDataRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExportDeviceAndAppManagementDataRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExportDeviceAndAppManagementDataRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExportDeviceAndAppManagementDataRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserGetLoggedOnManagedDevicesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetLoggedOnManagedDevicesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserGetManagedAppDiagnosticStatusesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserGetManagedAppPoliciesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedAppPoliciesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserIsManagedAppUserBlockedRequestBuilder;
import com.microsoft.graph.requests.extensions.UserIsManagedAppUserBlockedRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserGetManagedDevicesWithAppFailuresCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedDevicesWithAppFailuresCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Request Builder.
 */
public class UserRequestBuilder extends BaseRequestBuilder implements IUserRequestBuilder {

    /**
     * The request builder for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IUserRequest instance
     */
    public IUserRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUserRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new UserRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for UserAnalytics
     *
     * @return the IUserAnalyticsRequestBuilder instance
     */
    public IUserAnalyticsRequestBuilder analytics() {
        return new UserAnalyticsRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }

    /**
     * Gets the request builder for InformationProtection
     *
     * @return the IInformationProtectionRequestBuilder instance
     */
    public IInformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("informationProtection"), getClient(), null);
    }
    public IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    public IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder createdObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder createdObjects(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdObjects") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder directReports() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("directReports"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder directReports(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directReports") + "/" + id, getClient(), null);
    }
    public ILicenseDetailsCollectionRequestBuilder licenseDetails() {
        return new LicenseDetailsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails"), getClient(), null);
    }

    public ILicenseDetailsRequestBuilder licenseDetails(final String id) {
        return new LicenseDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("licenseDetails") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    public IDirectoryObjectWithReferenceRequestBuilder manager() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("manager"), getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder ownedDevices() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder ownedDevices(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedDevices") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder ownedObjects() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder ownedObjects(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("ownedObjects") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder registeredDevices() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder registeredDevices(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredDevices") + "/" + id, getClient(), null);
    }
    public IScopedRoleMembershipCollectionRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMemberOf"), getClient(), null);
    }

    public IScopedRoleMembershipRequestBuilder scopedRoleMemberOf(final String id) {
        return new ScopedRoleMembershipRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMemberOf") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for OutlookUser
     *
     * @return the IOutlookUserRequestBuilder instance
     */
    public IOutlookUserRequestBuilder outlook() {
        return new OutlookUserRequestBuilder(getRequestUrlWithAdditionalSegment("outlook"), getClient(), null);
    }
    public IMessageCollectionRequestBuilder messages() {
        return new MessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    public IMessageRequestBuilder messages(final String id) {
        return new MessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }
    public IGroupCollectionRequestBuilder joinedGroups() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("joinedGroups"), getClient(), null);
    }

    public IGroupRequestBuilder joinedGroups(final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("joinedGroups") + "/" + id, getClient(), null);
    }
    public IMailFolderCollectionRequestBuilder mailFolders() {
        return new MailFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolders"), getClient(), null);
    }

    public IMailFolderRequestBuilder mailFolders(final String id) {
        return new MailFolderRequestBuilder(getRequestUrlWithAdditionalSegment("mailFolders") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Calendar
     *
     * @return the ICalendarRequestBuilder instance
     */
    public ICalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    public ICalendarCollectionRequestBuilder calendars() {
        return new CalendarCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendars"), getClient(), null);
    }

    public ICalendarRequestBuilder calendars(final String id) {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendars") + "/" + id, getClient(), null);
    }
    public ICalendarGroupCollectionRequestBuilder calendarGroups() {
        return new CalendarGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroups"), getClient(), null);
    }

    public ICalendarGroupRequestBuilder calendarGroups(final String id) {
        return new CalendarGroupRequestBuilder(getRequestUrlWithAdditionalSegment("calendarGroups") + "/" + id, getClient(), null);
    }
    public IEventCollectionRequestBuilder calendarView() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView"), getClient(), null);
    }

    public IEventRequestBuilder calendarView(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView") + "/" + id, getClient(), null);
    }
    public IEventCollectionRequestBuilder events() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    public IEventRequestBuilder events(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }
    public IPersonCollectionRequestBuilder people() {
        return new PersonCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("people"), getClient(), null);
    }

    public IPersonRequestBuilder people(final String id) {
        return new PersonRequestBuilder(getRequestUrlWithAdditionalSegment("people") + "/" + id, getClient(), null);
    }
    public IContactCollectionRequestBuilder contacts() {
        return new ContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contacts"), getClient(), null);
    }

    public IContactRequestBuilder contacts(final String id) {
        return new ContactRequestBuilder(getRequestUrlWithAdditionalSegment("contacts") + "/" + id, getClient(), null);
    }
    public IContactFolderCollectionRequestBuilder contactFolders() {
        return new ContactFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolders"), getClient(), null);
    }

    public IContactFolderRequestBuilder contactFolders(final String id) {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment("contactFolders") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for InferenceClassification
     *
     * @return the IInferenceClassificationRequestBuilder instance
     */
    public IInferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(getRequestUrlWithAdditionalSegment("inferenceClassification"), getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the IProfilePhotoRequestBuilder instance
     */
    public IProfilePhotoRequestBuilder photo() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }
    public IProfilePhotoCollectionRequestBuilder photos() {
        return new ProfilePhotoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("photos"), getClient(), null);
    }

    public IProfilePhotoRequestBuilder photos(final String id) {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photos") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    public IDriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    public IDriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    public ISiteCollectionWithReferencesRequestBuilder followedSites() {
        return new SiteCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("followedSites"), getClient(), null);
    }

    public ISiteWithReferenceRequestBuilder followedSites(final String id) {
        return new SiteWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("followedSites") + "/" + id, getClient(), null);
    }
    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public IApprovalCollectionRequestBuilder approvals() {
        return new ApprovalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("approvals"), getClient(), null);
    }

    public IApprovalRequestBuilder approvals(final String id) {
        return new ApprovalRequestBuilder(getRequestUrlWithAdditionalSegment("approvals") + "/" + id, getClient(), null);
    }
    public IAppConsentRequestCollectionRequestBuilder appConsentRequestsForApproval() {
        return new AppConsentRequestCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appConsentRequestsForApproval"), getClient(), null);
    }

    public IAppConsentRequestRequestBuilder appConsentRequestsForApproval(final String id) {
        return new AppConsentRequestRequestBuilder(getRequestUrlWithAdditionalSegment("appConsentRequestsForApproval") + "/" + id, getClient(), null);
    }
    public IAccessReviewInstanceCollectionRequestBuilder pendingAccessReviewInstances() {
        return new AccessReviewInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pendingAccessReviewInstances"), getClient(), null);
    }

    public IAccessReviewInstanceRequestBuilder pendingAccessReviewInstances(final String id) {
        return new AccessReviewInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("pendingAccessReviewInstances") + "/" + id, getClient(), null);
    }
    public IAgreementAcceptanceCollectionWithReferencesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptanceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("agreementAcceptances"), getClient(), null);
    }

    public IAgreementAcceptanceWithReferenceRequestBuilder agreementAcceptances(final String id) {
        return new AgreementAcceptanceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("agreementAcceptances") + "/" + id, getClient(), null);
    }
    public IDeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations"), getClient(), null);
    }

    public IDeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(final String id) {
        return new DeviceEnrollmentConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations") + "/" + id, getClient(), null);
    }
    public IManagedDeviceCollectionRequestBuilder managedDevices() {
        return new ManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices"), getClient(), null);
    }

    public IManagedDeviceRequestBuilder managedDevices(final String id) {
        return new ManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices") + "/" + id, getClient(), null);
    }
    public IManagedAppRegistrationCollectionWithReferencesRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations"), getClient(), null);
    }

    public IManagedAppRegistrationWithReferenceRequestBuilder managedAppRegistrations(final String id) {
        return new ManagedAppRegistrationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managedAppRegistrations") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder windowsInformationProtectionDeviceRegistrations() {
        return new WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionDeviceRegistrations"), getClient(), null);
    }

    public IWindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder windowsInformationProtectionDeviceRegistrations(final String id) {
        return new WindowsInformationProtectionDeviceRegistrationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionDeviceRegistrations") + "/" + id, getClient(), null);
    }
    public IDeviceManagementTroubleshootingEventCollectionRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementTroubleshootingEvents"), getClient(), null);
    }

    public IDeviceManagementTroubleshootingEventRequestBuilder deviceManagementTroubleshootingEvents(final String id) {
        return new DeviceManagementTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementTroubleshootingEvents") + "/" + id, getClient(), null);
    }
    public IMobileAppIntentAndStateCollectionRequestBuilder mobileAppIntentAndStates() {
        return new MobileAppIntentAndStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppIntentAndStates"), getClient(), null);
    }

    public IMobileAppIntentAndStateRequestBuilder mobileAppIntentAndStates(final String id) {
        return new MobileAppIntentAndStateRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppIntentAndStates") + "/" + id, getClient(), null);
    }
    public IMobileAppTroubleshootingEventCollectionRequestBuilder mobileAppTroubleshootingEvents() {
        return new MobileAppTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppTroubleshootingEvents"), getClient(), null);
    }

    public IMobileAppTroubleshootingEventRequestBuilder mobileAppTroubleshootingEvents(final String id) {
        return new MobileAppTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppTroubleshootingEvents") + "/" + id, getClient(), null);
    }
    public INotificationCollectionRequestBuilder notifications() {
        return new NotificationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notifications"), getClient(), null);
    }

    public INotificationRequestBuilder notifications(final String id) {
        return new NotificationRequestBuilder(getRequestUrlWithAdditionalSegment("notifications") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PlannerUser
     *
     * @return the IPlannerUserRequestBuilder instance
     */
    public IPlannerUserRequestBuilder planner() {
        return new PlannerUserRequestBuilder(getRequestUrlWithAdditionalSegment("planner"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemInsights
     *
     * @return the IItemInsightsRequestBuilder instance
     */
    public IItemInsightsRequestBuilder insights() {
        return new ItemInsightsRequestBuilder(getRequestUrlWithAdditionalSegment("insights"), getClient(), null);
    }

    /**
     * Gets the request builder for UserSettings
     *
     * @return the IUserSettingsRequestBuilder instance
     */
    public IUserSettingsRequestBuilder settings() {
        return new UserSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    public IOnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    /**
     * Gets the request builder for Profile
     *
     * @return the IProfileRequestBuilder instance
     */
    public IProfileRequestBuilder profile() {
        return new ProfileRequestBuilder(getRequestUrlWithAdditionalSegment("profile"), getClient(), null);
    }
    public IUserActivityCollectionRequestBuilder activities() {
        return new UserActivityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("activities"), getClient(), null);
    }

    public IUserActivityRequestBuilder activities(final String id) {
        return new UserActivityRequestBuilder(getRequestUrlWithAdditionalSegment("activities") + "/" + id, getClient(), null);
    }
    public IDeviceCollectionRequestBuilder devices() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("devices"), getClient(), null);
    }

    public IDeviceRequestBuilder devices(final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("devices") + "/" + id, getClient(), null);
    }
    public IOnlineMeetingCollectionRequestBuilder onlineMeetings() {
        return new OnlineMeetingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings"), getClient(), null);
    }

    public IOnlineMeetingRequestBuilder onlineMeetings(final String id) {
        return new OnlineMeetingRequestBuilder(getRequestUrlWithAdditionalSegment("onlineMeetings") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Presence
     *
     * @return the IPresenceRequestBuilder instance
     */
    public IPresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(getRequestUrlWithAdditionalSegment("presence"), getClient(), null);
    }

    /**
     * Gets the request builder for Authentication
     *
     * @return the IAuthenticationRequestBuilder instance
     */
    public IAuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(getRequestUrlWithAdditionalSegment("authentication"), getClient(), null);
    }
    public IChatCollectionRequestBuilder chats() {
        return new ChatCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("chats"), getClient(), null);
    }

    public IChatRequestBuilder chats(final String id) {
        return new ChatRequestBuilder(getRequestUrlWithAdditionalSegment("chats") + "/" + id, getClient(), null);
    }
    public ITeamCollectionRequestBuilder joinedTeams() {
        return new TeamCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("joinedTeams"), getClient(), null);
    }

    public ITeamRequestBuilder joinedTeams(final String id) {
        return new TeamRequestBuilder(getRequestUrlWithAdditionalSegment("joinedTeams") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for UserTeamwork
     *
     * @return the IUserTeamworkRequestBuilder instance
     */
    public IUserTeamworkRequestBuilder teamwork() {
        return new UserTeamworkRequestBuilder(getRequestUrlWithAdditionalSegment("teamwork"), getClient(), null);
    }

    public IUserAssignLicenseRequestBuilder assignLicense(final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        return new UserAssignLicenseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignLicense"), getClient(), null, addLicenses, removeLicenses);
    }

    public IUserChangePasswordRequestBuilder changePassword(final String currentPassword, final String newPassword) {
        return new UserChangePasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.changePassword"), getClient(), null, currentPassword, newPassword);
    }

    public IUserInvalidateAllRefreshTokensRequestBuilder invalidateAllRefreshTokens() {
        return new UserInvalidateAllRefreshTokensRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.invalidateAllRefreshTokens"), getClient(), null);
    }

    public IUserRevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new UserRevokeSignInSessionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.revokeSignInSessions"), getClient(), null);
    }

    public IUserReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new UserReprocessLicenseAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reprocessLicenseAssignment"), getClient(), null);
    }

    public IUserFindMeetingTimesRequestBuilder findMeetingTimes(final java.util.List<AttendeeBase> attendees, final LocationConstraint locationConstraint, final TimeConstraint timeConstraint, final javax.xml.datatype.Duration meetingDuration, final Integer maxCandidates, final Boolean isOrganizerOptional, final Boolean returnSuggestionReasons, final Double minimumAttendeePercentage) {
        return new UserFindMeetingTimesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findMeetingTimes"), getClient(), null, attendees, locationConstraint, timeConstraint, meetingDuration, maxCandidates, isOrganizerOptional, returnSuggestionReasons, minimumAttendeePercentage);
    }

    public IUserSendMailRequestBuilder sendMail(final Message message, final Boolean saveToSentItems) {
        return new UserSendMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendMail"), getClient(), null, message, saveToSentItems);
    }

    public IUserGetMailTipsCollectionRequestBuilder getMailTips(final java.util.List<String> emailAddresses, final EnumSet<MailTipsType> mailTipsOptions) {
        return new UserGetMailTipsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMailTips"), getClient(), null, emailAddresses, mailTipsOptions);
    }

    public IUserTranslateExchangeIdsCollectionRequestBuilder translateExchangeIds(final java.util.List<String> inputIds, final ExchangeIdFormat targetIdType, final ExchangeIdFormat sourceIdType) {
        return new UserTranslateExchangeIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.translateExchangeIds"), getClient(), null, inputIds, targetIdType, sourceIdType);
    }

    public IUserRemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new UserRemoveAllDevicesFromManagementRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeAllDevicesFromManagement"), getClient(), null);
    }

    public IUserWipeManagedAppRegistrationByDeviceTagRequestBuilder wipeManagedAppRegistrationByDeviceTag(final String deviceTag) {
        return new UserWipeManagedAppRegistrationByDeviceTagRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipeManagedAppRegistrationByDeviceTag"), getClient(), null, deviceTag);
    }

    public IUserWipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag(final String deviceTag) {
        return new UserWipeManagedAppRegistrationsByDeviceTagRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipeManagedAppRegistrationsByDeviceTag"), getClient(), null, deviceTag);
    }

    public IUserWipeAndBlockManagedAppsRequestBuilder wipeAndBlockManagedApps() {
        return new UserWipeAndBlockManagedAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipeAndBlockManagedApps"), getClient(), null);
    }

    public IUserUnblockManagedAppsRequestBuilder unblockManagedApps() {
        return new UserUnblockManagedAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unblockManagedApps"), getClient(), null);
    }

    public IUserExportPersonalDataRequestBuilder exportPersonalData(final String storageLocation) {
        return new UserExportPersonalDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportPersonalData"), getClient(), null, storageLocation);
    }

    public IUserReminderViewCollectionRequestBuilder reminderView(final String startDateTime, final String endDateTime) {
        return new UserReminderViewCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reminderView"), getClient(), null, startDateTime, endDateTime);
    }

    public IUserFindRoomsCollectionRequestBuilder findRooms() {
        return new UserFindRoomsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findRooms"), getClient(), null);
    }

    public IUserFindRoomsCollectionRequestBuilder findRooms(final String roomList) {
        return new UserFindRoomsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findRooms"), getClient(), null, roomList);
    }

    public IUserFindRoomListsCollectionRequestBuilder findRoomLists() {
        return new UserFindRoomListsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.findRoomLists"), getClient(), null);
    }

    public IUserExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData() {
        return new UserExportDeviceAndAppManagementDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportDeviceAndAppManagementData"), getClient(), null);
    }

    public IUserExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData(final Integer skip, final Integer top) {
        return new UserExportDeviceAndAppManagementDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportDeviceAndAppManagementData"), getClient(), null, skip, top);
    }

    public IUserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder getEffectiveDeviceEnrollmentConfigurations() {
        return new UserGetEffectiveDeviceEnrollmentConfigurationsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEffectiveDeviceEnrollmentConfigurations"), getClient(), null);
    }

    public IUserGetLoggedOnManagedDevicesCollectionRequestBuilder getLoggedOnManagedDevices() {
        return new UserGetLoggedOnManagedDevicesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getLoggedOnManagedDevices"), getClient(), null);
    }

    public IUserGetManagedAppDiagnosticStatusesCollectionRequestBuilder getManagedAppDiagnosticStatuses() {
        return new UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppDiagnosticStatuses"), getClient(), null);
    }

    public IUserGetManagedAppPoliciesCollectionRequestBuilder getManagedAppPolicies() {
        return new UserGetManagedAppPoliciesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedAppPolicies"), getClient(), null);
    }

    public IUserIsManagedAppUserBlockedRequestBuilder isManagedAppUserBlocked() {
        return new UserIsManagedAppUserBlockedRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.isManagedAppUserBlocked"), getClient(), null);
    }

    public IUserGetManagedDevicesWithAppFailuresCollectionRequestBuilder getManagedDevicesWithAppFailures() {
        return new UserGetManagedDevicesWithAppFailuresCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedDevicesWithAppFailures"), getClient(), null);
    }

    public IUserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder getManagedDevicesWithFailedOrPendingApps() {
        return new UserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagedDevicesWithFailedOrPendingApps"), getClient(), null);
    }
}

