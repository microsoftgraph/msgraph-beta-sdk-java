package com.microsoft.graph.tenantrelationships.managedtenants.tenants.item.microsoftgraphmanagedtenantsoffboardtenant;

import com.microsoft.graph.models.managedtenants.Tenant;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the offboardTenant method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphManagedTenantsOffboardTenantRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new MicrosoftGraphManagedTenantsOffboardTenantRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphManagedTenantsOffboardTenantRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/tenants/{tenant%2Did}/microsoft.graph.managedTenants.offboardTenant", pathParameters);
    }
    /**
     * Instantiates a new MicrosoftGraphManagedTenantsOffboardTenantRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphManagedTenantsOffboardTenantRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/tenants/{tenant%2Did}/microsoft.graph.managedTenants.offboardTenant", rawUrl);
    }
    /**
     * Carries out the appropriate procedures to remove a managed tenant from the multi-tenant management platform. No relationships, such as commerce and delegate administrative privileges, will be impacted. The only change made by invoking this action is the tenant will be deprovisioned from the multi-tenant management platform. This API is supported in the following national cloud deployments.
     * @return a CompletableFuture of Tenant
     * @see <a href="https://learn.microsoft.com/graph/api/managedtenants-tenant-offboardtenant?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Tenant> post() {
        return post(null);
    }
    /**
     * Carries out the appropriate procedures to remove a managed tenant from the multi-tenant management platform. No relationships, such as commerce and delegate administrative privileges, will be impacted. The only change made by invoking this action is the tenant will be deprovisioned from the multi-tenant management platform. This API is supported in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Tenant
     * @see <a href="https://learn.microsoft.com/graph/api/managedtenants-tenant-offboardtenant?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Tenant> post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Tenant::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Carries out the appropriate procedures to remove a managed tenant from the multi-tenant management platform. No relationships, such as commerce and delegate administrative privileges, will be impacted. The only change made by invoking this action is the tenant will be deprovisioned from the multi-tenant management platform. This API is supported in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Carries out the appropriate procedures to remove a managed tenant from the multi-tenant management platform. No relationships, such as commerce and delegate administrative privileges, will be impacted. The only change made by invoking this action is the tenant will be deprovisioned from the multi-tenant management platform. This API is supported in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MicrosoftGraphManagedTenantsOffboardTenantRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphManagedTenantsOffboardTenantRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphManagedTenantsOffboardTenantRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
