package com.microsoft.graph.beta.deviceappmanagement.enterprisecodesigningcertificates;

import com.microsoft.graph.beta.deviceappmanagement.enterprisecodesigningcertificates.count.CountRequestBuilder;
import com.microsoft.graph.beta.deviceappmanagement.enterprisecodesigningcertificates.item.EnterpriseCodeSigningCertificateItemRequestBuilder;
import com.microsoft.graph.beta.models.EnterpriseCodeSigningCertificate;
import com.microsoft.graph.beta.models.EnterpriseCodeSigningCertificateCollectionResponse;
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
 * Provides operations to manage the enterpriseCodeSigningCertificates property of the microsoft.graph.deviceAppManagement entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnterpriseCodeSigningCertificatesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the enterpriseCodeSigningCertificates property of the microsoft.graph.deviceAppManagement entity.
     * @param enterpriseCodeSigningCertificateId The unique identifier of enterpriseCodeSigningCertificate
     * @return a EnterpriseCodeSigningCertificateItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EnterpriseCodeSigningCertificateItemRequestBuilder byEnterpriseCodeSigningCertificateId(@jakarta.annotation.Nonnull final String enterpriseCodeSigningCertificateId) {
        Objects.requireNonNull(enterpriseCodeSigningCertificateId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("enterpriseCodeSigningCertificate%2Did", enterpriseCodeSigningCertificateId);
        return new EnterpriseCodeSigningCertificateItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new EnterpriseCodeSigningCertificatesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EnterpriseCodeSigningCertificatesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/enterpriseCodeSigningCertificates{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new EnterpriseCodeSigningCertificatesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EnterpriseCodeSigningCertificatesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/enterpriseCodeSigningCertificates{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * The Windows Enterprise Code Signing Certificate.
     * @return a EnterpriseCodeSigningCertificateCollectionResponse
     */
    @jakarta.annotation.Nullable
    public EnterpriseCodeSigningCertificateCollectionResponse get() {
        return get(null);
    }
    /**
     * The Windows Enterprise Code Signing Certificate.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EnterpriseCodeSigningCertificateCollectionResponse
     */
    @jakarta.annotation.Nullable
    public EnterpriseCodeSigningCertificateCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EnterpriseCodeSigningCertificateCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to enterpriseCodeSigningCertificates for deviceAppManagement
     * @param body The request body
     * @return a EnterpriseCodeSigningCertificate
     */
    @jakarta.annotation.Nullable
    public EnterpriseCodeSigningCertificate post(@jakarta.annotation.Nonnull final EnterpriseCodeSigningCertificate body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to enterpriseCodeSigningCertificates for deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a EnterpriseCodeSigningCertificate
     */
    @jakarta.annotation.Nullable
    public EnterpriseCodeSigningCertificate post(@jakarta.annotation.Nonnull final EnterpriseCodeSigningCertificate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EnterpriseCodeSigningCertificate::createFromDiscriminatorValue);
    }
    /**
     * The Windows Enterprise Code Signing Certificate.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The Windows Enterprise Code Signing Certificate.
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
     * Create new navigation property to enterpriseCodeSigningCertificates for deviceAppManagement
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EnterpriseCodeSigningCertificate body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to enterpriseCodeSigningCertificates for deviceAppManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final EnterpriseCodeSigningCertificate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a EnterpriseCodeSigningCertificatesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EnterpriseCodeSigningCertificatesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EnterpriseCodeSigningCertificatesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The Windows Enterprise Code Signing Certificate.
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
