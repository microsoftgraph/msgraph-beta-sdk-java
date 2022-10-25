package com.microsoft.graph.me;

import com.microsoft.graph.me.activateserviceplan.ActivateServicePlanRequestBuilder;
import com.microsoft.graph.me.activities.ActivitiesRequestBuilder;
import com.microsoft.graph.me.activities.item.UserActivityItemRequestBuilder;
import com.microsoft.graph.me.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.me.agreementacceptances.item.AgreementAcceptanceItemRequestBuilder;
import com.microsoft.graph.me.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.me.appconsentrequestsforapproval.AppConsentRequestsForApprovalRequestBuilder;
import com.microsoft.graph.me.appconsentrequestsforapproval.item.AppConsentRequestItemRequestBuilder;
import com.microsoft.graph.me.approleassignedresources.AppRoleAssignedResourcesRequestBuilder;
import com.microsoft.graph.me.approleassignedresources.item.ServicePrincipalItemRequestBuilder;
import com.microsoft.graph.me.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.me.approleassignments.item.AppRoleAssignmentItemRequestBuilder;
import com.microsoft.graph.me.approvals.ApprovalsRequestBuilder;
import com.microsoft.graph.me.approvals.item.ApprovalItemRequestBuilder;
import com.microsoft.graph.me.assignlicense.AssignLicenseRequestBuilder;
import com.microsoft.graph.me.authentication.AuthenticationRequestBuilder;
import com.microsoft.graph.me.calendar.CalendarRequestBuilder;
import com.microsoft.graph.me.calendargroups.CalendarGroupsRequestBuilder;
import com.microsoft.graph.me.calendargroups.item.CalendarGroupItemRequestBuilder;
import com.microsoft.graph.me.calendars.CalendarsRequestBuilder;
import com.microsoft.graph.me.calendars.item.CalendarItemRequestBuilder;
import com.microsoft.graph.me.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.me.calendarview.item.EventItemRequestBuilder;
import com.microsoft.graph.me.changepassword.ChangePasswordRequestBuilder;
import com.microsoft.graph.me.chats.ChatsRequestBuilder;
import com.microsoft.graph.me.chats.item.ChatItemRequestBuilder;
import com.microsoft.graph.me.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.me.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.me.cloudpcs.CloudPCsRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.CloudPCItemRequestBuilder;
import com.microsoft.graph.me.contactfolders.ContactFoldersRequestBuilder;
import com.microsoft.graph.me.contactfolders.item.ContactFolderItemRequestBuilder;
import com.microsoft.graph.me.contacts.ContactsRequestBuilder;
import com.microsoft.graph.me.contacts.item.ContactItemRequestBuilder;
import com.microsoft.graph.me.createdobjects.CreatedObjectsRequestBuilder;
import com.microsoft.graph.me.deviceenrollmentconfigurations.DeviceEnrollmentConfigurationsRequestBuilder;
import com.microsoft.graph.me.deviceenrollmentconfigurations.item.DeviceEnrollmentConfigurationItemRequestBuilder;
import com.microsoft.graph.me.devicemanagementtroubleshootingevents.DeviceManagementTroubleshootingEventsRequestBuilder;
import com.microsoft.graph.me.devicemanagementtroubleshootingevents.item.DeviceManagementTroubleshootingEventItemRequestBuilder;
import com.microsoft.graph.me.devices.DevicesRequestBuilder;
import com.microsoft.graph.me.devices.item.DeviceItemRequestBuilder;
import com.microsoft.graph.me.directreports.DirectReportsRequestBuilder;
import com.microsoft.graph.me.drive.DriveRequestBuilder;
import com.microsoft.graph.me.drives.DrivesRequestBuilder;
import com.microsoft.graph.me.drives.item.DriveItemRequestBuilder;
import com.microsoft.graph.me.events.EventsRequestBuilder;
import com.microsoft.graph.me.exportdeviceandappmanagementdata.ExportDeviceAndAppManagementDataRequestBuilder;
import com.microsoft.graph.me.exportdeviceandappmanagementdatawithskipwithtop.ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder;
import com.microsoft.graph.me.exportpersonaldata.ExportPersonalDataRequestBuilder;
import com.microsoft.graph.me.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.me.extensions.item.ExtensionItemRequestBuilder;
import com.microsoft.graph.me.findmeetingtimes.FindMeetingTimesRequestBuilder;
import com.microsoft.graph.me.findroomlists.FindRoomListsRequestBuilder;
import com.microsoft.graph.me.findrooms.FindRoomsRequestBuilder;
import com.microsoft.graph.me.findroomswithroomlist.FindRoomsWithRoomListRequestBuilder;
import com.microsoft.graph.me.followedsites.FollowedSitesRequestBuilder;
import com.microsoft.graph.me.followedsites.item.SiteItemRequestBuilder;
import com.microsoft.graph.me.geteffectivedeviceenrollmentconfigurations.GetEffectiveDeviceEnrollmentConfigurationsRequestBuilder;
import com.microsoft.graph.me.getloggedonmanageddevices.GetLoggedOnManagedDevicesRequestBuilder;
import com.microsoft.graph.me.getmailtips.GetMailTipsRequestBuilder;
import com.microsoft.graph.me.getmanagedappdiagnosticstatuses.GetManagedAppDiagnosticStatusesRequestBuilder;
import com.microsoft.graph.me.getmanagedapppolicies.GetManagedAppPoliciesRequestBuilder;
import com.microsoft.graph.me.getmanageddeviceswithappfailures.GetManagedDevicesWithAppFailuresRequestBuilder;
import com.microsoft.graph.me.getmanageddeviceswithfailedorpendingapps.GetManagedDevicesWithFailedOrPendingAppsRequestBuilder;
import com.microsoft.graph.me.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.me.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.me.inferenceclassification.InferenceClassificationRequestBuilder;
import com.microsoft.graph.me.informationprotection.InformationProtectionRequestBuilder;
import com.microsoft.graph.me.insights.InsightsRequestBuilder;
import com.microsoft.graph.me.invalidateallrefreshtokens.InvalidateAllRefreshTokensRequestBuilder;
import com.microsoft.graph.me.ismanagedappuserblocked.IsManagedAppUserBlockedRequestBuilder;
import com.microsoft.graph.me.joinedgroups.JoinedGroupsRequestBuilder;
import com.microsoft.graph.me.joinedteams.item.TeamItemRequestBuilder;
import com.microsoft.graph.me.joinedteams.JoinedTeamsRequestBuilder;
import com.microsoft.graph.me.licensedetails.item.LicenseDetailsItemRequestBuilder;
import com.microsoft.graph.me.licensedetails.LicenseDetailsRequestBuilder;
import com.microsoft.graph.me.mailfolders.item.MailFolderItemRequestBuilder;
import com.microsoft.graph.me.mailfolders.MailFoldersRequestBuilder;
import com.microsoft.graph.me.managedappregistrations.item.ManagedAppRegistrationItemRequestBuilder;
import com.microsoft.graph.me.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import com.microsoft.graph.me.manageddevices.item.ManagedDeviceItemRequestBuilder;
import com.microsoft.graph.me.manageddevices.ManagedDevicesRequestBuilder;
import com.microsoft.graph.me.manager.ManagerRequestBuilder;
import com.microsoft.graph.me.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.me.messages.item.MessageItemRequestBuilder;
import com.microsoft.graph.me.messages.MessagesRequestBuilder;
import com.microsoft.graph.me.mobileappintentandstates.item.MobileAppIntentAndStateItemRequestBuilder;
import com.microsoft.graph.me.mobileappintentandstates.MobileAppIntentAndStatesRequestBuilder;
import com.microsoft.graph.me.mobileapptroubleshootingevents.item.MobileAppTroubleshootingEventItemRequestBuilder;
import com.microsoft.graph.me.mobileapptroubleshootingevents.MobileAppTroubleshootingEventsRequestBuilder;
import com.microsoft.graph.me.notifications.item.NotificationItemRequestBuilder;
import com.microsoft.graph.me.notifications.NotificationsRequestBuilder;
import com.microsoft.graph.me.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import com.microsoft.graph.me.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.me.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.me.onlinemeetings.item.OnlineMeetingItemRequestBuilder;
import com.microsoft.graph.me.onlinemeetings.OnlineMeetingsRequestBuilder;
import com.microsoft.graph.me.outlook.OutlookRequestBuilder;
import com.microsoft.graph.me.owneddevices.OwnedDevicesRequestBuilder;
import com.microsoft.graph.me.ownedobjects.OwnedObjectsRequestBuilder;
import com.microsoft.graph.me.pendingaccessreviewinstances.item.AccessReviewInstanceItemRequestBuilder;
import com.microsoft.graph.me.pendingaccessreviewinstances.PendingAccessReviewInstancesRequestBuilder;
import com.microsoft.graph.me.people.item.PersonItemRequestBuilder;
import com.microsoft.graph.me.people.PeopleRequestBuilder;
import com.microsoft.graph.me.photo.PhotoRequestBuilder;
import com.microsoft.graph.me.photos.item.ProfilePhotoItemRequestBuilder;
import com.microsoft.graph.me.photos.PhotosRequestBuilder;
import com.microsoft.graph.me.planner.PlannerRequestBuilder;
import com.microsoft.graph.me.presence.PresenceRequestBuilder;
import com.microsoft.graph.me.profile.ProfileRequestBuilder;
import com.microsoft.graph.me.registereddevices.RegisteredDevicesRequestBuilder;
import com.microsoft.graph.me.reminderviewwithstartdatetimewithenddatetime.ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.me.removealldevicesfrommanagement.RemoveAllDevicesFromManagementRequestBuilder;
import com.microsoft.graph.me.reprocesslicenseassignment.ReprocessLicenseAssignmentRequestBuilder;
import com.microsoft.graph.me.restore.RestoreRequestBuilder;
import com.microsoft.graph.me.revokesigninsessions.RevokeSignInSessionsRequestBuilder;
import com.microsoft.graph.me.scopedrolememberof.item.ScopedRoleMembershipItemRequestBuilder;
import com.microsoft.graph.me.scopedrolememberof.ScopedRoleMemberOfRequestBuilder;
import com.microsoft.graph.me.security.SecurityRequestBuilder;
import com.microsoft.graph.me.sendmail.SendMailRequestBuilder;
import com.microsoft.graph.me.settings.SettingsRequestBuilder;
import com.microsoft.graph.me.tasks.TasksRequestBuilder;
import com.microsoft.graph.me.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.me.todo.TodoRequestBuilder;
import com.microsoft.graph.me.transitivememberof.TransitiveMemberOfRequestBuilder;
import com.microsoft.graph.me.transitivereports.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.me.transitivereports.TransitiveReportsRequestBuilder;
import com.microsoft.graph.me.translateexchangeids.TranslateExchangeIdsRequestBuilder;
import com.microsoft.graph.me.unblockmanagedapps.UnblockManagedAppsRequestBuilder;
import com.microsoft.graph.me.usagerights.item.UsageRightItemRequestBuilder;
import com.microsoft.graph.me.usagerights.UsageRightsRequestBuilder;
import com.microsoft.graph.me.windowsinformationprotectiondeviceregistrations.item.WindowsInformationProtectionDeviceRegistrationItemRequestBuilder;
import com.microsoft.graph.me.windowsinformationprotectiondeviceregistrations.WindowsInformationProtectionDeviceRegistrationsRequestBuilder;
import com.microsoft.graph.me.wipeandblockmanagedapps.WipeAndBlockManagedAppsRequestBuilder;
import com.microsoft.graph.me.wipemanagedappregistrationbydevicetag.WipeManagedAppRegistrationByDeviceTagRequestBuilder;
import com.microsoft.graph.me.wipemanagedappregistrationsbyazureaddeviceid.WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder;
import com.microsoft.graph.me.wipemanagedappregistrationsbydevicetag.WipeManagedAppRegistrationsByDeviceTagRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.User;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the user singleton. */
public class MeRequestBuilder {
    /** The activateServicePlan property */
    @javax.annotation.Nonnull
    public ActivateServicePlanRequestBuilder activateServicePlan() {
        return new ActivateServicePlanRequestBuilder(pathParameters, requestAdapter);
    }
    /** The activities property */
    @javax.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The agreementAcceptances property */
    @javax.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The analytics property */
    @javax.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appConsentRequestsForApproval property */
    @javax.annotation.Nonnull
    public AppConsentRequestsForApprovalRequestBuilder appConsentRequestsForApproval() {
        return new AppConsentRequestsForApprovalRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appRoleAssignedResources property */
    @javax.annotation.Nonnull
    public AppRoleAssignedResourcesRequestBuilder appRoleAssignedResources() {
        return new AppRoleAssignedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appRoleAssignments property */
    @javax.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The approvals property */
    @javax.annotation.Nonnull
    public ApprovalsRequestBuilder approvals() {
        return new ApprovalsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignLicense property */
    @javax.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /** The authentication property */
    @javax.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendar property */
    @javax.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendarGroups property */
    @javax.annotation.Nonnull
    public CalendarGroupsRequestBuilder calendarGroups() {
        return new CalendarGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendars property */
    @javax.annotation.Nonnull
    public CalendarsRequestBuilder calendars() {
        return new CalendarsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendarView property */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The changePassword property */
    @javax.annotation.Nonnull
    public ChangePasswordRequestBuilder changePassword() {
        return new ChangePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** The chats property */
    @javax.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberGroups property */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberObjects property */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The cloudPCs property */
    @javax.annotation.Nonnull
    public CloudPCsRequestBuilder cloudPCs() {
        return new CloudPCsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contactFolders property */
    @javax.annotation.Nonnull
    public ContactFoldersRequestBuilder contactFolders() {
        return new ContactFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contacts property */
    @javax.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createdObjects property */
    @javax.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceEnrollmentConfigurations property */
    @javax.annotation.Nonnull
    public DeviceEnrollmentConfigurationsRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceManagementTroubleshootingEvents property */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventsRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The devices property */
    @javax.annotation.Nonnull
    public DevicesRequestBuilder devices() {
        return new DevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The directReports property */
    @javax.annotation.Nonnull
    public DirectReportsRequestBuilder directReports() {
        return new DirectReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drive property */
    @javax.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drives property */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The events property */
    @javax.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The exportPersonalData property */
    @javax.annotation.Nonnull
    public ExportPersonalDataRequestBuilder exportPersonalData() {
        return new ExportPersonalDataRequestBuilder(pathParameters, requestAdapter);
    }
    /** The extensions property */
    @javax.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The findMeetingTimes property */
    @javax.annotation.Nonnull
    public FindMeetingTimesRequestBuilder findMeetingTimes() {
        return new FindMeetingTimesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The followedSites property */
    @javax.annotation.Nonnull
    public FollowedSitesRequestBuilder followedSites() {
        return new FollowedSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMailTips property */
    @javax.annotation.Nonnull
    public GetMailTipsRequestBuilder getMailTips() {
        return new GetMailTipsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberGroups property */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberObjects property */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The inferenceClassification property */
    @javax.annotation.Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The informationProtection property */
    @javax.annotation.Nonnull
    public InformationProtectionRequestBuilder informationProtection() {
        return new InformationProtectionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The insights property */
    @javax.annotation.Nonnull
    public InsightsRequestBuilder insights() {
        return new InsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The invalidateAllRefreshTokens property */
    @javax.annotation.Nonnull
    public InvalidateAllRefreshTokensRequestBuilder invalidateAllRefreshTokens() {
        return new InvalidateAllRefreshTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /** The joinedGroups property */
    @javax.annotation.Nonnull
    public JoinedGroupsRequestBuilder joinedGroups() {
        return new JoinedGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The joinedTeams property */
    @javax.annotation.Nonnull
    public JoinedTeamsRequestBuilder joinedTeams() {
        return new JoinedTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The licenseDetails property */
    @javax.annotation.Nonnull
    public LicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mailFolders property */
    @javax.annotation.Nonnull
    public MailFoldersRequestBuilder mailFolders() {
        return new MailFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedAppRegistrations property */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDevices property */
    @javax.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The manager property */
    @javax.annotation.Nonnull
    public ManagerRequestBuilder manager() {
        return new ManagerRequestBuilder(pathParameters, requestAdapter);
    }
    /** The memberOf property */
    @javax.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The messages property */
    @javax.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mobileAppIntentAndStates property */
    @javax.annotation.Nonnull
    public MobileAppIntentAndStatesRequestBuilder mobileAppIntentAndStates() {
        return new MobileAppIntentAndStatesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mobileAppTroubleshootingEvents property */
    @javax.annotation.Nonnull
    public MobileAppTroubleshootingEventsRequestBuilder mobileAppTroubleshootingEvents() {
        return new MobileAppTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The notifications property */
    @javax.annotation.Nonnull
    public NotificationsRequestBuilder notifications() {
        return new NotificationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The oauth2PermissionGrants property */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The onenote property */
    @javax.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /** The onlineMeetings property */
    @javax.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The outlook property */
    @javax.annotation.Nonnull
    public OutlookRequestBuilder outlook() {
        return new OutlookRequestBuilder(pathParameters, requestAdapter);
    }
    /** The ownedDevices property */
    @javax.annotation.Nonnull
    public OwnedDevicesRequestBuilder ownedDevices() {
        return new OwnedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The ownedObjects property */
    @javax.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The pendingAccessReviewInstances property */
    @javax.annotation.Nonnull
    public PendingAccessReviewInstancesRequestBuilder pendingAccessReviewInstances() {
        return new PendingAccessReviewInstancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The people property */
    @javax.annotation.Nonnull
    public PeopleRequestBuilder people() {
        return new PeopleRequestBuilder(pathParameters, requestAdapter);
    }
    /** The photo property */
    @javax.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /** The photos property */
    @javax.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /** The planner property */
    @javax.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /** The presence property */
    @javax.annotation.Nonnull
    public PresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The profile property */
    @javax.annotation.Nonnull
    public ProfileRequestBuilder profile() {
        return new ProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /** The registeredDevices property */
    @javax.annotation.Nonnull
    public RegisteredDevicesRequestBuilder registeredDevices() {
        return new RegisteredDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The removeAllDevicesFromManagement property */
    @javax.annotation.Nonnull
    public RemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new RemoveAllDevicesFromManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reprocessLicenseAssignment property */
    @javax.annotation.Nonnull
    public ReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new ReprocessLicenseAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The restore property */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** The revokeSignInSessions property */
    @javax.annotation.Nonnull
    public RevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new RevokeSignInSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The scopedRoleMemberOf property */
    @javax.annotation.Nonnull
    public ScopedRoleMemberOfRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The security property */
    @javax.annotation.Nonnull
    public SecurityRequestBuilder security() {
        return new SecurityRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sendMail property */
    @javax.annotation.Nonnull
    public SendMailRequestBuilder sendMail() {
        return new SendMailRequestBuilder(pathParameters, requestAdapter);
    }
    /** The settings property */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The tasks property */
    @javax.annotation.Nonnull
    public TasksRequestBuilder tasks() {
        return new TasksRequestBuilder(pathParameters, requestAdapter);
    }
    /** The teamwork property */
    @javax.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /** The todo property */
    @javax.annotation.Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(pathParameters, requestAdapter);
    }
    /** The transitiveMemberOf property */
    @javax.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The transitiveReports property */
    @javax.annotation.Nonnull
    public TransitiveReportsRequestBuilder transitiveReports() {
        return new TransitiveReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The translateExchangeIds property */
    @javax.annotation.Nonnull
    public TranslateExchangeIdsRequestBuilder translateExchangeIds() {
        return new TranslateExchangeIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unblockManagedApps property */
    @javax.annotation.Nonnull
    public UnblockManagedAppsRequestBuilder unblockManagedApps() {
        return new UnblockManagedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** The usageRights property */
    @javax.annotation.Nonnull
    public UsageRightsRequestBuilder usageRights() {
        return new UsageRightsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The windowsInformationProtectionDeviceRegistrations property */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionDeviceRegistrationsRequestBuilder windowsInformationProtectionDeviceRegistrations() {
        return new WindowsInformationProtectionDeviceRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The wipeAndBlockManagedApps property */
    @javax.annotation.Nonnull
    public WipeAndBlockManagedAppsRequestBuilder wipeAndBlockManagedApps() {
        return new WipeAndBlockManagedAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The wipeManagedAppRegistrationByDeviceTag property */
    @javax.annotation.Nonnull
    public WipeManagedAppRegistrationByDeviceTagRequestBuilder wipeManagedAppRegistrationByDeviceTag() {
        return new WipeManagedAppRegistrationByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /** The wipeManagedAppRegistrationsByAzureAdDeviceId property */
    @javax.annotation.Nonnull
    public WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder wipeManagedAppRegistrationsByAzureAdDeviceId() {
        return new WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder(pathParameters, requestAdapter);
    }
    /** The wipeManagedAppRegistrationsByDeviceTag property */
    @javax.annotation.Nonnull
    public WipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag() {
        return new WipeManagedAppRegistrationsByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.activities.item collection
     * @param id Unique identifier of the item
     * @return a UserActivityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserActivityItemRequestBuilder activities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userActivity%2Did", id);
        return new UserActivityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.agreementAcceptances.item collection
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
     * Gets an item from the com.Microsoft.Graph.me.appConsentRequestsForApproval.item collection
     * @param id Unique identifier of the item
     * @return a AppConsentRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AppConsentRequestItemRequestBuilder appConsentRequestsForApproval(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appConsentRequest%2Did", id);
        return new AppConsentRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.appRoleAssignedResources.item collection
     * @param id Unique identifier of the item
     * @return a ServicePrincipalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ServicePrincipalItemRequestBuilder appRoleAssignedResources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("servicePrincipal%2Did", id);
        return new ServicePrincipalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.appRoleAssignments.item collection
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
     * Gets an item from the com.Microsoft.Graph.me.approvals.item collection
     * @param id Unique identifier of the item
     * @return a ApprovalItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ApprovalItemRequestBuilder approvals(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("approval%2Did", id);
        return new ApprovalItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.calendarGroups.item collection
     * @param id Unique identifier of the item
     * @return a CalendarGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CalendarGroupItemRequestBuilder calendarGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("calendarGroup%2Did", id);
        return new CalendarGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.calendars.item collection
     * @param id Unique identifier of the item
     * @return a CalendarItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CalendarItemRequestBuilder calendars(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("calendar%2Did", id);
        return new CalendarItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.calendarView.item collection
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.calendarview.item.EventItemRequestBuilder calendarView(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new com.microsoft.graph.me.calendarview.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.chats.item collection
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
     * Gets an item from the com.Microsoft.Graph.me.cloudPCs.item collection
     * @param id Unique identifier of the item
     * @return a CloudPCItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPCItemRequestBuilder cloudPCs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPC%2Did", id);
        return new CloudPCItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new MeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new MeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.contactFolders.item collection
     * @param id Unique identifier of the item
     * @return a ContactFolderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContactFolderItemRequestBuilder contactFolders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contactFolder%2Did", id);
        return new ContactFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.contacts.item collection
     * @param id Unique identifier of the item
     * @return a ContactItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContactItemRequestBuilder contacts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contact%2Did", id);
        return new ContactItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.createdObjects.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.createdobjects.item.DirectoryObjectItemRequestBuilder createdObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.me.createdobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These _default_ properties are noted in the Properties section. To get properties that are _not_ returned by default, do a GET operation for the user and specify the properties in a `$select` OData query option. Because the **user** resource supports extensions, you can also use the `GET` operation to get custom properties and extension data in a **user** instance.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These _default_ properties are noted in the Properties section. To get properties that are _not_ returned by default, do a GET operation for the user and specify the properties in a `$select` OData query option. Because the **user** resource supports extensions, you can also use the `GET` operation to get custom properties and extension data in a **user** instance.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final MeRequestBuilderGetRequestConfiguration requestConfig = new MeRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final User body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final MeRequestBuilderPatchRequestConfiguration requestConfig = new MeRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.deviceEnrollmentConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a DeviceEnrollmentConfigurationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceEnrollmentConfigurationItemRequestBuilder deviceEnrollmentConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceEnrollmentConfiguration%2Did", id);
        return new DeviceEnrollmentConfigurationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.deviceManagementTroubleshootingEvents.item collection
     * @param id Unique identifier of the item
     * @return a DeviceManagementTroubleshootingEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventItemRequestBuilder deviceManagementTroubleshootingEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementTroubleshootingEvent%2Did", id);
        return new DeviceManagementTroubleshootingEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.devices.item collection
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
     * Gets an item from the com.Microsoft.Graph.me.directReports.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.directreports.item.DirectoryObjectItemRequestBuilder directReports(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.me.directreports.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.drives.item collection
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
     * Gets an item from the com.Microsoft.Graph.me.events.item collection
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.events.item.EventItemRequestBuilder events(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new com.microsoft.graph.me.events.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the exportDeviceAndAppManagementData method.
     * @return a exportDeviceAndAppManagementDataRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData() {
        return new ExportDeviceAndAppManagementDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exportDeviceAndAppManagementData method.
     * @param skip Usage: skip={skip}
     * @param top Usage: top={top}
     * @return a exportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder exportDeviceAndAppManagementDataWithSkipWithTop(@javax.annotation.Nonnull final Integer skip, @javax.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(skip);
        Objects.requireNonNull(top);
        return new ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder(pathParameters, requestAdapter, skip, top);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.extensions.item collection
     * @param id Unique identifier of the item
     * @return a ExtensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExtensionItemRequestBuilder extensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("extension%2Did", id);
        return new ExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the findRoomLists method.
     * @return a findRoomListsRequestBuilder
     */
    @javax.annotation.Nonnull
    public FindRoomListsRequestBuilder findRoomLists() {
        return new FindRoomListsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findRooms method.
     * @return a findRoomsRequestBuilder
     */
    @javax.annotation.Nonnull
    public FindRoomsRequestBuilder findRooms() {
        return new FindRoomsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findRooms method.
     * @param RoomList Usage: RoomList='{RoomList}'
     * @return a findRoomsWithRoomListRequestBuilder
     */
    @javax.annotation.Nonnull
    public FindRoomsWithRoomListRequestBuilder findRoomsWithRoomList(@javax.annotation.Nonnull final String roomList) {
        Objects.requireNonNull(roomList);
        return new FindRoomsWithRoomListRequestBuilder(pathParameters, requestAdapter, roomList);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.followedSites.item collection
     * @param id Unique identifier of the item
     * @return a SiteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SiteItemRequestBuilder followedSites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did", id);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These _default_ properties are noted in the Properties section. To get properties that are _not_ returned by default, do a GET operation for the user and specify the properties in a `$select` OData query option. Because the **user** resource supports extensions, you can also use the `GET` operation to get custom properties and extension data in a **user** instance.
     * @return a CompletableFuture of user
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<User>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These _default_ properties are noted in the Properties section. To get properties that are _not_ returned by default, do a GET operation for the user and specify the properties in a `$select` OData query option. Because the **user** resource supports extensions, you can also use the `GET` operation to get custom properties and extension data in a **user** instance.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<User>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the getEffectiveDeviceEnrollmentConfigurations method.
     * @return a getEffectiveDeviceEnrollmentConfigurationsRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetEffectiveDeviceEnrollmentConfigurationsRequestBuilder getEffectiveDeviceEnrollmentConfigurations() {
        return new GetEffectiveDeviceEnrollmentConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getLoggedOnManagedDevices method.
     * @return a getLoggedOnManagedDevicesRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetLoggedOnManagedDevicesRequestBuilder getLoggedOnManagedDevices() {
        return new GetLoggedOnManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppDiagnosticStatuses method.
     * @return a getManagedAppDiagnosticStatusesRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetManagedAppDiagnosticStatusesRequestBuilder getManagedAppDiagnosticStatuses() {
        return new GetManagedAppDiagnosticStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppPolicies method.
     * @return a getManagedAppPoliciesRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetManagedAppPoliciesRequestBuilder getManagedAppPolicies() {
        return new GetManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedDevicesWithAppFailures method.
     * @return a getManagedDevicesWithAppFailuresRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetManagedDevicesWithAppFailuresRequestBuilder getManagedDevicesWithAppFailures() {
        return new GetManagedDevicesWithAppFailuresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedDevicesWithFailedOrPendingApps method.
     * @return a getManagedDevicesWithFailedOrPendingAppsRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetManagedDevicesWithFailedOrPendingAppsRequestBuilder getManagedDevicesWithFailedOrPendingApps() {
        return new GetManagedDevicesWithFailedOrPendingAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isManagedAppUserBlocked method.
     * @return a isManagedAppUserBlockedRequestBuilder
     */
    @javax.annotation.Nonnull
    public IsManagedAppUserBlockedRequestBuilder isManagedAppUserBlocked() {
        return new IsManagedAppUserBlockedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.joinedTeams.item collection
     * @param id Unique identifier of the item
     * @return a TeamItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamItemRequestBuilder joinedTeams(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("team%2Did", id);
        return new TeamItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.licenseDetails.item collection
     * @param id Unique identifier of the item
     * @return a LicenseDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LicenseDetailsItemRequestBuilder licenseDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("licenseDetails%2Did", id);
        return new LicenseDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.mailFolders.item collection
     * @param id Unique identifier of the item
     * @return a MailFolderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MailFolderItemRequestBuilder mailFolders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mailFolder%2Did", id);
        return new MailFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.managedAppRegistrations.item collection
     * @param id Unique identifier of the item
     * @return a ManagedAppRegistrationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationItemRequestBuilder managedAppRegistrations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppRegistration%2Did", id);
        return new ManagedAppRegistrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.managedDevices.item collection
     * @param id Unique identifier of the item
     * @return a ManagedDeviceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceItemRequestBuilder managedDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDevice%2Did", id);
        return new ManagedDeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.memberOf.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.memberof.item.DirectoryObjectItemRequestBuilder memberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.me.memberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.messages.item collection
     * @param id Unique identifier of the item
     * @return a MessageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MessageItemRequestBuilder messages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("message%2Did", id);
        return new MessageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.mobileAppIntentAndStates.item collection
     * @param id Unique identifier of the item
     * @return a MobileAppIntentAndStateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobileAppIntentAndStateItemRequestBuilder mobileAppIntentAndStates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileAppIntentAndState%2Did", id);
        return new MobileAppIntentAndStateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.mobileAppTroubleshootingEvents.item collection
     * @param id Unique identifier of the item
     * @return a MobileAppTroubleshootingEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MobileAppTroubleshootingEventItemRequestBuilder mobileAppTroubleshootingEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mobileAppTroubleshootingEvent%2Did", id);
        return new MobileAppTroubleshootingEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.notifications.item collection
     * @param id Unique identifier of the item
     * @return a NotificationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public NotificationItemRequestBuilder notifications(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("notification%2Did", id);
        return new NotificationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.oauth2PermissionGrants.item collection
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
     * Gets an item from the com.Microsoft.Graph.me.onlineMeetings.item collection
     * @param id Unique identifier of the item
     * @return a OnlineMeetingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OnlineMeetingItemRequestBuilder onlineMeetings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("onlineMeeting%2Did", id);
        return new OnlineMeetingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.ownedDevices.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.owneddevices.item.DirectoryObjectItemRequestBuilder ownedDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.me.owneddevices.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.ownedObjects.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.ownedobjects.item.DirectoryObjectItemRequestBuilder ownedObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.me.ownedobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @return a CompletableFuture of user
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> patch(@javax.annotation.Nonnull final User body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<User>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> patch(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<User>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.pendingAccessReviewInstances.item collection
     * @param id Unique identifier of the item
     * @return a AccessReviewInstanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AccessReviewInstanceItemRequestBuilder pendingAccessReviewInstances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("accessReviewInstance%2Did", id);
        return new AccessReviewInstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.people.item collection
     * @param id Unique identifier of the item
     * @return a PersonItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonItemRequestBuilder people(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("person%2Did", id);
        return new PersonItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.photos.item collection
     * @param id Unique identifier of the item
     * @return a ProfilePhotoItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProfilePhotoItemRequestBuilder photos(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("profilePhoto%2Did", id);
        return new ProfilePhotoItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.registeredDevices.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.registereddevices.item.DirectoryObjectItemRequestBuilder registeredDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.me.registereddevices.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the reminderView method.
     * @param EndDateTime Usage: EndDateTime='{EndDateTime}'
     * @param StartDateTime Usage: StartDateTime='{StartDateTime}'
     * @return a reminderViewWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @javax.annotation.Nonnull
    public ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder reminderViewWithStartDateTimeWithEndDateTime(@javax.annotation.Nonnull final String endDateTime, @javax.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.scopedRoleMemberOf.item collection
     * @param id Unique identifier of the item
     * @return a ScopedRoleMembershipItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ScopedRoleMembershipItemRequestBuilder scopedRoleMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("scopedRoleMembership%2Did", id);
        return new ScopedRoleMembershipItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.transitiveMemberOf.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.transitivememberof.item.DirectoryObjectItemRequestBuilder transitiveMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.me.transitivememberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.transitiveReports.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.me.transitivereports.item.DirectoryObjectItemRequestBuilder transitiveReports(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.me.transitivereports.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.usageRights.item collection
     * @param id Unique identifier of the item
     * @return a UsageRightItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UsageRightItemRequestBuilder usageRights(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("usageRight%2Did", id);
        return new UsageRightItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.me.windowsInformationProtectionDeviceRegistrations.item collection
     * @param id Unique identifier of the item
     * @return a WindowsInformationProtectionDeviceRegistrationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WindowsInformationProtectionDeviceRegistrationItemRequestBuilder windowsInformationProtectionDeviceRegistrations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsInformationProtectionDeviceRegistration%2Did", id);
        return new WindowsInformationProtectionDeviceRegistrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Retrieve the properties and relationships of user object. This operation returns by default only a subset of the more commonly used properties for each user. These _default_ properties are noted in the Properties section. To get properties that are _not_ returned by default, do a GET operation for the user and specify the properties in a `$select` OData query option. Because the **user** resource supports extensions, you can also use the `GET` operation to get custom properties and extension data in a **user** instance. */
    public class MeRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class MeRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public MeRequestBuilderGetQueryParameters queryParameters = new MeRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new meRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public MeRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class MeRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new meRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public MeRequestBuilderPatchRequestConfiguration() {
        }
    }
}
