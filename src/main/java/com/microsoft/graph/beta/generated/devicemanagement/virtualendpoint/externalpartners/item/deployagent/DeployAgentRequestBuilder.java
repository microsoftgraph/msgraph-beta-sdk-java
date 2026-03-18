package com.microsoft.graph.beta.devicemanagement.virtualendpoint.externalpartners.item.deployagent;

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
 * Provides operations to call the deployAgent method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeployAgentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DeployAgentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeployAgentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/externalPartners/{cloudPcExternalPartner%2Did}/deployAgent", pathParameters);
    }
    /**
     * Instantiates a new {@link DeployAgentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeployAgentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/externalPartners/{cloudPcExternalPartner%2Did}/deployAgent", rawUrl);
    }
    /**
     * Trigger agent deployment for a set of Windows 365 Cloud PCs that are provisioned, and return an activity ID. This API is supported when the connection is enabled and the agent setting is configured. Currently, only support Windows 365 business Cloud PC.
     * @param body The request body
     * @return a {@link DeployAgentPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcexternalpartner-deployagent?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeployAgentPostResponse post(@jakarta.annotation.Nonnull final DeployAgentPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Trigger agent deployment for a set of Windows 365 Cloud PCs that are provisioned, and return an activity ID. This API is supported when the connection is enabled and the agent setting is configured. Currently, only support Windows 365 business Cloud PC.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeployAgentPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcexternalpartner-deployagent?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DeployAgentPostResponse post(@jakarta.annotation.Nonnull final DeployAgentPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeployAgentPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Trigger agent deployment for a set of Windows 365 Cloud PCs that are provisioned, and return an activity ID. This API is supported when the connection is enabled and the agent setting is configured. Currently, only support Windows 365 business Cloud PC.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeployAgentPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Trigger agent deployment for a set of Windows 365 Cloud PCs that are provisioned, and return an activity ID. This API is supported when the connection is enabled and the agent setting is configured. Currently, only support Windows 365 business Cloud PC.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeployAgentPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DeployAgentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeployAgentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeployAgentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
