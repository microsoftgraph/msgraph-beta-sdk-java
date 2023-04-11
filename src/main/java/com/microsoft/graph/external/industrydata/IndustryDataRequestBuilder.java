package com.microsoft.graph.external.industrydata;

import com.microsoft.graph.external.industrydata.dataconnectors.DataConnectorsRequestBuilder;
import com.microsoft.graph.external.industrydata.dataconnectors.item.IndustryDataConnectorItemRequestBuilder;
import com.microsoft.graph.external.industrydata.inboundflows.InboundFlowsRequestBuilder;
import com.microsoft.graph.external.industrydata.inboundflows.item.InboundFlowItemRequestBuilder;
import com.microsoft.graph.external.industrydata.operations.item.LongRunningOperationItemRequestBuilder;
import com.microsoft.graph.external.industrydata.operations.OperationsRequestBuilder;
import com.microsoft.graph.external.industrydata.referencedefinitions.item.ReferenceDefinitionItemRequestBuilder;
import com.microsoft.graph.external.industrydata.referencedefinitions.ReferenceDefinitionsRequestBuilder;
import com.microsoft.graph.external.industrydata.rolegroups.item.RoleGroupItemRequestBuilder;
import com.microsoft.graph.external.industrydata.rolegroups.RoleGroupsRequestBuilder;
import com.microsoft.graph.external.industrydata.runs.item.IndustryDataRunItemRequestBuilder;
import com.microsoft.graph.external.industrydata.runs.RunsRequestBuilder;
import com.microsoft.graph.external.industrydata.sourcesystems.item.SourceSystemDefinitionItemRequestBuilder;
import com.microsoft.graph.external.industrydata.sourcesystems.SourceSystemsRequestBuilder;
import com.microsoft.graph.external.industrydata.years.item.YearTimePeriodDefinitionItemRequestBuilder;
import com.microsoft.graph.external.industrydata.years.YearsRequestBuilder;
import com.microsoft.graph.models.industrydata.IndustryDataRoot;
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
 * Provides operations to manage the industryData property of the microsoft.graph.externalConnectors.external entity.
 */
public class IndustryDataRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the dataConnectors property of the microsoft.graph.industryData.industryDataRoot entity. */
    @javax.annotation.Nonnull
    public DataConnectorsRequestBuilder dataConnectors() {
        return new DataConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the inboundFlows property of the microsoft.graph.industryData.industryDataRoot entity. */
    @javax.annotation.Nonnull
    public InboundFlowsRequestBuilder inboundFlows() {
        return new InboundFlowsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the operations property of the microsoft.graph.industryData.industryDataRoot entity. */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the referenceDefinitions property of the microsoft.graph.industryData.industryDataRoot entity. */
    @javax.annotation.Nonnull
    public ReferenceDefinitionsRequestBuilder referenceDefinitions() {
        return new ReferenceDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the roleGroups property of the microsoft.graph.industryData.industryDataRoot entity. */
    @javax.annotation.Nonnull
    public RoleGroupsRequestBuilder roleGroups() {
        return new RoleGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the runs property of the microsoft.graph.industryData.industryDataRoot entity. */
    @javax.annotation.Nonnull
    public RunsRequestBuilder runs() {
        return new RunsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the sourceSystems property of the microsoft.graph.industryData.industryDataRoot entity. */
    @javax.annotation.Nonnull
    public SourceSystemsRequestBuilder sourceSystems() {
        return new SourceSystemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the years property of the microsoft.graph.industryData.industryDataRoot entity. */
    @javax.annotation.Nonnull
    public YearsRequestBuilder years() {
        return new YearsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new IndustryDataRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IndustryDataRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/external/industryData{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new IndustryDataRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public IndustryDataRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/external/industryData{?%24select,%24expand}", rawUrl);
    }
    /**
     * Provides operations to manage the dataConnectors property of the microsoft.graph.industryData.industryDataRoot entity.
     * @param id Unique identifier of the item
     * @return a IndustryDataConnectorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IndustryDataConnectorItemRequestBuilder dataConnectors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("industryDataConnector%2Did", id);
        return new IndustryDataConnectorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get industryData from external
     * @return a CompletableFuture of industryDataRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IndustryDataRoot> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, IndustryDataRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<IndustryDataRoot> executionException = new java.util.concurrent.CompletableFuture<IndustryDataRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get industryData from external
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of industryDataRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<IndustryDataRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, IndustryDataRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<IndustryDataRoot> executionException = new java.util.concurrent.CompletableFuture<IndustryDataRoot>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the inboundFlows property of the microsoft.graph.industryData.industryDataRoot entity.
     * @param id Unique identifier of the item
     * @return a InboundFlowItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public InboundFlowItemRequestBuilder inboundFlows(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("inboundFlow%2Did", id);
        return new InboundFlowItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.industryData.industryDataRoot entity.
     * @param id Unique identifier of the item
     * @return a LongRunningOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LongRunningOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("longRunningOperation%2Did", id);
        return new LongRunningOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the referenceDefinitions property of the microsoft.graph.industryData.industryDataRoot entity.
     * @param id Unique identifier of the item
     * @return a ReferenceDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ReferenceDefinitionItemRequestBuilder referenceDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("referenceDefinition%2Did", id);
        return new ReferenceDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the roleGroups property of the microsoft.graph.industryData.industryDataRoot entity.
     * @param id Unique identifier of the item
     * @return a RoleGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RoleGroupItemRequestBuilder roleGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("roleGroup%2Did", id);
        return new RoleGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the runs property of the microsoft.graph.industryData.industryDataRoot entity.
     * @param id Unique identifier of the item
     * @return a IndustryDataRunItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public IndustryDataRunItemRequestBuilder runs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("industryDataRun%2Did", id);
        return new IndustryDataRunItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the sourceSystems property of the microsoft.graph.industryData.industryDataRoot entity.
     * @param id Unique identifier of the item
     * @return a SourceSystemDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SourceSystemDefinitionItemRequestBuilder sourceSystems(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sourceSystemDefinition%2Did", id);
        return new SourceSystemDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get industryData from external
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get industryData from external
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
     * Provides operations to manage the years property of the microsoft.graph.industryData.industryDataRoot entity.
     * @param id Unique identifier of the item
     * @return a YearTimePeriodDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public YearTimePeriodDefinitionItemRequestBuilder years(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("yearTimePeriodDefinition%2Did", id);
        return new YearTimePeriodDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get industryData from external
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
}
