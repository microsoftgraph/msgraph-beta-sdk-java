package com.microsoft.graph.identitygovernance.lifecycleworkflows;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.customtaskextensions.CustomTaskExtensionsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.customtaskextensions.item.CustomTaskExtensionItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.DeletedItemsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.settings.SettingsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.taskdefinitions.item.TaskDefinitionItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.taskdefinitions.TaskDefinitionsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.WorkflowItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.WorkflowsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflowtemplates.item.WorkflowTemplateItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflowtemplates.WorkflowTemplatesRequestBuilder;
import com.microsoft.graph.models.identitygovernance.LifecycleWorkflowsContainer;
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
/** Provides operations to manage the lifecycleWorkflows property of the microsoft.graph.identityGovernance entity. */
public class LifecycleWorkflowsRequestBuilder {
    /** The customTaskExtensions property */
    @javax.annotation.Nonnull
    public CustomTaskExtensionsRequestBuilder customTaskExtensions() {
        return new CustomTaskExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deletedItems property */
    @javax.annotation.Nonnull
    public DeletedItemsRequestBuilder deletedItems() {
        return new DeletedItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The settings property */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The taskDefinitions property */
    @javax.annotation.Nonnull
    public TaskDefinitionsRequestBuilder taskDefinitions() {
        return new TaskDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** The workflows property */
    @javax.annotation.Nonnull
    public WorkflowsRequestBuilder workflows() {
        return new WorkflowsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The workflowTemplates property */
    @javax.annotation.Nonnull
    public WorkflowTemplatesRequestBuilder workflowTemplates() {
        return new WorkflowTemplatesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new LifecycleWorkflowsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/identityGovernance/lifecycleWorkflows{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new LifecycleWorkflowsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public LifecycleWorkflowsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/identityGovernance/lifecycleWorkflows{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<LifecycleWorkflowsRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final LifecycleWorkflowsRequestBuilderDeleteRequestConfiguration requestConfig = new LifecycleWorkflowsRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<LifecycleWorkflowsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final LifecycleWorkflowsRequestBuilderGetRequestConfiguration requestConfig = new LifecycleWorkflowsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final LifecycleWorkflowsContainer body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final LifecycleWorkflowsContainer body, @javax.annotation.Nullable final java.util.function.Consumer<LifecycleWorkflowsRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final LifecycleWorkflowsRequestBuilderPatchRequestConfiguration requestConfig = new LifecycleWorkflowsRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identityGovernance.lifecycleWorkflows.customTaskExtensions.item collection
     * @param id Unique identifier of the item
     * @return a CustomTaskExtensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CustomTaskExtensionItemRequestBuilder customTaskExtensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("customTaskExtension%2Did", id);
        return new CustomTaskExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property lifecycleWorkflows for identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<LifecycleWorkflowsRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
     * @return a CompletableFuture of lifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, LifecycleWorkflowsContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get lifecycleWorkflows from identityGovernance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of lifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> get(@javax.annotation.Nullable final java.util.function.Consumer<LifecycleWorkflowsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, LifecycleWorkflowsContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body 
     * @return a CompletableFuture of lifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> patch(@javax.annotation.Nonnull final LifecycleWorkflowsContainer body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, LifecycleWorkflowsContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property lifecycleWorkflows in identityGovernance
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of lifecycleWorkflowsContainer
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer> patch(@javax.annotation.Nonnull final LifecycleWorkflowsContainer body, @javax.annotation.Nullable final java.util.function.Consumer<LifecycleWorkflowsRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, LifecycleWorkflowsContainer::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<LifecycleWorkflowsContainer>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identityGovernance.lifecycleWorkflows.taskDefinitions.item collection
     * @param id Unique identifier of the item
     * @return a TaskDefinitionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TaskDefinitionItemRequestBuilder taskDefinitions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("taskDefinition%2Did", id);
        return new TaskDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identityGovernance.lifecycleWorkflows.workflows.item collection
     * @param id Unique identifier of the item
     * @return a WorkflowItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkflowItemRequestBuilder workflows(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workflow%2Did", id);
        return new WorkflowItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.identityGovernance.lifecycleWorkflows.workflowTemplates.item collection
     * @param id Unique identifier of the item
     * @return a WorkflowTemplateItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public WorkflowTemplateItemRequestBuilder workflowTemplates(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("workflowTemplate%2Did", id);
        return new WorkflowTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class LifecycleWorkflowsRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new lifecycleWorkflowsRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public LifecycleWorkflowsRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get lifecycleWorkflows from identityGovernance */
    public class LifecycleWorkflowsRequestBuilderGetQueryParameters {
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
    public class LifecycleWorkflowsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public LifecycleWorkflowsRequestBuilderGetQueryParameters queryParameters = new LifecycleWorkflowsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new lifecycleWorkflowsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public LifecycleWorkflowsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class LifecycleWorkflowsRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new lifecycleWorkflowsRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public LifecycleWorkflowsRequestBuilderPatchRequestConfiguration() {
        }
    }
}
