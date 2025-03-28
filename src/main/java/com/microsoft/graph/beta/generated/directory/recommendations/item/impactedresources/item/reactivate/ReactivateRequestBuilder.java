package com.microsoft.graph.beta.directory.recommendations.item.impactedresources.item.reactivate;

import com.microsoft.graph.beta.models.ImpactedResource;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the reactivate method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReactivateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ReactivateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReactivateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/recommendations/{recommendation%2Did}/impactedResources/{impactedResource%2Did}/reactivate", pathParameters);
    }
    /**
     * Instantiates a new {@link ReactivateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReactivateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory/recommendations/{recommendation%2Did}/impactedResources/{impactedResource%2Did}/reactivate", rawUrl);
    }
    /**
     * Reactivate an accidentally dismissed, completed, or postponed impactedResource object. This action updates the status of the resource to active. This method is relevant only if the status of the impactedResource object is dismissed, postponed, or completedByUser. 
     * @return a {@link ImpactedResource}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/impactedresource-reactivate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ImpactedResource post() {
        return post(null);
    }
    /**
     * Reactivate an accidentally dismissed, completed, or postponed impactedResource object. This action updates the status of the resource to active. This method is relevant only if the status of the impactedResource object is dismissed, postponed, or completedByUser. 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ImpactedResource}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/impactedresource-reactivate?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ImpactedResource post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ImpactedResource::createFromDiscriminatorValue);
    }
    /**
     * Reactivate an accidentally dismissed, completed, or postponed impactedResource object. This action updates the status of the resource to active. This method is relevant only if the status of the impactedResource object is dismissed, postponed, or completedByUser. 
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Reactivate an accidentally dismissed, completed, or postponed impactedResource object. This action updates the status of the resource to active. This method is relevant only if the status of the impactedResource object is dismissed, postponed, or completedByUser. 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReactivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReactivateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReactivateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
