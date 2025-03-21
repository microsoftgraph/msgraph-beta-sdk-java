package com.microsoft.graph.beta.drives.item.items.item.copy;

import com.microsoft.graph.beta.models.DriveItem;
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
 * Provides operations to call the copy method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CopyRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CopyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/copy", pathParameters);
    }
    /**
     * Instantiates a new {@link CopyRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CopyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/copy", rawUrl);
    }
    /**
     * Asynchronously create a copy of a driveItem (including any children) under a new parent item or with a new name. After the request is acknowledged, it enters a queue. The actual copying, including any subitems, occurs at an undetermined time. Progress is reported until the operation is completed by monitoring the progress.
     * @param body The request body
     * @return a {@link DriveItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/driveitem-copy?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DriveItem post(@jakarta.annotation.Nonnull final CopyPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Asynchronously create a copy of a driveItem (including any children) under a new parent item or with a new name. After the request is acknowledged, it enters a queue. The actual copying, including any subitems, occurs at an undetermined time. Progress is reported until the operation is completed by monitoring the progress.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DriveItem}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/driveitem-copy?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DriveItem post(@jakarta.annotation.Nonnull final CopyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DriveItem::createFromDiscriminatorValue);
    }
    /**
     * Asynchronously create a copy of a driveItem (including any children) under a new parent item or with a new name. After the request is acknowledged, it enters a queue. The actual copying, including any subitems, occurs at an undetermined time. Progress is reported until the operation is completed by monitoring the progress.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CopyPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Asynchronously create a copy of a driveItem (including any children) under a new parent item or with a new name. After the request is acknowledged, it enters a queue. The actual copying, including any subitems, occurs at an undetermined time. Progress is reported until the operation is completed by monitoring the progress.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CopyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CopyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CopyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CopyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
