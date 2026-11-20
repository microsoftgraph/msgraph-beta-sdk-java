package com.microsoft.graph.beta.admin.resourcepolicy.configuration.getfederatedidentitycredentialsubjectwithappid;

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
 * Provides operations to call the getFederatedIdentityCredentialSubject method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetFederatedIdentityCredentialSubjectWithAppIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetFederatedIdentityCredentialSubjectWithAppIdRequestBuilder} and sets the default values.
     * @param appId Usage: appId=&apos;{appId}&apos;
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetFederatedIdentityCredentialSubjectWithAppIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String appId) {
        super(requestAdapter, "{+baseurl}/admin/resourcePolicy/configuration/getFederatedIdentityCredentialSubject(appId='{appId}')", pathParameters);
        this.pathParameters.put("appId", appId);
    }
    /**
     * Instantiates a new {@link GetFederatedIdentityCredentialSubjectWithAppIdRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetFederatedIdentityCredentialSubjectWithAppIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/admin/resourcePolicy/configuration/getFederatedIdentityCredentialSubject(appId='{appId}')", rawUrl);
    }
    /**
     * Invoke function getFederatedIdentityCredentialSubject
     * @return a {@link GetFederatedIdentityCredentialSubjectWithAppIdGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public GetFederatedIdentityCredentialSubjectWithAppIdGetResponse get() {
        return get(null);
    }
    /**
     * Invoke function getFederatedIdentityCredentialSubject
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetFederatedIdentityCredentialSubjectWithAppIdGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public GetFederatedIdentityCredentialSubjectWithAppIdGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetFederatedIdentityCredentialSubjectWithAppIdGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Invoke function getFederatedIdentityCredentialSubject
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getFederatedIdentityCredentialSubject
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
     * @return a {@link GetFederatedIdentityCredentialSubjectWithAppIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetFederatedIdentityCredentialSubjectWithAppIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetFederatedIdentityCredentialSubjectWithAppIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
