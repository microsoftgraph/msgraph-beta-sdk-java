package com.microsoft.graph.beta.devicemanagement.virtualendpoint.externalpartners.item.retrievedeployagentactionresultsactivityidactivityidclo_e05880cd;

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
 * Provides operations to call the retrieveDeployAgentActionResults method. Original name: RetrieveDeployAgentActionResultsactivityIdActivityIdCloudPcIdCloudPcIdRequestBuilder
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrieveDeployAgentActionResultsactivityIdActivityIdClo_aaebe13d extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RetrieveDeployAgentActionResultsactivityIdActivityIdClo_aaebe13d} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveDeployAgentActionResultsactivityIdActivityIdClo_aaebe13d(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/externalPartners/{cloudPcExternalPartner%2Did}/retrieveDeployAgentActionResults(activityId='@activityId',cloudPcId='@cloudPcId'){?%24count,%24filter,%24search,%24skip,%24top,activityId*,cloudPcId*}", pathParameters);
    }
    /**
     * Instantiates a new {@link RetrieveDeployAgentActionResultsactivityIdActivityIdClo_aaebe13d} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveDeployAgentActionResultsactivityIdActivityIdClo_aaebe13d(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/externalPartners/{cloudPcExternalPartner%2Did}/retrieveDeployAgentActionResults(activityId='@activityId',cloudPcId='@cloudPcId'){?%24count,%24filter,%24search,%24skip,%24top,activityId*,cloudPcId*}", rawUrl);
    }
    /**
     * Retrieve the status of a specific deployment action on a specific Cloud PC device. If both activityId and cloudPcId are empty, the paging results are returned, and the pagination size is 100.
     * @return a {@link RetrieveDeployAgentActionResultsactivityIdActivityIdClo_1ac23c91}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcexternalpartner-retrievedeployagentactionresults?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RetrieveDeployAgentActionResultsactivityIdActivityIdClo_1ac23c91 get() {
        return get(null);
    }
    /**
     * Retrieve the status of a specific deployment action on a specific Cloud PC device. If both activityId and cloudPcId are empty, the paging results are returned, and the pagination size is 100.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RetrieveDeployAgentActionResultsactivityIdActivityIdClo_1ac23c91}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcexternalpartner-retrievedeployagentactionresults?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RetrieveDeployAgentActionResultsactivityIdActivityIdClo_1ac23c91 get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RetrieveDeployAgentActionResultsactivityIdActivityIdClo_1ac23c91::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the status of a specific deployment action on a specific Cloud PC device. If both activityId and cloudPcId are empty, the paging results are returned, and the pagination size is 100.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the status of a specific deployment action on a specific Cloud PC device. If both activityId and cloudPcId are empty, the paging results are returned, and the pagination size is 100.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link RetrieveDeployAgentActionResultsactivityIdActivityIdClo_aaebe13d}
     */
    @jakarta.annotation.Nonnull
    public RetrieveDeployAgentActionResultsactivityIdActivityIdClo_aaebe13d withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrieveDeployAgentActionResultsactivityIdActivityIdClo_aaebe13d(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the status of a specific deployment action on a specific Cloud PC device. If both activityId and cloudPcId are empty, the paging results are returned, and the pagination size is 100.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Usage: activityId=&apos;@activityId&apos;
         */
        @jakarta.annotation.Nullable
        public String activityId;
        /**
         * Usage: cloudPcId=&apos;@cloudPcId&apos;
         */
        @jakarta.annotation.Nullable
        public String cloudPcId;
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
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
            allQueryParams.put("activityId", activityId);
            allQueryParams.put("cloudPcId", cloudPcId);
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
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
}
