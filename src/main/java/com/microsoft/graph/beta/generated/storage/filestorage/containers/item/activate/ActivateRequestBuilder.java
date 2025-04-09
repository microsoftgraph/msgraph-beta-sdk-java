package com.microsoft.graph.beta.storage.filestorage.containers.item.activate;

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
 * Provides operations to call the activate method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ActivateRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActivateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/activate", pathParameters);
    }
    /**
     * Instantiates a new {@link ActivateRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActivateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containers/{fileStorageContainer%2Did}/activate", rawUrl);
    }
    /**
     * Activate a fileStorageContainer object. A fileStorageContainer object is created in an inactive state, as indicated by the status property. A container that isn&apos;t activated within 24 hours after creation is automatically deleted. Upon activation, the value of the status property changes from inactive to active. A file storage container can be activated by calling this API or any API that updates or modifies it or its content. For example, uploading a file to a file storage container activates it. It&apos;s also activated when you add permissions to it or update them, or create a custom property on it.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/filestoragecontainer-activate?view=graph-rest-beta">Find more info here</a>
     */
    public void post() {
        post(null);
    }
    /**
     * Activate a fileStorageContainer object. A fileStorageContainer object is created in an inactive state, as indicated by the status property. A container that isn&apos;t activated within 24 hours after creation is automatically deleted. Upon activation, the value of the status property changes from inactive to active. A file storage container can be activated by calling this API or any API that updates or modifies it or its content. For example, uploading a file to a file storage container activates it. It&apos;s also activated when you add permissions to it or update them, or create a custom property on it.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/filestoragecontainer-activate?view=graph-rest-beta">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Activate a fileStorageContainer object. A fileStorageContainer object is created in an inactive state, as indicated by the status property. A container that isn&apos;t activated within 24 hours after creation is automatically deleted. Upon activation, the value of the status property changes from inactive to active. A file storage container can be activated by calling this API or any API that updates or modifies it or its content. For example, uploading a file to a file storage container activates it. It&apos;s also activated when you add permissions to it or update them, or create a custom property on it.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Activate a fileStorageContainer object. A fileStorageContainer object is created in an inactive state, as indicated by the status property. A container that isn&apos;t activated within 24 hours after creation is automatically deleted. Upon activation, the value of the status property changes from inactive to active. A file storage container can be activated by calling this API or any API that updates or modifies it or its content. For example, uploading a file to a file storage container activates it. It&apos;s also activated when you add permissions to it or update them, or create a custom property on it.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ActivateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ActivateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
