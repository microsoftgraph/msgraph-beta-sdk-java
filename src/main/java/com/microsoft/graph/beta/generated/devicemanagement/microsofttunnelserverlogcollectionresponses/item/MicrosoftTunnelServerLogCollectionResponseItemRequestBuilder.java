package com.microsoft.graph.beta.devicemanagement.microsofttunnelserverlogcollectionresponses.item;

import com.microsoft.graph.beta.devicemanagement.microsofttunnelserverlogcollectionresponses.item.createdownloadurl.CreateDownloadUrlRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.microsofttunnelserverlogcollectionresponses.item.generatedownloadurl.GenerateDownloadUrlRequestBuilder;
import com.microsoft.graph.beta.models.MicrosoftTunnelServerLogCollectionResponse;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the microsoftTunnelServerLogCollectionResponses property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftTunnelServerLogCollectionResponseItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the createDownloadUrl method.
     * @return a {@link CreateDownloadUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateDownloadUrlRequestBuilder createDownloadUrl() {
        return new CreateDownloadUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the generateDownloadUrl method.
     * @return a {@link GenerateDownloadUrlRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GenerateDownloadUrlRequestBuilder generateDownloadUrl() {
        return new GenerateDownloadUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MicrosoftTunnelServerLogCollectionResponseItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftTunnelServerLogCollectionResponseItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/microsoftTunnelServerLogCollectionResponses/{microsoftTunnelServerLogCollectionResponse%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link MicrosoftTunnelServerLogCollectionResponseItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftTunnelServerLogCollectionResponseItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/microsoftTunnelServerLogCollectionResponses/{microsoftTunnelServerLogCollectionResponse%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property microsoftTunnelServerLogCollectionResponses for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property microsoftTunnelServerLogCollectionResponses for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @return a {@link MicrosoftTunnelServerLogCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelServerLogCollectionResponse get() {
        return get(null);
    }
    /**
     * Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MicrosoftTunnelServerLogCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelServerLogCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MicrosoftTunnelServerLogCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property microsoftTunnelServerLogCollectionResponses in deviceManagement
     * @param body The request body
     * @return a {@link MicrosoftTunnelServerLogCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelServerLogCollectionResponse patch(@jakarta.annotation.Nonnull final MicrosoftTunnelServerLogCollectionResponse body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property microsoftTunnelServerLogCollectionResponses in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link MicrosoftTunnelServerLogCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelServerLogCollectionResponse patch(@jakarta.annotation.Nonnull final MicrosoftTunnelServerLogCollectionResponse body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, MicrosoftTunnelServerLogCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property microsoftTunnelServerLogCollectionResponses for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property microsoftTunnelServerLogCollectionResponses for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property microsoftTunnelServerLogCollectionResponses in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MicrosoftTunnelServerLogCollectionResponse body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property microsoftTunnelServerLogCollectionResponses in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final MicrosoftTunnelServerLogCollectionResponse body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link MicrosoftTunnelServerLogCollectionResponseItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftTunnelServerLogCollectionResponseItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftTunnelServerLogCollectionResponseItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
