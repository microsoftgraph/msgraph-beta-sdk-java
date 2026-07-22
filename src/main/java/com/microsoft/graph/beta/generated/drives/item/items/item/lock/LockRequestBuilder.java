package com.microsoft.graph.beta.drives.item.items.item.lock;

import com.microsoft.graph.beta.models.LockInfo;
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
 * Provides operations to call the lock method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LockRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link LockRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LockRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/lock", pathParameters);
    }
    /**
     * Instantiates a new {@link LockRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LockRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/lock", rawUrl);
    }
    /**
     * Acquire an exclusive lock on a file represented by a driveItem, or extend an existing lock you already hold. While the lock is held, other users are prevented from acquiring a lock on the same file. The lock automatically expires after the duration specified in the request elapses. A single endpoint handles both initial acquisition and refresh. The server determines which behavior applies based on the file&apos;s current lock state and the caller&apos;s identity. The caller doesn&apos;t need to track whether they previously locked the file, and doesn&apos;t need to manage a lock identifier. Only exclusive locks are currently supported.
     * @param body The request body
     * @return a {@link LockInfo}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/driveitem-lock?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public LockInfo post(@jakarta.annotation.Nonnull final LockPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Acquire an exclusive lock on a file represented by a driveItem, or extend an existing lock you already hold. While the lock is held, other users are prevented from acquiring a lock on the same file. The lock automatically expires after the duration specified in the request elapses. A single endpoint handles both initial acquisition and refresh. The server determines which behavior applies based on the file&apos;s current lock state and the caller&apos;s identity. The caller doesn&apos;t need to track whether they previously locked the file, and doesn&apos;t need to manage a lock identifier. Only exclusive locks are currently supported.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link LockInfo}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/driveitem-lock?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public LockInfo post(@jakarta.annotation.Nonnull final LockPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, LockInfo::createFromDiscriminatorValue);
    }
    /**
     * Acquire an exclusive lock on a file represented by a driveItem, or extend an existing lock you already hold. While the lock is held, other users are prevented from acquiring a lock on the same file. The lock automatically expires after the duration specified in the request elapses. A single endpoint handles both initial acquisition and refresh. The server determines which behavior applies based on the file&apos;s current lock state and the caller&apos;s identity. The caller doesn&apos;t need to track whether they previously locked the file, and doesn&apos;t need to manage a lock identifier. Only exclusive locks are currently supported.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LockPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Acquire an exclusive lock on a file represented by a driveItem, or extend an existing lock you already hold. While the lock is held, other users are prevented from acquiring a lock on the same file. The lock automatically expires after the duration specified in the request elapses. A single endpoint handles both initial acquisition and refresh. The server determines which behavior applies based on the file&apos;s current lock state and the caller&apos;s identity. The caller doesn&apos;t need to track whether they previously locked the file, and doesn&apos;t need to manage a lock identifier. Only exclusive locks are currently supported.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final LockPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link LockRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LockRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LockRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
