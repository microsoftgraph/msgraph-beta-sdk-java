package com.microsoft.graph.devicemanagement.templates.item.migratableto.item.categories.item.settingdefinitions;

import com.microsoft.graph.devicemanagement.templates.item.migratableto.item.categories.item.settingdefinitions.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.templates.item.migratableto.item.categories.item.settingdefinitions.item.DeviceManagementSettingDefinitionItemRequestBuilder;
import com.microsoft.graph.models.DeviceManagementSettingDefinition;
import com.microsoft.graph.models.DeviceManagementSettingDefinitionCollectionResponse;
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
 * Provides operations to manage the settingDefinitions property of the microsoft.graph.deviceManagementSettingCategory entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SettingDefinitionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settingDefinitions property of the microsoft.graph.deviceManagementSettingCategory entity.
     * @param deviceManagementSettingDefinitionId The unique identifier of deviceManagementSettingDefinition
     * @return a DeviceManagementSettingDefinitionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementSettingDefinitionItemRequestBuilder byDeviceManagementSettingDefinitionId(@jakarta.annotation.Nonnull final String deviceManagementSettingDefinitionId) {
        Objects.requireNonNull(deviceManagementSettingDefinitionId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementSettingDefinition%2Did", deviceManagementSettingDefinitionId);
        return new DeviceManagementSettingDefinitionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SettingDefinitionsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SettingDefinitionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/templates/{deviceManagementTemplate%2Did}/migratableTo/{deviceManagementTemplate%2Did1}/categories/{deviceManagementTemplateSettingCategory%2Did}/settingDefinitions{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SettingDefinitionsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SettingDefinitionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/templates/{deviceManagementTemplate%2Did}/migratableTo/{deviceManagementTemplate%2Did1}/categories/{deviceManagementTemplateSettingCategory%2Did}/settingDefinitions{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * The setting definitions this category contains
     * @return a CompletableFuture of DeviceManagementSettingDefinitionCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingDefinitionCollectionResponse> get() {
        return get(null);
    }
    /**
     * The setting definitions this category contains
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DeviceManagementSettingDefinitionCollectionResponse
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingDefinitionCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeviceManagementSettingDefinitionCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Create new navigation property to settingDefinitions for deviceManagement
     * @param body The request body
     * @return a CompletableFuture of DeviceManagementSettingDefinition
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingDefinition> post(@jakarta.annotation.Nonnull final DeviceManagementSettingDefinition body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to settingDefinitions for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of DeviceManagementSettingDefinition
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingDefinition> post(@jakarta.annotation.Nonnull final DeviceManagementSettingDefinition body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, DeviceManagementSettingDefinition::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * The setting definitions this category contains
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The setting definitions this category contains
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        return requestInfo;
    }
    /**
     * Create new navigation property to settingDefinitions for deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementSettingDefinition body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to settingDefinitions for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DeviceManagementSettingDefinition body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SettingDefinitionsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SettingDefinitionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SettingDefinitionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The setting definitions this category contains
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
