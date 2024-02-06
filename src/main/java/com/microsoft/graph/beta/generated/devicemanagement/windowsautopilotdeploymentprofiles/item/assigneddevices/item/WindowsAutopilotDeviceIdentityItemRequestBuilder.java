package com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item;

import com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.allownextenrollment.AllowNextEnrollmentRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.assignresourceaccounttodevice.AssignResourceAccountToDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.assignusertodevice.AssignUserToDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.deploymentprofile.DeploymentProfileRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.intendeddeploymentprofile.IntendedDeploymentProfileRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.unassignresourceaccountfromdevice.UnassignResourceAccountFromDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.unassignuserfromdevice.UnassignUserFromDeviceRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.windowsautopilotdeploymentprofiles.item.assigneddevices.item.updatedeviceproperties.UpdateDevicePropertiesRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.WindowsAutopilotDeviceIdentity;
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
 * Provides operations to manage the assignedDevices property of the microsoft.graph.windowsAutopilotDeploymentProfile entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAutopilotDeviceIdentityItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the allowNextEnrollment method.
     */
    @jakarta.annotation.Nonnull
    public AllowNextEnrollmentRequestBuilder allowNextEnrollment() {
        return new AllowNextEnrollmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assignResourceAccountToDevice method.
     */
    @jakarta.annotation.Nonnull
    public AssignResourceAccountToDeviceRequestBuilder assignResourceAccountToDevice() {
        return new AssignResourceAccountToDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assignUserToDevice method.
     */
    @jakarta.annotation.Nonnull
    public AssignUserToDeviceRequestBuilder assignUserToDevice() {
        return new AssignUserToDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deploymentProfile property of the microsoft.graph.windowsAutopilotDeviceIdentity entity.
     */
    @jakarta.annotation.Nonnull
    public DeploymentProfileRequestBuilder deploymentProfile() {
        return new DeploymentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the intendedDeploymentProfile property of the microsoft.graph.windowsAutopilotDeviceIdentity entity.
     */
    @jakarta.annotation.Nonnull
    public IntendedDeploymentProfileRequestBuilder intendedDeploymentProfile() {
        return new IntendedDeploymentProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unassignResourceAccountFromDevice method.
     */
    @jakarta.annotation.Nonnull
    public UnassignResourceAccountFromDeviceRequestBuilder unassignResourceAccountFromDevice() {
        return new UnassignResourceAccountFromDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unassignUserFromDevice method.
     */
    @jakarta.annotation.Nonnull
    public UnassignUserFromDeviceRequestBuilder unassignUserFromDevice() {
        return new UnassignUserFromDeviceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateDeviceProperties method.
     */
    @jakarta.annotation.Nonnull
    public UpdateDevicePropertiesRequestBuilder updateDeviceProperties() {
        return new UpdateDevicePropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WindowsAutopilotDeviceIdentityItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WindowsAutopilotDeviceIdentityItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/windowsAutopilotDeploymentProfiles/{windowsAutopilotDeploymentProfile%2Did}/assignedDevices/{windowsAutopilotDeviceIdentity%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new WindowsAutopilotDeviceIdentityItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WindowsAutopilotDeviceIdentityItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/windowsAutopilotDeploymentProfiles/{windowsAutopilotDeploymentProfile%2Did}/assignedDevices/{windowsAutopilotDeviceIdentity%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property assignedDevices for deviceManagement
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property assignedDevices for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The list of assigned devices for the profile.
     * @return a WindowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeviceIdentity get() {
        return get(null);
    }
    /**
     * The list of assigned devices for the profile.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WindowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeviceIdentity get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property assignedDevices in deviceManagement
     * @param body The request body
     * @return a WindowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeviceIdentity patch(@jakarta.annotation.Nonnull final WindowsAutopilotDeviceIdentity body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property assignedDevices in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WindowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeviceIdentity patch(@jakarta.annotation.Nonnull final WindowsAutopilotDeviceIdentity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WindowsAutopilotDeviceIdentity::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property assignedDevices for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property assignedDevices for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The list of assigned devices for the profile.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The list of assigned devices for the profile.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property assignedDevices in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WindowsAutopilotDeviceIdentity body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property assignedDevices in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WindowsAutopilotDeviceIdentity body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a WindowsAutopilotDeviceIdentityItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WindowsAutopilotDeviceIdentityItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WindowsAutopilotDeviceIdentityItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The list of assigned devices for the profile.
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
         * @return a Map<String, Object>
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
