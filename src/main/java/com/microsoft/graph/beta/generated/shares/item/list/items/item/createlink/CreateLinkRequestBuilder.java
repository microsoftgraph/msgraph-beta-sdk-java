package com.microsoft.graph.beta.shares.item.list.items.item.createlink;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.Permission;
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
 * Provides operations to call the createLink method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateLinkRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreateLinkRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateLinkRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shares/{sharedDriveItem%2Did}/list/items/{listItem%2Did}/createLink", pathParameters);
    }
    /**
     * Instantiates a new {@link CreateLinkRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateLinkRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shares/{sharedDriveItem%2Did}/list/items/{listItem%2Did}/createLink", rawUrl);
    }
    /**
     * Create a sharing link for a listItem. The createLink action creates a new sharing link if the specified link type doesn&apos;t already exist for the calling application.If a sharing link of the specified type already exists for the app, this action returns the existing sharing link. listItem resources inherit sharing permissions from the list the item resides in.
     * @param body The request body
     * @return a {@link Permission}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/listitem-createlink?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Permission post(@jakarta.annotation.Nonnull final CreateLinkPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a sharing link for a listItem. The createLink action creates a new sharing link if the specified link type doesn&apos;t already exist for the calling application.If a sharing link of the specified type already exists for the app, this action returns the existing sharing link. listItem resources inherit sharing permissions from the list the item resides in.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Permission}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/listitem-createlink?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Permission post(@jakarta.annotation.Nonnull final CreateLinkPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Permission::createFromDiscriminatorValue);
    }
    /**
     * Create a sharing link for a listItem. The createLink action creates a new sharing link if the specified link type doesn&apos;t already exist for the calling application.If a sharing link of the specified type already exists for the app, this action returns the existing sharing link. listItem resources inherit sharing permissions from the list the item resides in.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateLinkPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a sharing link for a listItem. The createLink action creates a new sharing link if the specified link type doesn&apos;t already exist for the calling application.If a sharing link of the specified type already exists for the app, this action returns the existing sharing link. listItem resources inherit sharing permissions from the list the item resides in.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateLinkPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CreateLinkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateLinkRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreateLinkRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
