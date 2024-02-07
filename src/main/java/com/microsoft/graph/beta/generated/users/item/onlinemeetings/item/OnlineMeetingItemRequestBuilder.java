package com.microsoft.graph.beta.users.item.onlinemeetings.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.OnlineMeeting;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.alternativerecording.AlternativeRecordingRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.attendancereports.AttendanceReportsRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.attendeereport.AttendeeReportRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.broadcastrecording.BroadcastRecordingRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.getvirtualappointmentjoinweburl.GetVirtualAppointmentJoinWebUrlRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.meetingattendancereport.MeetingAttendanceReportRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.recording.RecordingRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.recordings.RecordingsRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.registration.RegistrationRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.sendvirtualappointmentremindersms.SendVirtualAppointmentReminderSmsRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.sendvirtualappointmentsms.SendVirtualAppointmentSmsRequestBuilder;
import com.microsoft.graph.beta.users.item.onlinemeetings.item.transcripts.TranscriptsRequestBuilder;
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
 * Provides operations to manage the onlineMeetings property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnlineMeetingItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the user entity.
     */
    @jakarta.annotation.Nonnull
    public AlternativeRecordingRequestBuilder alternativeRecording() {
        return new AlternativeRecordingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attendanceReports property of the microsoft.graph.onlineMeetingBase entity.
     */
    @jakarta.annotation.Nonnull
    public AttendanceReportsRequestBuilder attendanceReports() {
        return new AttendanceReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the user entity.
     */
    @jakarta.annotation.Nonnull
    public AttendeeReportRequestBuilder attendeeReport() {
        return new AttendeeReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the user entity.
     */
    @jakarta.annotation.Nonnull
    public BroadcastRecordingRequestBuilder broadcastRecording() {
        return new BroadcastRecordingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getVirtualAppointmentJoinWebUrl method.
     */
    @jakarta.annotation.Nonnull
    public GetVirtualAppointmentJoinWebUrlRequestBuilder getVirtualAppointmentJoinWebUrl() {
        return new GetVirtualAppointmentJoinWebUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the meetingAttendanceReport property of the microsoft.graph.onlineMeeting entity.
     */
    @jakarta.annotation.Nonnull
    public MeetingAttendanceReportRequestBuilder meetingAttendanceReport() {
        return new MeetingAttendanceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the user entity.
     */
    @jakarta.annotation.Nonnull
    public RecordingRequestBuilder recording() {
        return new RecordingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the recordings property of the microsoft.graph.onlineMeeting entity.
     */
    @jakarta.annotation.Nonnull
    public RecordingsRequestBuilder recordings() {
        return new RecordingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the registration property of the microsoft.graph.onlineMeeting entity.
     */
    @jakarta.annotation.Nonnull
    public RegistrationRequestBuilder registration() {
        return new RegistrationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendVirtualAppointmentReminderSms method.
     */
    @jakarta.annotation.Nonnull
    public SendVirtualAppointmentReminderSmsRequestBuilder sendVirtualAppointmentReminderSms() {
        return new SendVirtualAppointmentReminderSmsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendVirtualAppointmentSms method.
     */
    @jakarta.annotation.Nonnull
    public SendVirtualAppointmentSmsRequestBuilder sendVirtualAppointmentSms() {
        return new SendVirtualAppointmentSmsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transcripts property of the microsoft.graph.onlineMeeting entity.
     */
    @jakarta.annotation.Nonnull
    public TranscriptsRequestBuilder transcripts() {
        return new TranscriptsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OnlineMeetingItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnlineMeetingItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/onlineMeetings/{onlineMeeting%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OnlineMeetingItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnlineMeetingItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/onlineMeetings/{onlineMeeting%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete an onlineMeeting object.
     * @see <a href="https://learn.microsoft.com/graph/api/onlinemeeting-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete an onlineMeeting object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/onlinemeeting-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Information about a meeting, including the URL used to join a meeting, the attendees list, and the description.
     * @return a OnlineMeeting
     */
    @jakarta.annotation.Nullable
    public OnlineMeeting get() {
        return get(null);
    }
    /**
     * Information about a meeting, including the URL used to join a meeting, the attendees list, and the description.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OnlineMeeting
     */
    @jakarta.annotation.Nullable
    public OnlineMeeting get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnlineMeeting::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of the specified onlineMeeting object. Please see Request body section for the list of properties that support updating.
     * @param body The request body
     * @return a OnlineMeeting
     * @see <a href="https://learn.microsoft.com/graph/api/onlinemeeting-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OnlineMeeting patch(@jakarta.annotation.Nonnull final OnlineMeeting body) {
        return patch(body, null);
    }
    /**
     * Update the properties of the specified onlineMeeting object. Please see Request body section for the list of properties that support updating.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OnlineMeeting
     * @see <a href="https://learn.microsoft.com/graph/api/onlinemeeting-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public OnlineMeeting patch(@jakarta.annotation.Nonnull final OnlineMeeting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnlineMeeting::createFromDiscriminatorValue);
    }
    /**
     * Delete an onlineMeeting object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an onlineMeeting object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Information about a meeting, including the URL used to join a meeting, the attendees list, and the description.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Information about a meeting, including the URL used to join a meeting, the attendees list, and the description.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of the specified onlineMeeting object. Please see Request body section for the list of properties that support updating.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnlineMeeting body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of the specified onlineMeeting object. Please see Request body section for the list of properties that support updating.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnlineMeeting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a OnlineMeetingItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OnlineMeetingItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OnlineMeetingItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Information about a meeting, including the URL used to join a meeting, the attendees list, and the description.
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
         * @return a Map<String, Object>
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
