package com.microsoft.graph.beta.users.item.authentication.fido2methods.creationoptionswithchallengetimeoutinminutes;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.WebauthnCredentialCreationOptions;
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
 * Provides operations to call the creationOptions method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreationOptionsWithChallengeTimeoutInMinutesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreationOptionsWithChallengeTimeoutInMinutesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreationOptionsWithChallengeTimeoutInMinutesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/fido2Methods/creationOptions(challengeTimeoutInMinutes=@challengeTimeoutInMinutes){?challengeTimeoutInMinutes*}", pathParameters);
    }
    /**
     * Instantiates a new {@link CreationOptionsWithChallengeTimeoutInMinutesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreationOptionsWithChallengeTimeoutInMinutesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/authentication/fido2Methods/creationOptions(challengeTimeoutInMinutes=@challengeTimeoutInMinutes){?challengeTimeoutInMinutes*}", rawUrl);
    }
    /**
     * Retrieve creation options required to generate and register a Microsoft Entra ID-compatible passkey. Self-service operations aren't supported.  
     * @return a {@link WebauthnCredentialCreationOptions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/fido2authenticationmethod-creationoptions?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WebauthnCredentialCreationOptions get() {
        return get(null);
    }
    /**
     * Retrieve creation options required to generate and register a Microsoft Entra ID-compatible passkey. Self-service operations aren't supported.  
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WebauthnCredentialCreationOptions}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/fido2authenticationmethod-creationoptions?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WebauthnCredentialCreationOptions get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WebauthnCredentialCreationOptions::createFromDiscriminatorValue);
    }
    /**
     * Retrieve creation options required to generate and register a Microsoft Entra ID-compatible passkey. Self-service operations aren't supported.  
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve creation options required to generate and register a Microsoft Entra ID-compatible passkey. Self-service operations aren't supported.  
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
     * @return a {@link CreationOptionsWithChallengeTimeoutInMinutesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreationOptionsWithChallengeTimeoutInMinutesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreationOptionsWithChallengeTimeoutInMinutesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve creation options required to generate and register a Microsoft Entra ID-compatible passkey. Self-service operations aren't supported.  
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Usage: challengeTimeoutInMinutes=@challengeTimeoutInMinutes
         */
        @jakarta.annotation.Nullable
        public Integer challengeTimeoutInMinutes;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("challengeTimeoutInMinutes", challengeTimeoutInMinutes);
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
