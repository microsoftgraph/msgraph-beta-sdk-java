package com.microsoft.graph.beta.users.item.cloudpcs.bulkresize;

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
 * Provides operations to call the bulkResize method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkResizeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link BulkResizeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkResizeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/bulkResize", pathParameters);
    }
    /**
     * Instantiates a new {@link BulkResizeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BulkResizeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/bulkResize", rawUrl);
    }
    /**
     * Perform a bulk resize action to resize a group of cloudPCs that successfully pass validation. If any devices can't be resized, those devices indicate 'resize failed'. The remaining devices are provisioned for the resize process.
     * @param body The request body
     * @return a {@link BulkResizePostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-bulkresize?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public BulkResizePostResponse post(@jakarta.annotation.Nonnull final BulkResizePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Perform a bulk resize action to resize a group of cloudPCs that successfully pass validation. If any devices can't be resized, those devices indicate 'resize failed'. The remaining devices are provisioned for the resize process.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link BulkResizePostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-bulkresize?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public BulkResizePostResponse post(@jakarta.annotation.Nonnull final BulkResizePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BulkResizePostResponse::createFromDiscriminatorValue);
    }
    /**
     * Perform a bulk resize action to resize a group of cloudPCs that successfully pass validation. If any devices can't be resized, those devices indicate 'resize failed'. The remaining devices are provisioned for the resize process.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkResizePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Perform a bulk resize action to resize a group of cloudPCs that successfully pass validation. If any devices can't be resized, those devices indicate 'resize failed'. The remaining devices are provisioned for the resize process.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BulkResizePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link BulkResizeRequestBuilder}
     * @deprecated
     * The bulkResize action is deprecated and will stop supporting on September 24, 2023. Please use bulk action entity api. as of 2023-05/bulkResize
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public BulkResizeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BulkResizeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
