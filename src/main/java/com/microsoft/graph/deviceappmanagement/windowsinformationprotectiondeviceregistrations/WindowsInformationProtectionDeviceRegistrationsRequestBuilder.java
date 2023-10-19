package com.microsoft.graph.deviceappmanagement.windowsinformationprotectiondeviceregistrations;

import com.microsoft.graph.deviceappmanagement.windowsinformationprotectiondeviceregistrations.count.CountRequestBuilder;
import com.microsoft.graph.deviceappmanagement.windowsinformationprotectiondeviceregistrations.item.WindowsInformationProtectionDeviceRegistrationItemRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WindowsInformationProtectionDeviceRegistration;
import com.microsoft.graph.models.WindowsInformationProtectionDeviceRegistrationCollectionResponse;
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
 * Provides operations to manage the windowsInformationProtectionDeviceRegistrations property of the microsoft.graph.deviceAppManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsInformationProtectionDeviceRegistrationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the windowsInformationProtectionDeviceRegistrations property of the microsoft.graph.deviceAppManagement entity.
     * @param windowsInformationProtectionDeviceRegistrationId The unique identifier of windowsInformationProtectionDeviceRegistration
     * @return a WindowsInformationProtectionDeviceRegistrationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionDeviceRegistrationItemRequestBuilder byWindowsInformationProtectionDeviceRegistrationId(@jakarta.annotation.Nonnull final String windowsInformationProtectionDeviceRegistrationId) {
        Objects.requireNonNull(windowsInformationProtectionDeviceRegistrationId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("windowsInformationProtectionDeviceRegistration%2Did", windowsInformationProtectionDeviceRegistrationId);
        return new WindowsInformationProtectionDeviceRegistrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new WindowsInformationProtectionDeviceRegistrationsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WindowsInformationProtectionDeviceRegistrationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/windowsInformationProtectionDeviceRegistrations{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WindowsInformationProtectionDeviceRegistrationsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WindowsInformationProtectionDeviceRegistrationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/windowsInformationProtectionDeviceRegistrations{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Windows information protection device registrations that are not MDM enrolled.
     * @return a CompletableFuture of WindowsInformationProtectionDeviceRegistrationCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistrationCollectionResponse> get() {
        return get(null);
    }
    /**
     * Windows information protection device registrations that are not MDM enrolled.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of WindowsInformationProtectionDeviceRegistrationCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistrationCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, WindowsInformationProtectionDeviceRegistrationCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to windowsInformationProtectionDeviceRegistrations for deviceAppManagement
     * @param body The request body
     * @return a CompletableFuture of WindowsInformationProtectionDeviceRegistration
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistration> post(@jakarta.annotation.Nonnull final WindowsInformationProtectionDeviceRegistration body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to windowsInformationProtectionDeviceRegistrations for deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of WindowsInformationProtectionDeviceRegistration
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<WindowsInformationProtectionDeviceRegistration> post(@jakarta.annotation.Nonnull final WindowsInformationProtectionDeviceRegistration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, WindowsInformationProtectionDeviceRegistration::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Windows information protection device registrations that are not MDM enrolled.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Windows information protection device registrations that are not MDM enrolled.
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
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create new navigation property to windowsInformationProtectionDeviceRegistrations for deviceAppManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WindowsInformationProtectionDeviceRegistration body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to windowsInformationProtectionDeviceRegistrations for deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WindowsInformationProtectionDeviceRegistration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WindowsInformationProtectionDeviceRegistrationsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WindowsInformationProtectionDeviceRegistrationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WindowsInformationProtectionDeviceRegistrationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Windows information protection device registrations that are not MDM enrolled.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
