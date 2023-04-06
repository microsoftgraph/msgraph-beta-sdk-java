package com.microsoft.graph.devicemanagement.configmanagercollections.getpolicysummarywithpolicyid;

import com.microsoft.graph.models.ConfigManagerPolicySummary;
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
 * Provides operations to call the getPolicySummary method.
 */
public class GetPolicySummaryWithPolicyIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetPolicySummaryWithPolicyIdRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param policyId Usage: policyId='{policyId}'
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetPolicySummaryWithPolicyIdRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter, @javax.annotation.Nullable final String policyId) {
        super(requestAdapter, "{+baseurl}/deviceManagement/configManagerCollections/getPolicySummary(policyId='{policyId}')", pathParameters);
        this.pathParameters..put("policyId", policyId);
    }
    /**
     * Instantiates a new GetPolicySummaryWithPolicyIdRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public GetPolicySummaryWithPolicyIdRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/configManagerCollections/getPolicySummary(policyId='{policyId}')", rawUrl);
    }
    /**
     * Invoke function getPolicySummary
     * @return a CompletableFuture of configManagerPolicySummary
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConfigManagerPolicySummary> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ConfigManagerPolicySummary::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ConfigManagerPolicySummary> executionException = new java.util.concurrent.CompletableFuture<ConfigManagerPolicySummary>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke function getPolicySummary
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of configManagerPolicySummary
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ConfigManagerPolicySummary> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, ConfigManagerPolicySummary::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<ConfigManagerPolicySummary> executionException = new java.util.concurrent.CompletableFuture<ConfigManagerPolicySummary>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Invoke function getPolicySummary
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getPolicySummary
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
