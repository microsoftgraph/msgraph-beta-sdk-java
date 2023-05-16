package com.microsoft.graph.sites.item.informationprotection.policy.labels.evaluateapplication;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the evaluateApplication method.
 */
public class EvaluateApplicationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new EvaluateApplicationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EvaluateApplicationRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/informationProtection/policy/labels/evaluateApplication", pathParameters);
    }
    /**
     * Instantiates a new EvaluateApplicationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public EvaluateApplicationRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sites/{site%2Did}/informationProtection/policy/labels/evaluateApplication", rawUrl);
    }
    /**
     * Compute the information protection label that should be applied and return the set of actions that must be taken to correctly label the information. This API is useful when a label should be set manually or explicitly by a user or service, rather than automatically based on file contents.  Given contentInfo, which includes existing content metadata key/value pairs, and labelingOptions as an input, the API returns an informationProtectionAction object that contains one of more of the following: 
     * @param body The request body
     * @return a CompletableFuture of evaluateApplicationResponse
     * @see <a href="https://docs.microsoft.com/graph/api/informationprotectionlabel-evaluateapplication?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EvaluateApplicationResponse> post(@javax.annotation.Nonnull final EvaluateApplicationPostRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EvaluateApplicationResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EvaluateApplicationResponse> executionException = new java.util.concurrent.CompletableFuture<EvaluateApplicationResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Compute the information protection label that should be applied and return the set of actions that must be taken to correctly label the information. This API is useful when a label should be set manually or explicitly by a user or service, rather than automatically based on file contents.  Given contentInfo, which includes existing content metadata key/value pairs, and labelingOptions as an input, the API returns an informationProtectionAction object that contains one of more of the following: 
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of evaluateApplicationResponse
     * @see <a href="https://docs.microsoft.com/graph/api/informationprotectionlabel-evaluateapplication?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<EvaluateApplicationResponse> post(@javax.annotation.Nonnull final EvaluateApplicationPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, EvaluateApplicationResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<EvaluateApplicationResponse> executionException = new java.util.concurrent.CompletableFuture<EvaluateApplicationResponse>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Compute the information protection label that should be applied and return the set of actions that must be taken to correctly label the information. This API is useful when a label should be set manually or explicitly by a user or service, rather than automatically based on file contents.  Given contentInfo, which includes existing content metadata key/value pairs, and labelingOptions as an input, the API returns an informationProtectionAction object that contains one of more of the following: 
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final EvaluateApplicationPostRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Compute the information protection label that should be applied and return the set of actions that must be taken to correctly label the information. This API is useful when a label should be set manually or explicitly by a user or service, rather than automatically based on file contents.  Given contentInfo, which includes existing content metadata key/value pairs, and labelingOptions as an input, the API returns an informationProtectionAction object that contains one of more of the following: 
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nonnull final EvaluateApplicationPostRequestBody body, @javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
