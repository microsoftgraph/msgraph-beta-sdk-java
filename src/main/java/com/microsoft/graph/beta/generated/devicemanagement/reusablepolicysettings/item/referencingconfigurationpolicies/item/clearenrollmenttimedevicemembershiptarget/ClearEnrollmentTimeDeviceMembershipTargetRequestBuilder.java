package com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.clearenrollmenttimedevicemembershiptarget;

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
 * Provides operations to call the clearEnrollmentTimeDeviceMembershipTarget method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reusablePolicySettings/{deviceManagementReusablePolicySetting%2Did}/referencingConfigurationPolicies/{deviceManagementConfigurationPolicy%2Did}/clearEnrollmentTimeDeviceMembershipTarget", pathParameters);
    }
    /**
     * Instantiates a new {@link ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reusablePolicySettings/{deviceManagementReusablePolicySetting%2Did}/referencingConfigurationPolicies/{deviceManagementConfigurationPolicy%2Did}/clearEnrollmentTimeDeviceMembershipTarget", rawUrl);
    }
    /**
     * Invoke action clearEnrollmentTimeDeviceMembershipTarget
     * @return a {@link ClearEnrollmentTimeDeviceMembershipTargetPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ClearEnrollmentTimeDeviceMembershipTargetPostResponse post() {
        return post(null);
    }
    /**
     * Invoke action clearEnrollmentTimeDeviceMembershipTarget
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ClearEnrollmentTimeDeviceMembershipTargetPostResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public ClearEnrollmentTimeDeviceMembershipTargetPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ClearEnrollmentTimeDeviceMembershipTargetPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Invoke action clearEnrollmentTimeDeviceMembershipTarget
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Invoke action clearEnrollmentTimeDeviceMembershipTarget
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * @return a {@link ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
