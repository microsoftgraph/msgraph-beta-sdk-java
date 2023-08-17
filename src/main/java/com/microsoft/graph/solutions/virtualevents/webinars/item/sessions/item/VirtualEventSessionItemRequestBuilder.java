package com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.VirtualEventSession;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.alternativerecording.AlternativeRecordingRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.attendancereports.AttendanceReportsRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.attendeereport.AttendeeReportRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.broadcastrecording.BroadcastRecordingRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.meetingattendancereport.MeetingAttendanceReportRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.recording.RecordingRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.recordings.RecordingsRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.registration.RegistrationRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.registrations.RegistrationsRequestBuilder;
import com.microsoft.graph.solutions.virtualevents.webinars.item.sessions.item.transcripts.TranscriptsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the sessions property of the microsoft.graph.virtualEvent entity.
 */
public class VirtualEventSessionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the solutionsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AlternativeRecordingRequestBuilder alternativeRecording() {
        return new AlternativeRecordingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attendanceReports property of the microsoft.graph.onlineMeeting entity.
     */
    @jakarta.annotation.Nonnull
    public AttendanceReportsRequestBuilder attendanceReports() {
        return new AttendanceReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the solutionsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public AttendeeReportRequestBuilder attendeeReport() {
        return new AttendeeReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the solutionsRoot entity.
     */
    @jakarta.annotation.Nonnull
    public BroadcastRecordingRequestBuilder broadcastRecording() {
        return new BroadcastRecordingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the meetingAttendanceReport property of the microsoft.graph.onlineMeeting entity.
     */
    @jakarta.annotation.Nonnull
    public MeetingAttendanceReportRequestBuilder meetingAttendanceReport() {
        return new MeetingAttendanceReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the solutionsRoot entity.
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
     * Provides operations to manage the registrations property of the microsoft.graph.virtualEventSession entity.
     */
    @jakarta.annotation.Nonnull
    public RegistrationsRequestBuilder registrations() {
        return new RegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transcripts property of the microsoft.graph.onlineMeeting entity.
     */
    @jakarta.annotation.Nonnull
    public TranscriptsRequestBuilder transcripts() {
        return new TranscriptsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new VirtualEventSessionItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VirtualEventSessionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/webinars/{virtualEventWebinar%2Did}/sessions/{virtualEventSession%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new VirtualEventSessionItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VirtualEventSessionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/virtualEvents/webinars/{virtualEventWebinar%2Did}/sessions/{virtualEventSession%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property sessions for solutions
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        return delete(null);
    }
    /**
     * Delete navigation property sessions for solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Sessions of the virtual event.
     * @return a CompletableFuture of virtualEventSession
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VirtualEventSession> get() {
        return get(null);
    }
    /**
     * Sessions of the virtual event.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of virtualEventSession
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VirtualEventSession> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, VirtualEventSession::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property sessions in solutions
     * @param body The request body
     * @return a CompletableFuture of virtualEventSession
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VirtualEventSession> patch(@jakarta.annotation.Nonnull final VirtualEventSession body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property sessions in solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of virtualEventSession
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<VirtualEventSession> patch(@jakarta.annotation.Nonnull final VirtualEventSession body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, VirtualEventSession::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property sessions for solutions
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property sessions for solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Sessions of the virtual event.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Sessions of the virtual event.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property sessions in solutions
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final VirtualEventSession body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property sessions in solutions
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final VirtualEventSession body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Sessions of the virtual event.
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
