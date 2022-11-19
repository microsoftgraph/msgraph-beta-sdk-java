package com.microsoft.graph.compliance.ediscovery.cases.item;

import com.microsoft.graph.compliance.ediscovery.cases.item.close.CloseRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.custodians.CustodiansRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.custodians.item.CustodianItemRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.legalholds.item.LegalHoldItemRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.legalholds.LegalHoldsRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.noncustodialdatasources.item.NoncustodialDataSourceItemRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.noncustodialdatasources.NoncustodialDataSourcesRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.operations.item.CaseOperationItemRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.reopen.ReopenRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.reviewsets.item.ReviewSetItemRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.reviewsets.ReviewSetsRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.item.SourceCollectionItemRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.sourcecollections.SourceCollectionsRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.tags.item.TagItemRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.tags.TagsRequestBuilder;
import com.microsoft.graph.models.ediscovery.Case_escaped;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the cases property of the microsoft.graph.ediscovery.ediscoveryroot entity. */
public class CaseItemRequestBuilder {
    /** Provides operations to call the close method. */
    @javax.annotation.Nonnull
    public CloseRequestBuilder close() {
        return new CloseRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the custodians property of the microsoft.graph.ediscovery.case entity. */
    @javax.annotation.Nonnull
    public CustodiansRequestBuilder custodians() {
        return new CustodiansRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the legalHolds property of the microsoft.graph.ediscovery.case entity. */
    @javax.annotation.Nonnull
    public LegalHoldsRequestBuilder legalHolds() {
        return new LegalHoldsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the noncustodialDataSources property of the microsoft.graph.ediscovery.case entity. */
    @javax.annotation.Nonnull
    public NoncustodialDataSourcesRequestBuilder noncustodialDataSources() {
        return new NoncustodialDataSourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.ediscovery.case entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to call the reopen method. */
    @javax.annotation.Nonnull
    public ReopenRequestBuilder reopen() {
        return new ReopenRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the reviewSets property of the microsoft.graph.ediscovery.case entity. */
    @javax.annotation.Nonnull
    public ReviewSetsRequestBuilder reviewSets() {
        return new ReviewSetsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the settings property of the microsoft.graph.ediscovery.case entity. */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the sourceCollections property of the microsoft.graph.ediscovery.case entity. */
    @javax.annotation.Nonnull
    public SourceCollectionsRequestBuilder sourceCollections() {
        return new SourceCollectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tags property of the microsoft.graph.ediscovery.case entity. */
    @javax.annotation.Nonnull
    public TagsRequestBuilder tags() {
        return new TagsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new CaseItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CaseItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/compliance/ediscovery/cases/{case%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new CaseItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public CaseItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/compliance/ediscovery/cases/{case%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property cases for compliance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property cases for compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get cases from compliance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get cases from compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property cases in compliance
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Case_escaped body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property cases in compliance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Case_escaped body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the custodians property of the microsoft.graph.ediscovery.case entity.
     * @param id Unique identifier of the item
     * @return a CustodianItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustodianItemRequestBuilder custodians(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("custodian%2Did", id);
        return new CustodianItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property cases for compliance
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete navigation property cases for compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get cases from compliance
     * @return a CompletableFuture of case_escaped
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Case_escaped> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Case_escaped::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Case_escaped> executionException = new java.util.concurrent.CompletableFuture<Case_escaped>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get cases from compliance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of case_escaped
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Case_escaped> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Case_escaped::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Case_escaped> executionException = new java.util.concurrent.CompletableFuture<Case_escaped>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the legalHolds property of the microsoft.graph.ediscovery.case entity.
     * @param id Unique identifier of the item
     * @return a LegalHoldItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LegalHoldItemRequestBuilder legalHolds(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("legalHold%2Did", id);
        return new LegalHoldItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the noncustodialDataSources property of the microsoft.graph.ediscovery.case entity.
     * @param id Unique identifier of the item
     * @return a NoncustodialDataSourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public NoncustodialDataSourceItemRequestBuilder noncustodialDataSources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("noncustodialDataSource%2Did", id);
        return new NoncustodialDataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.ediscovery.case entity.
     * @param id Unique identifier of the item
     * @return a CaseOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CaseOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("caseOperation%2Did", id);
        return new CaseOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property cases in compliance
     * @param body 
     * @return a CompletableFuture of case_escaped
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Case_escaped> patch(@javax.annotation.Nonnull final Case_escaped body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Case_escaped::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Case_escaped> executionException = new java.util.concurrent.CompletableFuture<Case_escaped>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property cases in compliance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of case_escaped
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Case_escaped> patch(@javax.annotation.Nonnull final Case_escaped body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Case_escaped::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Case_escaped> executionException = new java.util.concurrent.CompletableFuture<Case_escaped>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the reviewSets property of the microsoft.graph.ediscovery.case entity.
     * @param id Unique identifier of the item
     * @return a ReviewSetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ReviewSetItemRequestBuilder reviewSets(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("reviewSet%2Did", id);
        return new ReviewSetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the sourceCollections property of the microsoft.graph.ediscovery.case entity.
     * @param id Unique identifier of the item
     * @return a SourceCollectionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SourceCollectionItemRequestBuilder sourceCollections(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sourceCollection%2Did", id);
        return new SourceCollectionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the tags property of the microsoft.graph.ediscovery.case entity.
     * @param id Unique identifier of the item
     * @return a TagItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TagItemRequestBuilder tags(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tag%2Did", id);
        return new TagItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /** Get cases from compliance */
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
