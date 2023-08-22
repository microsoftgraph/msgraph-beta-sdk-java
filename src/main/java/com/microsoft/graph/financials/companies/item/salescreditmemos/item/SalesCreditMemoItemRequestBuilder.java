package com.microsoft.graph.financials.companies.item.salescreditmemos.item;

import com.microsoft.graph.financials.companies.item.salescreditmemos.item.currency.CurrencyRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemos.item.customer.CustomerRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemos.item.paymentterm.PaymentTermRequestBuilder;
import com.microsoft.graph.financials.companies.item.salescreditmemos.item.salescreditmemolines.SalesCreditMemoLinesRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SalesCreditMemo;
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
 * Provides operations to manage the salesCreditMemos property of the microsoft.graph.company entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesCreditMemoItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the currency property of the microsoft.graph.salesCreditMemo entity.
     */
    @jakarta.annotation.Nonnull
    public CurrencyRequestBuilder currency() {
        return new CurrencyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customer property of the microsoft.graph.salesCreditMemo entity.
     */
    @jakarta.annotation.Nonnull
    public CustomerRequestBuilder customer() {
        return new CustomerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the paymentTerm property of the microsoft.graph.salesCreditMemo entity.
     */
    @jakarta.annotation.Nonnull
    public PaymentTermRequestBuilder paymentTerm() {
        return new PaymentTermRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the salesCreditMemoLines property of the microsoft.graph.salesCreditMemo entity.
     */
    @jakarta.annotation.Nonnull
    public SalesCreditMemoLinesRequestBuilder salesCreditMemoLines() {
        return new SalesCreditMemoLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SalesCreditMemoItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesCreditMemoItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}/salesCreditMemos/{salesCreditMemo%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SalesCreditMemoItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesCreditMemoItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}/salesCreditMemos/{salesCreditMemo%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get salesCreditMemos from financials
     * @return a CompletableFuture of salesCreditMemo
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SalesCreditMemo> get() {
        return get(null);
    }
    /**
     * Get salesCreditMemos from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of salesCreditMemo
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SalesCreditMemo> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, SalesCreditMemo::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property salesCreditMemos in financials
     * @param body The request body
     * @return a CompletableFuture of salesCreditMemo
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SalesCreditMemo> patch(@jakarta.annotation.Nonnull final SalesCreditMemo body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property salesCreditMemos in financials
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of salesCreditMemo
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<SalesCreditMemo> patch(@jakarta.annotation.Nonnull final SalesCreditMemo body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, SalesCreditMemo::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get salesCreditMemos from financials
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get salesCreditMemos from financials
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
     * Update the navigation property salesCreditMemos in financials
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SalesCreditMemo body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property salesCreditMemos in financials
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SalesCreditMemo body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get salesCreditMemos from financials
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
