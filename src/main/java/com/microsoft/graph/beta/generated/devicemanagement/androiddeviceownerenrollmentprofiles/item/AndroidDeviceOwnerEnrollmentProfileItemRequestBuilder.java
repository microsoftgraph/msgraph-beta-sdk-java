package com.microsoft.graph.beta.devicemanagement.androiddeviceownerenrollmentprofiles.item;

import com.microsoft.graph.beta.devicemanagement.androiddeviceownerenrollmentprofiles.item.clearenrollmenttimedevicemembershiptarget.ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androiddeviceownerenrollmentprofiles.item.createtoken.CreateTokenRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androiddeviceownerenrollmentprofiles.item.retrieveenrollmenttimedevicemembershiptarget.RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androiddeviceownerenrollmentprofiles.item.revoketoken.RevokeTokenRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.androiddeviceownerenrollmentprofiles.item.setenrollmenttimedevicemembershiptarget.SetEnrollmentTimeDeviceMembershipTargetRequestBuilder;
import com.microsoft.graph.beta.models.AndroidDeviceOwnerEnrollmentProfile;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the androidDeviceOwnerEnrollmentProfiles property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerEnrollmentProfileItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the clearEnrollmentTimeDeviceMembershipTarget method.
     * @return a {@link ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder clearEnrollmentTimeDeviceMembershipTarget() {
        return new ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createToken method.
     * @return a {@link CreateTokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateTokenRequestBuilder createToken() {
        return new CreateTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveEnrollmentTimeDeviceMembershipTarget method.
     * @return a {@link RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder retrieveEnrollmentTimeDeviceMembershipTarget() {
        return new RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the revokeToken method.
     * @return a {@link RevokeTokenRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RevokeTokenRequestBuilder revokeToken() {
        return new RevokeTokenRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setEnrollmentTimeDeviceMembershipTarget method.
     * @return a {@link SetEnrollmentTimeDeviceMembershipTargetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetEnrollmentTimeDeviceMembershipTargetRequestBuilder setEnrollmentTimeDeviceMembershipTarget() {
        return new SetEnrollmentTimeDeviceMembershipTargetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AndroidDeviceOwnerEnrollmentProfileItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AndroidDeviceOwnerEnrollmentProfileItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/androidDeviceOwnerEnrollmentProfiles/{androidDeviceOwnerEnrollmentProfile%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AndroidDeviceOwnerEnrollmentProfileItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AndroidDeviceOwnerEnrollmentProfileItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/androidDeviceOwnerEnrollmentProfiles/{androidDeviceOwnerEnrollmentProfile%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property androidDeviceOwnerEnrollmentProfiles for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property androidDeviceOwnerEnrollmentProfiles for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Android device owner enrollment profile entities.
     * @return a {@link AndroidDeviceOwnerEnrollmentProfile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentProfile get() {
        return get(null);
    }
    /**
     * Android device owner enrollment profile entities.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AndroidDeviceOwnerEnrollmentProfile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentProfile get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AndroidDeviceOwnerEnrollmentProfile::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property androidDeviceOwnerEnrollmentProfiles in deviceManagement
     * @param body The request body
     * @return a {@link AndroidDeviceOwnerEnrollmentProfile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentProfile patch(@jakarta.annotation.Nonnull final AndroidDeviceOwnerEnrollmentProfile body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property androidDeviceOwnerEnrollmentProfiles in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AndroidDeviceOwnerEnrollmentProfile}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentProfile patch(@jakarta.annotation.Nonnull final AndroidDeviceOwnerEnrollmentProfile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AndroidDeviceOwnerEnrollmentProfile::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property androidDeviceOwnerEnrollmentProfiles for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property androidDeviceOwnerEnrollmentProfiles for deviceManagement
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
     * Android device owner enrollment profile entities.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Android device owner enrollment profile entities.
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
     * Update the navigation property androidDeviceOwnerEnrollmentProfiles in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AndroidDeviceOwnerEnrollmentProfile body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property androidDeviceOwnerEnrollmentProfiles in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AndroidDeviceOwnerEnrollmentProfile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AndroidDeviceOwnerEnrollmentProfileItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AndroidDeviceOwnerEnrollmentProfileItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AndroidDeviceOwnerEnrollmentProfileItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Android device owner enrollment profile entities.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
