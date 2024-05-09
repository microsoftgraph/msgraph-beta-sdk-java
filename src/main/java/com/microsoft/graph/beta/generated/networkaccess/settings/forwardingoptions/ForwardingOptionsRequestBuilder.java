package com.microsoft.graph.beta.networkaccess.settings.forwardingoptions;

import com.microsoft.graph.beta.models.networkaccess.ForwardingOptions;
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
 * Provides operations to manage the forwardingOptions property of the microsoft.graph.networkaccess.settings entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ForwardingOptionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ForwardingOptionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ForwardingOptionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/settings/forwardingOptions{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ForwardingOptionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ForwardingOptionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/settings/forwardingOptions{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property forwardingOptions for networkAccess
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property forwardingOptions for networkAccess
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
     * Retrieve the forwarding options for the tenant, with a specific focus on the 'skipDnsLookupState' flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
     * @return a {@link ForwardingOptions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-forwardingoptions-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ForwardingOptions get() {
        return get(null);
    }
    /**
     * Retrieve the forwarding options for the tenant, with a specific focus on the 'skipDnsLookupState' flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ForwardingOptions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-forwardingoptions-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ForwardingOptions get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ForwardingOptions::createFromDiscriminatorValue);
    }
    /**
     * the forwarding options for the tenant, with a specific focus on the skipDnsLookupState flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
     * @param body The request body
     * @return a {@link ForwardingOptions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-forwardingoptions-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ForwardingOptions patch(@jakarta.annotation.Nonnull final ForwardingOptions body) {
        return patch(body, null);
    }
    /**
     * the forwarding options for the tenant, with a specific focus on the skipDnsLookupState flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ForwardingOptions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-forwardingoptions-update?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ForwardingOptions patch(@jakarta.annotation.Nonnull final ForwardingOptions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ForwardingOptions::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property forwardingOptions for networkAccess
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property forwardingOptions for networkAccess
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the forwarding options for the tenant, with a specific focus on the 'skipDnsLookupState' flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the forwarding options for the tenant, with a specific focus on the 'skipDnsLookupState' flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
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
     * the forwarding options for the tenant, with a specific focus on the skipDnsLookupState flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ForwardingOptions body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * the forwarding options for the tenant, with a specific focus on the skipDnsLookupState flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ForwardingOptions body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ForwardingOptionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ForwardingOptionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ForwardingOptionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the forwarding options for the tenant, with a specific focus on the 'skipDnsLookupState' flag. This flag determines whether DNS lookup will be skipped, allowing Microsoft 365 traffic to be forwarded directly to the Front Door using the client-resolved destination.
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
