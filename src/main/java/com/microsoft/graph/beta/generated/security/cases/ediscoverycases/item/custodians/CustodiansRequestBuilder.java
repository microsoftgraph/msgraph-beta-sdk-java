package com.microsoft.graph.beta.security.cases.ediscoverycases.item.custodians;

import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.security.EdiscoveryCustodian;
import com.microsoft.graph.beta.models.security.EdiscoveryCustodianCollectionResponse;
import com.microsoft.graph.beta.security.cases.ediscoverycases.item.custodians.count.CountRequestBuilder;
import com.microsoft.graph.beta.security.cases.ediscoverycases.item.custodians.item.EdiscoveryCustodianItemRequestBuilder;
import com.microsoft.graph.beta.security.cases.ediscoverycases.item.custodians.microsoftgraphsecurityapplyhold.MicrosoftGraphSecurityApplyHoldRequestBuilder;
import com.microsoft.graph.beta.security.cases.ediscoverycases.item.custodians.microsoftgraphsecurityremovehold.MicrosoftGraphSecurityRemoveHoldRequestBuilder;
import com.microsoft.graph.beta.security.cases.ediscoverycases.item.custodians.microsoftgraphsecurityupdateindex.MicrosoftGraphSecurityUpdateIndexRequestBuilder;
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
 * Provides operations to manage the custodians property of the microsoft.graph.security.ediscoveryCase entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustodiansRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyHold method.
     * @return a {@link MicrosoftGraphSecurityApplyHoldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityApplyHoldRequestBuilder microsoftGraphSecurityApplyHold() {
        return new MicrosoftGraphSecurityApplyHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeHold method.
     * @return a {@link MicrosoftGraphSecurityRemoveHoldRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityRemoveHoldRequestBuilder microsoftGraphSecurityRemoveHold() {
        return new MicrosoftGraphSecurityRemoveHoldRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the updateIndex method.
     * @return a {@link MicrosoftGraphSecurityUpdateIndexRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphSecurityUpdateIndexRequestBuilder microsoftGraphSecurityUpdateIndex() {
        return new MicrosoftGraphSecurityUpdateIndexRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the custodians property of the microsoft.graph.security.ediscoveryCase entity.
     * @param ediscoveryCustodianId The unique identifier of ediscoveryCustodian
     * @return a {@link EdiscoveryCustodianItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EdiscoveryCustodianItemRequestBuilder byEdiscoveryCustodianId(@jakarta.annotation.Nonnull final String ediscoveryCustodianId) {
        Objects.requireNonNull(ediscoveryCustodianId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("ediscoveryCustodian%2Did", ediscoveryCustodianId);
        return new EdiscoveryCustodianItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CustodiansRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustodiansRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link CustodiansRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CustodiansRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/cases/ediscoveryCases/{ediscoveryCase%2Did}/custodians{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get a list of the custodian objects and their properties.
     * @return a {@link EdiscoveryCustodianCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-list-custodians?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodianCollectionResponse get() {
        return get(null);
    }
    /**
     * Get a list of the custodian objects and their properties.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EdiscoveryCustodianCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-list-custodians?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodianCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EdiscoveryCustodianCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a new ediscoveryCustodian object.After the custodian object is created, you will need to create the custodian&apos;s userSource to reference their mailbox and OneDrive for Business site.
     * @param body The request body
     * @return a {@link EdiscoveryCustodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-post-custodians?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodian post(@jakarta.annotation.Nonnull final EdiscoveryCustodian body) {
        return post(body, null);
    }
    /**
     * Create a new ediscoveryCustodian object.After the custodian object is created, you will need to create the custodian&apos;s userSource to reference their mailbox and OneDrive for Business site.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EdiscoveryCustodian}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/security-ediscoverycase-post-custodians?view=graph-rest-beta">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EdiscoveryCustodian post(@jakarta.annotation.Nonnull final EdiscoveryCustodian body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EdiscoveryCustodian::createFromDiscriminatorValue);
    }
    /**
     * Get a list of the custodian objects and their properties.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of the custodian objects and their properties.
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
     * Create a new ediscoveryCustodian object.After the custodian object is created, you will need to create the custodian&apos;s userSource to reference their mailbox and OneDrive for Business site.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EdiscoveryCustodian body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a new ediscoveryCustodian object.After the custodian object is created, you will need to create the custodian&apos;s userSource to reference their mailbox and OneDrive for Business site.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EdiscoveryCustodian body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CustodiansRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustodiansRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CustodiansRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get a list of the custodian objects and their properties.
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
         * @return a {@link Map<String, Object>}
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
