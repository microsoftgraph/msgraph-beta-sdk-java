package com.microsoft.graph.auditlogs.signins.confirmcompromised;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the confirmCompromised method.
 */
public class ConfirmCompromisedRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ConfirmCompromisedRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ConfirmCompromisedRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auditLogs/signIns/confirmCompromised", pathParameters);
    }
    /**
     * Instantiates a new ConfirmCompromisedRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ConfirmCompromisedRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/auditLogs/signIns/confirmCompromised", rawUrl);
    }
    /**
     * Allow admins to mark an event in the Azure AD sign in logs as risky. Events marked as risky by an admin are immediately flagged as high risk in Azure AD Identity Protection, overriding previous risk states. Admins can confirm that events flagged as risky by Azure AD Identity Protection are in fact risky. For details about investigating Identity Protection risks, see How to investigate risk.
     * @param body The request body
     * @return a CompletableFuture of void
     * @see <a href="https://learn.microsoft.com/graph/api/signin-confirmcompromised?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> post(@jakarta.annotation.Nonnull final ConfirmCompromisedPostRequestBody body) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Allow admins to mark an event in the Azure AD sign in logs as risky. Events marked as risky by an admin are immediately flagged as high risk in Azure AD Identity Protection, overriding previous risk states. Admins can confirm that events flagged as risky by Azure AD Identity Protection are in fact risky. For details about investigating Identity Protection risks, see How to investigate risk.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     * @see <a href="https://learn.microsoft.com/graph/api/signin-confirmcompromised?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> post(@jakarta.annotation.Nonnull final ConfirmCompromisedPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Allow admins to mark an event in the Azure AD sign in logs as risky. Events marked as risky by an admin are immediately flagged as high risk in Azure AD Identity Protection, overriding previous risk states. Admins can confirm that events flagged as risky by Azure AD Identity Protection are in fact risky. For details about investigating Identity Protection risks, see How to investigate risk.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConfirmCompromisedPostRequestBody body) throws URISyntaxException {
        return toPostRequestInformation(body, null);
    }
    /**
     * Allow admins to mark an event in the Azure AD sign in logs as risky. Events marked as risky by an admin are immediately flagged as high risk in Azure AD Identity Protection, overriding previous risk states. Admins can confirm that events flagged as risky by Azure AD Identity Protection are in fact risky. For details about investigating Identity Protection risks, see How to investigate risk.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ConfirmCompromisedPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
