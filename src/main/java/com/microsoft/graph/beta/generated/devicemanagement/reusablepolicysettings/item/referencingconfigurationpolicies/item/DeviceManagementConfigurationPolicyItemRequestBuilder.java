package com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item;

import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.assign.AssignRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.clearenrollmenttimedevicemembershiptarget.ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.createcopy.CreateCopyRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.reorder.ReorderRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.retrieveenrollmenttimedevicemembershiptarget.RetrieveEnrollmentTimeDeviceMembershipTargetRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.retrievelatestupgradedefaultbaselinepolicy.RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.setenrollmenttimedevicemembershiptarget.SetEnrollmentTimeDeviceMembershipTargetRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.reusablepolicysettings.item.referencingconfigurationpolicies.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.beta.models.DeviceManagementConfigurationPolicy;
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
 * Provides operations to manage the referencingConfigurationPolicies property of the microsoft.graph.deviceManagementReusablePolicySetting entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationPolicyItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assign method.
     * @return a {@link AssignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.deviceManagementConfigurationPolicy entity.
     * @return a {@link AssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the clearEnrollmentTimeDeviceMembershipTarget method.
     * @return a {@link ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder clearEnrollmentTimeDeviceMembershipTarget() {
        return new ClearEnrollmentTimeDeviceMembershipTargetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createCopy method.
     * @return a {@link CreateCopyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateCopyRequestBuilder createCopy() {
        return new CreateCopyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reorder method.
     * @return a {@link ReorderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReorderRequestBuilder reorder() {
        return new ReorderRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to call the retrieveLatestUpgradeDefaultBaselinePolicy method.
     * @return a {@link RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder retrieveLatestUpgradeDefaultBaselinePolicy() {
        return new RetrieveLatestUpgradeDefaultBaselinePolicyRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to manage the settings property of the microsoft.graph.deviceManagementConfigurationPolicy entity.
     * @return a {@link SettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DeviceManagementConfigurationPolicyItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceManagementConfigurationPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reusablePolicySettings/{deviceManagementReusablePolicySetting%2Did}/referencingConfigurationPolicies/{deviceManagementConfigurationPolicy%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DeviceManagementConfigurationPolicyItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DeviceManagementConfigurationPolicyItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/reusablePolicySettings/{deviceManagementReusablePolicySetting%2Did}/referencingConfigurationPolicies/{deviceManagementConfigurationPolicy%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property referencingConfigurationPolicies for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property referencingConfigurationPolicies for deviceManagement
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
     * configuration policies referencing the current reusable setting. This property is read-only.
     * @return a {@link DeviceManagementConfigurationPolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationPolicy get() {
        return get(null);
    }
    /**
     * configuration policies referencing the current reusable setting. This property is read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceManagementConfigurationPolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationPolicy get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagementConfigurationPolicy::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property referencingConfigurationPolicies in deviceManagement
     * @param body The request body
     * @return a {@link DeviceManagementConfigurationPolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationPolicy patch(@jakarta.annotation.Nonnull final DeviceManagementConfigurationPolicy body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property referencingConfigurationPolicies in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DeviceManagementConfigurationPolicy}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationPolicy patch(@jakarta.annotation.Nonnull final DeviceManagementConfigurationPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeviceManagementConfigurationPolicy::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property referencingConfigurationPolicies for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property referencingConfigurationPolicies for deviceManagement
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
     * configuration policies referencing the current reusable setting. This property is read-only.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * configuration policies referencing the current reusable setting. This property is read-only.
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
     * Update the navigation property referencingConfigurationPolicies in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementConfigurationPolicy body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property referencingConfigurationPolicies in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementConfigurationPolicy body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DeviceManagementConfigurationPolicyItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementConfigurationPolicyItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DeviceManagementConfigurationPolicyItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * configuration policies referencing the current reusable setting. This property is read-only.
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
