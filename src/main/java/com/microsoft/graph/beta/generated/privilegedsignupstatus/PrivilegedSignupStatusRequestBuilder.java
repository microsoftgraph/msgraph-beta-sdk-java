package com.microsoft.graph.beta.privilegedsignupstatus;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.PrivilegedSignupStatus;
import com.microsoft.graph.beta.models.PrivilegedSignupStatusCollectionResponse;
import com.microsoft.graph.beta.privilegedsignupstatus.cansignup.CanSignUpRequestBuilder;
import com.microsoft.graph.beta.privilegedsignupstatus.completesetup.CompleteSetupRequestBuilder;
import com.microsoft.graph.beta.privilegedsignupstatus.count.CountRequestBuilder;
import com.microsoft.graph.beta.privilegedsignupstatus.issignedup.IsSignedUpRequestBuilder;
import com.microsoft.graph.beta.privilegedsignupstatus.item.PrivilegedSignupStatusItemRequestBuilder;
import com.microsoft.graph.beta.privilegedsignupstatus.signup.SignUpRequestBuilder;
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
 * Provides operations to manage the collection of privilegedSignupStatus entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedSignupStatusRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the canSignUp method.
     */
    @jakarta.annotation.Nonnull
    public CanSignUpRequestBuilder canSignUp() {
        return new CanSignUpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the completeSetup method.
     */
    @jakarta.annotation.Nonnull
    public CompleteSetupRequestBuilder completeSetup() {
        return new CompleteSetupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the isSignedUp method.
     */
    @jakarta.annotation.Nonnull
    public IsSignedUpRequestBuilder isSignedUp() {
        return new IsSignedUpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the signUp method.
     */
    @jakarta.annotation.Nonnull
    public SignUpRequestBuilder signUp() {
        return new SignUpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of privilegedSignupStatus entities.
     * @param privilegedSignupStatusId The unique identifier of privilegedSignupStatus
     * @return a PrivilegedSignupStatusItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrivilegedSignupStatusItemRequestBuilder byPrivilegedSignupStatusId(@jakarta.annotation.Nonnull final String privilegedSignupStatusId) {
        Objects.requireNonNull(privilegedSignupStatusId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("privilegedSignupStatus%2Did", privilegedSignupStatusId);
        return new PrivilegedSignupStatusItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PrivilegedSignupStatusRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivilegedSignupStatusRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedSignupStatus{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new PrivilegedSignupStatusRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivilegedSignupStatusRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedSignupStatus{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get entities from privilegedSignupStatus
     * @return a PrivilegedSignupStatusCollectionResponse
     */
    @jakarta.annotation.Nullable
    public PrivilegedSignupStatusCollectionResponse get() {
        return get(null);
    }
    /**
     * Get entities from privilegedSignupStatus
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PrivilegedSignupStatusCollectionResponse
     */
    @jakarta.annotation.Nullable
    public PrivilegedSignupStatusCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedSignupStatusCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Add new entity to privilegedSignupStatus
     * @param body The request body
     * @return a PrivilegedSignupStatus
     */
    @jakarta.annotation.Nullable
    public PrivilegedSignupStatus post(@jakarta.annotation.Nonnull final PrivilegedSignupStatus body) {
        return post(body, null);
    }
    /**
     * Add new entity to privilegedSignupStatus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PrivilegedSignupStatus
     */
    @jakarta.annotation.Nullable
    public PrivilegedSignupStatus post(@jakarta.annotation.Nonnull final PrivilegedSignupStatus body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedSignupStatus::createFromDiscriminatorValue);
    }
    /**
     * Get entities from privilegedSignupStatus
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get entities from privilegedSignupStatus
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
     * Add new entity to privilegedSignupStatus
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrivilegedSignupStatus body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add new entity to privilegedSignupStatus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrivilegedSignupStatus body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a PrivilegedSignupStatusRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrivilegedSignupStatusRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrivilegedSignupStatusRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get entities from privilegedSignupStatus
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
         * @return a Map<String, Object>
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
