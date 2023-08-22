package com.microsoft.graph.networkaccess;

import com.microsoft.graph.models.networkaccess.NetworkAccessRoot;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.networkaccess.connectivity.ConnectivityRequestBuilder;
import com.microsoft.graph.networkaccess.forwardingpolicies.ForwardingPoliciesRequestBuilder;
import com.microsoft.graph.networkaccess.forwardingprofiles.ForwardingProfilesRequestBuilder;
import com.microsoft.graph.networkaccess.logs.LogsRequestBuilder;
import com.microsoft.graph.networkaccess.microsoftgraphnetworkaccessonboard.MicrosoftGraphNetworkaccessOnboardRequestBuilder;
import com.microsoft.graph.networkaccess.reports.ReportsRequestBuilder;
import com.microsoft.graph.networkaccess.settings.SettingsRequestBuilder;
import com.microsoft.graph.networkaccess.tenantstatus.TenantStatusRequestBuilder;
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
 * Provides operations to manage the networkAccessRoot singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NetworkAccessRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the connectivity property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ConnectivityRequestBuilder connectivity() {
        return new ConnectivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the forwardingPolicies property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ForwardingPoliciesRequestBuilder forwardingPolicies() {
        return new ForwardingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the forwardingProfiles property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ForwardingProfilesRequestBuilder forwardingProfiles() {
        return new ForwardingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the logs property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     */
    @jakarta.annotation.Nonnull
    public LogsRequestBuilder logs() {
        return new LogsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the onboard method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessOnboardRequestBuilder microsoftGraphNetworkaccessOnboard() {
        return new MicrosoftGraphNetworkaccessOnboardRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the reports property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder reports() {
        return new ReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the tenantStatus property of the microsoft.graph.networkaccess.networkAccessRoot entity.
     */
    @jakarta.annotation.Nonnull
    public TenantStatusRequestBuilder tenantStatus() {
        return new TenantStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new NetworkAccessRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NetworkAccessRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new NetworkAccessRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NetworkAccessRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get networkAccess
     * @return a CompletableFuture of networkAccessRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<NetworkAccessRoot> get() {
        return get(null);
    }
    /**
     * Get networkAccess
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of networkAccessRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<NetworkAccessRoot> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, NetworkAccessRoot::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update networkAccess
     * @param body The request body
     * @return a CompletableFuture of networkAccessRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<NetworkAccessRoot> patch(@jakarta.annotation.Nonnull final NetworkAccessRoot body) {
        return patch(body, null);
    }
    /**
     * Update networkAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of networkAccessRoot
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<NetworkAccessRoot> patch(@jakarta.annotation.Nonnull final NetworkAccessRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, NetworkAccessRoot::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get networkAccess
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get networkAccess
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
     * Update networkAccess
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final NetworkAccessRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update networkAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final NetworkAccessRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * Get networkAccess
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
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
