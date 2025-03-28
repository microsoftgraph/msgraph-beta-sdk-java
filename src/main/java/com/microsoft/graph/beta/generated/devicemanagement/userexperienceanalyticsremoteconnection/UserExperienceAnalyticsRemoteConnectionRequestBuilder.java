package com.microsoft.graph.beta.devicemanagement.userexperienceanalyticsremoteconnection;

import com.microsoft.graph.beta.devicemanagement.userexperienceanalyticsremoteconnection.count.CountRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.userexperienceanalyticsremoteconnection.item.UserExperienceAnalyticsRemoteConnectionItemRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.userexperienceanalyticsremoteconnection.summarizedeviceremoteconnectionwithsummarizeby.SummarizeDeviceRemoteConnectionWithSummarizeByRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.UserExperienceAnalyticsRemoteConnection;
import com.microsoft.graph.beta.models.UserExperienceAnalyticsRemoteConnectionCollectionResponse;
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
 * Provides operations to manage the userExperienceAnalyticsRemoteConnection property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsRemoteConnectionRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsRemoteConnection property of the microsoft.graph.deviceManagement entity.
     * @param userExperienceAnalyticsRemoteConnectionId The unique identifier of userExperienceAnalyticsRemoteConnection
     * @return a {@link UserExperienceAnalyticsRemoteConnectionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsRemoteConnectionItemRequestBuilder byUserExperienceAnalyticsRemoteConnectionId(@jakarta.annotation.Nonnull final String userExperienceAnalyticsRemoteConnectionId) {
        Objects.requireNonNull(userExperienceAnalyticsRemoteConnectionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userExperienceAnalyticsRemoteConnection%2Did", userExperienceAnalyticsRemoteConnectionId);
        return new UserExperienceAnalyticsRemoteConnectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link UserExperienceAnalyticsRemoteConnectionRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserExperienceAnalyticsRemoteConnectionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/userExperienceAnalyticsRemoteConnection{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link UserExperienceAnalyticsRemoteConnectionRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserExperienceAnalyticsRemoteConnectionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/userExperienceAnalyticsRemoteConnection{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * User experience analytics remote connection. The report will be retired on December 31, 2024. You can start using the Cloud PC connection quality report now via https://learn.microsoft.com/windows-365/enterprise/report-cloud-pc-connection-quality.
     * @return a {@link UserExperienceAnalyticsRemoteConnectionCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsRemoteConnectionCollectionResponse get() {
        return get(null);
    }
    /**
     * User experience analytics remote connection. The report will be retired on December 31, 2024. You can start using the Cloud PC connection quality report now via https://learn.microsoft.com/windows-365/enterprise/report-cloud-pc-connection-quality.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserExperienceAnalyticsRemoteConnectionCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsRemoteConnectionCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserExperienceAnalyticsRemoteConnectionCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to userExperienceAnalyticsRemoteConnection for deviceManagement
     * @param body The request body
     * @return a {@link UserExperienceAnalyticsRemoteConnection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsRemoteConnection post(@jakarta.annotation.Nonnull final UserExperienceAnalyticsRemoteConnection body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to userExperienceAnalyticsRemoteConnection for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserExperienceAnalyticsRemoteConnection}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsRemoteConnection post(@jakarta.annotation.Nonnull final UserExperienceAnalyticsRemoteConnection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserExperienceAnalyticsRemoteConnection::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the summarizeDeviceRemoteConnection method.
     * @param summarizeBy Usage: summarizeBy=&apos;{summarizeBy}&apos;
     * @return a {@link SummarizeDeviceRemoteConnectionWithSummarizeByRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SummarizeDeviceRemoteConnectionWithSummarizeByRequestBuilder summarizeDeviceRemoteConnectionWithSummarizeBy(@jakarta.annotation.Nonnull final String summarizeBy) {
        Objects.requireNonNull(summarizeBy);
        return new SummarizeDeviceRemoteConnectionWithSummarizeByRequestBuilder(pathParameters, requestAdapter, summarizeBy);
    }
    /**
     * User experience analytics remote connection. The report will be retired on December 31, 2024. You can start using the Cloud PC connection quality report now via https://learn.microsoft.com/windows-365/enterprise/report-cloud-pc-connection-quality.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * User experience analytics remote connection. The report will be retired on December 31, 2024. You can start using the Cloud PC connection quality report now via https://learn.microsoft.com/windows-365/enterprise/report-cloud-pc-connection-quality.
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
     * Create new navigation property to userExperienceAnalyticsRemoteConnection for deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserExperienceAnalyticsRemoteConnection body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to userExperienceAnalyticsRemoteConnection for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserExperienceAnalyticsRemoteConnection body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UserExperienceAnalyticsRemoteConnectionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsRemoteConnectionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserExperienceAnalyticsRemoteConnectionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * User experience analytics remote connection. The report will be retired on December 31, 2024. You can start using the Cloud PC connection quality report now via https://learn.microsoft.com/windows-365/enterprise/report-cloud-pc-connection-quality.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
