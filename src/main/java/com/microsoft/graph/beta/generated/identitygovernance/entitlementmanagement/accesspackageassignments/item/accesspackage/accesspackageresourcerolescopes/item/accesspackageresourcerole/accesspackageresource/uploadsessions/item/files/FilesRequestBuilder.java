package com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackageresourcerolescopes.item.accesspackageresourcerole.accesspackageresource.uploadsessions.item.files;

import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackageresourcerolescopes.item.accesspackageresourcerole.accesspackageresource.uploadsessions.item.files.count.CountRequestBuilder;
import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageassignments.item.accesspackage.accesspackageresourcerolescopes.item.accesspackageresourcerole.accesspackageresource.uploadsessions.item.files.item.CustomDataProvidedResourceFileNameItemRequestBuilder;
import com.microsoft.graph.beta.models.CustomDataProvidedResourceFile;
import com.microsoft.graph.beta.models.CustomDataProvidedResourceFileCollectionResponse;
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
 * Provides operations to manage the files property of the microsoft.graph.customDataProvidedResourceUploadSession entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the files property of the microsoft.graph.customDataProvidedResourceUploadSession entity.
     * @param customDataProvidedResourceFileName The unique identifier of customDataProvidedResourceFile
     * @return a {@link CustomDataProvidedResourceFileNameItemRequestBuilder}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CustomDataProvidedResourceFileNameItemRequestBuilder byCustomDataProvidedResourceFileName(@jakarta.annotation.Nonnull final String customDataProvidedResourceFileName) {
        Objects.requireNonNull(customDataProvidedResourceFileName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customDataProvidedResourceFile%2Dname", customDataProvidedResourceFileName);
        return new CustomDataProvidedResourceFileNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link FilesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FilesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment%2Did}/accessPackage/accessPackageResourceRoleScopes/{accessPackageResourceRoleScope%2Did}/accessPackageResourceRole/accessPackageResource/uploadSessions/{customDataProvidedResourceUploadSession%2Did}/files{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link FilesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FilesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignment%2Did}/accessPackage/accessPackageResourceRoleScopes/{accessPackageResourceRoleScope%2Did}/accessPackageResourceRole/accessPackageResource/uploadSessions/{customDataProvidedResourceUploadSession%2Did}/files{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get files from identityGovernance
     * @return a {@link CustomDataProvidedResourceFileCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CustomDataProvidedResourceFileCollectionResponse get() {
        return get(null);
    }
    /**
     * Get files from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomDataProvidedResourceFileCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CustomDataProvidedResourceFileCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomDataProvidedResourceFileCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to files for identityGovernance
     * @param body The request body
     * @return a {@link CustomDataProvidedResourceFile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CustomDataProvidedResourceFile post(@jakarta.annotation.Nonnull final CustomDataProvidedResourceFile body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to files for identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomDataProvidedResourceFile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CustomDataProvidedResourceFile post(@jakarta.annotation.Nonnull final CustomDataProvidedResourceFile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomDataProvidedResourceFile::createFromDiscriminatorValue);
    }
    /**
     * Get files from identityGovernance
     * @return a {@link RequestInformation}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get files from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
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
     * Create new navigation property to files for identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CustomDataProvidedResourceFile body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to files for identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CustomDataProvidedResourceFile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link FilesRequestBuilder}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public FilesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FilesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get files from identityGovernance
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
