package com.microsoft.graph.onpremisespublishingprofiles.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OnPremisesPublishingProfile;
import com.microsoft.graph.onpremisespublishingprofiles.item.agentgroups.AgentGroupsRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.agentgroups.item.OnPremisesAgentGroupItemRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.agents.AgentsRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.agents.item.OnPremisesAgentItemRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.connectorgroups.ConnectorGroupsRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.connectorgroups.item.ConnectorGroupItemRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.connectors.ConnectorsRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.connectors.item.ConnectorItemRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.publishedresources.item.PublishedResourceItemRequestBuilder;
import com.microsoft.graph.onpremisespublishingprofiles.item.publishedresources.PublishedResourcesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of onPremisesPublishingProfile entities.
 */
public class OnPremisesPublishingProfileItemRequestBuilder extends BaseRequestBuilder {
    /** Provides operations to manage the agentGroups property of the microsoft.graph.onPremisesPublishingProfile entity. */
    @javax.annotation.Nonnull
    public AgentGroupsRequestBuilder agentGroups() {
        return new AgentGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the agents property of the microsoft.graph.onPremisesPublishingProfile entity. */
    @javax.annotation.Nonnull
    public AgentsRequestBuilder agents() {
        return new AgentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the connectorGroups property of the microsoft.graph.onPremisesPublishingProfile entity. */
    @javax.annotation.Nonnull
    public ConnectorGroupsRequestBuilder connectorGroups() {
        return new ConnectorGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the connectors property of the microsoft.graph.onPremisesPublishingProfile entity. */
    @javax.annotation.Nonnull
    public ConnectorsRequestBuilder connectors() {
        return new ConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the publishedResources property of the microsoft.graph.onPremisesPublishingProfile entity. */
    @javax.annotation.Nonnull
    public PublishedResourcesRequestBuilder publishedResources() {
        return new PublishedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the agentGroups property of the microsoft.graph.onPremisesPublishingProfile entity.
     * @param id Unique identifier of the item
     * @return a OnPremisesAgentGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OnPremisesAgentGroupItemRequestBuilder agentGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("onPremisesAgentGroup%2Did", id);
        return new OnPremisesAgentGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the agents property of the microsoft.graph.onPremisesPublishingProfile entity.
     * @param id Unique identifier of the item
     * @return a OnPremisesAgentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OnPremisesAgentItemRequestBuilder agents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("onPremisesAgent%2Did", id);
        return new OnPremisesAgentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the connectorGroups property of the microsoft.graph.onPremisesPublishingProfile entity.
     * @param id Unique identifier of the item
     * @return a ConnectorGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConnectorGroupItemRequestBuilder connectorGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connectorGroup%2Did", id);
        return new ConnectorGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the connectors property of the microsoft.graph.onPremisesPublishingProfile entity.
     * @param id Unique identifier of the item
     * @return a ConnectorItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConnectorItemRequestBuilder connectors(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connector%2Did", id);
        return new ConnectorItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new OnPremisesPublishingProfileItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesPublishingProfileItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OnPremisesPublishingProfileItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesPublishingProfileItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete entity from onPremisesPublishingProfiles
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete entity from onPremisesPublishingProfiles
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of InputStream
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, InputStream.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<InputStream> executionException = new java.util.concurrent.CompletableFuture<InputStream>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
     * @return a CompletableFuture of onPremisesPublishingProfile
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OnPremisesPublishingProfile::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile> executionException = new java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of onPremisesPublishingProfile
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OnPremisesPublishingProfile::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile> executionException = new java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update entity in onPremisesPublishingProfiles
     * @param body The request body
     * @return a CompletableFuture of onPremisesPublishingProfile
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile> patch(@javax.annotation.Nonnull final OnPremisesPublishingProfile body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OnPremisesPublishingProfile::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile> executionException = new java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update entity in onPremisesPublishingProfiles
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of onPremisesPublishingProfile
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile> patch(@javax.annotation.Nonnull final OnPremisesPublishingProfile body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OnPremisesPublishingProfile::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile> executionException = new java.util.concurrent.CompletableFuture<OnPremisesPublishingProfile>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the publishedResources property of the microsoft.graph.onPremisesPublishingProfile entity.
     * @param id Unique identifier of the item
     * @return a PublishedResourceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PublishedResourceItemRequestBuilder publishedResources(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("publishedResource%2Did", id);
        return new PublishedResourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete entity from onPremisesPublishingProfiles
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from onPremisesPublishingProfiles
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
     * Get entity from onPremisesPublishingProfiles by key
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
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
     * Update entity in onPremisesPublishingProfiles
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OnPremisesPublishingProfile body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in onPremisesPublishingProfiles
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OnPremisesPublishingProfile body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
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
