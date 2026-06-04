package com.microsoft.graph.beta.networkaccess.reports;

import com.microsoft.graph.beta.models.networkaccess.Reports;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccesscrosstenantaccessreportwiths_4cee9e8f.MicrosoftGraphNetworkaccessCrossTenantAccessReportWithS_74eb9b50;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessdestinationreportwithstartda_722c133b.MicrosoftGraphNetworkaccessDestinationReportWithStartDa_7ddfa63b;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessdevicereportwithstartdatetim_16f641f5.MicrosoftGraphNetworkaccessDeviceReportWithStartDateTim_06594dbd;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessentitiessummarieswithstartda_cfbfd38e.MicrosoftGraphNetworkaccessEntitiesSummariesWithStartDa_b76b42e0;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetapplicationusageanalytics_fc58d242.MicrosoftGraphNetworkaccessGetApplicationUsageAnalytics_46cb0254;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetcloudapplicationreportwit_4a6eb858.MicrosoftGraphNetworkaccessGetCloudApplicationReportWit_08376ab7;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetconnectionsummarieswithst_80121996.MicrosoftGraphNetworkaccessGetConnectionSummariesWithSt_6f553693;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetcrosstenantsummarywithsta_ab507ab1.MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithSta_f8c194eb;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetdestinationsummarieswiths_43863711.MicrosoftGraphNetworkaccessGetDestinationSummariesWithS_f815467f;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetdeviceusagesummarywithsta_717ff531.MicrosoftGraphNetworkaccessGetDeviceUsageSummaryWithSta_ba9070fc;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetdiscoveredapplicationsegm_55b7036d.MicrosoftGraphNetworkaccessGetDiscoveredApplicationSegm_18174033;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessgetenterpriseapplicationrepo_7f939dfd.MicrosoftGraphNetworkaccessGetEnterpriseApplicationRepo_0f74db6c;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccesstransactionsummarieswithstar_fe4a0884.MicrosoftGraphNetworkaccessTransactionSummariesWithStar_bb0f5d04;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessusageprofilingwithstartdatet_1446eb7c.MicrosoftGraphNetworkaccessUsageProfilingWithStartDateT_03bd8f28;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccessuserreportwithstartdatetimew_7ecae511.MicrosoftGraphNetworkaccessUserReportWithStartDateTimeW_f71a8761;
import com.microsoft.graph.beta.networkaccess.reports.microsoftgraphnetworkaccesswebcategoryreportwithstartda_ebd38ed5.MicrosoftGraphNetworkaccessWebCategoryReportWithStartDa_6cc93018;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the reports property of the microsoft.graph.networkaccess.networkAccessRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ReportsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/reports", pathParameters);
    }
    /**
     * Instantiates a new {@link ReportsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReportsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/networkAccess/reports", rawUrl);
    }
    /**
     * Delete navigation property reports for networkAccess
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property reports for networkAccess
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
     * Represents the status of the Global Secure Access services for the tenant.
     * @return a {@link Reports}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Reports get() {
        return get(null);
    }
    /**
     * Represents the status of the Global Secure Access services for the tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Reports}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Reports get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Reports::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the crossTenantAccessReport method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessCrossTenantAccessReportWithS_74eb9b50}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessCrossTenantAccessReportWithS_74eb9b50 microsoftGraphNetworkaccessCrossTenantAccessReportWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessCrossTenantAccessReportWithS_74eb9b50(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the destinationReport method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessDestinationReportWithStartDa_7ddfa63b}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessDestinationReportWithStartDa_7ddfa63b microsoftGraphNetworkaccessDestinationReportWithStartDateTimeWithEndDateTimeaiAgentIdAiAgentIdAiAgentNameAiAgentName(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessDestinationReportWithStartDa_7ddfa63b(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the deviceReport method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessDeviceReportWithStartDateTim_06594dbd}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessDeviceReportWithStartDateTim_06594dbd microsoftGraphNetworkaccessDeviceReportWithStartDateTimeWithEndDateTimediscoveredApplicationSegmentIdDiscoveredApplicationSegmentIdApplicationIdApplicationIdAiAgentIdAiAgentIdAiAgentNameAiAgentNameCloudApplicationNameCloudApplicationNameDestinationUrlDestinationUrl(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessDeviceReportWithStartDateTim_06594dbd(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the entitiesSummaries method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessEntitiesSummariesWithStartDa_b76b42e0}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessEntitiesSummariesWithStartDa_b76b42e0 microsoftGraphNetworkaccessEntitiesSummariesWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessEntitiesSummariesWithStartDa_b76b42e0(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the getApplicationUsageAnalytics method.
     * @param aggregatedBy Usage: aggregatedBy=&apos;{aggregatedBy}&apos;
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessGetApplicationUsageAnalytics_46cb0254}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetApplicationUsageAnalytics_46cb0254 microsoftGraphNetworkaccessGetApplicationUsageAnalyticsWithStartDateTimeWithEndDateTimeWithAggregatedBy(@jakarta.annotation.Nonnull final String aggregatedBy, @jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(aggregatedBy);
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessGetApplicationUsageAnalytics_46cb0254(pathParameters, requestAdapter, aggregatedBy, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the getCloudApplicationReport method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessGetCloudApplicationReportWit_08376ab7}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetCloudApplicationReportWit_08376ab7 microsoftGraphNetworkaccessGetCloudApplicationReportWithStartDateTimeWithEndDateTimeuserIdUserId(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessGetCloudApplicationReportWit_08376ab7(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the getConnectionSummaries method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessGetConnectionSummariesWithSt_6f553693}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetConnectionSummariesWithSt_6f553693 microsoftGraphNetworkaccessGetConnectionSummariesWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessGetConnectionSummariesWithSt_6f553693(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the getCrossTenantSummary method.
     * @param discoveryPivotDateTime Usage: discoveryPivotDateTime={discoveryPivotDateTime}
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithSta_f8c194eb}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithSta_f8c194eb microsoftGraphNetworkaccessGetCrossTenantSummaryWithStartDateTimeWithEndDateTimeWithDiscoveryPivotDateTime(@jakarta.annotation.Nonnull final OffsetDateTime discoveryPivotDateTime, @jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(discoveryPivotDateTime);
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessGetCrossTenantSummaryWithSta_f8c194eb(pathParameters, requestAdapter, discoveryPivotDateTime, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the getDestinationSummaries method.
     * @param aggregatedBy Usage: aggregatedBy=&apos;{aggregatedBy}&apos;
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessGetDestinationSummariesWithS_f815467f}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetDestinationSummariesWithS_f815467f microsoftGraphNetworkaccessGetDestinationSummariesWithStartDateTimeWithEndDateTimeWithAggregatedBy(@jakarta.annotation.Nonnull final String aggregatedBy, @jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(aggregatedBy);
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessGetDestinationSummariesWithS_f815467f(pathParameters, requestAdapter, aggregatedBy, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the getDeviceUsageSummary method.
     * @param activityPivotDateTime Usage: activityPivotDateTime={activityPivotDateTime}
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessGetDeviceUsageSummaryWithSta_ba9070fc}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetDeviceUsageSummaryWithSta_ba9070fc microsoftGraphNetworkaccessGetDeviceUsageSummaryWithStartDateTimeWithEndDateTimeWithActivityPivotDateTime(@jakarta.annotation.Nonnull final OffsetDateTime activityPivotDateTime, @jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(activityPivotDateTime);
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessGetDeviceUsageSummaryWithSta_ba9070fc(pathParameters, requestAdapter, activityPivotDateTime, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the getDiscoveredApplicationSegmentReport method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessGetDiscoveredApplicationSegm_18174033}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetDiscoveredApplicationSegm_18174033 microsoftGraphNetworkaccessGetDiscoveredApplicationSegmentReportWithStartDateTimeWithEndDateTimeuserIdUserId(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessGetDiscoveredApplicationSegm_18174033(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the getEnterpriseApplicationReport method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessGetEnterpriseApplicationRepo_0f74db6c}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessGetEnterpriseApplicationRepo_0f74db6c microsoftGraphNetworkaccessGetEnterpriseApplicationReportWithStartDateTimeWithEndDateTimeuserIdUserId(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessGetEnterpriseApplicationRepo_0f74db6c(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the transactionSummaries method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessTransactionSummariesWithStar_bb0f5d04}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessTransactionSummariesWithStar_bb0f5d04 microsoftGraphNetworkaccessTransactionSummariesWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessTransactionSummariesWithStar_bb0f5d04(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the usageProfiling method.
     * @param aggregatedBy Usage: aggregatedBy=&apos;{aggregatedBy}&apos;
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessUsageProfilingWithStartDateT_03bd8f28}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessUsageProfilingWithStartDateT_03bd8f28 microsoftGraphNetworkaccessUsageProfilingWithStartDateTimeWithEndDateTimeWithAggregatedBydiscoveredApplicationSegmentIdDiscoveredApplicationSegmentIdApplicationIdApplicationId(@jakarta.annotation.Nonnull final String aggregatedBy, @jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(aggregatedBy);
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessUsageProfilingWithStartDateT_03bd8f28(pathParameters, requestAdapter, aggregatedBy, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the userReport method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessUserReportWithStartDateTimeW_f71a8761}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessUserReportWithStartDateTimeW_f71a8761 microsoftGraphNetworkaccessUserReportWithStartDateTimeWithEndDateTimediscoveredApplicationSegmentIdDiscoveredApplicationSegmentIdApplicationIdApplicationIdAiAgentIdAiAgentIdAiAgentNameAiAgentNameCloudApplicationNameCloudApplicationNameDestinationUrlDestinationUrl(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessUserReportWithStartDateTimeW_f71a8761(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Provides operations to call the webCategoryReport method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a {@link MicrosoftGraphNetworkaccessWebCategoryReportWithStartDa_6cc93018}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphNetworkaccessWebCategoryReportWithStartDa_6cc93018 microsoftGraphNetworkaccessWebCategoryReportWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphNetworkaccessWebCategoryReportWithStartDa_6cc93018(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Update the navigation property reports in networkAccess
     * @param body The request body
     * @return a {@link Reports}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Reports patch(@jakarta.annotation.Nonnull final Reports body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property reports in networkAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Reports}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Reports patch(@jakarta.annotation.Nonnull final Reports body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Reports::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property reports for networkAccess
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property reports for networkAccess
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
     * Represents the status of the Global Secure Access services for the tenant.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Represents the status of the Global Secure Access services for the tenant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, "{+baseurl}/networkAccess/reports{?%24expand,%24select}", pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property reports in networkAccess
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Reports body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property reports in networkAccess
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Reports body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ReportsRequestBuilder}
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
     * Represents the status of the Global Secure Access services for the tenant.
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
