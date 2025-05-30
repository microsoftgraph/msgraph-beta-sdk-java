package com.microsoft.graph.beta.groups.item.sites.item.contentmodels.getbynamewithmodelname.addtodrive;

import com.microsoft.graph.beta.models.ContentModelUsage;
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
 * Provides operations to call the addToDrive method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddToDriveRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AddToDriveRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddToDriveRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/contentModels/getByName(modelName='{modelName}')/addToDrive", pathParameters);
    }
    /**
     * Instantiates a new {@link AddToDriveRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddToDriveRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/contentModels/getByName(modelName='{modelName}')/addToDrive", rawUrl);
    }
    /**
     * Apply a contentModel to SharePoint document libraries. For an existing model that&apos;s already trained, this action automatically processes new documents that are added to the SharePoint libraries.
     * @param body The request body
     * @return a {@link ContentModelUsage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/contentmodel-addtodrive?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContentModelUsage post(@jakarta.annotation.Nonnull final AddToDrivePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Apply a contentModel to SharePoint document libraries. For an existing model that&apos;s already trained, this action automatically processes new documents that are added to the SharePoint libraries.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ContentModelUsage}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/contentmodel-addtodrive?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ContentModelUsage post(@jakarta.annotation.Nonnull final AddToDrivePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ContentModelUsage::createFromDiscriminatorValue);
    }
    /**
     * Apply a contentModel to SharePoint document libraries. For an existing model that&apos;s already trained, this action automatically processes new documents that are added to the SharePoint libraries.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddToDrivePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Apply a contentModel to SharePoint document libraries. For an existing model that&apos;s already trained, this action automatically processes new documents that are added to the SharePoint libraries.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddToDrivePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AddToDriveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddToDriveRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AddToDriveRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
