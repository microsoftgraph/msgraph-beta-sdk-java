package com.microsoft.graph.beta.external.industrydata.runs.item;

import com.microsoft.graph.beta.external.industrydata.runs.item.activities.ActivitiesRequestBuilder;
import com.microsoft.graph.beta.external.industrydata.runs.item.microsoftgraphindustrydatagetstatistics.MicrosoftGraphIndustryDataGetStatisticsRequestBuilder;
import com.microsoft.graph.beta.models.industrydata.IndustryDataRun;
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
 * Provides operations to manage the runs property of the microsoft.graph.industryData.industryDataRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndustryDataRunItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activities property of the microsoft.graph.industryData.industryDataRun entity.
     */
    @jakarta.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getStatistics method.
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIndustryDataGetStatisticsRequestBuilder microsoftGraphIndustryDataGetStatistics() {
        return new MicrosoftGraphIndustryDataGetStatisticsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new IndustryDataRunItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IndustryDataRunItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/external/industryData/runs/{industryDataRun%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new IndustryDataRunItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IndustryDataRunItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/external/industryData/runs/{industryDataRun%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Read the properties and relationships of an industryDataRun object.
     * @return a IndustryDataRun
     * @see <a href="https://learn.microsoft.com/graph/api/industrydata-industrydatarun-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public IndustryDataRun get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of an industryDataRun object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a IndustryDataRun
     * @see <a href="https://learn.microsoft.com/graph/api/industrydata-industrydatarun-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public IndustryDataRun get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IndustryDataRun::createFromDiscriminatorValue);
    }
    /**
     * Read the properties and relationships of an industryDataRun object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of an industryDataRun object.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a IndustryDataRunItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public IndustryDataRunItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IndustryDataRunItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read the properties and relationships of an industryDataRun object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
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
