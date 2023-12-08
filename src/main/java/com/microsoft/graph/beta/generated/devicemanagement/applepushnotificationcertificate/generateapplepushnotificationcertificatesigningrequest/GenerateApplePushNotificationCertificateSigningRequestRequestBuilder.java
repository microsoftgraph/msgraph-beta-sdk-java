package com.microsoft.graph.beta.devicemanagement.applepushnotificationcertificate.generateapplepushnotificationcertificatesigningrequest;

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
 * Provides operations to call the generateApplePushNotificationCertificateSigningRequest method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GenerateApplePushNotificationCertificateSigningRequestRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GenerateApplePushNotificationCertificateSigningRequestRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GenerateApplePushNotificationCertificateSigningRequestRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/applePushNotificationCertificate/generateApplePushNotificationCertificateSigningRequest", pathParameters);
    }
    /**
     * Instantiates a new GenerateApplePushNotificationCertificateSigningRequestRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GenerateApplePushNotificationCertificateSigningRequestRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/applePushNotificationCertificate/generateApplePushNotificationCertificateSigningRequest", rawUrl);
    }
    /**
     * Download Apple push notification certificate signing request
     * @return a GenerateApplePushNotificationCertificateSigningRequestPostResponse
     */
    @jakarta.annotation.Nullable
    public GenerateApplePushNotificationCertificateSigningRequestPostResponse post() {
        return post(null);
    }
    /**
     * Download Apple push notification certificate signing request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a GenerateApplePushNotificationCertificateSigningRequestPostResponse
     */
    @jakarta.annotation.Nullable
    public GenerateApplePushNotificationCertificateSigningRequestPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GenerateApplePushNotificationCertificateSigningRequestPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Download Apple push notification certificate signing request
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Download Apple push notification certificate signing request
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
     * @return a GenerateApplePushNotificationCertificateSigningRequestRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GenerateApplePushNotificationCertificateSigningRequestRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GenerateApplePushNotificationCertificateSigningRequestRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
