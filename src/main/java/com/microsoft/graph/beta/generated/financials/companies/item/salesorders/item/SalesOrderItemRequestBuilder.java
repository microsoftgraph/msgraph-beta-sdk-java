package com.microsoft.graph.beta.financials.companies.item.salesorders.item;

import com.microsoft.graph.beta.financials.companies.item.salesorders.item.currency.CurrencyRequestBuilder;
import com.microsoft.graph.beta.financials.companies.item.salesorders.item.customer.CustomerRequestBuilder;
import com.microsoft.graph.beta.financials.companies.item.salesorders.item.paymentterm.PaymentTermRequestBuilder;
import com.microsoft.graph.beta.financials.companies.item.salesorders.item.salesorderlines.SalesOrderLinesRequestBuilder;
import com.microsoft.graph.beta.models.odataerrors.ODataError;
import com.microsoft.graph.beta.models.SalesOrder;
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
 * Provides operations to manage the salesOrders property of the microsoft.graph.company entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesOrderItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the currency property of the microsoft.graph.salesOrder entity.
     * @return a {@link CurrencyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CurrencyRequestBuilder currency() {
        return new CurrencyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customer property of the microsoft.graph.salesOrder entity.
     * @return a {@link CustomerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CustomerRequestBuilder customer() {
        return new CustomerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the paymentTerm property of the microsoft.graph.salesOrder entity.
     * @return a {@link PaymentTermRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentTermRequestBuilder paymentTerm() {
        return new PaymentTermRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the salesOrderLines property of the microsoft.graph.salesOrder entity.
     * @return a {@link SalesOrderLinesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SalesOrderLinesRequestBuilder salesOrderLines() {
        return new SalesOrderLinesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SalesOrderItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesOrderItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}/salesOrders/{salesOrder%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link SalesOrderItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SalesOrderItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/financials/companies/{company%2Did}/salesOrders/{salesOrder%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get salesOrders from financials
     * @return a {@link SalesOrder}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SalesOrder get() {
        return get(null);
    }
    /**
     * Get salesOrders from financials
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SalesOrder}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SalesOrder get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SalesOrder::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property salesOrders in financials
     * @param body The request body
     * @return a {@link SalesOrder}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SalesOrder patch(@jakarta.annotation.Nonnull final SalesOrder body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property salesOrders in financials
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SalesOrder}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SalesOrder patch(@jakarta.annotation.Nonnull final SalesOrder body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SalesOrder::createFromDiscriminatorValue);
    }
    /**
     * Get salesOrders from financials
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get salesOrders from financials
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
     * Update the navigation property salesOrders in financials
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SalesOrder body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property salesOrders in financials
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SalesOrder body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SalesOrderItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SalesOrderItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SalesOrderItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get salesOrders from financials
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
