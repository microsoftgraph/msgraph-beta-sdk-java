package com.microsoft.graph.beta.identitygovernance.permissionsanalytics.gcp.permissionscreepindexdistributions;

import com.microsoft.graph.beta.identitygovernance.permissionsanalytics.gcp.permissionscreepindexdistributions.count.CountRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.permissionsanalytics.gcp.permissionscreepindexdistributions.item.PermissionsCreepIndexDistributionItemRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.PermissionsCreepIndexDistribution;
import com.microsoft.graph.beta.models.PermissionsCreepIndexDistributionCollectionResponse;
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
 * Provides operations to manage the permissionsCreepIndexDistributions property of the microsoft.graph.permissionsAnalytics entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsCreepIndexDistributionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionsCreepIndexDistributions property of the microsoft.graph.permissionsAnalytics entity.
     * @param permissionsCreepIndexDistributionId The unique identifier of permissionsCreepIndexDistribution
     * @return a {@link PermissionsCreepIndexDistributionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionsCreepIndexDistributionItemRequestBuilder byPermissionsCreepIndexDistributionId(@jakarta.annotation.Nonnull final String permissionsCreepIndexDistributionId) {
        Objects.requireNonNull(permissionsCreepIndexDistributionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("permissionsCreepIndexDistribution%2Did", permissionsCreepIndexDistributionId);
        return new PermissionsCreepIndexDistributionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PermissionsCreepIndexDistributionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PermissionsCreepIndexDistributionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/permissionsAnalytics/gcp/permissionsCreepIndexDistributions{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link PermissionsCreepIndexDistributionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PermissionsCreepIndexDistributionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/permissionsAnalytics/gcp/permissionsCreepIndexDistributions{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Represents the Permissions Creep Index (PCI) for the authorization system. PCI distribution chart shows the classification of human and nonhuman identities based on the PCI score in three buckets (low, medium, high).
     * @return a {@link PermissionsCreepIndexDistributionCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndexDistributionCollectionResponse get() {
        return get(null);
    }
    /**
     * Represents the Permissions Creep Index (PCI) for the authorization system. PCI distribution chart shows the classification of human and nonhuman identities based on the PCI score in three buckets (low, medium, high).
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PermissionsCreepIndexDistributionCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndexDistributionCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PermissionsCreepIndexDistributionCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to permissionsCreepIndexDistributions for identityGovernance
     * @param body The request body
     * @return a {@link PermissionsCreepIndexDistribution}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndexDistribution post(@jakarta.annotation.Nonnull final PermissionsCreepIndexDistribution body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to permissionsCreepIndexDistributions for identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PermissionsCreepIndexDistribution}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public PermissionsCreepIndexDistribution post(@jakarta.annotation.Nonnull final PermissionsCreepIndexDistribution body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PermissionsCreepIndexDistribution::createFromDiscriminatorValue);
    }
    /**
     * Represents the Permissions Creep Index (PCI) for the authorization system. PCI distribution chart shows the classification of human and nonhuman identities based on the PCI score in three buckets (low, medium, high).
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Represents the Permissions Creep Index (PCI) for the authorization system. PCI distribution chart shows the classification of human and nonhuman identities based on the PCI score in three buckets (low, medium, high).
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
     * Create new navigation property to permissionsCreepIndexDistributions for identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PermissionsCreepIndexDistribution body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to permissionsCreepIndexDistributions for identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PermissionsCreepIndexDistribution body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PermissionsCreepIndexDistributionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionsCreepIndexDistributionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PermissionsCreepIndexDistributionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Represents the Permissions Creep Index (PCI) for the authorization system. PCI distribution chart shows the classification of human and nonhuman identities based on the PCI score in three buckets (low, medium, high).
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
