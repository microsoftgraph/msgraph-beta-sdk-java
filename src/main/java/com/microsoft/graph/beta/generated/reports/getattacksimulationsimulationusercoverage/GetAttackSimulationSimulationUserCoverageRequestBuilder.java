package com.microsoft.graph.beta.reports.getattacksimulationsimulationusercoverage;

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
 * Provides operations to call the getAttackSimulationSimulationUserCoverage method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAttackSimulationSimulationUserCoverageRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetAttackSimulationSimulationUserCoverageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAttackSimulationSimulationUserCoverageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getAttackSimulationSimulationUserCoverage(){?%24count,%24filter,%24search,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetAttackSimulationSimulationUserCoverageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAttackSimulationSimulationUserCoverageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/getAttackSimulationSimulationUserCoverage(){?%24count,%24filter,%24search,%24skip,%24top}", rawUrl);
    }
    /**
     * Get simulation coverage for users of a tenant in attack simulation and training campaigns. This function supports @odata.nextLink for pagination.
     * @return a {@link GetAttackSimulationSimulationUserCoverageGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This report function api is deprecated and will stop returning data on August 20, 2022. Api is now moved to /reports/security. Please use the new API. as of 2022-05/Tasks_And_Plans
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-getattacksimulationsimulationusercoverage?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public GetAttackSimulationSimulationUserCoverageGetResponse get() {
        return get(null);
    }
    /**
     * Get simulation coverage for users of a tenant in attack simulation and training campaigns. This function supports @odata.nextLink for pagination.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetAttackSimulationSimulationUserCoverageGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This report function api is deprecated and will stop returning data on August 20, 2022. Api is now moved to /reports/security. Please use the new API. as of 2022-05/Tasks_And_Plans
     * @see <a href="https://learn.microsoft.com/graph/api/reportroot-getattacksimulationsimulationusercoverage?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public GetAttackSimulationSimulationUserCoverageGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetAttackSimulationSimulationUserCoverageGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Get simulation coverage for users of a tenant in attack simulation and training campaigns. This function supports @odata.nextLink for pagination.
     * @return a {@link RequestInformation}
     * @deprecated
     * This report function api is deprecated and will stop returning data on August 20, 2022. Api is now moved to /reports/security. Please use the new API. as of 2022-05/Tasks_And_Plans
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get simulation coverage for users of a tenant in attack simulation and training campaigns. This function supports @odata.nextLink for pagination.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This report function api is deprecated and will stop returning data on August 20, 2022. Api is now moved to /reports/security. Please use the new API. as of 2022-05/Tasks_And_Plans
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetAttackSimulationSimulationUserCoverageRequestBuilder}
     * @deprecated
     * This report function api is deprecated and will stop returning data on August 20, 2022. Api is now moved to /reports/security. Please use the new API. as of 2022-05/Tasks_And_Plans
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public GetAttackSimulationSimulationUserCoverageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetAttackSimulationSimulationUserCoverageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get simulation coverage for users of a tenant in attack simulation and training campaigns. This function supports @odata.nextLink for pagination.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
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
