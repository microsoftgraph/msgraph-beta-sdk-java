package com.microsoft.graph.me.cloudpcs.item;

import com.microsoft.graph.me.cloudpcs.item.changeuseraccounttype.ChangeUserAccountTypeRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.endgraceperiod.EndGracePeriodRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.getcloudpcconnectivityhistory.GetCloudPcConnectivityHistoryRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.getcloudpclaunchinfo.GetCloudPcLaunchInfoRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.getshiftworkcloudpcaccessstate.GetShiftWorkCloudPcAccessStateRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.getsupportedcloudpcremoteactions.GetSupportedCloudPcRemoteActionsRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.reboot.RebootRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.rename.RenameRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.reprovision.ReprovisionRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.retrypartneragentinstallation.RetryPartnerAgentInstallationRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.start.StartRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.stop.StopRequestBuilder;
import com.microsoft.graph.me.cloudpcs.item.troubleshoot.TroubleshootRequestBuilder;
import com.microsoft.graph.models.CloudPC;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the cloudPCs property of the microsoft.graph.user entity.
 */
public class CloudPCItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to call the changeUserAccountType method. */
    @javax.annotation.Nonnull
    public ChangeUserAccountTypeRequestBuilder changeUserAccountType() {
        return new ChangeUserAccountTypeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the endGracePeriod method. */
    @javax.annotation.Nonnull
    public EndGracePeriodRequestBuilder endGracePeriod() {
        return new EndGracePeriodRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCloudPcConnectivityHistory method. */
    @javax.annotation.Nonnull
    public GetCloudPcConnectivityHistoryRequestBuilder getCloudPcConnectivityHistory() {
        return new GetCloudPcConnectivityHistoryRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getCloudPcLaunchInfo method. */
    @javax.annotation.Nonnull
    public GetCloudPcLaunchInfoRequestBuilder getCloudPcLaunchInfo() {
        return new GetCloudPcLaunchInfoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getShiftWorkCloudPcAccessState method. */
    @javax.annotation.Nonnull
    public GetShiftWorkCloudPcAccessStateRequestBuilder getShiftWorkCloudPcAccessState() {
        return new GetShiftWorkCloudPcAccessStateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getSupportedCloudPcRemoteActions method. */
    @javax.annotation.Nonnull
    public GetSupportedCloudPcRemoteActionsRequestBuilder getSupportedCloudPcRemoteActions() {
        return new GetSupportedCloudPcRemoteActionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the reboot method. */
    @javax.annotation.Nonnull
    public RebootRequestBuilder reboot() {
        return new RebootRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the rename method. */
    @javax.annotation.Nonnull
    public RenameRequestBuilder rename() {
        return new RenameRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the reprovision method. */
    @javax.annotation.Nonnull
    public ReprovisionRequestBuilder reprovision() {
        return new ReprovisionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the restore method. */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the retryPartnerAgentInstallation method. */
    @javax.annotation.Nonnull
    public RetryPartnerAgentInstallationRequestBuilder retryPartnerAgentInstallation() {
        return new RetryPartnerAgentInstallationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the start method. */
    @javax.annotation.Nonnull
    public StartRequestBuilder start() {
        return new StartRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the stop method. */
    @javax.annotation.Nonnull
    public StopRequestBuilder stop() {
        return new StopRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the troubleshoot method. */
    @javax.annotation.Nonnull
    public TroubleshootRequestBuilder troubleshoot() {
        return new TroubleshootRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CloudPCItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPCItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/cloudPCs/{cloudPC%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CloudPCItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPCItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/me/cloudPCs/{cloudPC%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property cloudPCs for me
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property cloudPCs for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get cloudPCs from me
     * @return a CompletableFuture of cloudPC
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudPC> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CloudPC::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CloudPC> executionException = new java.util.concurrent.CompletableFuture<CloudPC>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get cloudPCs from me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudPC
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudPC> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CloudPC::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CloudPC> executionException = new java.util.concurrent.CompletableFuture<CloudPC>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property cloudPCs in me
     * @param body The request body
     * @return a CompletableFuture of cloudPC
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudPC> patch(@javax.annotation.Nonnull final CloudPC body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CloudPC::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CloudPC> executionException = new java.util.concurrent.CompletableFuture<CloudPC>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property cloudPCs in me
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudPC
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudPC> patch(@javax.annotation.Nonnull final CloudPC body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CloudPC::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CloudPC> executionException = new java.util.concurrent.CompletableFuture<CloudPC>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property cloudPCs for me
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property cloudPCs for me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get cloudPCs from me
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get cloudPCs from me
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property cloudPCs in me
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final CloudPC body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property cloudPCs in me
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final CloudPC body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get cloudPCs from me
     */
    public class GetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
