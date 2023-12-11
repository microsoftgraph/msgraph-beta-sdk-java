package com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports;

import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.exportjobs.ExportJobsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getactionstatusreports.GetActionStatusReportsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getcloudpcrecommendationreports.GetCloudPcRecommendationReportsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getconnectionqualityreports.GetConnectionQualityReportsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getdailyaggregatedremoteconnectionreports.GetDailyAggregatedRemoteConnectionReportsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getfrontlinereport.GetFrontlineReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getinaccessiblecloudpcreports.GetInaccessibleCloudPcReportsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getrawremoteconnectionreports.GetRawRemoteConnectionReportsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getrealtimeremoteconnectionlatencywithcloudpcid.GetRealTimeRemoteConnectionLatencyWithCloudPcIdRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getrealtimeremoteconnectionstatuswithcloudpcid.GetRealTimeRemoteConnectionStatusWithCloudPcIdRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getremoteconnectionhistoricalreports.GetRemoteConnectionHistoricalReportsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.getshareduselicenseusagereport.GetSharedUseLicenseUsageReportRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.gettotalaggregatedremoteconnectionreports.GetTotalAggregatedRemoteConnectionReportsRequestBuilder;
import com.microsoft.graph.beta.models.CloudPcReports;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
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
 * Provides operations to manage the reports property of the microsoft.graph.virtualEndpoint entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the exportJobs property of the microsoft.graph.cloudPcReports entity.
     */
    @jakarta.annotation.Nonnull
    public ExportJobsRequestBuilder exportJobs() {
        return new ExportJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getActionStatusReports method.
     */
    @jakarta.annotation.Nonnull
    public GetActionStatusReportsRequestBuilder getActionStatusReports() {
        return new GetActionStatusReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getCloudPcRecommendationReports method.
     */
    @jakarta.annotation.Nonnull
    public GetCloudPcRecommendationReportsRequestBuilder getCloudPcRecommendationReports() {
        return new GetCloudPcRecommendationReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getConnectionQualityReports method.
     */
    @jakarta.annotation.Nonnull
    public GetConnectionQualityReportsRequestBuilder getConnectionQualityReports() {
        return new GetConnectionQualityReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getDailyAggregatedRemoteConnectionReports method.
     */
    @jakarta.annotation.Nonnull
    public GetDailyAggregatedRemoteConnectionReportsRequestBuilder getDailyAggregatedRemoteConnectionReports() {
        return new GetDailyAggregatedRemoteConnectionReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getFrontlineReport method.
     */
    @jakarta.annotation.Nonnull
    public GetFrontlineReportRequestBuilder getFrontlineReport() {
        return new GetFrontlineReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getInaccessibleCloudPcReports method.
     */
    @jakarta.annotation.Nonnull
    public GetInaccessibleCloudPcReportsRequestBuilder getInaccessibleCloudPcReports() {
        return new GetInaccessibleCloudPcReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getRawRemoteConnectionReports method.
     */
    @jakarta.annotation.Nonnull
    public GetRawRemoteConnectionReportsRequestBuilder getRawRemoteConnectionReports() {
        return new GetRawRemoteConnectionReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getRemoteConnectionHistoricalReports method.
     */
    @jakarta.annotation.Nonnull
    public GetRemoteConnectionHistoricalReportsRequestBuilder getRemoteConnectionHistoricalReports() {
        return new GetRemoteConnectionHistoricalReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getSharedUseLicenseUsageReport method.
     */
    @jakarta.annotation.Nonnull
    public GetSharedUseLicenseUsageReportRequestBuilder getSharedUseLicenseUsageReport() {
        return new GetSharedUseLicenseUsageReportRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getTotalAggregatedRemoteConnectionReports method.
     */
    @jakarta.annotation.Nonnull
    public GetTotalAggregatedRemoteConnectionReportsRequestBuilder getTotalAggregatedRemoteConnectionReports() {
        return new GetTotalAggregatedRemoteConnectionReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ReportsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property reports for deviceManagement
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
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
     * Cloud PC related reports.
     * @return a CloudPcReports
     */
    @jakarta.annotation.Nullable
    public CloudPcReports get() {
        return get(null);
    }
    /**
     * Cloud PC related reports.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPcReports
     */
    @jakarta.annotation.Nullable
    public CloudPcReports get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcReports::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the getRealTimeRemoteConnectionLatency method.
     * @param cloudPcId Usage: cloudPcId='{cloudPcId}'
     * @return a GetRealTimeRemoteConnectionLatencyWithCloudPcIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetRealTimeRemoteConnectionLatencyWithCloudPcIdRequestBuilder getRealTimeRemoteConnectionLatencyWithCloudPcId(@jakarta.annotation.Nonnull final String cloudPcId) {
        Objects.requireNonNull(cloudPcId);
        return new GetRealTimeRemoteConnectionLatencyWithCloudPcIdRequestBuilder(pathParameters, requestAdapter, cloudPcId);
    }
    /**
     * Provides operations to call the getRealTimeRemoteConnectionStatus method.
     * @param cloudPcId Usage: cloudPcId='{cloudPcId}'
     * @return a GetRealTimeRemoteConnectionStatusWithCloudPcIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GetRealTimeRemoteConnectionStatusWithCloudPcIdRequestBuilder getRealTimeRemoteConnectionStatusWithCloudPcId(@jakarta.annotation.Nonnull final String cloudPcId) {
        Objects.requireNonNull(cloudPcId);
        return new GetRealTimeRemoteConnectionStatusWithCloudPcIdRequestBuilder(pathParameters, requestAdapter, cloudPcId);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @return a CloudPcReports
     */
    @jakarta.annotation.Nullable
    public CloudPcReports patch(@jakarta.annotation.Nonnull final CloudPcReports body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CloudPcReports
     */
    @jakarta.annotation.Nullable
    public CloudPcReports patch(@jakarta.annotation.Nonnull final CloudPcReports body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcReports::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property reports for deviceManagement
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reports for deviceManagement
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
     * Cloud PC related reports.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Cloud PC related reports.
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
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPcReports body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property reports in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final CloudPcReports body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ReportsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ReportsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReportsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Cloud PC related reports.
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
