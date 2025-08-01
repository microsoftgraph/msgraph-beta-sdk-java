package com.microsoft.graph.beta.communications;

import com.microsoft.graph.beta.communications.callrecords.CallRecordsRequestBuilder;
import com.microsoft.graph.beta.communications.calls.CallsRequestBuilder;
import com.microsoft.graph.beta.communications.getallonlinemeetingmessages.GetAllOnlineMeetingMessagesRequestBuilder;
import com.microsoft.graph.beta.communications.getpresencesbyuserid.GetPresencesByUserIdRequestBuilder;
import com.microsoft.graph.beta.communications.onlinemeetingconversations.OnlineMeetingConversationsRequestBuilder;
import com.microsoft.graph.beta.communications.onlinemeetings.OnlineMeetingsRequestBuilder;
import com.microsoft.graph.beta.communications.onlinemeetingswithjoinweburl.OnlineMeetingsWithJoinWebUrlRequestBuilder;
import com.microsoft.graph.beta.communications.presences.PresencesRequestBuilder;
import com.microsoft.graph.beta.models.CloudCommunications;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the cloudCommunications singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CommunicationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the callRecords property of the microsoft.graph.cloudCommunications entity.
     * @return a {@link CallRecordsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CallRecordsRequestBuilder callRecords() {
        return new CallRecordsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calls property of the microsoft.graph.cloudCommunications entity.
     * @return a {@link CallsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CallsRequestBuilder calls() {
        return new CallsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAllOnlineMeetingMessages method.
     * @return a {@link GetAllOnlineMeetingMessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAllOnlineMeetingMessagesRequestBuilder getAllOnlineMeetingMessages() {
        return new GetAllOnlineMeetingMessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getPresencesByUserId method.
     * @return a {@link GetPresencesByUserIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetPresencesByUserIdRequestBuilder getPresencesByUserId() {
        return new GetPresencesByUserIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onlineMeetingConversations property of the microsoft.graph.cloudCommunications entity.
     * @return a {@link OnlineMeetingConversationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnlineMeetingConversationsRequestBuilder onlineMeetingConversations() {
        return new OnlineMeetingConversationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.cloudCommunications entity.
     * @return a {@link OnlineMeetingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the presences property of the microsoft.graph.cloudCommunications entity.
     * @return a {@link PresencesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PresencesRequestBuilder presences() {
        return new PresencesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CommunicationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CommunicationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CommunicationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CommunicationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get communications
     * @return a {@link CloudCommunications}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudCommunications get() {
        return get(null);
    }
    /**
     * Get communications
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudCommunications}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudCommunications get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudCommunications::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.cloudCommunications entity.
     * @param joinWebUrl Alternate key of onlineMeeting
     * @return a {@link OnlineMeetingsWithJoinWebUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnlineMeetingsWithJoinWebUrlRequestBuilder onlineMeetingsWithJoinWebUrl(@jakarta.annotation.Nonnull final String joinWebUrl) {
        Objects.requireNonNull(joinWebUrl);
        return new OnlineMeetingsWithJoinWebUrlRequestBuilder(pathParameters, requestAdapter, joinWebUrl);
    }
    /**
     * Update communications
     * @param body Represents a container that exposes navigation properties for cloud communications resources.
     * @return a {@link CloudCommunications}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudCommunications patch(@jakarta.annotation.Nonnull final CloudCommunications body) {
        return patch(body, null);
    }
    /**
     * Update communications
     * @param body Represents a container that exposes navigation properties for cloud communications resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudCommunications}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudCommunications patch(@jakarta.annotation.Nonnull final CloudCommunications body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudCommunications::createFromDiscriminatorValue);
    }
    /**
     * Get communications
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get communications
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
     * Update communications
     * @param body Represents a container that exposes navigation properties for cloud communications resources.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudCommunications body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update communications
     * @param body Represents a container that exposes navigation properties for cloud communications resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudCommunications body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CommunicationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CommunicationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CommunicationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get communications
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
