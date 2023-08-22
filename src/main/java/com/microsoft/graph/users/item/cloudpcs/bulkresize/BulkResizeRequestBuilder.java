package com.microsoft.graph.users.item.cloudpcs.bulkresize;

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
 * Provides operations to call the bulkResize method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkResizeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new BulkResizeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkResizeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/bulkResize", pathParameters);
    }
    /**
     * Instantiates a new BulkResizeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkResizeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/bulkResize", rawUrl);
    }
    /**
     * Perform a bulk resize action to resize a group of cloudPCs that have successfully passed validation. If any devices cannot be resized, those devices will indicate 'resize failed'. The remaining devices will be provisioned for the resize process.
     * @param body The request body
     * @return a CompletableFuture of bulkResizeResponse
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize on 2023-05-24 and will be removed 2023-09-24
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-bulkresize?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<BulkResizeResponse> post(@jakarta.annotation.Nonnull final BulkResizePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Perform a bulk resize action to resize a group of cloudPCs that have successfully passed validation. If any devices cannot be resized, those devices will indicate 'resize failed'. The remaining devices will be provisioned for the resize process.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of bulkResizeResponse
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize on 2023-05-24 and will be removed 2023-09-24
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-bulkresize?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<BulkResizeResponse> post(@jakarta.annotation.Nonnull final BulkResizePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, BulkResizeResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Perform a bulk resize action to resize a group of cloudPCs that have successfully passed validation. If any devices cannot be resized, those devices will indicate 'resize failed'. The remaining devices will be provisioned for the resize process.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize on 2023-05-24 and will be removed 2023-09-24
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkResizePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Perform a bulk resize action to resize a group of cloudPCs that have successfully passed validation. If any devices cannot be resized, those devices will indicate 'resize failed'. The remaining devices will be provisioned for the resize process.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize on 2023-05-24 and will be removed 2023-09-24
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkResizePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
