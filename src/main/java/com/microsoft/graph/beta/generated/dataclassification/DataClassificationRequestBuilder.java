package com.microsoft.graph.beta.dataclassification;

import com.microsoft.graph.beta.dataclassification.classifyexactmatches.ClassifyExactMatchesRequestBuilder;
import com.microsoft.graph.beta.dataclassification.classifyfile.ClassifyFileRequestBuilder;
import com.microsoft.graph.beta.dataclassification.classifyfilejobs.ClassifyFileJobsRequestBuilder;
import com.microsoft.graph.beta.dataclassification.classifytextjobs.ClassifyTextJobsRequestBuilder;
import com.microsoft.graph.beta.dataclassification.evaluatedlppoliciesjobs.EvaluateDlpPoliciesJobsRequestBuilder;
import com.microsoft.graph.beta.dataclassification.evaluatelabeljobs.EvaluateLabelJobsRequestBuilder;
import com.microsoft.graph.beta.dataclassification.exactmatchdatastores.ExactMatchDataStoresRequestBuilder;
import com.microsoft.graph.beta.dataclassification.exactmatchuploadagents.ExactMatchUploadAgentsRequestBuilder;
import com.microsoft.graph.beta.dataclassification.jobs.JobsRequestBuilder;
import com.microsoft.graph.beta.dataclassification.sensitivetypes.SensitiveTypesRequestBuilder;
import com.microsoft.graph.beta.dataclassification.sensitivitylabels.SensitivityLabelsRequestBuilder;
import com.microsoft.graph.beta.models.DataClassificationService;
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
 * Provides operations to manage the dataClassificationService singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DataClassificationRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the classifyExactMatches method.
     * @return a {@link ClassifyExactMatchesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClassifyExactMatchesRequestBuilder classifyExactMatches() {
        return new ClassifyExactMatchesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the classifyFile method.
     * @return a {@link ClassifyFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClassifyFileRequestBuilder classifyFile() {
        return new ClassifyFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the classifyFileJobs property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link ClassifyFileJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClassifyFileJobsRequestBuilder classifyFileJobs() {
        return new ClassifyFileJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the classifyTextJobs property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link ClassifyTextJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClassifyTextJobsRequestBuilder classifyTextJobs() {
        return new ClassifyTextJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the evaluateDlpPoliciesJobs property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link EvaluateDlpPoliciesJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EvaluateDlpPoliciesJobsRequestBuilder evaluateDlpPoliciesJobs() {
        return new EvaluateDlpPoliciesJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the evaluateLabelJobs property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link EvaluateLabelJobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EvaluateLabelJobsRequestBuilder evaluateLabelJobs() {
        return new EvaluateLabelJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exactMatchDataStores property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link ExactMatchDataStoresRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExactMatchDataStoresRequestBuilder exactMatchDataStores() {
        return new ExactMatchDataStoresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the exactMatchUploadAgents property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link ExactMatchUploadAgentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExactMatchUploadAgentsRequestBuilder exactMatchUploadAgents() {
        return new ExactMatchUploadAgentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the jobs property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link JobsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public JobsRequestBuilder jobs() {
        return new JobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sensitiveTypes property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link SensitiveTypesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SensitiveTypesRequestBuilder sensitiveTypes() {
        return new SensitiveTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sensitivityLabels property of the microsoft.graph.dataClassificationService entity.
     * @return a {@link SensitivityLabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SensitivityLabelsRequestBuilder sensitivityLabels() {
        return new SensitivityLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link DataClassificationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DataClassificationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dataClassification{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link DataClassificationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DataClassificationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dataClassification{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get dataClassification
     * @return a {@link DataClassificationService}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DataClassificationService get() {
        return get(null);
    }
    /**
     * Get dataClassification
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DataClassificationService}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DataClassificationService get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DataClassificationService::createFromDiscriminatorValue);
    }
    /**
     * Update dataClassification
     * @param body The request body
     * @return a {@link DataClassificationService}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DataClassificationService patch(@jakarta.annotation.Nonnull final DataClassificationService body) {
        return patch(body, null);
    }
    /**
     * Update dataClassification
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DataClassificationService}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DataClassificationService patch(@jakarta.annotation.Nonnull final DataClassificationService body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DataClassificationService::createFromDiscriminatorValue);
    }
    /**
     * Get dataClassification
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get dataClassification
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
     * Update dataClassification
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DataClassificationService body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update dataClassification
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final DataClassificationService body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DataClassificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DataClassificationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DataClassificationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get dataClassification
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
