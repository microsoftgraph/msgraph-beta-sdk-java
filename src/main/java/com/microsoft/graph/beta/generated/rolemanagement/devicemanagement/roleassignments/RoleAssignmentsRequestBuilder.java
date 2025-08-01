package com.microsoft.graph.beta.rolemanagement.devicemanagement.roleassignments;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.UnifiedRoleAssignmentMultiple;
import com.microsoft.graph.beta.models.UnifiedRoleAssignmentMultipleCollectionResponse;
import com.microsoft.graph.beta.rolemanagement.devicemanagement.roleassignments.count.CountRequestBuilder;
import com.microsoft.graph.beta.rolemanagement.devicemanagement.roleassignments.item.UnifiedRoleAssignmentMultipleItemRequestBuilder;
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
 * Provides operations to manage the roleAssignments property of the microsoft.graph.rbacApplicationMultiple entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleAssignmentsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the roleAssignments property of the microsoft.graph.rbacApplicationMultiple entity.
     * @param unifiedRoleAssignmentMultipleId The unique identifier of unifiedRoleAssignmentMultiple
     * @return a {@link UnifiedRoleAssignmentMultipleItemRequestBuilder}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public UnifiedRoleAssignmentMultipleItemRequestBuilder byUnifiedRoleAssignmentMultipleId(@jakarta.annotation.Nonnull final String unifiedRoleAssignmentMultipleId) {
        Objects.requireNonNull(unifiedRoleAssignmentMultipleId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("unifiedRoleAssignmentMultiple%2Did", unifiedRoleAssignmentMultipleId);
        return new UnifiedRoleAssignmentMultipleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link RoleAssignmentsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RoleAssignmentsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/deviceManagement/roleAssignments{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link RoleAssignmentsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RoleAssignmentsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/roleManagement/deviceManagement/roleAssignments{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR Unified RBAC) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
     * @return a {@link UnifiedRoleAssignmentMultipleCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentmultiple-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UnifiedRoleAssignmentMultipleCollectionResponse get() {
        return get(null);
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR Unified RBAC) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UnifiedRoleAssignmentMultipleCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     * @see <a href="https://learn.microsoft.com/graph/api/unifiedroleassignmentmultiple-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UnifiedRoleAssignmentMultipleCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UnifiedRoleAssignmentMultipleCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new unifiedRoleAssignmentMultiple object for an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
     * @param body The request body
     * @return a {@link UnifiedRoleAssignmentMultiple}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     * @see <a href="https://learn.microsoft.com/graph/api/rbacapplicationmultiple-post-roleassignments?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UnifiedRoleAssignmentMultiple post(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentMultiple body) {
        return post(body, null);
    }
    /**
     * Create a new unifiedRoleAssignmentMultiple object for an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UnifiedRoleAssignmentMultiple}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     * @see <a href="https://learn.microsoft.com/graph/api/rbacapplicationmultiple-post-roleassignments?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public UnifiedRoleAssignmentMultiple post(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentMultiple body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UnifiedRoleAssignmentMultiple::createFromDiscriminatorValue);
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR Unified RBAC) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
     * @return a {@link RequestInformation}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR Unified RBAC) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
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
     * Create a new unifiedRoleAssignmentMultiple object for an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentMultiple body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new unifiedRoleAssignmentMultiple object for an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UnifiedRoleAssignmentMultiple body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link RoleAssignmentsRequestBuilder}
     * @deprecated
     * This version is being deprecated and is scheduled for removal on 2025-12-01.Please migrate to the latest version before the removal date. as of 2025-01/PrivatePreview:microsoft.applicationAuthorization on 2025-01-01 and will be removed 2025-12-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RoleAssignmentsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RoleAssignmentsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the properties and relationships of a unifiedRoleAssignmentMultiple object of an RBAC provider.  The following RBAC providers are currently supported:- Cloud PC - device management (Intune)- Defender (Microsoft Defender XDR Unified RBAC) For other Microsoft 365 applications (like Microsoft Entra ID), use unifiedRoleAssignment.
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
