package com.microsoft.graph.devicemanagement.zebrafotaconnector;

import com.microsoft.graph.devicemanagement.zebrafotaconnector.approvefotaapps.ApproveFotaAppsRequestBuilder;
import com.microsoft.graph.devicemanagement.zebrafotaconnector.connect.ConnectRequestBuilder;
import com.microsoft.graph.devicemanagement.zebrafotaconnector.disconnect.DisconnectRequestBuilder;
import com.microsoft.graph.devicemanagement.zebrafotaconnector.hasactivedeployments.HasActiveDeploymentsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ZebraFotaConnector;
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
 * Provides operations to manage the zebraFotaConnector property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ZebraFotaConnectorRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the approveFotaApps method.
     */
    @jakarta.annotation.Nonnull
    public ApproveFotaAppsRequestBuilder approveFotaApps() {
        return new ApproveFotaAppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the connect method.
     */
    @jakarta.annotation.Nonnull
    public ConnectRequestBuilder connect() {
        return new ConnectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disconnect method.
     */
    @jakarta.annotation.Nonnull
    public DisconnectRequestBuilder disconnect() {
        return new DisconnectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the hasActiveDeployments method.
     */
    @jakarta.annotation.Nonnull
    public HasActiveDeploymentsRequestBuilder hasActiveDeployments() {
        return new HasActiveDeploymentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ZebraFotaConnectorRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ZebraFotaConnectorRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/zebraFotaConnector{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ZebraFotaConnectorRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ZebraFotaConnectorRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/zebraFotaConnector{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property zebraFotaConnector for deviceManagement
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property zebraFotaConnector for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, Void.class, errorMapping);
    }
    /**
     * The singleton ZebraFotaConnector associated with account.
     * @return a ZebraFotaConnector
     */
    @jakarta.annotation.Nullable
    public ZebraFotaConnector get() {
        return get(null);
    }
    /**
     * The singleton ZebraFotaConnector associated with account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ZebraFotaConnector
     */
    @jakarta.annotation.Nullable
    public ZebraFotaConnector get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, ZebraFotaConnector::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property zebraFotaConnector in deviceManagement
     * @param body The request body
     * @return a ZebraFotaConnector
     */
    @jakarta.annotation.Nullable
    public ZebraFotaConnector patch(@jakarta.annotation.Nonnull final ZebraFotaConnector body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property zebraFotaConnector in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ZebraFotaConnector
     */
    @jakarta.annotation.Nullable
    public ZebraFotaConnector patch(@jakarta.annotation.Nonnull final ZebraFotaConnector body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, ZebraFotaConnector::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Delete navigation property zebraFotaConnector for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property zebraFotaConnector for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The singleton ZebraFotaConnector associated with account.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The singleton ZebraFotaConnector associated with account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property zebraFotaConnector in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ZebraFotaConnector body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property zebraFotaConnector in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ZebraFotaConnector body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ZebraFotaConnectorRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ZebraFotaConnectorRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ZebraFotaConnectorRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The singleton ZebraFotaConnector associated with account.
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
