package com.microsoft.graph.tenantrelationships;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.TenantRelationship;
import com.microsoft.graph.tenantrelationships.delegatedadmincustomers.DelegatedAdminCustomersRequestBuilder;
import com.microsoft.graph.tenantrelationships.delegatedadmincustomers.item.DelegatedAdminCustomerItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.delegatedadminrelationships.DelegatedAdminRelationshipsRequestBuilder;
import com.microsoft.graph.tenantrelationships.delegatedadminrelationships.item.DelegatedAdminRelationshipItemRequestBuilder;
import com.microsoft.graph.tenantrelationships.findtenantinformationbydomainnamewithdomainname.FindTenantInformationByDomainNameWithDomainNameRequestBuilder;
import com.microsoft.graph.tenantrelationships.findtenantinformationbytenantidwithtenantid.FindTenantInformationByTenantIdWithTenantIdRequestBuilder;
import com.microsoft.graph.tenantrelationships.managedtenants.ManagedTenantsRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the tenantRelationship singleton. */
public class TenantRelationshipsRequestBuilder {
    /** Provides operations to manage the delegatedAdminCustomers property of the microsoft.graph.tenantRelationship entity. */
    @javax.annotation.Nonnull
    public DelegatedAdminCustomersRequestBuilder delegatedAdminCustomers() {
        return new DelegatedAdminCustomersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the delegatedAdminRelationships property of the microsoft.graph.tenantRelationship entity. */
    @javax.annotation.Nonnull
    public DelegatedAdminRelationshipsRequestBuilder delegatedAdminRelationships() {
        return new DelegatedAdminRelationshipsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedTenants property of the microsoft.graph.tenantRelationship entity. */
    @javax.annotation.Nonnull
    public ManagedTenantsRequestBuilder managedTenants() {
        return new ManagedTenantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new TenantRelationshipsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TenantRelationshipsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/tenantRelationships{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new TenantRelationshipsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public TenantRelationshipsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/tenantRelationships{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get tenantRelationships
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update tenantRelationships
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final TenantRelationship body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update tenantRelationships
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final TenantRelationship body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the delegatedAdminCustomers property of the microsoft.graph.tenantRelationship entity.
     * @param id Unique identifier of the item
     * @return a DelegatedAdminCustomerItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DelegatedAdminCustomerItemRequestBuilder delegatedAdminCustomers(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("delegatedAdminCustomer%2Did", id);
        return new DelegatedAdminCustomerItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the delegatedAdminRelationships property of the microsoft.graph.tenantRelationship entity.
     * @param id Unique identifier of the item
     * @return a DelegatedAdminRelationshipItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DelegatedAdminRelationshipItemRequestBuilder delegatedAdminRelationships(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("delegatedAdminRelationship%2Did", id);
        return new DelegatedAdminRelationshipItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the findTenantInformationByDomainName method.
     * @param domainName Usage: domainName='{domainName}'
     * @return a findTenantInformationByDomainNameWithDomainNameRequestBuilder
     */
    @javax.annotation.Nonnull
    public FindTenantInformationByDomainNameWithDomainNameRequestBuilder findTenantInformationByDomainNameWithDomainName(@javax.annotation.Nonnull final String domainName) {
        Objects.requireNonNull(domainName);
        return new FindTenantInformationByDomainNameWithDomainNameRequestBuilder(pathParameters, requestAdapter, domainName);
    }
    /**
     * Provides operations to call the findTenantInformationByTenantId method.
     * @param tenantId Usage: tenantId='{tenantId}'
     * @return a findTenantInformationByTenantIdWithTenantIdRequestBuilder
     */
    @javax.annotation.Nonnull
    public FindTenantInformationByTenantIdWithTenantIdRequestBuilder findTenantInformationByTenantIdWithTenantId(@javax.annotation.Nonnull final String tenantId) {
        Objects.requireNonNull(tenantId);
        return new FindTenantInformationByTenantIdWithTenantIdRequestBuilder(pathParameters, requestAdapter, tenantId);
    }
    /**
     * Get tenantRelationships
     * @return a CompletableFuture of tenantRelationship
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationship> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, TenantRelationship::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<TenantRelationship> executionException = new java.util.concurrent.CompletableFuture<TenantRelationship>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get tenantRelationships
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of tenantRelationship
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationship> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, TenantRelationship::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<TenantRelationship> executionException = new java.util.concurrent.CompletableFuture<TenantRelationship>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update tenantRelationships
     * @param body 
     * @return a CompletableFuture of tenantRelationship
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationship> patch(@javax.annotation.Nonnull final TenantRelationship body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, TenantRelationship::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<TenantRelationship> executionException = new java.util.concurrent.CompletableFuture<TenantRelationship>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update tenantRelationships
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of tenantRelationship
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<TenantRelationship> patch(@javax.annotation.Nonnull final TenantRelationship body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, TenantRelationship::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<TenantRelationship> executionException = new java.util.concurrent.CompletableFuture<TenantRelationship>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /** Get tenantRelationships */
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
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
