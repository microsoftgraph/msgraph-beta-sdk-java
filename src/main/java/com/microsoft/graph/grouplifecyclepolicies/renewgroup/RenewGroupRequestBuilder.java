package com.microsoft.graph.grouplifecyclepolicies.renewgroup;

import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the renewGroup method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RenewGroupRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new RenewGroupRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RenewGroupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groupLifecyclePolicies/renewGroup", pathParameters);
    }
    /**
     * Instantiates a new RenewGroupRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RenewGroupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groupLifecyclePolicies/renewGroup", rawUrl);
    }
    /**
     * Renew a group's expiration. When a group is renewed, the group expiration is extended by the number of days defined in the policy. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RenewGroupPostResponse
     * @see <a href="https://learn.microsoft.com/graph/api/grouplifecyclepolicy-renewgroup?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RenewGroupPostResponse post(@jakarta.annotation.Nonnull final RenewGroupPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Renew a group's expiration. When a group is renewed, the group expiration is extended by the number of days defined in the policy. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RenewGroupPostResponse
     * @see <a href="https://learn.microsoft.com/graph/api/grouplifecyclepolicy-renewgroup?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RenewGroupPostResponse post(@jakarta.annotation.Nonnull final RenewGroupPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, RenewGroupPostResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Renew a group's expiration. When a group is renewed, the group expiration is extended by the number of days defined in the policy. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RenewGroupPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Renew a group's expiration. When a group is renewed, the group expiration is extended by the number of days defined in the policy. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final RenewGroupPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a RenewGroupRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RenewGroupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RenewGroupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
