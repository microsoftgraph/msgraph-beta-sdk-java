package com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatestepversions.item;

import com.microsoft.graph.beta.models.managedtenants.ManagementTemplateStepVersion;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatestepversions.item.acceptedfor.AcceptedForRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatestepversions.item.deployments.DeploymentsRequestBuilder;
import com.microsoft.graph.beta.tenantrelationships.managedtenants.managementtemplatestepversions.item.templatestep.TemplateStepRequestBuilder;
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
 * Provides operations to manage the managementTemplateStepVersions property of the microsoft.graph.managedTenants.managedTenant entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagementTemplateStepVersionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the acceptedFor property of the microsoft.graph.managedTenants.managementTemplateStepVersion entity.
     * @return a {@link AcceptedForRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptedForRequestBuilder acceptedFor() {
        return new AcceptedForRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deployments property of the microsoft.graph.managedTenants.managementTemplateStepVersion entity.
     * @return a {@link DeploymentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeploymentsRequestBuilder deployments() {
        return new DeploymentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the templateStep property of the microsoft.graph.managedTenants.managementTemplateStepVersion entity.
     * @return a {@link TemplateStepRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TemplateStepRequestBuilder templateStep() {
        return new TemplateStepRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ManagementTemplateStepVersionItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagementTemplateStepVersionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managementTemplateStepVersions/{managementTemplateStepVersion%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link ManagementTemplateStepVersionItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ManagementTemplateStepVersionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managementTemplateStepVersions/{managementTemplateStepVersion%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property managementTemplateStepVersions for tenantRelationships
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property managementTemplateStepVersions for tenantRelationships
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
     * Get managementTemplateStepVersions from tenantRelationships
     * @return a {@link ManagementTemplateStepVersion}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStepVersion get() {
        return get(null);
    }
    /**
     * Get managementTemplateStepVersions from tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagementTemplateStepVersion}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStepVersion get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagementTemplateStepVersion::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property managementTemplateStepVersions in tenantRelationships
     * @param body The request body
     * @return a {@link ManagementTemplateStepVersion}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStepVersion patch(@jakarta.annotation.Nonnull final ManagementTemplateStepVersion body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property managementTemplateStepVersions in tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ManagementTemplateStepVersion}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ManagementTemplateStepVersion patch(@jakarta.annotation.Nonnull final ManagementTemplateStepVersion body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ManagementTemplateStepVersion::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property managementTemplateStepVersions for tenantRelationships
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property managementTemplateStepVersions for tenantRelationships
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
     * Get managementTemplateStepVersions from tenantRelationships
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get managementTemplateStepVersions from tenantRelationships
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
     * Update the navigation property managementTemplateStepVersions in tenantRelationships
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagementTemplateStepVersion body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property managementTemplateStepVersions in tenantRelationships
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ManagementTemplateStepVersion body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ManagementTemplateStepVersionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ManagementTemplateStepVersionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ManagementTemplateStepVersionItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get managementTemplateStepVersions from tenantRelationships
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
