package com.microsoft.graph.beta.devicemanagement.virtualendpoint.cloudpcs.item.getfrontlinecloudpcaccessstate;

import com.microsoft.graph.beta.models.FrontlineCloudPcAccessState;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to call the getFrontlineCloudPcAccessState method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetFrontlineCloudPcAccessStateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetFrontlineCloudPcAccessStateRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetFrontlineCloudPcAccessStateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/cloudPCs/{cloudPC%2Did}/getFrontlineCloudPcAccessState()", pathParameters);
    }
    /**
     * Instantiates a new GetFrontlineCloudPcAccessStateRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetFrontlineCloudPcAccessStateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/cloudPCs/{cloudPC%2Did}/getFrontlineCloudPcAccessState()", rawUrl);
    }
    /**
     * Invoke function getFrontlineCloudPcAccessState
     * @return a FrontlineCloudPcAccessState
     */
    @jakarta.annotation.Nullable
    public FrontlineCloudPcAccessState get() {
        return get(null);
    }
    /**
     * Invoke function getFrontlineCloudPcAccessState
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a FrontlineCloudPcAccessState
     */
    @jakarta.annotation.Nullable
    public FrontlineCloudPcAccessState get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendEnum(requestInfo, errorMapping, FrontlineCloudPcAccessState::forValue);
    }
    /**
     * Invoke function getFrontlineCloudPcAccessState
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getFrontlineCloudPcAccessState
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
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
     * @return a GetFrontlineCloudPcAccessStateRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetFrontlineCloudPcAccessStateRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetFrontlineCloudPcAccessStateRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
