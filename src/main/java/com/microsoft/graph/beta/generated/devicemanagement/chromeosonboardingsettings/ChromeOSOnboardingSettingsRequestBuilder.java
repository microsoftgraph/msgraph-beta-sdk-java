package com.microsoft.graph.beta.devicemanagement.chromeosonboardingsettings;

import com.microsoft.graph.beta.devicemanagement.chromeosonboardingsettings.connect.ConnectRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.chromeosonboardingsettings.count.CountRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.chromeosonboardingsettings.disconnect.DisconnectRequestBuilder;
import com.microsoft.graph.beta.devicemanagement.chromeosonboardingsettings.item.ChromeOSOnboardingSettingsItemRequestBuilder;
import com.microsoft.graph.beta.models.ChromeOSOnboardingSettings;
import com.microsoft.graph.beta.models.ChromeOSOnboardingSettingsCollectionResponse;
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
 * Provides operations to manage the chromeOSOnboardingSettings property of the microsoft.graph.deviceManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChromeOSOnboardingSettingsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the connect method.
     */
    @jakarta.annotation.Nonnull
    public ConnectRequestBuilder connect() {
        return new ConnectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the disconnect method.
     */
    @jakarta.annotation.Nonnull
    public DisconnectRequestBuilder disconnect() {
        return new DisconnectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the chromeOSOnboardingSettings property of the microsoft.graph.deviceManagement entity.
     * @param chromeOSOnboardingSettingsId The unique identifier of chromeOSOnboardingSettings
     * @return a ChromeOSOnboardingSettingsItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ChromeOSOnboardingSettingsItemRequestBuilder byChromeOSOnboardingSettingsId(@jakarta.annotation.Nonnull final String chromeOSOnboardingSettingsId) {
        Objects.requireNonNull(chromeOSOnboardingSettingsId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("chromeOSOnboardingSettings%2Did", chromeOSOnboardingSettingsId);
        return new ChromeOSOnboardingSettingsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ChromeOSOnboardingSettingsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChromeOSOnboardingSettingsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/chromeOSOnboardingSettings{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new ChromeOSOnboardingSettingsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChromeOSOnboardingSettingsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/chromeOSOnboardingSettings{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Collection of ChromeOSOnboardingSettings settings associated with account.
     * @return a ChromeOSOnboardingSettingsCollectionResponse
     */
    @jakarta.annotation.Nullable
    public ChromeOSOnboardingSettingsCollectionResponse get() {
        return get(null);
    }
    /**
     * Collection of ChromeOSOnboardingSettings settings associated with account.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ChromeOSOnboardingSettingsCollectionResponse
     */
    @jakarta.annotation.Nullable
    public ChromeOSOnboardingSettingsCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ChromeOSOnboardingSettingsCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to chromeOSOnboardingSettings for deviceManagement
     * @param body The request body
     * @return a ChromeOSOnboardingSettings
     */
    @jakarta.annotation.Nullable
    public ChromeOSOnboardingSettings post(@jakarta.annotation.Nonnull final ChromeOSOnboardingSettings body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to chromeOSOnboardingSettings for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ChromeOSOnboardingSettings
     */
    @jakarta.annotation.Nullable
    public ChromeOSOnboardingSettings post(@jakarta.annotation.Nonnull final ChromeOSOnboardingSettings body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ChromeOSOnboardingSettings::createFromDiscriminatorValue);
    }
    /**
     * Collection of ChromeOSOnboardingSettings settings associated with account.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Collection of ChromeOSOnboardingSettings settings associated with account.
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
     * Create new navigation property to chromeOSOnboardingSettings for deviceManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ChromeOSOnboardingSettings body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to chromeOSOnboardingSettings for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ChromeOSOnboardingSettings body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ChromeOSOnboardingSettingsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ChromeOSOnboardingSettingsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ChromeOSOnboardingSettingsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Collection of ChromeOSOnboardingSettings settings associated with account.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
