package com.microsoft.graph.beta.trustframework.keysets.item.uploadpkcs12;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.TrustFrameworkKey;
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
 * Provides operations to call the uploadPkcs12 method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadPkcs12RequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UploadPkcs12RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadPkcs12RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/trustFramework/keySets/{trustFrameworkKeySet%2Did}/uploadPkcs12", pathParameters);
    }
    /**
     * Instantiates a new {@link UploadPkcs12RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadPkcs12RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/trustFramework/keySets/{trustFrameworkKeySet%2Did}/uploadPkcs12", rawUrl);
    }
    /**
     * Upload a PKCS12 format key (PFX) to a trustFrameworkKeyset. The input is a base-64 encoded value of the Pfx certificate contents. This method returns trustFrameworkKey.
     * @param body The request body
     * @return a {@link TrustFrameworkKey}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/trustframeworkkeyset-uploadpkcs12?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TrustFrameworkKey post(@jakarta.annotation.Nonnull final UploadPkcs12PostRequestBody body) {
        return post(body, null);
    }
    /**
     * Upload a PKCS12 format key (PFX) to a trustFrameworkKeyset. The input is a base-64 encoded value of the Pfx certificate contents. This method returns trustFrameworkKey.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link TrustFrameworkKey}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/trustframeworkkeyset-uploadpkcs12?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public TrustFrameworkKey post(@jakarta.annotation.Nonnull final UploadPkcs12PostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TrustFrameworkKey::createFromDiscriminatorValue);
    }
    /**
     * Upload a PKCS12 format key (PFX) to a trustFrameworkKeyset. The input is a base-64 encoded value of the Pfx certificate contents. This method returns trustFrameworkKey.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UploadPkcs12PostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Upload a PKCS12 format key (PFX) to a trustFrameworkKeyset. The input is a base-64 encoded value of the Pfx certificate contents. This method returns trustFrameworkKey.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UploadPkcs12PostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link UploadPkcs12RequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadPkcs12RequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UploadPkcs12RequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
