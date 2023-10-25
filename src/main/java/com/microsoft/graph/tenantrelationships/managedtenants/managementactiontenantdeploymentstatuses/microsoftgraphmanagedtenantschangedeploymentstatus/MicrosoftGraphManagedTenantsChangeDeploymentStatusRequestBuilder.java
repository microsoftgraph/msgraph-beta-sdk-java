package com.microsoft.graph.tenantrelationships.managedtenants.managementactiontenantdeploymentstatuses.microsoftgraphmanagedtenantschangedeploymentstatus;

import com.microsoft.graph.models.managedtenants.ManagementActionDeploymentStatus;
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
 * Provides operations to call the changeDeploymentStatus method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managementActionTenantDeploymentStatuses/microsoft.graph.managedTenants.changeDeploymentStatus", pathParameters);
    }
    /**
     * Instantiates a new MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/managedTenants/managementActionTenantDeploymentStatuses/microsoft.graph.managedTenants.changeDeploymentStatus", rawUrl);
    }
    /**
     * Invoke action changeDeploymentStatus
     * @param body The request body
     * @return a CompletableFuture of ManagementActionDeploymentStatus
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagementActionDeploymentStatus> post(@jakarta.annotation.Nonnull final ChangeDeploymentStatusPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Invoke action changeDeploymentStatus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ManagementActionDeploymentStatus
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ManagementActionDeploymentStatus> post(@jakarta.annotation.Nonnull final ChangeDeploymentStatusPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, ManagementActionDeploymentStatus::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke action changeDeploymentStatus
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ChangeDeploymentStatusPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Invoke action changeDeploymentStatus
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ChangeDeploymentStatusPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MicrosoftGraphManagedTenantsChangeDeploymentStatusRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
