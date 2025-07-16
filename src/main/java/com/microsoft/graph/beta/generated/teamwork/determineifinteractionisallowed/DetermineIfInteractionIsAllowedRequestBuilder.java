package com.microsoft.graph.beta.teamwork.determineifinteractionisallowed;

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
 * Provides operations to call the determineIfInteractionIsAllowed method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetermineIfInteractionIsAllowedRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DetermineIfInteractionIsAllowedRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DetermineIfInteractionIsAllowedRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/determineIfInteractionIsAllowed", pathParameters);
    }
    /**
     * Instantiates a new {@link DetermineIfInteractionIsAllowedRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DetermineIfInteractionIsAllowedRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/determineIfInteractionIsAllowed", rawUrl);
    }
    /**
     * Determine if a specified Microsoft Teams interaction is allowed between the signed-in user and specified users.
     * @param body The request body
     * @return a {@link DetermineIfInteractionIsAllowedPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/teamwork-determineifinteractionisallowed?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DetermineIfInteractionIsAllowedPostResponse post(@jakarta.annotation.Nonnull final DetermineIfInteractionIsAllowedPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Determine if a specified Microsoft Teams interaction is allowed between the signed-in user and specified users.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DetermineIfInteractionIsAllowedPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/teamwork-determineifinteractionisallowed?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DetermineIfInteractionIsAllowedPostResponse post(@jakarta.annotation.Nonnull final DetermineIfInteractionIsAllowedPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DetermineIfInteractionIsAllowedPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Determine if a specified Microsoft Teams interaction is allowed between the signed-in user and specified users.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DetermineIfInteractionIsAllowedPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Determine if a specified Microsoft Teams interaction is allowed between the signed-in user and specified users.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DetermineIfInteractionIsAllowedPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DetermineIfInteractionIsAllowedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DetermineIfInteractionIsAllowedRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DetermineIfInteractionIsAllowedRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
