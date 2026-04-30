package com.microsoft.graph.beta.solutions.backuprestore.sharepointprotectionpolicies.item.siteexclusionunitsbulkadditionjobs;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.SiteExclusionUnitsBulkAdditionJobCollectionResponse;
import com.microsoft.graph.beta.solutions.backuprestore.sharepointprotectionpolicies.item.siteexclusionunitsbulkadditionjobs.count.CountRequestBuilder;
import com.microsoft.graph.beta.solutions.backuprestore.sharepointprotectionpolicies.item.siteexclusionunitsbulkadditionjobs.item.SiteExclusionUnitsBulkAdditionJobItemRequestBuilder;
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
 * Provides operations to manage the siteExclusionUnitsBulkAdditionJobs property of the microsoft.graph.sharePointProtectionPolicy entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SiteExclusionUnitsBulkAdditionJobsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the siteExclusionUnitsBulkAdditionJobs property of the microsoft.graph.sharePointProtectionPolicy entity.
     * @param siteExclusionUnitsBulkAdditionJobId The unique identifier of siteExclusionUnitsBulkAdditionJob
     * @return a {@link SiteExclusionUnitsBulkAdditionJobItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SiteExclusionUnitsBulkAdditionJobItemRequestBuilder bySiteExclusionUnitsBulkAdditionJobId(@jakarta.annotation.Nonnull final String siteExclusionUnitsBulkAdditionJobId) {
        Objects.requireNonNull(siteExclusionUnitsBulkAdditionJobId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("siteExclusionUnitsBulkAdditionJob%2Did", siteExclusionUnitsBulkAdditionJobId);
        return new SiteExclusionUnitsBulkAdditionJobItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SiteExclusionUnitsBulkAdditionJobsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SiteExclusionUnitsBulkAdditionJobsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/backupRestore/sharePointProtectionPolicies/{sharePointProtectionPolicy%2Did}/siteExclusionUnitsBulkAdditionJobs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link SiteExclusionUnitsBulkAdditionJobsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SiteExclusionUnitsBulkAdditionJobsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/solutions/backupRestore/sharePointProtectionPolicies/{sharePointProtectionPolicy%2Did}/siteExclusionUnitsBulkAdditionJobs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get siteExclusionUnitsBulkAdditionJobs from solutions
     * @return a {@link SiteExclusionUnitsBulkAdditionJobCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SiteExclusionUnitsBulkAdditionJobCollectionResponse get() {
        return get(null);
    }
    /**
     * Get siteExclusionUnitsBulkAdditionJobs from solutions
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SiteExclusionUnitsBulkAdditionJobCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SiteExclusionUnitsBulkAdditionJobCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SiteExclusionUnitsBulkAdditionJobCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Get siteExclusionUnitsBulkAdditionJobs from solutions
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get siteExclusionUnitsBulkAdditionJobs from solutions
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
     * @return a {@link SiteExclusionUnitsBulkAdditionJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SiteExclusionUnitsBulkAdditionJobsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SiteExclusionUnitsBulkAdditionJobsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get siteExclusionUnitsBulkAdditionJobs from solutions
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
}
