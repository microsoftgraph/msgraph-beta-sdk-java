package com.microsoft.graph.devicemanagement.chromeosonboardingsettings.disconnect;

import com.microsoft.graph.models.ChromeOSOnboardingStatus;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the disconnect method.
 */
public class DisconnectRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new DisconnectRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DisconnectRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/chromeOSOnboardingSettings/disconnect", pathParameters);
    }
    /**
     * Instantiates a new DisconnectRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DisconnectRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/chromeOSOnboardingSettings/disconnect", rawUrl);
    }
    /**
     * Invoke action disconnect
     * @return a CompletableFuture of ChromeOSOnboardingStatus
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ChromeOSOnboardingStatus> post() {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendEnumAsync(requestInfo, ChromeOSOnboardingStatus.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ChromeOSOnboardingStatus> executionException = new java.util.concurrent.CompletableFuture<ChromeOSOnboardingStatus>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke action disconnect
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of ChromeOSOnboardingStatus
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ChromeOSOnboardingStatus> post(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendEnumAsync(requestInfo, ChromeOSOnboardingStatus.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ChromeOSOnboardingStatus> executionException = new java.util.concurrent.CompletableFuture<ChromeOSOnboardingStatus>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke action disconnect
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation() throws URISyntaxException {
        return toPostRequestInformation(null);
    }
    /**
     * Invoke action disconnect
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
