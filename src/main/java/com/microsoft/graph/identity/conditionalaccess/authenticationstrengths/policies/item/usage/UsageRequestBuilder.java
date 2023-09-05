package com.microsoft.graph.identity.conditionalaccess.authenticationstrengths.policies.item.usage;

import com.microsoft.graph.models.AuthenticationStrengthUsage;
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
 * Provides operations to call the usage method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UsageRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/conditionalAccess/authenticationStrengths/policies/{authenticationStrengthPolicy%2Did}/usage()", pathParameters);
    }
    /**
     * Instantiates a new UsageRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/conditionalAccess/authenticationStrengths/policies/{authenticationStrengthPolicy%2Did}/usage()", rawUrl);
    }
    /**
     * Invoke function usage
     * @return a CompletableFuture of authenticationStrengthUsage
     * @deprecated
     * The &apos;authenticationStrengths&apos; segment is deprecated. Please use &apos;authenticationStrength&apos; instead. as of 2023-02/AuthenticationStrengthsRemove on 2023-02-01 and will be removed 2023-03-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<AuthenticationStrengthUsage> get() {
        return get(null);
    }
    /**
     * Invoke function usage
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of authenticationStrengthUsage
     * @deprecated
     * The &apos;authenticationStrengths&apos; segment is deprecated. Please use &apos;authenticationStrength&apos; instead. as of 2023-02/AuthenticationStrengthsRemove on 2023-02-01 and will be removed 2023-03-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public java.util.concurrent.CompletableFuture<AuthenticationStrengthUsage> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AuthenticationStrengthUsage::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke function usage
     * @return a RequestInformation
     * @deprecated
     * The &apos;authenticationStrengths&apos; segment is deprecated. Please use &apos;authenticationStrength&apos; instead. as of 2023-02/AuthenticationStrengthsRemove on 2023-02-01 and will be removed 2023-03-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function usage
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The &apos;authenticationStrengths&apos; segment is deprecated. Please use &apos;authenticationStrength&apos; instead. as of 2023-02/AuthenticationStrengthsRemove on 2023-02-01 and will be removed 2023-03-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
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
     * @return a usageRequestBuilder
     * @deprecated
     * The &apos;authenticationStrengths&apos; segment is deprecated. Please use &apos;authenticationStrength&apos; instead. as of 2023-02/AuthenticationStrengthsRemove on 2023-02-01 and will be removed 2023-03-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public UsageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UsageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
