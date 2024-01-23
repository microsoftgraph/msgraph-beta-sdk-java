package com.microsoft.graph.beta.onpremisespublishingprofiles.item.connectorgroups.item;

import com.microsoft.graph.beta.models.ConnectorGroup;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.connectorgroups.item.applications.ApplicationsRequestBuilder;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.connectorgroups.item.applicationswithappid.ApplicationsWithAppIdRequestBuilder;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.connectorgroups.item.applicationswithuniquename.ApplicationsWithUniqueNameRequestBuilder;
import com.microsoft.graph.beta.onpremisespublishingprofiles.item.connectorgroups.item.members.MembersRequestBuilder;
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
 * Provides operations to manage the connectorGroups property of the microsoft.graph.onPremisesPublishingProfile entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConnectorGroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the applications property of the microsoft.graph.connectorGroup entity.
     */
    @jakarta.annotation.Nonnull
    public ApplicationsRequestBuilder applications() {
        return new ApplicationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.connectorGroup entity.
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the applications property of the microsoft.graph.connectorGroup entity.
     * @param appId Alternate key of application
     * @return a ApplicationsWithAppIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithAppIdRequestBuilder applicationsWithAppId(@jakarta.annotation.Nonnull final String appId) {
        Objects.requireNonNull(appId);
        return new ApplicationsWithAppIdRequestBuilder(pathParameters, requestAdapter, appId);
    }
    /**
     * Provides operations to manage the applications property of the microsoft.graph.connectorGroup entity.
     * @param uniqueName Alternate key of application
     * @return a ApplicationsWithUniqueNameRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApplicationsWithUniqueNameRequestBuilder applicationsWithUniqueName(@jakarta.annotation.Nonnull final String uniqueName) {
        Objects.requireNonNull(uniqueName);
        return new ApplicationsWithUniqueNameRequestBuilder(pathParameters, requestAdapter, uniqueName);
    }
    /**
     * Instantiates a new ConnectorGroupItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConnectorGroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}/connectorGroups/{connectorGroup%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new ConnectorGroupItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConnectorGroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/onPremisesPublishingProfiles/{onPremisesPublishingProfile%2Did}/connectorGroups/{connectorGroup%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete a connectorGroup. All connectors and applications must be removed from the connector group before a connector group can be deleted.
     * @see <a href="https://learn.microsoft.com/graph/api/connectorgroup-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete a connectorGroup. All connectors and applications must be removed from the connector group before a connector group can be deleted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/connectorgroup-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties of a connectorGroup.
     * @return a ConnectorGroup
     * @see <a href="https://learn.microsoft.com/graph/api/connectorgroup-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ConnectorGroup get() {
        return get(null);
    }
    /**
     * Retrieve the properties of a connectorGroup.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ConnectorGroup
     * @see <a href="https://learn.microsoft.com/graph/api/connectorgroup-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ConnectorGroup get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ConnectorGroup::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of a connectorGroup object.
     * @param body The request body
     * @return a ConnectorGroup
     * @see <a href="https://learn.microsoft.com/graph/api/connectorgroup-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ConnectorGroup patch(@jakarta.annotation.Nonnull final ConnectorGroup body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a connectorGroup object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ConnectorGroup
     * @see <a href="https://learn.microsoft.com/graph/api/connectorgroup-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ConnectorGroup patch(@jakarta.annotation.Nonnull final ConnectorGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ConnectorGroup::createFromDiscriminatorValue);
    }
    /**
     * Delete a connectorGroup. All connectors and applications must be removed from the connector group before a connector group can be deleted.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete a connectorGroup. All connectors and applications must be removed from the connector group before a connector group can be deleted.
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
     * Retrieve the properties of a connectorGroup.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties of a connectorGroup.
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
     * Update the properties of a connectorGroup object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ConnectorGroup body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a connectorGroup object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final ConnectorGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a ConnectorGroupItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ConnectorGroupItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConnectorGroupItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties of a connectorGroup.
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
         * @return a Map<String, Object>
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
