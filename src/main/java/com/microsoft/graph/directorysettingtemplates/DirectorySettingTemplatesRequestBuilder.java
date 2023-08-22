package com.microsoft.graph.directorysettingtemplates;

import com.microsoft.graph.directorysettingtemplates.count.CountRequestBuilder;
import com.microsoft.graph.directorysettingtemplates.delta.DeltaRequestBuilder;
import com.microsoft.graph.directorysettingtemplates.getbyids.GetByIdsRequestBuilder;
import com.microsoft.graph.directorysettingtemplates.getuserownedobjects.GetUserOwnedObjectsRequestBuilder;
import com.microsoft.graph.directorysettingtemplates.item.DirectorySettingTemplateItemRequestBuilder;
import com.microsoft.graph.directorysettingtemplates.validateproperties.ValidatePropertiesRequestBuilder;
import com.microsoft.graph.models.DirectorySettingTemplate;
import com.microsoft.graph.models.DirectorySettingTemplateCollectionResponse;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of directorySettingTemplate entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectorySettingTemplatesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getByIds method.
     */
    @jakarta.annotation.Nonnull
    public GetByIdsRequestBuilder getByIds() {
        return new GetByIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getUserOwnedObjects method.
     */
    @jakarta.annotation.Nonnull
    public GetUserOwnedObjectsRequestBuilder getUserOwnedObjects() {
        return new GetUserOwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validateProperties method.
     */
    @jakarta.annotation.Nonnull
    public ValidatePropertiesRequestBuilder validateProperties() {
        return new ValidatePropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directorySettingTemplate entities.
     * @param directorySettingTemplateId The unique identifier of directorySettingTemplate
     * @return a DirectorySettingTemplateItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DirectorySettingTemplateItemRequestBuilder byDirectorySettingTemplateId(@jakarta.annotation.Nonnull final String directorySettingTemplateId) {
        Objects.requireNonNull(directorySettingTemplateId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directorySettingTemplate%2Did", directorySettingTemplateId);
        return new DirectorySettingTemplateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DirectorySettingTemplatesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectorySettingTemplatesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directorySettingTemplates{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DirectorySettingTemplatesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectorySettingTemplatesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directorySettingTemplates{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Directory setting templates represents a set of templates of directory settings, from which directory settings may be created and used within a tenant.  This operation retrieves the list of available directorySettingTemplates objects.
     * @return a CompletableFuture of directorySettingTemplateCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/directorysettingtemplate-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DirectorySettingTemplateCollectionResponse> get() {
        return get(null);
    }
    /**
     * Directory setting templates represents a set of templates of directory settings, from which directory settings may be created and used within a tenant.  This operation retrieves the list of available directorySettingTemplates objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directorySettingTemplateCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/directorysettingtemplate-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DirectorySettingTemplateCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DirectorySettingTemplateCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Add new entity to directorySettingTemplates
     * @param body The request body
     * @return a CompletableFuture of directorySettingTemplate
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DirectorySettingTemplate> post(@jakarta.annotation.Nonnull final DirectorySettingTemplate body) {
        return post(body, null);
    }
    /**
     * Add new entity to directorySettingTemplates
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directorySettingTemplate
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DirectorySettingTemplate> post(@jakarta.annotation.Nonnull final DirectorySettingTemplate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DirectorySettingTemplate::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Directory setting templates represents a set of templates of directory settings, from which directory settings may be created and used within a tenant.  This operation retrieves the list of available directorySettingTemplates objects.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Directory setting templates represents a set of templates of directory settings, from which directory settings may be created and used within a tenant.  This operation retrieves the list of available directorySettingTemplates objects.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
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
     * Add new entity to directorySettingTemplates
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DirectorySettingTemplate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add new entity to directorySettingTemplates
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DirectorySettingTemplate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Directory setting templates represents a set of templates of directory settings, from which directory settings may be created and used within a tenant.  This operation retrieves the list of available directorySettingTemplates objects.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
