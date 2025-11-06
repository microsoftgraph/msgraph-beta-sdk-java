package com.microsoft.graph.beta.groups.item.sites.getoperationstatuswithoperationid;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.RichLongRunningOperation;
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
 * Provides operations to call the getOperationStatus method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetOperationStatusWithOperationIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetOperationStatusWithOperationIdRequestBuilder} and sets the default values.
     * @param operationId Usage: operationId=&apos;{operationId}&apos;
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetOperationStatusWithOperationIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String operationId) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/getOperationStatus(operationId='{operationId}')", pathParameters);
        this.pathParameters.put("operationId", operationId);
    }
    /**
     * Instantiates a new {@link GetOperationStatusWithOperationIdRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetOperationStatusWithOperationIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/getOperationStatus(operationId='{operationId}')", rawUrl);
    }
    /**
     * Get the status of a SharePoint site creation operation to monitor its progress.
     * @return a {@link RichLongRunningOperation}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/site-getoperationstatus?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RichLongRunningOperation get() {
        return get(null);
    }
    /**
     * Get the status of a SharePoint site creation operation to monitor its progress.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RichLongRunningOperation}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/site-getoperationstatus?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public RichLongRunningOperation get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RichLongRunningOperation::createFromDiscriminatorValue);
    }
    /**
     * Get the status of a SharePoint site creation operation to monitor its progress.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the status of a SharePoint site creation operation to monitor its progress.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetOperationStatusWithOperationIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetOperationStatusWithOperationIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetOperationStatusWithOperationIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
