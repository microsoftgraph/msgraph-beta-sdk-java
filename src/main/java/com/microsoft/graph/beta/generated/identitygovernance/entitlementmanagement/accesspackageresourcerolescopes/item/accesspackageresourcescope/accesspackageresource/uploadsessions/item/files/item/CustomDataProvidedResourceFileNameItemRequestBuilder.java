package com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageresourcerolescopes.item.accesspackageresourcescope.accesspackageresource.uploadsessions.item.files.item;

import com.microsoft.graph.beta.identitygovernance.entitlementmanagement.accesspackageresourcerolescopes.item.accesspackageresourcescope.accesspackageresource.uploadsessions.item.files.item.value.ContentRequestBuilder;
import com.microsoft.graph.beta.models.CustomDataProvidedResourceFile;
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
public class CustomDataProvidedResourceFileNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the identityGovernance entity.
     * @return a {@link ContentRequestBuilder}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CustomDataProvidedResourceFileNameItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomDataProvidedResourceFileNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageResourceRoleScopes/{accessPackageResourceRoleScope%2Did}/accessPackageResourceScope/accessPackageResource/uploadSessions/{customDataProvidedResourceUploadSession%2Did}/files/{customDataProvidedResourceFile%2Dname}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CustomDataProvidedResourceFileNameItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustomDataProvidedResourceFileNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/entitlementManagement/accessPackageResourceRoleScopes/{accessPackageResourceRoleScope%2Did}/accessPackageResourceScope/accessPackageResource/uploadSessions/{customDataProvidedResourceUploadSession%2Did}/files/{customDataProvidedResourceFile%2Dname}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property files for identityGovernance
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property files for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get files from identityGovernance
     * @return a {@link CustomDataProvidedResourceFile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CustomDataProvidedResourceFile get() {
        return get(null);
    }
    /**
     * Get files from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomDataProvidedResourceFile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CustomDataProvidedResourceFile get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomDataProvidedResourceFile::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property files in identityGovernance
     * @param body The request body
     * @return a {@link CustomDataProvidedResourceFile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CustomDataProvidedResourceFile patch(@jakarta.annotation.Nonnull final CustomDataProvidedResourceFile body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property files in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomDataProvidedResourceFile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CustomDataProvidedResourceFile patch(@jakarta.annotation.Nonnull final CustomDataProvidedResourceFile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomDataProvidedResourceFile::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property files for identityGovernance
     * @return a {@link RequestInformation}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property files for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
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
     * Update the navigation property files in identityGovernance
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CustomDataProvidedResourceFile body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property files in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CustomDataProvidedResourceFile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CustomDataProvidedResourceFileNameItemRequestBuilder}
     * @deprecated
     * This API is for private preview. as of 2025-07/PrivatePreview:uploadSessions on 2025-07-31 and will be removed 2026-07-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CustomDataProvidedResourceFileNameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CustomDataProvidedResourceFileNameItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get files from identityGovernance
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
