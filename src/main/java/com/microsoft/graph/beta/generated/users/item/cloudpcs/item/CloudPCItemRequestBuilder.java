package com.microsoft.graph.beta.users.item.cloudpcs.item;

import com.microsoft.graph.beta.models.CloudPC;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.users.item.cloudpcs.item.changeuseraccounttype.ChangeUserAccountTypeRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.createsnapshot.CreateSnapshotRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.endgraceperiod.EndGracePeriodRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getcloudpcconnectivityhistory.GetCloudPcConnectivityHistoryRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getcloudpclaunchinfo.GetCloudPcLaunchInfoRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getfrontlinecloudpcaccessstate.GetFrontlineCloudPcAccessStateRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getsupportedcloudpcremoteactions.GetSupportedCloudPcRemoteActionsRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.poweroff.PowerOffRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.poweron.PowerOnRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.reboot.RebootRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.rename.RenameRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.reprovision.ReprovisionRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.resize.ResizeRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.retrievecloudpcremoteactionresults.RetrieveCloudPCRemoteActionResultsRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.retrievereviewstatus.RetrieveReviewStatusRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.retrypartneragentinstallation.RetryPartnerAgentInstallationRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.setreviewstatus.SetReviewStatusRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.start.StartRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.stop.StopRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.troubleshoot.TroubleshootRequestBuilder;
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
 * Provides operations to manage the cloudPCs property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPCItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the changeUserAccountType method.
     * @return a {@link ChangeUserAccountTypeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ChangeUserAccountTypeRequestBuilder changeUserAccountType() {
        return new ChangeUserAccountTypeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createSnapshot method.
     * @return a {@link CreateSnapshotRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateSnapshotRequestBuilder createSnapshot() {
        return new CreateSnapshotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the endGracePeriod method.
     * @return a {@link EndGracePeriodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EndGracePeriodRequestBuilder endGracePeriod() {
        return new EndGracePeriodRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcConnectivityHistory method.
     * @return a {@link GetCloudPcConnectivityHistoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcConnectivityHistoryRequestBuilder getCloudPcConnectivityHistory() {
        return new GetCloudPcConnectivityHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcLaunchInfo method.
     * @return a {@link GetCloudPcLaunchInfoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcLaunchInfoRequestBuilder getCloudPcLaunchInfo() {
        return new GetCloudPcLaunchInfoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFrontlineCloudPcAccessState method.
     * @return a {@link GetFrontlineCloudPcAccessStateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetFrontlineCloudPcAccessStateRequestBuilder getFrontlineCloudPcAccessState() {
        return new GetFrontlineCloudPcAccessStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getSupportedCloudPcRemoteActions method.
     * @return a {@link GetSupportedCloudPcRemoteActionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSupportedCloudPcRemoteActionsRequestBuilder getSupportedCloudPcRemoteActions() {
        return new GetSupportedCloudPcRemoteActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the powerOff method.
     * @return a {@link PowerOffRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PowerOffRequestBuilder powerOff() {
        return new PowerOffRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the powerOn method.
     * @return a {@link PowerOnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PowerOnRequestBuilder powerOn() {
        return new PowerOnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reboot method.
     * @return a {@link RebootRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RebootRequestBuilder reboot() {
        return new RebootRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rename method.
     * @return a {@link RenameRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RenameRequestBuilder rename() {
        return new RenameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprovision method.
     * @return a {@link ReprovisionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReprovisionRequestBuilder reprovision() {
        return new ReprovisionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resize method.
     * @return a {@link ResizeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResizeRequestBuilder resize() {
        return new ResizeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link RestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveCloudPCRemoteActionResults method.
     * @return a {@link RetrieveCloudPCRemoteActionResultsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveCloudPCRemoteActionResultsRequestBuilder retrieveCloudPCRemoteActionResults() {
        return new RetrieveCloudPCRemoteActionResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retrieveReviewStatus method.
     * @return a {@link RetrieveReviewStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetrieveReviewStatusRequestBuilder retrieveReviewStatus() {
        return new RetrieveReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retryPartnerAgentInstallation method.
     * @return a {@link RetryPartnerAgentInstallationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetryPartnerAgentInstallationRequestBuilder retryPartnerAgentInstallation() {
        return new RetryPartnerAgentInstallationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setReviewStatus method.
     * @return a {@link SetReviewStatusRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SetReviewStatusRequestBuilder setReviewStatus() {
        return new SetReviewStatusRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the start method.
     * @return a {@link StartRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StartRequestBuilder start() {
        return new StartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stop method.
     * @return a {@link StopRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StopRequestBuilder stop() {
        return new StopRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the troubleshoot method.
     * @return a {@link TroubleshootRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TroubleshootRequestBuilder troubleshoot() {
        return new TroubleshootRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CloudPCItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPCItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link CloudPCItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPCItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property cloudPCs for users
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property cloudPCs for users
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
     * Get cloudPCs from users
     * @return a {@link CloudPC}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPC get() {
        return get(null);
    }
    /**
     * Get cloudPCs from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPC}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPC get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPC::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property cloudPCs in users
     * @param body The request body
     * @return a {@link CloudPC}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPC patch(@jakarta.annotation.Nonnull final CloudPC body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property cloudPCs in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPC}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public CloudPC patch(@jakarta.annotation.Nonnull final CloudPC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPC::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property cloudPCs for users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property cloudPCs for users
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
     * Get cloudPCs from users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get cloudPCs from users
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
     * Update the navigation property cloudPCs in users
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPC body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property cloudPCs in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CloudPCItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloudPCItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CloudPCItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get cloudPCs from users
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
