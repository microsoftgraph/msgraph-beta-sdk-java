package com.microsoft.graph.devicemanagement.deponboardingsettings.item.getencryptionpublickey;

import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the getEncryptionPublicKey method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetEncryptionPublicKeyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetEncryptionPublicKeyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetEncryptionPublicKeyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}/getEncryptionPublicKey()", pathParameters);
    }
    /**
     * Instantiates a new GetEncryptionPublicKeyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetEncryptionPublicKeyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/depOnboardingSettings/{depOnboardingSetting%2Did}/getEncryptionPublicKey()", rawUrl);
    }
    /**
     * Get a public key to use to encrypt the Apple device enrollment program token
     * @return a CompletableFuture of GetEncryptionPublicKeyGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GetEncryptionPublicKeyGetResponse> get() {
        return get(null);
    }
    /**
     * Get a public key to use to encrypt the Apple device enrollment program token
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of GetEncryptionPublicKeyGetResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<GetEncryptionPublicKeyGetResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, GetEncryptionPublicKeyGetResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get a public key to use to encrypt the Apple device enrollment program token
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a public key to use to encrypt the Apple device enrollment program token
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GetEncryptionPublicKeyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetEncryptionPublicKeyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetEncryptionPublicKeyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
