package com.microsoft.graph.beta.devicemanagement.devicehealthscripts.item.getglobalscripthighestavailableversion;

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
 * Provides operations to call the getGlobalScriptHighestAvailableVersion method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetGlobalScriptHighestAvailableVersionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetGlobalScriptHighestAvailableVersionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetGlobalScriptHighestAvailableVersionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceHealthScripts/{deviceHealthScript%2Did}/getGlobalScriptHighestAvailableVersion", pathParameters);
    }
    /**
     * Instantiates a new GetGlobalScriptHighestAvailableVersionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetGlobalScriptHighestAvailableVersionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/deviceHealthScripts/{deviceHealthScript%2Did}/getGlobalScriptHighestAvailableVersion", rawUrl);
    }
    /**
     * Update the Proprietary Device Health Script
     * @return a GetGlobalScriptHighestAvailableVersionPostResponse
     */
    @jakarta.annotation.Nullable
    public GetGlobalScriptHighestAvailableVersionPostResponse post() {
        return post(null);
    }
    /**
     * Update the Proprietary Device Health Script
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a GetGlobalScriptHighestAvailableVersionPostResponse
     */
    @jakarta.annotation.Nullable
    public GetGlobalScriptHighestAvailableVersionPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetGlobalScriptHighestAvailableVersionPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Update the Proprietary Device Health Script
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Update the Proprietary Device Health Script
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetGlobalScriptHighestAvailableVersionRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetGlobalScriptHighestAvailableVersionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetGlobalScriptHighestAvailableVersionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
