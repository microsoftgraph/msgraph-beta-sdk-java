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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getPolicySummary method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetPolicySummaryWithPolicyIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GetPolicySummaryWithPolicyIdRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param policyId Usage: policyId='{policyId}'
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetPolicySummaryWithPolicyIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String policyId) {
        super(requestAdapter, "{+baseurl}/deviceManagement/configManagerCollections/getPolicySummary(policyId='{policyId}')", pathParameters);
        this.pathParameters.put("policyId", policyId);
    }
    /**
     * Instantiates a new GetPolicySummaryWithPolicyIdRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetPolicySummaryWithPolicyIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/configManagerCollections/getPolicySummary(policyId='{policyId}')", rawUrl);
    }
    /**
     * Invoke function getPolicySummary
     * @return a ConfigManagerPolicySummary
     */
    @jakarta.annotation.Nullable
    public ConfigManagerPolicySummary get() {
        return get(null);
    }
    /**
     * Invoke function getPolicySummary
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ConfigManagerPolicySummary
     */
    @jakarta.annotation.Nullable
    public ConfigManagerPolicySummary get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, ConfigManagerPolicySummary::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke function getPolicySummary
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function getPolicySummary
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
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
     * @return a GetPolicySummaryWithPolicyIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetPolicySummaryWithPolicyIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetPolicySummaryWithPolicyIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
