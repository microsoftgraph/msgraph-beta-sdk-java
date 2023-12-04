package com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.item;

import com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.item.apply.ApplyRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.item.assign.AssignRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.provisioningpolicies.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.models.CloudPcProvisioningPolicy;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the provisioningPolicies property of the microsoft.graph.virtualEndpoint entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcProvisioningPolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the apply method.
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public ApplyRequestBuilder apply() {
        return new ApplyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assign method.
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.cloudPcProvisioningPolicy entity.
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CloudPcProvisioningPolicyItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPcProvisioningPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/provisioningPolicies/{cloudPcProvisioningPolicy%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CloudPcProvisioningPolicyItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPcProvisioningPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/provisioningPolicies/{cloudPcProvisioningPolicy%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a cloudPcProvisioningPolicy object. You cant delete a policy thats in use. This API is available in the following national cloud deployments.
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcprovisioningpolicy-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete a cloudPcProvisioningPolicy object. You cant delete a policy thats in use. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcprovisioningpolicy-delete?view=graph-rest-1.0">Find more info here</a>
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
     * Read the properties and relationships of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @return a CloudPcProvisioningPolicy
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcprovisioningpolicy-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcProvisioningPolicy get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPcProvisioningPolicy
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcprovisioningpolicy-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcProvisioningPolicy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcProvisioningPolicy::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a CloudPcProvisioningPolicy
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcprovisioningpolicy-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcProvisioningPolicy patch(@jakarta.annotation.Nonnull final CloudPcProvisioningPolicy body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPcProvisioningPolicy
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcprovisioningpolicy-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcProvisioningPolicy patch(@jakarta.annotation.Nonnull final CloudPcProvisioningPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcProvisioningPolicy::createFromDiscriminatorValue);
    }
    /**
     * Delete a cloudPcProvisioningPolicy object. You cant delete a policy thats in use. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a cloudPcProvisioningPolicy object. You cant delete a policy thats in use. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
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
     * Read the properties and relationships of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
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
     * Update the properties of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPcProvisioningPolicy body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPcProvisioningPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a CloudPcProvisioningPolicyItemRequestBuilder
     * @deprecated
     * The onPremisesConnectionId property is deprecated and will stop returning on July 30, 2023. as of 2023-03/onPremisesConnectionId on 2023-03-16 and will be removed 2023-07-30
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CloudPcProvisioningPolicyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CloudPcProvisioningPolicyItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a cloudPcProvisioningPolicy object. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
