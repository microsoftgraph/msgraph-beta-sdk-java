package com.microsoft.graph.beta.privilegedaccess.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.PrivilegedAccess;
import com.microsoft.graph.beta.privilegedaccess.item.resources.ResourcesRequestBuilder;
import com.microsoft.graph.beta.privilegedaccess.item.roleassignmentrequests.RoleAssignmentRequestsRequestBuilder;
import com.microsoft.graph.beta.privilegedaccess.item.roleassignments.RoleAssignmentsRequestBuilder;
import com.microsoft.graph.beta.privilegedaccess.item.roledefinitions.RoleDefinitionsRequestBuilder;
import com.microsoft.graph.beta.privilegedaccess.item.rolesettings.RoleSettingsRequestBuilder;
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
 * Provides operations to manage the collection of privilegedAccess entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedAccessItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the resources property of the microsoft.graph.privilegedAccess entity.
     * @return a {@link ResourcesRequestBuilder}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ResourcesRequestBuilder resources() {
        return new ResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignmentRequests property of the microsoft.graph.privilegedAccess entity.
     * @return a {@link RoleAssignmentRequestsRequestBuilder}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public RoleAssignmentRequestsRequestBuilder roleAssignmentRequests() {
        return new RoleAssignmentRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignments property of the microsoft.graph.privilegedAccess entity.
     * @return a {@link RoleAssignmentsRequestBuilder}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public RoleAssignmentsRequestBuilder roleAssignments() {
        return new RoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleDefinitions property of the microsoft.graph.privilegedAccess entity.
     * @return a {@link RoleDefinitionsRequestBuilder}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public RoleDefinitionsRequestBuilder roleDefinitions() {
        return new RoleDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleSettings property of the microsoft.graph.privilegedAccess entity.
     * @return a {@link RoleSettingsRequestBuilder}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public RoleSettingsRequestBuilder roleSettings() {
        return new RoleSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PrivilegedAccessItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivilegedAccessItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedAccess/{privilegedAccess%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link PrivilegedAccessItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivilegedAccessItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/privilegedAccess/{privilegedAccess%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete entity from privilegedAccess
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete entity from privilegedAccess
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @Deprecated
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get entity from privilegedAccess by key
     * @return a {@link PrivilegedAccess}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PrivilegedAccess get() {
        return get(null);
    }
    /**
     * Get entity from privilegedAccess by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrivilegedAccess}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PrivilegedAccess get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccess::createFromDiscriminatorValue);
    }
    /**
     * Update entity in privilegedAccess
     * @param body The request body
     * @return a {@link PrivilegedAccess}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PrivilegedAccess patch(@jakarta.annotation.Nonnull final PrivilegedAccess body) {
        return patch(body, null);
    }
    /**
     * Update entity in privilegedAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PrivilegedAccess}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public PrivilegedAccess patch(@jakarta.annotation.Nonnull final PrivilegedAccess body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PrivilegedAccess::createFromDiscriminatorValue);
    }
    /**
     * Delete entity from privilegedAccess
     * @return a {@link RequestInformation}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from privilegedAccess
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
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
     * Get entity from privilegedAccess by key
     * @return a {@link RequestInformation}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get entity from privilegedAccess by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
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
     * Update entity in privilegedAccess
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrivilegedAccess body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in privilegedAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PrivilegedAccess body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PrivilegedAccessItemRequestBuilder}
     * @deprecated
     * The PIM Iteration 2 beta API is deprecated and will be removed on October 28, 2026. Please migrate to PIM Iteration 3 API. as of 2025-10/PIM_Iteration2_Deprecation on 2025-10-27 and will be removed 2026-10-28
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public PrivilegedAccessItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrivilegedAccessItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get entity from privilegedAccess by key
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
