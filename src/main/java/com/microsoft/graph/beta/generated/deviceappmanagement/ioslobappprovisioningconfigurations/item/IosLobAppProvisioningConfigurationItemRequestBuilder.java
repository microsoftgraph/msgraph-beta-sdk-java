package com.microsoft.graph.beta.deviceappmanagement.ioslobappprovisioningconfigurations.item;

import com.microsoft.graph.beta.deviceappmanagement.ioslobappprovisioningconfigurations.item.assign.AssignRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.ioslobappprovisioningconfigurations.item.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.ioslobappprovisioningconfigurations.item.devicestatuses.DeviceStatusesRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.ioslobappprovisioningconfigurations.item.groupassignments.GroupAssignmentsRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.ioslobappprovisioningconfigurations.item.userstatuses.UserStatusesRequestBuilder;
import com.microsoft.graph.beta.models.IosLobAppProvisioningConfiguration;
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
 * Provides operations to manage the iosLobAppProvisioningConfigurations property of the microsoft.graph.deviceAppManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosLobAppProvisioningConfigurationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the assign method.
     * @return a {@link AssignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignRequestBuilder assign() {
        return new AssignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.iosLobAppProvisioningConfiguration entity.
     * @return a {@link AssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceStatuses property of the microsoft.graph.iosLobAppProvisioningConfiguration entity.
     * @return a {@link DeviceStatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeviceStatusesRequestBuilder deviceStatuses() {
        return new DeviceStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the groupAssignments property of the microsoft.graph.iosLobAppProvisioningConfiguration entity.
     * @return a {@link GroupAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupAssignmentsRequestBuilder groupAssignments() {
        return new GroupAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userStatuses property of the microsoft.graph.iosLobAppProvisioningConfiguration entity.
     * @return a {@link UserStatusesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserStatusesRequestBuilder userStatuses() {
        return new UserStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link IosLobAppProvisioningConfigurationItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IosLobAppProvisioningConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfiguration%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link IosLobAppProvisioningConfigurationItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IosLobAppProvisioningConfigurationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/iosLobAppProvisioningConfigurations/{iosLobAppProvisioningConfiguration%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property iosLobAppProvisioningConfigurations for deviceAppManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property iosLobAppProvisioningConfigurations for deviceAppManagement
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
     * The IOS Lob App Provisioning Configurations.
     * @return a {@link IosLobAppProvisioningConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IosLobAppProvisioningConfiguration get() {
        return get(null);
    }
    /**
     * The IOS Lob App Provisioning Configurations.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IosLobAppProvisioningConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IosLobAppProvisioningConfiguration get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IosLobAppProvisioningConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property iosLobAppProvisioningConfigurations in deviceAppManagement
     * @param body The request body
     * @return a {@link IosLobAppProvisioningConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IosLobAppProvisioningConfiguration patch(@jakarta.annotation.Nonnull final IosLobAppProvisioningConfiguration body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property iosLobAppProvisioningConfigurations in deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link IosLobAppProvisioningConfiguration}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public IosLobAppProvisioningConfiguration patch(@jakarta.annotation.Nonnull final IosLobAppProvisioningConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, IosLobAppProvisioningConfiguration::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property iosLobAppProvisioningConfigurations for deviceAppManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property iosLobAppProvisioningConfigurations for deviceAppManagement
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
     * The IOS Lob App Provisioning Configurations.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The IOS Lob App Provisioning Configurations.
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
     * Update the navigation property iosLobAppProvisioningConfigurations in deviceAppManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IosLobAppProvisioningConfiguration body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property iosLobAppProvisioningConfigurations in deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final IosLobAppProvisioningConfiguration body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link IosLobAppProvisioningConfigurationItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IosLobAppProvisioningConfigurationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IosLobAppProvisioningConfigurationItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The IOS Lob App Provisioning Configurations.
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
