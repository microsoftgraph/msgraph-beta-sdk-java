package com.microsoft.graph.beta.devicemanagement.virtualendpoint.shareduseserviceplans.item;

import com.microsoft.graph.beta.models.CloudPcSharedUseServicePlan;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the sharedUseServicePlans property of the microsoft.graph.virtualEndpoint entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcSharedUseServicePlanItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new CloudPcSharedUseServicePlanItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPcSharedUseServicePlanItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/sharedUseServicePlans/{cloudPcSharedUseServicePlan%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CloudPcSharedUseServicePlanItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPcSharedUseServicePlanItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/sharedUseServicePlans/{cloudPcSharedUseServicePlan%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property sharedUseServicePlans for deviceManagement
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     */
    @Deprecated
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property sharedUseServicePlans for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
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
     * Read the properties and relationships of a cloudPcSharedUseServicePlan object.
     * @return a CloudPcSharedUseServicePlan
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcshareduseserviceplan-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcSharedUseServicePlan get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a cloudPcSharedUseServicePlan object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPcSharedUseServicePlan
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcshareduseserviceplan-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcSharedUseServicePlan get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcSharedUseServicePlan::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property sharedUseServicePlans in deviceManagement
     * @param body The request body
     * @return a CloudPcSharedUseServicePlan
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcSharedUseServicePlan patch(@jakarta.annotation.Nonnull final CloudPcSharedUseServicePlan body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property sharedUseServicePlans in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPcSharedUseServicePlan
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcSharedUseServicePlan patch(@jakarta.annotation.Nonnull final CloudPcSharedUseServicePlan body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcSharedUseServicePlan::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property sharedUseServicePlans for deviceManagement
     * @return a RequestInformation
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property sharedUseServicePlans for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
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
     * Read the properties and relationships of a cloudPcSharedUseServicePlan object.
     * @return a RequestInformation
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a cloudPcSharedUseServicePlan object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
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
     * Update the navigation property sharedUseServicePlans in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPcSharedUseServicePlan body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property sharedUseServicePlans in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPcSharedUseServicePlan body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a CloudPcSharedUseServicePlanItemRequestBuilder
     * @deprecated
     * The sharedUseServicePlans property is deprecated and will not be supported starting Oct 8, 2023. This property will not be included as part of the API response. as of 2023-03/sharedUseServicePlans on 2023-06-08 and will be removed 2023-10-08
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CloudPcSharedUseServicePlanItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CloudPcSharedUseServicePlanItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Read the properties and relationships of a cloudPcSharedUseServicePlan object.
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
