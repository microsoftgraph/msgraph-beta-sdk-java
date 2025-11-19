package com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.exportjobs;

import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.exportjobs.count.CountRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.virtualendpoint.reports.exportjobs.item.CloudPcExportJobItemRequestBuilder;
import com.microsoft.graph.beta.models.CloudPcExportJob;
import com.microsoft.graph.beta.models.CloudPcExportJobCollectionResponse;
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
 * Provides operations to manage the exportJobs property of the microsoft.graph.cloudPcReports entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportJobsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exportJobs property of the microsoft.graph.cloudPcReports entity.
     * @param cloudPcExportJobId The unique identifier of cloudPcExportJob
     * @return a {@link CloudPcExportJobItemRequestBuilder}
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public CloudPcExportJobItemRequestBuilder byCloudPcExportJobId(@jakarta.annotation.Nonnull final String cloudPcExportJobId) {
        Objects.requireNonNull(cloudPcExportJobId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("cloudPcExportJob%2Did", cloudPcExportJobId);
        return new CloudPcExportJobItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ExportJobsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExportJobsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports/exportJobs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link ExportJobsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ExportJobsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/virtualEndpoint/reports/exportJobs{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Read the properties and relationships of a cloudPcExportJob object. You can download a report by first creating a new cloudPcExportJob resource to initiate downloading. Use this GET operation to verify the exportJobStatus property of the cloudPcExportJob resource. The property becomes completed when the report finishes downloading in the location specified by the exportUrl property.
     * @return a {@link CloudPcExportJobCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcExportJobCollectionResponse get() {
        return get(null);
    }
    /**
     * Read the properties and relationships of a cloudPcExportJob object. You can download a report by first creating a new cloudPcExportJob resource to initiate downloading. Use this GET operation to verify the exportJobStatus property of the cloudPcExportJob resource. The property becomes completed when the report finishes downloading in the location specified by the exportUrl property.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPcExportJobCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcExportJobCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcExportJobCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new cloudPcExportJob resource to initiate downloading the entire or specified portion of a report. Use the GET cloudPcExportJob operation to verify the exportJobStatus property of the cloudPcExportJob resource. When the property result is completed, the report finishes downloading to the location specified by the exportUrl property.
     * @param body The request body
     * @return a {@link CloudPcExportJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreports-post-exportjobs?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcExportJob post(@jakarta.annotation.Nonnull final CloudPcExportJob body) {
        return post(body, null);
    }
    /**
     * Create a new cloudPcExportJob resource to initiate downloading the entire or specified portion of a report. Use the GET cloudPcExportJob operation to verify the exportJobStatus property of the cloudPcExportJob resource. When the property result is completed, the report finishes downloading to the location specified by the exportUrl property.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CloudPcExportJob}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     * @see <a href="https://learn.microsoft.com/graph/api/cloudpcreports-post-exportjobs?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public CloudPcExportJob post(@jakarta.annotation.Nonnull final CloudPcExportJob body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CloudPcExportJob::createFromDiscriminatorValue);
    }
    /**
     * Read the properties and relationships of a cloudPcExportJob object. You can download a report by first creating a new cloudPcExportJob resource to initiate downloading. Use this GET operation to verify the exportJobStatus property of the cloudPcExportJob resource. The property becomes completed when the report finishes downloading in the location specified by the exportUrl property.
     * @return a {@link RequestInformation}
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Read the properties and relationships of a cloudPcExportJob object. You can download a report by first creating a new cloudPcExportJob resource to initiate downloading. Use this GET operation to verify the exportJobStatus property of the cloudPcExportJob resource. The property becomes completed when the report finishes downloading in the location specified by the exportUrl property.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new cloudPcExportJob resource to initiate downloading the entire or specified portion of a report. Use the GET cloudPcExportJob operation to verify the exportJobStatus property of the cloudPcExportJob resource. When the property result is completed, the report finishes downloading to the location specified by the exportUrl property.
     * @param body The request body
     * @return a {@link RequestInformation}
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloudPcExportJob body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new cloudPcExportJob resource to initiate downloading the entire or specified portion of a report. Use the GET cloudPcExportJob operation to verify the exportJobStatus property of the cloudPcExportJob resource. When the property result is completed, the report finishes downloading to the location specified by the exportUrl property.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CloudPcExportJob body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ExportJobsRequestBuilder}
     * @deprecated
     * Starting from December 31, 2026, this entity type (&apos;cloudPcReports&apos;) will be deprecated and no longer supported. Please use &apos;cloudPcReport&apos; instead. as of 2025-09/cloudPcReports on 2025-09-01 and will be removed 2026-12-31
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public ExportJobsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ExportJobsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Read the properties and relationships of a cloudPcExportJob object. You can download a report by first creating a new cloudPcExportJob resource to initiate downloading. Use this GET operation to verify the exportJobStatus property of the cloudPcExportJob resource. The property becomes completed when the report finishes downloading in the location specified by the exportUrl property.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
