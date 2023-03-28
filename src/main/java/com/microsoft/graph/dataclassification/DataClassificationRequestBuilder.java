package com.microsoft.graph.dataclassification;

import com.microsoft.graph.dataclassification.classifyexactmatches.ClassifyExactMatchesRequestBuilder;
import com.microsoft.graph.dataclassification.classifyfile.ClassifyFileRequestBuilder;
import com.microsoft.graph.dataclassification.classifyfilejobs.ClassifyFileJobsRequestBuilder;
import com.microsoft.graph.dataclassification.classifyfilejobs.item.JobResponseBaseItemRequestBuilder;
import com.microsoft.graph.dataclassification.classifytextjobs.ClassifyTextJobsRequestBuilder;
import com.microsoft.graph.dataclassification.evaluatedlppoliciesjobs.EvaluateDlpPoliciesJobsRequestBuilder;
import com.microsoft.graph.dataclassification.evaluatelabeljobs.EvaluateLabelJobsRequestBuilder;
import com.microsoft.graph.dataclassification.exactmatchdatastores.ExactMatchDataStoresRequestBuilder;
import com.microsoft.graph.dataclassification.exactmatchdatastores.item.ExactMatchDataStoreItemRequestBuilder;
import com.microsoft.graph.dataclassification.exactmatchuploadagents.ExactMatchUploadAgentsRequestBuilder;
import com.microsoft.graph.dataclassification.exactmatchuploadagents.item.ExactMatchUploadAgentItemRequestBuilder;
import com.microsoft.graph.dataclassification.jobs.JobsRequestBuilder;
import com.microsoft.graph.dataclassification.sensitivetypes.item.SensitiveTypeItemRequestBuilder;
import com.microsoft.graph.dataclassification.sensitivetypes.SensitiveTypesRequestBuilder;
import com.microsoft.graph.dataclassification.sensitivitylabels.item.SensitivityLabelItemRequestBuilder;
import com.microsoft.graph.dataclassification.sensitivitylabels.SensitivityLabelsRequestBuilder;
import com.microsoft.graph.models.DataClassificationService;
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
 * Provides operations to manage the dataClassificationService singleton.
 */
public class DataClassificationRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to call the classifyExactMatches method. */
    @javax.annotation.Nonnull
    public ClassifyExactMatchesRequestBuilder classifyExactMatches() {
        return new ClassifyExactMatchesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the classifyFile method. */
    @javax.annotation.Nonnull
    public ClassifyFileRequestBuilder classifyFile() {
        return new ClassifyFileRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the classifyFileJobs property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public ClassifyFileJobsRequestBuilder classifyFileJobs() {
        return new ClassifyFileJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the classifyTextJobs property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public ClassifyTextJobsRequestBuilder classifyTextJobs() {
        return new ClassifyTextJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the evaluateDlpPoliciesJobs property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public EvaluateDlpPoliciesJobsRequestBuilder evaluateDlpPoliciesJobs() {
        return new EvaluateDlpPoliciesJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the evaluateLabelJobs property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public EvaluateLabelJobsRequestBuilder evaluateLabelJobs() {
        return new EvaluateLabelJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the exactMatchDataStores property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public ExactMatchDataStoresRequestBuilder exactMatchDataStores() {
        return new ExactMatchDataStoresRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the exactMatchUploadAgents property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public ExactMatchUploadAgentsRequestBuilder exactMatchUploadAgents() {
        return new ExactMatchUploadAgentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the jobs property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public JobsRequestBuilder jobs() {
        return new JobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the sensitiveTypes property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public SensitiveTypesRequestBuilder sensitiveTypes() {
        return new SensitiveTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the sensitivityLabels property of the microsoft.graph.dataClassificationService entity. */
    @javax.annotation.Nonnull
    public SensitivityLabelsRequestBuilder sensitivityLabels() {
        return new SensitivityLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the classifyFileJobs property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a JobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.dataclassification.classifyfilejobs.item.JobResponseBaseItemRequestBuilder classifyFileJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new com.microsoft.graph.dataclassification.classifyfilejobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the classifyTextJobs property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a JobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.dataclassification.classifytextjobs.item.JobResponseBaseItemRequestBuilder classifyTextJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new com.microsoft.graph.dataclassification.classifytextjobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DataClassificationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DataClassificationRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dataClassification{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DataClassificationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DataClassificationRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dataClassification{?%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to manage the evaluateDlpPoliciesJobs property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a JobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.dataclassification.evaluatedlppoliciesjobs.item.JobResponseBaseItemRequestBuilder evaluateDlpPoliciesJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new com.microsoft.graph.dataclassification.evaluatedlppoliciesjobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the evaluateLabelJobs property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a JobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.dataclassification.evaluatelabeljobs.item.JobResponseBaseItemRequestBuilder evaluateLabelJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new com.microsoft.graph.dataclassification.evaluatelabeljobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the exactMatchDataStores property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a ExactMatchDataStoreItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExactMatchDataStoreItemRequestBuilder exactMatchDataStores(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("exactMatchDataStore%2Did", id);
        return new ExactMatchDataStoreItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the exactMatchUploadAgents property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a ExactMatchUploadAgentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExactMatchUploadAgentItemRequestBuilder exactMatchUploadAgents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("exactMatchUploadAgent%2Did", id);
        return new ExactMatchUploadAgentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get dataClassification
     * @return a CompletableFuture of dataClassificationService
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DataClassificationService> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DataClassificationService::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DataClassificationService> executionException = new java.util.concurrent.CompletableFuture<DataClassificationService>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get dataClassification
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of dataClassificationService
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DataClassificationService> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DataClassificationService::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DataClassificationService> executionException = new java.util.concurrent.CompletableFuture<DataClassificationService>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the jobs property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a JobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.dataclassification.jobs.item.JobResponseBaseItemRequestBuilder jobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new com.microsoft.graph.dataclassification.jobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update dataClassification
     * @param body The request body
     * @return a CompletableFuture of dataClassificationService
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DataClassificationService> patch(@javax.annotation.Nonnull final DataClassificationService body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DataClassificationService::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DataClassificationService> executionException = new java.util.concurrent.CompletableFuture<DataClassificationService>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update dataClassification
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of dataClassificationService
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DataClassificationService> patch(@javax.annotation.Nonnull final DataClassificationService body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DataClassificationService::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DataClassificationService> executionException = new java.util.concurrent.CompletableFuture<DataClassificationService>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the sensitiveTypes property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a SensitiveTypeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SensitiveTypeItemRequestBuilder sensitiveTypes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sensitiveType%2Did", id);
        return new SensitiveTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the sensitivityLabels property of the microsoft.graph.dataClassificationService entity.
     * @param id Unique identifier of the item
     * @return a SensitivityLabelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SensitivityLabelItemRequestBuilder sensitivityLabels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sensitivityLabel%2Did", id);
        return new SensitivityLabelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get dataClassification
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get dataClassification
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
     * Update dataClassification
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DataClassificationService body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update dataClassification
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final DataClassificationService body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Get dataClassification
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
