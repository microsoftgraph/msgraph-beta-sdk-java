package com.microsoft.graph.financials.companies.item.salesinvoicelines.item;

import com.microsoft.graph.financials.companies.item.salesinvoicelines.item.account.AccountRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesinvoicelines.item.item.ItemRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SalesInvoiceLine;
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
 * Provides operations to manage the salesInvoiceLines property of the microsoft.graph.company entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesInvoiceLineItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the account property of the microsoft.graph.salesInvoiceLine entity.
     */
    @jakarta.annotation.Nonnull
    public AccountRequestBuilder account() {
        return new AccountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the item property of the microsoft.graph.salesInvoiceLine entity.
     */
    @jakarta.annotation.Nonnull
    public ItemRequestBuilder item() {
        return new ItemRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SalesInvoiceLineItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesInvoiceLineItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}/salesInvoiceLines/{salesInvoiceLine%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SalesInvoiceLineItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesInvoiceLineItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}/salesInvoiceLines/{salesInvoiceLine%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get salesInvoiceLines from financials
     * @return a CompletableFuture of SalesInvoiceLine
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SalesInvoiceLine> get() {
        return get(null);
    }
    /**
     * Get salesInvoiceLines from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of SalesInvoiceLine
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SalesInvoiceLine> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, SalesInvoiceLine::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property salesInvoiceLines in financials
     * @param body The request body
     * @return a CompletableFuture of SalesInvoiceLine
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SalesInvoiceLine> patch(@jakarta.annotation.Nonnull final SalesInvoiceLine body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property salesInvoiceLines in financials
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of SalesInvoiceLine
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SalesInvoiceLine> patch(@jakarta.annotation.Nonnull final SalesInvoiceLine body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, SalesInvoiceLine::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get salesInvoiceLines from financials
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get salesInvoiceLines from financials
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
     * Update the navigation property salesInvoiceLines in financials
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SalesInvoiceLine body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property salesInvoiceLines in financials
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SalesInvoiceLine body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json;q=1");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SalesInvoiceLineItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SalesInvoiceLineItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SalesInvoiceLineItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get salesInvoiceLines from financials
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
