package com.microsoft.graph.app.onlinemeetings.item;

import com.microsoft.graph.app.onlinemeetings.item.alternativerecording.AlternativeRecordingRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.attendancereports.AttendanceReportsRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.attendeereport.AttendeeReportRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.broadcastrecording.BroadcastRecordingRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.getvirtualappointmentjoinweburl.GetVirtualAppointmentJoinWebUrlRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.meetingattendancereport.MeetingAttendanceReportRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.recording.RecordingRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.recordings.RecordingsRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.registration.RegistrationRequestBuilder;
import com.microsoft.graph.app.onlinemeetings.item.transcripts.TranscriptsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OnlineMeeting;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the onlineMeetings property of the microsoft.graph.commsApplication entity.
 */
public class OnlineMeetingItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the commsApplication entity.
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
     * Provides operations to manage the media for the commsApplication entity.
     */
    @jakarta.annotation.Nonnull
    public AttendeeReportRequestBuilder attendeeReport() {
        return new AttendeeReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the media for the commsApplication entity.
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
     * Provides operations to manage the media for the commsApplication entity.
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
     * @return a void
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/onlineMeetings/{onlineMeeting%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OnlineMeetingItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public OnlineMeetingItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/app/onlineMeetings/{onlineMeeting%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property onlineMeetings for app
     * @return a CompletableFuture of void
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property onlineMeetings for app
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get onlineMeetings from app
     * @return a CompletableFuture of onlineMeeting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnlineMeeting> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OnlineMeeting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OnlineMeeting> executionException = new java.util.concurrent.CompletableFuture<OnlineMeeting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get onlineMeetings from app
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of onlineMeeting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnlineMeeting> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OnlineMeeting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OnlineMeeting> executionException = new java.util.concurrent.CompletableFuture<OnlineMeeting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property onlineMeetings in app
     * @param body The request body
     * @return a CompletableFuture of onlineMeeting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnlineMeeting> patch(@jakarta.annotation.Nonnull final OnlineMeeting body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OnlineMeeting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OnlineMeeting> executionException = new java.util.concurrent.CompletableFuture<OnlineMeeting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property onlineMeetings in app
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of onlineMeeting
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnlineMeeting> patch(@jakarta.annotation.Nonnull final OnlineMeeting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OnlineMeeting::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OnlineMeeting> executionException = new java.util.concurrent.CompletableFuture<OnlineMeeting>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property onlineMeetings for app
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property onlineMeetings for app
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get onlineMeetings from app
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get onlineMeetings from app
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update the navigation property onlineMeetings in app
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnlineMeeting body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property onlineMeetings in app
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnlineMeeting body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get onlineMeetings from app
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
