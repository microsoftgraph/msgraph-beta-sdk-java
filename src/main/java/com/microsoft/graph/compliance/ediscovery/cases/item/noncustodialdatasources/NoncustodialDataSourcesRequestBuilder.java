package com.microsoft.graph.compliance.ediscovery.cases.item.noncustodialdatasources;

import com.microsoft.graph.compliance.ediscovery.cases.item.noncustodialdatasources.count.CountRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.noncustodialdatasources.item.NoncustodialDataSourceItemRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.noncustodialdatasources.microsoftgraphediscoveryapplyhold.MicrosoftGraphEdiscoveryApplyHoldRequestBuilder;
import com.microsoft.graph.compliance.ediscovery.cases.item.noncustodialdatasources.microsoftgraphediscoveryremovehold.MicrosoftGraphEdiscoveryRemoveHoldRequestBuilder;
import com.microsoft.graph.models.ediscovery.NoncustodialDataSource;
import com.microsoft.graph.models.ediscovery.NoncustodialDataSourceCollectionResponse;
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
 * Provides operations to manage the noncustodialDataSources property of the microsoft.graph.ediscovery.case entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NoncustodialDataSourcesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyHold method.
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryApplyHoldRequestBuilder microsoftGraphEdiscoveryApplyHold() {
        return new MicrosoftGraphEdiscoveryApplyHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeHold method.
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @Deprecated
    @jakarta.annotation.Nonnull
    public MicrosoftGraphEdiscoveryRemoveHoldRequestBuilder microsoftGraphEdiscoveryRemoveHold() {
        return new MicrosoftGraphEdiscoveryRemoveHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the noncustodialDataSources property of the microsoft.graph.ediscovery.case entity.
     * @param noncustodialDataSourceId The unique identifier of noncustodialDataSource
     * @return a NoncustodialDataSourceItemRequestBuilder
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public NoncustodialDataSourceItemRequestBuilder byNoncustodialDataSourceId(@jakarta.annotation.Nonnull final String noncustodialDataSourceId) {
        Objects.requireNonNull(noncustodialDataSourceId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("noncustodialDataSource%2Did", noncustodialDataSourceId);
        return new NoncustodialDataSourceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new NoncustodialDataSourcesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NoncustodialDataSourcesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/noncustodialDataSources{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new NoncustodialDataSourcesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NoncustodialDataSourcesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compliance/ediscovery/cases/{case%2Did}/noncustodialDataSources{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get a list of the noncustodialDataSource objects and their properties.
     * @return a NoncustodialDataSourceCollectionResponse
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-noncustodialdatasource-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public NoncustodialDataSourceCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of the noncustodialDataSource objects and their properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a NoncustodialDataSourceCollectionResponse
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-noncustodialdatasource-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public NoncustodialDataSourceCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NoncustodialDataSourceCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new noncustodialDataSource object.
     * @param body The request body
     * @return a NoncustodialDataSource
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-noncustodialdatasource-post?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public NoncustodialDataSource post(@jakarta.annotation.Nonnull final NoncustodialDataSource body) {
        return post(body, null);
    }
    /**
     * Create a new noncustodialDataSource object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a NoncustodialDataSource
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     * @see <a href="https://learn.microsoft.com/graph/api/ediscovery-noncustodialdatasource-post?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public NoncustodialDataSource post(@jakarta.annotation.Nonnull final NoncustodialDataSource body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, NoncustodialDataSource::createFromDiscriminatorValue);
    }
    /**
     * Get a list of the noncustodialDataSource objects and their properties.
     * @return a RequestInformation
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the noncustodialDataSource objects and their properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a new noncustodialDataSource object.
     * @param body The request body
     * @return a RequestInformation
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final NoncustodialDataSource body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new noncustodialDataSource object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final NoncustodialDataSource body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a NoncustodialDataSourcesRequestBuilder
     * @deprecated
     * The ediscovery Apis are deprecated under /compliance and will stop returning data from February 01, 2023. Please use the new ediscovery Apis under /security. as of 2022-12/ediscoveryNamespace on 2022-12-05 and will be removed 2023-02-01
     */
    @jakarta.annotation.Nonnull
    @Deprecated
    public NoncustodialDataSourcesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NoncustodialDataSourcesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of the noncustodialDataSource objects and their properties.
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
