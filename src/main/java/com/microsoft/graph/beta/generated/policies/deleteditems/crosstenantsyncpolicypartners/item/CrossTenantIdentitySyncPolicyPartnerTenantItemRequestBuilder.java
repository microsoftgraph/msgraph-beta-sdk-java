package com.microsoft.graph.beta.policies.deleteditems.crosstenantsyncpolicypartners.item;

import com.microsoft.graph.beta.models.CrossTenantIdentitySyncPolicyPartner;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.policies.deleteditems.crosstenantsyncpolicypartners.item.restore.RestoreRequestBuilder;
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
 * Provides operations to manage the crossTenantSyncPolicyPartners property of the microsoft.graph.policyDeletableRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantIdentitySyncPolicyPartnerTenantItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the restore method.
     * @return a {@link RestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CrossTenantIdentitySyncPolicyPartnerTenantItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CrossTenantIdentitySyncPolicyPartnerTenantItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/deletedItems/crossTenantSyncPolicyPartners/{crossTenantIdentitySyncPolicyPartner%2DtenantId}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CrossTenantIdentitySyncPolicyPartnerTenantItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CrossTenantIdentitySyncPolicyPartnerTenantItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/policies/deletedItems/crossTenantSyncPolicyPartners/{crossTenantIdentitySyncPolicyPartner%2DtenantId}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Permanently delete a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/policydeletableitem-delete?view=graph-rest-beta">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Permanently delete a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/policydeletableitem-delete?view=graph-rest-beta">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Read the properties and relationships of a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
     * @return a {@link CrossTenantIdentitySyncPolicyPartner}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/policydeletableitem-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantIdentitySyncPolicyPartner get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CrossTenantIdentitySyncPolicyPartner}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/policydeletableitem-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CrossTenantIdentitySyncPolicyPartner get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantIdentitySyncPolicyPartner::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property crossTenantSyncPolicyPartners in policies
     * @param body The request body
     * @return a {@link CrossTenantIdentitySyncPolicyPartner}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CrossTenantIdentitySyncPolicyPartner put(@jakarta.annotation.Nonnull final CrossTenantIdentitySyncPolicyPartner body) {
        return put(body, null);
    }
    /**
     * Update the navigation property crossTenantSyncPolicyPartners in policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CrossTenantIdentitySyncPolicyPartner}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CrossTenantIdentitySyncPolicyPartner put(@jakarta.annotation.Nonnull final CrossTenantIdentitySyncPolicyPartner body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CrossTenantIdentitySyncPolicyPartner::createFromDiscriminatorValue);
    }
    /**
     * Permanently delete a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Permanently delete a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
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
     * Read the properties and relationships of a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
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
     * Update the navigation property crossTenantSyncPolicyPartners in policies
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final CrossTenantIdentitySyncPolicyPartner body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update the navigation property crossTenantSyncPolicyPartners in policies
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final CrossTenantIdentitySyncPolicyPartner body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CrossTenantIdentitySyncPolicyPartnerTenantItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CrossTenantIdentitySyncPolicyPartnerTenantItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CrossTenantIdentitySyncPolicyPartnerTenantItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a policyDeletableItem object, which might be one of the following deleted policy types:- crossTenantAccessPolicyConfigurationPartner- crossTenantIdentitySyncPolicyPartner
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
