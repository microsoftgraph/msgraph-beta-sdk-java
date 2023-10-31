package com.microsoft.graph.reports.credentialuserregistrationdetails;

import com.microsoft.graph.models.CredentialUserRegistrationDetails;
import com.microsoft.graph.models.CredentialUserRegistrationDetailsCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.reports.credentialuserregistrationdetails.count.CountRequestBuilder;
import com.microsoft.graph.reports.credentialuserregistrationdetails.item.CredentialUserRegistrationDetailsItemRequestBuilder;
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
 * Provides operations to manage the credentialUserRegistrationDetails property of the microsoft.graph.reportRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CredentialUserRegistrationDetailsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the credentialUserRegistrationDetails property of the microsoft.graph.reportRoot entity.
     * @param credentialUserRegistrationDetailsId The unique identifier of credentialUserRegistrationDetails
     * @return a CredentialUserRegistrationDetailsItemRequestBuilder
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CredentialUserRegistrationDetailsItemRequestBuilder byCredentialUserRegistrationDetailsId(@jakarta.annotation.Nonnull final String credentialUserRegistrationDetailsId) {
        Objects.requireNonNull(credentialUserRegistrationDetailsId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("credentialUserRegistrationDetails%2Did", credentialUserRegistrationDetailsId);
        return new CredentialUserRegistrationDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new CredentialUserRegistrationDetailsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CredentialUserRegistrationDetailsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/credentialUserRegistrationDetails{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CredentialUserRegistrationDetailsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CredentialUserRegistrationDetailsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/credentialUserRegistrationDetails{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of credentialUserRegistrationDetails objects for a given tenant. This API is available in the following national cloud deployments.
     * @return a CompletableFuture of CredentialUserRegistrationDetailsCollectionResponse
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-list-credentialuserregistrationdetails?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationDetailsCollectionResponse> get() {
        return get(null);
    }
    /**
     * Get a list of credentialUserRegistrationDetails objects for a given tenant. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of CredentialUserRegistrationDetailsCollectionResponse
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-list-credentialuserregistrationdetails?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationDetailsCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CredentialUserRegistrationDetailsCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to credentialUserRegistrationDetails for reports
     * @param body The request body
     * @return a CompletableFuture of CredentialUserRegistrationDetails
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationDetails> post(@jakarta.annotation.Nonnull final CredentialUserRegistrationDetails body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to credentialUserRegistrationDetails for reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of CredentialUserRegistrationDetails
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<CredentialUserRegistrationDetails> post(@jakarta.annotation.Nonnull final CredentialUserRegistrationDetails body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, CredentialUserRegistrationDetails::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get a list of credentialUserRegistrationDetails objects for a given tenant. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of credentialUserRegistrationDetails objects for a given tenant. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Create new navigation property to credentialUserRegistrationDetails for reports
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CredentialUserRegistrationDetails body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to credentialUserRegistrationDetails for reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CredentialUserRegistrationDetails body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a CredentialUserRegistrationDetailsRequestBuilder
     * @deprecated
     * The Reporting credentialUserRegistrationDetails API is deprecated and will stop returning data on June 30, 2024. Please use the new userRegistrationDetails API. as of 2023-06/credentialUserRegistrationDetails on 2023-06-21 and will be removed 2024-06-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CredentialUserRegistrationDetailsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CredentialUserRegistrationDetailsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of credentialUserRegistrationDetails objects for a given tenant. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
