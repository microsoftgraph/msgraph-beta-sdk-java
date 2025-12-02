package com.microsoft.graph.beta.devicemanagement.virtualendpoint.provisioningpolicies.item.assignments.item.usersettingspersistencedetail;

import com.microsoft.graph.beta.devicemanagement.virtualendpoint.provisioningpolicies.item.assignments.item.usersettingspersistencedetail.batchcleanupusersettingspersistenceprofile.BatchCleanupUserSettingsPersistenceProfileRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.provisioningpolicies.item.assignments.item.usersettingspersistencedetail.retrieveusersettingspersistenceprofileswithconfigurationid.RetrieveUserSettingsPersistenceProfilesWithConfigurationIdRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.provisioningpolicies.item.assignments.item.usersettingspersistencedetail.retrieveusersettingspersistenceprofileusagewithconfigurationid.RetrieveUserSettingsPersistenceProfileUsageWithConfigurationIdRequestBuilder;
import com.microsoft.graph.beta.models.CloudPCUserSettingsPersistenceDetail;
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
 * Provides operations to manage the userSettingsPersistenceDetail property of the microsoft.graph.cloudPcProvisioningPolicyAssignment entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSettingsPersistenceDetailRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the batchCleanupUserSettingsPersistenceProfile method.
     * @return a {@link BatchCleanupUserSettingsPersistenceProfileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BatchCleanupUserSettingsPersistenceProfileRequestBuilder batchCleanupUserSettingsPersistenceProfile() {
        return new BatchCleanupUserSettingsPersistenceProfileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link UserSettingsPersistenceDetailRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserSettingsPersistenceDetailRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/provisioningPolicies/{cloudPcProvisioningPolicy%2Did}/assignments/{cloudPcProvisioningPolicyAssignment%2Did}/userSettingsPersistenceDetail{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link UserSettingsPersistenceDetailRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserSettingsPersistenceDetailRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/provisioningPolicies/{cloudPcProvisioningPolicy%2Did}/assignments/{cloudPcProvisioningPolicyAssignment%2Did}/userSettingsPersistenceDetail{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property userSettingsPersistenceDetail for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property userSettingsPersistenceDetail for deviceManagement
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
     * The assignment targeted user settings persistence for the provisioning policy. It allows user application data and Windows settings to be saved and applied between sessions.
     * @return a {@link CloudPCUserSettingsPersistenceDetail}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPCUserSettingsPersistenceDetail get() {
        return get(null);
    }
    /**
     * The assignment targeted user settings persistence for the provisioning policy. It allows user application data and Windows settings to be saved and applied between sessions.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPCUserSettingsPersistenceDetail}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPCUserSettingsPersistenceDetail get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPCUserSettingsPersistenceDetail::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property userSettingsPersistenceDetail in deviceManagement
     * @param body The request body
     * @return a {@link CloudPCUserSettingsPersistenceDetail}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPCUserSettingsPersistenceDetail patch(@jakarta.annotation.Nonnull final CloudPCUserSettingsPersistenceDetail body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property userSettingsPersistenceDetail in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPCUserSettingsPersistenceDetail}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPCUserSettingsPersistenceDetail patch(@jakarta.annotation.Nonnull final CloudPCUserSettingsPersistenceDetail body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPCUserSettingsPersistenceDetail::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the retrieveUserSettingsPersistenceProfiles method.
     * @param configurationId Usage: configurationId=&apos;{configurationId}&apos;
     * @return a {@link RetrieveUserSettingsPersistenceProfilesWithConfigurationIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveUserSettingsPersistenceProfilesWithConfigurationIdRequestBuilder retrieveUserSettingsPersistenceProfilesWithConfigurationId(@jakarta.annotation.Nonnull final String configurationId) {
        Objects.requireNonNull(configurationId);
        return new RetrieveUserSettingsPersistenceProfilesWithConfigurationIdRequestBuilder(pathParameters, requestAdapter, configurationId);
    }
    /**
     * Provides operations to call the retrieveUserSettingsPersistenceProfileUsage method.
     * @param configurationId Usage: configurationId=&apos;{configurationId}&apos;
     * @return a {@link RetrieveUserSettingsPersistenceProfileUsageWithConfigurationIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveUserSettingsPersistenceProfileUsageWithConfigurationIdRequestBuilder retrieveUserSettingsPersistenceProfileUsageWithConfigurationId(@jakarta.annotation.Nonnull final String configurationId) {
        Objects.requireNonNull(configurationId);
        return new RetrieveUserSettingsPersistenceProfileUsageWithConfigurationIdRequestBuilder(pathParameters, requestAdapter, configurationId);
    }
    /**
     * Delete navigation property userSettingsPersistenceDetail for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property userSettingsPersistenceDetail for deviceManagement
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
     * The assignment targeted user settings persistence for the provisioning policy. It allows user application data and Windows settings to be saved and applied between sessions.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The assignment targeted user settings persistence for the provisioning policy. It allows user application data and Windows settings to be saved and applied between sessions.
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
     * Update the navigation property userSettingsPersistenceDetail in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPCUserSettingsPersistenceDetail body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property userSettingsPersistenceDetail in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPCUserSettingsPersistenceDetail body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link UserSettingsPersistenceDetailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserSettingsPersistenceDetailRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserSettingsPersistenceDetailRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The assignment targeted user settings persistence for the provisioning policy. It allows user application data and Windows settings to be saved and applied between sessions.
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
