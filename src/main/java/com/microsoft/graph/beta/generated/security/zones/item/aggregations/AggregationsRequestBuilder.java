package com.microsoft.graph.beta.security.zones.item.aggregations;

import com.microsoft.graph.beta.security.zones.item.aggregations.count.CountRequestBuilder;
import com.microsoft.graph.beta.security.zones.item.aggregations.item.AggregatedEnvironmentKindItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /security/zones/{zone-id}/aggregations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AggregationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the aggregations property of the microsoft.graph.security.zone entity.
     * @param aggregatedEnvironmentKind The unique identifier of aggregatedEnvironment
     * @return a {@link AggregatedEnvironmentKindItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AggregatedEnvironmentKindItemRequestBuilder byAggregatedEnvironmentKind(@jakarta.annotation.Nonnull final String aggregatedEnvironmentKind) {
        Objects.requireNonNull(aggregatedEnvironmentKind);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("aggregatedEnvironment%2Dkind", aggregatedEnvironmentKind);
        return new AggregatedEnvironmentKindItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link AggregationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AggregationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/zones/{zone%2Did}/aggregations", pathParameters);
    }
    /**
     * Instantiates a new {@link AggregationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AggregationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/zones/{zone%2Did}/aggregations", rawUrl);
    }
}
