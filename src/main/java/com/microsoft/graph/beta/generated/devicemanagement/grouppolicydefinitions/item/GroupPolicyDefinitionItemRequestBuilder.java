package com.microsoft.graph.beta.devicemanagement.grouppolicydefinitions.item;

import com.microsoft.graph.beta.devicemanagement.grouppolicydefinitions.item.category.CategoryRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.grouppolicydefinitions.item.definitionfile.DefinitionFileRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.grouppolicydefinitions.item.nextversiondefinition.NextVersionDefinitionRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.grouppolicydefinitions.item.presentations.PresentationsRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.grouppolicydefinitions.item.previousversiondefinition.PreviousVersionDefinitionRequestBuilder;
import com.microsoft.graph.beta.models.GroupPolicyDefinition;
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
 * Provides operations to manage the groupPolicyDefinitions property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyDefinitionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the category property of the microsoft.graph.groupPolicyDefinition entity.
     * @return a {@link CategoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CategoryRequestBuilder category() {
        return new CategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the definitionFile property of the microsoft.graph.groupPolicyDefinition entity.
     * @return a {@link DefinitionFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DefinitionFileRequestBuilder definitionFile() {
        return new DefinitionFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the nextVersionDefinition property of the microsoft.graph.groupPolicyDefinition entity.
     * @return a {@link NextVersionDefinitionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public NextVersionDefinitionRequestBuilder nextVersionDefinition() {
        return new NextVersionDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the presentations property of the microsoft.graph.groupPolicyDefinition entity.
     * @return a {@link PresentationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PresentationsRequestBuilder presentations() {
        return new PresentationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the previousVersionDefinition property of the microsoft.graph.groupPolicyDefinition entity.
     * @return a {@link PreviousVersionDefinitionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PreviousVersionDefinitionRequestBuilder previousVersionDefinition() {
        return new PreviousVersionDefinitionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GroupPolicyDefinitionItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupPolicyDefinitionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/groupPolicyDefinitions/{groupPolicyDefinition%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link GroupPolicyDefinitionItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupPolicyDefinitionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/groupPolicyDefinitions/{groupPolicyDefinition%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property groupPolicyDefinitions for deviceManagement
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property groupPolicyDefinitions for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * The available group policy definitions for this account.
     * @return a {@link GroupPolicyDefinition}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition get() {
        return get(null);
    }
    /**
     * The available group policy definitions for this account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GroupPolicyDefinition}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GroupPolicyDefinition::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property groupPolicyDefinitions in deviceManagement
     * @param body The request body
     * @return a {@link GroupPolicyDefinition}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition patch(@jakarta.annotation.Nonnull final GroupPolicyDefinition body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property groupPolicyDefinitions in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GroupPolicyDefinition}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public GroupPolicyDefinition patch(@jakarta.annotation.Nonnull final GroupPolicyDefinition body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GroupPolicyDefinition::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property groupPolicyDefinitions for deviceManagement
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property groupPolicyDefinitions for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * The available group policy definitions for this account.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The available group policy definitions for this account.
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
     * Update the navigation property groupPolicyDefinitions in deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final GroupPolicyDefinition body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property groupPolicyDefinitions in deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final GroupPolicyDefinition body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link GroupPolicyDefinitionItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupPolicyDefinitionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GroupPolicyDefinitionItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * The available group policy definitions for this account.
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
