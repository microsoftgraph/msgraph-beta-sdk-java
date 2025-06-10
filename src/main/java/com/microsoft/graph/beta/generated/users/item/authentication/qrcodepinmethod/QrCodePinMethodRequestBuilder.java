package com.microsoft.graph.beta.users.item.authentication.qrcodepinmethod;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.QrCodePinAuthenticationMethod;
import com.microsoft.graph.beta.users.item.authentication.qrcodepinmethod.pin.PinRequestBuilder;
import com.microsoft.graph.beta.users.item.authentication.qrcodepinmethod.standardqrcode.StandardQRCodeRequestBuilder;
import com.microsoft.graph.beta.users.item.authentication.qrcodepinmethod.temporaryqrcode.TemporaryQRCodeRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the qrCodePinMethod property of the microsoft.graph.authentication entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class QrCodePinMethodRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the pin property of the microsoft.graph.qrCodePinAuthenticationMethod entity.
     * @return a {@link PinRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PinRequestBuilder pin() {
        return new PinRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the standardQRCode property of the microsoft.graph.qrCodePinAuthenticationMethod entity.
     * @return a {@link StandardQRCodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StandardQRCodeRequestBuilder standardQRCode() {
        return new StandardQRCodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the temporaryQRCode property of the microsoft.graph.qrCodePinAuthenticationMethod entity.
     * @return a {@link TemporaryQRCodeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TemporaryQRCodeRequestBuilder temporaryQRCode() {
        return new TemporaryQRCodeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link QrCodePinMethodRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QrCodePinMethodRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/qrCodePinMethod{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link QrCodePinMethodRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public QrCodePinMethodRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/qrCodePinMethod{?%24expand,%24select}", rawUrl);
    }
    /**
     * Deletes user&apos;s qrCodePinAuthenticationMethod object. Once the object is deleted, it can&apos;t be retrieved. The user won&apos;t be able to sign-in with any QR codes associated with the deleted object. 
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authentication-delete-qrcodepinmethod?view=graph-rest-beta">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Deletes user&apos;s qrCodePinAuthenticationMethod object. Once the object is deleted, it can&apos;t be retrieved. The user won&apos;t be able to sign-in with any QR codes associated with the deleted object. 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/authentication-delete-qrcodepinmethod?view=graph-rest-beta">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve a user&apos;s qrCodePinAuthenticationMethod object.
     * @return a {@link QrCodePinAuthenticationMethod}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/qrcodepinauthenticationmethod-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public QrCodePinAuthenticationMethod get() {
        return get(null);
    }
    /**
     * Retrieve a user&apos;s qrCodePinAuthenticationMethod object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link QrCodePinAuthenticationMethod}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/qrcodepinauthenticationmethod-get?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public QrCodePinAuthenticationMethod get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, QrCodePinAuthenticationMethod::createFromDiscriminatorValue);
    }
    /**
     * Deletes user&apos;s qrCodePinAuthenticationMethod object. Once the object is deleted, it can&apos;t be retrieved. The user won&apos;t be able to sign-in with any QR codes associated with the deleted object. 
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes user&apos;s qrCodePinAuthenticationMethod object. Once the object is deleted, it can&apos;t be retrieved. The user won&apos;t be able to sign-in with any QR codes associated with the deleted object. 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve a user&apos;s qrCodePinAuthenticationMethod object.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve a user&apos;s qrCodePinAuthenticationMethod object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link QrCodePinMethodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public QrCodePinMethodRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new QrCodePinMethodRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve a user&apos;s qrCodePinAuthenticationMethod object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
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
