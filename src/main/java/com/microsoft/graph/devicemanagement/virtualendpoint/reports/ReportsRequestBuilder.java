package com.microsoft.graph.devicemanagement.virtualendpoint.reports;

import com.microsoft.graph.devicemanagement.virtualendpoint.reports.exportjobs.ExportJobsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.reports.exportjobs.item.CloudPcExportJobItemRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.reports.getdailyaggregatedremoteconnectionreports.GetDailyAggregatedRemoteConnectionReportsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.reports.getrealtimeremoteconnectionlatencywithcloudpcid.GetRealTimeRemoteConnectionLatencyWithCloudPcIdRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.reports.getrealtimeremoteconnectionstatuswithcloudpcid.GetRealTimeRemoteConnectionStatusWithCloudPcIdRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.reports.getremoteconnectionhistoricalreports.GetRemoteConnectionHistoricalReportsRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.reports.getshareduselicenseusagereport.GetSharedUseLicenseUsageReportRequestBuilder;
import com.microsoft.graph.devicemanagement.virtualendpoint.reports.gettotalaggregatedremoteconnectionreports.GetTotalAggregatedRemoteConnectionReportsRequestBuilder;
import com.microsoft.graph.models.CloudPcReports;
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
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the reports property of the microsoft.graph.virtualEndpoint entity.
 */
public class ReportsRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the exportJobs property of the microsoft.graph.cloudPcReports entity. */
    @javax.annotation.Nonnull
    public ExportJobsRequestBuilder exportJobs() {
        return new ExportJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getDailyAggregatedRemoteConnectionReports method. */
    @javax.annotation.Nonnull
    public GetDailyAggregatedRemoteConnectionReportsRequestBuilder getDailyAggregatedRemoteConnectionReports() {
        return new GetDailyAggregatedRemoteConnectionReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getRemoteConnectionHistoricalReports method. */
    @javax.annotation.Nonnull
    public GetRemoteConnectionHistoricalReportsRequestBuilder getRemoteConnectionHistoricalReports() {
        return new GetRemoteConnectionHistoricalReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getSharedUseLicenseUsageReport method. */
    @javax.annotation.Nonnull
    public GetSharedUseLicenseUsageReportRequestBuilder getSharedUseLicenseUsageReport() {
        return new GetSharedUseLicenseUsageReportRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getTotalAggregatedRemoteConnectionReports method. */
    @javax.annotation.Nonnull
    public GetTotalAggregatedRemoteConnectionReportsRequestBuilder getTotalAggregatedRemoteConnectionReports() {
        return new GetTotalAggregatedRemoteConnectionReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ReportsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the exportJobs property of the microsoft.graph.cloudPcReports entity.
     * @param id Unique identifier of the item
     * @return a CloudPcExportJobItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CloudPcExportJobItemRequestBuilder exportJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcExportJob%2Did", id);
        return new CloudPcExportJobItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Cloud PC related reports.
     * @return a CompletableFuture of cloudPcReports
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcReports> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CloudPcReports::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CloudPcReports> executionException = new java.util.concurrent.CompletableFuture<CloudPcReports>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Cloud PC related reports.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudPcReports
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcReports> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CloudPcReports::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CloudPcReports> executionException = new java.util.concurrent.CompletableFuture<CloudPcReports>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to call the getRealTimeRemoteConnectionLatency method.
     * @param cloudPcId Usage: cloudPcId='{cloudPcId}'
     * @return a getRealTimeRemoteConnectionLatencyWithCloudPcIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetRealTimeRemoteConnectionLatencyWithCloudPcIdRequestBuilder getRealTimeRemoteConnectionLatencyWithCloudPcId(@javax.annotation.Nonnull final String cloudPcId) {
        Objects.requireNonNull(cloudPcId);
        return new GetRealTimeRemoteConnectionLatencyWithCloudPcIdRequestBuilder(pathParameters, requestAdapter, cloudPcId);
    }
    /**
     * Provides operations to call the getRealTimeRemoteConnectionStatus method.
     * @param cloudPcId Usage: cloudPcId='{cloudPcId}'
     * @return a getRealTimeRemoteConnectionStatusWithCloudPcIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetRealTimeRemoteConnectionStatusWithCloudPcIdRequestBuilder getRealTimeRemoteConnectionStatusWithCloudPcId(@javax.annotation.Nonnull final String cloudPcId) {
        Objects.requireNonNull(cloudPcId);
        return new GetRealTimeRemoteConnectionStatusWithCloudPcIdRequestBuilder(pathParameters, requestAdapter, cloudPcId);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @return a CompletableFuture of cloudPcReports
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcReports> patch(@javax.annotation.Nonnull final CloudPcReports body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CloudPcReports::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CloudPcReports> executionException = new java.util.concurrent.CompletableFuture<CloudPcReports>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of cloudPcReports
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<CloudPcReports> patch(@javax.annotation.Nonnull final CloudPcReports body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, CloudPcReports::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<CloudPcReports> executionException = new java.util.concurrent.CompletableFuture<CloudPcReports>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
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
     * Cloud PC related reports.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Cloud PC related reports.
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
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final CloudPcReports body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final CloudPcReports body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Cloud PC related reports.
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
