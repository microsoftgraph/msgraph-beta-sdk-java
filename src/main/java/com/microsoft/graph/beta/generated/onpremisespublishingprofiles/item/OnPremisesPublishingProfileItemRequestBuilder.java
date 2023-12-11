package com.microsoft.graph.beta.onpremisespublishingprofiles.item;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.OnPremisesPublishingProfile;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.agentgroups.AgentGroupsRequestBuilder;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.agents.AgentsRequestBuilder;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.connectorgroups.ConnectorGroupsRequestBuilder;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.connectors.ConnectorsRequestBuilder;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.publishedresources.PublishedResourcesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the collection of onPremisesPublishingProfile entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesPublishingProfileItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the agentGroups property of the microsoft.graph.onPremisesPublishingProfile entity.
     */
    @jakarta.annotation.Nonnull
    public AgentGroupsRequestBuilder agentGroups() {
        return new AgentGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the agents property of the microsoft.graph.onPremisesPublishingProfile entity.
     */
    @jakarta.annotation.Nonnull
    public AgentsRequestBuilder agents() {
        return new AgentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the connectorGroups property of the microsoft.graph.onPremisesPublishingProfile entity.
     */
    @jakarta.annotation.Nonnull
    public ConnectorGroupsRequestBuilder connectorGroups() {
        return new ConnectorGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the connectors property of the microsoft.graph.onPremisesPublishingProfile entity.
     */
    @jakarta.annotation.Nonnull
    public ConnectorsRequestBuilder connectors() {
        return new ConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the publishedResources property of the microsoft.graph.onPremisesPublishingProfile entity.
     */
    @jakarta.annotation.Nonnull
    public PublishedResourcesRequestBuilder publishedResources() {
        return new PublishedResourcesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OnPremisesPublishingProfileItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnPremisesPublishingProfileItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OnPremisesPublishingProfileItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OnPremisesPublishingProfileItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete entity from onPremisesPublishingProfiles
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete entity from onPremisesPublishingProfiles
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
     * @return a OnPremisesPublishingProfile
     */
    @jakarta.annotation.Nullable
    public OnPremisesPublishingProfile get() {
        return get(null);
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OnPremisesPublishingProfile
     */
    @jakarta.annotation.Nullable
    public OnPremisesPublishingProfile get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnPremisesPublishingProfile::createFromDiscriminatorValue);
    }
    /**
     * Update entity in onPremisesPublishingProfiles
     * @param body The request body
     * @return a OnPremisesPublishingProfile
     */
    @jakarta.annotation.Nullable
    public OnPremisesPublishingProfile patch(@jakarta.annotation.Nonnull final OnPremisesPublishingProfile body) {
        return patch(body, null);
    }
    /**
     * Update entity in onPremisesPublishingProfiles
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OnPremisesPublishingProfile
     */
    @jakarta.annotation.Nullable
    public OnPremisesPublishingProfile patch(@jakarta.annotation.Nonnull final OnPremisesPublishingProfile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnPremisesPublishingProfile::createFromDiscriminatorValue);
    }
    /**
     * Delete entity from onPremisesPublishingProfiles
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from onPremisesPublishingProfiles
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update entity in onPremisesPublishingProfiles
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnPremisesPublishingProfile body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in onPremisesPublishingProfiles
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final OnPremisesPublishingProfile body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a OnPremisesPublishingProfileItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OnPremisesPublishingProfileItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new OnPremisesPublishingProfileItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get entity from onPremisesPublishingProfiles by key
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
