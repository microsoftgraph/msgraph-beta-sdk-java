package com.microsoft.graph.beta.devicemanagement.androiddeviceownerenrollmentprofiles.item.retrieveenrollmenttimedevicemembershiptarget;

import com.microsoft.graph.beta.models.EnrollmentTimeDeviceMembershipTargetResult;
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
 * Provides operations to call the retrieveEnrollmentTimeDeviceMembershipTarget method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/androidDeviceOwnerEnrollmentProfiles/{androidDeviceOwnerEnrollmentProfile%2Did}/retrieveEnrollmentTimeDeviceMembershipTarget", pathParameters);
    }
    /**
     * Instantiates a new {@link RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/androidDeviceOwnerEnrollmentProfiles/{androidDeviceOwnerEnrollmentProfile%2Did}/retrieveEnrollmentTimeDeviceMembershipTarget", rawUrl);
    }
    /**
     * Invoke action retrieveEnrollmentTimeDeviceMembershipTarget
     * @return a {@link EnrollmentTimeDeviceMembershipTargetResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EnrollmentTimeDeviceMembershipTargetResult post() {
        return post(null);
    }
    /**
     * Invoke action retrieveEnrollmentTimeDeviceMembershipTarget
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EnrollmentTimeDeviceMembershipTargetResult}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public EnrollmentTimeDeviceMembershipTargetResult post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EnrollmentTimeDeviceMembershipTargetResult::createFromDiscriminatorValue);
    }
    /**
     * Invoke action retrieveEnrollmentTimeDeviceMembershipTarget
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Invoke action retrieveEnrollmentTimeDeviceMembershipTarget
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
     * @return a {@link RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
