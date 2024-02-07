package com.microsoft.graph.beta.users.item.wipemanagedappregistrationsbyazureaddeviceid;

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
 * Provides operations to call the wipeManagedAppRegistrationsByAzureAdDeviceId method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/wipeManagedAppRegistrationsByAzureAdDeviceId", pathParameters);
    }
    /**
     * Instantiates a new WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/wipeManagedAppRegistrationsByAzureAdDeviceId", rawUrl);
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body The request body
     */
    public void post(@jakarta.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body) {
        post(body, null);
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Issues a wipe operation on an app registration with specified aad device Id.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final WipeManagedAppRegistrationsByAzureAdDeviceIdPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WipeManagedAppRegistrationsByAzureAdDeviceIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
