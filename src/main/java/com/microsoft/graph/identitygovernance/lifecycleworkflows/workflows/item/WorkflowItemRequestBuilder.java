package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.executionscope.ExecutionScopeRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.executionscope.item.UserItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.identitygovernanceactivate.IdentityGovernanceActivateRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.identitygovernancecreatenewversion.IdentityGovernanceCreateNewVersionRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.identitygovernancerestore.IdentityGovernanceRestoreRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.runs.item.RunItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.runs.RunsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.taskreports.item.TaskReportItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.taskreports.TaskReportsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.item.UserProcessingResultItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.UserProcessingResultsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.item.WorkflowVersionVersionNumberItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.VersionsRequestBuilder;
import com.microsoft.graph.models.identitygovernance.Workflow;
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
 * Provides operations to manage the workflows property of the microsoft.graph.identityGovernance.lifecycleWorkflowsContainer entity.
 */
public class WorkflowItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the executionScope property of the microsoft.graph.identityGovernance.workflow entity. */
    @javax.annotation.Nonnull
    public ExecutionScopeRequestBuilder executionScope() {
        return new ExecutionScopeRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the activate method. */
    @javax.annotation.Nonnull
    public IdentityGovernanceActivateRequestBuilder identityGovernanceActivate() {
        return new IdentityGovernanceActivateRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the createNewVersion method. */
    @javax.annotation.Nonnull
    public IdentityGovernanceCreateNewVersionRequestBuilder identityGovernanceCreateNewVersion() {
        return new IdentityGovernanceCreateNewVersionRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the restore method. */
    @javax.annotation.Nonnull
    public IdentityGovernanceRestoreRequestBuilder identityGovernanceRestore() {
        return new IdentityGovernanceRestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the runs property of the microsoft.graph.identityGovernance.workflow entity. */
    @javax.annotation.Nonnull
    public RunsRequestBuilder runs() {
        return new RunsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the taskReports property of the microsoft.graph.identityGovernance.workflow entity. */
    @javax.annotation.Nonnull
    public TaskReportsRequestBuilder taskReports() {
        return new TaskReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the userProcessingResults property of the microsoft.graph.identityGovernance.workflow entity. */
    @javax.annotation.Nonnull
    public UserProcessingResultsRequestBuilder userProcessingResults() {
        return new UserProcessingResultsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the versions property of the microsoft.graph.identityGovernance.workflow entity. */
    @javax.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WorkflowItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkflowItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WorkflowItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkflowItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property workflows for identityGovernance
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
     * Delete navigation property workflows for identityGovernance
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
     * Provides operations to manage the executionScope property of the microsoft.graph.identityGovernance.workflow entity.
     * @param id Unique identifier of the item
     * @return a UserItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserItemRequestBuilder executionScope(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("user%2Did", id);
        return new UserItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * The workflows in the lifecycle workflows instance.
     * @return a CompletableFuture of workflow
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workflow> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Workflow::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Workflow> executionException = new java.util.concurrent.CompletableFuture<Workflow>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * The workflows in the lifecycle workflows instance.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workflow
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workflow> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Workflow::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Workflow> executionException = new java.util.concurrent.CompletableFuture<Workflow>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property workflows in identityGovernance
     * @param body The request body
     * @return a CompletableFuture of workflow
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workflow> patch(@javax.annotation.Nonnull final Workflow body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Workflow::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Workflow> executionException = new java.util.concurrent.CompletableFuture<Workflow>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the navigation property workflows in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of workflow
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Workflow> patch(@javax.annotation.Nonnull final Workflow body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Workflow::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Workflow> executionException = new java.util.concurrent.CompletableFuture<Workflow>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the runs property of the microsoft.graph.identityGovernance.workflow entity.
     * @param id Unique identifier of the item
     * @return a RunItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public RunItemRequestBuilder runs(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("run%2Did", id);
        return new RunItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the taskReports property of the microsoft.graph.identityGovernance.workflow entity.
     * @param id Unique identifier of the item
     * @return a TaskReportItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TaskReportItemRequestBuilder taskReports(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("taskReport%2Did", id);
        return new TaskReportItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property workflows for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property workflows for identityGovernance
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
     * The workflows in the lifecycle workflows instance.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * The workflows in the lifecycle workflows instance.
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
     * Update the navigation property workflows in identityGovernance
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Workflow body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property workflows in identityGovernance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final Workflow body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Provides operations to manage the userProcessingResults property of the microsoft.graph.identityGovernance.workflow entity.
     * @param id Unique identifier of the item
     * @return a UserProcessingResultItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserProcessingResultItemRequestBuilder userProcessingResults(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userProcessingResult%2Did", id);
        return new UserProcessingResultItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the versions property of the microsoft.graph.identityGovernance.workflow entity.
     * @param id Unique identifier of the item
     * @return a WorkflowVersionVersionNumberItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkflowVersionVersionNumberItemRequestBuilder versions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workflowVersion%2DversionNumber", id);
        return new WorkflowVersionVersionNumberItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The workflows in the lifecycle workflows instance.
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
