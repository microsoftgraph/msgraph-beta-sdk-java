package com.microsoft.graph.beta.education.synchronizationprofiles.item.errors;

import com.microsoft.graph.beta.education.synchronizationprofiles.item.errors.count.CountRequestBuilder;
import com.microsoft.graph.beta.education.synchronizationprofiles.item.errors.item.EducationSynchronizationErrorItemRequestBuilder;
import com.microsoft.graph.beta.models.EducationSynchronizationError;
import com.microsoft.graph.beta.models.EducationSynchronizationErrorCollectionResponse;
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
 * Provides operations to manage the errors property of the microsoft.graph.educationSynchronizationProfile entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ErrorsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the errors property of the microsoft.graph.educationSynchronizationProfile entity.
     * @param educationSynchronizationErrorId The unique identifier of educationSynchronizationError
     * @return a {@link EducationSynchronizationErrorItemRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public EducationSynchronizationErrorItemRequestBuilder byEducationSynchronizationErrorId(@jakarta.annotation.Nonnull final String educationSynchronizationErrorId) {
        Objects.requireNonNull(educationSynchronizationErrorId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("educationSynchronizationError%2Did", educationSynchronizationErrorId);
        return new EducationSynchronizationErrorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ErrorsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ErrorsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/synchronizationProfiles/{educationSynchronizationProfile%2Did}/errors{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link ErrorsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ErrorsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/synchronizationProfiles/{educationSynchronizationProfile%2Did}/errors{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get errors from education
     * @return a {@link EducationSynchronizationErrorCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EducationSynchronizationErrorCollectionResponse get() {
        return get(null);
    }
    /**
     * Get errors from education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EducationSynchronizationErrorCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EducationSynchronizationErrorCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationSynchronizationErrorCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to errors for education
     * @param body The request body
     * @return a {@link EducationSynchronizationError}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EducationSynchronizationError post(@jakarta.annotation.Nonnull final EducationSynchronizationError body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to errors for education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EducationSynchronizationError}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public EducationSynchronizationError post(@jakarta.annotation.Nonnull final EducationSynchronizationError body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationSynchronizationError::createFromDiscriminatorValue);
    }
    /**
     * Get errors from education
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get errors from education
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create new navigation property to errors for education
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EducationSynchronizationError body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to errors for education
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EducationSynchronizationError body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ErrorsRequestBuilder}
     * @deprecated
     * The Education Sync Profile API is deprecated and will stop returning data on December 31, 2024. Please transition to the new IndustryData API. as of 2024-06/Deprecated:SynchronizationProfiles
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ErrorsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ErrorsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get errors from education
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
