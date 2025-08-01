package com.microsoft.graph.beta.users.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.User;
import com.microsoft.graph.beta.users.item.activities.ActivitiesRequestBuilder;
import com.microsoft.graph.beta.users.item.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.beta.users.item.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.beta.users.item.appconsentrequestsforapproval.AppConsentRequestsForApprovalRequestBuilder;
import com.microsoft.graph.beta.users.item.approleassignedresources.AppRoleAssignedResourcesRequestBuilder;
import com.microsoft.graph.beta.users.item.approleassignedresourceswithappid.AppRoleAssignedResourcesWithAppIdRequestBuilder;
import com.microsoft.graph.beta.users.item.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.beta.users.item.approvals.ApprovalsRequestBuilder;
import com.microsoft.graph.beta.users.item.assignlicense.AssignLicenseRequestBuilder;
import com.microsoft.graph.beta.users.item.authentication.AuthenticationRequestBuilder;
import com.microsoft.graph.beta.users.item.calendar.CalendarRequestBuilder;
import com.microsoft.graph.beta.users.item.calendargroups.CalendarGroupsRequestBuilder;
import com.microsoft.graph.beta.users.item.calendars.CalendarsRequestBuilder;
import com.microsoft.graph.beta.users.item.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.beta.users.item.changepassword.ChangePasswordRequestBuilder;
import com.microsoft.graph.beta.users.item.chats.ChatsRequestBuilder;
import com.microsoft.graph.beta.users.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.beta.users.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudclipboard.CloudClipboardRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.CloudPCsRequestBuilder;
import com.microsoft.graph.beta.users.item.communications.CommunicationsRequestBuilder;
import com.microsoft.graph.beta.users.item.contactfolders.ContactFoldersRequestBuilder;
import com.microsoft.graph.beta.users.item.contacts.ContactsRequestBuilder;
import com.microsoft.graph.beta.users.item.convertexternaltointernalmemberuser.ConvertExternalToInternalMemberUserRequestBuilder;
import com.microsoft.graph.beta.users.item.createdobjects.CreatedObjectsRequestBuilder;
import com.microsoft.graph.beta.users.item.datasecurityandgovernance.DataSecurityAndGovernanceRequestBuilder;
import com.microsoft.graph.beta.users.item.deletepasswordsinglesignoncredentials.DeletePasswordSingleSignOnCredentialsRequestBuilder;
import com.microsoft.graph.beta.users.item.deviceenrollmentconfigurations.DeviceEnrollmentConfigurationsRequestBuilder;
import com.microsoft.graph.beta.users.item.devicemanagementtroubleshootingevents.DeviceManagementTroubleshootingEventsRequestBuilder;
import com.microsoft.graph.beta.users.item.devices.DevicesRequestBuilder;
import com.microsoft.graph.beta.users.item.deviceswithdeviceid.DevicesWithDeviceIdRequestBuilder;
import com.microsoft.graph.beta.users.item.directreports.DirectReportsRequestBuilder;
import com.microsoft.graph.beta.users.item.drive.DriveRequestBuilder;
import com.microsoft.graph.beta.users.item.drives.DrivesRequestBuilder;
import com.microsoft.graph.beta.users.item.employeeexperience.EmployeeExperienceRequestBuilder;
import com.microsoft.graph.beta.users.item.events.EventsRequestBuilder;
import com.microsoft.graph.beta.users.item.exportdeviceandappmanagementdata.ExportDeviceAndAppManagementDataRequestBuilder;
import com.microsoft.graph.beta.users.item.exportdeviceandappmanagementdatawithskipwithtop.ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder;
import com.microsoft.graph.beta.users.item.exportpersonaldata.ExportPersonalDataRequestBuilder;
import com.microsoft.graph.beta.users.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.beta.users.item.findmeetingtimes.FindMeetingTimesRequestBuilder;
import com.microsoft.graph.beta.users.item.findroomlists.FindRoomListsRequestBuilder;
import com.microsoft.graph.beta.users.item.findrooms.FindRoomsRequestBuilder;
import com.microsoft.graph.beta.users.item.findroomswithroomlist.FindRoomsWithRoomListRequestBuilder;
import com.microsoft.graph.beta.users.item.followedsites.FollowedSitesRequestBuilder;
import com.microsoft.graph.beta.users.item.geteffectivedeviceenrollmentconfigurations.GetEffectiveDeviceEnrollmentConfigurationsRequestBuilder;
import com.microsoft.graph.beta.users.item.getloggedonmanageddevices.GetLoggedOnManagedDevicesRequestBuilder;
import com.microsoft.graph.beta.users.item.getmailtips.GetMailTipsRequestBuilder;
import com.microsoft.graph.beta.users.item.getmanagedappdiagnosticstatuses.GetManagedAppDiagnosticStatusesRequestBuilder;
import com.microsoft.graph.beta.users.item.getmanagedapppolicies.GetManagedAppPoliciesRequestBuilder;
import com.microsoft.graph.beta.users.item.getmanageddeviceswithappfailures.GetManagedDevicesWithAppFailuresRequestBuilder;
import com.microsoft.graph.beta.users.item.getmanageddeviceswithfailedorpendingapps.GetManagedDevicesWithFailedOrPendingAppsRequestBuilder;
import com.microsoft.graph.beta.users.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.beta.users.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.beta.users.item.getpasswordsinglesignoncredentials.GetPasswordSingleSignOnCredentialsRequestBuilder;
import com.microsoft.graph.beta.users.item.inferenceclassification.InferenceClassificationRequestBuilder;
import com.microsoft.graph.beta.users.item.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.beta.users.item.insights.InsightsRequestBuilder;
import com.microsoft.graph.beta.users.item.invalidateallrefreshtokens.InvalidateAllRefreshTokensRequestBuilder;
import com.microsoft.graph.beta.users.item.invitedby.InvitedByRequestBuilder;
import com.microsoft.graph.beta.users.item.ismanagedappuserblocked.IsManagedAppUserBlockedRequestBuilder;
import com.microsoft.graph.beta.users.item.joinedgroups.JoinedGroupsRequestBuilder;
import com.microsoft.graph.beta.users.item.joinedteams.JoinedTeamsRequestBuilder;
import com.microsoft.graph.beta.users.item.licensedetails.LicenseDetailsRequestBuilder;
import com.microsoft.graph.beta.users.item.mailboxsettings.MailboxSettingsRequestBuilder;
import com.microsoft.graph.beta.users.item.mailfolders.MailFoldersRequestBuilder;
import com.microsoft.graph.beta.users.item.managedapplogcollectionrequests.ManagedAppLogCollectionRequestsRequestBuilder;
import com.microsoft.graph.beta.users.item.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import com.microsoft.graph.beta.users.item.manageddevices.ManagedDevicesRequestBuilder;
import com.microsoft.graph.beta.users.item.manager.ManagerRequestBuilder;
import com.microsoft.graph.beta.users.item.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.beta.users.item.messages.MessagesRequestBuilder;
import com.microsoft.graph.beta.users.item.mobileappintentandstates.MobileAppIntentAndStatesRequestBuilder;
import com.microsoft.graph.beta.users.item.mobileapptroubleshootingevents.MobileAppTroubleshootingEventsRequestBuilder;
import com.microsoft.graph.beta.users.item.notifications.NotificationsRequestBuilder;
import com.microsoft.graph.beta.users.item.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.beta.users.item.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.OnlineMeetingsRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetingswithjoinweburl.OnlineMeetingsWithJoinWebUrlRequestBuilder;
import com.microsoft.graph.beta.users.item.outlook.OutlookRequestBuilder;
import com.microsoft.graph.beta.users.item.owneddevices.OwnedDevicesRequestBuilder;
import com.microsoft.graph.beta.users.item.ownedobjects.OwnedObjectsRequestBuilder;
import com.microsoft.graph.beta.users.item.pendingaccessreviewinstances.PendingAccessReviewInstancesRequestBuilder;
import com.microsoft.graph.beta.users.item.people.PeopleRequestBuilder;
import com.microsoft.graph.beta.users.item.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.beta.users.item.photo.PhotoRequestBuilder;
import com.microsoft.graph.beta.users.item.photos.PhotosRequestBuilder;
import com.microsoft.graph.beta.users.item.planner.PlannerRequestBuilder;
import com.microsoft.graph.beta.users.item.presence.PresenceRequestBuilder;
import com.microsoft.graph.beta.users.item.profile.ProfileRequestBuilder;
import com.microsoft.graph.beta.users.item.registereddevices.RegisteredDevicesRequestBuilder;
import com.microsoft.graph.beta.users.item.reminderviewwithstartdatetimewithenddatetime.ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.beta.users.item.removealldevicesfrommanagement.RemoveAllDevicesFromManagementRequestBuilder;
import com.microsoft.graph.beta.users.item.reprocesslicenseassignment.ReprocessLicenseAssignmentRequestBuilder;
import com.microsoft.graph.beta.users.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.beta.users.item.retrievemanageddeviceswithappinstallationissues.RetrieveManagedDevicesWithAppInstallationIssuesRequestBuilder;
import com.microsoft.graph.beta.users.item.retryserviceprovisioning.RetryServiceProvisioningRequestBuilder;
import com.microsoft.graph.beta.users.item.revokesigninsessions.RevokeSignInSessionsRequestBuilder;
import com.microsoft.graph.beta.users.item.scopedrolememberof.ScopedRoleMemberOfRequestBuilder;
import com.microsoft.graph.beta.users.item.security.SecurityRequestBuilder;
import com.microsoft.graph.beta.users.item.sendmail.SendMailRequestBuilder;
import com.microsoft.graph.beta.users.item.serviceprovisioningerrors.ServiceProvisioningErrorsRequestBuilder;
import com.microsoft.graph.beta.users.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.beta.users.item.solutions.SolutionsRequestBuilder;
import com.microsoft.graph.beta.users.item.sponsors.SponsorsRequestBuilder;
import com.microsoft.graph.beta.users.item.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.beta.users.item.todo.TodoRequestBuilder;
import com.microsoft.graph.beta.users.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import com.microsoft.graph.beta.users.item.transitivereports.TransitiveReportsRequestBuilder;
import com.microsoft.graph.beta.users.item.translateexchangeids.TranslateExchangeIdsRequestBuilder;
import com.microsoft.graph.beta.users.item.unblockmanagedapps.UnblockManagedAppsRequestBuilder;
import com.microsoft.graph.beta.users.item.usagerights.UsageRightsRequestBuilder;
import com.microsoft.graph.beta.users.item.virtualevents.VirtualEventsRequestBuilder;
import com.microsoft.graph.beta.users.item.windowsinformationprotectiondeviceregistrations.WindowsInformationProtectionDeviceRegistrationsRequestBuilder;
import com.microsoft.graph.beta.users.item.wipeandblockmanagedapps.WipeAndBlockManagedAppsRequestBuilder;
import com.microsoft.graph.beta.users.item.wipemanagedappregistrationbydevicetag.WipeManagedAppRegistrationByDeviceTagRequestBuilder;
import com.microsoft.graph.beta.users.item.wipemanagedappregistrationsbyazureaddeviceid.WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder;
import com.microsoft.graph.beta.users.item.wipemanagedappregistrationsbydevicetag.WipeManagedAppRegistrationsByDeviceTagRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of user entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activities property of the microsoft.graph.user entity.
     * @return a {@link ActivitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the agreementAcceptances property of the microsoft.graph.user entity.
     * @return a {@link AgreementAcceptancesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the analytics property of the microsoft.graph.user entity.
     * @return a {@link AnalyticsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appConsentRequestsForApproval property of the microsoft.graph.user entity.
     * @return a {@link AppConsentRequestsForApprovalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppConsentRequestsForApprovalRequestBuilder appConsentRequestsForApproval() {
        return new AppConsentRequestsForApprovalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignedResources property of the microsoft.graph.user entity.
     * @return a {@link AppRoleAssignedResourcesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignedResourcesRequestBuilder appRoleAssignedResources() {
        return new AppRoleAssignedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignments property of the microsoft.graph.user entity.
     * @return a {@link AppRoleAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the approvals property of the microsoft.graph.user entity.
     * @return a {@link ApprovalsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApprovalsRequestBuilder approvals() {
        return new ApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assignLicense method.
     * @return a {@link AssignLicenseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authentication property of the microsoft.graph.user entity.
     * @return a {@link AuthenticationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendar property of the microsoft.graph.user entity.
     * @return a {@link CalendarRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarGroups property of the microsoft.graph.user entity.
     * @return a {@link CalendarGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalendarGroupsRequestBuilder calendarGroups() {
        return new CalendarGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendars property of the microsoft.graph.user entity.
     * @return a {@link CalendarsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalendarsRequestBuilder calendars() {
        return new CalendarsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.user entity.
     * @return a {@link CalendarViewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the changePassword method.
     * @return a {@link ChangePasswordRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChangePasswordRequestBuilder changePassword() {
        return new ChangePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the chats property of the microsoft.graph.user entity.
     * @return a {@link ChatsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberGroups method.
     * @return a {@link CheckMemberGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberObjects method.
     * @return a {@link CheckMemberObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudClipboard property of the microsoft.graph.user entity.
     * @return a {@link CloudClipboardRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudClipboardRequestBuilder cloudClipboard() {
        return new CloudClipboardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the cloudPCs property of the microsoft.graph.user entity.
     * @return a {@link CloudPCsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudPCsRequestBuilder cloudPCs() {
        return new CloudPCsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the communications property of the microsoft.graph.user entity.
     * @return a {@link CommunicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CommunicationsRequestBuilder communications() {
        return new CommunicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contactFolders property of the microsoft.graph.user entity.
     * @return a {@link ContactFoldersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContactFoldersRequestBuilder contactFolders() {
        return new ContactFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contacts property of the microsoft.graph.user entity.
     * @return a {@link ContactsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the convertExternalToInternalMemberUser method.
     * @return a {@link ConvertExternalToInternalMemberUserRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConvertExternalToInternalMemberUserRequestBuilder convertExternalToInternalMemberUser() {
        return new ConvertExternalToInternalMemberUserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdObjects property of the microsoft.graph.user entity.
     * @return a {@link CreatedObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the dataSecurityAndGovernance property of the microsoft.graph.user entity.
     * @return a {@link DataSecurityAndGovernanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataSecurityAndGovernanceRequestBuilder dataSecurityAndGovernance() {
        return new DataSecurityAndGovernanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the deletePasswordSingleSignOnCredentials method.
     * @return a {@link DeletePasswordSingleSignOnCredentialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeletePasswordSingleSignOnCredentialsRequestBuilder deletePasswordSingleSignOnCredentials() {
        return new DeletePasswordSingleSignOnCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceEnrollmentConfigurations property of the microsoft.graph.user entity.
     * @return a {@link DeviceEnrollmentConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceEnrollmentConfigurationsRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceManagementTroubleshootingEvents property of the microsoft.graph.user entity.
     * @return a {@link DeviceManagementTroubleshootingEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementTroubleshootingEventsRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the devices property of the microsoft.graph.user entity.
     * @return a {@link DevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DevicesRequestBuilder devices() {
        return new DevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directReports property of the microsoft.graph.user entity.
     * @return a {@link DirectReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectReportsRequestBuilder directReports() {
        return new DirectReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.user entity.
     * @return a {@link DriveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drives property of the microsoft.graph.user entity.
     * @return a {@link DrivesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the employeeExperience property of the microsoft.graph.user entity.
     * @return a {@link EmployeeExperienceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmployeeExperienceRequestBuilder employeeExperience() {
        return new EmployeeExperienceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the events property of the microsoft.graph.user entity.
     * @return a {@link EventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exportDeviceAndAppManagementData method.
     * @return a {@link ExportDeviceAndAppManagementDataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData() {
        return new ExportDeviceAndAppManagementDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exportPersonalData method.
     * @return a {@link ExportPersonalDataRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExportPersonalDataRequestBuilder exportPersonalData() {
        return new ExportPersonalDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.user entity.
     * @return a {@link ExtensionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findMeetingTimes method.
     * @return a {@link FindMeetingTimesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindMeetingTimesRequestBuilder findMeetingTimes() {
        return new FindMeetingTimesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findRoomLists method.
     * @return a {@link FindRoomListsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindRoomListsRequestBuilder findRoomLists() {
        return new FindRoomListsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findRooms method.
     * @return a {@link FindRoomsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindRoomsRequestBuilder findRooms() {
        return new FindRoomsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the followedSites property of the microsoft.graph.user entity.
     * @return a {@link FollowedSitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FollowedSitesRequestBuilder followedSites() {
        return new FollowedSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getEffectiveDeviceEnrollmentConfigurations method.
     * @return a {@link GetEffectiveDeviceEnrollmentConfigurationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetEffectiveDeviceEnrollmentConfigurationsRequestBuilder getEffectiveDeviceEnrollmentConfigurations() {
        return new GetEffectiveDeviceEnrollmentConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getLoggedOnManagedDevices method.
     * @return a {@link GetLoggedOnManagedDevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetLoggedOnManagedDevicesRequestBuilder getLoggedOnManagedDevices() {
        return new GetLoggedOnManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMailTips method.
     * @return a {@link GetMailTipsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMailTipsRequestBuilder getMailTips() {
        return new GetMailTipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppDiagnosticStatuses method.
     * @return a {@link GetManagedAppDiagnosticStatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetManagedAppDiagnosticStatusesRequestBuilder getManagedAppDiagnosticStatuses() {
        return new GetManagedAppDiagnosticStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppPolicies method.
     * @return a {@link GetManagedAppPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetManagedAppPoliciesRequestBuilder getManagedAppPolicies() {
        return new GetManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedDevicesWithAppFailures method.
     * @return a {@link GetManagedDevicesWithAppFailuresRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetManagedDevicesWithAppFailuresRequestBuilder getManagedDevicesWithAppFailures() {
        return new GetManagedDevicesWithAppFailuresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedDevicesWithFailedOrPendingApps method.
     * @return a {@link GetManagedDevicesWithFailedOrPendingAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetManagedDevicesWithFailedOrPendingAppsRequestBuilder getManagedDevicesWithFailedOrPendingApps() {
        return new GetManagedDevicesWithFailedOrPendingAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberGroups method.
     * @return a {@link GetMemberGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberObjects method.
     * @return a {@link GetMemberObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPasswordSingleSignOnCredentials method.
     * @return a {@link GetPasswordSingleSignOnCredentialsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetPasswordSingleSignOnCredentialsRequestBuilder getPasswordSingleSignOnCredentials() {
        return new GetPasswordSingleSignOnCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the inferenceClassification property of the microsoft.graph.user entity.
     * @return a {@link InferenceClassificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the informationProtection property of the microsoft.graph.user entity.
     * @return a {@link InformationProtectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the insights property of the microsoft.graph.user entity.
     * @return a {@link InsightsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InsightsRequestBuilder insights() {
        return new InsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the invalidateAllRefreshTokens method.
     * @return a {@link InvalidateAllRefreshTokensRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvalidateAllRefreshTokensRequestBuilder invalidateAllRefreshTokens() {
        return new InvalidateAllRefreshTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the invitedBy property of the microsoft.graph.user entity.
     * @return a {@link InvitedByRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InvitedByRequestBuilder invitedBy() {
        return new InvitedByRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isManagedAppUserBlocked method.
     * @return a {@link IsManagedAppUserBlockedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IsManagedAppUserBlockedRequestBuilder isManagedAppUserBlocked() {
        return new IsManagedAppUserBlockedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the joinedGroups property of the microsoft.graph.user entity.
     * @return a {@link JoinedGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public JoinedGroupsRequestBuilder joinedGroups() {
        return new JoinedGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the joinedTeams property of the microsoft.graph.user entity.
     * @return a {@link JoinedTeamsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public JoinedTeamsRequestBuilder joinedTeams() {
        return new JoinedTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the licenseDetails property of the microsoft.graph.user entity.
     * @return a {@link LicenseDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The mailboxSettings property
     * @return a {@link MailboxSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MailboxSettingsRequestBuilder mailboxSettings() {
        return new MailboxSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mailFolders property of the microsoft.graph.user entity.
     * @return a {@link MailFoldersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MailFoldersRequestBuilder mailFolders() {
        return new MailFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppLogCollectionRequests property of the microsoft.graph.user entity.
     * @return a {@link ManagedAppLogCollectionRequestsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedAppLogCollectionRequestsRequestBuilder managedAppLogCollectionRequests() {
        return new ManagedAppLogCollectionRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppRegistrations property of the microsoft.graph.user entity.
     * @return a {@link ManagedAppRegistrationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDevices property of the microsoft.graph.user entity.
     * @return a {@link ManagedDevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the manager property of the microsoft.graph.user entity.
     * @return a {@link ManagerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagerRequestBuilder manager() {
        return new ManagerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.user entity.
     * @return a {@link MemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.user entity.
     * @return a {@link MessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppIntentAndStates property of the microsoft.graph.user entity.
     * @return a {@link MobileAppIntentAndStatesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppIntentAndStatesRequestBuilder mobileAppIntentAndStates() {
        return new MobileAppIntentAndStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mobileAppTroubleshootingEvents property of the microsoft.graph.user entity.
     * @return a {@link MobileAppTroubleshootingEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MobileAppTroubleshootingEventsRequestBuilder mobileAppTroubleshootingEvents() {
        return new MobileAppTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the notifications property of the microsoft.graph.user entity.
     * @return a {@link NotificationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NotificationsRequestBuilder notifications() {
        return new NotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.user entity.
     * @return a {@link Oauth2PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onenote property of the microsoft.graph.user entity.
     * @return a {@link OnenoteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.user entity.
     * @return a {@link OnlineMeetingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the outlook property of the microsoft.graph.user entity.
     * @return a {@link OutlookRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OutlookRequestBuilder outlook() {
        return new OutlookRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedDevices property of the microsoft.graph.user entity.
     * @return a {@link OwnedDevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnedDevicesRequestBuilder ownedDevices() {
        return new OwnedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedObjects property of the microsoft.graph.user entity.
     * @return a {@link OwnedObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the pendingAccessReviewInstances property of the microsoft.graph.user entity.
     * @return a {@link PendingAccessReviewInstancesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PendingAccessReviewInstancesRequestBuilder pendingAccessReviewInstances() {
        return new PendingAccessReviewInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the people property of the microsoft.graph.user entity.
     * @return a {@link PeopleRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PeopleRequestBuilder people() {
        return new PeopleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrants property of the microsoft.graph.user entity.
     * @return a {@link PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photo property of the microsoft.graph.user entity.
     * @return a {@link PhotoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photos property of the microsoft.graph.user entity.
     * @return a {@link PhotosRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the planner property of the microsoft.graph.user entity.
     * @return a {@link PlannerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the presence property of the microsoft.graph.user entity.
     * @return a {@link PresenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the profile property of the microsoft.graph.user entity.
     * @return a {@link ProfileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProfileRequestBuilder profile() {
        return new ProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the registeredDevices property of the microsoft.graph.user entity.
     * @return a {@link RegisteredDevicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegisteredDevicesRequestBuilder registeredDevices() {
        return new RegisteredDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeAllDevicesFromManagement method.
     * @return a {@link RemoveAllDevicesFromManagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new RemoveAllDevicesFromManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprocessLicenseAssignment method.
     * @return a {@link ReprocessLicenseAssignmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new ReprocessLicenseAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link RestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveManagedDevicesWithAppInstallationIssues method.
     * @return a {@link RetrieveManagedDevicesWithAppInstallationIssuesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveManagedDevicesWithAppInstallationIssuesRequestBuilder retrieveManagedDevicesWithAppInstallationIssues() {
        return new RetrieveManagedDevicesWithAppInstallationIssuesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retryServiceProvisioning method.
     * @return a {@link RetryServiceProvisioningRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetryServiceProvisioningRequestBuilder retryServiceProvisioning() {
        return new RetryServiceProvisioningRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the revokeSignInSessions method.
     * @return a {@link RevokeSignInSessionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new RevokeSignInSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the scopedRoleMemberOf property of the microsoft.graph.user entity.
     * @return a {@link ScopedRoleMemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ScopedRoleMemberOfRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the security property of the microsoft.graph.user entity.
     * @return a {@link SecurityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendMail method.
     * @return a {@link SendMailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendMailRequestBuilder sendMail() {
        return new SendMailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The serviceProvisioningErrors property
     * @return a {@link ServiceProvisioningErrorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServiceProvisioningErrorsRequestBuilder serviceProvisioningErrors() {
        return new ServiceProvisioningErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.user entity.
     * @return a {@link SettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the solutions property of the microsoft.graph.user entity.
     * @return a {@link SolutionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SolutionsRequestBuilder solutions() {
        return new SolutionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sponsors property of the microsoft.graph.user entity.
     * @return a {@link SponsorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SponsorsRequestBuilder sponsors() {
        return new SponsorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the teamwork property of the microsoft.graph.user entity.
     * @return a {@link TeamworkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the todo property of the microsoft.graph.user entity.
     * @return a {@link TodoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.user entity.
     * @return a {@link TransitiveMemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveReports property of the microsoft.graph.user entity.
     * @return a {@link TransitiveReportsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransitiveReportsRequestBuilder transitiveReports() {
        return new TransitiveReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the translateExchangeIds method.
     * @return a {@link TranslateExchangeIdsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TranslateExchangeIdsRequestBuilder translateExchangeIds() {
        return new TranslateExchangeIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unblockManagedApps method.
     * @return a {@link UnblockManagedAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnblockManagedAppsRequestBuilder unblockManagedApps() {
        return new UnblockManagedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the usageRights property of the microsoft.graph.user entity.
     * @return a {@link UsageRightsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsageRightsRequestBuilder usageRights() {
        return new UsageRightsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the virtualEvents property of the microsoft.graph.user entity.
     * @return a {@link VirtualEventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VirtualEventsRequestBuilder virtualEvents() {
        return new VirtualEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionDeviceRegistrations property of the microsoft.graph.user entity.
     * @return a {@link WindowsInformationProtectionDeviceRegistrationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionDeviceRegistrationsRequestBuilder windowsInformationProtectionDeviceRegistrations() {
        return new WindowsInformationProtectionDeviceRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipeAndBlockManagedApps method.
     * @return a {@link WipeAndBlockManagedAppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WipeAndBlockManagedAppsRequestBuilder wipeAndBlockManagedApps() {
        return new WipeAndBlockManagedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipeManagedAppRegistrationByDeviceTag method.
     * @return a {@link WipeManagedAppRegistrationByDeviceTagRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WipeManagedAppRegistrationByDeviceTagRequestBuilder wipeManagedAppRegistrationByDeviceTag() {
        return new WipeManagedAppRegistrationByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipeManagedAppRegistrationsByAzureAdDeviceId method.
     * @return a {@link WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder wipeManagedAppRegistrationsByAzureAdDeviceId() {
        return new WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipeManagedAppRegistrationsByDeviceTag method.
     * @return a {@link WipeManagedAppRegistrationsByDeviceTagRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag() {
        return new WipeManagedAppRegistrationsByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignedResources property of the microsoft.graph.user entity.
     * @param appId Alternate key of servicePrincipal
     * @return a {@link AppRoleAssignedResourcesWithAppIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignedResourcesWithAppIdRequestBuilder appRoleAssignedResourcesWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new AppRoleAssignedResourcesWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
    /**
     * Instantiates a new {@link UserItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link UserItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a user object.   When deleted, user resources, including their mailbox and license assignments, are moved to a temporary container and if the user is restored within 30 days, these objects are restored to them. The user is also restored to any groups they were a member of. After 30 days and if not restored, the user object is permanently deleted and their assigned resources freed. To manage the deleted user object, see deletedItems.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/user-delete?view=graph-rest-beta">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a user object.   When deleted, user resources, including their mailbox and license assignments, are moved to a temporary container and if the user is restored within 30 days, these objects are restored to them. The user is also restored to any groups they were a member of. After 30 days and if not restored, the user object is permanently deleted and their assigned resources freed. To manage the deleted user object, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/user-delete?view=graph-rest-beta">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Provides operations to manage the devices property of the microsoft.graph.user entity.
     * @param deviceId Alternate key of device
     * @return a {@link DevicesWithDeviceIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DevicesWithDeviceIdRequestBuilder devicesWithDeviceId(@jakarta.annotation.Nonnull final String deviceId) {
        Objects.requireNonNull(deviceId);
        return new DevicesWithDeviceIdRequestBuilder(pathParameters, requestAdapter, deviceId);
    }
    /**
     * Provides operations to call the exportDeviceAndAppManagementData method.
     * @param skip Usage: skip={skip}
     * @param top Usage: top={top}
     * @return a {@link ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder exportDeviceAndAppManagementDataWithSkipWithTop(@jakarta.annotation.Nonnull final Integer skip, @jakarta.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(skip);
        Objects.requireNonNull(top);
        return new ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder(pathParameters, requestAdapter, skip, top);
    }
    /**
     * Provides operations to call the findRooms method.
     * @param RoomList Usage: RoomList=&apos;{RoomList}&apos;
     * @return a {@link FindRoomsWithRoomListRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FindRoomsWithRoomListRequestBuilder findRoomsWithRoomList(@jakarta.annotation.Nonnull final String RoomList) {
        Objects.requireNonNull(RoomList);
        return new FindRoomsWithRoomListRequestBuilder(pathParameters, requestAdapter, RoomList);
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These default properties are noted in the Properties section. To get properties that are not returned by default, do a GET operation for the user and specify the properties in a $select OData query option. Because the user resource supports extensions, you can also use the GET operation to get custom properties and extension data in a user instance. Customers through Microsoft Entra ID for customers can also use this API operation to retrieve their details.
     * @return a {@link User}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/user-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These default properties are noted in the Properties section. To get properties that are not returned by default, do a GET operation for the user and specify the properties in a $select OData query option. Because the user resource supports extensions, you can also use the GET operation to get custom properties and extension data in a user instance. Customers through Microsoft Entra ID for customers can also use this API operation to retrieve their details.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link User}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/user-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, User::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.user entity.
     * @param joinWebUrl Alternate key of onlineMeeting
     * @return a {@link OnlineMeetingsWithJoinWebUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnlineMeetingsWithJoinWebUrlRequestBuilder onlineMeetingsWithJoinWebUrl(@jakarta.annotation.Nonnull final String joinWebUrl) {
        Objects.requireNonNull(joinWebUrl);
        return new OnlineMeetingsWithJoinWebUrlRequestBuilder(pathParameters, requestAdapter, joinWebUrl);
    }
    /**
     * Update the properties of a user object.
     * @param body The request body
     * @return a {@link User}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/user-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User patch(@jakarta.annotation.Nonnull final User body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a user object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link User}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/user-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User patch(@jakarta.annotation.Nonnull final User body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, User::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the reminderView method.
     * @param EndDateTime Usage: EndDateTime=&apos;{EndDateTime}&apos;
     * @param StartDateTime Usage: StartDateTime=&apos;{StartDateTime}&apos;
     * @return a {@link ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder reminderViewWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final String EndDateTime, @jakarta.annotation.Nonnull final String StartDateTime) {
        Objects.requireNonNull(EndDateTime);
        Objects.requireNonNull(StartDateTime);
        return new ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, EndDateTime, StartDateTime);
    }
    /**
     * Delete a user object.   When deleted, user resources, including their mailbox and license assignments, are moved to a temporary container and if the user is restored within 30 days, these objects are restored to them. The user is also restored to any groups they were a member of. After 30 days and if not restored, the user object is permanently deleted and their assigned resources freed. To manage the deleted user object, see deletedItems.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a user object.   When deleted, user resources, including their mailbox and license assignments, are moved to a temporary container and if the user is restored within 30 days, these objects are restored to them. The user is also restored to any groups they were a member of. After 30 days and if not restored, the user object is permanently deleted and their assigned resources freed. To manage the deleted user object, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These default properties are noted in the Properties section. To get properties that are not returned by default, do a GET operation for the user and specify the properties in a $select OData query option. Because the user resource supports extensions, you can also use the GET operation to get custom properties and extension data in a user instance. Customers through Microsoft Entra ID for customers can also use this API operation to retrieve their details.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These default properties are noted in the Properties section. To get properties that are not returned by default, do a GET operation for the user and specify the properties in a $select OData query option. Because the user resource supports extensions, you can also use the GET operation to get custom properties and extension data in a user instance. Customers through Microsoft Entra ID for customers can also use this API operation to retrieve their details.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a user object.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final User body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a user object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final User body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UserItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These default properties are noted in the Properties section. To get properties that are not returned by default, do a GET operation for the user and specify the properties in a $select OData query option. Because the user resource supports extensions, you can also use the GET operation to get custom properties and extension data in a user instance. Customers through Microsoft Entra ID for customers can also use this API operation to retrieve their details.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
