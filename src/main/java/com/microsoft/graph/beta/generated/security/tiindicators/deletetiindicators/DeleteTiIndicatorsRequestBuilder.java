package com.microsoft.graph.beta.security.tiindicators.deletetiindicators;

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
 * Provides operations to call the deleteTiIndicators method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeleteTiIndicatorsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DeleteTiIndicatorsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeleteTiIndicatorsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/tiIndicators/deleteTiIndicators", pathParameters);
    }
    /**
     * Instantiates a new {@link DeleteTiIndicatorsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeleteTiIndicatorsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/tiIndicators/deleteTiIndicators", rawUrl);
    }
    /**
     * Delete multiple threat intelligence (TI) indicators in one request instead of multiple requests.
     * @param body The request body
     * @return a {@link DeleteTiIndicatorsPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The legacy Graph Security API is deprecated and will stop returning data on January 31, 2025. Please use the new Graph Security API. as of 2024-01/Deprecation on 2024-04-10 and will be removed 2026-04-10
     * @see <a href="https://learn.microsoft.com/graph/api/tiindicator-deletetiindicators?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public DeleteTiIndicatorsPostResponse post(@jakarta.annotation.Nonnull final DeleteTiIndicatorsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Delete multiple threat intelligence (TI) indicators in one request instead of multiple requests.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeleteTiIndicatorsPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The legacy Graph Security API is deprecated and will stop returning data on January 31, 2025. Please use the new Graph Security API. as of 2024-01/Deprecation on 2024-04-10 and will be removed 2026-04-10
     * @see <a href="https://learn.microsoft.com/graph/api/tiindicator-deletetiindicators?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public DeleteTiIndicatorsPostResponse post(@jakarta.annotation.Nonnull final DeleteTiIndicatorsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeleteTiIndicatorsPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete multiple threat intelligence (TI) indicators in one request instead of multiple requests.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The legacy Graph Security API is deprecated and will stop returning data on January 31, 2025. Please use the new Graph Security API. as of 2024-01/Deprecation on 2024-04-10 and will be removed 2026-04-10
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeleteTiIndicatorsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Delete multiple threat intelligence (TI) indicators in one request instead of multiple requests.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The legacy Graph Security API is deprecated and will stop returning data on January 31, 2025. Please use the new Graph Security API. as of 2024-01/Deprecation on 2024-04-10 and will be removed 2026-04-10
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeleteTiIndicatorsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DeleteTiIndicatorsRequestBuilder}
     * @deprecated
     * The legacy Graph Security API is deprecated and will stop returning data on January 31, 2025. Please use the new Graph Security API. as of 2024-01/Deprecation on 2024-04-10 and will be removed 2026-04-10
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public DeleteTiIndicatorsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeleteTiIndicatorsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
