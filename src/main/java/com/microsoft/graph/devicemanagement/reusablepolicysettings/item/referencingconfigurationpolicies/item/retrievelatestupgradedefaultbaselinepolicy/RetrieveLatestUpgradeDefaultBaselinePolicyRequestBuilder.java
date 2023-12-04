package com.microsoft.graph.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.retrievelatestupgradedefaultbaselinepolicy;

import com.microsoft.graph.models.DeviceManagementConfigurationPolicy;
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
 * Provides operations to call the retrieveLatestUpgradeDefaultBaselinePolicy method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reusablePolicySettings/{deviceManagementReusablePolicySetting%2Did}/referencingConfigurationPolicies/{deviceManagementConfigurationPolicy%2Did}/retrieveLatestUpgradeDefaultBaselinePolicy()", pathParameters);
    }
    /**
     * Instantiates a new RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reusablePolicySettings/{deviceManagementReusablePolicySetting%2Did}/referencingConfigurationPolicies/{deviceManagementConfigurationPolicy%2Did}/retrieveLatestUpgradeDefaultBaselinePolicy()", rawUrl);
    }
    /**
     * Invoke function retrieveLatestUpgradeDefaultBaselinePolicy
     * @return a DeviceManagementConfigurationPolicy
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationPolicy get() {
        return get(null);
    }
    /**
     * Invoke function retrieveLatestUpgradeDefaultBaselinePolicy
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeviceManagementConfigurationPolicy
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationPolicy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagementConfigurationPolicy::createFromDiscriminatorValue);
    }
    /**
     * Invoke function retrieveLatestUpgradeDefaultBaselinePolicy
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function retrieveLatestUpgradeDefaultBaselinePolicy
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
     * @return a RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
