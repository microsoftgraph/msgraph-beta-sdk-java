package microsoft.graph.dataclassification;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.dataclassification.classifyexactmatches.ClassifyExactMatchesRequestBuilder;
import microsoft.graph.dataclassification.classifyfile.ClassifyFileRequestBuilder;
import microsoft.graph.dataclassification.classifyfilejobs.ClassifyFileJobsRequestBuilder;
import microsoft.graph.dataclassification.classifytext.ClassifyTextRequestBuilder;
import microsoft.graph.dataclassification.classifytextjobs.ClassifyTextJobsRequestBuilder;
import microsoft.graph.dataclassification.evaluatedlppoliciesjobs.EvaluateDlpPoliciesJobsRequestBuilder;
import microsoft.graph.dataclassification.evaluatelabeljobs.EvaluateLabelJobsRequestBuilder;
import microsoft.graph.dataclassification.exactmatchdatastores.ExactMatchDataStoresRequestBuilder;
import microsoft.graph.dataclassification.exactmatchdatastores.item.ExactMatchDataStoreItemRequestBuilder;
import microsoft.graph.dataclassification.exactmatchuploadagents.ExactMatchUploadAgentsRequestBuilder;
import microsoft.graph.dataclassification.exactmatchuploadagents.item.ExactMatchUploadAgentItemRequestBuilder;
import microsoft.graph.dataclassification.jobs.JobsRequestBuilder;
import microsoft.graph.dataclassification.sensitivetypes.item.SensitiveTypeItemRequestBuilder;
import microsoft.graph.dataclassification.sensitivetypes.SensitiveTypesRequestBuilder;
import microsoft.graph.dataclassification.sensitivitylabels.item.SensitivityLabelItemRequestBuilder;
import microsoft.graph.dataclassification.sensitivitylabels.SensitivityLabelsRequestBuilder;
import microsoft.graph.models.DataClassificationService;
import microsoft.graph.models.odataerrors.ODataError;
/** Provides operations to manage the dataClassificationService singleton. */
public class DataClassificationRequestBuilder {
    /** The classifyExactMatches property */
    @javax.annotation.Nonnull
    public ClassifyExactMatchesRequestBuilder classifyExactMatches() {
        return new ClassifyExactMatchesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The classifyFile property */
    @javax.annotation.Nonnull
    public ClassifyFileRequestBuilder classifyFile() {
        return new ClassifyFileRequestBuilder(pathParameters, requestAdapter);
    }
    /** The classifyFileJobs property */
    @javax.annotation.Nonnull
    public ClassifyFileJobsRequestBuilder classifyFileJobs() {
        return new ClassifyFileJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The classifyText property */
    @javax.annotation.Nonnull
    public ClassifyTextRequestBuilder classifyText() {
        return new ClassifyTextRequestBuilder(pathParameters, requestAdapter);
    }
    /** The classifyTextJobs property */
    @javax.annotation.Nonnull
    public ClassifyTextJobsRequestBuilder classifyTextJobs() {
        return new ClassifyTextJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The evaluateDlpPoliciesJobs property */
    @javax.annotation.Nonnull
    public EvaluateDlpPoliciesJobsRequestBuilder evaluateDlpPoliciesJobs() {
        return new EvaluateDlpPoliciesJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The evaluateLabelJobs property */
    @javax.annotation.Nonnull
    public EvaluateLabelJobsRequestBuilder evaluateLabelJobs() {
        return new EvaluateLabelJobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The exactMatchDataStores property */
    @javax.annotation.Nonnull
    public ExactMatchDataStoresRequestBuilder exactMatchDataStores() {
        return new ExactMatchDataStoresRequestBuilder(pathParameters, requestAdapter);
    }
    /** The exactMatchUploadAgents property */
    @javax.annotation.Nonnull
    public ExactMatchUploadAgentsRequestBuilder exactMatchUploadAgents() {
        return new ExactMatchUploadAgentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The jobs property */
    @javax.annotation.Nonnull
    public JobsRequestBuilder jobs() {
        return new JobsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The sensitiveTypes property */
    @javax.annotation.Nonnull
    public SensitiveTypesRequestBuilder sensitiveTypes() {
        return new SensitiveTypesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sensitivityLabels property */
    @javax.annotation.Nonnull
    public SensitivityLabelsRequestBuilder sensitivityLabels() {
        return new SensitivityLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.classifyFileJobs.item collection
     * @param id Unique identifier of the item
     * @return a jobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.dataclassification.classifyfilejobs.item.JobResponseBaseItemRequestBuilder classifyFileJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new microsoft.graph.dataclassification.classifyfilejobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.classifyTextJobs.item collection
     * @param id Unique identifier of the item
     * @return a jobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.dataclassification.classifytextjobs.item.JobResponseBaseItemRequestBuilder classifyTextJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new microsoft.graph.dataclassification.classifytextjobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DataClassificationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DataClassificationRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/dataClassification{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DataClassificationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public DataClassificationRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/dataClassification{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get dataClassification
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get dataClassification
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DataClassificationRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DataClassificationRequestBuilderGetRequestConfiguration requestConfig = new DataClassificationRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update dataClassification
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DataClassificationService body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update dataClassification
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DataClassificationService body, @javax.annotation.Nullable final java.util.function.Consumer<DataClassificationRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DataClassificationRequestBuilderPatchRequestConfiguration requestConfig = new DataClassificationRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.evaluateDlpPoliciesJobs.item collection
     * @param id Unique identifier of the item
     * @return a jobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.dataclassification.evaluatedlppoliciesjobs.item.JobResponseBaseItemRequestBuilder evaluateDlpPoliciesJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new microsoft.graph.dataclassification.evaluatedlppoliciesjobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.evaluateLabelJobs.item collection
     * @param id Unique identifier of the item
     * @return a jobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.dataclassification.evaluatelabeljobs.item.JobResponseBaseItemRequestBuilder evaluateLabelJobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new microsoft.graph.dataclassification.evaluatelabeljobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.exactMatchDataStores.item collection
     * @param id Unique identifier of the item
     * @return a exactMatchDataStoreItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExactMatchDataStoreItemRequestBuilder exactMatchDataStores(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("exactMatchDataStore%2Did", id);
        return new ExactMatchDataStoreItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.exactMatchUploadAgents.item collection
     * @param id Unique identifier of the item
     * @return a exactMatchUploadAgentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExactMatchUploadAgentItemRequestBuilder exactMatchUploadAgents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("exactMatchUploadAgent%2Did", id);
        return new ExactMatchUploadAgentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get dataClassification
     * @return a CompletableFuture of dataClassificationService
     */
    public java.util.concurrent.CompletableFuture<DataClassificationService> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DataClassificationService::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get dataClassification
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of dataClassificationService
     */
    public java.util.concurrent.CompletableFuture<DataClassificationService> get(@javax.annotation.Nullable final java.util.function.Consumer<DataClassificationRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DataClassificationService::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get dataClassification
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of dataClassificationService
     */
    public java.util.concurrent.CompletableFuture<DataClassificationService> get(@javax.annotation.Nullable final java.util.function.Consumer<DataClassificationRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DataClassificationService::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.jobs.item collection
     * @param id Unique identifier of the item
     * @return a jobResponseBaseItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.dataclassification.jobs.item.JobResponseBaseItemRequestBuilder jobs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("jobResponseBase%2Did", id);
        return new microsoft.graph.dataclassification.jobs.item.JobResponseBaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update dataClassification
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DataClassificationService body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update dataClassification
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DataClassificationService body, @javax.annotation.Nullable final java.util.function.Consumer<DataClassificationRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update dataClassification
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final DataClassificationService body, @javax.annotation.Nullable final java.util.function.Consumer<DataClassificationRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.sensitiveTypes.item collection
     * @param id Unique identifier of the item
     * @return a sensitiveTypeItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SensitiveTypeItemRequestBuilder sensitiveTypes(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sensitiveType%2Did", id);
        return new SensitiveTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.dataClassification.sensitivityLabels.item collection
     * @param id Unique identifier of the item
     * @return a sensitivityLabelItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SensitivityLabelItemRequestBuilder sensitivityLabels(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sensitivityLabel%2Did", id);
        return new SensitivityLabelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get dataClassification */
    public class DataClassificationRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DataClassificationRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DataClassificationRequestBuilderGetQueryParameters queryParameters = new DataClassificationRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new dataClassificationRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public DataClassificationRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DataClassificationRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new dataClassificationRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public DataClassificationRequestBuilderPatchRequestConfiguration() {
        }
    }
}
