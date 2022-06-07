package microsoft.graph.me.devices.item.registeredowners.item.user;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.me.devices.item.registeredowners.item.user.activateserviceplan.ActivateServicePlanRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.assignlicense.AssignLicenseRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.changepassword.ChangePasswordRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.checkmembergroups.CheckMemberGroupsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.exportdeviceandappmanagementdata.ExportDeviceAndAppManagementDataRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.exportdeviceandappmanagementdatawithskipwithtop.ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.exportpersonaldata.ExportPersonalDataRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.findmeetingtimes.FindMeetingTimesRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.findroomlists.FindRoomListsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.findrooms.FindRoomsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.findroomswithroomlist.FindRoomsWithRoomListRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.geteffectivedeviceenrollmentconfigurations.GetEffectiveDeviceEnrollmentConfigurationsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.getloggedonmanageddevices.GetLoggedOnManagedDevicesRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.getmailtips.GetMailTipsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.getmanagedappdiagnosticstatuses.GetManagedAppDiagnosticStatusesRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.getmanagedapppolicies.GetManagedAppPoliciesRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.getmanageddeviceswithappfailures.GetManagedDevicesWithAppFailuresRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.getmanageddeviceswithfailedorpendingapps.GetManagedDevicesWithFailedOrPendingAppsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.getmembergroups.GetMemberGroupsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.getmemberobjects.GetMemberObjectsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.invalidateallrefreshtokens.InvalidateAllRefreshTokensRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.ismanagedappuserblocked.IsManagedAppUserBlockedRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.reminderviewwithstartdatetimewithenddatetime.ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.removealldevicesfrommanagement.RemoveAllDevicesFromManagementRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.reprocesslicenseassignment.ReprocessLicenseAssignmentRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.restore.RestoreRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.revokesigninsessions.RevokeSignInSessionsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.sendmail.SendMailRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.translateexchangeids.TranslateExchangeIdsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.unblockmanagedapps.UnblockManagedAppsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.wipeandblockmanagedapps.WipeAndBlockManagedAppsRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.wipemanagedappregistrationbydevicetag.WipeManagedAppRegistrationByDeviceTagRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.wipemanagedappregistrationsbyazureaddeviceid.WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder;
import microsoft.graph.me.devices.item.registeredowners.item.user.wipemanagedappregistrationsbydevicetag.WipeManagedAppRegistrationsByDeviceTagRequestBuilder;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.User;
/** Casts the previous resource to user. */
public class UserRequestBuilder {
    /** The activateServicePlan property */
    @javax.annotation.Nonnull
    public ActivateServicePlanRequestBuilder activateServicePlan() {
        return new ActivateServicePlanRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignLicense property */
    @javax.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /** The changePassword property */
    @javax.annotation.Nonnull
    public ChangePasswordRequestBuilder changePassword() {
        return new ChangePasswordRequestBuilder(pathParameters, requestAdapter);
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
    /** The exportPersonalData property */
    @javax.annotation.Nonnull
    public ExportPersonalDataRequestBuilder exportPersonalData() {
        return new ExportPersonalDataRequestBuilder(pathParameters, requestAdapter);
    }
    /** The findMeetingTimes property */
    @javax.annotation.Nonnull
    public FindMeetingTimesRequestBuilder findMeetingTimes() {
        return new FindMeetingTimesRequestBuilder(pathParameters, requestAdapter);
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
    /** The invalidateAllRefreshTokens property */
    @javax.annotation.Nonnull
    public InvalidateAllRefreshTokensRequestBuilder invalidateAllRefreshTokens() {
        return new InvalidateAllRefreshTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
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
    private final RequestAdapter requestAdapter;
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
    /** The sendMail property */
    @javax.annotation.Nonnull
    public SendMailRequestBuilder sendMail() {
        return new SendMailRequestBuilder(pathParameters, requestAdapter);
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
    private final String urlTemplate;
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
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public UserRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/devices/{device%2Did}/registeredOwners/{directoryObject%2Did}/microsoft.graph.user{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public UserRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/devices/{device%2Did}/registeredOwners/{directoryObject%2Did}/microsoft.graph.user{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.user
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<UserRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final UserRequestBuilderGetRequestConfiguration requestConfig = new UserRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
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
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.user
     * @return a CompletableFuture of user
     */
    public java.util.concurrent.CompletableFuture<User> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     */
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<UserRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get the item of type microsoft.graph.directoryObject as microsoft.graph.user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of user
     */
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<UserRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
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
    /** Get the item of type microsoft.graph.directoryObject as microsoft.graph.user */
    public class UserRequestBuilderGetQueryParameters {
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
    public class UserRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public UserRequestBuilderGetQueryParameters queryParameters = new UserRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new userRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public UserRequestBuilderGetRequestConfiguration() {
        }
    }
}
