package com.microsoft.graph.beta.networkaccess.connectivity.branches.item;

import com.microsoft.graph.beta.models.networkaccess.BranchSite;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.networkaccess.connectivity.branches.item.connectivityconfiguration.ConnectivityConfigurationRequestBuilder;
import com.microsoft.graph.beta.networkaccess.connectivity.branches.item.devicelinks.DeviceLinksRequestBuilder;
import com.microsoft.graph.beta.networkaccess.connectivity.branches.item.forwardingprofiles.ForwardingProfilesRequestBuilder;
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
 * Provides operations to manage the branches property of the microsoft.graph.networkaccess.connectivity entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BranchSiteItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the connectivityConfiguration property of the microsoft.graph.networkaccess.branchSite entity.
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ConnectivityConfigurationRequestBuilder connectivityConfiguration() {
        return new ConnectivityConfigurationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceLinks property of the microsoft.graph.networkaccess.branchSite entity.
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public DeviceLinksRequestBuilder deviceLinks() {
        return new DeviceLinksRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the forwardingProfiles property of the microsoft.graph.networkaccess.branchSite entity.
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ForwardingProfilesRequestBuilder forwardingProfiles() {
        return new ForwardingProfilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new BranchSiteItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BranchSiteItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/connectivity/branches/{branchSite%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new BranchSiteItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BranchSiteItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/connectivity/branches/{branchSite%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete a specific branch.
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-branchsite-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete a specific branch.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-branchsite-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve information about a specific branch.
     * @return a BranchSite
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-branchsite-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public BranchSite get() {
        return get(null);
    }
    /**
     * Retrieve information about a specific branch.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BranchSite
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-branchsite-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public BranchSite get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BranchSite::createFromDiscriminatorValue);
    }
    /**
     * Update the configuration or properties of a specific branch.
     * @param body The request body
     * @return a BranchSite
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-branchsite-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public BranchSite patch(@jakarta.annotation.Nonnull final BranchSite body) {
        return patch(body, null);
    }
    /**
     * Update the configuration or properties of a specific branch.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BranchSite
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     * @see <a href="https://learn.microsoft.com/graph/api/networkaccess-branchsite-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public BranchSite patch(@jakarta.annotation.Nonnull final BranchSite body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BranchSite::createFromDiscriminatorValue);
    }
    /**
     * Delete a specific branch.
     * @return a RequestInformation
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a specific branch.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve information about a specific branch.
     * @return a RequestInformation
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve information about a specific branch.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the configuration or properties of a specific branch.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final BranchSite body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the configuration or properties of a specific branch.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final BranchSite body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a BranchSiteItemRequestBuilder
     * @deprecated
     * The Branches API is deprecated and will stop returning data on January 20, 2024. Please use the new Remote Network API. as of 2022-06/PrivatePreview:NetworkAccess
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public BranchSiteItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BranchSiteItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve information about a specific branch.
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
         * @return a Map<String, Object>
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
