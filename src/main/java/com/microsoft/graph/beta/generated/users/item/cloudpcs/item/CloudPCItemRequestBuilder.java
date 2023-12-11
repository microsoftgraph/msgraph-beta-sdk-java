package com.microsoft.graph.beta.users.item.cloudpcs.item;

import com.microsoft.graph.beta.models.CloudPC;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.users.item.cloudpcs.item.changeuseraccounttype.ChangeUserAccountTypeRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.createsnapshot.CreateSnapshotRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.endgraceperiod.EndGracePeriodRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getcloudpcconnectivityhistory.GetCloudPcConnectivityHistoryRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getcloudpclaunchinfo.GetCloudPcLaunchInfoRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getfrontlinecloudpcaccessstate.GetFrontlineCloudPcAccessStateRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getshiftworkcloudpcaccessstate.GetShiftWorkCloudPcAccessStateRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.getsupportedcloudpcremoteactions.GetSupportedCloudPcRemoteActionsRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.poweroff.PowerOffRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.poweron.PowerOnRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.reboot.RebootRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.rename.RenameRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.reprovision.ReprovisionRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.resize.ResizeRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.retrypartneragentinstallation.RetryPartnerAgentInstallationRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.start.StartRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.stop.StopRequestBuilder;
import com.microsoft.graph.beta.users.item.cloudpcs.item.troubleshoot.TroubleshootRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
     */
    @jakarta.annotation.Nonnull
    public ChangeUserAccountTypeRequestBuilder changeUserAccountType() {
        return new ChangeUserAccountTypeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the createSnapshot method.
     */
    @jakarta.annotation.Nonnull
    public CreateSnapshotRequestBuilder createSnapshot() {
        return new CreateSnapshotRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the endGracePeriod method.
     */
    @jakarta.annotation.Nonnull
    public EndGracePeriodRequestBuilder endGracePeriod() {
        return new EndGracePeriodRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcConnectivityHistory method.
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcConnectivityHistoryRequestBuilder getCloudPcConnectivityHistory() {
        return new GetCloudPcConnectivityHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcLaunchInfo method.
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcLaunchInfoRequestBuilder getCloudPcLaunchInfo() {
        return new GetCloudPcLaunchInfoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFrontlineCloudPcAccessState method.
     */
    @jakarta.annotation.Nonnull
    public GetFrontlineCloudPcAccessStateRequestBuilder getFrontlineCloudPcAccessState() {
        return new GetFrontlineCloudPcAccessStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getShiftWorkCloudPcAccessState method.
     */
    @jakarta.annotation.Nonnull
    public GetShiftWorkCloudPcAccessStateRequestBuilder getShiftWorkCloudPcAccessState() {
        return new GetShiftWorkCloudPcAccessStateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getSupportedCloudPcRemoteActions method.
     */
    @jakarta.annotation.Nonnull
    public GetSupportedCloudPcRemoteActionsRequestBuilder getSupportedCloudPcRemoteActions() {
        return new GetSupportedCloudPcRemoteActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the powerOff method.
     */
    @jakarta.annotation.Nonnull
    public PowerOffRequestBuilder powerOff() {
        return new PowerOffRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the powerOn method.
     */
    @jakarta.annotation.Nonnull
    public PowerOnRequestBuilder powerOn() {
        return new PowerOnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reboot method.
     */
    @jakarta.annotation.Nonnull
    public RebootRequestBuilder reboot() {
        return new RebootRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rename method.
     */
    @jakarta.annotation.Nonnull
    public RenameRequestBuilder rename() {
        return new RenameRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprovision method.
     */
    @jakarta.annotation.Nonnull
    public ReprovisionRequestBuilder reprovision() {
        return new ReprovisionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resize method.
     */
    @jakarta.annotation.Nonnull
    public ResizeRequestBuilder resize() {
        return new ResizeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retryPartnerAgentInstallation method.
     */
    @jakarta.annotation.Nonnull
    public RetryPartnerAgentInstallationRequestBuilder retryPartnerAgentInstallation() {
        return new RetryPartnerAgentInstallationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the start method.
     */
    @jakarta.annotation.Nonnull
    public StartRequestBuilder start() {
        return new StartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the stop method.
     */
    @jakarta.annotation.Nonnull
    public StopRequestBuilder stop() {
        return new StopRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the troubleshoot method.
     */
    @jakarta.annotation.Nonnull
    public TroubleshootRequestBuilder troubleshoot() {
        return new TroubleshootRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CloudPCItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPCItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CloudPCItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloudPCItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/cloudPCs/{cloudPC%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property cloudPCs for users
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property cloudPCs for users
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
     * Read the properties and relationships of a specific cloudPC object.
     * @return a CloudPC
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPC get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a specific cloudPC object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPC
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpc-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CloudPC get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPC::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property cloudPCs in users
     * @param body The request body
     * @return a CloudPC
     */
    @jakarta.annotation.Nullable
    public CloudPC patch(@jakarta.annotation.Nonnull final CloudPC body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property cloudPCs in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPC
     */
    @jakarta.annotation.Nullable
    public CloudPC patch(@jakarta.annotation.Nonnull final CloudPC body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPC::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property cloudPCs for users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property cloudPCs for users
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
     * Read the properties and relationships of a specific cloudPC object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a specific cloudPC object.
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
     * Update the navigation property cloudPCs in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPC body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property cloudPCs in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
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
     * @return a CloudPCItemRequestBuilder
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
     * Read the properties and relationships of a specific cloudPC object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
