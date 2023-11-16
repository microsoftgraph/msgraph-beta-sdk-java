package com.microsoft.graph.financials.companies.item.salesquotes.item;

import com.microsoft.graph.financials.companies.item.salesquotes.item.currency.CurrencyRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.item.customer.CustomerRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.item.makeinvoice.MakeInvoiceRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.item.paymentterm.PaymentTermRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.item.salesquotelines.SalesQuoteLinesRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.item.send.SendRequestBuilder;
import com.microsoft.graph.financials.companies.item.salesquotes.item.shipmentmethod.ShipmentMethodRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SalesQuote;
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
 * Provides operations to manage the salesQuotes property of the microsoft.graph.company entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesQuoteItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the currency property of the microsoft.graph.salesQuote entity.
     */
    @jakarta.annotation.Nonnull
    public CurrencyRequestBuilder currency() {
        return new CurrencyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customer property of the microsoft.graph.salesQuote entity.
     */
    @jakarta.annotation.Nonnull
    public CustomerRequestBuilder customer() {
        return new CustomerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the makeInvoice method.
     */
    @jakarta.annotation.Nonnull
    public MakeInvoiceRequestBuilder makeInvoice() {
        return new MakeInvoiceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the paymentTerm property of the microsoft.graph.salesQuote entity.
     */
    @jakarta.annotation.Nonnull
    public PaymentTermRequestBuilder paymentTerm() {
        return new PaymentTermRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the salesQuoteLines property of the microsoft.graph.salesQuote entity.
     */
    @jakarta.annotation.Nonnull
    public SalesQuoteLinesRequestBuilder salesQuoteLines() {
        return new SalesQuoteLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the send method.
     */
    @jakarta.annotation.Nonnull
    public SendRequestBuilder send() {
        return new SendRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the shipmentMethod property of the microsoft.graph.salesQuote entity.
     */
    @jakarta.annotation.Nonnull
    public ShipmentMethodRequestBuilder shipmentMethod() {
        return new ShipmentMethodRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SalesQuoteItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesQuoteItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}/salesQuotes/{salesQuote%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new SalesQuoteItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesQuoteItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}/salesQuotes/{salesQuote%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get salesQuotes from financials
     * @return a SalesQuote
     */
    @jakarta.annotation.Nullable
    public SalesQuote get() {
        return get(null);
    }
    /**
     * Get salesQuotes from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SalesQuote
     */
    @jakarta.annotation.Nullable
    public SalesQuote get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, SalesQuote::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the navigation property salesQuotes in financials
     * @param body The request body
     * @return a SalesQuote
     */
    @jakarta.annotation.Nullable
    public SalesQuote patch(@jakarta.annotation.Nonnull final SalesQuote body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property salesQuotes in financials
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SalesQuote
     */
    @jakarta.annotation.Nullable
    public SalesQuote patch(@jakarta.annotation.Nonnull final SalesQuote body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, SalesQuote::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get salesQuotes from financials
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get salesQuotes from financials
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
     * Update the navigation property salesQuotes in financials
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SalesQuote body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property salesQuotes in financials
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SalesQuote body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a SalesQuoteItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SalesQuoteItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SalesQuoteItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get salesQuotes from financials
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
