package com.microsoft.graph.beta.storage.filestorage.containertypes.item.permissions;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.Permission;
import com.microsoft.graph.beta.models.PermissionCollectionResponse;
import com.microsoft.graph.beta.storage.filestorage.containertypes.item.permissions.count.CountRequestBuilder;
import com.microsoft.graph.beta.storage.filestorage.containertypes.item.permissions.item.PermissionItemRequestBuilder;
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
 * Provides operations to manage the permissions property of the microsoft.graph.fileStorageContainerType entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissions property of the microsoft.graph.fileStorageContainerType entity.
     * @param permissionId The unique identifier of permission
     * @return a {@link PermissionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionItemRequestBuilder byPermissionId(@jakarta.annotation.Nonnull final String permissionId) {
        Objects.requireNonNull(permissionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("permission%2Did", permissionId);
        return new PermissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link PermissionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PermissionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containerTypes/{fileStorageContainerType%2Did}/permissions{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link PermissionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PermissionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/storage/fileStorage/containerTypes/{fileStorageContainerType%2Did}/permissions{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the list of permission objects associated with a fileStorageContainerType. Each permission represents a user with management rights to the container type. The calling user must be listed in the permissions collection for the container type with the owner role, or be a SharePoint Embedded Administrator or Global Administrator.
     * @return a {@link PermissionCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/filestoragecontainertype-list-permissions?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PermissionCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the list of permission objects associated with a fileStorageContainerType. Each permission represents a user with management rights to the container type. The calling user must be listed in the permissions collection for the container type with the owner role, or be a SharePoint Embedded Administrator or Global Administrator.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PermissionCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/filestoragecontainertype-list-permissions?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PermissionCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PermissionCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a user permission object, which adds this permission to a fileStorageContainerType. Only existing owners (users with the owner role in the permissions collection of the container type), SharePoint Embedded Administrators, or Global Administrators can add permissions. The following constraints apply:- A maximum of 3 permissions per container type is allowed. Adding a fourth permission returns a 400 Bad Request error.- Duplicate permissions are treated as idempotent. If the specified user already has a permission on the container type, the service makes no changes and returns the existing permission resource in the response body with a 201 Created status, even though no new permission is created.- Currently only the owner role is supported.
     * @param body The request body
     * @return a {@link Permission}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/filestoragecontainertype-post-permissions?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Permission post(@jakarta.annotation.Nonnull final Permission body) {
        return post(body, null);
    }
    /**
     * Create a user permission object, which adds this permission to a fileStorageContainerType. Only existing owners (users with the owner role in the permissions collection of the container type), SharePoint Embedded Administrators, or Global Administrators can add permissions. The following constraints apply:- A maximum of 3 permissions per container type is allowed. Adding a fourth permission returns a 400 Bad Request error.- Duplicate permissions are treated as idempotent. If the specified user already has a permission on the container type, the service makes no changes and returns the existing permission resource in the response body with a 201 Created status, even though no new permission is created.- Currently only the owner role is supported.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Permission}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/filestoragecontainertype-post-permissions?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Permission post(@jakarta.annotation.Nonnull final Permission body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Permission::createFromDiscriminatorValue);
    }
    /**
     * Get the list of permission objects associated with a fileStorageContainerType. Each permission represents a user with management rights to the container type. The calling user must be listed in the permissions collection for the container type with the owner role, or be a SharePoint Embedded Administrator or Global Administrator.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the list of permission objects associated with a fileStorageContainerType. Each permission represents a user with management rights to the container type. The calling user must be listed in the permissions collection for the container type with the owner role, or be a SharePoint Embedded Administrator or Global Administrator.
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
     * Create a user permission object, which adds this permission to a fileStorageContainerType. Only existing owners (users with the owner role in the permissions collection of the container type), SharePoint Embedded Administrators, or Global Administrators can add permissions. The following constraints apply:- A maximum of 3 permissions per container type is allowed. Adding a fourth permission returns a 400 Bad Request error.- Duplicate permissions are treated as idempotent. If the specified user already has a permission on the container type, the service makes no changes and returns the existing permission resource in the response body with a 201 Created status, even though no new permission is created.- Currently only the owner role is supported.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Permission body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a user permission object, which adds this permission to a fileStorageContainerType. Only existing owners (users with the owner role in the permissions collection of the container type), SharePoint Embedded Administrators, or Global Administrators can add permissions. The following constraints apply:- A maximum of 3 permissions per container type is allowed. Adding a fourth permission returns a 400 Bad Request error.- Duplicate permissions are treated as idempotent. If the specified user already has a permission on the container type, the service makes no changes and returns the existing permission resource in the response body with a 201 Created status, even though no new permission is created.- Currently only the owner role is supported.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final Permission body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PermissionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PermissionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the list of permission objects associated with a fileStorageContainerType. Each permission represents a user with management rights to the container type. The calling user must be listed in the permissions collection for the container type with the owner role, or be a SharePoint Embedded Administrator or Global Administrator.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
