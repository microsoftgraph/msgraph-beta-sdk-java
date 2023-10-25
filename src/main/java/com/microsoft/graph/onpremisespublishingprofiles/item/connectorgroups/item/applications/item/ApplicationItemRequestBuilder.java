package com.microsoft.graph.onpremisespublishingprofiles.item.connectorgroups.item.applications.item;

import com.microsoft.graph.models.Application;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.onpremisespublishingprofiles.item.connectorgroups.item.applications.item.logo.LogoRequestBuilder;
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
 * Provides operations to manage the applications property of the microsoft.graph.connectorGroup entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the media for the onPremisesPublishingProfile entity.
     */
    @jakarta.annotation.Nonnull
    public LogoRequestBuilder logo() {
        return new LogoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ApplicationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApplicationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}/connectorGroups/{connectorGroup%2Did}/applications/{application%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ApplicationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApplicationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}/connectorGroups/{connectorGroup%2Did}/applications/{application%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get applications from onPremisesPublishingProfiles
     * @return a CompletableFuture of Application
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Application> get() {
        return get(null);
    }
    /**
     * Get applications from onPremisesPublishingProfiles
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of Application
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Application> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Application::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get applications from onPremisesPublishingProfiles
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get applications from onPremisesPublishingProfiles
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ApplicationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApplicationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ApplicationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get applications from onPremisesPublishingProfiles
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
}
