package com.microsoft.graph.reports.serviceprincipalsigninactivities;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ServicePrincipalSignInActivity;
import com.microsoft.graph.models.ServicePrincipalSignInActivityCollectionResponse;
import com.microsoft.graph.reports.serviceprincipalsigninactivities.count.CountRequestBuilder;
import com.microsoft.graph.reports.serviceprincipalsigninactivities.item.ServicePrincipalSignInActivityItemRequestBuilder;
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
 * Provides operations to manage the servicePrincipalSignInActivities property of the microsoft.graph.reportRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalSignInActivitiesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the servicePrincipalSignInActivities property of the microsoft.graph.reportRoot entity.
     * @param servicePrincipalSignInActivityId The unique identifier of servicePrincipalSignInActivity
     * @return a ServicePrincipalSignInActivityItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalSignInActivityItemRequestBuilder byServicePrincipalSignInActivityId(@jakarta.annotation.Nonnull final String servicePrincipalSignInActivityId) {
        Objects.requireNonNull(servicePrincipalSignInActivityId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("servicePrincipalSignInActivity%2Did", servicePrincipalSignInActivityId);
        return new ServicePrincipalSignInActivityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ServicePrincipalSignInActivitiesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ServicePrincipalSignInActivitiesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/servicePrincipalSignInActivities{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ServicePrincipalSignInActivitiesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ServicePrincipalSignInActivitiesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/servicePrincipalSignInActivities{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of servicePrincipalSignInActivity objects that contains sign-in activity information for service principals in a Microsoft Entra tenant. You can use a service principal as a client or resource. A service principal supports delegated or app-only authentication context. This API is available in the following national cloud deployments.
     * @return a ServicePrincipalSignInActivityCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-list-serviceprincipalsigninactivities?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ServicePrincipalSignInActivityCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of servicePrincipalSignInActivity objects that contains sign-in activity information for service principals in a Microsoft Entra tenant. You can use a service principal as a client or resource. A service principal supports delegated or app-only authentication context. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrincipalSignInActivityCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-list-serviceprincipalsigninactivities?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ServicePrincipalSignInActivityCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ServicePrincipalSignInActivityCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to servicePrincipalSignInActivities for reports
     * @param body The request body
     * @return a ServicePrincipalSignInActivity
     */
    @jakarta.annotation.Nullable
    public ServicePrincipalSignInActivity post(@jakarta.annotation.Nonnull final ServicePrincipalSignInActivity body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to servicePrincipalSignInActivities for reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ServicePrincipalSignInActivity
     */
    @jakarta.annotation.Nullable
    public ServicePrincipalSignInActivity post(@jakarta.annotation.Nonnull final ServicePrincipalSignInActivity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ServicePrincipalSignInActivity::createFromDiscriminatorValue);
    }
    /**
     * Get a list of servicePrincipalSignInActivity objects that contains sign-in activity information for service principals in a Microsoft Entra tenant. You can use a service principal as a client or resource. A service principal supports delegated or app-only authentication context. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of servicePrincipalSignInActivity objects that contains sign-in activity information for service principals in a Microsoft Entra tenant. You can use a service principal as a client or resource. A service principal supports delegated or app-only authentication context. This API is available in the following national cloud deployments.
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
     * Create new navigation property to servicePrincipalSignInActivities for reports
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePrincipalSignInActivity body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to servicePrincipalSignInActivities for reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePrincipalSignInActivity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ServicePrincipalSignInActivitiesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServicePrincipalSignInActivitiesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ServicePrincipalSignInActivitiesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of servicePrincipalSignInActivity objects that contains sign-in activity information for service principals in a Microsoft Entra tenant. You can use a service principal as a client or resource. A service principal supports delegated or app-only authentication context. This API is available in the following national cloud deployments.
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
